// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class CZ extends cI implements Rx
{
    private Xf dN;
    private Dw ld;
    
    public CZ(final Xf dn, final Dw ld) {
        if (dn == null || ld == null || ld.ld()) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
    }
    
    public Xf ld() {
        return this.dN;
    }
    
    public Dw QE() {
        return this.ld;
    }
    
    public void dN(final Xf dn) {
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
    }
    
    public void dN(final Dw ld) {
        if (ld == null || ld.ld()) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 + this.ld.hashCode()) + this.dN.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final CZ cz = (CZ)o;
        return this.dN.equals(cz.dN) && this.ld.equals(cz.ld);
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
            this.ld = (Dw)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.a_(zl);
        if (this.dN instanceof HI && ((HI)this.dN).dN(false).equals("this") && this.ld.zs().equals("this$0")) {
            final hV ok = this.ld.OK();
            if (ok != null && ok.mS()) {
                oc.dN(zl, ok);
                zl.wU(".");
                zl.dN(oc.ci);
                return;
            }
        }
        this.dN.dN(zl);
        zl.wU(".");
        this.ld.dN(zl, false);
    }
}
