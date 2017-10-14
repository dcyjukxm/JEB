// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.CTabFolder;
import java.util.HashMap;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.SelectionAdapter;

final class Tq extends SelectionAdapter
{
    private /* synthetic */ Shell dN;
    private /* synthetic */ Dp ld;
    
    Tq(final Dp ld, final Shell dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final FontDialog fontDialog = new FontDialog(this.dN);
        final FontData[] fontList = { null };
        if (this.ld.wU == null) {
            try {
                this.ld.wU = new FontData(this.ld.ld.dN(WV.rn));
            }
            catch (Exception ex) {}
        }
        fontList[0] = this.ld.wU;
        fontDialog.setFontList(fontList);
        final FontData open = fontDialog.open();
        if (open != null) {
            this.ld.wU = open;
        }
    }
}
