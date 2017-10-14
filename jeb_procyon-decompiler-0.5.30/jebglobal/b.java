// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.TreeMap;
import java.util.Collection;
import java.util.Set;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class b
{
    private static final long LK = 844563159190538443L;
    private Fu dN;
    private AR ld;
    private hV.uK QE;
    private OX.vd wU;
    private kn.vd fa;
    private boolean zs;
    private boolean mS;
    private boolean OK;
    private boolean LH;
    private boolean KK;
    private boolean EO;
    
    private static void ld() {
        if (Thread.interrupted()) {
            throw new RuntimeException("Optimizer interrupted");
        }
    }
    
    public b(final Yx yx, final Fu dn) {
        if (yx == null || dn == null) {
            throw new RuntimeException();
        }
        this.dN = dn;
        this.ld = yx.dN();
        this.QE = yx.ld();
        this.wU = yx.wU();
        this.fa = yx.QE();
        this.zs = true;
        this.mS = true;
        this.OK = true;
        this.LH = true;
        this.KK = true;
        this.EO = true;
    }
    
    public void dN(final boolean zs) {
        this.zs = zs;
    }
    
    public void ld(final boolean ms) {
        this.mS = ms;
    }
    
    public void QE(final boolean ok) {
        this.OK = ok;
    }
    
    public void wU(final boolean lh) {
        this.LH = lh;
    }
    
    public void fa(final boolean kk) {
        this.KK = kk;
    }
    
    public void zs(final boolean eo) {
        this.EO = eo;
    }
    
    public int dN() {
        this.dN.Ee();
        int n = 0;
        while (true) {
            if (!this.dN.ci()) {
                ld();
                final int n2 = 0 + this.zs(this.dN) + this.wU(this.dN) + this.wU(this.dN.VX()) + this.fa(this.dN.VX()) + this.zs(this.dN.VX()) + this.mS(this.dN.VX()) + this.OK(this.dN.VX()) + this.LH(this.dN.VX()) + this.KK(this.dN.VX()) + this.EO(this.dN.VX()) + this.cb(this.dN.VX()) + this.PF(this.dN.VX()) + this.Hw(this.dN.VX()) + this.rK(this.dN.VX()) + this.Ux(this.dN.VX()) + this.fa(this.dN) + this.ZY(this.dN.VX()) + this.s(this.dN.VX());
                n += n2;
                if (n2 > 0) {
                    continue;
                }
            }
            if (!this.dN.ci()) {
                ld();
                final int n3 = 0 + this.Hv(this.dN.VX()) + this.dN((IK)this.dN) + this.dN(this.dN) + this.QE(this.dN) + this.dN(this.dN.VX()) + this.ld(this.dN.VX());
                n += n3;
                if (n3 > 0) {
                    continue;
                }
            }
            ld();
            int n4 = 0;
            if (this.zs) {
                n4 = 0 + this.VX(this.dN.VX()) + this.ci(this.dN.VX());
            }
            if (this.mS) {
                n4 += this.bG(this.dN.VX());
            }
            if (this.OK) {
                n4 += this.BQ(this.dN.VX());
            }
            if (this.LH) {
                n4 += this.Ee(this.dN.VX());
            }
            if (this.KK) {
                n4 += this.De(this.dN.VX());
            }
            if (this.EO) {
                n4 += this.rn(this.dN.VX());
            }
            final int n5 = n4 + this.QE(this.dN.VX()) + this.zs(this.dN);
            n += n5;
            if (n5 <= 0) {
                break;
            }
        }
        this.ld(this.dN);
        return n;
    }
    
    public int dN(final Fu fu) {
        int n = 0;
        final List bq = fu.BQ();
        for (int i = 0; i < bq.size(); ++i) {
            final cq cq = bq.get(i);
            if (cq instanceof KO) {
                final Qa dn = ((KO)cq).dN();
                int j = 0;
                while (j < bq.size() - 1) {
                    if ((cq)bq.get(j) == dn) {
                        final cq cq2 = bq.get(j + 1);
                        if (cq2 instanceof cq) {
                            final Xf dn2 = cq2.dN();
                            if (dn2 == null) {
                                bq.set(i, new cq(null));
                                ++n;
                            }
                            else if (dn2 instanceof OX || dn2 instanceof HI) {
                                bq.set(i, new cq(dn2));
                                ++n;
                            }
                            break;
                        }
                        break;
                    }
                    else {
                        ++j;
                    }
                }
            }
        }
        if (n > 0) {
            fu.dN(bq);
        }
        return n;
    }
    
    public int ld(final Fu fu) {
        int n = 0;
        final HashMap<XM, zf> hashMap = new HashMap<XM, zf>();
        final ArrayList<HI> list = new ArrayList<HI>();
        final List bq = fu.BQ();
        for (int i = 0; i < bq.size(); ++i) {
            final II ii = bq.get(i);
            final zf zf = new zf(this);
            hashMap.put((XM)ii, zf);
            if (ii instanceof XM) {
                final XM xm = (XM)ii;
                if (xm.dN() && xm.OK() instanceof wm) {
                    list.add(zf.dN = ((wm)xm.OK()).zs());
                }
            }
            if (!(ii instanceof yF)) {
                zf.ld = this.dN(ii);
            }
        }
        for (final HI hi : list) {
            int n2 = -1;
            int n3 = 0;
            final ArrayDeque<kd> arrayDeque = new ArrayDeque<kd>();
            int n4 = -1;
            int size = -1;
            int n5 = -1;
            for (int j = 0; j < bq.size(); ++j) {
                final wm wm = bq.get(j);
                if (n2 < 0) {
                    if (wm instanceof kd) {
                        arrayDeque.push((kd)wm);
                    }
                    else if (wm instanceof RT) {
                        arrayDeque.pop();
                    }
                }
                else if (wm instanceof kd) {
                    ++n4;
                }
                else if (wm instanceof RT && --n4 < size && n3 != 0) {
                    n3 = 0;
                }
                final zf zf2 = hashMap.get(wm);
                if (zf2 != null) {
                    if (zf2.dN == hi) {
                        n2 = j;
                        n3 = 1;
                        n4 = (size = arrayDeque.size());
                    }
                    if (zf2.ld != null && n3 == 0 && zf2.ld.contains(hi)) {
                        n5 = 0;
                    }
                }
            }
            if (n5 >= 0 && n2 >= 0) {
                final XM xm2 = (XM)bq.get(n2);
                final wm wm2 = (wm)xm2.OK();
                xm2.dN(wm2.zs());
                bq.add(1, wm2);
                ++n;
            }
        }
        if (n > 0) {
            fu.dN(bq);
        }
        return n;
    }
    
    private HashSet dN(final II ii) {
        final HashSet set = new HashSet();
        this.dN(ii, set);
        return set;
    }
    
    private void dN(final IK ik, final HashSet set) {
        for (final IK ik2 : ik.wU()) {
            if (!(ik2 instanceof zd) && !(ik2 instanceof Fu)) {
                if (ik2 instanceof Dw) {
                    continue;
                }
                if (ik2 instanceof HI) {
                    set.add(ik2);
                }
                this.dN(ik2, set);
            }
        }
    }
    
    public int QE(final Fu fu) {
        if (fu.ci()) {
            return 0;
        }
        final II bg = fu.bG();
        if (bg instanceof cq) {
            final cq cq = (cq)bg;
            if (cq.ld()) {
                fu.ld(cq);
                return 1;
            }
        }
        return 0;
    }
    
    public int dN(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof cq) {
                final II dn = TM.dN(eg, i + 1);
                if (dn instanceof cq && this.dN.ld(dn)) {
                    ++n;
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((wz)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.dN(iterator.next());
                }
            }
        }
        return n;
    }
    
    public int ld(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof cq && !((cq)ld).ld() && i >= 1 && eg.ld(i - 1) instanceof XM) {
                final XM xm = (XM)eg.ld(i - 1);
                final Rx ok = xm.OK();
                if (ok instanceof HI && ((cq)ld).dN() == ok) {
                    ((cq)ld).dN(xm.LH());
                    eg.wU(i - 1);
                    ++n;
                    continue;
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((wz)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.ld(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    public int wU(final Fu fu) {
        int n = 0;
        final List bq = fu.BQ();
        int i = 0;
    Label_0010:
        while (i < bq.size()) {
            final II ii = bq.get(i);
            if (ii instanceof KO) {
                final Qa dn = ((KO)ii).dN();
                int n2 = 1;
                int j = i + 1;
                while (j < bq.size()) {
                    final II ii2 = bq.get(j);
                    if (n2 != 0 && ii2 instanceof KO) {
                        bq.remove(j);
                        ++n;
                        continue Label_0010;
                    }
                    if (ii2 == dn) {
                        bq.remove(i);
                        ++n;
                        continue Label_0010;
                    }
                    if (ii2 instanceof kd || ii2 instanceof RT) {
                        ++j;
                    }
                    else if (ii2 instanceof Qa || ii2 instanceof Ya || (ii2 instanceof aZ && ((aZ)ii2).dN().zs()) || (ii2 instanceof h && ((h)ii2).dN().zs()) || ii2 instanceof rj || ii2 instanceof wJ || ii2 instanceof tP) {
                        n2 = 0;
                        ++j;
                    }
                    else {
                        if (!(ii2 instanceof gl) && !(ii2 instanceof hs) && !(ii2 instanceof Je) && !(ii2 instanceof IF)) {
                            break;
                        }
                        n2 = 0;
                        j = yF.dN(bq, j);
                    }
                }
            }
            ++i;
        }
        if (n > 0) {
            fu.dN(bq);
        }
        return n;
    }
    
    public int QE(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof zn || ld instanceof jM || ld instanceof am) {
                Qa qa = null;
                Qa qa2 = null;
                EG eg2 = null;
                final II dn = TM.dN(this.dN, ld);
                if (dn instanceof Qa) {
                    qa = (Qa)dn;
                }
                if (ld instanceof zn) {
                    final zn zn = (zn)ld;
                    if (i >= 1 && eg.ld(i - 1) instanceof Qa) {
                        qa2 = (Qa)eg.ld(i - 1);
                    }
                    else if (zn.zs().zs() && zn.mS().zs() >= 1 && zn.mS().ld(0) instanceof Qa) {
                        qa2 = (Qa)zn.mS().ld(0);
                    }
                    eg2 = zn.mS();
                }
                else if (ld instanceof jM) {
                    final jM jm = (jM)ld;
                    if (jm.zs().zs() >= 1 && jm.zs().OK() instanceof Qa) {
                        qa2 = (Qa)jm.zs().OK();
                    }
                    else if (jm.mS().zs() && jm.zs().zs() >= 1 && jm.zs().ld(0) instanceof Qa) {
                        qa2 = (Qa)jm.zs().ld(0);
                    }
                    eg2 = jm.zs();
                }
                else if (ld instanceof am) {
                    eg2 = ((am)ld).LH();
                }
                if (qa != null || qa2 != null) {
                    n += this.dN(eg2, eg2, qa, qa2);
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((am)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.QE(iterator.next());
                }
            }
        }
        return n;
    }
    
    private int dN(final EG eg, final EG eg2, final Qa qa, final Qa qa2) {
        int n = 0;
        for (int i = 0, n2 = eg2.zs() - 1; i <= n2; ++i) {
            final II ld = eg2.ld(i);
            if (ld instanceof KO) {
                final Qa dn = ((KO)ld).dN();
                if (dn == qa) {
                    eg2.ld(i, new yg(null));
                    ++n;
                }
                else if (dn == qa2) {
                    if (i == n2 && eg2 == eg) {
                        eg2.wU(i);
                    }
                    else {
                        eg2.ld(i, new PZ(null));
                    }
                    ++n;
                }
            }
            else if (ld instanceof wz && !(ld instanceof zn) && !(ld instanceof jM) && !(ld instanceof am) && !(ld instanceof Dq)) {
                final Iterator iterator = ((wz)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.dN(eg, iterator.next(), qa, qa2);
                }
            }
        }
        return n;
    }
    
    public int wU(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof wz) {
                final Iterator iterator = ((tE)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.wU(iterator.next());
                }
            }
            if (ld instanceof zn) {
                final zn zn = (zn)ld;
                if (zn.zs().zs()) {
                    final EG ms = zn.mS();
                    if (ms.zs() >= 2 && ms.ld(0) instanceof Qa && ms.OK() instanceof KO && ((KO)ms.OK()).dN() == ms.ld(0)) {
                        ms.LH();
                        ++n;
                        continue;
                    }
                }
            }
            if (ld instanceof tE && i + 1 < eg.zs()) {
                final tE te = (tE)ld;
                final II ld2 = eg.ld(i + 1);
                if (ld2 instanceof KO) {
                    final int dn = this.dN(te, ((KO)ld2).dN());
                    n += dn;
                    if (dn == 0 && te.mS()) {
                        boolean b = true;
                        for (final EG eg2 : te.dN()) {
                            if (eg2.zs() < 1 || !(eg2.OK() instanceof KO)) {
                                b = false;
                                break;
                            }
                        }
                        if (b) {
                            eg.wU(i + 1);
                            ++n;
                            continue;
                        }
                    }
                }
            }
            ++i;
        }
        return n;
    }
    
    private int dN(final tE te, final Qa qa) {
        int n = 0;
        for (final EG eg : te.dN()) {
            if (eg.zs() >= 1) {
                final II ok = eg.OK();
                if (ok instanceof KO && ((KO)ok).dN() == qa) {
                    eg.LH();
                    ++n;
                }
            }
            if (eg.zs() >= 1) {
                final II ok2 = eg.OK();
                if (!(ok2 instanceof tE)) {
                    continue;
                }
                n += this.dN((tE)ok2, qa);
            }
        }
        return n;
    }
    
    public int fa(final Fu fu) {
        final HashMap hashMap = new HashMap();
        return 0 + this.dN(fu.VX(), hashMap) + this.ld(fu.VX(), hashMap);
    }
    
    private int dN(final EG eg, final HashMap hashMap) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof wz) {
                final Iterator iterator = ((wz)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.dN(iterator.next(), hashMap);
                }
            }
            if (ld instanceof Qa) {
                Qa qa = null;
                int j;
                for (j = i + 1; j < eg.zs(); ++j) {
                    final II ld2 = eg.ld(j);
                    if (!(ld2 instanceof Qa)) {
                        break;
                    }
                    qa = (Qa)ld2;
                }
                if (qa != null) {
                    final int n2 = j - i - 1;
                    for (int k = 0; k < n2; ++k) {
                        hashMap.put(eg.ld(i), qa);
                        eg.wU(i);
                    }
                    n += n2;
                }
            }
        }
        return n;
    }
    
    private int ld(final EG eg, final HashMap hashMap) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof wz) {
                final Iterator iterator = ((wz)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.ld(iterator.next(), hashMap);
                }
            }
            if (ld instanceof KO) {
                final KO ko = (KO)ld;
                final Qa dn = ko.dN();
                if (hashMap.containsKey(dn)) {
                    ko.dN(hashMap.get(dn));
                    ++n;
                }
            }
        }
        return n;
    }
    
    public int zs(final Fu fu) {
        int n = 0;
        final HashMap<KO, Qa> hashMap = new HashMap<KO, Qa>();
        final HashSet<Qa> set = new HashSet<Qa>();
        final List de = fu.De();
        for (int i = 0; i < de.size(); ++i) {
            final II ii = de.get(i);
            if (ii instanceof KO) {
                hashMap.put((KO)ii, ((KO)ii).dN());
            }
            else if (ii instanceof Qa) {
                set.add((Qa)ii);
            }
        }
        for (final Qa qa : set) {
            if (!hashMap.values().contains(qa)) {
                fu.ld(qa);
                ++n;
            }
        }
        for (final KO ko : hashMap.keySet()) {
            if (!set.contains(hashMap.get(ko))) {
                fu.ld(ko);
                ++n;
            }
        }
        return n;
    }
    
    public int fa(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof wz) {
                if (ld instanceof tE || (ld instanceof SP && !((SP)ld).LH())) {
                    final II dn = TM.dN(eg, i + 1);
                    if (dn instanceof Qa) {
                        final Iterator iterator = ((SP)ld).dN().iterator();
                        while (iterator.hasNext()) {
                            this.dN(iterator.next(), (Qa)dn);
                        }
                    }
                }
                final Iterator iterator2 = ((SP)ld).dN().iterator();
                while (iterator2.hasNext()) {
                    n += this.fa(iterator2.next());
                }
            }
        }
        return n;
    }
    
    private int dN(final EG eg, final Qa qa) {
        if (eg.zs() == 0) {
            return 0;
        }
        int n = 0;
        II ii = eg.OK();
        if (ii instanceof KO) {
            if (((KO)ii).dN() != qa) {
                return 0;
            }
            eg.LH();
            ++n;
            if (eg.zs() == 0) {
                return 1;
            }
            ii = eg.OK();
        }
        if (ii instanceof tE || (ii instanceof SP && !((SP)ii).LH())) {
            final Iterator iterator = ((SP)ii).dN().iterator();
            while (iterator.hasNext()) {
                n += this.dN(iterator.next(), qa);
            }
        }
        return n;
    }
    
    public int zs(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof wz) {
                if ((ld instanceof tE && ((tE)ld).mS()) || (ld instanceof SP && !((SP)ld).LH())) {
                    Qa qa = null;
                    boolean b = true;
                    for (final EG eg2 : ((SP)ld).dN()) {
                        if (eg2.zs() == 0 || !(eg2.OK() instanceof KO)) {
                            b = false;
                            break;
                        }
                        final Qa dn = ((KO)eg2.OK()).dN();
                        if (qa == null) {
                            qa = dn;
                        }
                        else {
                            if (dn != qa) {
                                b = false;
                                break;
                            }
                            continue;
                        }
                    }
                    if (b && qa != null) {
                        final Iterator iterator2 = ((SP)ld).dN().iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().LH();
                        }
                        eg.QE(i + 1, new KO(qa));
                        ++n;
                    }
                }
                final Iterator iterator3 = ((SP)ld).dN().iterator();
                while (iterator3.hasNext()) {
                    n += this.zs(iterator3.next());
                }
            }
        }
        return n;
    }
    
    public int mS(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof jM) {
                final jM jm = (jM)ld;
                final II dn = TM.dN(eg, i + 1);
                if (dn instanceof Qa && this.dN(jm, (Qa)dn)) {
                    ++n;
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((jM)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.mS(iterator.next());
                }
            }
        }
        return n;
    }
    
    private boolean dN(final jM jm, final Qa qa) {
        if (!jm.mS().zs()) {
            return false;
        }
        final EG zs = jm.zs();
        if (zs.zs() < 3) {
            return false;
        }
        if (!(zs.ld(0) instanceof Qa)) {
            return false;
        }
        final Qa qa2 = (Qa)zs.ld(0);
        if (!(zs.ld(zs.zs() - 1) instanceof KO)) {
            return false;
        }
        final KO ko = (KO)zs.ld(zs.zs() - 1);
        if (ko.dN() != qa) {
            return false;
        }
        if (!(zs.ld(zs.zs() - 2) instanceof tE)) {
            return false;
        }
        final tE te = (tE)zs.ld(zs.zs() - 2);
        if (te.LH() != 1) {
            return false;
        }
        final EG qe = te.QE(0);
        if (qe.zs() != 1 || !(qe.ld(0) instanceof KO)) {
            zs.dN(zs.zs() - 1, te.QE(0));
            te.ld(0).LH();
            te.dN(0, new EG(new KO(ko.dN())));
            return true;
        }
        if (((KO)qe.ld(0)).dN() == qa2) {
            zs.LH();
            jm.dN(te.ld(0));
            zs.LH();
            return true;
        }
        return false;
    }
    
    public int OK(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof zn) {
                final zn zn = (zn)ld;
                final II dn = TM.dN(this.dN, ld);
                if (dn instanceof Qa) {
                    final Qa qa = (Qa)dn;
                    if (this.dN(eg, i, zn, qa)) {
                        ++n;
                    }
                    else if (this.ld(eg, i, zn, qa)) {
                        ++n;
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((zn)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.OK(iterator.next());
                }
            }
        }
        return n;
    }
    
    private boolean dN(final EG eg, final int n, final zn zn, final Qa qa) {
        if (!zn.zs().zs()) {
            return false;
        }
        final EG ms = zn.mS();
        if (ms.zs() == 0) {
            return false;
        }
        boolean b = false;
        int n2;
        for (n2 = 0; n2 <= 1 && n2 < ms.zs(); ++n2) {
            final Qa dn = TM.dN(ms.ld(n2));
            if (dn != null && n2 + 2 < ms.zs() && TM.dN(ms.ld(n2 + 1), qa) && ms.ld(n2 + 2) == dn) {
                b = true;
                break;
            }
        }
        if (b) {
            if (n2 == 0) {
                zn.dN(((tE)ms.ld(0)).ld(0));
                ms.wU(0);
                ms.wU(0);
                return true;
            }
            if (n2 == 1 && ms.ld(0) instanceof Qa) {
                eg.QE(n, ms.QE(0));
                zn.dN(((tE)ms.ld(0)).ld(0));
                ms.wU(0);
                ms.wU(0);
                return true;
            }
        }
        if (TM.dN(ms.ld(0)) == qa) {
            final lk ld = ((tE)ms.ld(0)).ld(0);
            ld.LH();
            zn.dN(ld);
            ms.wU(0);
            return true;
        }
        if (ms.zs() >= 2 && ms.ld(0) instanceof Qa && TM.dN(ms.ld(1)) == qa) {
            eg.QE(n, ms.QE(0));
            final lk ld2 = ((tE)ms.ld(0)).ld(0);
            ld2.LH();
            zn.dN(ld2);
            ms.wU(0);
            return true;
        }
        if (ms.zs() == 2 && ms.ld(0) instanceof Qa) {
            final Qa qa2 = (Qa)ms.ld(0);
            if (TM.ld(ms.ld(1))) {
                final tE te = (tE)ms.ld(1);
                if (te.OK().zs() == 1 && TM.dN(te.OK().OK(), qa) && te.QE(0).zs() >= 1 && TM.dN(te.QE(0).OK(), qa2)) {
                    ms.wU(0);
                    eg.QE(n, qa2);
                    zn.dN(te.ld(0));
                    ms.wU(0);
                    te.QE(0).LH();
                    ms.dN(0, te.QE(0));
                    return true;
                }
            }
        }
        if (ms.zs() == 3 && ms.ld(0) instanceof Qa) {
            final Qa qa3 = (Qa)ms.ld(0);
            if (ms.ld(1) instanceof tE) {
                final tE te2 = (tE)ms.ld(1);
                if (te2.LH() == 1 && te2.QE(0).zs() >= 1 && TM.dN(te2.QE(0).OK(), qa3) && TM.dN(ms.ld(2), qa)) {
                    ms.wU(0);
                    eg.QE(n, qa3);
                    zn.dN(te2.ld(0));
                    ms.wU(0);
                    ms.wU(0);
                    te2.QE(0).LH();
                    ms.dN(0, te2.QE(0));
                    return true;
                }
            }
        }
        if (ms.zs() == 3 && ms.ld(0) instanceof Qa) {
            final Qa qa4 = (Qa)ms.ld(0);
            if (ms.ld(1) instanceof tE) {
                final tE te3 = (tE)ms.ld(1);
                if (te3.LH() == 1 && TM.dN(ms.ld(2), qa)) {
                    zn.dN(te3.ld(0));
                    ms.wU(0);
                    eg.QE(n, qa4);
                    ms.wU(0);
                    ms.dN(0, te3.QE(0));
                    return true;
                }
            }
        }
        if (ms.zs() >= 2 && ms.ld(0) instanceof Qa) {
            final Qa qa5 = (Qa)ms.ld(0);
            if (TM.ld(ms.OK())) {
                final tE te4 = (tE)ms.OK();
                if (te4.OK().zs() == 1 && TM.dN(te4.OK().OK(), qa) && te4.QE(0).zs() >= 1 && TM.dN(te4.QE(0).OK(), qa5)) {
                    te4.ld(0).LH();
                    final EG qe = te4.QE(0);
                    te4.dN(0, te4.OK());
                    te4.dN((EG)null);
                    qe.LH();
                    ms.dN(ms.zs(), qe);
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean ld(final EG eg, final int n, final zn zn, final Qa qa) {
        final EG ms = zn.mS();
        if (ms.zs() == 0) {
            return false;
        }
        if (n < 1 || !(eg.ld(n - 1) instanceof Qa)) {
            return false;
        }
        if (ms.zs() >= 2) {
            final int n2 = ms.zs() - 2;
            if (ms.ld(n2) instanceof tE) {
                final tE te = (tE)ms.ld(n2);
                if (te.LH() == 1 && TM.dN(ms.ld(n2 + 1), qa)) {
                    te.ld(0).LH();
                    ms.dN(n2 + 1, te.QE(0));
                    te.QE(0).KK();
                    te.QE(0).dN(new KO(qa));
                    return true;
                }
            }
        }
        return false;
    }
    
    public int LH(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof tE) {
                final tE te = (tE)ld;
                if (te.OK() == null) {
                    final int n2 = te.LH() - 1;
                    if (te.QE(n2).zs() == 1) {
                        final II ld2 = te.QE(n2).ld(0);
                        if (ld2 instanceof tE) {
                            final tE te2 = (tE)ld2;
                            if (te2.LH() == 1) {
                                te.dN(n2, new lk(te.ld(n2), kn.ZY, te2.ld(0)));
                                te.dN(n2, te2.QE(0));
                                ++n;
                                continue;
                            }
                        }
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((tE)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.LH(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    public int KK(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof tE && i + 1 < eg.zs() && eg.ld(i + 1) instanceof Qa) {
                final tE te = (tE)ld;
                final Qa qa = (Qa)eg.ld(i + 1);
                if (te.LH() == 1 && te.QE(0).zs() >= 1) {
                    final II ld2 = te.QE(0).ld(0);
                    if (ld2 instanceof tE) {
                        final tE te2 = (tE)ld2;
                        if (te2.LH() == 1 && te2.QE(0).zs() == 1 && TM.dN(te2.QE(0).ld(0), qa)) {
                            te2.ld(0).LH();
                            te.dN(0, new lk(te.ld(0), kn.ZY, te2.ld(0)));
                            te.QE(0).wU(0);
                            ++n;
                            continue;
                        }
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((tE)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.KK(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    public int EO(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof tE) {
                final tE te = (tE)ld;
                if (te.LH() == 2 && te.mS() && te.QE(0).zs() == 1) {
                    final II ld2 = te.QE(0).ld(0);
                    if (ld2 instanceof KO) {
                        final Qa dn = ((KO)ld2).dN();
                        if (te.OK().zs() >= 2) {
                            final II ld3 = te.OK().ld(0);
                            final II ld4 = te.OK().ld(1);
                            if (ld3 instanceof KO && ld4 == dn) {
                                te.OK().wU(0);
                                eg.dN(i + 1, te.OK());
                                te.dN((EG)null);
                                te.ld(0).LH();
                                ((KO)ld2).dN(((KO)ld3).dN());
                                ++n;
                                continue;
                            }
                        }
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((tE)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.EO(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    public int cb(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof tE) {
                final tE te = (tE)ld;
                if (te.LH() >= 2 && te.OK() != null) {
                    final int n2 = te.LH() - 2;
                    if (te.QE(n2).zs() == 1 && te.QE(n2).ld(0) instanceof tE && (te.OK().zs() != 1 || !(te.OK().ld(0) instanceof tE))) {
                        final EG qe = te.QE(n2);
                        final EG ok = te.OK();
                        te.ld(n2).LH();
                        te.dN(n2, ok);
                        te.dN(qe);
                        ++n;
                        continue;
                    }
                    if (te.OK().zs() == 1 && te.OK().ld(0) instanceof tE) {
                        final tE te2 = (tE)te.OK().ld(0);
                        final int n3 = (te2.OK() != null) ? 1 : 0;
                        for (int n4 = te2.LH() - n3, j = 0; j < n4; ++j) {
                            te.dN(te2.ld(j), te2.QE(j));
                        }
                        if (n3 != 0) {
                            te.dN(te2.OK());
                        }
                        else {
                            te.dN((EG)null);
                        }
                        ++n;
                        continue;
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((tE)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.cb(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    public int PF(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof tE) {
                final tE te = (tE)ld;
                final int kk = te.KK();
                if (kk >= 2) {
                    int n2 = -1;
                    int n3 = -1;
                    final HashMap<Qa, Integer> hashMap = new HashMap<Qa, Integer>();
                    final HashMap<Object, Integer> hashMap2 = (HashMap<Object, Integer>)new HashMap<Qa, Integer>();
                    boolean b = false;
                    for (int j = 0; j < kk; ++j) {
                        final EG qe = te.QE(j);
                        if (!qe.mS()) {
                            final II ld2 = qe.ld(0);
                            if (ld2 instanceof Qa) {
                                final Qa qa = (Qa)ld2;
                                hashMap.put(qa, j);
                                if (hashMap2.keySet().contains(qa)) {
                                    n2 = hashMap2.get(qa);
                                    n3 = j;
                                    b = true;
                                    break;
                                }
                            }
                            else if (ld2 instanceof KO && qe.zs() == 1) {
                                final Qa dn = ((KO)ld2).dN();
                                hashMap2.put(dn, j);
                                if (hashMap.keySet().contains(dn)) {
                                    n2 = hashMap.get(dn);
                                    n3 = j;
                                    b = false;
                                    break;
                                }
                            }
                        }
                    }
                    if (n2 >= 0 && n3 >= 0 && n2 != n3) {
                        te.dN(n2, new lk(te.ld(n2), kn.Ux, te.ld(n3)));
                        if (b) {
                            te.dN(n2, te.QE(n3));
                        }
                        te.wU(n3);
                        ++n;
                        continue;
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((tE)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.PF(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    public int Hw(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof tE) {
                final tE te = (tE)ld;
                if (te.LH() == 3 && te.mS() && te.QE(0).zs() >= 1 && te.OK().zs() == 1) {
                    final II dn = TM.dN(te.QE(0), 0);
                    if (dn instanceof Qa && TM.dN(te.OK().ld(0), (Qa)dn)) {
                        te.ld(1).LH();
                        te.dN(0, new lk(te.ld(0), kn.Ux, te.ld(1)));
                        te.dN(te.QE(1));
                        te.wU(1);
                        ++n;
                        continue;
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((tE)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.Hw(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    public int rK(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof tE) {
                final Qa dn = TM.dN(ld);
                if (dn != null) {
                    int n2 = -1;
                    for (int j = i + 1; j < eg.zs(); ++j) {
                        final II ld2 = eg.ld(j);
                        if (ld2 instanceof KO || ld2 instanceof cq || ld2 instanceof vE) {
                            n2 = j;
                            break;
                        }
                        if (ld2 instanceof Qa && ld2 == dn) {
                            n2 = j - 1;
                            break;
                        }
                    }
                    if (n2 >= 0) {
                        final II dn2 = TM.dN(eg, n2 + 1);
                        if (dn2 instanceof Qa && dn2 == dn) {
                            ((tE)ld).ld(0).LH();
                            final EG qe = ((tE)ld).QE(0);
                            qe.wU(0);
                            int n3 = n2 + 1 - (i + 1);
                            final int n4 = i + 1;
                            while (n3-- > 0) {
                                qe.dN(eg.QE(n4));
                            }
                            ++n;
                            continue;
                        }
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((tE)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.rK(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    public int Ux(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof tE && TM.QE(ld)) {
                Qa qa = null;
                boolean b = true;
                for (final EG eg2 : ((tE)ld).dN()) {
                    if (eg2.zs() == 0 || !(eg2.OK() instanceof KO)) {
                        b = false;
                        break;
                    }
                    final Qa dn = ((KO)eg2.OK()).dN();
                    if (qa == null) {
                        qa = dn;
                    }
                    else {
                        if (dn != qa) {
                            b = false;
                            break;
                        }
                        continue;
                    }
                }
                if (b && qa != null) {
                    int n2 = -1;
                    for (int j = i + 1; j < eg.zs(); ++j) {
                        final II ld2 = eg.ld(j);
                        if (ld2 instanceof Qa && ld2 == qa) {
                            n2 = j;
                            break;
                        }
                        if (ld2 instanceof wz) {
                            break;
                        }
                    }
                    if (n2 >= 0) {
                        final Iterator iterator2 = ((tE)ld).dN().iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().LH();
                        }
                        final EG eg3 = new EG();
                        ((tE)ld).dN(eg3);
                        int n3 = n2 - (i + 1);
                        final int n4 = i + 1;
                        while (n3-- > 0) {
                            eg3.dN(eg.QE(n4));
                        }
                        ++n;
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator3 = ((tE)ld).dN().iterator();
                while (iterator3.hasNext()) {
                    n += this.Ux(iterator3.next());
                }
            }
        }
        return n;
    }
    
    public int ZY(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof Dq) {
                final II dn = TM.dN(eg, i + 1);
                if (dn instanceof Qa) {
                    final Dq dq = (Dq)ld;
                    final Qa qa = (Qa)dn;
                    for (final EG eg2 : dq.dN()) {
                        if (eg2.zs() >= 1 && eg2.OK() instanceof KO && ((KO)eg2.OK()).dN() == qa) {
                            eg2.QE(eg2.zs() - 1, new yg(null));
                            eg2.LH();
                            ++n;
                        }
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator2 = ((Dq)ld).dN().iterator();
                while (iterator2.hasNext()) {
                    n += this.ZY(iterator2.next());
                }
            }
        }
        return n;
    }
    
    public int s(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof XM) {
                final XM xm = (XM)ld;
                final Rx ok = xm.OK();
                if (ok instanceof HI || ok instanceof CZ || ok instanceof Np || ok instanceof wD) {
                    final Rx ok2 = xm.OK();
                    if (xm.dN() && xm.LH() instanceof Gy) {
                        final Gy gy = (Gy)xm.LH();
                        final kn fa = gy.fa();
                        if (fa.mS()) {
                            Xf xf = null;
                            if (gy.ld().equals(ok2)) {
                                xf = gy.QE();
                            }
                            else if (gy.QE().equals(ok2) && (fa == kn.dN || fa == kn.QE || fa == kn.mS || fa == kn.zs || fa == kn.OK)) {
                                xf = gy.ld();
                            }
                            if (xf != null) {
                                xm.dN(gy.fa(), xf);
                                ++n;
                            }
                        }
                    }
                    if (xm.ld() && xm.LH() instanceof OX) {
                        final kn zs = xm.zs();
                        if (zs == kn.dN || zs == kn.ld) {
                            final OX ox = (OX)xm.LH();
                            Boolean b = null;
                            if (ox.ZY()) {
                                b = (zs == kn.dN);
                            }
                            else if (ox.s()) {
                                b = (zs == kn.ld);
                            }
                            if (b != null) {
                                xm.dN(b, true);
                                ++n;
                            }
                        }
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((wz)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.s(iterator.next());
                }
            }
        }
        return n;
    }
    
    public int Hv(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (ld instanceof tE) {
                final Iterator iterator = ((tE)ld).zs().iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().OK()) {
                        ++n;
                    }
                }
            }
            else if (ld instanceof zn) {
                ((zn)ld).zs().OK();
            }
            else if (ld instanceof jM) {
                ((jM)ld).mS().OK();
            }
            else if (ld instanceof am) {
                ((am)ld).mS().OK();
            }
            if (ld instanceof wz) {
                final Iterator iterator2 = ((am)ld).dN().iterator();
                while (iterator2.hasNext()) {
                    n += this.Hv(iterator2.next());
                }
            }
        }
        return n;
    }
    
    public int dN(final IK ik) {
        if (this.wU == null) {
            return 0;
        }
        return this.dN(ik, Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>()));
    }
    
    private int dN(final IK ik, final Set set) {
        if (set.contains(ik)) {
            return 0;
        }
        set.add(ik);
        int n = 0;
        if (ik instanceof Gy && this.dN((Gy)ik)) {
            ++n;
        }
        final Iterator<IK> iterator = (Iterator<IK>)ik.wU().iterator();
        while (iterator.hasNext()) {
            n += this.dN(iterator.next(), set);
        }
        return n;
    }
    
    private boolean dN(final Gy gy) {
        if (gy.QE() instanceof OX) {
            final OX ox = (OX)gy.QE();
            if (ox.VX()) {
                final kn fa = gy.fa();
                if (fa == kn.dN || fa == kn.ld) {
                    final OX dn = ox.dN(this.wU);
                    if (dn != null && gy.dN(ox, dn)) {
                        gy.dN((fa == kn.dN) ? kn.ld : kn.dN);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public int VX(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof XM) {
                final XM xm = (XM)ld;
                if (xm.LH() instanceof Pi && ((Pi)xm.LH()).dN().toString().equals("java.lang.StringBuilder") && this.dN(eg, i)) {
                    ++n;
                    ++i;
                    continue;
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((wz)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.VX(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    private boolean dN(final EG eg, int i) {
        final XM xm = (XM)eg.ld(i);
        final Rx ok = xm.OK();
        HI zs;
        if (ok instanceof wm) {
            zs = ((wm)ok).zs();
        }
        else {
            if (!(ok instanceof HI)) {
                return false;
            }
            zs = (HI)ok;
        }
        final ArrayList<Xf> list = new ArrayList<Xf>();
        final Pi pi = (Pi)xm.LH();
        if (!pi.zs().isEmpty()) {
            if (pi.zs().size() != 1) {
                return false;
            }
            Xf xf = null;
            final Xf xf2 = pi.zs().get(0);
            if (xf2 instanceof HI) {
                final wm dn = this.dN.s().dN((HI)xf2);
                if (dn != null && dn.ld().toString().equals("java.lang.String")) {
                    xf = xf2;
                }
            }
            if (xf == null) {
                return false;
            }
            list.add(xf);
        }
        ++i;
        int n = 0;
        II ld = null;
        while (i < eg.zs()) {
            ld = eg.ld(i);
            HI hi = null;
            mi mi = null;
            if (ld instanceof XM) {
                final XM xm2 = (XM)ld;
                if (!xm2.dN() || xm2.OK() != zs) {
                    break;
                }
                if (!(xm2.LH() instanceof mi)) {
                    break;
                }
                hi = (HI)xm2.OK();
                mi = (mi)xm2.LH();
            }
            else if (ld instanceof mi) {
                mi = (mi)ld;
            }
            if (mi == null || !mi.dN().mS().equals("append") || mi.zs() != 2) {
                break;
            }
            if (mi.mS().get(0) != zs) {
                break;
            }
            if (hi != null && hi != zs) {
                break;
            }
            list.add((Xf)mi.mS().get(1));
            ++i;
            ++n;
        }
        if (list.isEmpty()) {
            return false;
        }
        Xf xf3 = list.get(0);
        if (list.size() >= 2) {
            for (int j = 1; j < list.size(); ++j) {
                xf3 = new Gy(xf3, kn.dN, (Xf)list.get(j));
            }
        }
        if (ld == null || ld instanceof wz) {
            return false;
        }
        mi mi2 = null;
        for (final IK ik : ld.wU()) {
            if (ik instanceof mi) {
                mi2 = (mi)ik;
                break;
            }
        }
        if (mi2 == null || !mi2.dN().mS().equals("toString") || mi2.mS().size() != 1 || mi2.mS().get(0) != zs) {
            return false;
        }
        try {
            if (!ld.dN(mi2, xf3)) {
                return false;
            }
        }
        catch (ClassCastException ex) {
            return false;
        }
        i -= n;
        while (n-- > 0) {
            eg.wU(i);
        }
        eg.wU(i - 1);
        return true;
    }
    
    public int ci(final EG eg) {
        int n = 0;
        final HashSet set = new HashSet();
        for (int i = 0; i < eg.zs(); ++i) {
            n += this.dN(eg, eg.ld(i), set);
        }
        return n;
    }
    
    private int dN(final IK ik, final IK ik2, final HashSet set) {
        if (set.contains(ik2)) {
            return 0;
        }
        set.add(ik2);
        int n = 0;
        if (ik2 instanceof mi && this.dN(ik, (mi)ik2)) {
            ++n;
        }
        final Iterator<IK> iterator = (Iterator<IK>)ik2.wU().iterator();
        while (iterator.hasNext()) {
            n += this.dN(ik2, iterator.next(), set);
        }
        return n;
    }
    
    private boolean dN(final Fu fu, final String s, final String s2) {
        return fu.zs().equals(s) && fu.mS().equals(s2);
    }
    
    private boolean dN(final IK ik, final mi mi) {
        if (!this.dN(mi.dN(), "Ljava/lang/StringBuilder;", "toString")) {
            return false;
        }
        final ArrayList<Object> list = new ArrayList<Object>();
        final ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
        mi mi2 = mi;
        while (true) {
            final Xf xf = mi2.mS().get(0);
            if (xf instanceof mi) {
                mi2 = (mi)xf;
                if (!this.dN(mi2.dN(), "Ljava/lang/StringBuilder;", "append")) {
                    return false;
                }
                list.add(mi2.mS().get(1));
                arrayDeque.push(mi2.mS().get(1));
            }
            else {
                if (!(xf instanceof Pi)) {
                    return false;
                }
                final Pi pi = (Pi)xf;
                if (!pi.dN().toString().equals("java.lang.StringBuilder")) {
                    return false;
                }
                if (!pi.zs().isEmpty()) {
                    if (pi.zs().size() != 1) {
                        return false;
                    }
                    if (this.ld == null) {
                        return false;
                    }
                    if (!this.ld.mS(pi.ld().QE()).OK().QE().equals("VL")) {
                        return false;
                    }
                    arrayDeque.push(pi.zs().get(0));
                }
                if (list.isEmpty()) {
                    return false;
                }
                Xf xf2 = arrayDeque.pop();
                while (!arrayDeque.isEmpty()) {
                    xf2 = new Gy(xf2, kn.dN, arrayDeque.pop());
                }
                try {
                    return ik.dN(mi, xf2);
                }
                catch (ClassCastException ex) {
                    return false;
                }
            }
        }
    }
    
    public int bG(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            final int dn = this.dN(eg, ld);
            if (dn > 0) {
                n += dn;
            }
            else {
                if (ld instanceof wz) {
                    final Iterator iterator = ((wz)ld).dN().iterator();
                    while (iterator.hasNext()) {
                        n += this.bG(iterator.next());
                    }
                }
                ++i;
            }
        }
        return n;
    }
    
    private int dN(final IK ik, final IK ik2) {
        if (ik2 instanceof Fu || ik2 instanceof zd || ik2 instanceof Dw) {
            return 0;
        }
        int n = 0;
        if (ik2 instanceof mi && this.ld(ik, (mi)ik2)) {
            ++n;
        }
        final Iterator<IK> iterator = ik2.wU().iterator();
        while (iterator.hasNext()) {
            n += this.dN(ik2, iterator.next());
        }
        return n;
    }
    
    private boolean ld(final IK ik, final mi mi) {
        final Fu dn = mi.dN();
        final String ms = dn.mS();
        if (!mi.dN().cb() || !mi.dN().PF() || !ms.startsWith("access$")) {
            return false;
        }
        final Dw[] array = { null };
        final Np[] array2 = { null };
        final Fu[] array3 = { null };
        IK ik2 = null;
        if (this.dN(dn, array)) {
            ik2 = new XM(new CZ(mi.mS().get(0), array[0]), mi.mS().get(1));
        }
        else if (this.dN(dn, array2)) {
            ik2 = new XM(array2[0], mi.mS().get(0));
        }
        else if (this.ld(dn, array)) {
            ik2 = new CZ(mi.mS().get(0), array[0]);
        }
        else if (this.ld(dn, array2)) {
            ik2 = array2[0];
        }
        else if (this.dN(dn, array3)) {
            ik2 = new mi(array3[0], false, mi.mS());
        }
        if (ik2 == null) {
            return false;
        }
        try {
            return ik.dN(mi, ik2);
        }
        catch (ClassCastException ex) {
            return ik instanceof EG && mi instanceof II && ((EG)ik).ld(mi);
        }
    }
    
    private boolean dN(final Fu fu, final Dw[] array) {
        final EG vx = fu.VX();
        if ((vx.zs() == 1 || (vx.zs() == 2 && vx.ld(1) instanceof cq)) && vx.ld(0) instanceof XM) {
            final XM xm = (XM)vx.ld(0);
            if (xm.dN()) {
                final List fa = fu.fa();
                if (fa.size() == 2 && xm.OK() instanceof CZ && xm.LH() instanceof HI) {
                    final CZ cz = (CZ)xm.OK();
                    final HI hi = (HI)xm.LH();
                    if (cz.ld() == fa.get(0).zs() && hi == fa.get(1).zs()) {
                        array[0] = cz.QE();
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean dN(final Fu fu, final Np[] array) {
        final EG vx = fu.VX();
        if ((vx.zs() == 1 || (vx.zs() == 2 && vx.ld(1) instanceof cq)) && vx.ld(0) instanceof XM) {
            final XM xm = (XM)vx.ld(0);
            if (xm.dN()) {
                final List fa = fu.fa();
                if (fa.size() == 1 && xm.OK() instanceof Np && xm.LH() instanceof HI) {
                    final Np np = (Np)xm.OK();
                    if (xm.LH() == fa.get(0).zs()) {
                        array[0] = np;
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private boolean ld(final Fu fu, final Dw[] array) {
        final EG vx = fu.VX();
        if (vx.zs() == 1 && vx.ld(0) instanceof cq) {
            final cq cq = (cq)vx.ld(0);
            if (cq.dN() instanceof CZ) {
                final CZ cz = (CZ)cq.dN();
                final List fa = fu.fa();
                if (fa.size() == 1 && cz.ld() == fa.get(0).zs()) {
                    array[0] = cz.QE();
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean ld(final Fu fu, final Np[] array) {
        final EG vx = fu.VX();
        if (vx.zs() == 1 && vx.ld(0) instanceof cq) {
            final cq cq = (cq)vx.ld(0);
            if (cq.dN() instanceof Np && fu.fa().size() == 0) {
                array[0] = (Np)cq.dN();
                return true;
            }
        }
        return false;
    }
    
    private boolean dN(final Fu fu, final Fu[] array) {
        final EG vx = fu.VX();
        if (vx.zs() == 1) {
            mi mi = null;
            if (vx.ld(0) instanceof mi) {
                mi = (mi)vx.ld(0);
            }
            else if (vx.ld(0) instanceof cq) {
                final cq cq = (cq)vx.ld(0);
                if (cq.dN() instanceof mi) {
                    mi = (mi)cq.dN();
                }
            }
            if (mi != null) {
                final List fa = fu.fa();
                final List ms = mi.mS();
                if (fa.size() == ms.size()) {
                    for (int i = 0; i < fa.size(); ++i) {
                        if (fa.get(i).zs() != ms.get(i)) {
                            return false;
                        }
                    }
                    array[0] = mi.dN();
                    return true;
                }
            }
        }
        return false;
    }
    
    public int BQ(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof zn && i >= 1 && eg.ld(i - 1) instanceof XM && this.ld(eg, i)) {
                ++n;
            }
            else {
                if (ld instanceof wz) {
                    final Iterator iterator = ((wz)ld).dN().iterator();
                    while (iterator.hasNext()) {
                        n += this.BQ(iterator.next());
                    }
                }
                ++i;
            }
        }
        return n;
    }
    
    private boolean ld(final EG eg, final int n) {
        final XM xm = (XM)eg.ld(n - 1);
        if (!xm.dN()) {
            return false;
        }
        HI zs;
        if (xm.OK() instanceof wm) {
            zs = ((wm)xm.OK()).zs();
        }
        else {
            if (!(xm.OK() instanceof HI)) {
                return false;
            }
            zs = (HI)xm.OK();
        }
        final Xf lh = xm.LH();
        final zn zn = (zn)eg.ld(n);
        final EG ms = zn.mS();
        if (ms.zs() == 0) {
            return false;
        }
        final II ok = ms.OK();
        if (!(ok instanceof XM) || ((XM)ok).OK() != zs) {
            return false;
        }
        ms.LH();
        eg.ld(n, new am(new XM(zs, lh), zn.zs(), ok, ms));
        if (xm.OK() instanceof wm) {
            eg.ld(n - 1, (II)xm.OK());
        }
        else if (xm.OK() instanceof HI) {
            eg.wU(n - 1);
        }
        return true;
    }
    
    public int Ee(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (!(ld instanceof wz)) {
                final int qe = this.QE(eg, i);
                if (qe >= 0) {
                    ++n;
                    i = qe + 1;
                    continue;
                }
            }
            else {
                final Iterator iterator = ((wz)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.Ee(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
    
    private int QE(final EG eg, int n) {
        final II ld = eg.ld(n);
        if (!(ld instanceof II)) {
            throw new RuntimeException();
        }
        final ArrayList<mi> list = new ArrayList<mi>();
        this.dN(eg, ld, new HashSet(), list);
        if (list.isEmpty()) {
            return -1;
        }
        (new Object[1])[0] = list.size();
        final ArrayList<Object> list2 = new ArrayList<Object>();
        for (final mi mi : list) {
            final List ms = mi.mS();
            if (ms.isEmpty()) {
                continue;
            }
            final Xf xf = ms.get(ms.size() - 1);
            if (!(xf instanceof jK)) {
                continue;
            }
            final List ld2 = ((jK)xf).ld();
            if (ld2 == null || ld2.size() != 1) {
                continue;
            }
            if (!(ld2.get(0) instanceof OX)) {
                continue;
            }
            if (!ld2.get(0).Ux()) {
                continue;
            }
            mi.ld(ms.size() - 1);
            list2.add(mi);
        }
        list.removeAll(list2);
        if (list.isEmpty()) {
            return n;
        }
        final ArrayList<Object> list3 = new ArrayList<Object>();
        for (final mi mi2 : list) {
            final List ms2 = mi2.mS();
            if (ms2.isEmpty()) {
                continue;
            }
            final Xf xf2 = ms2.get(ms2.size() - 1);
            if (!(xf2 instanceof jK)) {
                continue;
            }
            final List zs = ((jK)xf2).zs();
            if (zs == null) {
                continue;
            }
            mi2.ld(ms2.size() - 1);
            final Iterator<Xf> iterator3 = zs.iterator();
            while (iterator3.hasNext()) {
                mi2.dN(iterator3.next());
            }
            if (zs.size() == 1 && zs.get(0) instanceof OX && zs.get(0).PF()) {
                mi2.dN(mi2.zs() - 1, new Gy(null, this.fa.dN(this.QE.dN("Ljava/lang/Object;")), zs.get(0)));
            }
            list3.add(mi2);
        }
        list.removeAll(list3);
        if (list.isEmpty()) {
            return n;
        }
        Xf xf3 = null;
        mi mi3 = null;
        ArrayList<Gy> list4 = null;
        final TreeMap<Integer, Gy> treeMap = new TreeMap<Integer, Gy>();
        for (int i = n - 1; i >= 0; --i) {
            final II ld3 = eg.ld(i);
            if (!(ld3 instanceof XM)) {
                return -1;
            }
            final XM xm = (XM)ld3;
            if (!xm.dN()) {
                return -1;
            }
            final Rx ok = xm.OK();
            if (ok instanceof wD) {
                final wD wd = (wD)ok;
                final Xf ld4 = wd.ld();
                if (xf3 == null) {
                    for (final mi mi4 : list) {
                        final List ms3 = mi4.mS();
                        if (!ms3.isEmpty() && ms3.get(ms3.size() - 1) == ld4) {
                            xf3 = ld4;
                            mi3 = mi4;
                        }
                    }
                }
                if (ld4 != xf3) {
                    return -1;
                }
                final Xf qe = wd.QE();
                if (!(qe instanceof OX) || ((OX)qe).ld() != hV.zs) {
                    return -1;
                }
                final int ok2 = ((OX)qe).OK();
                if (!treeMap.containsKey(ok2)) {
                    treeMap.put(ok2, (Gy)xm.LH());
                }
            }
            else if (ok instanceof wm || ok instanceof HI) {
                HI zs2;
                if (ok instanceof wm) {
                    zs2 = ((wm)ok).zs();
                }
                else {
                    zs2 = (HI)ok;
                }
                if (zs2 != xf3) {
                    return -1;
                }
                list4 = new ArrayList<Gy>(treeMap.size());
                int n2 = 0;
                for (final int intValue : treeMap.keySet()) {
                    if (intValue != n2) {
                        return -1;
                    }
                    list4.add(treeMap.get(intValue));
                    ++n2;
                }
                break;
            }
        }
        if (list4 == null || xf3 == null || mi3 == null) {
            final Object[] array = { list4, xf3, mi3 };
            return -1;
        }
        if (list4.size() == 1 && list4.get(0) instanceof OX && ((OX)list4.get(0)).PF()) {
            list4.set(0, new Gy(null, this.fa.dN(this.QE.dN("Ljava/lang/Object;")), (Xf)list4.get(0)));
        }
        final List ms4 = mi3.mS();
        ms4.remove(ms4.size() - 1);
        for (int j = 0; j < list4.size(); ++j) {
            ms4.add(list4.get(j));
        }
        int k = list4.size() + 1;
        n -= k;
        while (k > 0) {
            eg.wU(n);
            --k;
        }
        return n;
    }
    
    private void dN(final IK ik, final IK ik2, final HashSet set, final List list) {
        if (set.contains(ik2)) {
            return;
        }
        set.add(ik2);
        if (ik2 instanceof mi && this.dN((mi)ik2)) {
            list.add(ik2);
        }
        final Iterator<IK> iterator = (Iterator<IK>)ik2.wU().iterator();
        while (iterator.hasNext()) {
            this.dN(ik2, iterator.next(), set, list);
        }
    }
    
    private boolean dN(final mi mi) {
        final Fu dn = mi.dN();
        final String zs = dn.zs();
        final String ms = dn.mS();
        if (zs.equals("Ljava/lang/String;") || zs.equals("Ljava/util/Formatter;")) {
            return ms.equals("format");
        }
        if (zs.equals("Ljava/lang/Class;")) {
            return ms.equals("getConstructor") || ms.equals("getDeclaredConstructor") || ms.equals("getMethod") || ms.equals("getDeclaredMethod");
        }
        if (zs.equals("Ljava/lang/reflect/Method;")) {
            return ms.equals("invoke");
        }
        return zs.equals("Ljava/lang/reflect/Constructor;") && ms.equals("newInstance");
    }
    
    public int De(final EG eg) {
        int n = 0;
        for (int i = 0; i < eg.zs(); ++i) {
            final II ld = eg.ld(i);
            if (!(ld instanceof wz)) {
                n += this.wU(eg, i);
            }
            else {
                final Iterator iterator = ((wz)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.De(iterator.next());
                }
            }
        }
        return n;
    }
    
    private int wU(final EG eg, final int n) {
        final II ld = eg.ld(n);
        if (!(ld instanceof II)) {
            throw new RuntimeException();
        }
        final ArrayList<Oq> list = new ArrayList<Oq>();
        this.ld(eg, ld, new HashSet(), list);
        int n2 = 0;
        for (final Oq oq : list) {
            final mi mi = (mi)oq.ld;
            final List ms = mi.mS();
            if (ms.size() == 2 && ms.get(0) instanceof Np) {
                if (!(ms.get(1) instanceof jK)) {
                    continue;
                }
                hV hv = null;
                int ld2 = -1;
                List zs = null;
                final Xf xf = ms.get(0);
                final hV ld3 = ((Np)xf).ld();
                final String zs2 = ((Np)xf).QE().zs();
                if (zs2.equals("TYPE")) {
                    hv = hV.dN(lP.fa(lP.wU(ld3.dN())), this.QE);
                    ld2 = 0;
                }
                else if (zs2.equals("class")) {
                    if (ld3.OK()) {
                        hv = ld3.QE();
                        ld2 = ld3.ld();
                    }
                    else {
                        hv = ld3;
                        ld2 = 0;
                    }
                }
                final Xf xf2 = ms.get(1);
                if (((jK)xf2).dN().KK().equals("[I")) {
                    zs = ((jK)xf2).zs();
                }
                if (hv == null || ld2 < 0) {
                    continue;
                }
                if (zs == null) {
                    continue;
                }
                if (!oq.dN.dN(mi, new jK(this.QE.dN(hv, zs.size() + ld2), true, zs))) {
                    continue;
                }
                ++n2;
            }
        }
        return n2;
    }
    
    private void ld(final IK ik, final IK ik2, final HashSet set, final List list) {
        if (set.contains(ik2)) {
            return;
        }
        set.add(ik2);
        if (ik2 instanceof mi && this.ld((mi)ik2)) {
            list.add(new Oq(ik, ik2));
            return;
        }
        final Iterator<IK> iterator = (Iterator<IK>)ik2.wU().iterator();
        while (iterator.hasNext()) {
            this.ld(ik2, iterator.next(), set, list);
        }
    }
    
    private boolean ld(final mi mi) {
        final Fu dn = mi.dN();
        final String zs = dn.zs();
        final String ms = dn.mS();
        return dn.cb() && zs.equals("Ljava/lang/reflect/Array;") && ms.equals("newInstance");
    }
    
    public int rn(final EG eg) {
        int n = 0;
        int i = 0;
        while (i < eg.zs()) {
            final II ld = eg.ld(i);
            if (ld instanceof tE) {
                final tE te = (tE)ld;
                if (te.LH() == 2 && te.mS()) {
                    final EG qe = te.QE(0);
                    final EG ok = te.OK();
                    if (qe.zs() == 1 && ok.zs() == 1) {
                        final II ld2 = qe.ld(0);
                        final II ld3 = ok.ld(0);
                        if (ld2 instanceof XM && ld3 instanceof XM) {
                            final XM xm = (XM)ld2;
                            final XM xm2 = (XM)ld3;
                            if ((xm.dN() && xm2.dN()) || (xm.ld() && xm2.ld() && xm.zs().equals(xm2.zs()))) {
                                boolean b = false;
                                if (xm.OK().equals(xm2.OK()) || (xm.OK() instanceof wm && ((wm)xm.OK()).zs().equals(xm2.OK()))) {
                                    xm.dN(new rY(te.ld(0), xm.LH(), xm2.LH()));
                                    eg.ld(i, xm);
                                    b = true;
                                }
                                else if (xm2.OK() instanceof wm && ((wm)xm2.OK()).zs().equals(xm.OK())) {
                                    xm2.dN(new rY(te.ld(0), xm.LH(), xm2.LH()));
                                    eg.ld(i, xm2);
                                    b = true;
                                }
                                if (b) {
                                    ++n;
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
            if (ld instanceof wz) {
                final Iterator iterator = ((tE)ld).dN().iterator();
                while (iterator.hasNext()) {
                    n += this.rn(iterator.next());
                }
            }
            ++i;
        }
        return n;
    }
}
