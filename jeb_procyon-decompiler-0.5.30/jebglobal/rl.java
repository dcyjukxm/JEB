// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;

public final class rl extends Composite implements SA
{
    private TH dN;
    private HC ld;
    private Label QE;
    private Label wU;
    private Label fa;
    
    public rl(final Composite composite, final TH dn) {
        super(composite, 0);
        this.setLayout((Layout)new RowLayout(256));
        (this.dN = dn).dN(this);
        this.ld = HC.dN();
        this.QE = new Label((Composite)this, 0);
        this.wU = new Label((Composite)this, 0);
        this.fa = new Label((Composite)this, 0);
        this.QE.setImage(this.ld.dN("icon-media-record.png"));
        this.QE.addMouseListener((MouseListener)new Ln(this, dn));
        this.wU.setImage(this.ld.dN("icon-media-play.png"));
        this.wU.setEnabled(dn.ld());
        this.wU.addMouseListener((MouseListener)new nY(this, dn));
        this.fa.setImage(this.ld.dN("icon-delete.png"));
        this.fa.setEnabled(dn.ld());
        this.fa.addMouseListener((MouseListener)new Lf(this, dn));
    }
    
    public void dN(final int n, final int n2) {
        if (n == 2 && n2 == 0) {
            Display.getDefault().syncExec((Runnable)new qh(this));
        }
    }
    
    public void dispose() {
        this.dN.ld(this);
        try {
            this.dN.wU();
        }
        catch (Exception ex) {}
        this.dN.dN(0, -1L);
        super.dispose();
    }
}
