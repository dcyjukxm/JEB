// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class Fx extends Cl
{
    Fx(final AR ar, final int n) {
        super(ar, n);
    }
    
    public int dN(final int n, final int n2, final int n3) {
        final int size = this.ld.size();
        final hO ho = new hO(this.dN, size, n, n2, n3);
        this.ld.add(ho);
        this.QE.put(ho.wU(false), ho);
        return size;
    }
}
