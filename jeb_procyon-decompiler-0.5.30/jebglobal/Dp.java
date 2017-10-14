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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.custom.CTabFolder;
import java.util.HashMap;

public final class Dp extends fL
{
    static HashMap dN;
    private TM ld;
    private CTabFolder QE;
    private FontData wU;
    private boolean fa;
    private ZO zs;
    
    static void dN(final WV wv, final ZO.uK uk) {
        Dp.dN.put(wv, new DE(wv, uk));
    }
    
    public Dp(final Shell shell, final yW yw) {
        super(shell, "Options", 67696);
        this.zs = new ZO();
        this.ld = yw.EO();
    }
    
    private Button dN(final Composite composite, final WV wv) {
        return TM.dN(composite, wv.dN(), null);
    }
    
    private QH ld(final Composite composite, final WV wv) {
        final v v = new v(composite, wv.dN(), this.ld.ld(wv));
        Dp.dN.get(wv).dN(v);
        return v;
    }
    
    private QH QE(final Composite composite, final WV wv) {
        final Dg dg = new Dg(composite, wv.dN(), this.ld.dN(wv));
        dg.setLayoutData((Object)new GridData(4, 128, true, false));
        Dp.dN.get(wv).dN(dg);
        return dg;
    }
    
    private QH wU(final Composite composite, final WV wv) {
        final JZ jz = new JZ(composite, wv.dN(), this.ld.dN(wv), 5);
        jz.setLayoutData((Object)new GridData(4, 128, true, false));
        Dp.dN.get(wv).dN(jz);
        return jz;
    }
    
    private QH fa(final Composite composite, final WV wv) {
        final qG qg = new qG(composite, wv.dN(), this.ld.dN(wv));
        qg.setLayoutData((Object)new GridData(4, 128, true, false));
        Dp.dN.get(wv).dN(qg);
        return qg;
    }
    
    public ZO dN() {
        super.ld();
        this.ld.dN(WV.Hw, this.QE.getSelectionIndex());
        this.ld.dN();
        return this.fa ? this.zs : null;
    }
    
    @Override
    protected void dN(final Shell shell) {
        shell.setLayout((Layout)new GridLayout(3, false));
        final Co co = new Co((Composite)shell, false);
        this.QE = co.dN();
        final GridData layoutData = new GridData();
        layoutData.horizontalSpan = 3;
        layoutData.horizontalAlignment = 4;
        layoutData.verticalAlignment = 4;
        layoutData.grabExcessHorizontalSpace = true;
        layoutData.grabExcessVerticalSpace = true;
        this.QE.setLayoutData((Object)layoutData);
        co.dN("   General   ", this.dN((Composite)this.QE, shell));
        co.dN("   Style   ", this.ld((Composite)this.QE, shell));
        co.dN("   Scripts   ", this.QE((Composite)this.QE, shell));
        co.dN("   Parsers   ", this.dN((Composite)this.QE));
        co.dN("   Decompiler   ", this.ld((Composite)this.QE));
        co.dN("   Assembly   ", this.QE((Composite)this.QE));
        co.dN("   Java   ", this.wU((Composite)this.QE));
        co.dN("   XML   ", this.fa((Composite)this.QE));
        final Button dn = TM.dN((Composite)shell, "OK", (SelectionListener)new Kw(this, shell));
        TM.dN((Composite)shell, "Cancel", (SelectionListener)new BV(this, shell));
        final Button dn2 = TM.dN((Composite)shell, "Help", (SelectionListener)new VP(this));
        final GridData layoutData2 = new GridData();
        layoutData2.horizontalAlignment = 3;
        dn2.setLayoutData((Object)layoutData2);
        shell.setDefaultButton(dn);
        co.dN(this.ld.QE(WV.Hw), true);
    }
    
    private Control dN(final Composite composite, final Shell shell) {
        final Composite composite2 = new Composite(composite, 0);
        composite2.setLayout((Layout)new GridLayout(1, false));
        final Group group = new Group(composite2, 0);
        group.setLayout((Layout)new GridLayout(1, false));
        group.setText("Internet");
        group.setLayoutData((Object)new GridData(4, 4, true, false));
        final Group group2 = new Group(composite2, 0);
        group2.setLayout((Layout)new GridLayout(1, false));
        group2.setText("Database");
        group2.setLayoutData((Object)new GridData(4, 128, true, false));
        final Group group3 = new Group(composite2, 0);
        group3.setLayout((Layout)new GridLayout());
        group3.setText("Documentation");
        group3.setLayoutData((Object)new GridData(4, 4, true, true));
        this.ld((Composite)group, WV.ci);
        this.ld((Composite)group, WV.BQ);
        this.QE((Composite)group, WV.VX);
        this.ld((Composite)group2, WV.Ee);
        this.wU((Composite)group2, WV.De);
        this.fa((Composite)group3, WV.s);
        this.fa((Composite)group3, WV.Hv);
        return (Control)composite2;
    }
    
    private Control ld(final Composite composite, final Shell shell) {
        final Composite composite2 = new Composite(composite, 0);
        composite2.setLayout((Layout)new GridLayout(1, false));
        final Group group = new Group(composite2, 0);
        group.setLayout((Layout)new GridLayout(1, false));
        group.setText("Font and Colors");
        group.setLayoutData((Object)new GridData(4, 4, true, false));
        final Group group2 = new Group(composite2, 0);
        group2.setLayout((Layout)new GridLayout(1, false));
        group2.setText("Class hierarchy");
        group2.setLayoutData((Object)new GridData(4, 4, true, false));
        final Group group3 = new Group(composite2, 0);
        group3.setLayout((Layout)new GridLayout(1, false));
        group3.setText("Other");
        group3.setLayoutData((Object)new GridData(4, 4, true, true));
        final Composite composite3 = new Composite((Composite)group, 0);
        composite3.setLayout((Layout)TM.QE());
        this.dN(composite3, WV.rn).addSelectionListener((SelectionListener)new Tq(this, shell));
        this.dN(composite3, WV.LR).addSelectionListener((SelectionListener)new yI(this, shell));
        this.ld((Composite)group2, WV.Nh);
        this.QE((Composite)group2, WV.XZ);
        this.wU((Composite)group3, WV.nA);
        return (Control)composite2;
    }
    
    private Control QE(final Composite composite, final Shell shell) {
        final Composite composite2 = new Composite(composite, 0);
        composite2.setLayout((Layout)new GridLayout(1, false));
        final Group group = new Group(composite2, 0);
        group.setLayout((Layout)new GridLayout(1, false));
        group.setText("General");
        group.setLayoutData((Object)new GridData(4, 4, true, true));
        this.fa((Composite)group, WV.Ux);
        this.fa((Composite)group, WV.ZY);
        return (Control)composite2;
    }
    
    private Control dN(final Composite composite) {
        final Composite composite2 = new Composite(composite, 0);
        composite2.setLayout((Layout)new GridLayout(1, false));
        final Group group = new Group(composite2, 0);
        group.setLayout((Layout)new GridLayout(1, false));
        group.setText("APK parser");
        group.setLayoutData((Object)new GridData(4, 128, true, false));
        final Group group2 = new Group(composite2, 0);
        group2.setLayout((Layout)new GridLayout(1, false));
        group2.setText("DEX parser");
        group2.setLayoutData((Object)new GridData(4, 4, true, true));
        this.ld((Composite)group, WV.Ai);
        this.ld((Composite)group, WV.uM);
        this.ld((Composite)group2, WV.kq);
        this.ld((Composite)group2, WV.ir);
        this.ld((Composite)group2, WV.rF);
        this.ld((Composite)group2, WV.IL);
        return (Control)composite2;
    }
    
    private Control ld(final Composite composite) {
        final Composite composite2 = new Composite(composite, 0);
        composite2.setLayout((Layout)new GridLayout(1, false));
        final Group group = new Group(composite2, 0);
        group.setLayout((Layout)new GridLayout(1, false));
        group.setText("General");
        group.setLayoutData((Object)new GridData(4, 4, true, false));
        final Group group2 = new Group(composite2, 0);
        group2.setLayout((Layout)new GridLayout(1, false));
        group2.setText("Engine");
        group2.setLayoutData((Object)new GridData(4, 4, true, false));
        final Group group3 = new Group(composite2, 0);
        group3.setLayout((Layout)new GridLayout(1, false));
        group3.setText("Rendering");
        group3.setLayoutData((Object)new GridData(4, 4, true, true));
        this.wU((Composite)group, WV.Db);
        this.ld((Composite)group2, WV.sC);
        this.ld((Composite)group2, WV.jp);
        this.ld((Composite)group3, WV.bU);
        this.ld((Composite)group3, WV.Qg);
        this.ld((Composite)group3, WV.uB);
        this.ld((Composite)group3, WV.dY);
        this.ld((Composite)group3, WV.Rm);
        this.ld((Composite)group3, WV.nb);
        this.ld((Composite)group3, WV.nI);
        return (Control)composite2;
    }
    
    private Control QE(final Composite composite) {
        final Composite composite2 = new Composite(composite, 0);
        composite2.setLayout((Layout)new GridLayout(1, false));
        final Group group = new Group(composite2, 0);
        group.setLayout((Layout)new GridLayout(1, false));
        group.setText("Visualization");
        group.setLayoutData((Object)new GridData(4, 4, true, false));
        final Group group2 = new Group(composite2, 0);
        group2.setLayout((Layout)new GridLayout(1, false));
        group2.setText("Output");
        group2.setLayoutData((Object)new GridData(4, 4, true, true));
        this.wU((Composite)group, WV.My);
        this.ld((Composite)group2, WV.kU);
        this.ld((Composite)group2, WV.mD);
        this.ld((Composite)group2, WV.LV);
        this.ld((Composite)group2, WV.uo);
        this.ld((Composite)group2, WV.H);
        this.ld((Composite)group2, WV.go);
        this.ld((Composite)group2, WV.BP);
        this.ld((Composite)group2, WV.bL);
        this.ld((Composite)group2, WV.U);
        return (Control)composite2;
    }
    
    private Control wU(final Composite composite) {
        final Composite composite2 = new Composite(composite, 0);
        composite2.setLayout((Layout)new GridLayout(1, false));
        final Group group = new Group(composite2, 0);
        group.setLayout((Layout)new GridLayout(1, false));
        group.setText("Output");
        group.setLayoutData((Object)new GridData(4, 4, true, true));
        this.wU((Composite)group, WV.qL);
        this.ld((Composite)group, WV.kz);
        this.ld((Composite)group, WV.lx);
        this.ld((Composite)group, WV.cM);
        this.ld((Composite)group, WV.VV);
        this.ld((Composite)group, WV.LK);
        this.ld((Composite)group, WV.Mq);
        this.ld((Composite)group, WV.FY);
        return (Control)composite2;
    }
    
    private Control fa(final Composite composite) {
        final Composite composite2 = new Composite(composite, 0);
        composite2.setLayout((Layout)new GridLayout(1, false));
        final Group group = new Group(composite2, 0);
        group.setLayout((Layout)new GridLayout(1, false));
        group.setText("Output");
        group.setLayoutData((Object)new GridData(4, 4, true, true));
        this.wU((Composite)group, WV.zE);
        return (Control)composite2;
    }
    
    static {
        Dp.dN = new HashMap();
        dN(WV.VX, ZO.uK.dN);
        dN(WV.ci, ZO.uK.dN);
        dN(WV.BQ, ZO.uK.dN);
        dN(WV.Ee, ZO.uK.dN);
        dN(WV.De, ZO.uK.dN);
        dN(WV.s, ZO.uK.dN);
        dN(WV.Hv, ZO.uK.dN);
        dN(WV.Ux, ZO.uK.dN);
        dN(WV.ZY, ZO.uK.dN);
        dN(WV.Nh, ZO.uK.dN);
        dN(WV.XZ, ZO.uK.dN);
        dN(WV.nA, ZO.uK.dN);
        dN(WV.Ai, ZO.uK.ld);
        dN(WV.uM, ZO.uK.ld);
        dN(WV.kq, ZO.uK.QE);
        dN(WV.ir, ZO.uK.QE);
        dN(WV.rF, ZO.uK.QE);
        dN(WV.IL, ZO.uK.QE);
        dN(WV.Db, ZO.uK.wU);
        dN(WV.sC, ZO.uK.wU);
        dN(WV.jp, ZO.uK.wU);
        dN(WV.bU, ZO.uK.wU);
        dN(WV.Qg, ZO.uK.wU);
        dN(WV.uB, ZO.uK.wU);
        dN(WV.dY, ZO.uK.wU);
        dN(WV.Rm, ZO.uK.wU);
        dN(WV.nb, ZO.uK.wU);
        dN(WV.nI, ZO.uK.wU);
        dN(WV.My, ZO.uK.fa);
        dN(WV.kU, ZO.uK.fa);
        dN(WV.mD, ZO.uK.fa);
        dN(WV.LV, ZO.uK.fa);
        dN(WV.uo, ZO.uK.fa);
        dN(WV.H, ZO.uK.fa);
        dN(WV.go, ZO.uK.fa);
        dN(WV.BP, ZO.uK.fa);
        dN(WV.bL, ZO.uK.fa);
        dN(WV.U, ZO.uK.fa);
        dN(WV.qL, ZO.uK.zs);
        dN(WV.kz, ZO.uK.zs);
        dN(WV.lx, ZO.uK.zs);
        dN(WV.cM, ZO.uK.zs);
        dN(WV.VV, ZO.uK.zs);
        dN(WV.LK, ZO.uK.zs);
        dN(WV.Mq, ZO.uK.zs);
        dN(WV.FY, ZO.uK.zs);
        dN(WV.zE, ZO.uK.mS);
    }
}
