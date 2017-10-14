// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import jeb.Launcher;
import java.util.Arrays;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Random;

public class PX
{
    private static final long LK = 844563159190538443L;
    private static Random ld;
    public static byte[] dN;
    private int QE;
    private int wU;
    private long fa;
    private wk zs;
    private byte[] mS;
    
    public static byte[] dN(final byte[] array, final int[] array2) {
        if (array == null) {
            return null;
        }
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            hk.writeInt(48 + array.length);
            hk.writeInt(PX.ld.nextInt());
            hk.writeInt(4);
            hk.writeInt(0);
            hk.writeInt(0);
            hk.writeLong(844563159190538443L);
            hk.writeInt(uK.dN);
            hk.writeInt(eI.dN.dN());
            hk.writeInt(eI.dN.ld());
            hk.writeInt(eI.dN.QE());
            hk.writeInt((int)(System.currentTimeMillis() / 1000L) - eI.zs());
            hk.writeInt(fa());
            final int nextInt = PX.ld.nextInt();
            hk.writeInt(nextInt);
            hk.write(array);
            hk.dN();
            final byte[] byteArray = byteArrayOutputStream.toByteArray();
            final ByteBuffer wrap = ByteBuffer.wrap(byteArray);
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            wrap.putInt(0, byteArray.length - 8);
            wrap.putInt(12, TM.dN(Arrays.copyOfRange(byteArray, 16, byteArray.length)));
            final byte[] array3 = new byte[16];
            for (int i = 0; i < 8; ++i) {
                array3[i] = byteArray[i];
            }
            for (int j = 8; j < 16; ++j) {
                array3[j] = PX.dN[j - 8];
            }
            TM.dN(array3, byteArray, 8, byteArray.length);
            if (array2 != null && array2.length >= 1) {
                array2[0] = nextInt;
            }
            return byteArray;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static String dN(final byte[] array) {
        try {
            return ZF.ld(array);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static byte[] dN(final String s) {
        try {
            return ZF.ld(s);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    private static int fa() {
        return (int)dN(new Class[] { Launcher.class, uK.class, eI.class, cd.class, jN.class, oQ.class, PX.class, fO.class, DU.class, Vr.class, De.class, Rg.class, ai.class, lS.class, rK.class, Dc.class, sS.class, Am.class, UY.class, qm.class, Xk.class }) | 0x7FE00000;
    }
    
    private static long dN(final Class[] array) {
        if (array.length == 0) {
            return 0L;
        }
        long dn = 0L;
        try {
            dn = dN(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6 }, 2, 101)).getConstructor(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 42 }, 2, 100))).newInstance(Class.forName(rP.dN(new byte[] { -19, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 30 }, 1, 135)).getMethod(rP.dN(new byte[] { 55, 0, 37, 43, 59 }, 2, 188), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86 }, 2, 189)).getMethod(rP.dN(new byte[] { 36, 10, 4, 53, 29, 10, 6, 28, 29, 79, 70 }, 2, 22), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 120, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 126, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7 }, 1, 18)).getMethod(rP.dN(new byte[] { -116, 2, 17, 55, 44, 11, 1, 54, 60, 26, 7, 17, 6 }, 1, 235), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { -69, 11, 23, 23, 79, 66, 13, 15, 9, 73, 109, 47, 13, 18, 0 }, 1, 209)).getMethod(rP.dN(new byte[] { 32, 2, 17, 36, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7 }, 1, 71), (Class<?>[])new Class[0]).invoke(array[0], new Object[0]), new Object[0]), new Object[0]), new Object[0])), array);
        }
        catch (Exception ex) {}
        return dn;
    }
    
    private static long dN(final Object o, final Class[] array) {
        long n = 0L;
        try {
            final Object instance = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 223)).getConstructor(Class.forName(rP.dN(new byte[] { -87, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9 }, 1, 195)), Boolean.TYPE).newInstance(o, true);
            final byte[] array2 = new byte[4096];
            int n2 = 0;
            for (int length = array.length, i = 0; i < length; ++i) {
                final Object invoke = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 81)).getMethod(rP.dN(new byte[] { 36, 10, 4, 60, 28, 29, 21, 17 }, 2, 18), String.class).invoke(instance, array[i].getName().replace('.', '/') + ".class");
                while ((int)Class.forName(rP.dN(new byte[] { -16, 11, 23, 23, 79, 71, 6, 65, 103, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12 }, 1, 154)).getMethod(rP.dN(new byte[] { -26, 23, 4, 5 }, 1, 148), byte[].class, Integer.TYPE, Integer.TYPE).invoke(Class.forName(rP.dN(new byte[] { 58, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 80)).getMethod(rP.dN(new byte[] { 93, 2, 17, 61, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12 }, 1, 58), Class.forName(rP.dN(new byte[] { 11, 11, 23, 23, 79, 91, 1, 29, 5, 66, 84, 19, 25, 94, 116, 51, 25, 53, 43, 26, 6, 11 }, 1, 97))).invoke(instance, invoke), array2, 0, array2.length) != -1) {}
                if (Class.forName(rP.dN(new byte[] { 49, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28 }, 1, 91)).getMethod(rP.dN(new byte[] { 36, 10, 4, 52, 29, 13, 18, 4, 1, 83 }, 2, 207), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { -100, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 77, 6, 23, 6, 90, 109, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17 }, 1, 246)).getMethod(rP.dN(new byte[] { 36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26 }, 2, 131), (Class<?>[])new Class[0]).invoke(((Object[])Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73 }, 2, 21)).getMethod(rP.dN(new byte[] { 36, 10, 4, 58, 23, 27, 19, 1, 18, 73, 75, 2, 93, 69, 66 }, 2, 251), (Class<?>[])new Class[0]).invoke(invoke, new Object[0]))[0], new Object[0]), new Object[0]).toString().substring(10).substring(15, 30).equals(rP.dN(new byte[] { -107, 8, 3, 7, 2, 5, 2, 3, 4, 0, 0, 5, 5, 1, 14 }, 1, 172))) {
                    n |= 1L << n2;
                }
                if (++n2 >= 64) {
                    break;
                }
            }
            Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 127)).getMethod(rP.dN(new byte[] { -107, 15, 3, 28, 22 }, 1, 246), (Class<?>[])new Class[0]).invoke(instance, new Object[0]);
        }
        catch (Exception ex) {}
        return n;
    }
    
    public static PX ld(final byte[] array) {
        try {
            if (array.length < 56) {
                return null;
            }
            final byte[] array2 = new byte[16];
            for (int i = 0; i < 8; ++i) {
                array2[i] = array[i];
            }
            for (int j = 8; j < 16; ++j) {
                array2[j] = PX.dN[j - 8];
            }
            TM.dN(array2, array, 8, array.length);
            final OZ oz = new OZ(new ByteArrayInputStream(array));
            final int int1 = oz.readInt();
            final int n = 8 + int1;
            if (int1 < 48 || n > array.length) {
                return null;
            }
            oz.readInt();
            final PX px = new PX();
            px.QE = oz.readInt();
            if (px.QE != 4) {
                return null;
            }
            if (oz.readInt() != TM.dN(Arrays.copyOfRange(array, 16, n))) {
                return null;
            }
            px.wU = oz.readInt();
            px.fa = oz.readLong();
            oz.readInt();
            px.zs = new wk(oz.readInt(), oz.readInt(), oz.readInt());
            oz.readInt();
            oz.readInt();
            oz.readInt();
            px.mS = Arrays.copyOfRange(array, 56, n);
            return px;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public int dN() {
        return this.wU;
    }
    
    public long ld() {
        return this.fa;
    }
    
    public wk QE() {
        return this.zs;
    }
    
    public byte[] wU() {
        return this.mS;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    static {
        PX.ld = new Random(System.currentTimeMillis());
        PX.dN = new byte[] { 69, 103, -94, -103, 33, -125, -15, 16 };
    }
}
