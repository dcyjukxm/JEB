// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class AV
{
    private int dN;
    private int ld;
    private OM QE;
    private int[] wU;
    private int fa;
    
    AV(final int dn, final int ld, final OM qe) {
        this.wU = null;
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.fa = 0;
    }
    
    public void dN(final int[] wu) {
        this.wU = wu;
    }
    
    public int[] dN() {
        return this.wU;
    }
    
    public int ld() {
        return this.dN;
    }
    
    public int QE() {
        return this.ld;
    }
    
    public OM wU() {
        return this.QE;
    }
    
    public boolean fa() {
        return (this.ld & 0x10000) != 0x0;
    }
    
    public boolean zs() {
        return (this.ld & 0x8) != 0x0;
    }
    
    public boolean mS() {
        return (this.ld & 0x400) != 0x0;
    }
    
    public boolean OK() {
        return (this.ld & 0x100) != 0x0;
    }
    
    public boolean LH() {
        return (this.ld & 0x2) != 0x0;
    }
    
    public int KK() {
        return this.fa;
    }
    
    public void dN(final int fa) {
        this.fa = fa;
    }
}
