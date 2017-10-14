// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Comparator;

final class VI implements Comparator
{
    private /* synthetic */ int dN;
    private /* synthetic */ int ld;
    
    VI(final lF lf, final int dn, final int ld) {
        this.dN = dn;
        this.ld = ld;
    }
    
    public int dN(final Comparable[] array, final Comparable[] array2) {
        final int compareTo = array[this.dN].compareTo(array2[this.dN]);
        return (this.ld == 1024) ? compareTo : (-compareTo);
    }
}
