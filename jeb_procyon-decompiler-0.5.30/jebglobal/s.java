// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.SWT;

public final class s extends as
{
    public s(final yn yn) {
        super(yn, "Refresh");
        if (yn.QE().cb()) {
            this.ld = 82;
            this.QE = SWT.MOD1;
        }
        else {
            this.ld = 16777230;
        }
        this.fa = HC.dN().dN("icon-refresh.png");
        this.OK = true;
    }
    
    @Override
    public boolean OK() {
        return true;
    }
    
    @Override
    public boolean LH() {
        this.dN.dN(true);
        return true;
    }
}
