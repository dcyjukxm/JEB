// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public final class xh
{
    private MenuItem dN;
    private Menu ld;
    private String QE;
    private Image wU;
    private SelectionListener fa;
    
    public xh(final Menu ld, final String qe, final Image wu, final SelectionListener fa) {
        if (ld == null || qe == null || fa == null) {
            throw new RuntimeException();
        }
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
    }
    
    public MenuItem dN() {
        return this.dN;
    }
    
    public void ld() {
        if (this.dN != null) {
            this.dN.dispose();
            this.dN = null;
        }
    }
    
    public void dN(final boolean b) {
        this.ld(b);
    }
    
    void ld(final boolean enabled) {
        if (this.dN == null) {
            (this.dN = new MenuItem(this.ld, 0)).setText(this.QE);
            this.dN.setImage(this.wU);
            this.dN.addSelectionListener(this.fa);
        }
        this.dN.setEnabled(enabled);
    }
}
