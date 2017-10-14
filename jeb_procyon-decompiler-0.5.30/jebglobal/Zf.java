// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Text;

public final class Zf extends fL
{
    private Text dN;
    private String ld;
    private Font QE;
    private String wU;
    
    public Zf(final Shell shell, final Font qe, final String wu) {
        super(shell, "Jump to");
        this.QE = qe;
        this.wU = wu;
    }
    
    public String dN() {
        super.ld();
        return this.ld;
    }
    
    public void dN(final Shell shell) {
        shell.setLayout((Layout)new RowLayout(512));
        (this.dN = TM.dN((Composite)shell, 30, this.wU, null)).setFont(this.QE);
        final Composite composite = new Composite((Composite)shell, 0);
        composite.setLayout((Layout)new RowLayout(256));
        final Button dn = TM.dN(composite, "OK", (SelectionListener)new UG(this, shell));
        TM.dN(composite, "Cancel", (SelectionListener)new vb(this, shell));
        shell.setDefaultButton(dn);
    }
}
