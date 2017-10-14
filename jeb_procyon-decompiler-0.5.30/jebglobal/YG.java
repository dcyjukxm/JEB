// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class YG implements jt
{
    private fc dN;
    
    public YG(final fc dn) {
        this.dN = null;
        this.dN = dn;
    }
    
    public void dN(final fc dn) {
        this.dN = dn;
    }
    
    public YJ ld(final int n, final int n2, final Zh zh, final int n3, final Object o, final Object o2) {
        if (n2 > 1023 || n > 4095 || n3 < 0 || n3 > 7) {
            return this.wU(n, n2, zh, n3, o, o2);
        }
        if (o == null) {
            if (o2 == null) {
                return this.dN(n, n2, zh, n3);
            }
            throw new RuntimeException();
        }
        else {
            if (o2 == null) {
                return this.dN(n, n2, zh, n3, o);
            }
            return this.QE(n, n2, zh, n3, o, o2);
        }
    }
    
    private YJ dN(final int n, final int n2, final Zh zh, final int n3) {
        final YJ yj = new YJ(n, n2, zh, n3);
        final fc.uK dn = dN(zh);
        yj.dN(this.dN.dN(dn));
        yj.ld(this.dN.ld(dn));
        return yj;
    }
    
    private YJ dN(final int n, final int n2, final Zh zh, final int n3, final Object o) {
        final iD id = new iD(n, n2, zh, n3, o);
        final fc.uK dn = dN(zh);
        id.dN(this.dN.dN(dn));
        id.ld(this.dN.ld(dn));
        return id;
    }
    
    private YJ QE(final int n, final int n2, final Zh zh, final int n3, final Object o, final Object o2) {
        final R r = new R(n, n2, zh, n3, o, o2);
        final fc.uK dn = dN(zh);
        r.dN(this.dN.dN(dn));
        r.ld(this.dN.ld(dn));
        return r;
    }
    
    private YJ wU(final int n, final int n2, final Zh zh, final int n3, final Object o, final Object o2) {
        final Nd nd = new Nd(n, n2, zh, n3, o, o2);
        final fc.uK dn = dN(zh);
        nd.dN(this.dN.dN(dn));
        nd.ld(this.dN.ld(dn));
        return nd;
    }
    
    private static fc.uK dN(final Zh zh) {
        switch (YG$1.dN[zh.ordinal()]) {
            case 1: {
                return fc.uK.dN;
            }
            case 2: {
                return fc.uK.ld;
            }
            case 3: {
                return fc.uK.QE;
            }
            case 4: {
                return fc.uK.wU;
            }
            case 5: {
                return fc.uK.fa;
            }
            case 6: {
                return fc.uK.zs;
            }
            case 7: {
                return fc.uK.mS;
            }
            case 8: {
                return fc.uK.OK;
            }
            case 9: {
                return fc.uK.LH;
            }
            case 10: {
                return fc.uK.KK;
            }
            case 11: {
                return fc.uK.EO;
            }
            case 12: {
                return fc.uK.cb;
            }
            case 13: {
                return fc.uK.PF;
            }
            case 14: {
                return fc.uK.Hw;
            }
            case 15: {
                return fc.uK.rK;
            }
            case 16: {
                return fc.uK.Ux;
            }
            case 17: {
                return fc.uK.ZY;
            }
            case 18: {
                return fc.uK.s;
            }
            case 19: {
                return fc.uK.Hv;
            }
            case 20: {
                return fc.uK.VX;
            }
            case 21: {
                return fc.uK.ci;
            }
            case 22: {
                return fc.uK.bG;
            }
            default: {
                return fc.uK.dN;
            }
        }
    }
}
