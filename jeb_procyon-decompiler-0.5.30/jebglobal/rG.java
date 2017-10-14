// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class rG extends SelectionAdapter
{
    private /* synthetic */ Gq dN;
    
    rG(final Gq dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.dN.zs();
    }
}
