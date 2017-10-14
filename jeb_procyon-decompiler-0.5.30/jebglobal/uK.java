// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import jeb.Launcher;

public final class uK
{
    private static int ld;
    public static int dN;
    private static int QE;
    
    public static void dN(final int ld) {
        if (ld > 0 && uK.ld == 0) {
            uK.ld = ld;
        }
    }
    
    public static int dN() {
        if (uK.ld > 0) {
            return uK.ld + 750284047;
        }
        return 0;
    }
    
    public static boolean ld() {
        return uK.dN == 2 || uK.dN == 3;
    }
    
    public static String QE() {
        switch (uK.dN) {
            case 0: {
                return rP.dN(new byte[] { -76, 19, 25, 0, 76, 68, 1, 7, 23, 18 }, 1, 210);
            }
            case 1: {
                return rP.dN(new byte[] { 37, 26, 28, 21 }, 2, 147);
            }
            case 2: {
                return rP.dN(new byte[] { 14, 1, 8, 2, 79, 68, 1, 7, 23, 18 }, 1, 106);
            }
            case 3: {
                return rP.dN(new byte[] { 74, 1, 8, 2 }, 1, 46);
            }
            case 4: {
                return rP.dN(new byte[] { -53, 20, 1, 27, 2, 12, 21, 29, 6, 1, 78, 68, 1, 7, 23, 18 }, 1, 170);
            }
            case 5: {
                return rP.dN(new byte[] { 34, 26, 4, 22, 31, 8, 19, 1, 27, 78 }, 2, 180);
            }
            default: {
                return null;
            }
        }
    }
    
    public static boolean wU() {
        return false;
    }
    
    public static String fa() {
        final byte[] qe = Launcher.QE("LICENSE.TXT");
        if (qe == null) {
            return null;
        }
        return new String(qe);
    }
    
    static {
        uK.ld = 1397199600;
        uK.dN = 0;
        uK.dN += 0;
        uK.QE = 0;
    }
}
