// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class SB extends yF implements WM
{
    private II QE;
    private lk wU;
    private II fa;
    
    public SB(final II qe, final lk wu, final II fa) {
        this.dN = uK.fa;
        this.ld = vd.dN;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
    }
    
    public II dN() {
        return this.QE;
    }
    
    public lk ld() {
        return this.wU;
    }
    
    public II zs() {
        return this.fa;
    }
    
    @Override
    public II dN(final List list, int n, final int[] array) {
        final II ii = list.get(n++);
        if (!(ii instanceof SB)) {
            throw new RuntimeException();
        }
        final II dn = ((SB)ii).dN();
        final lk ld = ((SB)ii).ld();
        final II zs = ((SB)ii).zs();
        final II ii2 = list.get(n);
        if (!(ii2 instanceof kd)) {
            throw new RuntimeException();
        }
        final int[] array2 = { 0 };
        final II dn2 = ((kd)ii2).dN(list, n, array2);
        n = array2[0];
        if (!(list.get(n++) instanceof bW)) {
            throw new RuntimeException();
        }
        array[0] = n;
        return new am(dn, ld, zs, (EG)dn2);
    }
}
