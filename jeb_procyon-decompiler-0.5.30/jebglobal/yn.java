// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.LineStyleEvent;
import java.util.Collection;
import java.util.Iterator;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.MenuItem;
import java.util.ArrayList;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.custom.LineStyleListener;
import org.eclipse.swt.custom.CaretListener;

public abstract class yn extends lW implements Oa, CaretListener, LineStyleListener, MouseListener, TraverseListener
{
    protected yx dN;
    private yW OK;
    private fc LH;
    protected YG ld;
    private xc KK;
    private HashMap EO;
    private YJ cb;
    private HashSet PF;
    private int Hw;
    protected int QE;
    protected int wU;
    private boolean rK;
    protected oV fa;
    private Gq Ux;
    private List ZY;
    private NE s;
    
    public yn(final Composite composite, final yx dn, final Font font, final fc lh, final Gq ux) {
        super(composite, font, false);
        this.LH = null;
        this.ld = null;
        new ArrayList();
        this.KK = null;
        this.EO = new HashMap();
        this.cb = null;
        this.PF = new HashSet();
        this.Hw = -1;
        this.QE = -1;
        this.wU = -1;
        this.rK = false;
        this.fa = new oV();
        this.ZY = new ArrayList();
        this.dN = dn;
        if (this.dN != null) {
            this.OK = dn.dN();
        }
        this.zs.addLineStyleListener((LineStyleListener)this);
        this.zs.addCaretListener((CaretListener)this);
        this.zs.addMouseListener((MouseListener)this);
        this.zs.addTraverseListener((TraverseListener)this);
        this.zs.setDoubleClickEnabled(false);
        this.LH = lh;
        this.ld = new YG(lh);
        this.setForeground(lh.dN());
        this.setBackground(lh.ld());
        if (ux != null) {
            ux.dN(this);
            this.Ux = ux;
        }
        new MenuItem(this.mS, 2);
        this.dN(new s(this));
        this.dN(this.s = new NE(this));
        this.dN(new cF(this));
        this.dN(new ER(this));
        this.dN(new tt(this));
        this.dN(new Yf(this));
        this.dN(new aJ(this));
        this.addDisposeListener((DisposeListener)new gu(this));
    }
    
    @Override
    public void focusGained(final FocusEvent focusEvent) {
        super.focusGained(focusEvent);
        this.cb();
    }
    
    @Override
    public void focusLost(final FocusEvent focusEvent) {
        super.focusLost(focusEvent);
        this.PF();
    }
    
    public void dN(final as as) {
        this.ZY.add(as);
        this.Ux.dN(as, false);
    }
    
    public void ld() {
        final Iterator<as> iterator = this.ZY.iterator();
        while (iterator.hasNext()) {
            this.Ux.dN(iterator.next());
        }
        this.ZY.clear();
    }
    
    public void dN(final fc lh) {
        this.LH = lh;
        this.ld.dN(lh);
        this.setForeground(lh.dN());
        this.setBackground(lh.ld());
    }
    
    public yW QE() {
        return this.OK;
    }
    
    public yx wU() {
        return this.dN;
    }
    
    @Override
    public int fa() {
        return this.Hw;
    }
    
    @Override
    public int zs() {
        return this.QE;
    }
    
    public int mS() {
        return this.wU;
    }
    
    public YJ OK() {
        return this.cb;
    }
    
    public oV LH() {
        return this.fa;
    }
    
    public List dN(final Object o) {
        if (this.KK == null) {
            return null;
        }
        return this.EO.get(o);
    }
    
    public List dN(final YJ yj) {
        if (this.KK == null) {
            return null;
        }
        final Object zs = yj.zs();
        if (zs == null) {
            return null;
        }
        return (List)this.EO.get(zs);
    }
    
    public List ld(final YJ yj) {
        final List dn = this.dN(yj);
        if (dn == null) {
            return null;
        }
        final HashSet set = new HashSet(dn);
        final ArrayList list = new ArrayList<LW>(dn.size());
        for (int i = 0; i < this.KK.OK(); ++i) {
            final List fa = this.KK.fa(i);
            if (fa != null) {
                for (final hv hv : fa) {
                    if (set.contains(hv)) {
                        list.add(new LW(i, hv));
                    }
                }
            }
        }
        return list;
    }
    
    @Override
    public void KK() {
        this.dN(true);
    }
    
    public abstract void dN(final boolean p0);
    
    @Override
    public void EO() {
        this.KK = null;
        this.EO.clear();
        this.cb = null;
        this.PF.clear();
        this.Hw = 0;
        this.QE = 0;
        this.wU = 0;
    }
    
    protected void dN(final xc kk, final int topIndex, final int caretOffset) {
        this.rK = true;
        this.KK = kk;
        this.zs.setText(kk.zs());
        for (int ok = kk.OK(), i = 0; i < ok; ++i) {
            final List fa = kk.fa(i);
            if (fa != null) {
                for (final hv hv : fa) {
                    final Object zs = hv.zs();
                    if (zs != null) {
                        List<YJ> list = this.EO.get(zs);
                        if (list == null) {
                            list = new ArrayList<YJ>();
                            this.EO.put(zs, list);
                        }
                        list.add((YJ)hv);
                    }
                }
            }
        }
        for (final List list2 : this.EO.values()) {
            if (list2 != null && list2 instanceof ArrayList) {
                ((ArrayList)list2).trimToSize();
            }
        }
        this.rK = false;
        this.zs.redraw();
        if (caretOffset != -1 || topIndex != -1) {
            if (caretOffset == -1 && topIndex != -1) {
                this.dN(topIndex, false);
            }
            else if (caretOffset != -1 && topIndex == -1) {
                this.ld(caretOffset, false);
            }
            else {
                this.zs.setCaretOffset(caretOffset);
                this.zs.setTopIndex(topIndex);
            }
        }
    }
    
    public void lineGetStyle(final LineStyleEvent lineStyleEvent) {
        if (this.KK == null) {
            return;
        }
        final int lineAtOffset = this.zs.getLineAtOffset(lineStyleEvent.lineOffset);
        final int offsetAtLine = this.zs.getOffsetAtLine(lineAtOffset);
        final List fa = this.KK.fa(lineAtOffset);
        if (fa == null) {
            return;
        }
        final StyleRange[] styles = new StyleRange[fa.size()];
        int n = 0;
        final Iterator<hv> iterator = fa.iterator();
        while (iterator.hasNext()) {
            styles[n++] = ((YJ)iterator.next()).QE(offsetAtLine);
        }
        lineStyleEvent.styles = styles;
    }
    
    public void caretMoved(final CaretEvent caretEvent) {
        if (this.rK) {
            return;
        }
        final int caretOffset = caretEvent.caretOffset;
        if (this.QE >= 0) {
            this.zs.setLineBackground(this.QE, 1, (Color)null);
        }
        this.Hw = caretOffset;
        this.QE = this.zs.getLineAtOffset(caretOffset);
        this.wU = caretOffset - this.zs.getOffsetAtLine(this.QE);
        this.zs.setLineBackground(this.QE, 1, this.LH.QE());
        if (this.KK == null) {
            return;
        }
        YJ yj = null;
        final List fa = this.KK.fa(this.QE);
        if (fa != null) {
            for (final hv hv : fa) {
                if (this.wU >= hv.QE() && this.wU < hv.wU()) {
                    yj = (YJ)hv;
                    break;
                }
            }
        }
        if (yj == this.cb || this.PF.contains(yj)) {
            this.cb = yj;
            return;
        }
        final Iterator<YJ> iterator2 = this.PF.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().dN(false);
        }
        this.PF.clear();
        this.cb = null;
        if (yj != null) {
            this.cb = yj;
            if (this.cb.LH()) {
                this.cb.dN(true);
                this.PF.add(this.cb);
                final Object zs = this.cb.zs();
                if (zs != null) {
                    for (final YJ yj2 : this.EO.get(zs)) {
                        if (!zs.equals(yj2.zs())) {
                            throw new RuntimeException();
                        }
                        yj2.dN(true);
                        this.PF.add(yj2);
                    }
                }
            }
        }
        this.cb();
        this.zs.redraw();
    }
    
    public void cb() {
        for (final as as : this.ZY) {
            this.Ux.ld(as, as.OK());
        }
    }
    
    public void PF() {
        final Iterator<as> iterator = this.ZY.iterator();
        while (iterator.hasNext()) {
            this.Ux.ld(iterator.next(), false);
        }
    }
    
    public void dN(final String s) {
        if (this.KK == null) {
            return;
        }
        this.rK = true;
        final int length = s.length();
        int n = 0;
        final int[] ms = this.KK.mS();
        for (int length2 = ms.length, i = 0; i < length2; ++i) {
            final List fa = this.KK.fa(i);
            if (fa != null) {
                final int n2 = n;
                for (int j = 0; j < fa.size(); ++j) {
                    final hv hv = fa.get(j);
                    if (this.PF.contains(hv)) {
                        final int n3 = ms[i] + n2 + hv.QE();
                        final int ld = hv.ld();
                        this.zs.replaceTextRange(n3, ld, s);
                        n += length - ld;
                        this.KK.dN(i, j, s);
                    }
                }
            }
        }
        this.rK = false;
        this.zs.redraw();
    }
    
    @Override
    public void verifyKey(final VerifyEvent verifyEvent) {
        for (final as as : this.ZY) {
            if (as.QE() == verifyEvent.keyCode && as.wU() == verifyEvent.stateMask) {
                as.LH();
            }
        }
        for (final as as2 : this.ZY) {
            if (as2.fa() == verifyEvent.keyCode && as2.zs() == verifyEvent.stateMask) {
                as2.LH();
            }
        }
        final int keyCode = verifyEvent.keyCode;
        super.verifyKey(verifyEvent);
    }
    
    public void keyTraversed(final TraverseEvent traverseEvent) {
        if (traverseEvent.detail == 16) {
            traverseEvent.doit = false;
        }
    }
    
    public void mouseDown(final MouseEvent mouseEvent) {
    }
    
    public void mouseUp(final MouseEvent mouseEvent) {
    }
    
    public void mouseDoubleClick(final MouseEvent mouseEvent) {
        this.s.LH();
    }
    
    @Override
    public boolean dN(final int n) {
        return this.dN(n, true);
    }
    
    public boolean dN(final int n, final boolean b) {
        final LW lw = new LW(this.QE, this.wU);
        if (!super.dN(n)) {
            return false;
        }
        if (b) {
            this.fa.dN(lw);
        }
        this.cb();
        return true;
    }
    
    @Override
    public boolean ld(final int n) {
        return this.ld(n, true);
    }
    
    public boolean ld(final int n, final boolean b) {
        final LW lw = new LW(this.QE, this.wU);
        if (!super.ld(n)) {
            return false;
        }
        if (b) {
            this.fa.dN(lw);
        }
        this.cb();
        return true;
    }
    
    public boolean dN(final LW lw, final boolean b) {
        return this.ld(this.zs.getOffsetAtLine(lw.dN()) + lw.ld(), b);
    }
    
    public boolean ld(final Object o) {
        final List dn = this.dN(o);
        if (dn != null && !dn.isEmpty()) {
            final List ld = this.ld(dn.get(0));
            if (ld != null && !ld.isEmpty()) {
                return this.dN(ld.get(0), true);
            }
        }
        return false;
    }
}
