// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public final class Fu extends cI
{
    private AR dN;
    private hV.uK ld;
    private OX.vd QE;
    private GH wU;
    private boolean fa;
    private int zs;
    private int mS;
    private hV OK;
    private String LH;
    private String KK;
    private zd EO;
    private List cb;
    private List PF;
    private List Hw;
    private EG rK;
    private HI.uK Ux;
    private Qa.uK ZY;
    private int s;
    
    private Fu(final int ms, final boolean b, final AR dn, final hV.uK ld, final OX.vd qe, final zd.uK uk, final GH wu, final HI.vd vd) {
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        final hO ms2 = dn.mS(ms);
        final AV ld2 = ms2.ld();
        zd ld3 = null;
        final nh.vd zs = ms2.zs();
        if (!zs.fa()) {
            ld3 = uk.ld(zs.zs());
        }
        this.mS = ms;
        this.LH = ms2.dN(false);
        this.KK = ms2.ld(false);
        this.EO = ld3;
        if (ld2 == null) {
            this.fa = true;
            this.zs = (b ? 8 : 0);
            this.OK = null;
            return;
        }
        this.fa = false;
        this.zs = ld2.QE();
        this.OK = hV.dN(ms2.OK(), ld)[0];
        this.cb = new ArrayList();
        this.rK = new EG();
        this.Ux = new HI.uK(vd);
        this.ZY = new Qa.uK();
        if (ld2.wU() == null && !ld2.mS() && !ld2.OK()) {
            throw new RuntimeException();
        }
        this.ld();
        ld3.dN(this);
    }
    
    public void ld() {
        this.s = 0;
        if (this.fa) {
            return;
        }
        this.rK.KK();
        this.Ux.dN();
        this.ZY.dN();
        this.cb.clear();
        final hO ms = this.dN.mS(this.mS);
        final AV ld = ms.ld();
        if (ld.wU() == null) {
            final hV[] dn = hV.dN(this.dN.mS(ld.ld()).OK(), this.ld);
            int n = 0;
            final wm dn2 = this.Ux.dN(-1, hV.dN(this.LH, this.ld), 0, "this");
            dn2.dN(-2);
            this.cb.add(dn2);
            ++n;
            for (int i = 1; i < dn.length; ++i) {
                final wm dn3 = this.Ux.dN(-1, dn[i], n, "arg" + n);
                dn3.dN(-2);
                this.cb.add(dn3);
                ++n;
            }
        }
        else {
            final HashMap dn4 = Gz.dN(this.dN, ld, this.ld);
            final TreeMap treeMap = new TreeMap<Integer, Object>(dn4);
            int n2 = 0;
            for (final int intValue : treeMap.keySet()) {
                if (intValue < 0) {
                    continue;
                }
                final hV hv = (hV)dn4.get(intValue);
                String string = "arg" + intValue;
                if (n2 == 0 && !ld.zs()) {
                    string = "this";
                }
                final wm dn5 = this.Ux.dN(-1, hv, intValue, string);
                dn5.dN(-2);
                this.cb.add(dn5);
                ++n2;
            }
        }
        if (this.wU != null) {
            this.PF = new ArrayList();
            this.Hw = new ArrayList();
            final xd hv2 = this.dN.EO(ms.dN(false)).Hv();
            if (hv2 != null) {
                for (final xd.eI ei : hv2.QE()) {
                    if (ei.dN() == this.mS) {
                        for (final xd.uK uk : ei.ld().ld()) {
                            if (uk.dN() != 2) {
                                final lM lm = new lM(this.ld.dN(this.dN.dN(uk.ld().dN(), false)));
                                for (final kg.uK uk2 : uk.ld().ld()) {
                                    lm.dN(this.QE.dN(this.dN.dN(uk2.dN())), this.wU.dN(uk2.ld()));
                                }
                                this.PF.add(lm);
                            }
                        }
                        break;
                    }
                }
                for (final xd.vn vn : hv2.wU()) {
                    if (vn.dN() == this.mS) {
                        for (final xd.vd vd : vn.ld()) {
                            final ArrayList<lM> list = new ArrayList<lM>();
                            for (final xd.uK uk3 : vd.ld()) {
                                if (uk3.dN() != 2) {
                                    final lM lm2 = new lM(this.ld.dN(this.dN.dN(uk3.ld().dN(), false)));
                                    for (final kg.uK uk4 : uk3.ld().ld()) {
                                        lm2.dN(this.QE.dN(this.dN.dN(uk4.dN())), this.wU.dN(uk4.ld()));
                                    }
                                    list.add(lm2);
                                }
                            }
                            this.Hw.add(list);
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public int QE() {
        return this.mS;
    }
    
    public List fa() {
        if (this.fa) {
            throw new RuntimeException();
        }
        return this.cb;
    }
    
    public String zs() {
        return this.LH;
    }
    
    public String mS() {
        return this.KK;
    }
    
    public String OK() {
        return this.dN.mS(this.mS).wU(false);
    }
    
    public zd LH() {
        return this.EO;
    }
    
    public boolean KK() {
        return this.fa;
    }
    
    public boolean EO() {
        return (this.zs & 0x10000) != 0x0 || (this.OK == hV.dN && ("<init>".equals(this.KK) || "<clinit>".equals(this.KK)));
    }
    
    public boolean cb() {
        return (this.zs & 0x8) != 0x0;
    }
    
    public boolean PF() {
        return (this.zs & 0x1000) != 0x0;
    }
    
    public boolean Hw() {
        return (this.zs & 0x400) != 0x0;
    }
    
    public boolean rK() {
        return (this.zs & 0x1) != 0x0;
    }
    
    public boolean Ux() {
        return (this.zs & 0x4) != 0x0;
    }
    
    public boolean ZY() {
        return (this.zs & 0x2) != 0x0;
    }
    
    public void dN(final int n, final String s) {
        this.s = 0;
    }
    
    public HI.uK s() {
        if (this.fa) {
            throw new RuntimeException();
        }
        return this.Ux;
    }
    
    public Qa.uK Hv() {
        if (this.fa) {
            throw new RuntimeException();
        }
        return this.ZY;
    }
    
    public EG VX() {
        return this.rK;
    }
    
    public boolean ci() {
        return this.rK.zs() == 0;
    }
    
    public void dN(final II ii) {
        this.rK.dN(ii);
    }
    
    public II bG() {
        return this.rK.OK();
    }
    
    public void ld(final ZL zl) {
        if (this.fa) {
            throw new RuntimeException();
        }
        this.a_(zl);
        zl.KK.push(new js(hY.ld, this.mS));
        zl.dN(this.mS);
        if (zl.LH != null) {
            for (final Qa qa : this.ZY.ld()) {
                final u dn = zl.LH.dN(zl.ld(), qa.QE());
                if (dn != null && dn.LH()) {
                    qa.dN(dn.Hw());
                }
            }
        }
        if (this.PF != null && zl.mS) {
            zl.dN(this.PF);
        }
        int zs = this.zs;
        if (this.LH().QE()) {
            zs &= 0xFFFFFBFE;
        }
        oc.ld(zl, zs, -1);
        boolean b = false;
        if (this.EO()) {
            if (this.cb()) {
                b = true;
            }
            else {
                oc.dN(zl, this.LH().fa());
            }
        }
        else {
            oc.dN(zl, this.OK);
            zl.wU(" ");
            if (zl.OK != null) {
                final hO ms = zl.OK.mS(this.mS);
                zl.dN(ms.ld(true), Zh.ZY, 1, ms, null);
            }
            else {
                zl.dN(this.KK, Zh.ZY, 1, this, null);
            }
        }
        if (!b) {
            final int n = this.cb() ? 0 : 1;
            if (zl.QE && zl.OK != null) {
                final AV ld = zl.OK.mS(this.mS).ld();
                if (ld != null && ld.wU() != null) {
                    final vD kk = ld.wU().KK();
                    if (kk != null) {
                        int n2 = n;
                        for (final int n3 : kk.dN()) {
                            if (n2 >= this.cb.size()) {
                                break;
                            }
                            final String dn3 = zl.OK.dN(n3);
                            if (dn3 != null && !dn3.equals("")) {
                                this.cb.get(n2).zs().dN(dn3);
                            }
                            ++n2;
                        }
                    }
                }
            }
            zl.wU("(");
            for (int j = n; j < this.cb.size(); ++j) {
                if (j > n) {
                    zl.wU(", ");
                }
                if (this.Hw != null && zl.mS && j - n < this.Hw.size()) {
                    zl.dN((List)this.Hw.get(j - n));
                }
                ((wm)this.cb.get(j)).dN(zl);
            }
            zl.wU(")");
        }
        if (zl.OK != null) {
            final AV ld2 = zl.OK.mS(this.mS).ld();
            if (ld2 != null) {
                final int[] dn4 = ld2.dN();
                if (dn4 != null && dn4.length >= 1) {
                    zl.s();
                    zl.dN(oc.BQ);
                    int n4 = 0;
                    for (final int n5 : dn4) {
                        if (n4 >= 1) {
                            zl.wU(",");
                        }
                        zl.s();
                        oc.dN(zl, this.ld.dN(this.dN.dN(n5, false)));
                        ++n4;
                    }
                }
            }
        }
        if (zl.LH != null) {
            zl.ld(zl.LH.fa(this.mS));
        }
        zl.QE(-2);
        if (this.Hw()) {
            zl.wU(";");
        }
        else {
            if (!b) {
                zl.wU(" ");
            }
            if (this.s == 0) {
                this.rK.dN(zl);
            }
            else {
                if (this.s != 1 && this.s != 2) {
                    throw new RuntimeException();
                }
                zl.wU("{");
                zl.QE();
                zl.rK();
                if (this.s == 1) {
                    zl.dN(rP.dN(new byte[] { 108, 64, 80, 61, 23, 10, 8, 5, 4, 73, 68, 2, 93, 73, 94, 87, 25, 85, 77, 73, 94, 85, 85 }, 2, 54), Zh.ld);
                }
                else if (this.s == 2) {
                    zl.dN(rP.dN(new byte[] { 108, 64, 80, 61, 55, 36, 40, 72, 56, 105, 101, 42, 125, 97, 101, 112, 118, 125, 12, 13, 31, 16, 126, 125, 96, 121, 111, 51, 55, 34, 37, 41, 97, 35, 34, 33, 15, 38, 60, 0, 47, 33, 63, 108, 65, 48, 35, 59, 63, 32, 46, 58 }, 2, 56), Zh.ld);
                }
                zl.QE();
                zl.Ux();
                zl.wU("}");
            }
        }
        zl.QE();
        zl.KK.pop();
    }
    
    public boolean dN(final int n, final II ii) {
        return this.rK.dN(n, ii);
    }
    
    public List BQ() {
        return this.rK.ld();
    }
    
    public void dN(final List list) {
        final II ii = list.get(0);
        final int[] array = { 0 };
        final II dn = ((kd)ii).dN(list, 0, array);
        if (array[0] != list.size()) {
            throw new RuntimeException();
        }
        this.rK = (EG)dn;
    }
    
    public void Ee() {
        if (!this.dN(this.rK, new HashSet())) {
            throw new RuntimeException();
        }
    }
    
    private boolean dN(final EG eg, final HashSet set) {
        for (final II ii : eg) {
            if (set.contains(ii)) {
                return false;
            }
            set.add(ii);
            if (!(ii instanceof wz)) {
                continue;
            }
            final Iterator iterator2 = ((wz)ii).dN().iterator();
            while (iterator2.hasNext()) {
                if (!this.dN(iterator2.next(), set)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public List De() {
        final ArrayList list = new ArrayList();
        this.dN(this.rK, list);
        return list;
    }
    
    private void dN(final EG eg, final List list) {
        for (final II ii : eg) {
            list.add(ii);
            if (ii instanceof wz) {
                final Iterator iterator2 = ((wz)ii).dN().iterator();
                while (iterator2.hasNext()) {
                    this.dN(iterator2.next(), list);
                }
            }
        }
    }
    
    public boolean ld(final II ii) {
        final int dn = this.dN(this.rK, ii);
        if (dn >= 2) {
            throw new RuntimeException();
        }
        return dn == 1;
    }
    
    private int dN(final EG eg, final II ii) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld == ii) {
                eg.wU(i);
                ++n;
            }
            else {
                if (ld instanceof wz) {
                    final Iterator iterator = ((wz)ld).dN().iterator();
                    while (iterator.hasNext()) {
                        n += this.dN(iterator.next(), ii);
                    }
                }
                ++i;
            }
        }
        return n;
    }
    
    @Override
    public List wU() {
        return TM.dN(TM.dN(this.cb), this.rK);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        for (int i = 0; i < this.cb.size(); ++i) {
            if (this.cb.get(i) == ik) {
                this.cb.set(i, ik2);
                return true;
            }
        }
        if (this.rK == ik) {
            this.rK = (EG)ik2;
            return true;
        }
        return false;
    }
    
    public static final class uK
    {
        private AR dN;
        private hV.uK ld;
        private zd.uK QE;
        private OX.vd wU;
        private GH fa;
        private HI.vd zs;
        private HashMap mS;
        
        public uK(final AR dn, final hV.uK ld, final zd.uK qe, final OX.vd wu) {
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
            this.wU = wu;
            this.zs = HI.vd.dN;
            this.mS = new HashMap();
        }
        
        public void dN(final GH fa) {
            this.fa = fa;
        }
        
        public void dN(final HI.vd zs) {
            this.zs = zs;
        }
        
        public Fu dN(final int n, final boolean b) {
            if (n < 0) {
                throw new RuntimeException();
            }
            Fu fu = this.mS.get(n);
            if (fu == null) {
                fu = new Fu(n, b, this.dN, this.ld, this.wU, this.QE, this.fa, this.zs, null);
                this.mS.put(n, fu);
            }
            return fu;
        }
    }
}
