// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public final class v extends Composite implements QH
{
    private Button dN;
    
    public v(final Composite composite, final String text, final boolean selection) {
        super(composite, 32);
        final GridLayout layout = new GridLayout(1, false);
        layout.marginHeight = 0;
        layout.verticalSpacing = 0;
        layout.marginWidth = 0;
        layout.horizontalSpacing = 0;
        this.setLayout((Layout)layout);
        this.dN = new Button(composite, 32);
        if (text != null) {
            this.dN.setText(text);
        }
        this.dN.setSelection(selection);
    }
    
    public String dN() {
        return Boolean.toString(this.dN.getSelection());
    }
}
