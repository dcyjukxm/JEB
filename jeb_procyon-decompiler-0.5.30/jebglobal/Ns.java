// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolTip;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Canvas;

final class Ns implements lW.uK
{
    private /* synthetic */ vh dN;
    
    Ns(final vh dn) {
        this.dN = dn;
    }
    
    @Override
    public void dN(final int n) {
        final int n2 = this.dN.getClientArea().width * n / this.dN.dN.BQ();
        if (n2 != this.dN.ld) {
            this.dN.ld = n2;
            this.dN.redraw();
        }
    }
}
