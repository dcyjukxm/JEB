// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;
import java.io.IOException;
import java.io.File;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class LA extends SelectionAdapter
{
    private /* synthetic */ qG dN;
    
    LA(final qG dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final DirectoryDialog directoryDialog = new DirectoryDialog(this.dN.getShell());
        directoryDialog.setMessage("Directory");
        String filterPath = this.dN.dN.getText();
        if (filterPath != null && !new File(filterPath).isAbsolute()) {
            try {
                filterPath = new File(eI.OK(), filterPath).getCanonicalPath();
            }
            catch (IOException ex) {}
        }
        if (filterPath != null) {
            directoryDialog.setFilterPath(filterPath);
        }
        final String open = directoryDialog.open();
        if (open != null) {
            this.dN.dN.setText(open);
        }
    }
}
