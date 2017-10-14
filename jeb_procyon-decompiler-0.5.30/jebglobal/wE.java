// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.SelectionAdapter;

final class wE extends SelectionAdapter
{
    private /* synthetic */ Shell dN;
    private /* synthetic */ C ld;
    
    wE(final C ld, final Shell dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.ld.dN = true;
        this.dN.close();
    }
}
