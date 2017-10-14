// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.SWT;

public final class RL extends as
{
    private Os KK;
    
    public RL(final Os kk) {
        super(kk, "Forced Refresh (redecompile)");
        this.KK = kk;
        if (kk.QE().cb()) {
            this.ld = 82;
            this.QE = (SWT.MOD1 | SWT.MOD2);
        }
        else {
            this.ld = 16777230;
            this.QE = SWT.MOD1;
        }
        this.fa = HC.dN().dN("icon-refresh.png");
        this.OK = false;
    }
    
    @Override
    public boolean OK() {
        return true;
    }
    
    @Override
    public boolean LH() {
        final MessageBox messageBox = new MessageBox(this.KK.getShell(), 200);
        messageBox.setText("Confirmation");
        messageBox.setMessage("Redo a decompilation?");
        if (messageBox.open() == 128) {
            return false;
        }
        final Rg wu = this.KK.wU().wU();
        wu.dN(true);
        this.KK.dN(true);
        wu.dN(false);
        return true;
    }
}
