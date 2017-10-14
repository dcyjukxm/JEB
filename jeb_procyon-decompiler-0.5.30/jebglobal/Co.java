// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.custom.CTabItem;
import java.util.Iterator;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.events.SelectionListener;
import java.util.ArrayList;
import org.eclipse.swt.widgets.Composite;
import java.util.List;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Listener;

public final class Co implements CTabFolder2Listener
{
    CTabFolder dN;
    private List QE;
    List ld;
    
    public Co(final Composite composite) {
        this(composite, true);
    }
    
    public Co(final Composite composite, final boolean b) {
        this.QE = new ArrayList();
        this.ld = new ArrayList();
        int n = 2048;
        if (b) {
            n = 2112;
        }
        (this.dN = new CTabFolder(composite, n)).setSimple(false);
        this.dN.addCTabFolder2Listener((CTabFolder2Listener)this);
        this.dN.addSelectionListener((SelectionListener)new cG(this));
    }
    
    public void dN(final XQ xq) {
        this.QE.add(xq);
    }
    
    public CTabFolder dN() {
        return this.dN;
    }
    
    public List ld() {
        final ArrayList<Control> list = new ArrayList<Control>();
        final Iterator<uK> iterator = this.ld.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().ld);
        }
        return list;
    }
    
    public boolean dN(final String s, final Control control) {
        return this.dN(s, control, true);
    }
    
    public boolean dN(final String text, final Control control, final boolean b) {
        if (control == null) {
            return false;
        }
        CTabItem cTabItem = null;
        if (b) {
            cTabItem = new CTabItem(this.dN, 0);
            cTabItem.setText(text);
            cTabItem.setControl(control);
        }
        this.ld.add(new uK(text, control, cTabItem));
        final Iterator<XQ> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            iterator.next().dN(new QV(this, text));
        }
        return true;
    }
    
    public boolean dN(final String s) {
        final uK ld = this.ld(s);
        if (ld == null) {
            return false;
        }
        if (ld.QE != null) {
            ld.QE.dispose();
        }
        this.ld.remove(ld);
        final Iterator<XQ> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            iterator.next().ld(new QV(this, s));
        }
        return true;
    }
    
    public void QE() {
        while (!this.ld.isEmpty()) {
            this.dN(this.ld.get(0).dN);
        }
    }
    
    public boolean dN(final int n, final boolean b) {
        if (n < 0 || n >= this.ld.size()) {
            return false;
        }
        this.dN(this.ld.get(n), b);
        return true;
    }
    
    public boolean dN(final Control control, final boolean b) {
        final uK dn = this.dN(control);
        if (dn == null) {
            return false;
        }
        this.dN(dn, b);
        return true;
    }
    
    public boolean dN(final String s, final boolean b) {
        final uK ld = this.ld(s);
        if (ld == null) {
            return false;
        }
        this.dN(ld, b);
        return true;
    }
    
    private void dN(final uK uk, final boolean b) {
        if (uk.QE == null) {
            final CTabItem qe = new CTabItem(this.dN, 0);
            qe.setText(uk.dN);
            qe.setControl(uk.ld);
            uk.QE = qe;
        }
        this.dN.setSelection(uk.QE);
        if (b) {
            uk.QE.getControl().setFocus();
        }
    }
    
    public Control wU() {
        for (final uK uk : this.ld) {
            if (this.dN.getSelection() == uk.QE) {
                return uk.ld;
            }
        }
        return null;
    }
    
    private uK ld(final String s) {
        for (final uK uk : this.ld) {
            if (uk.dN.equals(s)) {
                return uk;
            }
        }
        return null;
    }
    
    private uK dN(final Control control) {
        for (final uK uk : this.ld) {
            if (uk.ld == control) {
                return uk;
            }
        }
        return null;
    }
    
    public void close(final CTabFolderEvent cTabFolderEvent) {
        final CTabItem cTabItem = (CTabItem)cTabFolderEvent.item;
        for (final uK uk : this.ld) {
            if (uk.QE == cTabItem) {
                uk.QE = null;
            }
        }
    }
    
    public void maximize(final CTabFolderEvent cTabFolderEvent) {
    }
    
    public void minimize(final CTabFolderEvent cTabFolderEvent) {
    }
    
    public void restore(final CTabFolderEvent cTabFolderEvent) {
    }
    
    public void showList(final CTabFolderEvent cTabFolderEvent) {
    }
    
    final class uK
    {
        String dN;
        Control ld;
        CTabItem QE;
        
        uK(final Co co, final String dn, final Control ld, final CTabItem qe) {
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
        }
    }
}
