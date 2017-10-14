// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.List;

public final class NE extends as
{
    public NE(final yn yn) {
        super(yn, "Follow");
        this.ld = 13;
        this.fa = HC.dN().dN("icon-arrow-down.png");
        this.OK = true;
    }
    
    @Override
    public boolean OK() {
        return this.dN(true);
    }
    
    @Override
    public boolean LH() {
        return this.dN(false);
    }
    
    public boolean dN(final boolean b) {
        return this.ld(b) || (this.dN instanceof Os && this.QE(b));
    }
    
    public boolean ld(final boolean b) {
        final YJ ok = this.dN.OK();
        if (ok == null) {
            return false;
        }
        final List ld = this.dN.ld(ok);
        if (ld == null) {
            return false;
        }
        LW lw = null;
        for (final LW lw2 : ld) {
            if (lw2.QE().fa() == 1) {
                lw = lw2;
                break;
            }
        }
        return lw != null && (b || this.dN.dN(lw, true));
    }
    
    private boolean QE(final boolean b) {
        final YJ ok = this.dN.OK();
        if (ok == null) {
            return false;
        }
        final Os os = (Os)this.dN;
        final Object zs = ok.zs();
        if (zs == null) {
            return false;
        }
        if (zs instanceof yK) {
            if (b) {
                return true;
            }
            final String dn = ((yK)zs).dN(false);
            final Ky ky = new Ky();
            ky.dN = dn;
            os.dN(ky.QE = dn, ky);
            return true;
        }
        else if (zs instanceof hO) {
            final hO ho = (hO)zs;
            if (!ho.QE()) {
                return false;
            }
            final String wu = ho.wU(false);
            final String dn2 = ho.dN(false);
            if (os.wU().QE().EO(dn2) == null) {
                return false;
            }
            if (b) {
                return true;
            }
            final Ky ky2 = new Ky();
            ky2.dN = wu;
            ky2.QE = dn2;
            ky2.wU = wu;
            os.dN(dn2, ky2);
            return true;
        }
        else {
            if (!(zs instanceof gE)) {
                return false;
            }
            final gE ge = (gE)zs;
            if (!ge.QE()) {
                return false;
            }
            final String fa = ge.fa(false);
            final String dn3 = ge.dN(false);
            if (os.wU().QE().EO(dn3) == null) {
                return false;
            }
            if (b) {
                return true;
            }
            final Ky ky3 = new Ky();
            ky3.dN = fa;
            ky3.QE = dn3;
            ky3.fa = fa;
            os.dN(dn3, ky3);
            return true;
        }
    }
}
