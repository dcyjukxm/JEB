// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class zp extends SelectionAdapter
{
    private /* synthetic */ fc.uK[] dN;
    private /* synthetic */ C ld;
    
    zp(final C ld, final fc.uK[] dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.ld.ld.ld(this.dN[this.ld.QE.getSelectionIndex()]).QE = ((Button)selectionEvent.widget).getSelection();
    }
}
