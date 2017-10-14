// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;

final class Dh extends SelectionAdapter
{
    private /* synthetic */ Text dN;
    private /* synthetic */ Shell ld;
    private /* synthetic */ Xa QE;
    
    Dh(final Xa qe, final Text dn, final Shell ld) {
        this.QE = qe;
        this.dN = dn;
        this.ld = ld;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.QE.ld = this.dN.getText();
        this.ld.close();
    }
}
