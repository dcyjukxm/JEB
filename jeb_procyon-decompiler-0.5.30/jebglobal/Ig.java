// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class Ig
{
    private static final float[] dN;
    private static final String[] ld;
    private static final String[] QE;
    
    public static float dN(final int n) {
        return (n & 0xFFFFFF00) * Ig.dN[n >> 4 & 0x3];
    }
    
    public static final String dN(final int n, final int n2) {
        switch (n) {
            case 0: {
                return null;
            }
            case 1: {
                return "@" + n2;
            }
            case 2: {
                return "?" + n2;
            }
            case 4: {
                return Float.toString(Float.intBitsToFloat(n2));
            }
            case 5: {
                return Float.toString(dN(n2)) + Ig.ld[n2 >> 0 & 0xF];
            }
            case 6: {
                return Float.toString(dN(n2) * 100.0f) + Ig.QE[n2 >> 0 & 0xF];
            }
            case 17: {
                return "0x" + Integer.toHexString(n2);
            }
            case 18: {
                return (n2 != 0) ? "true" : "false";
            }
            default: {
                if (n >= 28 && n <= 31) {
                    return "#" + Integer.toHexString(n2);
                }
                if (n >= 16 && n <= 31) {
                    return Integer.toString(n2);
                }
                return null;
            }
        }
    }
    
    static {
        dN = new float[] { 0.00390625f, 3.0517578E-5f, 1.1920929E-7f, 4.656613E-10f };
        ld = new String[] { "px", "dip", "sp", "pt", "in", "mm" };
        QE = new String[] { "%", "%p" };
    }
}
