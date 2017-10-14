// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

final class rC implements Runnable
{
    private /* synthetic */ String dN;
    private /* synthetic */ Jz ld;
    
    rC(final eI ei, final String dn, final Jz ld) {
        this.dN = dn;
        this.ld = ld;
    }
    
    @Override
    public void run() {
        cn.dN(String.format("Running script %s...", this.dN));
        this.ld.dN();
    }
}
