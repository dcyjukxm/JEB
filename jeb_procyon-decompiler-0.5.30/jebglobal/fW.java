// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

public final class fW extends fL
{
    private QW dN;
    private oa ld;
    private Text QE;
    private Button wU;
    private Button fa;
    private Button zs;
    private Button mS;
    private Button OK;
    
    public fW(final Shell shell, final QW dn) {
        super(shell, "Find");
        this.dN = dn;
        this.ld = dn.dN();
        if (this.ld == null) {
            this.ld = new oa();
        }
    }
    
    @Override
    public Object ld() {
        super.ld();
        final oa ld = this.ld;
        return null;
    }
    
    @Override
    protected void dN(final Shell shell) {
        shell.setLayout((Layout)new RowLayout(512));
        final RowLayout rowLayout = new RowLayout();
        rowLayout.fill = true;
        rowLayout.wrap = false;
        rowLayout.pack = true;
        rowLayout.justify = true;
        rowLayout.type = 256;
        rowLayout.marginLeft = 5;
        rowLayout.marginTop = 5;
        rowLayout.marginRight = 5;
        rowLayout.marginBottom = 5;
        rowLayout.spacing = 5;
        final Composite composite = new Composite((Composite)shell, 0);
        composite.setLayout((Layout)rowLayout);
        final Composite composite2 = new Composite((Composite)shell, 0);
        composite2.setLayout((Layout)new RowLayout(512));
        final Composite composite3 = new Composite((Composite)shell, 0);
        composite3.setLayout((Layout)rowLayout);
        new Label(composite, 16896).setText("Search string:  ");
        final Composite composite4 = new Composite(composite, 0);
        composite4.setLayout((Layout)new RowLayout(512));
        this.QE = new Text(composite4, 2048);
        final GC gc = new GC((Drawable)this.QE);
        RowData layoutData;
        try {
            gc.setFont(this.QE.getFont());
            final FontMetrics fontMetrics = gc.getFontMetrics();
            layoutData = new RowData(30 * fontMetrics.getAverageCharWidth(), 1 * fontMetrics.getHeight());
        }
        finally {
            gc.dispose();
        }
        this.QE.setLayoutData((Object)layoutData);
        this.QE.setText(this.ld.dN);
        this.QE.selectAll();
        this.QE.pack(false);
        this.QE.addKeyListener((KeyListener)new xK(this));
        final Composite composite5 = new Composite(composite2, 0);
        composite5.setLayout((Layout)new RowLayout(256));
        (this.wU = new Button(composite5, 32)).setText("Case sensitive");
        this.wU.setSelection(this.ld.ld);
        (this.fa = new Button(composite5, 32)).setText("Reverse search");
        this.fa.setSelection(this.ld.QE);
        final Composite composite6 = new Composite(composite2, 0);
        composite6.setLayout((Layout)new RowLayout(256));
        (this.zs = new Button(composite6, 32)).setText("Wrap around");
        this.zs.setSelection(this.ld.wU);
        (this.mS = new Button(composite3, 8)).setText("  Find  ");
        this.mS.addSelectionListener((SelectionListener)new ar(this));
        (this.OK = new Button(composite3, 8)).setText("  Close  ");
        this.OK.addSelectionListener((SelectionListener)new dI(this, shell));
    }
    
    private void dN() {
        final String text = this.QE.getText();
        if (text.length() > 0) {
            this.ld.dN = text;
            this.ld.ld = this.wU.getSelection();
            this.ld.QE = this.fa.getSelection();
            this.ld.wU = this.zs.getSelection();
            this.dN.dN(this.ld);
        }
    }
}
