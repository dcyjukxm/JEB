// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;

public final class JZ extends Composite implements QH
{
    private Text dN;
    
    public JZ(final Composite composite, final String text, final String text2, final int n) {
        super(composite, 0);
        this.setLayout((Layout)new GridLayout(2, false));
        this.dN = new Text((Composite)this, 2052);
        if (text2 != null) {
            this.dN.setText(text2);
        }
        if (n >= 1) {
            final GC gc = new GC((Drawable)this.dN);
            GridData layoutData;
            try {
                gc.setFont(this.dN.getFont());
                final FontMetrics fontMetrics = gc.getFontMetrics();
                layoutData = new GridData(n * fontMetrics.getAverageCharWidth(), 1 * fontMetrics.getHeight());
            }
            finally {
                gc.dispose();
            }
            this.dN.setLayoutData((Object)layoutData);
        }
        final Label label = new Label((Composite)this, 0);
        if (text != null) {
            label.setText(text);
        }
    }
    
    public String dN() {
        return this.dN.getText();
    }
}
