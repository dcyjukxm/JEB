// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class Ps extends yF implements WM
{
    private Xf QE;
    
    public Ps(final Xf qe) {
        this.dN = uK.zs;
        this.ld = vd.dN;
        this.QE = qe;
    }
    
    public Xf dN() {
        return this.QE;
    }
    
    @Override
    public II dN(final List list, int n, final int[] array) {
        final II ii = list.get(n++);
        if (!(ii instanceof Ps)) {
            throw new RuntimeException();
        }
        final Xf dn = ((Ps)ii).dN();
        final int[] array2 = { 0 };
        final Dq dq = new Dq(dn);
        while (true) {
            final II ii2 = list.get(n++);
            if (ii2 instanceof FX) {
                array[0] = n;
                return dq;
            }
            if (ii2 instanceof At) {
                final List dn2 = ((At)ii2).dN();
                final II ii3 = list.get(n);
                if (!(ii3 instanceof kd)) {
                    throw new RuntimeException();
                }
                final II dn3 = ((kd)ii3).dN(list, n, array2);
                n = array2[0];
                dq.dN(dn2, (EG)dn3);
            }
            else {
                if (!(ii2 instanceof Ro)) {
                    throw new RuntimeException();
                }
                final II ii4 = list.get(n);
                if (!(ii4 instanceof kd)) {
                    throw new RuntimeException();
                }
                final II dn4 = ((kd)ii4).dN(list, n, array2);
                n = array2[0];
                dq.dN((EG)dn4);
            }
        }
    }
}
