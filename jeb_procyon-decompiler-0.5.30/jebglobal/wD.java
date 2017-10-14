// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class wD extends cI implements Rx
{
    private Xf dN;
    private Xf ld;
    
    public wD(final Xf dn, final Xf ld) {
        if (dn == null || ld == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
    }
    
    public Xf ld() {
        return this.dN;
    }
    
    public Xf QE() {
        return this.ld;
    }
    
    public void dN(final Xf dn) {
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
    }
    
    public void ld(final Xf ld) {
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 + this.dN.hashCode()) + this.ld.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final wD wd = (wD)o;
        return this.dN.equals(wd.dN) && this.ld.equals(wd.ld);
    }
    
    @Override
    public List wU() {
        return TM.dN(this.dN, this.ld);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (Xf)ik2;
            return true;
        }
        if (this.ld == ik) {
            this.ld = (Xf)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.a_(zl);
        this.dN.dN(zl);
        zl.wU("[");
        this.ld.dN(zl);
        zl.wU("]");
    }
}
