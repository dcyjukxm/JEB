// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Control;
import java.io.IOException;
import java.io.File;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

final class Yv implements SelectionListener
{
    private /* synthetic */ NB dN;
    
    Yv(final NB dn) {
        this.dN = dn;
    }
    
    public void widgetDefaultSelected(final SelectionEvent selectionEvent) {
        final TreeItem treeItem = (TreeItem)selectionEvent.item;
        if (treeItem == null) {
            return;
        }
        treeItem.setExpanded(!treeItem.getExpanded());
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final TreeItem treeItem = (TreeItem)selectionEvent.item;
        if (treeItem == null) {
            return;
        }
        final File file = (File)treeItem.getData();
        final Control[] children = this.dN.ld.getChildren();
        for (int length = children.length, i = 0; i < length; ++i) {
            children[i].dispose();
        }
        if (file.isDirectory()) {
            return;
        }
        final String absolutePath = file.getAbsolutePath();
        switch (NB.NB$1.dN[HJ.dN(absolutePath).ordinal()]) {
            case 1: {
                final tS ts = new tS(this.dN.ld, this.dN.dN);
                ts.ld(absolutePath);
                ts.dN(false);
                break;
            }
            case 2: {
                new qS(this.dN.ld, file);
                break;
            }
            case 3:
            case 4: {
                final lW lw = new lW(this.dN.ld, this.dN.QE, false);
                try {
                    lw.QE(new String(TM.QE(file)));
                }
                catch (IOException ex) {}
                break;
            }
            default: {
                final DM dm = new DM(this.dN.ld, this.dN.QE);
                try {
                    dm.dN(TM.QE(file));
                }
                catch (IOException ex2) {}
                break;
            }
        }
        this.dN.ld.layout();
    }
}
