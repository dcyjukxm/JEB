// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class LW
{
    private int dN;
    private hv ld;
    private int QE;
    
    public LW(final int dn, final hv ld) {
        this.dN = 0;
        this.ld = null;
        this.QE = 0;
        this.dN = dn;
        this.ld = ld;
    }
    
    public LW(final int dn, final int qe) {
        this.dN = 0;
        this.ld = null;
        this.QE = 0;
        this.dN = dn;
        this.QE = qe;
    }
    
    public int dN() {
        return this.dN;
    }
    
    public int ld() {
        if (this.ld != null) {
            return this.ld.QE();
        }
        return this.QE;
    }
    
    public hv QE() {
        return this.ld;
    }
    
    @Override
    public String toString() {
        return String.format("line=%d item=%s offset=%d", this.dN, this.ld, this.QE);
    }
}
