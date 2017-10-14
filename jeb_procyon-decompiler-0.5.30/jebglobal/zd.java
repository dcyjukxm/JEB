// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class zd extends cI
{
    private int dN;
    private boolean ld;
    private boolean QE;
    private String wU;
    private yK fa;
    private hV zs;
    private hV mS;
    private List OK;
    private List LH;
    private String KK;
    private HashMap EO;
    private List cb;
    private List PF;
    private List Hw;
    
    private zd(final int dn, final AR ar, final hV.uK uk, final OX.vd vd, final GH gh, final String wu, final yK fa, final hV zs, final hV ms, final List ok) {
        this.dN = dn;
        this.ld = (fa == null);
        this.QE = (fa != null && fa.dN());
        this.wU = wu;
        this.fa = fa;
        if (fa != null) {
            fa.LH();
        }
        this.zs = zs;
        this.mS = ms;
        this.OK = ok;
        this.KK = hV.wU(wu);
        this.EO = new HashMap();
        this.cb = new ArrayList();
        this.PF = new ArrayList();
        this.Hw = new ArrayList();
        if (this.ld) {
            return;
        }
        if (gh != null) {
            this.LH = new ArrayList();
            final xd hv = fa.Hv();
            if (hv != null) {
                final xd.vd dn2 = hv.dN();
                if (dn2 != null) {
                    for (final xd.uK uk2 : dn2.ld()) {
                        if (uk2.dN() != 2) {
                            final lM lm = new lM(uk.dN(ar.dN(uk2.ld().dN(), false)));
                            for (final kg.uK uk3 : uk2.ld().ld()) {
                                lm.dN(vd.dN(ar.dN(uk3.dN())), gh.dN(uk3.ld()));
                            }
                            this.LH.add(lm);
                        }
                    }
                }
            }
        }
    }
    
    public String ld() {
        return this.wU;
    }
    
    public boolean QE() {
        return this.fa != null && (this.fa.LH() & 0x200) != 0x0;
    }
    
    public hV fa() {
        return this.zs;
    }
    
    public boolean dN(final String s, final String s2) {
        if (!hV.dN(s2)) {
            throw new RuntimeException();
        }
        final String s3 = this.EO.get(s);
        if (s3 != null && !s3.equals(s2)) {
            return false;
        }
        if (s3 == null) {
            this.EO.put(s, s2);
        }
        return true;
    }
    
    public String dN(final String s) {
        return this.EO.get(s);
    }
    
    public List zs() {
        return this.Hw;
    }
    
    public List mS() {
        return this.PF;
    }
    
    public List OK() {
        return this.cb;
    }
    
    public void dN(final zd zd) {
        if (this.Hw.contains(zd)) {
            throw new RuntimeException();
        }
        this.Hw.add(zd);
    }
    
    public void dN(final Dw dw) {
        if (this.cb.contains(dw)) {
            throw new RuntimeException();
        }
        this.cb.add(dw);
    }
    
    public void dN(final Fu fu) {
        if (this.PF.contains(fu)) {
            throw new RuntimeException();
        }
        this.PF.add(fu);
    }
    
    public void ld(final ZL zl) {
        if (this.ld) {
            throw new RuntimeException();
        }
        zl.KK.push(new js(hY.dN, this.dN));
        if (!this.QE && this.KK.length() > 0) {
            zl.dN(oc.ZY);
            zl.wU(" " + this.KK + ";");
            zl.QE();
            zl.QE();
        }
        this.EO.clear();
        int lh = zl.LH();
        this.a_(zl);
        final boolean ld = this.fa.ld();
        if (!ld) {
            if (this.LH != null && zl.mS) {
                zl.dN(this.LH);
            }
            int lh2 = this.fa.LH();
            if (this.fa.EO()) {
                lh2 &= 0xFFFFFFEF;
            }
            if (this.fa.cb()) {
                lh2 &= 0xFFFFFBFF;
            }
            if (this.fa.PF()) {
                zl.wU("@");
            }
            oc.dN(zl, lh2, -1);
            if (this.fa.KK()) {
                zl.dN(oc.wU);
                zl.wU(" ");
            }
            oc.dN(zl, this.zs, true);
            if (!this.mS.dN().equals("Ljava/lang/Object;") && (!this.fa.EO() || !this.mS.dN().equals("Ljava/lang/Enum;"))) {
                zl.wU(" ");
                zl.dN(oc.LH);
                zl.wU(" ");
                oc.dN(zl, this.mS);
            }
            if (!this.OK.isEmpty() && !this.fa.PF()) {
                Collections.sort((List<Object>)this.OK, new aD(this));
                zl.wU(" ");
                if (this.fa.cb()) {
                    zl.dN(oc.LH);
                }
                else {
                    zl.dN(oc.Hw);
                }
                int n = 0;
                for (final hV hv : this.OK) {
                    if (n == 0) {
                        zl.wU(" ");
                    }
                    else {
                        zl.wU(", ");
                    }
                    oc.dN(zl, hv);
                    ++n;
                }
            }
            if (zl.LH != null) {
                zl.ld(zl.LH.wU(this.dN));
            }
            zl.QE(-2);
        }
        else {
            if (this.OK.size() == 1) {
                oc.dN(zl, this.OK.get(0));
            }
            else {
                oc.dN(zl, this.mS);
            }
            zl.wU("()");
        }
        zl.wU(" {");
        zl.QE();
        zl.rK();
        Collections.sort((List<Object>)this.Hw, new gF(this));
        final Iterator<zd> iterator2 = (Iterator<zd>)this.Hw.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().ld(zl);
        }
        Collections.sort((List<Object>)this.cb, new Kq(this));
        int n2 = 0;
        for (final Dw dw : this.cb) {
            if (!zl.fa && dw.QE()) {
                continue;
            }
            dw.ld(zl);
            ++n2;
        }
        if (n2 >= 1) {
            zl.QE();
        }
        Collections.sort((List<Object>)this.PF, new dz(this, zl));
        int n3 = 0;
        for (final Fu fu : this.PF) {
            if (fu.EO() && ld) {
                continue;
            }
            if (!zl.zs && fu.PF()) {
                continue;
            }
            if (n3 >= 1) {
                zl.QE();
            }
            fu.ld(zl);
            ++n3;
        }
        zl.Ux();
        zl.wU("}");
        if (!ld) {
            zl.QE();
            zl.QE();
        }
        final boolean ok = zl.OK(false);
        if (!this.QE && this.EO.size() > 0) {
            final ArrayList<Comparable> list = new ArrayList<Comparable>();
            for (final String s : this.EO.values()) {
                if (!hV.wU(s).equals("java.lang")) {
                    if (hV.wU(s).equals(this.KK)) {
                        continue;
                    }
                    list.add(hV.ld(s));
                }
            }
            Collections.sort(list);
            if (list.size() > 0) {
                for (final String s2 : list) {
                    zl.dN(oc.rK);
                    zl.s();
                    zl.wU(s2);
                    zl.wU(";");
                    zl.QE();
                    zl.LH(lh);
                    ++lh;
                }
                zl.QE();
                zl.LH(lh);
            }
        }
        zl.OK(ok);
        zl.KK.pop();
    }
    
    @Override
    public List wU() {
        final List dn = TM.dN(this.cb);
        TM.dN(dn, this.PF);
        return TM.dN(dn, this.Hw);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        for (int i = 0; i < this.cb.size(); ++i) {
            if (this.cb.get(i) == ik) {
                this.cb.set(i, ik2);
                return true;
            }
        }
        for (int j = 0; j < this.PF.size(); ++j) {
            if (this.PF.get(j) == ik) {
                this.PF.set(j, ik2);
                return true;
            }
        }
        for (int k = 0; k < this.Hw.size(); ++k) {
            if (this.Hw.get(k) == ik) {
                this.Hw.set(k, ik2);
                return true;
            }
        }
        return false;
    }
    
    public static final class uK
    {
        private AR dN;
        private hV.uK ld;
        private OX.vd QE;
        private GH wU;
        private HashMap fa;
        
        public uK(final AR dn, final hV.uK ld, final OX.vd qe) {
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
            this.fa = new HashMap();
        }
        
        public void dN(final GH wu) {
            this.wU = wu;
        }
        
        public zd dN(final String s) {
            return this.fa.get(s);
        }
        
        public zd ld(final String s) {
            final int dn = ((nh.vd)this.dN.mS().dN(s)).dN();
            zd zd = this.fa.get(s);
            if (zd == null) {
                final yK eo = this.dN.EO(s);
                final hV dn2 = this.ld.dN(s);
                if (eo == null) {
                    zd = new zd(dn, this.dN, this.ld, this.QE, this.wU, s, null, dn2, null, null, null);
                }
                else {
                    final hV dn3 = this.ld.dN(eo.wU(false));
                    final ArrayList<hV> list = new ArrayList<hV>();
                    final String[] fa = eo.fa(false);
                    for (int length = fa.length, i = 0; i < length; ++i) {
                        list.add(this.ld.dN(fa[i]));
                    }
                    zd = new zd(dn, this.dN, this.ld, this.QE, this.wU, s, eo, dn2, dn3, list, null);
                    if (eo.dN() && !eo.ld()) {
                        final yK dn4 = this.dN.dN(eo);
                        if (dn4 != null) {
                            final zd zd2 = this.fa.get(dn4.dN(false));
                            if (zd2 != null) {
                                zd2.dN(zd);
                            }
                        }
                    }
                }
                this.fa.put(s, zd);
            }
            return zd;
        }
    }
}
