// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Date;
import java.util.Calendar;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

final class oB implements Listener
{
    private /* synthetic */ ND dN;
    
    oB(final ND dn) {
        this.dN = dn;
    }
    
    public void handleEvent(final Event event) {
        if (!this.dN.QE) {
            event.doit = false;
        }
    }
}
