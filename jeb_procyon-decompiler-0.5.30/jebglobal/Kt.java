// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.Collection;
import java.util.HashSet;

public final class Kt extends Ts
{
    private tu ld;
    private YK QE;
    private String wU;
    
    public Kt(final tu ld, final YK qe, final hV dn, final String wu) {
        if ((qe == null && !"length".equals(wu)) || ld == null || dn == null) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
        this.QE = qe;
        this.dN = dn;
        this.wU = wu;
    }
    
    @Override
    public HashSet fa() {
        final HashSet set = new HashSet();
        set.addAll(this.ld.fa());
        return set;
    }
    
    @Override
    hV dN(final int n) {
        return this.ld.dN(n);
    }
    
    @Override
    boolean dN(final int n, final hV hv) {
        return this.ld.dN(n, hv);
    }
    
    public boolean ld() {
        return this.ld.ld();
    }
    
    public boolean QE() {
        return true;
    }
    
    @Override
    int dN(final xy xy) {
        return this.ld.dN(xy);
    }
    
    @Override
    int dN(final xy xy, final tu ld) {
        int n = 0;
        if (this.ld instanceof xy) {
            if (xy.ld((xy)this.ld)) {
                this.ld = ld;
                ++n;
            }
        }
        else {
            n = 0 + this.ld.dN(xy, ld);
        }
        return n;
    }
    
    @Override
    int dN(final xy xy, final long n) {
        return 0;
    }
    
    @Override
    void dN(final hV hv, final hV hv2) {
        super.dN(hv, hv2);
        this.ld.dN(hv, hv2);
    }
    
    @Override
    public List wU() {
        return ZF.dN(this.ld);
    }
    
    @Override
    public boolean dN(final tu tu, final tu ld) {
        if (this.ld == tu) {
            this.ld = ld;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        if (this.wU == null) {
            return String.format("%s.%s<%s>", this.ld, this.QE, this.dN);
        }
        return String.format("%s.%s<%s>", this.ld, this.wU, this.dN);
    }
    
    public Xf dN(final TB tb) {
        return new CZ(this.ld.dN(tb), tb.OK.dN((this.QE == null) ? -2 : this.QE.dN()));
    }
}
