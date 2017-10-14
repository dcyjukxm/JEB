// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class aZ extends yF implements WM
{
    private lk QE;
    
    public aZ(final lk qe) {
        this.dN = uK.wU;
        this.ld = vd.dN;
        this.QE = qe;
    }
    
    public lk dN() {
        return this.QE;
    }
    
    @Override
    public II dN(final List list, int n, final int[] array) {
        final II ii = list.get(n++);
        if (!(ii instanceof aZ)) {
            throw new RuntimeException();
        }
        final lk dn = ((aZ)ii).dN();
        final II ii2 = list.get(n);
        if (!(ii2 instanceof kd)) {
            throw new RuntimeException();
        }
        final int[] array2 = { 0 };
        final II dn2 = ((kd)ii2).dN(list, n, array2);
        n = array2[0];
        if (!(list.get(n++) instanceof Rp)) {
            throw new RuntimeException();
        }
        array[0] = n;
        return new zn(dn, (EG)dn2);
    }
}
