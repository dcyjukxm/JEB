// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import java.io.File;
import org.eclipse.swt.widgets.Decorations;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.MenuItem;
import java.util.List;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class VZ extends SelectionAdapter
{
    private /* synthetic */ Gq dN;
    
    VZ(final Gq dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        new nS(selectionEvent.widget);
        if (selectionEvent.widget == this.dN.cb || selectionEvent.widget == this.dN.XZ) {
            this.dN.dN.ir();
        }
        else if (selectionEvent.widget == this.dN.PF) {
            this.dN.dN.dN(2);
        }
        else if (selectionEvent.widget == this.dN.rK) {
            this.dN.dN.QE(0);
        }
        else if (selectionEvent.widget == this.dN.Ux) {
            this.dN.dN.QE(1);
        }
        else if (selectionEvent.widget == this.dN.ZY) {
            this.dN.dN.QE(2);
        }
        else if (selectionEvent.widget == this.dN.s || selectionEvent.widget == this.dN.nA) {
            this.dN.dN.ld(false);
        }
        else if (selectionEvent.widget == this.dN.Hv) {
            this.dN.dN.ld(true);
        }
        else if (selectionEvent.widget == this.dN.VX) {
            this.dN.dN.QE(false);
        }
        else if (selectionEvent.widget == this.dN.ci) {
            this.dN.dN.QE(true);
        }
        else if (selectionEvent.widget == this.dN.bG) {
            this.dN.dN.rF();
        }
        else if (selectionEvent.widget == this.dN.BQ) {
            this.dN.dN.mS(rP.dN(new byte[] { 0, 26, 4, 13, 27, 7, 0, 72, 0, 69, 80, 23, 9, 73, 66, 25, 87, 92, 88, 0, 83, 92, 93, 92, 91, 69, 43, 82, 8, 13, 76, 17, 72, 4, 78, 0, 74, 2, 29, 0, 31, 17, 1, 83, 8, 9, 8, 71 }, 2, 142));
        }
        else if (selectionEvent.widget == this.dN.Ee) {
            final Control focusControl = Display.getCurrent().getFocusControl();
            if (focusControl instanceof StyledText) {
                ((StyledText)focusControl).copy();
            }
        }
        else if (selectionEvent.widget == this.dN.De) {
            final Control focusControl2 = Display.getCurrent().getFocusControl();
            if (focusControl2 instanceof StyledText) {
                ((StyledText)focusControl2).paste();
            }
        }
        else if (selectionEvent.widget == this.dN.rn) {
            final Control focusControl3 = Display.getCurrent().getFocusControl();
            if (focusControl3 instanceof StyledText) {
                ((StyledText)focusControl3).selectAll();
            }
        }
        else if (selectionEvent.widget == this.dN.Ai) {
            this.dN.wU();
        }
    }
}
