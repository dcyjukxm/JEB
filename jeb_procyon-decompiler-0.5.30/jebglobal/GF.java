// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class GF extends SelectionAdapter
{
    private /* synthetic */ Gq dN;
    
    GF(final Gq dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.dN.dN.ld(0);
    }
}
