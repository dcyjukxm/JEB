// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class Eo extends SelectionAdapter
{
    private /* synthetic */ QV dN;
    
    Eo(final Gq gq, final QV dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.dN.dN.dN(this.dN.ld, true);
    }
}
