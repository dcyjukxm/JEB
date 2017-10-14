// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class tJ extends Cl
{
    tJ(final AR ar, final int n) {
        super(ar, n);
    }
    
    public int dN(final int n, final int n2, final int n3) {
        final int size = this.ld.size();
        final gE ge = new gE(this.dN, size, n, n2, n3);
        this.ld.add(ge);
        this.QE.put(ge.fa(false), ge);
        return size;
    }
}
