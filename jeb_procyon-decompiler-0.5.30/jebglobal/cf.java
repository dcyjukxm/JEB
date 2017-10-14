// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
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
import java.util.Iterator;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class cf extends SelectionAdapter
{
    private /* synthetic */ Gq dN;
    
    cf(final Gq dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        for (final Vt vt : this.dN.ir.values()) {
            if (vt.dN(selectionEvent.widget)) {
                for (final as as : vt.dN()) {
                    if (as.dN() == null || as.dN().Hv()) {
                        as.LH();
                    }
                }
            }
        }
    }
}
