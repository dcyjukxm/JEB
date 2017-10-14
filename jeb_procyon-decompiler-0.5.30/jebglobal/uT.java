// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Composite;

public final class uT extends lW
{
    private ew dN;
    
    public uT(final Composite composite, final yx yx) {
        super(composite, yx.dN().XZ(), true);
        this.dN = yx.ld();
        if (this.dN == null) {
            throw new RuntimeException();
        }
    }
    
    @Override
    public void KK() {
        final OD eo = this.dN.EO();
        if (eo == null || eo.PF() == null) {
            this.QE("You can type your notes here - they will be saved with your JDB.");
            this.VX();
            return;
        }
        this.QE(eo.PF());
    }
}
