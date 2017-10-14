// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class rY extends cI implements Xf
{
    private Xf dN;
    private Xf ld;
    private Xf QE;
    
    public rY(final Xf dn, final Xf ld, final Xf qe) {
        if (dn == null || ld == null || qe == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
    }
    
    public Xf ld() {
        return this.dN;
    }
    
    public Xf QE() {
        return this.ld;
    }
    
    public Xf fa() {
        return this.QE;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 + ((this.dN == null) ? 0 : this.dN.hashCode())) + this.ld.hashCode()) + this.QE.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final rY ry = (rY)o;
        return this.dN.equals(ry.dN) && this.ld.equals(ry.ld) && this.QE.equals(ry.QE);
    }
    
    @Override
    public List wU() {
        return TM.dN(this.dN, this.ld, this.QE);
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
        if (this.QE == ik) {
            this.QE = (Xf)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.a_(zl);
        this.dN.dN(zl);
        zl.wU(" ? ");
        this.ld.dN(zl);
        zl.wU(" : ");
        this.QE.dN(zl);
    }
}
