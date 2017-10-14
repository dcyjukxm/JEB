// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class vL extends as
{
    private Os KK;
    
    public vL(final Os kk) {
        super(kk, "Rebase constant");
        this.KK = kk;
        this.ld = 98;
        this.fa = HC.dN().dN("icon-letter-b.png");
        this.OK = false;
    }
    
    @Override
    public boolean OK() {
        return this.dN(true);
    }
    
    @Override
    public boolean LH() {
        return this.dN(false);
    }
    
    private boolean dN(final boolean b) {
        final YJ ok = this.KK.OK();
        if (ok == null) {
            return false;
        }
        final Object zs = ok.zs();
        if (zs == null || !(zs instanceof OX)) {
            return false;
        }
        final OX ox = (OX)zs;
        if (!ox.ld().Hw()) {
            return false;
        }
        if (b) {
            return true;
        }
        final OX.uK ci = ox.ci();
        OX.uK uk;
        if (ci == null || ci == OX.uK.ld) {
            uk = OX.uK.QE;
        }
        else if (ci == OX.uK.QE) {
            uk = OX.uK.dN;
        }
        else if (ci == OX.uK.dN) {
            uk = OX.uK.ld;
        }
        else {
            uk = null;
        }
        ox.dN(uk);
        this.KK.dN(ox.toString());
        return true;
    }
}
