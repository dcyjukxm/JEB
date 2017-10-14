// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public final class Dw extends cI
{
    private AR dN;
    private boolean ld;
    private int QE;
    private String wU;
    private hV fa;
    private int zs;
    private Xf mS;
    private List OK;
    
    private Dw(final AR dn, final hV.uK uk, final OX.vd vd, final GH gh, final boolean ld, final int qe, final String s, final String wu, final hV fa, final int zs) {
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.fa = fa;
        this.wU = wu;
        this.zs = zs;
        if (ld) {
            return;
        }
        if (gh != null) {
            this.OK = new ArrayList();
            final xd hv = dn.EO(dn.fa(qe).dN(false)).Hv();
            if (hv != null) {
                for (final xd.lX lx : hv.ld()) {
                    if (lx.dN() == qe) {
                        for (final xd.uK uk2 : lx.ld().ld()) {
                            if (uk2.dN() != 2) {
                                final lM lm = new lM(uk.dN(dn.dN(uk2.ld().dN(), false)));
                                for (final kg.uK uk3 : uk2.ld().ld()) {
                                    lm.dN(vd.dN(dn.dN(uk3.dN())), gh.dN(uk3.ld()));
                                }
                                this.OK.add(lm);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    public boolean ld() {
        return (this.zs & 0x8) != 0x0;
    }
    
    public boolean QE() {
        return (this.zs & 0x1000) != 0x0;
    }
    
    public int fa() {
        return this.QE;
    }
    
    public String zs() {
        return this.wU;
    }
    
    public String mS() {
        return this.dN.fa(this.QE).fa(false);
    }
    
    public hV OK() {
        return this.fa;
    }
    
    public void dN(final Xf ms) {
        this.mS = ms;
    }
    
    public Xf LH() {
        return this.mS;
    }
    
    public void ld(final ZL zl) {
        if (this.ld) {
            throw new RuntimeException();
        }
        this.a_(zl);
        zl.KK.push(new js(hY.QE, this.QE));
        if (this.OK != null && zl.mS) {
            zl.dN(this.OK);
        }
        oc.QE(zl, this.zs, -1);
        oc.dN(zl, this.fa);
        zl.wU(" ");
        this.dN(zl, true);
        if (this.mS != null) {
            zl.wU(" = ");
            this.mS.dN(zl);
        }
        zl.wU(";");
        if (zl.LH != null) {
            zl.ld(zl.LH.zs(this.QE));
        }
        zl.QE(-2);
        zl.QE();
        zl.KK.pop();
    }
    
    public void dN(final ZL zl, final boolean b) {
        String s = this.wU;
        Dw dw = this;
        if (zl.OK != null) {
            final gE fa = zl.OK.fa(this.QE);
            if (fa != null) {
                s = fa.QE(true);
                dw = (Dw)fa;
            }
        }
        zl.dN(s, Zh.Ux, b ? 1 : 0, dw, null);
    }
    
    @Override
    public List wU() {
        return TM.dN(this.mS);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.mS == ik) {
            this.mS = (Xf)ik2;
            return true;
        }
        return false;
    }
    
    public static final class uK
    {
        private AR dN;
        private hV.uK ld;
        private zd.uK QE;
        private OX.vd wU;
        private GH fa;
        private HashMap zs;
        
        public uK(final AR dn, final hV.uK ld, final zd.uK qe, final OX.vd wu) {
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
            this.wU = wu;
            this.zs = new HashMap();
        }
        
        public void dN(final GH fa) {
            this.fa = fa;
        }
        
        public Dw dN(final int n) {
            Dw dw = this.zs.get(n);
            if (dw == null) {
                boolean b = true;
                gE fa = null;
                hV dn = null;
                int ld = 0;
                String dn2;
                String qe;
                if (n == -1) {
                    dn2 = "";
                    qe = "class";
                    ld = 8;
                }
                else if (n == -2) {
                    dn2 = "";
                    qe = "length";
                }
                else {
                    if (n < 0) {
                        throw new RuntimeException();
                    }
                    fa = this.dN.fa(n);
                    dn2 = fa.dN(false);
                    qe = fa.QE(false);
                }
                if (fa != null) {
                    final XV dn3 = this.dN.dN(fa.fa(false));
                    dn = hV.dN(fa.ld(false), this.ld);
                    if (dn3 != null) {
                        ld = dn3.ld();
                        b = false;
                    }
                }
                dw = new Dw(this.dN, this.ld, this.wU, this.fa, b, n, dn2, qe, dn, ld, null);
                this.zs.put(n, dw);
                if (!b && this.fa != null) {
                    final ub zs = this.dN.zs(n);
                    if (zs != null) {
                        dw.dN(this.fa.dN(zs));
                    }
                }
                if (!b) {
                    final zd dn4 = this.QE.dN(dn2);
                    if (dn4 != null) {
                        dn4.dN(dw);
                    }
                }
            }
            return dw;
        }
    }
}
