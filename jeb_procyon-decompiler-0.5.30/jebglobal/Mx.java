// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class Mx extends Cl
{
    Mx(final AR ar, final int n) {
        super(ar, n);
    }
    
    public int dN(final int n, final int n2, final int n3, final int[] array, final int n4, final xd xd, final Uk uk, final ub[] array2) {
        final int size = this.ld.size();
        final yK yk = new yK(this.dN, size, n, n2, n3, array, n4, xd, uk, array2);
        this.ld.add(yk);
        this.QE.put(yk.ld(false), yk);
        return size;
    }
}
