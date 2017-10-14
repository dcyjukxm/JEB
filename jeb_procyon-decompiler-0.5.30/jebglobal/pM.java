// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolTip;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.widgets.Canvas;

final class pM implements lW.uK
{
    private /* synthetic */ rn dN;
    
    pM(final rn dn) {
        this.dN = dn;
    }
    
    @Override
    public void dN(final int n) {
        if (this.dN.QE != n) {
            this.dN.QE = n;
            this.dN.dN();
        }
    }
}
