// 
// Decompiled by Procyon v0.5.30
// 

package jeb;

import java.io.IOException;
import jebglobal.TM;
import java.io.InputStream;
import java.io.File;
import jebglobal.eI;
import jebglobal.uK;
import jebglobal.yW;
import jebglobal.cd;

public class Launcher
{
    public static void main(final String[] array) {
        String substring = null;
        String s = null;
        String substring2 = null;
        String[] array2 = null;
        boolean b = false;
        int n = 0;
        for (final String s2 : array) {
            if (s2.equals("--")) {
                break;
            }
            if (!s2.startsWith("-")) {
                break;
            }
            if (s2.equals("--help") || s2.equals("-h")) {
                ld();
                System.exit(0);
            }
            if (s2.equals("--license") || s2.equals("-l")) {
                QE();
                System.exit(0);
            }
            else if (s2.equals("--automation") || s2.equals("-a")) {
                b = true;
            }
            else if (s2.startsWith("--config=") || s2.equals("-c=")) {
                substring = s2.substring(s2.indexOf(61) + 1);
            }
            else if (s2.startsWith("--script=") || s2.equals("-s=")) {
                substring2 = s2.substring(s2.indexOf(61) + 1);
            }
            else {
                System.out.println("Invalid command-line.");
                ld();
                System.exit(1);
            }
            ++n;
        }
        final String[] array3 = new String[array.length - n];
        for (int j = n; j < array.length; ++j) {
            array3[j - n] = array[j];
        }
        for (int k = 0; k < array3.length; ++k) {
            if (k == 0 && !array3[0].equals("--")) {
                s = array3[0];
            }
            else if (array3[k].equals("--")) {
                final int n2 = ++k;
                array2 = new String[array3.length - k];
                while (k < array3.length) {
                    array2[k - n2] = array3[k];
                    ++k;
                }
                break;
            }
        }
        if (b) {
            cd.dN(substring, s, substring2, array2);
        }
        else {
            yW.dN(substring, s, substring2, array2);
        }
        System.exit(0);
    }
    
    private static String dN() {
        return String.format("%s %s v%s (c) %s, %s", "JEB", uK.QE(), eI.dN.toString(), "PNF Software", "2013-2014");
    }
    
    private static void ld() {
        final StringBuilder sb = new StringBuilder();
        sb.append(dN());
        sb.append("\n");
        sb.append("Usages:\n");
        sb.append("  JEB [options] [inputpath] [-- scriptarg1 [scriptarg2 [...]]]\n");
        sb.append("Arguments:\n");
        sb.append("  inputpath                DEX/APK/JDB file\n");
        sb.append("  scriptargX               script arguments\n");
        sb.append("Options:\n");
        sb.append("  --help                   Print this message and exit\n");
        sb.append("  --license                Display license information\n");
        sb.append("  --automation             Automation mode (default: UI, unless the license is automation-only)\n");
        sb.append("  --script=<scriptpath>    Execute a script at startup (default: no input script)\n");
        sb.append(String.format("  --config=<configpath>    Set alternate config file (default: %s in JEB directory)\n", "jeb-config.txt"));
        System.out.println(sb);
    }
    
    private static void QE() {
        System.out.println(dN());
        System.out.println(eI.BQ());
    }
    
    public static File dN(final String s) {
        return new File(Launcher.class.getResource(String.format("assets/%s", s)).getPath());
    }
    
    public static InputStream ld(final String s) {
        return Launcher.class.getResourceAsStream(String.format("assets/%s", s));
    }
    
    public static byte[] QE(final String s) {
        final InputStream ld = ld(s);
        if (ld == null) {
            return null;
        }
        try {
            return TM.dN(ld);
        }
        catch (IOException ex) {
            return null;
        }
        finally {
            try {
                ld.close();
            }
            catch (IOException ex2) {}
        }
    }
}
