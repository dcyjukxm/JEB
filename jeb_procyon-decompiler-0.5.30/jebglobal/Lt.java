// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;

final class Lt extends SelectionAdapter
{
    private /* synthetic */ fc.uK[] dN;
    private /* synthetic */ C.uK ld;
    private /* synthetic */ C.uK QE;
    private /* synthetic */ Button wU;
    private /* synthetic */ Button fa;
    private /* synthetic */ C.uK zs;
    private /* synthetic */ C.uK mS;
    private /* synthetic */ Button OK;
    private /* synthetic */ Button LH;
    private /* synthetic */ C KK;
    
    Lt(final C kk, final fc.uK[] dn, final C.uK ld, final C.uK qe, final Button wu, final Button fa, final C.uK zs, final C.uK ms, final Button ok, final Button lh) {
        this.KK = kk;
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.zs = zs;
        this.mS = ms;
        this.OK = ok;
        this.LH = lh;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        final int selectionIndex = this.KK.QE.getSelectionIndex();
        final wy dn = this.KK.ld.dN(this.dN[selectionIndex]);
        this.ld.dN(dn.dN);
        this.QE.dN(dn.ld);
        this.wU.setSelection(dn.QE);
        this.fa.setSelection(dn.wU);
        final wy ld = this.KK.ld.ld(this.dN[selectionIndex]);
        this.zs.dN(ld.dN);
        this.mS.dN(ld.ld);
        this.OK.setSelection(ld.QE);
        this.LH.setSelection(ld.wU);
    }
}
