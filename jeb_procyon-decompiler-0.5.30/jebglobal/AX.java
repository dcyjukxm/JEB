// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class AX extends SelectionAdapter
{
    private /* synthetic */ Gq dN;
    
    AX(final Gq dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final QW ld = this.dN.ld();
        if (ld != null) {
            ld.dN(null);
        }
    }
}
