// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Comparator;

final class dz implements Comparator
{
    private /* synthetic */ ZL dN;
    
    dz(final zd zd, final ZL dn) {
        this.dN = dn;
    }
    
    public int dN(final Fu fu, final Fu fu2) {
        final String ms = fu.mS();
        final String ms2 = fu2.mS();
        if (!this.dN.wU) {
            return ms.compareTo(ms2);
        }
        int n = 1;
        if (fu.rK()) {
            n = 0;
        }
        else if (fu.Ux()) {
            n = 2;
        }
        else if (fu.ZY()) {
            n = 3;
        }
        int n2 = 1;
        if (fu2.rK()) {
            n2 = 0;
        }
        else if (fu2.Ux()) {
            n2 = 2;
        }
        else if (fu2.ZY()) {
            n2 = 3;
        }
        if (n == n2 || ms.startsWith("<") || ms2.startsWith("<")) {
            return ms.compareTo(ms2);
        }
        return n - n2;
    }
}
