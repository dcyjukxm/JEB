// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;

final class nY implements MouseListener
{
    private /* synthetic */ TH dN;
    private /* synthetic */ rl ld;
    
    nY(final rl ld, final TH dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void mouseUp(final MouseEvent mouseEvent) {
        try {
            if (this.dN.dN() == 0) {
                if (this.dN.mS()) {
                    this.ld.wU.setImage(this.ld.ld.dN("icon-media-pause.png"));
                    this.ld.QE.setEnabled(false);
                    this.ld.fa.setEnabled(false);
                }
            }
            else if (this.dN.dN() == 2 && this.dN.OK()) {
                this.ld.wU.setImage(this.ld.ld.dN("icon-media-play.png"));
                this.ld.QE.setEnabled(true);
                this.ld.fa.setEnabled(true);
            }
        }
        catch (Exception ex) {
            cn.dN("Audio error");
        }
    }
    
    public void mouseDown(final MouseEvent mouseEvent) {
    }
    
    public void mouseDoubleClick(final MouseEvent mouseEvent) {
    }
}
