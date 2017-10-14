// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.FontData;
import java.util.Iterator;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FormLayout;
import java.util.ArrayList;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import java.util.List;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

final class AQ implements Listener
{
    private /* synthetic */ yW dN;
    
    AQ(final yW dn) {
        this.dN = dn;
    }
    
    public void handleEvent(final Event event) {
        if (this.dN.Nh.s() && !this.dN.Nh.dN(2)) {
            event.doit = false;
            return;
        }
        this.dN.nb();
        if (this.dN.bG != null) {
            this.dN.rK.dN(WV.KK, this.dN.bG.getSize().x);
            this.dN.rK.dN(WV.EO, this.dN.bG.getSize().y);
            this.dN.rK.dN(WV.cb, this.dN.bG.getMaximized());
        }
        if (this.dN.De != null) {
            final int[] weights = this.dN.De.getWeights();
            if (weights != null && weights.length == 2) {
                this.dN.rK.dN(WV.PF, 100 * weights[1] / (weights[0] + weights[1]));
            }
        }
        this.dN.rK.dN();
    }
}
