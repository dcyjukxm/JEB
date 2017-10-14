// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Composite;

final class gt implements Runnable
{
    private /* synthetic */ ym dN;
    private /* synthetic */ Pl ld;
    
    gt(final Pl ld, final ym dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    @Override
    public void run() {
        this.dN.dN(this.ld.LH);
    }
}
