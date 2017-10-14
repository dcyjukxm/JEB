// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.Collection;
import java.util.HashSet;

public final class fG extends Ts
{
    private tu ld;
    private tu QE;
    
    public fG(final tu ld, final tu qe, final hV dn) {
        if (ld == null || qe == null || dn == null) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
        this.QE = qe;
        this.dN = dn;
    }
    
    public tu zs() {
        return this.ld;
    }
    
    public tu mS() {
        return this.QE;
    }
    
    @Override
    public HashSet fa() {
        final HashSet set = new HashSet();
        set.addAll(this.ld.fa());
        set.addAll(this.QE.fa());
        return set;
    }
    
    @Override
    hV dN(final int n) {
        final hV dn = this.ld.dN(n);
        final hV dn2 = this.QE.dN(n);
        if (!dn.EO()) {
            return dn2;
        }
        if (!dn2.EO()) {
            return dn;
        }
        if (dn != dn2) {
            throw new RuntimeException();
        }
        return dn2;
    }
    
    @Override
    boolean dN(final int n, final hV hv) {
        final boolean dn = this.ld.dN(n, hv);
        if (dn) {
            final hV dn2 = this.ld.dN();
            if (dn2 != null && dn2.OK()) {
                this.dN(dn2.wU());
            }
        }
        final boolean dn3 = this.QE.dN(n, hv);
        return dn || dn3;
    }
    
    public boolean ld() {
        return this.ld.ld() || this.QE.ld();
    }
    
    public boolean QE() {
        return true;
    }
    
    @Override
    int dN(final xy xy) {
        return 0 + this.ld.dN(xy) + this.QE.dN(xy);
    }
    
    @Override
    int dN(final xy xy, final tu tu) {
        int n = 0;
        if (this.ld instanceof xy) {
            if (xy.ld((xy)this.ld)) {
                this.ld = tu;
                ++n;
            }
        }
        else {
            n = 0 + this.ld.dN(xy, tu);
        }
        if (this.QE instanceof xy) {
            if (xy.ld((xy)this.QE)) {
                this.QE = tu;
                ++n;
            }
        }
        else {
            n += this.QE.dN(xy, tu);
        }
        return n;
    }
    
    @Override
    int dN(final xy xy, final long n) {
        int n2 = 0;
        if (this.QE instanceof xy) {
            if (xy.QE((xy)this.QE)) {
                final hV dn = this.QE.dN();
                if (ie.ld(dn)) {
                    this.QE = new ie(n, dn);
                    ++n2;
                }
            }
        }
        else {
            n2 = 0 + this.QE.dN(xy, n);
        }
        return n2;
    }
    
    @Override
    void dN(final hV hv, final hV hv2) {
        super.dN(hv, hv2);
        this.ld.dN(hv, hv2);
        this.QE.dN(hv, hv2);
    }
    
    @Override
    public List wU() {
        return ZF.dN(this.ld, this.QE);
    }
    
    @Override
    public boolean dN(final tu tu, final tu tu2) {
        if (this.ld == tu) {
            this.ld = tu2;
            return true;
        }
        if (this.QE == tu) {
            this.QE = tu2;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("(%s[%s])<%s>", this.ld, this.QE, this.dN);
    }
    
    public Xf dN(final TB tb) {
        return new wD(this.ld.dN(tb), this.QE.dN(tb));
    }
}
