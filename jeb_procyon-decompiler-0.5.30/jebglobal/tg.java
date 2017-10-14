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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Tree;

public final class tg extends fL
{
    private Tree ld;
    private Font QE;
    private AR wU;
    private int fa;
    private UZ zs;
    public Integer dN;
    
    public tg(final Shell shell, final Font qe, final AR wu, final int fa) {
        super(shell, "Type information", 67696);
        this.dN = -1;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.zs = wu.ZY();
    }
    
    public Integer dN() {
        super.ld();
        return this.dN;
    }
    
    public void dN(final Shell shell) {
        shell.setLayout((Layout)new FillLayout());
        (this.ld = new Tree((Composite)shell, 2048)).setLayout((Layout)new FillLayout());
        this.ld.setFont(this.QE);
        final Menu menu = new Menu((Control)this.ld);
        final MenuItem menuItem = new MenuItem(menu, 0);
        menuItem.setText("Info");
        menuItem.addSelectionListener((SelectionListener)new Jd(this));
        this.ld.setMenu(menu);
        this.ld.addSelectionListener((SelectionListener)new oS(this, shell));
        this.QE();
        final Point computeSize;
        final Point size = computeSize = shell.computeSize(-1, -1);
        computeSize.x *= (int)1.2;
        final Point point = size;
        point.y *= (int)1.2;
        shell.setSize(size);
    }
    
    private void QE() {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        UZ.uK dn;
        for (int i = this.fa; i >= 0; i = dn.ld) {
            dn = this.zs.dN(i);
            list.add(0, i);
            if (dn == null) {
                break;
            }
        }
        int n = 0;
        TreeItem treeItem = null;
        for (final int intValue : list) {
            final String dn2 = this.wU.QE(intValue).dN(true);
            final String replace = dn2.substring(1, dn2.length() - 1).replace('/', '.');
            if (n == 0) {
                treeItem = new TreeItem(this.ld, 0);
            }
            else {
                treeItem = new TreeItem(treeItem, 0);
            }
            treeItem.setText(replace);
            treeItem.setData((Object)intValue);
            if (intValue == this.fa) {
                treeItem.setBackground(HC.dN().dN(255, 192, 192));
            }
            this.ld.showItem(treeItem);
            ++n;
        }
        final TreeItem selection = treeItem;
        this.ld.setSelection(selection);
        final UZ.uK dn3 = this.zs.dN(this.fa);
        if (dn3 != null) {
            for (final int intValue2 : dn3.wU) {
                final String dn4 = this.wU.QE(intValue2).dN(true);
                final String replace2 = dn4.substring(1, dn4.length() - 1).replace('/', '.');
                final TreeItem treeItem2 = new TreeItem(selection, 0);
                treeItem2.setText(replace2);
                treeItem2.setData((Object)intValue2);
                this.ld.showItem(treeItem2);
            }
            if (!dn3.QE.isEmpty()) {
                final TreeItem treeItem3 = new TreeItem(this.ld, 0);
                treeItem3.setText("implements:");
                for (final int intValue3 : dn3.QE) {
                    final String dn5 = this.wU.QE(intValue3).dN(true);
                    final String replace3 = dn5.substring(1, dn5.length() - 1).replace('/', '.');
                    final TreeItem treeItem4 = new TreeItem(treeItem3, 0);
                    treeItem4.setText(replace3);
                    treeItem4.setData((Object)intValue3);
                    this.ld.showItem(treeItem4);
                }
            }
        }
    }
}
