// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class Ya extends yF implements WM
{
    public Ya() {
        this.dN = uK.QE;
        this.ld = vd.dN;
    }
    
    @Override
    public II dN(final List list, int n, final int[] array) {
        if (!(list.get(n++) instanceof Ya)) {
            throw new RuntimeException();
        }
        final II ii = list.get(n);
        if (!(ii instanceof kd)) {
            throw new RuntimeException();
        }
        final int[] array2 = { 0 };
        final II dn = ((kd)ii).dN(list, n, array2);
        n = array2[0];
        final II ii2 = list.get(n++);
        if (!(ii2 instanceof aY)) {
            throw new RuntimeException();
        }
        final lk dn2 = ((aY)ii2).dN();
        array[0] = n;
        return new jM((EG)dn, dn2);
    }
}
