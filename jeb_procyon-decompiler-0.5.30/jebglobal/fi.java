// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class fi extends SelectionAdapter
{
    private /* synthetic */ lW dN;
    
    fi(final lW dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.dN.VX();
    }
}
