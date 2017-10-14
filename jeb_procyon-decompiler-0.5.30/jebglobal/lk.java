// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class lk extends Gy
{
    public lk(final Xf xf, final kn kn, final Xf xf2) {
        super(xf, kn, xf2);
        if (!kn.fa()) {
            throw new IllegalArgumentException();
        }
    }
    
    public lk(final Gy gy) {
        this(gy.dN, gy.ld, gy.QE);
    }
    
    public boolean zs() {
        return this.dN == null && this.ld == kn.Hw && this.QE instanceof OX && ((OX)this.QE).Hw();
    }
    
    public boolean mS() {
        return this.dN == null && this.ld == kn.Hw && this.QE instanceof OX && ((OX)this.QE).rK();
    }
    
    public boolean OK() {
        boolean b = false;
        if (this.dN instanceof lk) {
            b = ((lk)this.dN).OK();
        }
        if (this.QE instanceof lk) {
            b = ((lk)this.QE).OK();
        }
        if (this.dN == null || !(this.QE instanceof OX) || (this.ld != kn.Hv && this.ld != kn.VX)) {
            return b;
        }
        if (((OX)this.QE).Hw()) {
            this.ld = ((this.ld == kn.Hv) ? kn.Hw : kn.rK);
            this.QE = this.dN;
            this.dN = null;
            return true;
        }
        if (((OX)this.QE).rK()) {
            this.ld = ((this.ld == kn.Hv) ? kn.rK : kn.Hw);
            this.QE = this.dN;
            this.dN = null;
            return true;
        }
        return b;
    }
    
    public void LH() {
        if (this.ld == kn.Hw) {
            this.ld = kn.rK;
        }
        else if (this.ld == kn.rK) {
            this.ld = kn.Hw;
        }
        else if (this.ld == kn.Hv) {
            this.ld = kn.VX;
        }
        else if (this.ld == kn.VX) {
            this.ld = kn.Hv;
        }
        else if (this.ld == kn.ci) {
            this.ld = kn.bG;
        }
        else if (this.ld == kn.bG) {
            this.ld = kn.ci;
        }
        else if (this.ld == kn.BQ) {
            this.ld = kn.Ee;
        }
        else if (this.ld == kn.Ee) {
            this.ld = kn.BQ;
        }
        else if (this.ld == kn.Ux) {
            ((lk)this.dN).LH();
            this.ld = kn.ZY;
            ((lk)this.QE).LH();
        }
        else if (this.ld == kn.ZY) {
            ((lk)this.dN).LH();
            this.ld = kn.Ux;
            ((lk)this.QE).LH();
        }
        else {
            if (this.ld != kn.s) {
                throw new IllegalStateException();
            }
            this.QE = new lk(this);
            this.dN = null;
            this.ld = kn.rK;
        }
    }
    
    @Override
    public void dN(final ZL zl) {
        super.dN(zl);
    }
}
