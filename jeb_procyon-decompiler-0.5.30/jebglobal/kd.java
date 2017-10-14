// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class kd extends yF implements WM
{
    public kd() {
        this.dN = uK.dN;
        this.ld = vd.dN;
    }
    
    @Override
    public II dN(final List list, int n, final int[] array) {
        if (!(list.get(n++) instanceof kd)) {
            throw new RuntimeException();
        }
        final EG eg = new EG();
        while (true) {
            final II ii = list.get(n);
            if (ii instanceof RT) {
                break;
            }
            if (ii instanceof WM) {
                final int[] array2 = { 0 };
                eg.dN(((WM)ii).dN(list, n, array2));
                n = array2[0];
            }
            else {
                eg.dN(ii);
                ++n;
            }
        }
        ++n;
        array[0] = n;
        return eg;
    }
}
