// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.HashSet;

public final class np extends Ts
{
    private YK ld;
    private String QE;
    private String wU;
    
    public np(final YK ld, final hV dn, final String qe, final String wu) {
        if ((ld == null && !"class".equals(wu)) || dn == null || qe == null) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
        this.dN = dn;
        this.QE = qe;
        this.wU = wu;
    }
    
    @Override
    public HashSet fa() {
        return new HashSet();
    }
    
    @Override
    hV dN(final int n) {
        return hV.dN;
    }
    
    @Override
    boolean dN(final int n, final hV hv) {
        return false;
    }
    
    public boolean ld() {
        return false;
    }
    
    public boolean QE() {
        return true;
    }
    
    @Override
    int dN(final xy xy) {
        return 0;
    }
    
    @Override
    int dN(final xy xy, final tu tu) {
        return 0;
    }
    
    @Override
    int dN(final xy xy, final long n) {
        return 0;
    }
    
    @Override
    void dN(final hV hv, final hV hv2) {
        super.dN(hv, hv2);
    }
    
    @Override
    public List wU() {
        return ZF.dN(new tu[0]);
    }
    
    @Override
    public boolean dN(final tu tu, final tu tu2) {
        return false;
    }
    
    @Override
    public String toString() {
        if (this.wU == null) {
            return String.format("%s->%s<%s>", this.QE, this.ld, this.dN);
        }
        return String.format("%s->%s<%s>", this.QE, this.wU, this.dN);
    }
    
    public Xf dN(final TB tb) {
        return new Np(hV.dN(this.QE, tb.wU), tb.OK.dN((this.ld == null) ? -1 : this.ld.dN()));
    }
}
