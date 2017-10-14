// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class dx
{
    private final NM dN;
    private final UW ld;
    private final ED QE;
    
    public dx(final NM dn, final UW ld, final ED qe) {
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
    }
    
    public String dN() {
        return this.ld.mS().dN() + this.dN.dN().dN() + "/" + this.ld.fa();
    }
    
    public NM ld() {
        return this.dN;
    }
    
    public UW QE() {
        return this.ld;
    }
    
    public ED wU() {
        return this.QE;
    }
    
    public void dN(final ED ed) {
        final dx dx = new dx(this.dN, this.ld, ed);
        this.dN.dN(dx, true);
        this.ld.dN(dx, true);
    }
    
    @Override
    public String toString() {
        return this.dN();
    }
}
