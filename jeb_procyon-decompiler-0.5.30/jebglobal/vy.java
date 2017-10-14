// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

final class vy implements Listener
{
    private /* synthetic */ GE dN;
    
    vy(final GE dn) {
        this.dN = dn;
    }
    
    public void handleEvent(final Event event) {
        if (!this.dN.wU) {
            event.doit = false;
        }
    }
}
