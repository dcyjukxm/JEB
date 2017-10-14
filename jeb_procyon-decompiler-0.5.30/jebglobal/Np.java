// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class Np extends cI implements Rx
{
    private hV dN;
    private Dw ld;
    
    public Np(final hV dn, final Dw ld) {
        if (ld == null || (ld.fa() == -1 && dn == null)) {
            throw new IllegalArgumentException();
        }
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
    }
    
    public hV ld() {
        return this.dN;
    }
    
    public Dw QE() {
        return this.ld;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 + ((this.dN == null) ? 0 : this.dN.hashCode())) + this.ld.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Np np = (Np)o;
        if (this.dN == null) {
            if (np.dN != null) {
                return false;
            }
        }
        else if (!this.dN.equals(np.dN)) {
            return false;
        }
        return this.ld.equals(np.ld);
    }
    
    @Override
    public List wU() {
        return TM.dN(this.ld);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.ld == ik) {
            this.ld = (Dw)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.a_(zl);
        oc.dN(zl, this.dN);
        zl.wU(".");
        this.ld.dN(zl, false);
    }
}
