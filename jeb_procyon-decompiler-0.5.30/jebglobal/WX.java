// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;

public final class WX
{
    private String dN;
    private String ld;
    private String QE;
    private String wU;
    private int fa;
    private int zs;
    private boolean mS;
    
    private WX(final File file) {
        this.fa = 0;
        this.zs = 0;
        this.dN = file.getAbsolutePath();
        this.ld = file.getName();
        final int lastIndex = this.ld.lastIndexOf(46);
        if (lastIndex >= 0) {
            this.ld = this.ld.substring(0, lastIndex);
        }
    }
    
    public String dN() {
        return this.dN;
    }
    
    public String ld() {
        return this.ld;
    }
    
    public String QE() {
        return this.QE;
    }
    
    public boolean wU() {
        return this.mS;
    }
    
    public int fa() {
        return this.fa;
    }
    
    public int zs() {
        return this.zs;
    }
    
    public static WX dN(final File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        }
        catch (FileNotFoundException ex) {
            return null;
        }
        final WX wx = new WX(file);
        String s;
        try {
            while ((s = bufferedReader.readLine()) != null) {
                s = s.trim();
                if (s.startsWith("#?")) {
                    s = s.substring(2);
                    break;
                }
                if (s.startsWith("//?")) {
                    s = s.substring(3);
                    break;
                }
            }
            try {
                bufferedReader.close();
            }
            catch (IOException ex2) {
                return null;
            }
        }
        catch (IOException ex3) {
            return null;
        }
        finally {
            try {
                bufferedReader.close();
            }
            catch (IOException ex4) {
                return null;
            }
        }
        if (s == null) {
            return wx;
        }
        final String[] split = s.split(",");
        for (int length = split.length, i = 0; i < length; ++i) {
            final String[] split2 = split[i].split("=");
            if (split2.length == 2) {
                final String trim = split2[0].trim();
                final String trim2 = split2[1].trim();
                if (trim.equals("name")) {
                    wx.ld = trim2;
                }
                else if (trim.equals("shortcut")) {
                    wx.wU = trim2;
                }
                else if (trim.equals("help")) {
                    wx.QE = trim2;
                }
                else if (!trim.equals("author")) {
                    if (trim.equals("autorun")) {
                        wx.mS = Boolean.parseBoolean(trim2);
                    }
                }
            }
        }
        if (!wx.mS() && wx.wU != null) {
            cn.dN(String.format("Invalid shortcut: %s", wx.wU));
        }
        return wx;
    }
    
    private boolean mS() {
        if (this.wU == null) {
            return false;
        }
        this.zs = 0;
        this.fa = 0;
        final String wu = this.wU;
        int n = 0;
        while (n < wu.length() && this.fa == 0) {
            if (n > 0 && wu.charAt(n++) != '+') {
                return false;
            }
            if (wu.substring(n).startsWith("Ctrl")) {
                this.zs |= 0x40000;
                n += 4;
            }
            else if (wu.substring(n).startsWith("Alt")) {
                this.zs |= 0x10000;
                n += 3;
            }
            else if (wu.substring(n).startsWith("Shift")) {
                this.zs |= 0x20000;
                n += 5;
            }
            else if (wu.substring(n).startsWith("Command")) {
                this.zs |= 0x400000;
                n += 7;
            }
            else {
                char fa = wu.charAt(n++);
                if (Character.isLetterOrDigit(fa)) {
                    fa = Character.toUpperCase(fa);
                }
                if (fa == 'F' && n < wu.length() && wu.charAt(n) >= '1' && wu.charAt(n) <= '9') {
                    char c = (char)(wu.charAt(n++) - '0');
                    if (c == '\u0001' && n < wu.length() && wu.charAt(n) >= '0' && wu.charAt(n) <= '2') {
                        c = (char)('\n' + (wu.charAt(n++) - '0'));
                    }
                    this.fa = 16777225 + c;
                }
                else {
                    this.fa = fa;
                }
            }
        }
        return n == wu.length();
    }
}
