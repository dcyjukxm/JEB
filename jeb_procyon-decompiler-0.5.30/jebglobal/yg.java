// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class yg extends II
{
    private Qa dN;
    
    public yg(final Qa dn) {
        this.dN = dn;
    }
    
    public Qa dN() {
        return this.dN;
    }
    
    public void dN(final Qa dn) {
        this.dN = dn;
    }
    
    @Override
    public List wU() {
        return TM.dN(new IK[] { this.dN });
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (Qa)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.ld(zl);
        zl.dN(oc.dN);
        if (this.dN != null) {
            zl.s();
            this.dN.dN(zl, false);
        }
    }
}
