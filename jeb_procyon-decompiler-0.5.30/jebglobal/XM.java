// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class XM extends II
{
    private Rx dN;
    private Xf ld;
    private kn QE;
    private boolean wU;
    private boolean fa;
    
    public XM(final Rx dn, final Xf ld) {
        if (dn == null || ld == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
    }
    
    public boolean dN() {
        return this.ld != null && this.QE == null;
    }
    
    public boolean ld() {
        return this.ld != null && this.QE != null;
    }
    
    public kn zs() {
        if (!this.ld()) {
            throw new IllegalStateException();
        }
        return this.QE;
    }
    
    public boolean mS() {
        return this.ld == null;
    }
    
    public void dN(final boolean[] array) {
        if (!this.mS()) {
            throw new IllegalStateException();
        }
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException();
        }
        array[0] = this.wU;
        array[1] = this.fa;
    }
    
    public Rx OK() {
        return this.dN;
    }
    
    public Xf LH() {
        return this.ld;
    }
    
    public void dN(final Rx dn) {
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
    }
    
    public void dN(final Xf ld) {
        if (this.mS()) {
            throw new IllegalStateException();
        }
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
    }
    
    public void dN(final kn qe, final Xf ld) {
        if (this.mS()) {
            throw new IllegalStateException();
        }
        if (qe == null || !qe.mS()) {
            throw new IllegalArgumentException();
        }
        this.QE = qe;
        if (ld != null) {
            this.ld = ld;
        }
    }
    
    public void dN(final boolean wu, final boolean fa) {
        this.ld = null;
        this.QE = null;
        this.wU = wu;
        this.fa = fa;
    }
    
    @Override
    public List wU() {
        return TM.dN(this.dN, this.ld);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (Rx)ik2;
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
        this.ld(zl);
        if (this.ld == null) {
            if (this.fa) {
                zl.wU(this.wU ? "++" : "--");
            }
            this.dN.dN(zl);
            if (!this.fa) {
                zl.wU(this.wU ? "++" : "--");
            }
        }
        else {
            this.dN.dN(zl);
            if (this.QE != null) {
                zl.wU(String.format(" %s= ", this.QE.toString()));
            }
            else {
                zl.wU(" = ");
            }
            this.ld.dN(zl);
        }
    }
}
