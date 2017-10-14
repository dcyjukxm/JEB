// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class bG extends Cl
{
    bG(final AR ar, final int n) {
        super(ar, n);
    }
    
    int dN(final int n, final int n2, final int[] array) {
        final int size = this.ld.size();
        final Bw bw = new Bw(this.dN, size, n, n2, array);
        this.ld.add(bw);
        this.QE.put(bw.QE(false), bw);
        return size;
    }
}
