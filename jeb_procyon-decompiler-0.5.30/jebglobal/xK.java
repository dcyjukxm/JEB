// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.events.SelectionListener;
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
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;

final class xK implements KeyListener
{
    private /* synthetic */ fW dN;
    
    xK(final fW dn) {
        this.dN = dn;
    }
    
    public void keyPressed(final KeyEvent keyEvent) {
        if (keyEvent.character == '\r') {
            this.dN.dN();
        }
    }
    
    public void keyReleased(final KeyEvent keyEvent) {
    }
}
