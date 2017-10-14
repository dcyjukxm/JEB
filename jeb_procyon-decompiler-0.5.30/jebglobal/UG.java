// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.SelectionAdapter;

final class UG extends SelectionAdapter
{
    private /* synthetic */ Shell dN;
    private /* synthetic */ Zf ld;
    
    UG(final Zf ld, final Shell dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.ld.ld = this.ld.dN.getText();
        this.dN.close();
    }
}
