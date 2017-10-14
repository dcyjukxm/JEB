// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.ArrayList;

public final class GH
{
    private AR dN;
    private hV.uK ld;
    private OX.vd QE;
    private Dw.uK wU;
    
    public GH(final AR dn, final hV.uK ld, final OX.vd qe, final Fu.uK uk, final Dw.uK wu) {
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
    }
    
    public Xf dN(final ub ub) {
        switch (ub.dN()) {
            case 30: {
                return this.QE.dN();
            }
            case 31: {
                return this.QE.dN(ub.ZY());
            }
            case 0: {
                return this.QE.dN(ub.QE());
            }
            case 2: {
                return this.QE.dN(ub.wU());
            }
            case 3: {
                return this.QE.dN(ub.fa());
            }
            case 4: {
                return this.QE.dN(ub.zs());
            }
            case 6: {
                return this.QE.dN(ub.mS());
            }
            case 16: {
                return this.QE.dN(ub.OK());
            }
            case 17: {
                return this.QE.dN(ub.LH());
            }
            case 23: {
                return this.QE.dN(this.dN.ld(ub.KK()));
            }
            case 24: {
                return new Np(this.ld.dN(this.dN.dN(ub.EO(), false)), this.wU.dN(-1));
            }
            case 25: {
                return this.QE.dN("<_field>");
            }
            case 26: {
                return this.QE.dN("<_method>");
            }
            case 27: {
                return new Np(this.ld.dN(this.dN.fa(ub.Hw()).dN(false)), this.wU.dN(ub.Hw()));
            }
            case 28: {
                final ArrayList<Xf> list = new ArrayList<Xf>();
                final ub[] rk = ub.rK();
                for (int length = rk.length, i = 0; i < length; ++i) {
                    list.add(this.dN(rk[i]));
                }
                return new jK(null, false, list);
            }
            case 29: {
                return this.QE.dN("<_subannotation>");
            }
            default: {
                return this.QE.dN(String.format("<_unknown_vt=%d>", ub.dN()));
            }
        }
    }
}
