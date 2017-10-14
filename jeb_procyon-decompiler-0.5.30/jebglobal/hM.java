// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
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
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

final class hM implements Listener
{
    private /* synthetic */ Gq dN;
    
    hM(final Gq dn) {
        this.dN = dn;
    }
    
    public void handleEvent(final Event event) {
        final Widget widget = event.widget;
        this.dN.BQ.setEnabled(widget instanceof StyledText && ((StyledText)widget).getEditable());
        this.dN.Ee.setEnabled(widget instanceof StyledText);
        this.dN.De.setEnabled(widget instanceof StyledText && ((StyledText)widget).getEditable());
        this.dN.rn.setEnabled(widget instanceof StyledText);
        final QW ld = this.dN.ld();
        this.dN.LR.setEnabled(ld != null);
        this.dN.Nh.setEnabled(ld != null);
    }
}
