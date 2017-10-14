// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class KO extends II
{
    private Qa dN;
    
    public KO(final Qa qa) {
        this.dN(qa);
    }
    
    public Qa dN() {
        return this.dN;
    }
    
    public void dN(final Qa dn) {
        if (dn == null) {
            throw new IllegalArgumentException();
        }
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
        zl.dN(oc.cb);
        zl.wU(" ");
        this.dN.dN(zl, false);
    }
}
