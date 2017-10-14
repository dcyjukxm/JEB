// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayDeque;
import java.util.Deque;

public final class ZL extends xc
{
    private zd.uK EO;
    private zd cb;
    boolean dN;
    boolean ld;
    boolean QE;
    boolean wU;
    boolean fa;
    boolean zs;
    boolean mS;
    AR OK;
    ew LH;
    private int PF;
    Deque KK;
    private int Hw;
    private OD rK;
    
    public ZL(final jt jt) {
        super(jt);
        this.EO = null;
        this.cb = null;
        this.dN = false;
        this.ld = false;
        this.QE = false;
        this.wU = false;
        this.fa = false;
        this.zs = true;
        this.mS = true;
        this.KK = new ArrayDeque();
        this.Hw = -1;
        this.rK = null;
        this.ld("    ");
    }
    
    public ZL() {
        this(new BQ());
    }
    
    public void dN(final boolean ld) {
        this.ld = ld;
    }
    
    public void ld(final boolean qe) {
        this.QE = qe;
    }
    
    public void QE(final boolean wu) {
        this.wU = wu;
    }
    
    public void wU(final boolean dn) {
        this.dN = dn;
    }
    
    public void fa(final boolean fa) {
        this.fa = fa;
    }
    
    public void zs(final boolean zs) {
        this.zs = zs;
    }
    
    public void mS(final boolean ms) {
        this.mS = ms;
    }
    
    public void dN(final zd cb) {
        this.cb = cb;
    }
    
    public zd dN() {
        return this.cb;
    }
    
    public void dN(final AR ok) {
        this.OK = ok;
    }
    
    public void dN(final ew lh) {
        this.LH = lh;
    }
    
    public void dN(final zd.uK eo) {
        this.EO = eo;
    }
    
    public zd dN(final hV hv) {
        if (this.EO == null) {
            return null;
        }
        if (!hv.mS()) {
            return null;
        }
        return this.EO.dN(hv.dN());
    }
    
    void dN(final int pf) {
        this.PF = pf;
    }
    
    int ld() {
        return this.PF;
    }
    
    private PL KK(final int n) {
        PL pl = null;
        if (!this.KK.isEmpty()) {
            final js js = this.KK.peek();
            pl = new PL(js.dN(), js.ld(), n);
        }
        return pl;
    }
    
    @Override
    public void QE() {
        this.ld(this.Hw);
    }
    
    public void ld(final int n) {
        this.Hw = -1;
        if (this.rK != null) {
            this.dN(this.rK);
            this.rK = null;
        }
        super.dN(this.KK(n));
    }
    
    void dN(final oc oc) {
        this.dN(oc.toString().toLowerCase(), Zh.zs, oc);
    }
    
    void dN(final OD od) {
        if (od != null) {
            final String pf = od.PF();
            final byte[] hw = od.Hw();
            if (pf != null || hw != null) {
                this.dN("  //" + ((hw != null) ? "(!) " : " ") + ((pf != null) ? pf : ""), Zh.ld);
            }
        }
    }
    
    void QE(final int hw) {
        this.Hw = hw;
    }
    
    void ld(final OD rk) {
        this.rK = rk;
    }
    
    public String dN(final int n, String qe, final byte[] array) {
        if (qe != null && qe.indexOf(10) >= 0) {
            qe = ZF.QE(qe, true);
        }
        String s;
        if (qe == null && array == null) {
            s = "";
        }
        else if (qe != null && array == null) {
            s = "  // " + qe;
        }
        else if (qe == null && array != null) {
            s = "  //(!)";
        }
        else {
            s = "  //(!) " + qe;
        }
        final List fa = this.fa(n);
        if (fa != null && !fa.isEmpty() && fa.get(fa.size() - 1).dN() == Zh.ld) {
            this.dN(n, fa.size() - 1, s);
        }
        else {
            this.dN(n, s, Zh.ld, 0, null, null);
        }
        return s;
    }
    
    void dN(final List list) {
        for (final lM lm : list) {
            this.wU("@");
            oc.dN(this, lm.dN());
            final List ld = lm.ld();
            if (!ld.isEmpty()) {
                this.wU("(");
                int n = 0;
                for (final lM.uK uk : ld) {
                    if (n++ > 0) {
                        this.wU(", ");
                    }
                    this.wU(uk.dN().cb());
                    this.wU("=");
                    uk.ld().dN(this);
                }
                this.wU(")");
            }
            this.s();
        }
    }
}
