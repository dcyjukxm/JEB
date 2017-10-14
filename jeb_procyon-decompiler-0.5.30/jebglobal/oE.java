// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.SelectionAdapter;

final class oE extends SelectionAdapter
{
    private /* synthetic */ Shell dN;
    
    oE(final JK jk, final Shell dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.dN.close();
    }
}
