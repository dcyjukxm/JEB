// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class wJ extends yF implements WM
{
    public wJ() {
        this.dN = uK.mS;
        this.ld = vd.dN;
    }
    
    @Override
    public II dN(final List list, int n, final int[] array) {
        if (!(list.get(n++) instanceof wJ)) {
            throw new RuntimeException();
        }
        final II ii = list.get(n);
        if (!(ii instanceof kd)) {
            throw new RuntimeException();
        }
        final int[] array2 = { 0 };
        final II dn = ((kd)ii).dN(list, n, array2);
        n = array2[0];
        final SP sp = new SP((EG)dn);
        while (true) {
            final II ii2 = list.get(n++);
            if (ii2 instanceof tP) {
                array[0] = n;
                return sp;
            }
            if (ii2 instanceof Je) {
                final hV dn2 = ((Je)ii2).dN();
                final HI ld = ((Je)ii2).ld();
                final II ii3 = list.get(n);
                if (!(ii3 instanceof kd)) {
                    throw new RuntimeException();
                }
                final II dn3 = ((kd)ii3).dN(list, n, array2);
                n = array2[0];
                sp.dN(dn2, ld, (EG)dn3);
            }
            else {
                if (!(ii2 instanceof IF)) {
                    throw new RuntimeException();
                }
                final II ii4 = list.get(n);
                if (!(ii4 instanceof kd)) {
                    throw new RuntimeException();
                }
                final II dn4 = ((kd)ii4).dN(list, n, array2);
                n = array2[0];
                sp.dN((EG)dn4);
            }
        }
    }
}
