// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

final class nO implements Runnable
{
    final /* synthetic */ XR dN;
    
    nO(final XR dn) {
        this.dN = dn;
    }
    
    @Override
    public void run() {
        try {
            this.dN.ld.ld(this.dN.QE, this.dN.wU);
        }
        catch (Exception ex) {
            cn.dN(String.format("Error generating decompiled code for class: %s", this.dN.QE));
            this.dN.dN.getDisplay().asyncExec((Runnable)new xG(this, ex));
        }
    }
}
