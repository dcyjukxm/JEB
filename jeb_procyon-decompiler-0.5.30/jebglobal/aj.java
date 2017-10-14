// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class aj extends Vi implements Mt
{
    private final PS[] ld;
    
    aj(final UD ud, final PS[] array, final dN dn) {
        super(ud);
        this.ld = new PS[array.length];
        for (int i = 0; i < array.length; ++i) {
            this.ld[i] = new PS(dn.dN((int)array[i].dN, (String)null), array[i].ld);
        }
    }
    
    @Override
    public void dN(final Kf kf, final dx dx) {
        kf.ld(null, "style");
        kf.dN(null, "name", dx.QE().fa());
        if (!this.dN.wU()) {
            kf.dN(null, "parent", this.dN.fa());
        }
        for (int i = 0; i < this.ld.length; ++i) {
            final UW qe = ((UD)this.ld[i].dN).QE();
            String s = ((sm)qe.ld().wU()).dN((fv)this.ld[i].ld);
            if (s == null) {
                s = ((fv)this.ld[i].ld).mS();
            }
            if (s != null) {
                kf.ld(null, "item");
                kf.dN(null, "name", qe.dN(dx.QE().zs(), true));
                kf.ld(s);
                kf.QE(null, "item");
            }
        }
        kf.QE(null, "style");
    }
}
