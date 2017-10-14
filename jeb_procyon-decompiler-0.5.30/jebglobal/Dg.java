// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;

public final class Dg extends Composite implements QH
{
    private Text dN;
    
    public Dg(final Composite composite, final String text, final String text2) {
        super(composite, 0);
        this.setLayout((Layout)new GridLayout(1, false));
        final Label label = new Label((Composite)this, 0);
        if (text != null) {
            label.setText(text);
        }
        final GridData layoutData = new GridData();
        layoutData.horizontalAlignment = 4;
        layoutData.grabExcessHorizontalSpace = true;
        label.setLayoutData((Object)layoutData);
        this.dN = new Text((Composite)this, 2052);
        if (text2 != null) {
            this.dN.setText(text2);
        }
        final GridData layoutData2 = new GridData();
        layoutData2.horizontalAlignment = 4;
        layoutData2.grabExcessHorizontalSpace = true;
        this.dN.setLayoutData((Object)layoutData2);
    }
    
    public String dN() {
        return this.dN.getText();
    }
}
