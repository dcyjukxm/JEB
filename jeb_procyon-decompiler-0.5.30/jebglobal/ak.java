// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class ak extends as
{
    private Pl KK;
    
    public ak(final Pl kk) {
        super(kk, "Comment");
        this.KK = kk;
        this.ld = 99;
        this.wU = 47;
        this.fa = HC.dN().dN("icon-letter-c.png");
        this.OK = true;
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
        String s = null;
        byte[] array = null;
        final Ky ux = this.KK.Ux();
        if (ux == null) {
            return false;
        }
        OD.vd vd = null;
        int n = -1;
        int zs = -1;
        String s2 = "Inline comment";
        final yx wu = this.KK.wU();
        if (ux.wU != null) {
            final AV qe = wu.QE().QE(ux.wU);
            if (qe != null) {
                if (ux.zs >= 0) {
                    final OM wu2 = qe.wU();
                    if (wu2 != null) {
                        s2 = "Instruction comment";
                        vd = OD.vd.fa;
                        n = wu2.dN();
                        zs = ux.zs;
                        final OD qe2 = wu.ld().QE(n, zs);
                        if (qe2 != null) {
                            s = qe2.PF();
                            array = qe2.Hw();
                        }
                    }
                }
                else {
                    s2 = "Method comment";
                    vd = OD.vd.QE;
                    n = qe.ld();
                    final OD fa = wu.ld().fa(n);
                    if (fa != null) {
                        s = fa.PF();
                        array = fa.Hw();
                    }
                }
            }
        }
        else if (ux.fa != null) {
            final XV dn = wu.QE().dN(ux.fa);
            if (dn != null) {
                s2 = "Field comment";
                vd = OD.vd.wU;
                n = dn.dN();
                final OD zs2 = wu.ld().zs(n);
                if (zs2 != null) {
                    s = zs2.PF();
                    array = zs2.Hw();
                }
            }
        }
        else if (ux.QE != null) {
            final yK eo = wu.QE().EO(ux.QE);
            if (eo != null) {
                s2 = "Class comment";
                vd = OD.vd.ld;
                n = eo.zs();
                final OD wu3 = wu.ld().wU(n);
                if (wu3 != null) {
                    s = wu3.PF();
                    array = wu3.Hw();
                }
            }
        }
        if (vd != null) {
            if (b) {
                return true;
            }
            final OD.uK dn2 = new sp(this.KK.getShell(), this.KK.QE().XZ(), s2, s, array).dN();
            if (dn2 != null) {
                final int zs3 = this.KK.zs();
                final String ms = this.KK.mS(zs3);
                final String dn3 = this.KK.Hw().dN(zs3, dn2.dN, dn2.ld);
                final int ok = this.KK.OK(zs3);
                if (s == null) {
                    final int lastIndex = ms.lastIndexOf(35);
                    if (lastIndex >= 0) {
                        final int n2 = ms.length() - lastIndex + 2;
                        this.KK.dN(ok + ms.length() - n2, n2, dn3);
                    }
                    else {
                        this.KK.dN(ok + ms.length(), 0, dn3);
                    }
                }
                else {
                    final int n3 = ms.length() - ms.lastIndexOf(35, ms.length() - s.length()) + 2;
                    this.KK.dN(ok + ms.length() - n3, n3, dn3);
                }
                wu.ld().dN(vd, n, zs, dn2.dN, dn2.ld);
                return true;
            }
        }
        return false;
    }
}
