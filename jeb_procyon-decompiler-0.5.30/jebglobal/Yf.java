// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public final class Yf extends as
{
    public Yf(final yn yn) {
        super(yn, "Item info");
        this.ld = 105;
        this.fa = HC.dN().dN("icon-info.png");
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
    
    private boolean dN(final boolean b) {
        final YJ ok = this.dN.OK();
        if (ok == null) {
            return false;
        }
        final Object zs = ok.zs();
        if (zs == null) {
            return false;
        }
        final AR qe = this.dN.wU().QE();
        int n = -1;
        hO ho = null;
        if (zs instanceof String) {
            n = qe.mS().ld((String)zs);
            if (n < 0) {
                return false;
            }
        }
        else if (zs instanceof yK) {
            n = ((yK)zs).zs();
        }
        else {
            if (!(zs instanceof hO)) {
                return false;
            }
            ho = (hO)zs;
        }
        if (b) {
            return true;
        }
        if (n >= 0) {
            final int intValue = new tg(this.dN.getShell(), this.dN.QE().XZ(), qe, n).dN();
            if (intValue >= 0 && this.dN instanceof Pl) {
                final int dn = ((Pl)this.dN).Hw().dN(qe.dN(intValue, false));
                if (dn >= 0) {
                    this.dN.ld(this.dN.OK(dn));
                }
            }
        }
        else if (ho != null) {
            final Cx cx = new Cx(qe);
            final ArrayList<Integer> list = new ArrayList<Integer>();
            if (!cx.dN(ho, list)) {
                return false;
            }
            final ArrayList<Ss.uK> list2 = new ArrayList<Ss.uK>();
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                final hO ms = qe.mS(iterator.next());
                int dn2 = 0;
                if (this.dN instanceof Pl) {
                    dn2 = ((Pl)this.dN).Hw().dN(ms.wU(false));
                }
                list2.add(new Ss.uK(this.dN.OK(dn2), dn2, ms.wU(true)));
            }
            final int intValue2 = new Ss(this.dN.getShell(), this.dN.QE().EO().QE(WV.nA), list2, 0, "Method overrides", "Line #", "Information").dN();
            if (intValue2 >= 0) {
                this.dN.ld(((Ss.uK)list2.get(intValue2)).dN);
            }
        }
        return true;
    }
}
