// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

final class BP implements Runnable
{
    final /* synthetic */ XR dN;
    
    BP(final XR dn) {
        this.dN = dn;
    }
    
    @Override
    public void run() {
        this.dN.dN.getDisplay().syncExec((Runnable)new ef(this));
    }
}
