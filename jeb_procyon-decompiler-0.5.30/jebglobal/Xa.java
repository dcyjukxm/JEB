// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.graphics.Font;

public class Xa extends fL
{
    private String ld;
    private Font QE;
    private int wU;
    private int fa;
    private boolean zs;
    private boolean mS;
    private String OK;
    private String LH;
    private String KK;
    protected Button dN;
    
    public Xa(final Shell shell, final Font qe, final String s, final String ok) {
        super(shell, s);
        this.QE = qe;
        this.wU = 1;
        this.fa = 20;
        this.zs = true;
        this.mS = false;
        this.OK = ok;
        this.LH = "OK";
        this.KK = "Cancel";
    }
    
    public void dN(final String ok) {
        this.OK = ok;
    }
    
    public void dN(final int wu) {
        this.wU = wu;
    }
    
    public void ld(final int fa) {
        this.fa = fa;
    }
    
    public void dN(final boolean zs) {
        this.zs = zs;
    }
    
    public void ld(final boolean ms) {
        this.mS = ms;
    }
    
    public void ld(final String lh) {
        this.LH = lh;
    }
    
    public void QE(final String kk) {
        this.KK = kk;
    }
    
    public String dN() {
        super.ld();
        return this.ld;
    }
    
    public void dN(final Shell shell) {
        shell.setLayout((Layout)new RowLayout(512));
        final Composite composite = new Composite((Composite)shell, 0);
        composite.setLayout((Layout)new GridLayout(1, true));
        new GridData();
        Text text;
        if (this.wU >= 2) {
            text = new Text(composite, 2626);
        }
        else {
            text = new Text(composite, 2052);
        }
        text.setFont(this.QE);
        final GC gc = new GC((Drawable)text);
        GridData layoutData;
        try {
            gc.setFont(text.getFont());
            final FontMetrics fontMetrics = gc.getFontMetrics();
            layoutData = new GridData(this.fa * fontMetrics.getAverageCharWidth(), this.wU * fontMetrics.getHeight());
        }
        finally {
            gc.dispose();
        }
        text.setLayoutData((Object)layoutData);
        text.setText(this.OK);
        text.setEditable(this.zs);
        if (this.mS) {
            text.selectAll();
        }
        text.addTraverseListener((TraverseListener)new DZ(this));
        final Composite composite2 = new Composite((Composite)shell, 0);
        composite2.setLayout((Layout)new RowLayout(256));
        if (this.LH != null) {
            shell.setDefaultButton(this.dN = TM.dN(composite2, this.LH, (SelectionListener)new Dh(this, text, shell)));
        }
        if (this.KK != null) {
            TM.dN(composite2, this.KK, (SelectionListener)new pb(this, shell));
        }
    }
}
