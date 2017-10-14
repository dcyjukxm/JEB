// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;

final class Qv implements MouseListener
{
    private /* synthetic */ C.uK dN;
    
    Qv(final C.uK dn, final C c) {
        this.dN = dn;
    }
    
    public void mouseUp(final MouseEvent mouseEvent) {
        final ColorDialog colorDialog = new ColorDialog(this.dN.getShell());
        colorDialog.setRGB(this.dN.dN.getBackground().getRGB());
        final RGB open = colorDialog.open();
        if (open != null) {
            this.dN.dN.setBackground(HC.dN().dN(open));
            this.dN.notifyListeners(13, new Event());
        }
    }
    
    public void mouseDown(final MouseEvent mouseEvent) {
    }
    
    public void mouseDoubleClick(final MouseEvent mouseEvent) {
    }
}
