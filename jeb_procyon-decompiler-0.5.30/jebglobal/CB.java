// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import jeb.Launcher;
import java.lang.reflect.Method;

public final class CB
{
    private static Method dN;
    private static long ld;
    private static long QE;
    private static long wU;
    
    private static long ld() {
        try {
            if (CB.dN == null) {
                CB.dN = Class.forName(rP.dN(new byte[] { 125, 11, 23, 23, 79, 66, 13, 15, 9, 73, 125, 42, 10, 7, 17, 8 }, 1, 23)).getMethod(rP.dN(new byte[] { 32, 26, 2, 11, 23, 7, 19, 60, 29, 77, 77, 46, 64, 76, 93, 80, 74 }, 2, 9), (Class<?>[])new Class[0]);
            }
            return (long)CB.dN.invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return 0L;
        }
    }
    
    public static void dN() {
        CB.QE = ld();
        if (CB.QE - CB.wU < 60000L) {
            return;
        }
        if (!wU()) {
            QE();
        }
        if (!fa()) {
            QE();
        }
        CB.wU = CB.QE;
    }
    
    private static void QE() {
        try {
            Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 123, 26, 90, 84, 84, 84 }, 2, 133)).getMethod(rP.dN(new byte[] { -29, 29, 17, 29 }, 1, 134), Integer.TYPE).invoke(null, 0);
        }
        catch (Exception ex) {}
    }
    
    private static boolean wU() {
        try {
            final boolean b = CB.QE - CB.ld < 93 * ((CB.ld % 10L == 0L) ? 42 : 43) * 1000;
        }
        catch (Exception ex) {}
        return true;
    }
    
    private static boolean fa() {
        return dN(new Class[] { Launcher.class, uK.class, eI.class, cd.class, jN.class, oQ.class, PX.class, fO.class, DU.class, Vr.class, De.class, Rg.class, ai.class, lS.class, rK.class, Dc.class, sS.class, Am.class, UY.class, qm.class, Xk.class });
    }
    
    private static boolean dN(final Class[] array) {
        if (array.length == 0) {
            return true;
        }
        boolean dn = false;
        try {
            dn = dN(Class.forName(rP.dN(new byte[] { -11, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9 }, 1, 159)).getConstructor(Class.forName(rP.dN(new byte[] { -49, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 27 }, 1, 165))).newInstance(Class.forName(rP.dN(new byte[] { -14, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 30 }, 1, 152)).getMethod(rP.dN(new byte[] { 55, 0, 37, 43, 59 }, 2, 28), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86 }, 2, 74)).getMethod(rP.dN(new byte[] { -42, 2, 17, 56, 35, 12, 2, 21, 29, 6, 1 }, 1, 177), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13 }, 2, 133)).getMethod(rP.dN(new byte[] { 36, 10, 4, 58, 29, 13, 2, 59, 27, 85, 90, 0, 76 }, 2, 224), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { -111, 11, 23, 23, 79, 66, 13, 15, 9, 73, 109, 47, 13, 18, 0 }, 1, 251)).getMethod(rP.dN(new byte[] { 74, 2, 17, 36, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7 }, 1, 45), (Class<?>[])new Class[0]).invoke(array[0], new Object[0]), new Object[0]), new Object[0]), new Object[0])), array);
        }
        catch (Exception ex) {}
        return dn;
    }
    
    private static boolean dN(final Object o, final Class[] array) {
        boolean equals = true;
        try {
            final Object instance = Class.forName(rP.dN(new byte[] { -58, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 172)).getConstructor(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6 }, 2, 212)), Boolean.TYPE).newInstance(o, true);
            final byte[] array2 = new byte[4096];
            for (int length = array.length, i = 0; i < length; ++i) {
                final Object invoke = Class.forName(rP.dN(new byte[] { -123, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 239)).getMethod(rP.dN(new byte[] { 36, 10, 4, 60, 28, 29, 21, 17 }, 2, 118), String.class).invoke(instance, array[i].getName().replace('.', '/') + ".class");
                while ((int)Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 61, 78, 88, 22, 93, 115, 69, 75, 92, 82, 65 }, 2, 224)).getMethod(rP.dN(new byte[] { 49, 10, 17, 29 }, 2, 130), byte[].class, Integer.TYPE, Integer.TYPE).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 233)).getMethod(rP.dN(new byte[] { 36, 10, 4, 48, 28, 25, 18, 28, 39, 84, 90, 6, 72, 77 }, 2, 189), Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 82, 10, 89, 14, 107, 80, 73, 118, 66, 84, 64, 73 }, 2, 31))).invoke(instance, invoke), array2, 0, array2.length) != -1) {}
                equals = Class.forName(rP.dN(new byte[] { -38, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28 }, 1, 176)).getMethod(rP.dN(new byte[] { 36, 10, 4, 52, 29, 13, 18, 4, 1, 83 }, 2, 132), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 105, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 77, 6, 23, 6, 90, 109, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17 }, 1, 3)).getMethod(rP.dN(new byte[] { 6, 2, 17, 36, 37, 23, 14, 5, 10, 40, 46, 28 }, 1, 97), (Class<?>[])new Class[0]).invoke(((Object[])Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73 }, 2, 100)).getMethod(rP.dN(new byte[] { 93, 2, 17, 55, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17, 22 }, 1, 58), (Class<?>[])new Class[0]).invoke(invoke, new Object[0]))[0], new Object[0]), new Object[0]).toString().substring(10).substring(15, 30).equals(rP.dN(new byte[] { 122, 94, 66, 76, 69, 91, 87, 91, 67, 23, 31, 81, 30, 22, 9 }, 2, 60));
                if (!equals) {
                    break;
                }
            }
            Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 183)).getMethod(rP.dN(new byte[] { -16, 15, 3, 28, 22 }, 1, 147), (Class<?>[])new Class[0]).invoke(instance, new Object[0]);
        }
        catch (Exception ex) {}
        return equals;
    }
    
    static {
        CB.dN = null;
        CB.ld = ld();
        CB.QE = 0L;
        CB.wU = 0L;
    }
}
