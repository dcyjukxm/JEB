// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import java.io.File;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;

public final class NB extends Composite
{
    yx dN;
    private SashForm wU;
    private Tree fa;
    Composite ld;
    Font QE;
    
    public NB(final Composite composite, final yx dn, final File file) {
        super(composite, 0);
        this.setLayout((Layout)new FillLayout());
        this.dN = dn;
        this.QE = dn.dN().XZ();
        dn.dN().nA();
        this.wU = new SashForm((Composite)this, 256);
        this.fa = new Tree((Composite)this.wU, 2048);
        (this.ld = new Composite((Composite)this.wU, 0)).setLayout((Layout)new FillLayout());
        this.wU.setWeights(new int[] { 20, 80 });
        this.dN(null, file);
        this.dN();
        this.layout();
    }
    
    private void dN(final TreeItem treeItem, final File file) {
        for (final String text : file.list()) {
            final File data = new File(file.getAbsolutePath() + "/" + text);
            final TreeItem treeItem2 = (treeItem == null) ? new TreeItem(this.fa, 0) : new TreeItem(treeItem, 0);
            treeItem2.setText(text);
            treeItem2.setData((Object)data);
            this.fa.showItem(treeItem2);
            if (data.isDirectory()) {
                this.dN(treeItem2, data);
            }
        }
    }
    
    private void dN() {
        this.fa.addSelectionListener((SelectionListener)new Yv(this));
    }
}
