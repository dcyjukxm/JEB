// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class Cx
{
    private AR dN;
    private int ld;
    private String QE;
    private int[] wU;
    private UZ fa;
    
    public Cx(final AR dn) {
        this.dN = dn;
    }
    
    public boolean dN(final hO ho, final List list) {
        if (!ho.QE()) {
            return false;
        }
        if (ho.ld() == null) {
            return false;
        }
        this.fa = this.dN.ZY();
        this.ld = ho.zs().dN();
        this.QE = ho.ld(false);
        this.wU = ho.OK().zs();
        final ArrayList list2 = new ArrayList();
        this.dN(this.ld, list2);
        list.clear();
        list.addAll(list2);
        return true;
    }
    
    private void dN(final int n, final List list) {
        final UZ.uK dn = this.fa.dN(n);
        if (dn == null) {
            return;
        }
        if (n != this.ld) {
            for (final int intValue : dn.fa) {
                final hO ms = this.dN.mS(intValue);
                final AV ld = ms.ld();
                if (ld == null) {
                    continue;
                }
                if (ld.LH()) {
                    continue;
                }
                if (!this.QE.equals(ms.ld(false))) {
                    continue;
                }
                if (!Arrays.equals(this.wU, ms.OK().zs())) {
                    continue;
                }
                list.add(intValue);
                break;
            }
        }
        final Iterator iterator2 = dn.wU.iterator();
        while (iterator2.hasNext()) {
            this.dN(iterator2.next(), list);
        }
    }
    
    public List dN(final hO ho) {
        this.fa = this.dN.ZY();
        final ArrayList list = new ArrayList();
        this.dN(ho, ho.zs().dN(), list, true, -1);
        return list;
    }
    
    private void dN(final hO ho, final int n, final List list, final boolean b, final int n2) {
        final UZ.uK dn = this.fa.dN(n);
        if (dn == null) {
            return;
        }
        final int dn2 = this.dN(dn, ho);
        if (dn2 >= 0 && !list.contains(dn2)) {
            list.add(dn2);
        }
        for (final int intValue : dn.wU) {
            if (intValue == n2) {
                continue;
            }
            this.dN(ho, intValue, list, false, -1);
        }
        if (b) {
            final ArrayList list2 = new ArrayList<Object>(dn.QE);
            if (dn.ld >= 0) {
                list2.add(dn.ld);
            }
            for (final int intValue2 : list2) {
                final UZ.uK dn3 = this.fa.dN(intValue2);
                if (dn3 != null && this.dN(dn3, ho) >= 0) {
                    this.dN(ho, intValue2, list, true, n);
                    break;
                }
            }
        }
    }
    
    int dN(final UZ.uK uk, final hO ho) {
        for (final int intValue : uk.fa) {
            final hO ms = this.dN.mS(intValue);
            if (!ho.ld(false).equals(ms.ld(false))) {
                continue;
            }
            if (!Arrays.equals(ho.OK().zs(), ms.OK().zs())) {
                continue;
            }
            return intValue;
        }
        return -1;
    }
}
