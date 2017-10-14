// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class AO extends SelectionAdapter
{
    private /* synthetic */ l dN;
    
    AO(final l dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.dN.EO();
    }
}
