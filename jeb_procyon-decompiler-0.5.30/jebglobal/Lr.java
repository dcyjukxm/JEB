// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class Lr extends SelectionAdapter
{
    private /* synthetic */ C dN;
    
    Lr(final C dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.dN.ld.dN(((C.uK)selectionEvent.widget).dN());
    }
}
