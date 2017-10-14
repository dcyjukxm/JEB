// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;

public final class Vf extends cI implements Xf
{
    private hV dN;
    
    public Vf(final hV hv) {
        this.dN(hv);
    }
    
    public hV ld() {
        return this.dN;
    }
    
    public void dN(final hV dn) {
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
    }
    
    @Override
    public List wU() {
        return TM.dN(new IK[0]);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.a_(zl);
        oc.dN(zl, this.dN);
    }
}
