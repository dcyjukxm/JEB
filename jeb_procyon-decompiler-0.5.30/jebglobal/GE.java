// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public final class GE extends fL
{
    private Shell dN;
    private Xp ld;
    private boolean QE;
    private boolean wU;
    private String fa;
    
    public GE(final Shell shell, final Xp ld, final String s, final String fa) {
        super(shell, s);
        if (ld == null || fa == null) {
            throw new RuntimeException();
        }
        this.ld = ld;
        this.fa = fa;
    }
    
    public Boolean dN() {
        super.ld();
        return this.QE;
    }
    
    public void dN(final Shell dn) {
        dn.addListener(31, (Listener)new eN(this));
        dn.addListener(21, (Listener)new vy(this));
        dn.setLayout((Layout)new RowLayout(512));
        final Composite composite = new Composite((Composite)dn, 0);
        composite.setLayout((Layout)new GridLayout(1, false));
        final Composite composite2 = new Composite((Composite)dn, 0);
        composite2.setLayout((Layout)new RowLayout(256));
        new Label(composite, 0).setText(this.fa);
        dn.setDefaultButton(TM.dN(composite2, "Stop", (SelectionListener)new sC(this)));
        this.dN = dn;
    }
    
    public void QE() {
        if (this.dN != null && !this.dN.isDisposed()) {
            this.wU = true;
            this.dN.close();
        }
    }
}
