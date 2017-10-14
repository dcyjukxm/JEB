// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class Pi extends II implements Xf
{
    private hV dN;
    private Fu ld;
    private List QE;
    
    public Pi(final hV dn, final Fu ld) {
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
        this.QE = new ArrayList();
    }
    
    public hV dN() {
        return this.dN;
    }
    
    public Fu ld() {
        return this.ld;
    }
    
    public List zs() {
        return this.QE;
    }
    
    public void dN(final Xf xf) {
        this.QE.add(xf);
    }
    
    @Override
    public List wU() {
        return TM.dN(TM.dN(this.ld), this.QE);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.ld == ik) {
            this.ld = (Fu)ik2;
            return true;
        }
        for (int i = 0; i < this.QE.size(); ++i) {
            if (this.QE.get(i) == ik) {
                this.QE.set(i, ik2);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.ld(zl);
        int n = 0;
        if (zl.OK != null) {
            final yK eo = zl.OK.EO(this.dN.KK());
            n = ((eo != null && eo.ld()) ? 1 : 0);
        }
        zl.dN(oc.Ux);
        zl.wU(" ");
        if (n == 0) {
            oc.dN(zl, this.dN);
            zl.wU("(");
            for (int i = 0; i < this.QE.size(); ++i) {
                if (i >= 1) {
                    zl.wU(", ");
                }
                ((Xf)this.QE.get(i)).dN(zl);
            }
            zl.wU(")");
        }
        else {
            final zd dn = zl.dN(this.dN);
            if (dn != null) {
                dn.ld(zl);
            }
        }
    }
}
