// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class kB extends fv
{
    public kB(final String s) {
        this(s, "string");
    }
    
    public kB(final String s, final String s2) {
        super(s2, s);
    }
    
    @Override
    public String fa() {
        return TM.ld(this.ld);
    }
    
    @Override
    public String zs() {
        return TM.fa(TM.QE(this.ld));
    }
    
    @Override
    public String mS() {
        return TM.QE(this.ld);
    }
    
    @Override
    protected String dN() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected void ld(final Kf kf, final dx dx) {
        if (TM.wU(this.ld)) {
            kf.dN(null, "formatted", "false");
        }
    }
}
