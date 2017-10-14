// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class cq extends II
{
    private Xf dN;
    
    public cq(final Xf dn) {
        this.dN = dn;
    }
    
    public Xf dN() {
        return this.dN;
    }
    
    public void dN(final Xf dn) {
        this.dN = dn;
    }
    
    public boolean ld() {
        return this.dN == null;
    }
    
    @Override
    public List wU() {
        return TM.dN(this.dN);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (Xf)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.ld(zl);
        zl.dN(oc.s);
        if (this.dN != null) {
            zl.wU(" ");
            this.dN.dN(zl);
        }
    }
}
