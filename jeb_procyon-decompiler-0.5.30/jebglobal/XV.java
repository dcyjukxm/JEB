// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class XV
{
    private int dN;
    private int ld;
    private int QE;
    
    XV(final int dn, final int ld) {
        this.dN = dn;
        this.ld = ld;
        this.QE = 0;
    }
    
    public int dN() {
        return this.dN;
    }
    
    public int ld() {
        return this.ld;
    }
    
    public boolean QE() {
        return (this.ld & 0x8) != 0x0;
    }
    
    public int wU() {
        return this.QE;
    }
    
    public void dN(final int qe) {
        this.QE = qe;
    }
}
