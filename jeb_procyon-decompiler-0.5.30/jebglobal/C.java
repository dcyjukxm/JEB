// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.internal.SWTEventListener;
import org.eclipse.swt.widgets.TypedListener;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.CCombo;

public final class C extends fL
{
    private TM wU;
    boolean dN;
    fc ld;
    CCombo QE;
    private uK fa;
    private uK zs;
    
    public C(final Shell shell, final TM wu) {
        super(shell, "Styles");
        this.dN = false;
        this.wU = wu;
    }
    
    public fc dN() {
        super.ld();
        return this.dN ? this.ld : null;
    }
    
    @Override
    protected void dN(final Shell shell) {
        shell.setLayout((Layout)new FillLayout());
        this.ld = new fc(shell.getDisplay(), this.wU.dN(WV.LR));
        final Composite composite = new Composite((Composite)shell, 0);
        composite.setLayout((Layout)new RowLayout(512));
        final Group group = new Group(composite, 0);
        group.setLayout((Layout)new RowLayout(512));
        group.setText("Items");
        final Composite composite2 = new Composite((Composite)group, 0);
        composite2.setLayout((Layout)new RowLayout(256));
        new Label(composite2, 0).setText("Type:  ");
        this.QE = new CCombo(composite2, 8390664);
        final fc.uK[] values;
        final fc.uK[] array = values = fc.uK.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            final String replace = values[i].toString().toLowerCase().replace('_', ' ');
            this.QE.add(Character.toUpperCase(replace.charAt(0)) + replace.substring(1));
        }
        final Group group2 = new Group((Composite)group, 0);
        group2.setLayout((Layout)new RowLayout(256));
        group2.setText("Normal");
        final uK uk = new uK((Composite)group2, "Foreground");
        final uK uk2 = new uK((Composite)group2, "Background");
        final Button ld = TM.ld((Composite)group2, "Bold", null);
        final Button ld2 = TM.ld((Composite)group2, "Italic", null);
        final Group group3 = new Group((Composite)group, 0);
        group3.setLayout((Layout)new RowLayout(256));
        group3.setText("Active");
        final uK uk3 = new uK((Composite)group3, "Foreground");
        final uK uk4 = new uK((Composite)group3, "Background");
        final Button ld3 = TM.ld((Composite)group3, "Bold", null);
        final Button ld4 = TM.ld((Composite)group3, "Italic", null);
        final Group group4 = new Group(composite, 0);
        group4.setLayout((Layout)new RowLayout(256));
        group4.setText("Backgrounds");
        this.fa = new uK((Composite)group4, "General");
        this.zs = new uK((Composite)group4, "Current line");
        final Composite composite3 = new Composite(composite, 0);
        composite3.setLayout((Layout)new RowLayout(256));
        final Button dn = TM.dN(composite3, "OK", null);
        final Button dn2 = TM.dN(composite3, "Cancel", null);
        final Button dn3 = TM.dN(composite3, "Reset to defaults", null);
        this.QE.addSelectionListener((SelectionListener)new Lt(this, array, uk, uk2, ld, ld2, uk3, uk4, ld3, ld4));
        uk.dN((SelectionListener)new eE(this, array));
        uk2.dN((SelectionListener)new GJ(this, array));
        ld.addSelectionListener((SelectionListener)new Py(this, array));
        ld2.addSelectionListener((SelectionListener)new Zc(this, array));
        uk3.dN((SelectionListener)new H(this, array));
        uk4.dN((SelectionListener)new un(this, array));
        ld3.addSelectionListener((SelectionListener)new zp(this, array));
        ld4.addSelectionListener((SelectionListener)new bZ(this, array));
        this.fa.dN((SelectionListener)new Lr(this));
        this.zs.dN((SelectionListener)new QL(this));
        dn2.addSelectionListener((SelectionListener)new Ml(this, shell));
        dn.addSelectionListener((SelectionListener)new wE(this, shell));
        dn3.addSelectionListener((SelectionListener)new RN(this, shell));
        this.QE();
    }
    
    private void QE() {
        this.QE.select(0);
        this.QE.notifyListeners(13, new Event());
        this.fa.dN(this.ld.ld());
        this.zs.dN(this.ld.QE());
    }
    
    final class uK extends Composite
    {
        Label dN;
        
        uK(final C c, final Composite composite, final String s, final Color background) {
            super(composite, 0);
            this.setLayout((Layout)new FillLayout());
            new Label(composite, 0).setText(s + ": ");
            (this.dN = new Label(composite, 2048)).setText("            ");
            this.dN.setBackground(background);
            this.dN.addMouseListener((MouseListener)new Qv(this, c));
        }
        
        uK(final C c, final Composite composite, final String s) {
            this(c, composite, s, null);
        }
        
        void dN(final SelectionListener selectionListener) {
            this.addListener(13, (Listener)new TypedListener((SWTEventListener)selectionListener));
        }
        
        public void dN(final Color background) {
            this.dN.setBackground(background);
        }
        
        public Color dN() {
            return this.dN.getBackground();
        }
    }
}
