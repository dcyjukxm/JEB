// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Control;
import java.util.Iterator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Listener;
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

public final class Gq implements XQ, aH
{
    private yW dN;
    private boolean ld;
    private Shell QE;
    private ToolBar wU;
    private Menu fa;
    private HC zs;
    private List mS;
    private Menu OK;
    private Menu LH;
    private Menu KK;
    private Menu EO;
    private MenuItem cb;
    private MenuItem PF;
    private MenuItem Hw;
    private MenuItem rK;
    private MenuItem Ux;
    private MenuItem ZY;
    private MenuItem s;
    private MenuItem Hv;
    private MenuItem VX;
    private MenuItem ci;
    private MenuItem bG;
    private MenuItem BQ;
    private MenuItem Ee;
    private MenuItem De;
    private MenuItem rn;
    private MenuItem LR;
    private MenuItem Nh;
    private ToolItem XZ;
    private ToolItem nA;
    private ToolItem Ai;
    private int uM;
    private List kq;
    private ConcurrentHashMap ir;
    private Dp rF;
    private JK IL;
    
    public Gq(final yW dn, final ToolBar wu, final int um) {
        this.mS = new ArrayList();
        this.uM = 0;
        this.kq = new ArrayList();
        this.ir = new ConcurrentHashMap();
        this.dN = dn;
        this.ld = dn.cb();
        this.QE = dn.LR();
        this.wU = wu;
        this.fa = new Menu((Decorations)this.QE, 2);
        this.zs = HC.dN();
        this.uM = um;
        this.mS();
    }
    
    public void ld(final String data) {
        if (this.uM <= 0 || this.kq.contains(data)) {
            return;
        }
        final int n = this.ld ? 0 : 2;
        if (this.uM > 0 && this.kq.size() >= this.uM) {
            this.OK.getItem(this.OK.getItemCount() - 1 - n).dispose();
            this.kq.remove(0);
        }
        else if (this.kq.isEmpty()) {
            new MenuItem(this.OK, 2, this.OK.getItemCount() - n);
        }
        final MenuItem menuItem = new MenuItem(this.OK, 0, this.OK.getItemCount() - this.kq.size() - n);
        menuItem.setEnabled(true);
        menuItem.setText(new File(data).getName());
        menuItem.setData((Object)data);
        menuItem.addSelectionListener((SelectionListener)new TT(this));
        this.kq.add(data);
    }
    
    private void mS() {
        final VZ vz = new VZ(this);
        final MenuItem menuItem = new MenuItem(this.fa, 64);
        menuItem.setText("&File");
        final Menu menu = new Menu((Decorations)this.QE, 4);
        menuItem.setMenu(menu);
        this.OK = menu;
        final MenuItem cb = new MenuItem(menu, 0);
        cb.setText("&Open...\tCtrl+O");
        cb.setImage(this.zs.dN("icon-open.png"));
        cb.setAccelerator(SWT.MOD1 | 0x4F);
        cb.addSelectionListener((SelectionListener)vz);
        this.cb = cb;
        final MenuItem pf = new MenuItem(menu, 0);
        pf.setEnabled(false);
        pf.setText("&Close\tCtrl+W");
        pf.setAccelerator(SWT.MOD1 | 0x57);
        pf.addSelectionListener((SelectionListener)vz);
        this.PF = pf;
        new MenuItem(menu, 2);
        final MenuItem hw = new MenuItem(menu, 64);
        hw.setEnabled(false);
        hw.setText("&Export");
        hw.setImage(this.zs.dN("icon-export.png"));
        this.Hw = hw;
        final Menu menu2 = new Menu((Decorations)this.QE, 4);
        this.Hw.setMenu(menu2);
        final MenuItem rk = new MenuItem(menu2, 0);
        rk.setText("&Assembly...");
        rk.addSelectionListener((SelectionListener)vz);
        this.rK = rk;
        final MenuItem ux = new MenuItem(menu2, 0);
        ux.setText("Decompiled &Java...\tCtrl+J");
        ux.setAccelerator(SWT.MOD1 | 0x4A);
        ux.addSelectionListener((SelectionListener)vz);
        this.Ux = ux;
        final MenuItem zy = new MenuItem(menu2, 0);
        zy.setText("&Resources and Assets...");
        zy.addSelectionListener((SelectionListener)vz);
        this.ZY = zy;
        final MenuItem s = new MenuItem(menu, 0);
        s.setEnabled(false);
        s.setText("&Save\tCtrl+S");
        s.setImage(this.zs.dN("icon-save.png"));
        s.setAccelerator(SWT.MOD1 | 0x53);
        s.addSelectionListener((SelectionListener)vz);
        this.s = s;
        final MenuItem hv = new MenuItem(menu, 0);
        hv.setEnabled(false);
        hv.setText("Save &As...");
        hv.setImage(this.zs.dN("icon-save.png"));
        hv.addSelectionListener((SelectionListener)vz);
        this.Hv = hv;
        new MenuItem(menu, 2);
        final MenuItem vx = new MenuItem(menu, 0);
        vx.setEnabled(true);
        vx.setText("Run Script...");
        vx.addSelectionListener((SelectionListener)vz);
        this.VX = vx;
        final MenuItem ci = new MenuItem(menu, 0);
        ci.setEnabled(true);
        ci.setText("Run last Script\tCtrl+I");
        ci.setAccelerator(SWT.MOD1 | 0x49);
        ci.addSelectionListener((SelectionListener)vz);
        this.ci = ci;
        new MenuItem(menu, 2);
        final MenuItem bg = new MenuItem(menu, 0);
        bg.setEnabled(false);
        bg.setText("Prope&rties...");
        bg.setImage(this.zs.dN("icon-properties.png"));
        bg.addSelectionListener((SelectionListener)vz);
        this.bG = bg;
        if (!this.ld) {
            new MenuItem(menu, 2);
            final MenuItem menuItem2 = new MenuItem(menu, 0);
            menuItem2.setText("E&xit\tAlt+F4");
            menuItem2.addSelectionListener((SelectionListener)new rG(this));
        }
        final MenuItem menuItem3 = new MenuItem(this.fa, 64);
        menuItem3.setText("&Edit");
        final Menu menu3 = new Menu((Decorations)this.QE, 4);
        menuItem3.setMenu(menu3);
        final MenuItem bq = new MenuItem(menu3, 0);
        bq.setText("Cu&t\tCtrl+X");
        bq.setAccelerator(SWT.MOD1 | 0x58);
        bq.addSelectionListener((SelectionListener)vz);
        this.BQ = bq;
        final MenuItem ee = new MenuItem(menu3, 0);
        ee.setText("&Copy\tCtrl+C");
        ee.setAccelerator(SWT.MOD1 | 0x43);
        ee.addSelectionListener((SelectionListener)vz);
        this.Ee = ee;
        final MenuItem de = new MenuItem(menu3, 0);
        de.setText("&Paste\tCtrl+V");
        de.setAccelerator(SWT.MOD1 | 0x56);
        de.addSelectionListener((SelectionListener)vz);
        this.De = de;
        final MenuItem rn = new MenuItem(menu3, 0);
        rn.setText("Select &All\tCtrl+A");
        rn.setAccelerator(SWT.MOD1 | 0x41);
        rn.addSelectionListener((SelectionListener)vz);
        this.rn = rn;
        new MenuItem(menu3, 2);
        final MenuItem lr = new MenuItem(menu3, 0);
        lr.setText("&Find...\tCtrl+F");
        lr.setAccelerator(SWT.MOD1 | 0x46);
        lr.addSelectionListener((SelectionListener)new VC(this));
        this.LR = lr;
        final MenuItem nh = new MenuItem(menu3, 0);
        nh.setText("Find &Next\tCtrl+K");
        nh.setAccelerator(SWT.MOD1 | 0x4B);
        nh.addSelectionListener((SelectionListener)new AX(this));
        this.Nh = nh;
        if (!this.ld) {
            new MenuItem(menu3, 2);
            final MenuItem menuItem4 = new MenuItem(menu3, 0);
            menuItem4.setText("&Options...");
            menuItem4.setImage(this.zs.dN("icon-options.png"));
            menuItem4.addSelectionListener((SelectionListener)new YL(this));
        }
        final MenuItem menuItem5 = new MenuItem(this.fa, 64);
        menuItem5.setText("&Action");
        final Menu menu4 = new Menu((Decorations)this.QE, 4);
        menuItem5.setMenu(menu4);
        this.LH = menu4;
        final MenuItem menuItem6 = new MenuItem(menu4, 64);
        menuItem6.setText("&Custom Actions");
        menuItem6.setImage(this.zs.dN("icon-script.png"));
        menuItem6.setMenu(this.KK = new Menu((Decorations)this.QE, 4));
        final MenuItem menuItem7 = new MenuItem(this.fa, 64);
        menuItem7.setText("&Window");
        final Menu menu5 = new Menu((Decorations)this.QE, 4);
        menuItem7.setMenu(menu5);
        this.EO = menu5;
        final MenuItem menuItem8 = new MenuItem(this.fa, 64);
        menuItem8.setText("&Help");
        final Menu menu6 = new Menu((Decorations)this.QE, 4);
        menuItem8.setMenu(menu6);
        final MenuItem menuItem9 = new MenuItem(menu6, 0);
        if (this.ld) {
            menuItem9.setText("&Online Manual");
        }
        else {
            menuItem9.setText("&Online Manual\tF1");
            menuItem9.setAccelerator(16777226);
        }
        menuItem9.addSelectionListener((SelectionListener)new GF(this));
        final MenuItem menuItem10 = new MenuItem(menu6, 0);
        menuItem10.setText("API &Documentation");
        menuItem10.addSelectionListener((SelectionListener)new ZC(this));
        final MenuItem menuItem11 = new MenuItem(menu6, 0);
        menuItem11.setText("&Bulletin Board");
        menuItem11.addSelectionListener((SelectionListener)new qo(this));
        new MenuItem(menu6, 2);
        final MenuItem menuItem12 = new MenuItem(menu6, 0);
        menuItem12.setText("&Changelist");
        menuItem12.addSelectionListener((SelectionListener)new pz(this));
        final MenuItem menuItem13 = new MenuItem(menu6, 0);
        menuItem13.setText("Check for &Update");
        menuItem13.setEnabled(false);
        menuItem13.addSelectionListener((SelectionListener)new Xc(this));
        final MenuItem menuItem14 = new MenuItem(menu6, 0);
        menuItem14.setText("&Memory Usage...");
        menuItem14.addSelectionListener((SelectionListener)new oR(this));
        if (!this.ld) {
            new MenuItem(menu6, 2);
            final MenuItem menuItem15 = new MenuItem(menu6, 0);
            menuItem15.setText("&About...");
            menuItem15.setImage(this.zs.dN("icon-info.png"));
            menuItem15.addSelectionListener((SelectionListener)new ur(this));
        }
        this.QE.getDisplay().addFilter(15, (Listener)new hM(this));
        this.dN.dN(this);
        if (this.wU == null) {
            return;
        }
        final ToolItem xz = new ToolItem(this.wU, 8);
        xz.setImage(this.zs.dN("icon-open.png"));
        xz.setToolTipText("Open a new file");
        xz.addSelectionListener((SelectionListener)vz);
        this.XZ = xz;
        final ToolItem na = new ToolItem(this.wU, 8);
        na.setImage(this.zs.dN("icon-save.png"));
        na.setToolTipText("Save your analysis");
        na.addSelectionListener((SelectionListener)vz);
        na.setEnabled(false);
        this.nA = na;
        new ToolItem(this.wU, 2);
        final ToolItem ai = new ToolItem(this.wU, 8);
        ai.setImage(this.zs.dN("icon-options.png"));
        ai.setToolTipText("Options");
        ai.addSelectionListener((SelectionListener)vz);
        this.Ai = ai;
        new ToolItem(this.wU, 2);
    }
    
    public QW ld() {
        for (Object o = Display.getCurrent().getFocusControl(); o != null; o = ((Control)o).getParent()) {
            if (o instanceof QW) {
                return (QW)o;
            }
        }
        return null;
    }
    
    public void dN(final Oa oa) {
        this.mS.add(oa);
    }
    
    public Menu QE() {
        return this.fa;
    }
    
    @Override
    public void dN(final QV qv) {
        final MenuItem menuItem = new MenuItem(this.EO, 0);
        menuItem.setText(qv.ld);
        menuItem.addSelectionListener((SelectionListener)new Eo(this, qv));
    }
    
    @Override
    public void ld(final QV qv) {
        for (final MenuItem menuItem : this.EO.getItems()) {
            if (menuItem.getText().equals(qv.ld)) {
                menuItem.dispose();
                break;
            }
        }
    }
    
    @Override
    public void dN(final String s) {
        this.PF.setEnabled(true);
        this.Hw.setEnabled(true);
        this.s.setEnabled(true);
        this.Hv.setEnabled(true);
        this.bG.setEnabled(true);
        this.nA.setEnabled(true);
    }
    
    @Override
    public void dN() {
        this.PF.setEnabled(false);
        this.Hw.setEnabled(false);
        this.s.setEnabled(false);
        this.Hv.setEnabled(false);
        this.bG.setEnabled(false);
        this.nA.setEnabled(false);
    }
    
    public boolean dN(final as as, final boolean b) {
        final String ld = as.ld();
        if (ld == null || ld.isEmpty()) {
            return false;
        }
        Vt vt = this.ir.get(ld);
        final cf cf = new cf(this);
        final StringBuilder sb = new StringBuilder(ld);
        int mod3 = 0;
        final int qe = as.QE();
        if (qe != 0) {
            sb.append('\t');
            int i = as.wU();
            while (i != 0) {
                if ((i & SWT.MOD1) != 0x0) {
                    sb.append("Ctrl+");
                    mod3 |= SWT.MOD1;
                    i &= ~SWT.MOD1;
                }
                else if ((i & SWT.MOD2) != 0x0) {
                    sb.append("Shift+");
                    mod3 |= SWT.MOD2;
                    i &= ~SWT.MOD2;
                }
                else if ((i & SWT.MOD3) != 0x0) {
                    sb.append("Alt+");
                    mod3 = SWT.MOD3;
                    i &= ~SWT.MOD3;
                }
                else if ((i & 0x40000) != 0x0) {
                    sb.append("Ctrl+");
                    mod3 = 262144;
                    i &= 0xFFFBFFFF;
                }
                else if ((i & 0x20000) != 0x0) {
                    sb.append("Shift+");
                    mod3 = 131072;
                    i &= 0xFFFDFFFF;
                }
                else {
                    if ((i & 0x10000) == 0x0) {
                        return false;
                    }
                    sb.append("Alt+");
                    mod3 = 65536;
                    i &= 0xFFFEFFFF;
                }
            }
            if (Character.isLetterOrDigit(qe)) {
                final char upperCase = Character.toUpperCase((char)qe);
                sb.append(upperCase);
                mod3 |= upperCase;
            }
            else if (qe >= 16777226 && qe <= 16777237) {
                sb.append("F" + (qe - 16777226 + 1));
                mod3 |= qe;
            }
            else if (qe == '\r') {
                sb.append("Enter");
                mod3 |= qe;
            }
            else if (qe == '\u001b') {
                sb.append("Esc");
                mod3 |= qe;
            }
            else {
                if (qe != '\t') {
                    return false;
                }
                sb.append("Tab");
                mod3 |= qe;
            }
        }
        String text = sb.toString();
        if (this.ld) {
            final int index = text.indexOf("\t");
            if (index >= 0) {
                text = text.substring(0, index);
            }
        }
        final boolean b2 = as.dN() == null;
        final int[] array = { -1 };
        final Image ms = as.mS();
        if (vt == null) {
            MenuItem menuItem = null;
            if (as.dN(array)) {
                final Menu menu = b ? this.KK : this.LH;
                int itemCount = array[0];
                if (itemCount < 0 || itemCount > menu.getItemCount()) {
                    itemCount = menu.getItemCount();
                }
                menuItem = new MenuItem(menu, 0, itemCount);
                menuItem.setText(text);
                if (mod3 != '\0') {
                    menuItem.setAccelerator(mod3);
                }
                menuItem.setImage(ms);
                menuItem.addSelectionListener((SelectionListener)cf);
                menuItem.setEnabled(b2);
            }
            ToolItem toolItem = null;
            if (as.ld(array) && ms != null) {
                int itemCount2 = array[0];
                if (itemCount2 < 0 || itemCount2 > this.wU.getItemCount()) {
                    itemCount2 = this.wU.getItemCount();
                }
                toolItem = new ToolItem(this.wU, 8, itemCount2);
                toolItem.setEnabled(b2);
                toolItem.setToolTipText(ld);
                toolItem.setImage(ms);
                toolItem.addSelectionListener((SelectionListener)cf);
            }
            vt = new Vt(menuItem, toolItem);
            this.ir.put(ld, vt);
        }
        if (as.QE(null)) {
            final yn dn = as.dN();
            if (dn != null) {
                final xh xh = new xh(dn.s(), text, as.mS(), (SelectionListener)cf);
                xh.dN(true);
                vt.dN(xh);
            }
        }
        vt.dN(as);
        return true;
    }
    
    public boolean dN(final as as) {
        final String ld = as.ld();
        if (ld == null || ld.isEmpty()) {
            return false;
        }
        final Vt vt = this.ir.get(ld);
        if (vt == null) {
            return true;
        }
        if (vt.ld() != null) {
            vt.ld().dispose();
        }
        if (vt.QE() != null) {
            vt.QE().dispose();
        }
        final Iterator iterator = vt.wU().iterator();
        while (iterator.hasNext()) {
            iterator.next().ld();
        }
        this.ir.remove(ld);
        return false;
    }
    
    public void ld(final as as, final boolean b) {
        for (final Vt vt : this.ir.values()) {
            final Iterator iterator2 = vt.dN().iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next() == as) {
                    vt.dN(b);
                    break;
                }
            }
        }
    }
    
    public void wU() {
        if (this.rF != null) {
            return;
        }
        try {
            this.rF = new Dp(this.QE, this.dN);
            if (this.ld) {
                this.rF.setText("Preferences");
            }
            final ZO dn = this.rF.dN();
            if (dn != null) {
                this.dN.dN(dn.dN.contains(ZO.uK.fa), dn.dN.contains(ZO.uK.zs));
            }
        }
        finally {
            this.rF = null;
        }
    }
    
    public void fa() {
        try {
            new JK(this.QE).ld();
        }
        finally {
            this.IL = null;
        }
    }
    
    public void zs() {
        this.QE.close();
    }
}
