// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public class Gy extends cI implements Xf
{
    protected Xf dN;
    protected kn ld;
    protected Xf QE;
    
    public Gy(final Xf dn, final kn ld, final Xf qe) {
        if (ld == null || qe == null) {
            throw new IllegalArgumentException();
        }
        if (ld.ld()) {
            if (dn != null) {
                throw new IllegalArgumentException();
            }
        }
        else if (ld.QE() && dn == null) {
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
        return this.QE;
    }
    
    public kn fa() {
        return this.ld;
    }
    
    public void dN(final kn ld) {
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 + ((this.dN == null) ? 0 : this.dN.hashCode())) + this.QE.hashCode()) + this.ld.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final Gy gy = (Gy)o;
        if (this.dN == null) {
            if (gy.dN != null) {
                return false;
            }
        }
        else if (!this.dN.equals(gy.dN)) {
            return false;
        }
        return this.ld.equals(gy.ld) && this.QE.equals(gy.QE);
    }
    
    @Override
    public List wU() {
        return TM.dN(this.dN, this.QE);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (Xf)ik2;
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
        if (this.ld.zs()) {
            zl.wU("(");
            zl.wU("(");
            oc.dN(zl, this.ld.dN());
            zl.wU(")");
            if (this.QE instanceof Gy) {
                zl.wU("(");
            }
            this.QE.dN(zl);
            if (this.QE instanceof Gy) {
                zl.wU(")");
            }
            zl.wU(")");
            return;
        }
        final kn kn = (this.dN != null && this.dN instanceof Gy) ? ((Gy)this.dN).fa() : null;
        final kn kn2 = (this.QE instanceof Gy) ? ((Gy)this.QE).fa() : null;
        if (this.dN != null) {
            boolean b;
            if (kn == null) {
                b = false;
            }
            else {
                try {
                    final int dn = this.ld.dN(kn);
                    b = (dn < 0 || (dn == 0 && this.ld.LH() != jebglobal.kn.uK.dN));
                }
                catch (Exception ex) {
                    b = true;
                }
            }
            if (b) {
                zl.wU("(");
            }
            this.dN.dN(zl);
            if (b) {
                zl.wU(")");
            }
        }
        final String string = this.ld.toString();
        if (string.length() > 0) {
            if (this.ld == jebglobal.kn.s || this.ld.ld()) {
                zl.wU(string);
            }
            else {
                zl.wU(" " + string + " ");
            }
        }
        boolean b2;
        if (kn2 == null) {
            b2 = false;
        }
        else {
            try {
                final int dn2 = this.ld.dN(kn2);
                b2 = (dn2 < 0 || (dn2 == 0 && this.ld.LH() != jebglobal.kn.uK.ld));
            }
            catch (Exception ex2) {
                b2 = true;
            }
        }
        if (b2) {
            zl.wU("(");
        }
        this.QE.dN(zl);
        if (b2) {
            zl.wU(")");
        }
    }
}
