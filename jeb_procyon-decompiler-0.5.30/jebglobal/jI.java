// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;

public class jI
{
    private static final long LK = 844563159190538443L;
    private static long dN;
    private boolean ld;
    private AR QE;
    private AV wU;
    private hV.uK fa;
    private oh zs;
    private hV mS;
    private hV OK;
    private uK LH;
    private int KK;
    private List EO;
    private boolean cb;
    private HashMap PF;
    private HashMap Hw;
    private List rK;
    private HashMap Ux;
    private jn ZY;
    private HashSet s;
    private HashMap Hv;
    private List VX;
    private static boolean ci;
    
    private static long wU() {
        try {
            return (long)Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 123, 26, 90, 84, 84, 84 }, 2, 201)).getMethod(rP.dN(new byte[] { 32, 26, 2, 11, 23, 7, 19, 60, 29, 77, 77, 46, 64, 76, 93, 80, 74 }, 2, 18), (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return 0L;
        }
    }
    
    public jI(final AR qe, final AV wu, final hV.uK fa) {
        this.ld = false;
        this.LH = new uK();
        if (qe == null || wu == null || fa == null) {
            throw new IllegalArgumentException();
        }
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.mS = fa.dN("Ljava/lang/String;");
        this.OK = fa.dN("Ljava/lang/Class;");
        this.zs = wu.wU().fa();
    }
    
    public void dN(final boolean b) {
        if (this.ld) {
            throw new RuntimeException();
        }
        if (wU() - jI.dN > 120 * (((jI.dN & 0x1L) == 0x1L) ? 35 : 36) * 1000) {}
        this.KK = 0;
        this.PF = new HashMap();
        this.Hw = new HashMap();
        this.rK = new ArrayList();
        this.Ux = new HashMap();
        if (this.wU.wU().LH() != null) {
            this.ZY = new jn(this.wU.wU().LH(), true);
            this.s = this.ZY.ld();
        }
        this.Hv = new HashMap();
        this.EO = new ArrayList();
        this.cb = false;
        for (int i = 0; i < this.zs.dN(); ++i) {
            this.EO.addAll(this.dN(i));
        }
        ((ArrayList)this.EO).trimToSize();
        if (!jI.ci) {
            jebglobal.rK.dN = 0;
        }
        for (final Cs cs : this.LH.dN()) {
            if (!this.PF.containsKey(cs.dN())) {
                throw new RuntimeException();
            }
            cs.dN((int)this.PF.get(cs.dN()));
        }
        final Iterator<Wu> iterator2 = this.rK.iterator();
        while (iterator2.hasNext()) {
            final Integer n = this.PF.get(iterator2.next().dN());
            if (n == null) {
                continue;
            }
            if (n >= this.EO.size()) {
                continue;
            }
            final xS xs = this.EO.get(n);
            if (xs.dN() != n) {
                continue;
            }
            xs.dN(new ie(0L, hV.PF));
        }
        this.rK.clear();
        this.VX = new ArrayList();
        if (b) {
            for (final ft ft : this.zs.ld()) {
                if (ft.EO() == 0) {
                    continue;
                }
                final Integer n2 = this.PF.get(((Wu)ft.dN(0)).dN());
                if (n2 == null) {
                    throw new RuntimeException();
                }
                final int intValue = n2;
                final Integer n3 = this.PF.get(((Wu)ft.dN(ft.dN() - 1)).dN());
                if (n3 == null) {
                    throw new RuntimeException();
                }
                final int intValue2 = n3;
                final Iterator iterator4 = ft.Hw().iterator();
                while (iterator4.hasNext()) {
                    final Integer n4 = this.PF.get(((Wu)iterator4.next().dN(0)).dN());
                    if (n4 == null) {
                        throw new RuntimeException();
                    }
                    this.VX.add(new QE(intValue, intValue2, n4));
                }
            }
        }
        this.ld = true;
    }
    
    public List dN() {
        if (!this.ld) {
            throw new RuntimeException();
        }
        return this.EO;
    }
    
    public List ld() {
        if (!this.ld) {
            throw new RuntimeException();
        }
        return this.VX;
    }
    
    public HashMap QE() {
        if (!this.ld) {
            throw new RuntimeException();
        }
        return this.Hv;
    }
    
    private List dN(final int n) {
        final ft dn = this.zs.dN(n);
        final List wu = dn.wU();
        final ArrayList<xS> list = new ArrayList<xS>();
        int i = 0;
        List<xS> list2 = null;
        final Wu[] array = { null };
        final ArrayList<Integer> list3 = new ArrayList<Integer>();
        while (i < wu.size()) {
            if (this.cb) {
                this.cb = false;
                if (++i >= wu.size()) {
                    break;
                }
            }
            final Wu wu2 = wu.get(i);
            final int fa = wu2.fa();
            Wu wu3 = null;
            xS xs = null;
            final int ok = wu2.OK();
            int n2 = -1;
            if (ok >= 1 && wu2.dN(0) == 0) {
                n2 = (int)wu2.ld(0);
            }
            int n3 = -1;
            if (ok >= 2 && wu2.dN(1) == 0) {
                n3 = (int)wu2.ld(1);
            }
            int n4 = -1;
            if (ok >= 3 && wu2.dN(2) == 0) {
                n4 = (int)wu2.ld(2);
            }
            switch (fa) {
                case 0: {
                    break;
                }
                case 1:
                case 2:
                case 3: {
                    xs = new xS(Qz.dN, new xy(n2, hV.KK), new xy(n3, hV.KK));
                    break;
                }
                case 7:
                case 8:
                case 9: {
                    xs = new xS(Qz.dN, new xy(n2, hV.PF), new xy(n3, hV.PF));
                    break;
                }
                case 4:
                case 5:
                case 6: {
                    xs = new xS(Qz.dN, new xy(n2, hV.EO), new xy(n3, hV.EO));
                    break;
                }
                case 13: {
                    if (i != 0) {
                        throw new RuntimeException();
                    }
                    this.Ux.put(this.KK, n2);
                    final bt ld = this.ZY.ld(wu2.dN());
                    if (ld == null) {
                        throw new RuntimeException();
                    }
                    xs = new xS(Qz.OK, new xy(n2, this.fa.dN(ld.dN() ? this.QE.dN(ld.ld(), false) : "Ljava/lang/Throwable;")), null);
                    break;
                }
                case 10:
                case 11:
                case 12: {
                    break;
                }
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                case 8959:
                case 9215:
                case 9471:
                case 9727:
                case 9983: {
                    final hO ms = this.QE.mS((int)wu2.ld(0));
                    final String dn2 = ms.dN(false);
                    final String qe = ms.QE(false);
                    Uo.uK uk = Uo.uK.dN;
                    if (fa == 111 || fa == 117 || fa == 9215) {
                        uk = Uo.uK.ld;
                    }
                    else if (fa == 112 || fa == 118 || fa == 9471) {
                        uk = Uo.uK.QE;
                    }
                    else if (fa == 113 || fa == 119 || fa == 9727) {
                        uk = Uo.uK.wU;
                    }
                    else if (fa == 114 || fa == 120 || fa == 9983) {
                        uk = Uo.uK.fa;
                    }
                    final hV[] dn3 = hV.dN(ms.OK(), this.fa);
                    hV cb = dn3[0];
                    if (cb == hV.QE || cb == hV.wU || cb == hV.fa) {
                        cb = hV.cb;
                    }
                    final xy dn4 = this.dN(n, i, cb, array);
                    if (dn4 != null) {
                        wu3 = array[0];
                    }
                    final boolean b = uk == Uo.uK.wU;
                    int n5 = 0;
                    int n6 = 0;
                    if (!b) {
                        ++n5;
                        ++n6;
                    }
                    for (int j = 1; j < dn3.length; ++j) {
                        if (dn3[j] == hV.mS || dn3[j] == hV.LH) {
                            ++n5;
                        }
                        ++n5;
                        ++n6;
                    }
                    int[] array2;
                    if (fa >= 110 && fa <= 114) {
                        array2 = new int[wu2.OK() - 1];
                        for (int k = 1; k < wu2.OK(); ++k) {
                            array2[k - 1] = (int)wu2.ld(k);
                        }
                    }
                    else {
                        final long ld2 = wu2.ld(1);
                        final int n7 = (int)(ld2 & -1L);
                        final int n8 = (int)(ld2 >> 32 & -1L);
                        array2 = new int[n8 - n7 + 1];
                        int n9 = 0;
                        for (int l = n7; l <= n8; ++l) {
                            array2[n9++] = l;
                        }
                    }
                    if (n5 != array2.length) {
                        throw new RuntimeException();
                    }
                    final tu[] array3 = new tu[n6];
                    int n10 = 0;
                    int n11 = 0;
                    if (!b) {
                        final tu[] array4 = array3;
                        final int n12 = 0;
                        ++n10;
                        array4[n12] = new xy(array2[0], hV.dN(dn2, this.fa));
                        ++n11;
                    }
                    int n13 = 1;
                    while (n10 < array3.length) {
                        hV cb2 = dn3[n13];
                        if (cb2 == hV.zs) {
                            cb2 = hV.cb;
                        }
                        array3[n10++] = new xy(array2[n11], cb2);
                        if (cb2 == hV.mS || cb2 == hV.LH) {
                            if (array2[n11 + 1] != array2[n11] + 1) {
                                throw new RuntimeException();
                            }
                            ++n11;
                        }
                        ++n11;
                        ++n13;
                    }
                    if (ms.ld(false).equals("<init>")) {
                        list3.clear();
                        final Wu dn5 = this.dN(wu2, array2[0], list3, this.rK, dn, i);
                        if (dn5 != null) {
                            final int n14 = array2[0];
                            if (!this.QE.dN((int)dn5.ld(1), false).equals(dn2)) {
                                throw new RuntimeException();
                            }
                            final hV dn6 = this.fa.dN(dn2);
                            final tu[] array5 = new tu[array3.length - 1];
                            for (int n15 = 1; n15 < array3.length; ++n15) {
                                array5[n15 - 1] = array3[n15];
                            }
                            xs = new xS(Qz.dN, new xy(n14, dn6), new IV(dn6, new YK((int)wu2.ld(0)), array5));
                            if (!list3.isEmpty()) {
                                list2 = new ArrayList<xS>(list3.size());
                                final Iterator<Object> iterator = list3.iterator();
                                while (iterator.hasNext()) {
                                    list2.add(new xS(Qz.dN, new xy(iterator.next(), dn6), new xy(n14, dn6)));
                                }
                            }
                        }
                    }
                    if (xs == null) {
                        final Uo uo = new Uo(new YK((int)wu2.ld(0)), array3, cb, qe, uk);
                        if (dn4 != null) {
                            xs = new xS(Qz.dN, dn4, uo);
                        }
                        else {
                            xs = new xS(Qz.ld, null, uo);
                        }
                        break;
                    }
                    break;
                }
                case 14: {
                    xs = new xS(Qz.zs, null, null);
                    break;
                }
                case 15: {
                    xs = new xS(Qz.zs, null, new xy(n2, hV.KK));
                    break;
                }
                case 17: {
                    xs = new xS(Qz.zs, null, new xy(n2, hV.PF));
                    break;
                }
                case 16: {
                    xs = new xS(Qz.zs, null, new xy(n2, hV.EO));
                    break;
                }
                case 18:
                case 19:
                case 20:
                case 21: {
                    xs = new xS(Qz.dN, new xy(n2, hV.KK), new ie((int)wu2.ld(1), hV.KK));
                    break;
                }
                case 22:
                case 23:
                case 24:
                case 25: {
                    xs = new xS(Qz.dN, new xy(n2, hV.EO), new ie(wu2.ld(1), hV.EO));
                    break;
                }
                case 26:
                case 27: {
                    xs = new xS(Qz.dN, new xy(n2, this.mS), new ie(new YK((int)wu2.ld(1)), this.mS));
                    break;
                }
                case 28:
                case 255: {
                    xs = new xS(Qz.dN, new xy(n2, this.OK), new np(null, this.OK, this.QE.dN((int)wu2.ld(1), false), "class"));
                    break;
                }
                case 29: {
                    xs = new xS(Qz.LH, null, new xy(n2, hV.PF));
                    break;
                }
                case 30: {
                    xs = new xS(Qz.KK, null, new xy(n2, hV.PF));
                    break;
                }
                case 31:
                case 511: {
                    break;
                }
                case 32:
                case 767: {
                    final int n16 = (int)wu2.ld(2);
                    xs = new xS(Qz.dN, new xy(n2, hV.ld), new lB(new xy(n3, hV.PF), ld(fa), new Dm(new YK(n16), hV.dN(this.QE.dN(n16, false), this.fa))));
                    break;
                }
                case 33: {
                    xs = new xS(Qz.dN, new xy(n2, hV.zs), new Kt(new xy(n3, hV.PF), null, hV.zs, "length"));
                    break;
                }
                case 34:
                case 1023: {
                    List<?> list4 = this.Hw.get(n2);
                    if (list4 == null) {
                        list4 = new ArrayList<Object>();
                        this.Hw.put(n2, list4);
                    }
                    list4.add(wu2);
                    break;
                }
                case 35:
                case 1279: {
                    final int n17 = (int)wu2.ld(2);
                    final hV dn7 = hV.dN(this.QE.dN(n17, false), this.fa);
                    if (dn7.ld() <= 0) {
                        throw new RuntimeException();
                    }
                    List<ie> list5 = null;
                    if (i + 1 < wu.size()) {
                        wu3 = wu.get(i + 1);
                        if (wu3.fa() == 38) {
                            list5 = new ArrayList<ie>();
                            final byte[] array6 = new byte[8];
                            final ByteBuffer wrap = ByteBuffer.wrap(array6);
                            wrap.order(ByteOrder.LITTLE_ENDIAN);
                            final hV qe2 = dn7.QE();
                            if (!qe2.fa()) {
                                throw new RuntimeException();
                            }
                            final byte[][] hw = wu3.Hw();
                            for (int n18 = 0; n18 < hw.length; ++n18) {
                                for (int n19 = 0; n19 < hw[n18].length; ++n19) {
                                    array6[n19] = hw[n18][n19];
                                }
                                list5.add(new ie(wrap.getLong(0), qe2));
                            }
                        }
                        else {
                            wu3 = null;
                        }
                    }
                    xs = new xS(Qz.dN, new xy(n2, dn7), new os(new YK(n17), dn7, new xy(n3, hV.cb), list5));
                    break;
                }
                case 38: {
                    break;
                }
                case 36:
                case 37:
                case 1535: {
                    final int n20 = (int)wu2.ld(0);
                    final hV dn8 = hV.dN(this.QE.QE(n20).dN(false), this.fa);
                    final xy ld3 = this.ld(n, i, dn8, array);
                    if (ld3 != null) {
                        wu3 = array[0];
                    }
                    int[] array7;
                    if (fa == 36) {
                        array7 = new int[wu2.OK() - 1];
                        for (int n21 = 1; n21 < wu2.OK(); ++n21) {
                            array7[n21 - 1] = (int)wu2.ld(n21);
                        }
                    }
                    else {
                        final long ld4 = wu2.ld(1);
                        final int n22 = (int)(ld4 & -1L);
                        final int n23 = (int)(ld4 >> 32 & -1L);
                        array7 = new int[n23 - n22 + 1];
                        int n24 = 0;
                        for (int n25 = n22; n25 <= n23; ++n25) {
                            array7[n24++] = n25;
                        }
                    }
                    final hV wu4 = dn8.wU();
                    final ArrayList list6 = new ArrayList<xy>(array7.length);
                    for (int n26 = 0; n26 < array7.length; ++n26) {
                        list6.add(new xy(array7[n26], wu4));
                    }
                    final os os = new os(new YK(n20), dn8, new ie(list6.size(), hV.zs), list6);
                    if (ld3 != null) {
                        xs = new xS(Qz.dN, ld3, os);
                        break;
                    }
                    xs = new xS(Qz.ld, null, os);
                    break;
                }
                case 39: {
                    xs = new xS(Qz.mS, null, new xy(n2, hV.PF));
                    break;
                }
                case 40:
                case 41:
                case 42: {
                    final int n27 = wu2.dN() + 2 * (int)wu2.ld(0);
                    if (n27 != wu2.dN() + wu2.ld()) {
                        xs = new xS(Qz.QE, this.LH.dN(n27), null);
                        break;
                    }
                    break;
                }
                case 43:
                case 44: {
                    final int n28 = wu2.dN() + wu2.ld();
                    boolean b2 = false;
                    final iz iz = new iz();
                    for (final Wu.lX.uK uk2 : wu2.cb()) {
                        final int n30 = wu2.dN() + 2 * uk2.ld();
                        if (n30 != n28) {
                            b2 = true;
                            iz.dN(uk2.dN(), this.LH.dN(n30));
                        }
                    }
                    if (b2) {
                        xs = new xS(Qz.fa, iz, new xy(n2, hV.cb));
                        break;
                    }
                    break;
                }
                case 45:
                case 46:
                case 47:
                case 48:
                case 49: {
                    wu3 = null;
                    int fa2 = -1;
                    if (i + 1 < wu.size()) {
                        wu3 = wu.get(i + 1);
                        fa2 = wu3.fa();
                        if (fa2 < 56 || fa2 > 61) {
                            wu3 = null;
                        }
                        else {
                            this.zs.zs();
                            final List<Integer> list7 = this.zs.mS().get(wu2).get(n2);
                            if (list7 == null || list7.size() != 1 || list7.get(0) != i + 1) {
                                wu3 = null;
                            }
                        }
                    }
                    if (wu3 != null) {
                        final int n31 = wu3.dN() + 2 * (int)wu3.ld(1);
                        if (n31 != wu3.dN() + wu3.ld()) {
                            final hV qe3 = QE(fa);
                            xs = new xS(Qz.wU, this.LH.dN(n31), new vC(new xy(n3, qe3), ld(fa2), new xy(n4, qe3)));
                        }
                        break;
                    }
                    hO ho = null;
                    if (fa == 45 || fa == 46) {
                        ho = this.QE.OK("Ljava/lang/Float;->compare(FF)I");
                    }
                    else if (fa == 47 || fa == 48) {
                        ho = this.QE.OK("Ljava/lang/Double;->compare(DD)I");
                    }
                    else if (fa == 49) {
                        ho = this.QE.OK("Ljava/lang/Long;->compare(JJ)I");
                    }
                    if (ho == null) {
                        throw new RuntimeException();
                    }
                    final hV[] dn9 = hV.dN(ho.OK(), this.fa);
                    xs = new xS(Qz.dN, new xy(n2, dn9[0]), new Uo(new YK(ho.dN()), new xy[] { new xy(n3, dn9[1]), new xy(n4, dn9[2]) }, dn9[0], ho.ld(false), Uo.uK.wU));
                    break;
                }
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55: {
                    final int n32 = wu2.dN() + wu2.ld();
                    final int n33 = wu2.dN() + 2 * (int)wu2.ld(2);
                    if (n33 != n32) {
                        xs = new xS(Qz.wU, this.LH.dN(n33), new vC(new xy(n2, hV.KK), ld(fa), new xy(n3, hV.KK)));
                        break;
                    }
                    break;
                }
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61: {
                    final int n34 = wu2.dN() + wu2.ld();
                    final int n35 = wu2.dN() + 2 * (int)wu2.ld(1);
                    if (n35 != n34) {
                        xs = new xS(Qz.wU, this.LH.dN(n35), new vC(new xy(n2, hV.KK), ld(fa), new ie(0L, hV.KK)));
                        break;
                    }
                    break;
                }
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74: {
                    final hV qe4 = QE(fa);
                    xs = new xS(Qz.dN, new xy(n2, qe4.PF() ? hV.cb : qe4), new fG(new xy(n3, hV.PF), new xy(n4, hV.cb), qe4));
                    break;
                }
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81: {
                    xs = new xS(Qz.dN, new fG(new xy(n3, hV.PF), new xy(n4, hV.cb), QE(fa)), new xy(n2, QE(fa)));
                    break;
                }
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 1791:
                case 2047:
                case 2303:
                case 2559:
                case 2815:
                case 3071:
                case 3327:
                case 3583:
                case 3839:
                case 4095:
                case 4351:
                case 4607:
                case 4863:
                case 5119: {
                    final int n36 = (int)wu2.ld(2);
                    final gE fa3 = this.QE.fa(n36);
                    final String qe5 = fa3.QE(false);
                    final hV dn10 = hV.dN(fa3.mS().dN(false), this.fa);
                    final xy xy = new xy(n2, dn10);
                    final Kt kt = new Kt(new xy(n3, this.fa.dN(fa3.dN(false))), new YK(n36), dn10, qe5);
                    if ((fa >= 82 && fa <= 88) || (fa >= 1791 && fa <= 3327)) {
                        xs = new xS(Qz.dN, xy, kt);
                        break;
                    }
                    xs = new xS(Qz.dN, kt, xy);
                    break;
                }
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 5375:
                case 5631:
                case 5887:
                case 6143:
                case 6399:
                case 6655:
                case 6911:
                case 7167:
                case 7423:
                case 7679:
                case 7935:
                case 8191:
                case 8447:
                case 8703: {
                    final int n37 = (int)wu2.ld(1);
                    final gE fa4 = this.QE.fa(n37);
                    final hV dn11 = hV.dN(fa4.mS().dN(false), this.fa);
                    final xy xy2 = new xy(n2, dn11);
                    final np np = new np(new YK(n37), dn11, fa4.dN(false), fa4.QE(false));
                    if ((fa >= 96 && fa <= 102) || (fa >= 5375 && fa <= 6911)) {
                        xs = new xS(Qz.dN, xy2, np);
                        break;
                    }
                    xs = new xS(Qz.dN, np, xy2);
                    break;
                }
                case 123:
                case 124:
                case 125:
                case 126:
                case 127:
                case 128: {
                    xs = new xS(Qz.dN, new xy(n2, QE(fa)), new lB(null, ld(fa), new xy(n3, QE(fa))));
                    break;
                }
                case 129: {
                    xs = new xS(Qz.dN, new xy(n2, hV.mS), new lB(null, ld(fa), new xy(n3, hV.cb)));
                    break;
                }
                case 130: {
                    xs = new xS(Qz.dN, new xy(n2, hV.OK), new lB(null, ld(fa), new xy(n3, hV.cb)));
                    break;
                }
                case 131: {
                    xs = new xS(Qz.dN, new xy(n2, hV.LH), new lB(null, ld(fa), new xy(n3, hV.cb)));
                    break;
                }
                case 132: {
                    xs = new xS(Qz.dN, new xy(n2, hV.zs), new lB(null, ld(fa), new xy(n3, hV.mS)));
                    break;
                }
                case 133: {
                    xs = new xS(Qz.dN, new xy(n2, hV.OK), new lB(null, ld(fa), new xy(n3, hV.mS)));
                    break;
                }
                case 134: {
                    xs = new xS(Qz.dN, new xy(n2, hV.LH), new lB(null, ld(fa), new xy(n3, hV.mS)));
                    break;
                }
                case 135: {
                    xs = new xS(Qz.dN, new xy(n2, hV.zs), new lB(null, ld(fa), new xy(n3, hV.OK)));
                    break;
                }
                case 136: {
                    xs = new xS(Qz.dN, new xy(n2, hV.mS), new lB(null, ld(fa), new xy(n3, hV.OK)));
                    break;
                }
                case 137: {
                    xs = new xS(Qz.dN, new xy(n2, hV.LH), new lB(null, ld(fa), new xy(n3, hV.OK)));
                    break;
                }
                case 138: {
                    xs = new xS(Qz.dN, new xy(n2, hV.zs), new lB(null, ld(fa), new xy(n3, hV.LH)));
                    break;
                }
                case 139: {
                    xs = new xS(Qz.dN, new xy(n2, hV.mS), new lB(null, ld(fa), new xy(n3, hV.LH)));
                    break;
                }
                case 140: {
                    xs = new xS(Qz.dN, new xy(n2, hV.OK), new lB(null, ld(fa), new xy(n3, hV.LH)));
                    break;
                }
                case 141: {
                    xs = new xS(Qz.dN, new xy(n2, hV.QE), new lB(null, ld(fa), new xy(n3, hV.cb)));
                    break;
                }
                case 142: {
                    xs = new xS(Qz.dN, new xy(n2, hV.wU), new lB(null, ld(fa), new xy(n3, hV.cb)));
                    break;
                }
                case 143: {
                    xs = new xS(Qz.dN, new xy(n2, hV.fa), new lB(null, ld(fa), new xy(n3, hV.cb)));
                    break;
                }
                case 144:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 153:
                case 154: {
                    xs = new xS(Qz.dN, new xy(n2, hV.zs), new lB(new xy(n3, QE(fa)), ld(fa), new xy(n4, QE(fa))));
                    break;
                }
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case 160:
                case 161:
                case 162:
                case 166:
                case 167:
                case 168:
                case 169:
                case 170:
                case 171:
                case 172:
                case 173:
                case 174:
                case 175: {
                    xs = new xS(Qz.dN, new xy(n2, QE(fa)), new lB(new xy(n3, QE(fa)), ld(fa), new xy(n4, QE(fa))));
                    break;
                }
                case 163:
                case 164:
                case 165: {
                    xs = new xS(Qz.dN, new xy(n2, QE(fa)), new lB(new xy(n3, QE(fa)), ld(fa), new xy(n4, hV.cb)));
                    break;
                }
                case 176:
                case 177:
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case 186: {
                    xs = new xS(Qz.dN, new xy(n2, hV.zs), new lB(new xy(n2, QE(fa)), ld(fa), new xy(n3, QE(fa))));
                    break;
                }
                case 187:
                case 188:
                case 189:
                case 190:
                case 191:
                case 192:
                case 193:
                case 194:
                case 198:
                case 199:
                case 200:
                case 201:
                case 202:
                case 203:
                case 204:
                case 205:
                case 206:
                case 207: {
                    xs = new xS(Qz.dN, new xy(n2, QE(fa)), new lB(new xy(n2, QE(fa)), ld(fa), new xy(n3, QE(fa))));
                    break;
                }
                case 195:
                case 196:
                case 197: {
                    xs = new xS(Qz.dN, new xy(n2, QE(fa)), new lB(new xy(n2, QE(fa)), ld(fa), new xy(n3, hV.cb)));
                    break;
                }
                case 208:
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                case 218:
                case 219:
                case 220:
                case 221:
                case 222:
                case 223:
                case 224:
                case 225:
                case 226: {
                    xs = new xS(Qz.dN, new xy(n2, hV.zs), new lB(new xy(n3, hV.cb), ld(fa), new ie((int)wu2.ld(2), hV.cb)));
                    break;
                }
                case 209:
                case 217: {
                    xs = new xS(Qz.dN, new xy(n2, hV.zs), new lB(new ie((int)wu2.ld(2), hV.cb), ld(fa), new xy(n3, hV.cb)));
                    break;
                }
                default: {
                    throw new RuntimeException();
                }
            }
            final int dn12 = wu2.dN();
            if (this.s != null && this.s.contains(dn12)) {
                this.Hv.put(this.KK, this.ZY.ld(dn12).ld());
            }
            this.PF.put(dn12, this.KK);
            if (wu3 != null) {
                this.PF.put(wu3.dN(), this.KK);
            }
            final boolean b3 = wu2.QE() || (wu3 != null && wu3.QE());
            if (xs != null) {
                xs.dN(b3);
                xs.dN(this.KK++);
                xs.ld(wu2.dN());
                list.add(xs);
            }
            ++i;
            if (wu3 != null) {
                this.cb = true;
            }
            if (list2 != null) {
                for (final xS xs2 : list2) {
                    xs2.dN(b3);
                    xs2.dN(this.KK++);
                    list.add(xs2);
                }
                list2 = null;
            }
        }
        return list;
    }
    
    private xy dN(final int n, final int n2, final hV hv, final Wu[] array) {
        final ft dn = this.zs.dN(n);
        Wu wu = null;
        if (n2 + 1 < dn.dN()) {
            wu = (Wu)dn.dN(n2 + 1);
        }
        else if (n + 1 < this.zs.dN()) {
            wu = (Wu)this.zs.dN(n + 1).dN(0);
        }
        if (wu == null) {
            return null;
        }
        final int fa = wu.fa();
        if (fa != 10 && fa != 12 && fa != 11) {
            return null;
        }
        int n3;
        if (hv == hV.ld || hv == hV.QE || hv == hV.wU || hv == hV.fa || hv == hV.zs || hv == hV.OK) {
            n3 = 10;
        }
        else if (hv == hV.mS || hv == hV.LH) {
            n3 = 11;
        }
        else if (hv.zs()) {
            n3 = 12;
        }
        else {
            if (hv != hV.cb) {
                throw new RuntimeException();
            }
            n3 = 10;
        }
        if (n3 != fa) {
            throw new RuntimeException();
        }
        final xy xy = new xy((int)wu.ld(0), hv);
        array[0] = wu;
        return xy;
    }
    
    private xy ld(final int n, final int n2, final hV hv, final Wu[] array) {
        final ft dn = this.zs.dN(n);
        Wu wu = null;
        if (n2 + 1 < dn.dN()) {
            wu = (Wu)dn.dN(n2 + 1);
        }
        else if (n + 1 < this.zs.dN()) {
            wu = (Wu)this.zs.dN(n + 1).dN(0);
        }
        if (wu == null) {
            return null;
        }
        final int fa = wu.fa();
        if (fa == 10 || fa == 11) {
            throw new RuntimeException();
        }
        if (fa != 12) {
            return null;
        }
        final xy xy = new xy((int)wu.ld(0), hv);
        array[0] = wu;
        return xy;
    }
    
    private Wu dN(final Wu wu, final int n, final List list, final List list2, final ft ft, final int n2) {
        this.zs.zs();
        Wu wu2 = wu;
        int n3 = n;
        final List<Wu> list3 = this.zs.KK().get(wu2).get(n);
        if (list3 != null && list3.size() == 1) {
            final Wu wu3 = list3.get(0);
            final int fa = wu3.fa();
            if (fa == 34 || fa == 1023) {
                if (wu3.ld(0) != n) {
                    throw new RuntimeException();
                }
                return wu3;
            }
        }
        int n4 = n2;
        while (true) {
            final List<Integer> list4 = this.zs.LH().get(wu2).get(n3);
            if (list4 == null || list4.size() != 1) {
                return null;
            }
            final int intValue = list4.get(0);
            if (intValue < 0 || intValue >= n2) {
                return null;
            }
            final Wu wu4 = (Wu)ft.dN(intValue);
            final List list5 = this.zs.mS().get(wu4).get(n3);
            if (list5 == null || !this.dN(list5, n4, n2)) {
                return null;
            }
            final int fa2 = wu4.fa();
            if (fa2 == 34 || fa2 == 1023) {
                if (wu4.ld(0) != n3) {
                    throw new RuntimeException();
                }
                return wu4;
            }
            else {
                if (fa2 != 7 && fa2 != 8 && fa2 != 9) {
                    return null;
                }
                if (wu4.ld(0) != n3) {
                    throw new RuntimeException();
                }
                n3 = (int)wu4.ld(1);
                wu2 = wu4;
                list.add(n3);
                list2.add(wu4);
                n4 = intValue;
            }
        }
    }
    
    private boolean dN(final List list, final int n, final int n2) {
        for (final int intValue : list) {
            if (intValue >= 0) {
                if (intValue > n2) {
                    continue;
                }
                if (intValue != n) {
                    return false;
                }
                continue;
            }
        }
        return true;
    }
    
    private static kn ld(final int n) {
        switch (n) {
            case 32: {
                return kn.s;
            }
            case 50:
            case 56: {
                return kn.Hv;
            }
            case 51:
            case 57: {
                return kn.VX;
            }
            case 52:
            case 58: {
                return kn.ci;
            }
            case 53:
            case 59: {
                return kn.bG;
            }
            case 54:
            case 60: {
                return kn.BQ;
            }
            case 55:
            case 61: {
                return kn.Ee;
            }
            case 123:
            case 125:
            case 127:
            case 128: {
                return kn.cb;
            }
            case 124:
            case 126: {
                return kn.PF;
            }
            case 144:
            case 155:
            case 166:
            case 171:
            case 176:
            case 187:
            case 198:
            case 203:
            case 208:
            case 216: {
                return kn.dN;
            }
            case 145:
            case 156:
            case 167:
            case 172:
            case 177:
            case 188:
            case 199:
            case 204:
            case 209:
            case 217: {
                return kn.ld;
            }
            case 146:
            case 157:
            case 168:
            case 173:
            case 178:
            case 189:
            case 200:
            case 205:
            case 210:
            case 218: {
                return kn.QE;
            }
            case 147:
            case 158:
            case 169:
            case 174:
            case 179:
            case 190:
            case 201:
            case 206:
            case 211:
            case 219: {
                return kn.wU;
            }
            case 148:
            case 159:
            case 170:
            case 175:
            case 180:
            case 191:
            case 202:
            case 207:
            case 212:
            case 220: {
                return kn.fa;
            }
            case 149:
            case 160:
            case 181:
            case 192:
            case 213:
            case 221: {
                return kn.zs;
            }
            case 150:
            case 161:
            case 182:
            case 193:
            case 214:
            case 222: {
                return kn.mS;
            }
            case 151:
            case 162:
            case 183:
            case 194:
            case 215:
            case 223: {
                return kn.OK;
            }
            case 152:
            case 163:
            case 184:
            case 195:
            case 224: {
                return kn.LH;
            }
            case 153:
            case 164:
            case 185:
            case 196:
            case 225: {
                return kn.KK;
            }
            case 154:
            case 165:
            case 186:
            case 197:
            case 226: {
                return kn.EO;
            }
            case 141: {
                return kn.De;
            }
            case 142: {
                return kn.rn;
            }
            case 143: {
                return kn.LR;
            }
            case 132:
            case 135:
            case 138: {
                return kn.Nh;
            }
            case 129:
            case 136:
            case 139: {
                return kn.XZ;
            }
            case 130:
            case 133:
            case 140: {
                return kn.nA;
            }
            case 131:
            case 134:
            case 137: {
                return kn.Ai;
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    private static hV QE(final int n) {
        switch (n) {
            case 45:
            case 46: {
                return hV.OK;
            }
            case 47:
            case 48: {
                return hV.LH;
            }
            case 49: {
                return hV.mS;
            }
            case 68:
            case 75:
            case 82:
            case 89:
            case 96:
            case 103:
            case 1791:
            case 3583:
            case 5375:
            case 7167: {
                return hV.KK;
            }
            case 69:
            case 76:
            case 83:
            case 90:
            case 97:
            case 104:
            case 2047:
            case 3839:
            case 5631:
            case 7423: {
                return hV.EO;
            }
            case 70:
            case 77:
            case 84:
            case 91:
            case 98:
            case 105:
            case 2303:
            case 4095:
            case 5887:
            case 7679: {
                return hV.PF;
            }
            case 71:
            case 78:
            case 85:
            case 92:
            case 99:
            case 106:
            case 2559:
            case 4351:
            case 6143:
            case 7935: {
                return hV.ld;
            }
            case 72:
            case 79:
            case 86:
            case 93:
            case 100:
            case 107:
            case 2815:
            case 4607:
            case 6399:
            case 8191: {
                return hV.QE;
            }
            case 73:
            case 80:
            case 87:
            case 94:
            case 101:
            case 108:
            case 3071:
            case 4863:
            case 6655:
            case 8447: {
                return hV.wU;
            }
            case 74:
            case 81:
            case 88:
            case 95:
            case 102:
            case 109:
            case 3327:
            case 5119:
            case 6911:
            case 8703: {
                return hV.fa;
            }
            case 123:
            case 124: {
                return hV.cb;
            }
            case 127: {
                return hV.OK;
            }
            case 125:
            case 126: {
                return hV.mS;
            }
            case 128: {
                return hV.LH;
            }
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154: {
                return hV.cb;
            }
            case 166:
            case 167:
            case 168:
            case 169:
            case 170: {
                return hV.OK;
            }
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165: {
                return hV.mS;
            }
            case 171:
            case 172:
            case 173:
            case 174:
            case 175: {
                return hV.LH;
            }
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186: {
                return hV.cb;
            }
            case 198:
            case 199:
            case 200:
            case 201:
            case 202: {
                return hV.OK;
            }
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197: {
                return hV.mS;
            }
            case 203:
            case 204:
            case 205:
            case 206:
            case 207: {
                return hV.LH;
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public static boolean dN(final Class clazz) {
        boolean dn = false;
        try {
            dn = dN(Class.forName(rP.dN(new byte[] { -98, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9 }, 1, 244)).getConstructor(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 42 }, 2, 90))).newInstance(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 47 }, 2, 211)).getMethod(rP.dN(new byte[] { 47, 27, 58, 7, 27 }, 1, 91), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86 }, 2, 142)).getMethod(rP.dN(new byte[] { -30, 2, 17, 56, 35, 12, 2, 21, 29, 6, 1 }, 1, 133), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13 }, 2, 36)).getMethod(rP.dN(new byte[] { -67, 2, 17, 55, 44, 11, 1, 54, 60, 26, 7, 17, 6 }, 1, 218), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { -56, 11, 23, 23, 79, 66, 13, 15, 9, 73, 109, 47, 13, 18, 0 }, 1, 162)).getMethod(rP.dN(new byte[] { -45, 2, 17, 36, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7 }, 1, 180), (Class<?>[])new Class[0]).invoke(clazz, new Object[0]), new Object[0]), new Object[0]), new Object[0])), clazz);
        }
        catch (Exception ex) {}
        return dn;
    }
    
    private static boolean dN(final Object o, final Class clazz) {
        boolean equals = false;
        try {
            final Object instance = Class.forName(rP.dN(new byte[] { 18, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 120)).getConstructor(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6 }, 2, 112)), Boolean.TYPE).newInstance(o, true);
            final byte[] array = new byte[4096];
            final Object invoke = Class.forName(rP.dN(new byte[] { 109, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 7)).getMethod(rP.dN(new byte[] { 36, 10, 4, 60, 28, 29, 21, 17 }, 2, 75), String.class).invoke(instance, clazz.getName().replace('.', '/') + ".class");
            while ((int)Class.forName(rP.dN(new byte[] { -100, 11, 23, 23, 79, 71, 6, 65, 103, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12 }, 1, 246)).getMethod(rP.dN(new byte[] { 49, 10, 17, 29 }, 2, 197), byte[].class, Integer.TYPE, Integer.TYPE).invoke(Class.forName(rP.dN(new byte[] { 16, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 122)).getMethod(rP.dN(new byte[] { 62, 2, 17, 61, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12 }, 1, 89), Class.forName(rP.dN(new byte[] { 54, 11, 23, 23, 79, 91, 1, 29, 5, 66, 84, 19, 25, 94, 116, 51, 25, 53, 43, 26, 6, 11 }, 1, 92))).invoke(instance, invoke), array, 0, array.length) != -1) {}
            equals = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 88, 87, 77, 86, 94, 70, 83, 83, 84, 64, 2, 114, 28, 51, 49, 22, 14, 9, 73, 2, 37, 1, 86 }, 2, 21)).getMethod(rP.dN(new byte[] { 36, 10, 4, 52, 29, 13, 18, 4, 1, 83 }, 2, 69), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 82, 92, 75, 71, 2, 99, 87, 66, 69, 90, 74, 73, 44, 19, 21, 6 }, 2, 117)).getMethod(rP.dN(new byte[] { 36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26 }, 2, 174), (Class<?>[])new Class[0]).invoke(((Object[])Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73 }, 2, 242)).getMethod(rP.dN(new byte[] { 36, 10, 4, 58, 23, 27, 19, 1, 18, 73, 75, 2, 93, 69, 66 }, 2, 176), (Class<?>[])new Class[0]).invoke(invoke, new Object[0]))[0], new Object[0]), new Object[0]).toString().substring(10).substring(15, 30).equals(rP.dN(new byte[] { -27, 8, 3, 7, 2, 5, 2, 3, 4, 0, 0, 5, 5, 1, 14 }, 1, 220));
            Class.forName(rP.dN(new byte[] { -29, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 137)).getMethod(rP.dN(new byte[] { -36, 15, 3, 28, 22 }, 1, 191), (Class<?>[])new Class[0]).invoke(instance, new Object[0]);
        }
        catch (Exception ex) {}
        return equals;
    }
    
    static {
        jI.dN = wU();
        jI.ci = dN(kW.class);
    }
    
    final class uK
    {
        private List dN;
        
        public uK(final jI ji) {
            this.dN = new ArrayList();
        }
        
        public Cs dN(final int n) {
            final Cs cs = new Cs(n);
            this.dN.add(cs);
            return cs;
        }
        
        public List dN() {
            return this.dN;
        }
    }
}
