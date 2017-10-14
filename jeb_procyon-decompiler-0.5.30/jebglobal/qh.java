// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;

final class qh implements Runnable
{
    private /* synthetic */ rl dN;
    
    qh(final rl dn) {
        this.dN = dn;
    }
    
    @Override
    public void run() {
        this.dN.wU.setImage(this.dN.ld.dN("icon-media-play.png"));
        this.dN.QE.setEnabled(true);
        this.dN.fa.setEnabled(true);
    }
}
