// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class jK extends II implements Xf
{
    private hV dN;
    private List ld;
    private List QE;
    
    public jK(final hV dn, final Xf xf) {
        if (dn == null || xf == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        (this.ld = new ArrayList()).add(xf);
    }
    
    public jK(final hV dn, final boolean b, final List list) {
        if (list == null) {
            throw new IllegalArgumentException();
        }
        if (dn == null && b) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        if (b) {
            if (list.isEmpty()) {
                throw new IllegalArgumentException();
            }
            this.ld = list;
        }
        else {
            this.QE = list;
        }
    }
    
    public hV dN() {
        return this.dN;
    }
    
    public List ld() {
        return this.ld;
    }
    
    public List zs() {
        return this.QE;
    }
    
    @Override
    public List wU() {
        return TM.dN(TM.dN(this.ld), this.QE);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.ld != null) {
            for (int i = 0; i < this.ld.size(); ++i) {
                if (this.ld.get(i) == ik) {
                    this.ld.set(i, ik2);
                    return true;
                }
            }
        }
        if (this.QE != null) {
            for (int j = 0; j < this.QE.size(); ++j) {
                if (this.QE.get(j) == ik) {
                    this.QE.set(j, ik2);
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.ld(zl);
        if (this.dN != null) {
            zl.dN(oc.Ux);
            zl.wU(" ");
        }
        if (this.QE == null) {
            oc.dN(zl, this.dN.QE());
            for (final Xf xf : this.ld) {
                zl.wU("[");
                xf.dN(zl);
                zl.wU("]");
            }
            for (int i = this.ld.size(); i < this.dN.ld(); ++i) {
                zl.wU("[]");
            }
        }
        else {
            if (this.dN != null) {
                oc.dN(zl, this.dN);
            }
            zl.wU("{");
            int n = 0;
            for (final Xf xf2 : this.QE) {
                if (n > 0) {
                    zl.wU(", ");
                }
                xf2.dN(zl);
                ++n;
            }
            zl.wU("}");
        }
    }
}
