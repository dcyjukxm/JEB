// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.custom.CTabFolder;
import java.util.HashMap;
import java.util.Iterator;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.events.SelectionAdapter;

final class Kw extends SelectionAdapter
{
    private /* synthetic */ Shell dN;
    private /* synthetic */ Dp ld;
    
    Kw(final Dp ld, final Shell dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final Iterator<WV> iterator = Dp.dN.keySet().iterator();
        while (iterator.hasNext()) {
            final DE de = Dp.dN.get(iterator.next());
            if (de.dN(this.ld.ld)) {
                this.ld.zs.dN.add(de.dN());
            }
        }
        if (this.ld.wU != null) {
            this.ld.ld.dN(WV.rn, this.ld.wU.toString());
        }
        if (this.ld.ld.QE(WV.De) < 0) {
            this.ld.ld.dN(WV.De, 0);
        }
        this.ld.ld.dN();
        this.ld.fa = true;
        this.dN.close();
    }
}
