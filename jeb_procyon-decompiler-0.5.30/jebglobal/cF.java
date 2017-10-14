// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class cF extends as
{
    public cF(final yn yn) {
        super(yn, "Navigate backward");
        this.ld = 27;
        this.fa = HC.dN().dN("icon-arrow-left.png");
        this.OK = true;
    }
    
    @Override
    public boolean OK() {
        return this.dN.LH().QE() || (this.dN instanceof Os && ((Os)this.dN).Ux().QE());
    }
    
    @Override
    public boolean LH() {
        final LW lw = (LW)this.dN.LH().ld(new LW(this.dN.zs(), this.dN.mS()));
        if (lw != null) {
            this.dN.dN(lw, false);
            return true;
        }
        if (this.dN instanceof Os) {
            final Os os = (Os)this.dN;
            final String s = (String)os.Ux().ld(os.rK());
            if (s != null) {
                os.dN(s, null, false);
                final LW lw2 = (LW)os.LH().ld(null);
                if (lw2 != null) {
                    os.dN(lw2, false);
                }
                return true;
            }
        }
        return false;
    }
}
