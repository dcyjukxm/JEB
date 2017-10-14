// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public abstract class tu implements GS
{
    hV dN;
    
    public hV dN() {
        return this.dN;
    }
    
    final boolean dN(final hV hv) {
        if (this.dN == null) {
            if (hv.EO()) {
                this.dN = hv;
                return true;
            }
        }
        else if (this.dN.ld(hv)) {
            if (!hv.equals(this.dN)) {
                this.dN = hv;
                return true;
            }
            return false;
        }
        else {
            if (this.dN.zs() && hv.zs()) {
                return false;
            }
            if (hv == hV.cb && this.dN.PF()) {
                return false;
            }
        }
        return false;
    }
    
    abstract hV dN(final int p0);
    
    abstract boolean dN(final int p0, final hV p1);
    
    abstract boolean ld();
    
    abstract boolean QE();
    
    abstract int dN(final xy p0);
    
    abstract int dN(final xy p0, final tu p1);
    
    abstract int dN(final xy p0, final long p1);
    
    void dN(final hV hv, final hV dn) {
        if (this.dN.equals(hv)) {
            this.dN = dn;
        }
    }
    
    public abstract List wU();
    
    public abstract boolean dN(final tu p0, final tu p1);
    
    abstract Xf dN(final TB p0);
}
