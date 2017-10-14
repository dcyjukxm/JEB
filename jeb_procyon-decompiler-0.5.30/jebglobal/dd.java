// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

final class dd implements Runnable
{
    private /* synthetic */ String dN;
    private /* synthetic */ l ld;
    
    dd(final l ld, final String dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    @Override
    public void run() {
        this.ld.dN(this.dN);
    }
}
