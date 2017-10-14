// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class un extends SelectionAdapter
{
    private /* synthetic */ fc.uK[] dN;
    private /* synthetic */ C ld;
    
    un(final C ld, final fc.uK[] dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.ld.ld.ld(this.dN[this.ld.QE.getSelectionIndex()]).ld = ((C.uK)selectionEvent.widget).dN();
    }
}
