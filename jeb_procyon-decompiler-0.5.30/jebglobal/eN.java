// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

final class eN implements Listener
{
    eN(final GE ge) {
    }
    
    public void handleEvent(final Event event) {
        if (event.detail == 2) {
            event.doit = false;
        }
    }
}
