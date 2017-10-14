// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.GridLayout;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.SelectionAdapter;

final class yA extends SelectionAdapter
{
    private /* synthetic */ Shell dN;
    private /* synthetic */ Ss ld;
    
    yA(final Ss ld, final Shell dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void widgetDefaultSelected(final SelectionEvent selectionEvent) {
        this.ld.zs = this.ld.mS.QE();
        this.dN.close();
    }
}
