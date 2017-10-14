// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Font;

public final class Qq extends fL
{
    private String dN;
    private Font ld;
    private String QE;
    
    public Qq(final Shell shell, final Font ld, final String qe) {
        super(shell, "JEB");
        this.ld = ld;
        this.QE = qe;
    }
    
    public String dN() {
        super.ld();
        if (this.dN == null) {
            return null;
        }
        return this.dN;
    }
    
    public void dN(final Shell shell) {
        final String format = String.format(rP.dN(new byte[] { -49, 66, 45, 9, 0, 3, 79, 5, 86, 93, 14, 121, 54, 26, 85, 78, 11, 0, 1, 68, 65, 65, 76, 5, 10, 6, 11, 29, 22, 69, 75, 14, 28, 89, 84, 27, 79, 85, 6, 22, 69, 106, 15, 7, 108, 14, 116, 60, 1, 26, 83, 79, 1, 11, 72, 89, 29, 4, 8, 69, 79, 31, 21, 23, 19, 21, 29, 6, 1, 78, 87, 30, 5, 0, 76, 79, 1, 2, 21, 89, 84, 21, 10, 14, 69, 65, 65, 70, 3, 18, 87, 83, 22, 6, 12, 1, 10, 23, 93, 36, 0, 90, 60, 9, 4, 18, 22, 69, 86, 31, 26, 26, 29, 84, 5, 86, 95, 12, 65, 15, 10, 68, 85, 6, 22, 69, 84, 28, 13, 69, 70, 9, 3, 0, 3, 24, 30, 7, 9, 71, 2, 78, 5, 10, 6, 11, 29, 22, 69, 68, 5, 21, 21, 67, 2, 66, 14, 3, 13, 66, 84, 27, 79, 71, 2, 11, 11, 23, 19, 21, 17, 69, 65, 65, 75, 14, 28, 87, 36 }, 1, 197), "              ", "http://www.android-decompiler.com/genlk.php");
        shell.setLayout((Layout)new RowLayout(512));
        new Label((Composite)shell, 0).setText(format);
        final Composite composite = new Composite((Composite)shell, 0);
        composite.setLayout((Layout)new RowLayout(256));
        TM.dN(composite, rP.dN(new byte[] { -93, 63, 21, 11, 78, 73, 7, 78, 66, 16, 29, 24, 4, 22, 23 }, 1, 236), (SelectionListener)new vw(this));
        new Label((Composite)shell, 0).setText(rP.dN(new byte[] { 95, 70, 37, 10, 6, 11, 29, 22, 69, 68, 5, 21, 21, 91, 26 }, 1, 85));
        final Composite composite2 = new Composite((Composite)shell, 0);
        composite2.setLayout((Layout)new GridLayout(1, false));
        final Text text = new Text(composite2, 2060);
        text.setFont(this.ld);
        final GC gc = new GC((Drawable)text);
        GridData layoutData;
        try {
            gc.setFont(text.getFont());
            final FontMetrics fontMetrics = gc.getFontMetrics();
            layoutData = new GridData(70 * fontMetrics.getAverageCharWidth(), fontMetrics.getHeight());
        }
        finally {
            gc.dispose();
        }
        text.setLayoutData((Object)layoutData);
        text.setText(this.QE);
        text.selectAll();
        new Label((Composite)shell, 0).setText(rP.dN(new byte[] { -51, 37, 10, 6, 11, 29, 22, 69, 75, 14, 28, 67, 26 }, 1, 129));
        final Composite composite3 = new Composite((Composite)shell, 0);
        composite3.setLayout((Layout)new GridLayout(1, false));
        final Text text2 = new Text(composite3, 2052);
        text2.setFont(this.ld);
        final GC gc2 = new GC((Drawable)text2);
        GridData layoutData2;
        try {
            gc2.setFont(text2.getFont());
            final FontMetrics fontMetrics2 = gc2.getFontMetrics();
            layoutData2 = new GridData(30 * fontMetrics2.getAverageCharWidth(), fontMetrics2.getHeight());
        }
        finally {
            gc2.dispose();
        }
        text2.setLayoutData((Object)layoutData2);
        text2.selectAll();
        final Composite composite4 = new Composite((Composite)shell, 0);
        composite4.setLayout((Layout)new RowLayout(256));
        final Button dn = TM.dN(composite4, "OK", (SelectionListener)new Nu(this, text2, shell));
        TM.dN(composite4, "Cancel", (SelectionListener)new jR(this, shell));
        shell.setDefaultButton(dn);
    }
}
