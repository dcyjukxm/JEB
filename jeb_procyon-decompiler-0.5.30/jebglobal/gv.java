// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.List;

public final class gv extends as
{
    private Os KK;
    
    public gv(final Os kk) {
        super(kk, "Rename item");
        this.KK = kk;
        this.ld = 110;
        this.fa = HC.dN().dN("icon-letter-n.png");
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
        final YJ ok = this.KK.OK();
        if (ok == null) {
            return false;
        }
        final Object zs = ok.zs();
        if (zs == null) {
            return false;
        }
        final yW qe = this.KK.QE();
        final yx wu = this.KK.wU();
        if (zs instanceof yK) {
            return FB.dN(this.KK, (yK)zs, b, null);
        }
        if (zs instanceof hO) {
            return FB.dN(this.KK, (hO)zs, b, null);
        }
        if (zs instanceof gE) {
            return FB.dN(this.KK, (gE)zs, b, null);
        }
        if (zs instanceof HI) {
            final HI hi = (HI)zs;
            final List ld = this.KK.ld(ok);
            if (ld == null) {
                return false;
            }
            int dn = -1;
            for (final LW lw : ld) {
                if (lw.QE().fa() == 1) {
                    dn = lw.dN();
                    break;
                }
            }
            if (dn < 0) {
                return false;
            }
            final PL pl = (PL)this.KK.Hw().zs(dn);
            if (pl != null) {
                if (b) {
                    return true;
                }
                final Xa xa = new Xa(this.KK.getShell(), qe.XZ(), "Rename identifier", hi.dN(true));
                xa.ld(true);
                final String dn2 = xa.dN();
                if (dn2 != null && hi.dN(dn2.equals("") ? null : dn2)) {
                    this.KK.dN(hi.dN(true));
                    wu.ld().dN(u.uK.fa, pl.ld(), pl.QE(), hi.ld(), dn2.equals("") ? null : dn2);
                    return true;
                }
            }
        }
        else if (zs instanceof Qa) {
            final Long n = (Long)ok.mS();
            if (n != null) {
                if (b) {
                    return true;
                }
                final int n2 = (int)(n >> 32);
                final int n3 = (int)(n & -1L);
                final u dn3 = wu.ld().dN(n2, n3);
                final Xa xa2 = new Xa(this.KK.getShell(), qe.XZ(), "Rename label", (dn3 != null && dn3.LH()) ? dn3.Hw() : OM.QE(n3));
                xa2.ld(true);
                final String dn4 = xa2.dN();
                if (dn4 != null && wu.ld().dN(u.uK.wU, n2, n3, -1, dn4.equals("") ? null : dn4)) {
                    final u dn5 = wu.ld().dN(n2, n3);
                    if (dn5 != null && dn5.LH()) {
                        dn5.Hw();
                    }
                    else {
                        OM.QE(n3);
                    }
                    this.KK.dN(true);
                    return true;
                }
            }
        }
        return false;
    }
}
