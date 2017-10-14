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
import org.eclipse.swt.widgets.Listener;
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

final class Kk implements Runnable
{
    final /* synthetic */ yW dN;
    
    Kk(final yW dn) {
        this.dN = dn;
    }
    
    @Override
    public void run() {
        while (true) {
            while (true) {
                try {
                    int qe;
                    while (true) {
                        qe = this.dN.rK.QE(WV.De);
                        if (qe > 0) {
                            break;
                        }
                        Thread.sleep(60000L);
                    }
                    Thread.sleep(qe * 60 * 1000);
                }
                catch (InterruptedException ex) {
                    break;
                }
                this.dN.s.syncExec((Runnable)new Uj(this));
                continue;
            }
        }
    }
}
