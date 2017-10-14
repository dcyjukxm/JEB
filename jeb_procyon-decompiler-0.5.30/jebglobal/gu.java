// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;

final class gu implements DisposeListener
{
    private /* synthetic */ yn dN;
    
    gu(final yn dn) {
        this.dN = dn;
    }
    
    public void widgetDisposed(final DisposeEvent disposeEvent) {
        this.dN.ld();
    }
}
