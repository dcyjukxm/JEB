// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import org.eclipse.swt.widgets.TreeItem;
import java.util.ArrayList;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.SelectionAdapter;

final class oS extends SelectionAdapter
{
    private /* synthetic */ Shell dN;
    private /* synthetic */ tg ld;
    
    oS(final tg ld, final Shell dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void widgetDefaultSelected(final SelectionEvent selectionEvent) {
        final Integer dn = (Integer)selectionEvent.item.getData();
        if (dn != null && dn != this.ld.fa) {
            this.ld.dN = dn;
            this.dN.close();
        }
    }
}
