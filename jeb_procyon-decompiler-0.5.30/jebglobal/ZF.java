// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.Properties;

public class ZF
{
    private Properties dN;
    private File ld;
    private boolean QE;
    
    public ZF(final String s) {
        this(s, false);
    }
    
    private ZF(final String s, final boolean qe) {
        this.dN = new Properties();
        this.ld = new File(s);
        this.QE = qe;
        try {
            this.ld.createNewFile();
            final FileInputStream fileInputStream = new FileInputStream(this.ld);
            this.dN.load(fileInputStream);
            fileInputStream.close();
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private void ld() {
        if (this.QE) {
            this.dN();
        }
    }
    
    public void dN() {
        try {
            final FileOutputStream fileOutputStream = new FileOutputStream(this.ld);
            this.dN.store(fileOutputStream, "JEB properties");
            fileOutputStream.close();
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public void dN(final String s, final String s2) {
        this.dN.setProperty(s, s2);
        this.ld();
    }
    
    public String dN(final String s) {
        return this.ld(s, null);
    }
    
    public String ld(final String s, final String s2) {
        return this.dN.getProperty(s, s2);
    }
    
    public void dN(final String s, final boolean b) {
        this.dN.setProperty(s, Boolean.toString(b));
        this.ld();
    }
    
    public boolean ld(final String s, final boolean b) {
        try {
            return Boolean.parseBoolean(this.dN.getProperty(s, Boolean.toString(b)));
        }
        catch (Exception ex) {
            return b;
        }
    }
    
    public void dN(final String s, final int n) {
        this.dN.setProperty(s, Integer.toString(n));
        this.ld();
    }
    
    public int ld(final String s, final int n) {
        try {
            return Integer.parseInt(this.dN.getProperty(s, Integer.toString(n)));
        }
        catch (Exception ex) {
            return n;
        }
    }
    
    public static List dN(final tu... array) {
        final ArrayList<tu> list = new ArrayList<tu>(array.length);
        for (final tu tu : array) {
            if (tu != null) {
                list.add(tu);
            }
        }
        return list;
    }
    
    public static List dN(final List list, final Collection collection) {
        if (collection != null) {
            for (final tu tu : collection) {
                if (tu != null) {
                    list.add(tu);
                }
            }
        }
        return list;
    }
    
    public static String dN(final byte[] array, final int n, final int n2, final int n3) {
        final StringBuilder sb = new StringBuilder();
        int n4 = n;
        int n5;
        for (int i = n2; i > 0; i -= n5) {
            sb.append(String.format("%08X  ", n4 - n3));
            int j;
            for (j = 0; j < 16 && j < i; ++j) {
                sb.append(String.format("%02X ", array[n4 + j]));
            }
            n5 = j;
            while (j < 16) {
                sb.append("   ");
                ++j;
            }
            sb.append(" ");
            for (int k = 0; k < n5; ++k) {
                final byte b = array[n4 + k];
                if (b >= 32 && b < 127) {
                    sb.append((char)b);
                }
                else {
                    sb.append(".");
                }
            }
            sb.append("\n");
            n4 += n5;
        }
        return sb.toString();
    }
    
    public static String ld(final byte[] array, final int n, final int n2, final int n3) {
        final StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < n2; ++i) {
            sb.append(String.format("%02X ", array[n + i]));
        }
        while (i < n3) {
            sb.append("   ");
            ++i;
        }
        return sb.toString();
    }
    
    public static String dN(final byte[] array) {
        return ld(array, 0, array.length, 0);
    }
    
    public static String ld(final byte[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; ++i) {
            sb.append(String.format("%02X", array[i]));
        }
        return sb.toString();
    }
    
    public static byte[] ld(final String s) {
        if (s.length() % 2 != 0) {
            return null;
        }
        final int n = s.length() / 2;
        final byte[] array = new byte[n];
        for (int i = 0; i < n; ++i) {
            try {
                array[i] = (byte)Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
            }
            catch (NumberFormatException ex) {
                return null;
            }
        }
        return array;
    }
    
    public static boolean dN(final char c) {
        if (!Character.isISOControl(c)) {
            final Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
            return of != null && of != Character.UnicodeBlock.SPECIALS;
        }
        return false;
    }
    
    public static String dN(final char c, final boolean b) {
        if (c == '\'') {
            return "\\'";
        }
        if (c == '\"') {
            return "\\\"";
        }
        if (c == '\\') {
            return "\\\\";
        }
        if (b && dN(c)) {
            return Character.toString(c);
        }
        if (c >= '\u007f') {
            return String.format("\\u%04X", (short)c);
        }
        if (c >= ' ') {
            return Character.toString(c);
        }
        if (c == '\n') {
            return "\\n";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\t') {
            return "\\t";
        }
        if (c == '\b') {
            return "\\b";
        }
        if (c == '\f') {
            return "\\f";
        }
        return String.format("\\u%04X", (short)c);
    }
    
    public static String QE(final String s, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            sb.append(dN(s.charAt(i), b));
        }
        return sb.toString();
    }
}
