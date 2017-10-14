// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class eA extends Vi implements Mt
{
    private final fv[] ld;
    
    eA(final UD ud, final PS[] array) {
        super(ud);
        this.ld = new fv[array.length];
        for (int i = 0; i < array.length; ++i) {
            this.ld[i] = (fv)array[i].ld;
        }
    }
    
    @Override
    public void dN(final Kf kf, final dx dx) {
        final String dn = this.dN();
        final String string = ((dn == null) ? "" : (dn + "-")) + "array";
        kf.ld(null, string);
        kf.dN(null, "name", dx.QE().fa());
        for (int i = 0; i < this.ld.length; ++i) {
            kf.ld(null, "item");
            kf.ld(this.ld[i].zs());
            kf.QE(null, "item");
        }
        kf.QE(null, string);
    }
    
    public String dN() {
        if (this.ld.length == 0) {
            return null;
        }
        final String ok = this.ld[0].OK();
        if (!"string".equals(ok) && !"integer".equals(ok)) {
            return null;
        }
        for (int i = 1; i < this.ld.length; ++i) {
            if (!ok.equals(this.ld[i].OK())) {
                return null;
            }
        }
        return ok;
    }
}
