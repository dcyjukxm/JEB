// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Shell;

public final class JK extends fL
{
    public JK(final Shell shell) {
        super(shell, "About JEB");
    }
    
    @Override
    public Object ld() {
        super.ld();
        return null;
    }
    
    public void dN(final Shell shell) {
        final Color systemColor = shell.getDisplay().getSystemColor(1);
        shell.setLayout((Layout)new RowLayout(512));
        shell.setBackground(systemColor);
        final Label label = new Label((Composite)shell, 0);
        label.setText(" ");
        label.setBackground(systemColor);
        final Composite composite = new Composite((Composite)shell, 0);
        composite.setLayout((Layout)new RowLayout(256));
        composite.setBackground(systemColor);
        final Label label2 = new Label(composite, 0);
        label2.setBackground(shell.getDisplay().getSystemColor(1));
        label2.setImage(HC.dN().dN("icon-jeb-48.png"));
        final Label label3 = new Label(composite, 0);
        label3.setText("    ");
        label3.setBackground(systemColor);
        final Label label4 = new Label(composite, 0);
        label4.setBackground(systemColor);
        label4.setText(this.dN());
        label4.pack();
        final Point size = label4.getSize();
        label4.setLayoutData((Object)new RowData(size.x + 20, size.y + 30));
        final Composite composite2 = new Composite((Composite)shell, 0);
        composite2.setLayout((Layout)new RowLayout(256));
        composite2.setBackground(systemColor);
        final Button dn = TM.dN(composite2, "OK", (SelectionListener)new oE(this, shell));
        TM.dN(composite2, "Website", (SelectionListener)new DB(this));
        shell.setDefaultButton(dn);
    }
    
    private String dN() {
        final StringBuffer sb = new StringBuffer();
        sb.append(String.format("%s - %s\n%s (c) %s\n\nVersion: %s\n", "JEB", "The Interactive Android Decompiler", "PNF Software", "2013-2014", yW.dN.toString()));
        sb.append('\n');
        sb.append(eI.BQ());
        sb.append(String.format("\n%s", "A copy of the End-User License Agreement\ncan be found in the installation folder.\n"));
        sb.append(String.format("\n%s", "Third-party software used by JEB:\n- Eclipse SWT (Eclipse Public License)\n- Apache Commons IO (Apache License 2.0)\n- APKTool (Apache License 2.0)\n- Android Framework Resources (Apache License 2.0)\n- Jython (Python Software Foundation License 2.0)"));
        return sb.toString();
    }
}
