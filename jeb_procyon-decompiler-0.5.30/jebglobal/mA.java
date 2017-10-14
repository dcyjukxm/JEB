// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class mA extends II
{
    private boolean dN;
    private Xf ld;
    
    public mA(final boolean dn, final Xf ld) {
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
    }
    
    public boolean dN() {
        return this.dN;
    }
    
    public Xf ld() {
        return this.ld;
    }
    
    @Override
    public List wU() {
        return TM.dN(this.ld);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.ld == ik) {
            this.ld = (Xf)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.ld(zl);
        zl.wU(String.format("__monitor_%s(", this.dN ? "enter" : "exit"));
        this.ld.dN(zl);
        zl.wU(")");
    }
}
