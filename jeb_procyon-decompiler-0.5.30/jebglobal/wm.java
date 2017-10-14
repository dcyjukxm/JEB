// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.List;

public final class wm extends II implements Rx
{
    private int dN;
    private hV ld;
    private HI QE;
    
    wm(final int dn, final hV ld, final HI qe) {
        if (ld == null || qe == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
    }
    
    public int dN() {
        return this.dN;
    }
    
    public hV ld() {
        return this.ld;
    }
    
    public HI zs() {
        return this.QE;
    }
    
    @Override
    public List wU() {
        return TM.dN(this.QE);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.QE == ik) {
            this.QE = (HI)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        this.ld(zl);
        if (zl.LH != null) {
            final List ld = zl.LH.ld(zl.ld(), this.QE());
            if (ld != null) {
                final int ld2 = this.QE.ld();
                for (final u u : ld) {
                    if (u.LH() && (u.PF() & 0xFFFF) == ld2) {
                        this.QE.dN(u.Hw());
                        break;
                    }
                }
            }
        }
        oc.dN(zl, this.ld);
        zl.wU(" ");
        zl.dN(this.QE.dN(true), Zh.EO, 1, this.QE, null);
    }
}
