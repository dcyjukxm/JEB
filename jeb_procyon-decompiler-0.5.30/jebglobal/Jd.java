// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.ArrayList;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

final class Jd extends SelectionAdapter
{
    private /* synthetic */ tg dN;
    
    Jd(final tg dn) {
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final TreeItem[] selection = this.dN.ld.getSelection();
        if (selection != null && selection.length == 1) {
            final Integer n = (Integer)selection[0].getData();
            if (n != null && n != this.dN.fa) {
                this.dN.fa = n;
                this.dN.ld.removeAll();
                this.dN.QE();
            }
        }
    }
}
