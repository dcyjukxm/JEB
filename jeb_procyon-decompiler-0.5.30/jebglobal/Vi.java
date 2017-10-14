// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public class Vi extends ED implements Mt
{
    protected final UD dN;
    
    public Vi(final UD dn) {
        this.dN = dn;
    }
    
    @Override
    public void dN(final Kf kf, final dx dx) {
        final String dn = dx.QE().mS().dN();
        if ("style".equals(dn)) {
            new aj(this.dN, new PS[0], null).dN(kf, dx);
            return;
        }
        if ("array".equals(dn)) {
            new eA(this.dN, new PS[0]).dN(kf, dx);
            return;
        }
        if ("plurals".equals(dn)) {
            new MA(this.dN, new PS[0]).dN(kf, dx);
            return;
        }
        kf.ld(null, "item");
        kf.dN(null, "type", dn);
        kf.dN(null, "name", dx.QE().fa());
        kf.QE(null, "item");
    }
}
