// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class cG extends SelectionAdapter
{
    private /* synthetic */ Co dN;
    
    cG(final Co dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final CTabItem selection = this.dN.dN.getSelection();
        for (final Co.uK uk : this.dN.ld) {
            if (uk.QE == selection) {
                if (!uk.ld.setFocus()) {
                    (new Object[1])[0] = uk.ld;
                }
            }
        }
    }
}
