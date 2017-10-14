// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

final class DE
{
    private WV dN;
    private ZO.uK ld;
    private QH QE;
    
    DE(final WV dn, final ZO.uK ld) {
        this.dN = dn;
        this.ld = ld;
        this.QE = null;
    }
    
    ZO.uK dN() {
        return this.ld;
    }
    
    void dN(final QH qe) {
        this.QE = qe;
    }
    
    boolean dN(final TM tm) {
        boolean b = false;
        if (this.dN.wU() == vI.dN) {
            boolean b2;
            try {
                b2 = Boolean.parseBoolean(this.QE.dN());
            }
            catch (Exception ex) {
                b2 = Boolean.parseBoolean(this.dN.QE());
            }
            if (tm.ld(this.dN) != b2) {
                b = true;
            }
            tm.dN(this.dN, b2);
        }
        else if (this.dN.wU() == vI.ld) {
            int n;
            try {
                n = Integer.parseInt(this.QE.dN());
            }
            catch (Exception ex2) {
                n = Integer.parseInt(this.dN.QE());
            }
            if (tm.QE(this.dN) != n) {
                b = true;
            }
            tm.dN(this.dN, n);
        }
        else {
            if (this.dN.wU() != vI.QE) {
                throw new RuntimeException();
            }
            tm.dN(this.dN, this.QE.dN());
        }
        return b;
    }
}
