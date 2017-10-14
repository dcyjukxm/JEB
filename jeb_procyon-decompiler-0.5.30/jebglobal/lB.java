// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.Collection;
import java.util.HashSet;

public class lB extends tu
{
    private tu ld;
    private kn QE;
    private tu wU;
    private boolean fa;
    
    public lB(final tu ld, final kn qe, final tu wu) {
        if (wu == null || qe == null) {
            throw new RuntimeException();
        }
        if (ld == null && qe.QE()) {
            throw new RuntimeException();
        }
        if (ld != null && qe.ld()) {
            throw new RuntimeException();
        }
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = this.KK();
        if (qe.fa()) {
            this.dN = hV.ld;
        }
        else {
            this.LH();
            if (this.dN == null || this.dN == hV.dN) {
                throw new RuntimeException();
            }
        }
    }
    
    public tu zs() {
        return this.ld;
    }
    
    public kn mS() {
        return this.QE;
    }
    
    public tu OK() {
        return this.wU;
    }
    
    @Override
    public HashSet fa() {
        final HashSet set = new HashSet();
        set.addAll(this.wU.fa());
        if (this.ld != null) {
            set.addAll(this.ld.fa());
        }
        return set;
    }
    
    @Override
    hV dN(final int n) {
        final hV dn = this.wU.dN(n);
        if (this.ld == null) {
            return dn;
        }
        final hV dn2 = this.ld.dN(n);
        if (!dn2.EO()) {
            return dn;
        }
        if (!dn.EO()) {
            return dn2;
        }
        if (!dn.dN(dn2)) {
            throw new RuntimeException();
        }
        return dn;
    }
    
    @Override
    boolean dN(final int n, final hV hv) {
        final boolean dn = this.wU.dN(n, hv);
        boolean dn2 = false;
        if (this.ld != null) {
            dn2 = this.ld.dN(n, hv);
        }
        if (dn || dn2) {
            this.LH();
        }
        return dn;
    }
    
    private void LH() {
        if (this.QE == kn.s) {
            return;
        }
        hV hv = this.wU.dN();
        hV hv2 = (this.ld == null) ? hV.dN : this.ld.dN();
        if (hv2 != hV.dN) {
            hV cb = hv;
            if (hv.PF()) {
                cb = hV.cb;
            }
            hV cb2 = hv2;
            if (hv2.PF()) {
                cb2 = hV.cb;
            }
            if (cb2.ld(cb)) {
                this.ld.dN(cb);
                hv2 = this.ld.dN();
            }
            else if (cb.ld(cb2)) {
                this.wU.dN(cb2);
                hv = this.wU.dN();
            }
        }
        if (hv.PF()) {
            hv = hV.zs;
        }
        if (hv2.PF()) {
            hv2 = hV.zs;
        }
        if (this.QE.wU()) {
            if (hv2 == hV.dN) {
                this.dN(hv);
            }
            else if (this.fa) {
                this.dN(hV.mS);
            }
            else {
                if (hv2 != hv) {
                    throw new RuntimeException();
                }
                this.dN(hv);
            }
        }
        else if (!this.QE.fa()) {
            if (!this.QE.zs()) {
                throw new RuntimeException();
            }
            hV hv3;
            if (this.QE == kn.De) {
                hv3 = hV.QE;
            }
            else if (this.QE == kn.rn) {
                hv3 = hV.wU;
            }
            else if (this.QE == kn.LR) {
                hv3 = hV.fa;
            }
            else if (this.QE == kn.Nh) {
                hv3 = hV.zs;
            }
            else if (this.QE == kn.XZ) {
                hv3 = hV.mS;
            }
            else if (this.QE == kn.nA) {
                hv3 = hV.OK;
            }
            else if (this.QE == kn.Ai) {
                hv3 = hV.LH;
            }
            else {
                if (this.QE != kn.uM) {
                    throw new RuntimeException();
                }
                hv3 = hV.ld;
            }
            this.dN(hv3);
        }
    }
    
    private boolean KK() {
        return this.ld != null && this.ld.dN == hV.mS && (this.QE == kn.LH || this.QE == kn.KK || this.QE == kn.EO);
    }
    
    public boolean ld() {
        return (this.ld != null && this.ld.ld()) || this.wU.ld();
    }
    
    public boolean QE() {
        return (this.ld != null && this.ld.QE()) || this.wU.QE();
    }
    
    @Override
    int dN(final xy xy) {
        int n = 0;
        if (this.ld != null) {
            n = 0 + this.ld.dN(xy);
        }
        return n + this.wU.dN(xy);
    }
    
    @Override
    int dN(final xy xy, final tu tu) {
        int n = 0;
        if (this.ld instanceof xy) {
            if (((xy)this.ld).ld(xy)) {
                this.ld = tu;
                ++n;
            }
        }
        else if (this.ld != null) {
            n = 0 + this.ld.dN(xy, tu);
        }
        if (this.wU instanceof xy) {
            if (xy.ld((xy)this.wU)) {
                this.wU = tu;
                ++n;
            }
        }
        else {
            n += this.wU.dN(xy, tu);
        }
        return n;
    }
    
    @Override
    int dN(final xy xy, final long n) {
        int n2 = 0;
        if (this.ld instanceof xy) {
            if (((xy)this.ld).QE(xy)) {
                final hV dn = this.ld.dN();
                if (ie.ld(dn)) {
                    this.ld = new ie(n, dn);
                    ++n2;
                }
            }
        }
        else if (this.ld != null) {
            n2 = 0 + this.ld.dN(xy, n);
        }
        if (this.wU instanceof xy) {
            if (xy.QE((xy)this.wU)) {
                final hV dn2 = this.wU.dN();
                if (ie.ld(dn2)) {
                    this.wU = new ie(n, dn2);
                    ++n2;
                }
            }
        }
        else {
            n2 += this.wU.dN(xy, n);
        }
        return n2;
    }
    
    @Override
    void dN(final hV hv, final hV hv2) {
        super.dN(hv, hv2);
        if (this.ld != null) {
            this.ld.dN(hv, hv2);
        }
        this.wU.dN(hv, hv2);
    }
    
    @Override
    public List wU() {
        return ZF.dN(this.ld, this.wU);
    }
    
    @Override
    public boolean dN(final tu tu, final tu tu2) {
        if (this.ld == tu) {
            this.ld = tu2;
            return true;
        }
        if (this.wU == tu) {
            this.wU = tu2;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        if (this.ld == null) {
            return String.format("(%s%s)<%s>", this.QE, this.wU, this.dN);
        }
        return String.format("(%s %s %s)<%s>", this.ld, this.QE, this.wU, this.dN);
    }
    
    public Xf dN(final TB tb) {
        Xf dn = null;
        if (this.ld != null) {
            dn = this.ld.dN(tb);
        }
        return new Gy(dn, this.QE, this.wU.dN(tb));
    }
}
