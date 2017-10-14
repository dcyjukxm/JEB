// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;

public final class ym
{
    private AR dN;
    private ME ld;
    
    public ym(final AR dn) {
        this.dN = dn;
    }
    
    public void dN(final ME ld) {
        (this.ld = ld).QE("          ");
        this.dN();
    }
    
    private void dN() {
        for (final yK yk : this.dN.Hw()) {
            final int lh = this.ld.LH();
            this.ld.dN(rT.dN);
            this.ld.s();
            CQ.dN(this.ld, yk.LH(), -1);
            this.ld.dN(this.dN, yk.zs(), true);
            if (this.ld.ZY != null) {
                this.dN(this.ld.ZY.wU(yk.zs()));
            }
            this.ld.QE();
            this.ld.dN(rT.ld);
            this.ld.s();
            final int hw = yk.Hw();
            if (hw >= 0) {
                this.ld.wU(this.dN, hw);
            }
            else {
                final String wu = yk.wU(true);
                this.ld.dN(wu, Zh.rK, this.dN.KK(wu));
            }
            this.ld.QE();
            if (this.ld.mS) {
                this.ld.dN(DL.dN);
                this.ld.s();
                this.ld.dN(this.dN, yk.Ux());
                this.ld.QE();
            }
            this.ld.QE();
            final int[] rk = yk.rK();
            if (rk.length > 0) {
                for (final int n : rk) {
                    this.ld.dN(rT.QE);
                    this.ld.s();
                    this.ld.wU(this.dN, n);
                    this.ld.QE();
                }
                this.ld.QE();
            }
            if (this.ld.zs) {
                final xd.uK[] vx = yk.VX();
                if (vx != null) {
                    final xd.uK[] array2 = vx;
                    for (int length2 = array2.length, j = 0; j < length2; ++j) {
                        this.dN(array2[j]);
                        this.ld.QE();
                    }
                }
            }
            final Uk s = yk.s();
            if (s != null) {
                if (!s.QE().isEmpty()) {
                    final ub[] zy = yk.ZY();
                    if (zy.length > s.dN().size()) {
                        throw new RuntimeException();
                    }
                    int n2 = 0;
                    for (final XV xv : s.QE()) {
                        final int lh2 = this.ld.LH();
                        final gE fa = this.dN.fa(xv.dN());
                        this.ld.dN(rT.OK);
                        this.ld.s();
                        CQ.dN(this.ld, xv.ld(), -1);
                        this.ld.dN(fa.QE(true), Zh.Ux, 1, fa, null);
                        this.ld.wU(":");
                        this.ld.dN(this.dN, fa.mS());
                        if (xv.QE() && n2 < zy.length) {
                            this.ld.wU(" = ");
                            this.dN(zy[n2++]);
                        }
                        if (this.ld.ZY != null) {
                            this.dN(this.ld.ZY.zs(xv.dN()));
                        }
                        this.ld.QE();
                        if (this.ld.zs) {
                            final xd.uK[] dn = yk.dN(xv.dN());
                            if (dn != null) {
                                this.ld.rK();
                                final xd.uK[] array3 = dn;
                                for (int length3 = array3.length, k = 0; k < length3; ++k) {
                                    this.dN(array3[k]);
                                }
                                this.ld.Ux();
                                this.ld.dN(rT.LH);
                                this.ld.QE();
                            }
                        }
                        final String fa2 = fa.fa(false);
                        this.ld.PF.put(fa2, lh2);
                        this.ld.Ux.add(new ME.uK(fa2, lh2, this.ld.LH()));
                    }
                    this.ld.QE();
                }
                for (final AV av : s.zs()) {
                    final hO ms = this.dN.mS(av.ld());
                    final int lh3 = this.ld.LH();
                    this.ld.dN(rT.KK);
                    this.ld.s();
                    CQ.dN(this.ld, av.QE(), -1);
                    this.ld.dN(ms.ld(true), Zh.ZY, 1, ms, null);
                    this.ld.dN(this.dN, ms.OK());
                    if (this.ld.ZY != null) {
                        this.dN(this.ld.ZY.fa(av.ld()));
                    }
                    this.ld.QE();
                    this.ld.EO();
                    this.dN(yk, av);
                    this.ld.cb();
                    this.ld.dN(rT.EO);
                    this.ld.QE();
                    this.ld.QE();
                    final ME ld = this.ld;
                    final String wu2 = ms.wU(false);
                    this.ld.PF.put(wu2, lh3);
                    this.ld.rK.add(new ME.uK(wu2, lh3, this.ld.LH()));
                }
            }
            if (this.ld.wU != null) {
                this.ld.dN(this.ld.wU, Zh.ld);
                this.ld.QE();
            }
            final String ld2 = yk.ld(false);
            this.ld.PF.put(ld2, lh);
            this.ld.Hw.add(new ME.uK(ld2, lh, this.ld.LH()));
        }
    }
    
    private void dN(final yK yk, final AV av) {
        final OM wu = av.wU();
        if (wu != null) {
            this.ld.dN(rT.bG);
            this.ld.wU(String.format(" %d", wu.zs()));
            this.ld.QE();
        }
        vD kk = null;
        if (wu != null && this.ld.mS) {
            kk = wu.KK();
        }
        if (this.ld.zs) {
            final xd.uK[] ld = yk.ld(av.ld());
            if (ld != null) {
                final xd.uK[] array = ld;
                for (int length = array.length, i = 0; i < length; ++i) {
                    this.dN(array[i]);
                }
            }
        }
        int n = av.zs() ? 0 : 1;
        final String qe = this.dN.mS(av.ld()).OK().QE();
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = 1; j < qe.length(); ++j) {
            list.add(n);
            switch (qe.charAt(j)) {
                case 'B':
                case 'C':
                case 'F':
                case 'I':
                case 'L':
                case 'S':
                case 'Z': {
                    ++n;
                    break;
                }
                case 'D':
                case 'J': {
                    n += 2;
                    break;
                }
            }
        }
        boolean b = false;
        if (this.ld.zs) {
            final xd.vd[] qe2 = yk.QE(av.ld());
            if (qe2 != null) {
                int[] dn = null;
                if (kk != null) {
                    dn = kk.dN();
                    b = true;
                }
                int n2 = 0;
                for (final xd.vd vd : qe2) {
                    this.ld.dN(rT.cb);
                    this.ld.wU(String.format(" p%d", (n2 < list.size()) ? list.get(n2) : -1));
                    if (dn != null && n2 < dn.length) {
                        this.ld.wU(", ");
                        this.ld.dN(this.dN, dn[n2]);
                    }
                    this.ld.QE();
                    this.ld.rK();
                    final xd.uK[] ld2 = vd.ld();
                    for (int length3 = ld2.length, l = 0; l < length3; ++l) {
                        this.dN(ld2[l]);
                    }
                    this.ld.Ux();
                    this.ld.dN(rT.PF);
                    this.ld.QE();
                    ++n2;
                }
            }
        }
        if (wu == null) {
            return;
        }
        final int n3 = wu.zs() - n;
        if (kk != null && !b) {
            int n4 = 0;
            for (final int n6 : kk.dN()) {
                this.ld.dN(rT.cb);
                this.ld.wU(String.format(" p%d, ", (n4 < list.size()) ? list.get(n4) : -1));
                this.ld.dN(this.dN, n6);
                this.ld.QE();
                ++n4;
            }
        }
        final oh fa = wu.fa();
        if (fa == null) {
            return;
        }
        this.ld.cb();
        final ArrayList<Wu> list2 = new ArrayList<Wu>();
        int n7 = 0;
        for (final ft ft : fa.ld()) {
            if (this.ld.KK && n7 > 0) {
                this.ld.QE();
            }
            if (!ft.ld() && ((Wu)ft.dN(0)).dN() > 0) {
                this.dN(ft.dN(0), wu, true);
                this.ld.QE();
            }
            for (final Wu wu2 : ft.wU()) {
                final int dn3 = wu2.dN();
                final int ok = wu2.OK();
                if (kk != null) {
                    this.ld.EO();
                    final vD.uK dn4 = kk.dN(dn3 / 2);
                    if (dn4.fa >= 0) {
                        this.ld.dN(DL.dN);
                        this.ld.s();
                        this.ld.dN(this.dN, dn4.fa);
                        this.ld.QE();
                    }
                    if (dn4.QE) {
                        this.ld.dN(DL.ld);
                        this.ld.QE();
                    }
                    if (dn4.wU) {
                        this.ld.dN(DL.QE);
                        this.ld.QE();
                    }
                    if (this.ld.OK && dn4.dN >= 0) {
                        this.ld.dN(DL.wU);
                        this.ld.wU(" " + dn4.dN);
                        this.ld.QE();
                    }
                    if (dn4.ld != null) {
                        for (final vD.vd vd2 : dn4.ld) {
                            this.ld.dN(DL.fa);
                            this.ld.wU(String.format(" v%d, %s:%s", vd2.ld(), this.dN.dN(vd2.QE(), "", true), this.dN.dN(vd2.wU(), false)));
                            this.ld.QE();
                        }
                    }
                    this.ld.cb();
                }
                this.dN(dn3);
                if (this.ld.ld > 0) {
                    this.ld.dN(ZF.ld(wu2.zs(), 0, wu2.ld(), this.ld.ld), Zh.wU);
                }
                final String wu3 = wu2.wU();
                this.ld.dN(wu3, Zh.mS, wu3);
                if (ok >= 1) {
                    this.ld.OK(Math.max(1, this.ld.QE - wu3.length()));
                }
                final int fa2 = wu2.fa();
                if (fa2 == 43 || fa2 == 44 || fa2 == 38) {
                    list2.add(wu2);
                }
                boolean b2 = false;
                if (this.ld.EO && ok > 1 && ((fa2 >= 110 && fa2 <= 114) || (fa2 >= 116 && fa2 <= 120) || fa2 == 36 || fa2 == 37 || (fa2 >= 8959 && fa2 <= 9983) || fa2 == 1535)) {
                    b2 = true;
                }
                for (int n8 = 0; n8 < ok; ++n8) {
                    int n9;
                    long n10;
                    if (b2) {
                        n9 = wu2.dN((n8 + 1) % ok);
                        n10 = wu2.ld((n8 + 1) % ok);
                        if (n8 == 0) {
                            this.ld.wU("{");
                        }
                        else if (n8 == ok - 1) {
                            this.ld.wU("}");
                        }
                    }
                    else {
                        n9 = wu2.dN(n8);
                        n10 = wu2.ld(n8);
                    }
                    if (n8 >= 1) {
                        this.ld.wU(", ");
                    }
                    if (n9 == 0) {
                        final int n11 = (int)n10;
                        if (this.ld.LH && n11 >= n3) {
                            this.ld.wU(String.format("p%d", n11 - n3));
                        }
                        else {
                            this.ld.wU(String.format("v%d", n11));
                        }
                    }
                    else if (n9 == 1) {
                        this.ld.dN(String.format("0x%X", n10), Zh.cb, this.dN.dN(n10));
                        if (n10 >= 10L && n10 <= 2147483647L) {
                            final int n12 = (int)n10;
                            if (this.ld.cb != null && this.ld.ZY != null) {
                                final Xo dn5 = this.ld.cb.dN(n12);
                                if (dn5 != null) {
                                    final String qe3 = ZF.QE(String.format("R.%s.%s", dn5.dN(), dn5.ld()), true);
                                    if (this.ld.ZY.QE(wu.dN(), wu2.dN()) == null) {
                                        this.ld.ZY.dN(OD.vd.fa, wu.dN(), wu2.dN(), qe3, null);
                                    }
                                }
                            }
                        }
                    }
                    else if (n9 == 2) {
                        final int n13 = (int)n10;
                        if (Wu.QE(fa2)) {
                            this.ld.dN(this.dN, n13);
                        }
                        else if (Wu.wU(fa2)) {
                            this.ld.dN(this.dN, this.dN.QE(n13));
                        }
                        else if (Wu.fa(fa2)) {
                            this.ld.QE(this.dN, n13);
                        }
                        else {
                            if (!Wu.zs(fa2)) {
                                throw new RuntimeException();
                            }
                            this.ld.ld(this.dN, n13);
                        }
                    }
                    else if (n9 == 3) {
                        this.dN(wu2.dN() + (int)n10 * 2, wu, false);
                    }
                    else {
                        if (n9 != 4) {
                            throw new RuntimeException();
                        }
                        this.ld.wU(String.format("v%d .. v%d", n10 & 0xFFFFL, n10 >> 32 & 0xFFFFL));
                    }
                }
                if (this.ld.ZY != null) {
                    this.dN(this.ld.ZY.QE(wu.dN(), wu2.dN()));
                }
                this.ld.dN(new Tg(wu2.dN()));
            }
            ++n7;
        }
        this.ld.EO();
        for (final nm nm : wu.LH()) {
            final int dn6 = nm.dN();
            final int qe4 = nm.QE();
            for (final bt bt : nm.wU()) {
                if (bt.dN()) {
                    this.ld.dN(rT.Hw);
                    this.ld.s();
                    this.ld.dN(this.dN, this.dN.QE(bt.ld()));
                    this.ld.s();
                }
                else {
                    this.ld.dN(rT.rK);
                    this.ld.s();
                }
                this.ld.wU("{");
                this.dN(dn6, wu, false);
                this.ld.wU(" .. ");
                this.dN(qe4, wu, false);
                this.ld.wU("} ");
                this.dN(bt.QE(), wu, false);
                this.ld.QE();
            }
        }
        for (final Wu wu4 : list2) {
            final int fa3 = wu4.fa();
            if (fa3 == 43) {
                this.ld.cb();
                this.dN(wu4.LH().dN());
                this.ld.dN(rT.Ux);
                final Wu.lX.uK[] cb = wu4.cb();
                if (cb.length >= 1) {
                    this.ld.wU(String.format(" 0x%X", cb[0].dN()));
                }
                this.ld.QE();
                this.ld.EO();
                this.ld.rK();
                final Wu.lX.uK[] array3 = cb;
                for (int length6 = array3.length, n15 = 0; n15 < length6; ++n15) {
                    this.dN(wu4.dN() + array3[n15].ld() * 2, wu, false);
                    this.ld.QE();
                }
                this.ld.Ux();
                this.ld.dN(rT.ZY);
                this.ld.QE();
            }
            else if (fa3 == 44) {
                this.ld.cb();
                this.dN(wu4.LH().dN());
                this.ld.dN(rT.s);
                this.ld.QE();
                this.ld.EO();
                this.ld.rK();
                for (final Wu.lX.uK uk : wu4.cb()) {
                    final int n17 = wu4.dN() + uk.ld() * 2;
                    this.ld.wU(String.format("0x%X -> ", uk.dN()));
                    this.dN(n17, wu, false);
                    this.ld.QE();
                }
                this.ld.Ux();
                this.ld.dN(rT.Hv);
                this.ld.QE();
            }
            else {
                if (fa3 != 38) {
                    throw new RuntimeException();
                }
                this.ld.cb();
                this.dN(wu4.PF().dN());
                this.ld.dN(rT.VX);
                final byte[][] hw = wu4.Hw();
                this.ld.wU(String.format(" %d", hw[0].length));
                if (!this.ld.EO) {
                    this.ld.wU(String.format(" x 0x%X", hw.length));
                }
                this.ld.QE();
                this.ld.EO();
                this.ld.rK();
                for (int n18 = 0; n18 < hw.length; ++n18) {
                    final byte[] array4 = hw[n18];
                    long n19 = 0L;
                    switch (array4.length) {
                        case 1: {
                            n19 = array4[0];
                            break;
                        }
                        case 2: {
                            n19 = (array4[0] | array4[1] << 8);
                            break;
                        }
                        case 4: {
                            n19 = (array4[0] | array4[1] << 8 | array4[2] << 16 | array4[3] << 24);
                            break;
                        }
                        case 8: {
                            n19 = (array4[0] | array4[1] << 8 | array4[2] << 16 | array4[3] << 24 | (array4[4] | array4[5] << 8 | array4[6] << 16 | array4[7] << 24) << 32);
                            break;
                        }
                        default: {
                            n19 = 0L;
                            break;
                        }
                    }
                    if (n19 >= 0L) {
                        this.ld.wU(String.format("0x%X", n19));
                    }
                    else {
                        this.ld.wU(String.format("-0x%X", -n19));
                    }
                    if (this.ld.EO) {
                        this.ld.wU("t");
                    }
                    this.ld.QE();
                }
                this.ld.Ux();
                this.ld.dN(rT.ci);
                this.ld.QE();
            }
        }
        this.ld.cb();
    }
    
    private void dN(final bm bm, final OM om, final boolean b) {
        final int dn = bm.dN();
        String s = null;
        if (this.ld.ZY != null) {
            final u dn2 = this.ld.ZY.dN(om.dN(), dn);
            if (dn2 != null && dn2.LH()) {
                s = dn2.Hw();
            }
        }
        if (s == null) {
            s = OM.QE(dn);
        }
        this.ld.dN(":" + s, Zh.LH, b ? 1 : 0, bm, om);
    }
    
    private void dN(final int n, final OM om, final boolean b) {
        final Wu ld = om.ld(n);
        if (ld == null) {
            this.ld.dN(":" + OM.QE(n), Zh.LH);
            return;
        }
        this.dN(ld, om, b);
    }
    
    private void dN(final int n) {
        if (!this.ld.dN || n < 0) {
            this.ld.OK(10);
        }
        else {
            this.ld.dN(String.format("%08X", n), Zh.QE);
            this.ld.OK(2);
        }
    }
    
    private void dN(final OD od) {
        if (od != null) {
            final String pf = od.PF();
            final byte[] hw = od.Hw();
            if (pf != null || hw != null) {
                this.ld.dN("  #" + ((hw != null) ? "(!) " : " ") + ((pf != null) ? pf : ""), Zh.ld);
            }
        }
    }
    
    private void dN(final xd.uK uk) {
        final kg ld = uk.ld();
        this.ld.dN(rT.wU);
        this.ld.s();
        this.ld(uk.dN());
        this.dN(ld);
        this.ld.dN(rT.fa);
        this.ld.QE();
    }
    
    private void dN(final kg kg) {
        this.ld.dN(this.dN, this.dN.QE(kg.dN()));
        this.ld.QE();
        this.ld.rK();
        for (final kg.uK uk : kg.ld()) {
            final String dn = this.dN.dN(uk.dN(), "", true);
            final ub ld2 = uk.ld();
            this.ld.wU(dn);
            this.ld.wU(" = ");
            this.dN(ld2);
            this.ld.QE();
        }
        this.ld.Ux();
    }
    
    private void ld(final int n) {
        if (n == 0) {
            this.ld.wU("build ");
        }
        else if (n == 1) {
            this.ld.wU("runtime ");
        }
        else if (n == 2) {
            this.ld.wU("system ");
        }
        else {
            this.ld.wU("unknown-visibility ");
        }
    }
    
    private void ld(final kg kg) {
        this.ld.dN(rT.zs);
        this.ld.s();
        this.dN(kg);
        this.ld.dN(rT.mS);
        this.ld.QE();
    }
    
    private void dN(final ub ub) {
        switch (ub.dN()) {
            case 30: {
                this.ld.wU("null");
                break;
            }
            case 31: {
                this.ld.wU(String.format("%s", ub.ZY()));
                break;
            }
            case 0: {
                this.ld.wU(String.format("0x%X", ub.QE()));
                break;
            }
            case 2: {
                this.ld.wU(String.format("0x%X", ub.wU()));
                break;
            }
            case 3: {
                this.ld.wU(String.format("'%s'", ZF.dN(ub.fa(), !this.ld.EO)));
                break;
            }
            case 4: {
                this.ld.wU(String.format("0x%X", ub.zs()));
                break;
            }
            case 6: {
                this.ld.wU(String.format("0x%XL", ub.mS()));
                break;
            }
            case 16: {
                this.ld.wU(String.format("%ff", ub.OK()));
                break;
            }
            case 17: {
                this.ld.wU(String.format("%f", ub.LH()));
                break;
            }
            case 23: {
                this.ld.dN(this.dN, ub.KK());
                break;
            }
            case 24: {
                this.ld.wU(this.dN, ub.EO());
                break;
            }
            case 25: {
                this.ld.QE(this.dN, ub.cb());
                break;
            }
            case 26: {
                this.ld.ld(this.dN, ub.PF());
                break;
            }
            case 27: {
                this.ld.QE(this.dN, ub.Hw());
                break;
            }
            case 28: {
                this.ld.wU("{");
                this.ld.QE();
                this.ld.rK();
                int n = 0;
                final ub[] rk;
                final ub[] array = rk = ub.rK();
                for (int length = rk.length, i = 0; i < length; ++i) {
                    this.dN(rk[i]);
                    if (++n < array.length) {
                        this.ld.wU(",");
                    }
                    this.ld.QE();
                }
                this.ld.Ux();
                this.ld.wU("}");
                break;
            }
            case 29: {
                this.ld(ub.Ux());
                break;
            }
            default: {
                this.ld.wU("<unknown value>");
                break;
            }
        }
    }
}
