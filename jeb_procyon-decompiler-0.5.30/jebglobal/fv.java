// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public abstract class fv extends ED implements Mt
{
    private String dN;
    protected final String ld;
    
    protected fv(final String dn, final String ld) {
        this.dN = dn;
        this.ld = ld;
    }
    
    public String fa() {
        if (this.ld != null) {
            return this.ld;
        }
        return this.dN();
    }
    
    public String zs() {
        return this.mS();
    }
    
    public String mS() {
        if (this.ld != null) {
            return this.ld;
        }
        return this.dN();
    }
    
    @Override
    public void dN(final Kf kf, final dx dx) {
        final String dn = dx.QE().mS().dN();
        final boolean b = !"reference".equals(this.dN) && !dn.equals(this.dN);
        final String s = b ? "item" : dn;
        kf.ld(null, s);
        if (b) {
            kf.dN(null, "type", dn);
        }
        kf.dN(null, "name", dx.QE().fa());
        this.ld(kf, dx);
        final String ms = this.mS();
        if (!ms.isEmpty()) {
            kf.OK(ms);
        }
        kf.QE(null, s);
    }
    
    public String OK() {
        return this.dN;
    }
    
    protected void ld(final Kf kf, final dx dx) {
    }
    
    protected abstract String dN();
}
