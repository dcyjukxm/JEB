// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class UD extends Vp
{
    private final cN QE;
    private final boolean wU;
    
    public UD(final cN qe, final int n, final String s, final boolean wu) {
        super(n, s, "reference");
        this.QE = qe;
        this.wU = wu;
    }
    
    @Override
    protected String dN() {
        if (this.wU()) {
            return "@null";
        }
        final UW qe = this.QE();
        return (this.wU ? '?' : '@') + ((qe.QE() && qe.ld().wU() instanceof Al) ? "+" : "") + qe.dN(this.QE, this.wU && qe.mS().dN().equals("attr"));
    }
    
    public UW QE() {
        return this.QE.wU().dN(this.ld());
    }
    
    public boolean wU() {
        return this.dN == 0;
    }
}
