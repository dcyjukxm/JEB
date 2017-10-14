// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Font;

public final class dh extends fL
{
    private String dN;
    private Font ld;
    private int QE;
    private String wU;
    private String fa;
    
    public dh(final Shell shell, final Font ld, final int qe, final String s, final String wu, final String fa) {
        super(shell, s);
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
    }
    
    public String dN() {
        super.ld();
        if (this.dN == null) {
            return null;
        }
        return this.dN;
    }
    
    public void dN(final Shell shell) {
        shell.setLayout((Layout)new RowLayout(512));
        final Composite composite = new Composite((Composite)shell, 0);
        composite.setLayout((Layout)new GridLayout(1, false));
        final Composite composite2 = new Composite((Composite)shell, 0);
        composite2.setLayout((Layout)new RowLayout(256));
        if (this.wU != null) {
            new Label(composite, 0).setText(this.wU);
        }
        Text text;
        if (this.QE >= 2) {
            text = new Text(composite, 2626);
        }
        else {
            text = new Text(composite, 2052);
        }
        text.setFont(this.ld);
        final GC gc = new GC((Drawable)text);
        GridData layoutData;
        try {
            gc.setFont(text.getFont());
            layoutData = new GridData(200, this.QE * gc.getFontMetrics().getHeight());
        }
        finally {
            gc.dispose();
        }
        text.setLayoutData((Object)layoutData);
        if (this.fa != null) {
            text.setText(this.fa);
        }
        text.selectAll();
        final Button dn = TM.dN(composite2, "OK", (SelectionListener)new fx(this, text, shell));
        TM.dN(composite2, "Cancel", (SelectionListener)new FS(this, shell));
        shell.setDefaultButton(dn);
    }
}
