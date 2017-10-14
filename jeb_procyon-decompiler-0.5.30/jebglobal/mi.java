// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class mi extends II implements Xf
{
    private Fu dN;
    private List ld;
    private boolean QE;
    
    public mi(final Fu fu, final boolean b) {
        this.dN(fu, b);
        this.ld = new ArrayList();
    }
    
    public mi(final Fu fu, final boolean b, final List list) {
        this(fu, b);
        this.ld.addAll(list);
    }
    
    public Fu dN() {
        return this.dN;
    }
    
    public void dN(final Fu dn, final boolean qe) {
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.QE = qe;
    }
    
    public boolean ld() {
        return this.QE;
    }
    
    public int zs() {
        return this.ld.size();
    }
    
    public List mS() {
        return this.ld;
    }
    
    public void dN(final Xf xf) {
        if (xf == null) {
            throw new IllegalArgumentException();
        }
        this.ld.add(xf);
    }
    
    public void dN(final int n, final Xf xf) {
        if (xf == null) {
            throw new IllegalArgumentException();
        }
        this.ld.set(n, xf);
    }
    
    public void ld(final int n, final Xf xf) {
        if (xf == null) {
            throw new IllegalArgumentException();
        }
        this.ld.add(n, xf);
    }
    
    public Xf ld(final int n) {
        return this.ld.remove(n);
    }
    
    @Override
    public List wU() {
        return TM.dN(TM.dN(this.dN), this.ld);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (Fu)ik2;
            return true;
        }
        for (int i = 0; i < this.ld.size(); ++i) {
            if (this.ld.get(i) == ik) {
                this.ld.set(i, ik2);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.ld(zl);
        boolean b = true;
        String s = this.dN.mS();
        final int qe = this.dN.QE();
        Object ms = this;
        if (s.equals("<init>")) {
            s = "super";
            if (zl.dN() != null) {
                final String zs = this.dN.zs();
                final String ld = zl.dN().ld();
                if (zs != null && ld != null && zs.equals(ld)) {
                    s = "this";
                }
            }
            b = false;
            if (zl.OK != null && qe >= 0) {
                ms = zl.OK.mS(qe);
            }
        }
        else if (zl.OK != null && qe >= 0) {
            final hO ms2 = zl.OK.mS(qe);
            s = ms2.ld(true);
            ms = ms2;
        }
        int n;
        if (this.dN.cb()) {
            final zd lh = this.dN.LH();
            if (lh != null) {
                oc.dN(zl, lh.fa());
            }
            else {
                zl.wU(this.dN.zs());
            }
            zl.wU(".");
            n = 0;
        }
        else {
            if (b) {
                if (this.QE) {
                    zl.dN(oc.Hv);
                }
                else {
                    this.ld.get(0).dN(zl);
                }
                zl.wU(".");
            }
            n = 1;
        }
        zl.dN(s, Zh.ZY, ms);
        zl.wU("(");
        for (int i = n; i < this.ld.size(); ++i) {
            if (i > n) {
                zl.wU(", ");
            }
            ((Xf)this.ld.get(i)).dN(zl);
        }
        zl.wU(")");
    }
}
