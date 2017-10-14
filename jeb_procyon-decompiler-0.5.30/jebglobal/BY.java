// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Listener;
import java.util.Date;
import java.util.Calendar;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Shell;

final class BY implements Runnable
{
    private /* synthetic */ ND dN;
    
    BY(final ND dn) {
        this.dN = dn;
    }
    
    @Override
    public void run() {
        this.dN.QE = true;
        this.dN.dN.setText("OK");
        this.dN.dN.setEnabled(true);
        this.dN.dN.setFocus();
    }
}
