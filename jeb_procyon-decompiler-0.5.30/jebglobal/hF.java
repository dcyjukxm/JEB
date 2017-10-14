// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;

public final class hF extends Composite
{
    private vh dN;
    private rn ld;
    private cr QE;
    
    public hF(final Composite composite, final yW yw) {
        super(composite, 0);
        this.setLayout((Layout)new FormLayout());
        this.dN = new vh(this);
        final FormData layoutData = new FormData();
        layoutData.left = new FormAttachment(0);
        layoutData.right = new FormAttachment(100);
        layoutData.top = new FormAttachment(0);
        layoutData.height = 18;
        this.dN.setLayoutData((Object)layoutData);
        this.ld = new rn(this);
        final FormData layoutData2 = new FormData();
        layoutData2.left = new FormAttachment(0);
        layoutData2.width = 8;
        layoutData2.top = new FormAttachment((Control)this.dN);
        layoutData2.bottom = new FormAttachment(100);
        this.ld.setLayoutData((Object)layoutData2);
    }
    
    public void dN(final cr qe) {
        if (this.QE != null || qe == null || qe.getParent() != this) {
            throw new RuntimeException();
        }
        this.QE = qe;
        final FormData layoutData = new FormData();
        layoutData.left = new FormAttachment((Control)this.ld);
        layoutData.right = new FormAttachment(100);
        layoutData.top = new FormAttachment((Control)this.dN);
        layoutData.bottom = new FormAttachment(100, 0);
        qe.setLayoutData((Object)layoutData);
        this.dN.dN(qe);
        this.ld.dN(qe);
        this.layout();
    }
    
    public vh dN() {
        return this.dN;
    }
    
    public rn ld() {
        return this.ld;
    }
    
    public boolean setFocus() {
        return this.QE != null && this.QE.setFocus();
    }
}
