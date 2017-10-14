// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class h extends yF implements WM
{
    private lk QE;
    
    public h(final lk qe) {
        this.dN = uK.ld;
        this.ld = vd.dN;
        this.QE = qe;
    }
    
    public lk dN() {
        return this.QE;
    }
    
    @Override
    public II dN(final List list, int n, final int[] array) {
        final II ii = list.get(n++);
        if (!(ii instanceof h)) {
            throw new RuntimeException();
        }
        final lk dn = ((h)ii).dN();
        final II ii2 = list.get(n);
        if (!(ii2 instanceof kd)) {
            throw new RuntimeException();
        }
        final int[] array2 = { 0 };
        final II dn2 = ((kd)ii2).dN(list, n, array2);
        n = array2[0];
        final tE te = new tE(dn, (EG)dn2);
        while (true) {
            final II ii3 = list.get(n++);
            if (ii3 instanceof rj) {
                array[0] = n;
                return te;
            }
            if (ii3 instanceof gl) {
                final lk dn3 = ((gl)ii3).dN();
                final II ii4 = list.get(n);
                if (!(ii4 instanceof kd)) {
                    throw new RuntimeException();
                }
                final II dn4 = ((kd)ii4).dN(list, n, array2);
                n = array2[0];
                te.dN(dn3, (EG)dn4);
            }
            else {
                if (!(ii3 instanceof hs)) {
                    throw new RuntimeException();
                }
                final II ii5 = list.get(n);
                if (!(ii5 instanceof kd)) {
                    throw new RuntimeException();
                }
                final II dn5 = ((kd)ii5).dN(list, n, array2);
                n = array2[0];
                te.dN((EG)dn5);
            }
        }
    }
}
