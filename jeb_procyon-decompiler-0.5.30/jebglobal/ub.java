// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public final class ub
{
    private int dN;
    private byte ld;
    private short QE;
    private char wU;
    private int fa;
    private long zs;
    private float mS;
    private double OK;
    private int LH;
    private int KK;
    private int EO;
    private int cb;
    private int PF;
    private ub[] Hw;
    private kg rK;
    private boolean Ux;
    
    private ub() {
        this.dN = -1;
    }
    
    public int dN() {
        return this.dN;
    }
    
    public boolean ld() {
        return this.dN == 30;
    }
    
    public byte QE() {
        if (this.dN != 0) {
            throw new RuntimeException();
        }
        return this.ld;
    }
    
    public short wU() {
        if (this.dN != 2) {
            throw new RuntimeException();
        }
        return this.QE;
    }
    
    public char fa() {
        if (this.dN != 3) {
            throw new RuntimeException();
        }
        return this.wU;
    }
    
    public int zs() {
        if (this.dN != 4) {
            throw new RuntimeException();
        }
        return this.fa;
    }
    
    public long mS() {
        if (this.dN != 6) {
            throw new RuntimeException();
        }
        return this.zs;
    }
    
    public float OK() {
        if (this.dN != 16) {
            throw new RuntimeException();
        }
        return this.mS;
    }
    
    public double LH() {
        if (this.dN != 17) {
            throw new RuntimeException();
        }
        return this.OK;
    }
    
    public int KK() {
        if (this.dN != 23) {
            throw new RuntimeException();
        }
        return this.LH;
    }
    
    public int EO() {
        if (this.dN != 24) {
            throw new RuntimeException();
        }
        return this.KK;
    }
    
    public int cb() {
        if (this.dN != 25) {
            throw new RuntimeException();
        }
        return this.EO;
    }
    
    public int PF() {
        if (this.dN != 26) {
            throw new RuntimeException();
        }
        return this.cb;
    }
    
    public int Hw() {
        if (this.dN != 27) {
            throw new RuntimeException();
        }
        return this.PF;
    }
    
    public ub[] rK() {
        if (this.dN != 28) {
            throw new RuntimeException();
        }
        return this.Hw;
    }
    
    public kg Ux() {
        if (this.dN != 29) {
            throw new RuntimeException();
        }
        return this.rK;
    }
    
    public boolean ZY() {
        if (this.dN != 31) {
            throw new RuntimeException();
        }
        return this.Ux;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    public static ub dN(final byte[] array, final int n, final int[] array2) {
        final int n2 = array[n] & 0xFF;
        final int dn = n2 & 0x1F;
        int n3 = n2 >> 5;
        final int[] array3 = { 0 };
        final ub ub = new ub();
        switch (ub.dN = dn) {
            case 0: {
                dN(n3, 0, 0);
                ub.ld = array[n + 1];
                ++n3;
                break;
            }
            case 2: {
                dN(n3, 0, 1);
                ub.QE = dN(array, n + 1, n3 + 1, 2, true).getShort(0);
                ++n3;
                break;
            }
            case 3: {
                dN(n3, 0, 1);
                ub.wU = dN(array, n + 1, n3 + 1, 2, false).getChar(0);
                ++n3;
                break;
            }
            case 4: {
                dN(n3, 0, 3);
                ub.fa = dN(array, n + 1, n3 + 1, 4, true).getInt(0);
                ++n3;
                break;
            }
            case 6: {
                dN(n3, 0, 7);
                ub.zs = dN(array, n + 1, n3 + 1, 8, true).getLong(0);
                ++n3;
                break;
            }
            case 16: {
                dN(n3, 0, 3);
                ub.mS = dN(array, n + 1, n3 + 1, 4, false).getFloat(0);
                ++n3;
                break;
            }
            case 17: {
                dN(n3, 0, 7);
                ub.OK = dN(array, n + 1, n3 + 1, 8, false).getDouble(0);
                ++n3;
                break;
            }
            case 23:
            case 24:
            case 25:
            case 26:
            case 27: {
                dN(n3, 0, 3);
                final int int1 = dN(array, n + 1, n3 + 1, 4, false).getInt(0);
                if (int1 < 0) {
                    throw new yL();
                }
                if (dn == 23) {
                    ub.LH = int1;
                }
                else if (dn == 24) {
                    ub.KK = int1;
                }
                else if (dn == 25) {
                    ub.EO = int1;
                }
                else if (dn == 26) {
                    ub.cb = int1;
                }
                else {
                    ub.PF = int1;
                }
                ++n3;
                break;
            }
            case 28: {
                dN(n3, 0, 0);
                ub.Hw = ld(array, n + 1, array3);
                n3 = array3[0];
                break;
            }
            case 29: {
                dN(n3, 0, 0);
                ub.rK = kg.dN(array, n + 1, array3);
                n3 = array3[0];
                break;
            }
            case 30: {
                dN(n3, 0, 0);
                n3 = 0;
                break;
            }
            case 31: {
                dN(n3, 0, 1);
                ub.Ux = (n3 == 1);
                n3 = 0;
                break;
            }
            default: {
                throw new yL();
            }
        }
        array2[0] = 1 + n3;
        return ub;
    }
    
    public static ub[] ld(final byte[] array, final int n, final int[] array2) {
        final int[] array3 = { 0 };
        final int ld = AR.ld(array, n, array3);
        int n2 = n + array3[0];
        final ub[] array4 = new ub[ld];
        for (int i = 0; i < ld; ++i) {
            array4[i] = dN(array, n2, array3);
            n2 += array3[0];
        }
        array2[0] = n2 - n;
        return array4;
    }
    
    private static void dN(final int n, final int n2, final int n3) {
        if (n < n2 || n > n3) {
            throw new yL();
        }
    }
    
    private static ByteBuffer dN(final byte[] array, final int n, final int n2, final int n3, final boolean b) {
        final ByteBuffer allocate = ByteBuffer.allocate(n3);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        final byte[] array2 = allocate.array();
        for (int i = 0; i < n2; ++i) {
            array2[i] = array[n + i];
        }
        if (b && (array2[n2 - 1] & 0x80) != 0x0) {
            for (int j = n2; j < n3; ++j) {
                array2[j] = -1;
            }
        }
        return allocate;
    }
}
