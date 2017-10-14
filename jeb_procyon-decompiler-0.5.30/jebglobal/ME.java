// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public final class ME extends xc
{
    boolean dN;
    int ld;
    int QE;
    String wU;
    String fa;
    boolean zs;
    boolean mS;
    boolean OK;
    boolean LH;
    boolean KK;
    boolean EO;
    Nz cb;
    HashMap PF;
    List Hw;
    List rK;
    List Ux;
    ew ZY;
    
    public ME(final jt jt) {
        super(jt);
        this.dN = true;
        this.ld = 0;
        this.QE = 0;
        this.wU = null;
        this.fa = null;
        this.zs = true;
        this.mS = false;
        this.OK = false;
        this.LH = false;
        this.KK = false;
        this.EO = false;
        this.cb = null;
        this.PF = new HashMap();
        this.Hw = new ArrayList();
        this.rK = new ArrayList();
        this.Ux = new ArrayList();
        this.ld("    ");
    }
    
    public ME() {
        this(new BQ());
    }
    
    public void dN(final ew zy) {
        this.ZY = zy;
    }
    
    public void dN(final boolean dn) {
        this.dN = dn;
    }
    
    public void dN(final int ld) {
        this.ld = ld;
    }
    
    public void ld(final int qe) {
        this.QE = qe;
    }
    
    public void dN(final char c, final int n) {
        this.wU = this.ld(c, n);
    }
    
    private String ld(final char c, final int n) {
        if (!Character.isDefined(c) || n <= 0) {
            return null;
        }
        final StringBuffer sb = new StringBuffer("#");
        for (int i = 0; i < n; ++i) {
            sb.append(c);
        }
        return sb.toString();
    }
    
    public void ld(final boolean zs) {
        this.zs = zs;
    }
    
    public void QE(final boolean ms) {
        this.mS = ms;
    }
    
    public void wU(final boolean ok) {
        if (ok) {
            this.mS = true;
        }
        this.OK = ok;
    }
    
    public void fa(final boolean lh) {
        this.LH = lh;
    }
    
    public void zs(final boolean kk) {
        this.KK = kk;
    }
    
    public void mS(final boolean eo) {
        this.EO = eo;
    }
    
    public void dN(final Nz cb) {
        this.cb = cb;
    }
    
    public int dN(final String s) {
        final Integer n = this.PF.get(s);
        if (n == null) {
            return -1;
        }
        return n;
    }
    
    private String dN(final List list, final int n) {
        for (final uK uk : list) {
            if (n >= uk.dN && n < uk.ld) {
                return uk.QE;
            }
        }
        return null;
    }
    
    public String QE(final int n) {
        return this.dN(this.Hw, n);
    }
    
    public String KK(final int n) {
        return this.dN(this.rK, n);
    }
    
    public String EO(final int n) {
        return this.dN(this.Ux, n);
    }
    
    void dN(final CQ cq) {
        this.dN(cq.toString().replace('_', '-').toLowerCase(), Zh.zs, cq);
    }
    
    void dN(final rT rt) {
        this.dN("." + rt.toString().replace("__", "-").replace('_', ' ').toLowerCase(), Zh.fa, rt);
    }
    
    void dN(final DL dl) {
        this.dN("." + dl.toString().replace("__", "-").replace('_', ' ').toLowerCase(), Zh.fa, dl);
    }
    
    void dN(final AR ar, final int n) {
        final String ld = ar.ld(n);
        this.dN(String.format("\"%s\"", ZF.QE(ld, !this.EO)), Zh.Hw, ld);
    }
    
    void ld(final AR ar, final int n) {
        final hO ms = ar.mS(n);
        this.dN(ar, ms.zs());
        this.wU("->");
        this.dN(ms.ld(true), Zh.ZY, ms);
        this.dN(ar, ms.OK());
    }
    
    void QE(final AR ar, final int n) {
        final gE fa = ar.fa(n);
        this.dN(ar, fa.zs());
        this.wU("->");
        this.dN(fa.QE(true), Zh.Ux, fa);
        this.wU(":");
        this.dN(ar, fa.mS());
    }
    
    void dN(final AR ar, final Bw bw) {
        this.wU("(");
        if (!this.EO) {
            int n = 0;
            for (final nh.vd vd : bw.mS()) {
                if (n >= 1) {
                    this.wU(", ");
                }
                this.dN(ar, vd);
                ++n;
            }
        }
        else {
            final nh.vd[] ms2 = bw.mS();
            for (int length2 = ms2.length, j = 0; j < length2; ++j) {
                this.dN(ar, ms2[j]);
            }
        }
        this.wU(")");
        this.dN(ar, bw.fa());
    }
    
    void dN(final AR ar, final nh.vd vd, final boolean b) {
        final String zs = vd.zs();
        if (zs != null) {
            final Object kk = ar.KK(zs);
            for (int i = 0; i < vd.wU(); ++i) {
                this.wU("[");
            }
            String s;
            Zh zh;
            if (kk instanceof yK) {
                s = ((yK)kk).ld(true);
                zh = Zh.rK;
            }
            else {
                s = zs;
                zh = Zh.s;
            }
            if (!this.EO) {
                final String substring = s.substring(1, s.length() - 1);
                s = substring.substring(substring.lastIndexOf(47) + 1);
            }
            this.dN(s, zh, b ? 1 : 0, kk, null);
        }
        else {
            this.wU(vd.dN(true));
        }
    }
    
    void dN(final AR ar, final nh.vd vd) {
        this.dN(ar, vd, false);
    }
    
    void dN(final AR ar, final int n, final boolean b) {
        this.dN(ar, ar.QE(n), b);
    }
    
    void wU(final AR ar, final int n) {
        this.dN(ar, ar.QE(n), false);
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
            s = "  # " + qe;
        }
        else if (qe == null && array != null) {
            s = "  #(!)";
        }
        else {
            s = "  #(!) " + qe;
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
    
    public static final class uK
    {
        int dN;
        int ld;
        String QE;
        
        public uK(final String qe, final int dn, final int ld) {
            this.QE = qe;
            this.dN = dn;
            this.ld = ld;
        }
    }
}
