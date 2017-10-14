// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.swt.SWT;

public final class of extends as
{
    private Os KK;
    
    public of(final Os kk) {
        super(kk, "Cross-references (real)");
        this.KK = kk;
        this.ld = 120;
        this.QE = SWT.MOD1;
        this.fa = HC.dN().dN("icon-letter-x-red.png");
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
        if (!(zs instanceof yK) && !(zs instanceof gE) && !(zs instanceof hO)) {
            return false;
        }
        if (b) {
            return true;
        }
        final AR qe = this.KK.wU().QE();
        List<Integer> list = null;
        if (zs instanceof yK) {
            list = qe.zs().dN().get(((yK)zs).zs());
        }
        else if (zs instanceof gE) {
            list = qe.zs().ld().get(((gE)zs).dN());
        }
        else if (zs instanceof hO) {
            list = qe.zs().QE().get(((hO)zs).dN());
        }
        if (list == null) {
            return false;
        }
        final ArrayList<Ss.uK> list2 = new ArrayList<Ss.uK>();
        for (final int intValue : list) {
            String wu = "?";
            final hO lh = qe.LH(intValue);
            if (lh != null) {
                wu = lh.wU(true);
            }
            list2.add(new Ss.uK(intValue, intValue, wu));
        }
        final int intValue2 = new Ss(this.KK.getShell(), this.KK.QE().EO().QE(WV.nA), list2, 0, "Cross-references (code)", "Code offset", "Method").dN();
        if (intValue2 >= 0) {
            final Ss.uK uk = list2.get(intValue2);
            final yx wu2 = this.KK.wU();
            final Ky ky = new Ky();
            final hO lh2 = qe.LH(uk.dN);
            ky.wU = lh2.wU(false);
            ky.dN = ky.wU;
            ky.ld = lh2.wU(true);
            ky.mS = lh2.ld().wU().ld();
            ky.zs = uk.dN - ky.mS;
            wu2.OK().dN(ky);
            wu2.EO();
            wu2.OK().rK();
        }
        return true;
    }
}
