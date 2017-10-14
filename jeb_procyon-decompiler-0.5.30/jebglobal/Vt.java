// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import org.eclipse.swt.widgets.Widget;
import java.util.ArrayList;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.MenuItem;

public final class Vt
{
    private MenuItem dN;
    private ToolItem ld;
    private ArrayList QE;
    private ArrayList wU;
    
    public Vt(final MenuItem dn, final ToolItem ld) {
        this.QE = new ArrayList();
        this.wU = new ArrayList();
        this.dN = dn;
        this.ld = ld;
    }
    
    public ArrayList dN() {
        return this.wU;
    }
    
    public void dN(final as as) {
        if (as == null) {
            throw new RuntimeException();
        }
        this.wU.add(as);
    }
    
    public MenuItem ld() {
        return this.dN;
    }
    
    public ToolItem QE() {
        return this.ld;
    }
    
    public ArrayList wU() {
        return this.QE;
    }
    
    public void dN(final xh xh) {
        if (xh == null) {
            throw new RuntimeException();
        }
        this.QE.add(xh);
    }
    
    public boolean dN(final Widget widget) {
        if (widget == this.dN || widget == this.ld) {
            return true;
        }
        final Iterator<xh> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            if (widget == iterator.next().dN()) {
                return true;
            }
        }
        return false;
    }
    
    public void dN(final boolean b) {
        if (this.dN != null) {
            this.dN.setEnabled(b);
        }
        if (this.ld != null) {
            this.ld.setEnabled(b);
        }
        final Iterator<xh> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            iterator.next().dN(b);
        }
    }
}
