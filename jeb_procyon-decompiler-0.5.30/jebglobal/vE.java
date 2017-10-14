// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class vE extends II
{
    private Xf dN;
    
    public vE(final Xf xf) {
        this.dN(xf);
    }
    
    public Xf dN() {
        return this.dN;
    }
    
    public void dN(final Xf dn) {
        if (dn == null) {
            throw new RuntimeException();
        }
        this.dN = dn;
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
        zl.dN(oc.bG);
        zl.wU(" ");
        this.dN.dN(zl);
    }
}
