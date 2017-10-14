// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Dialog;

public abstract class fL extends Dialog
{
    public fL(final Shell shell, final String text, final int n) {
        super(shell, n);
        if (text != null) {
            this.setText(text);
        }
    }
    
    public fL(final Shell shell, final String s) {
        this(shell, s, 67680);
    }
    
    public Object ld() {
        final Shell parent = this.getParent();
        final Rectangle bounds = parent.getBounds();
        final int x = (int)(0.9 * bounds.width);
        final int y = (int)(0.9 * bounds.height);
        final Shell shell = new Shell(parent, this.getStyle());
        shell.setSize(x, y);
        shell.setText(this.getText());
        this.dN(shell);
        shell.pack();
        final Point size = shell.getSize();
        if (size.x > x) {
            size.x = x;
        }
        if (size.y > y) {
            size.y = y;
        }
        shell.setSize(size);
        final Point size2 = shell.getSize();
        shell.setLocation(bounds.x + (bounds.width - size2.x) / 2, bounds.y + (bounds.height - size2.y) / 2);
        shell.open();
        final Display display = parent.getDisplay();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        return null;
    }
    
    protected abstract void dN(final Shell p0);
}
