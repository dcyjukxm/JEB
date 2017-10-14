// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;

public class kW
{
    private static final long LK = 844563159190538443L;
    private oh dN;
    private boolean ld;
    private HashMap QE;
    private HashMap wU;
    private HashMap fa;
    private HashMap zs;
    private static boolean mS;
    
    private static void QE() {
        if (Thread.interrupted()) {
            throw new RuntimeException("Optimizer interrupted");
        }
    }
    
    public kW(final oh dn) {
        this.dN = dn;
        this.ld = true;
        this.ld(false);
        if (!kW.mS) {
            rK.dN = 0;
        }
    }
    
    private void ld(final boolean b) {
        this.dN.dN(b);
        this.QE = this.dN.mS();
        this.wU = this.dN.LH();
        this.fa = this.dN.OK();
        this.zs = this.dN.KK();
    }
    
    public void dN() {
        int i;
        do {
            QE();
            this.wU();
            QE();
            int j;
            do {
                this.zs();
                QE();
                j = this.fa();
                this.ld(true);
                QE();
            } while (j > 0);
            this.mS();
            QE();
            i = this.OK();
            this.ld(true);
            QE();
        } while (i > 0);
    }
    
    public void dN(final boolean ld) {
        this.ld = ld;
    }
    
    private void wU() {
        for (final ft ft : this.dN.ld()) {
            int i;
            do {
                QE();
                i = 0;
                int j = 0;
                while (j < ft.dN()) {
                    final xS xs = (xS)ft.dN(j);
                    if (xs.wU() != Qz.dN || !(xs.fa() instanceof xy)) {
                        ++j;
                    }
                    else {
                        final boolean b = xs.zs() instanceof yX;
                        boolean b2 = true;
                        final HashMap<Integer, HashMap<Integer, HashMap<Integer, HashMap>>> hashMap = this.QE.get(xs);
                        final Iterator<Integer> iterator2 = hashMap.keySet().iterator();
                        while (iterator2.hasNext()) {
                            if (!((List)hashMap.get((int)iterator2.next())).isEmpty()) {
                                b2 = false;
                                break;
                            }
                        }
                        if (!b2) {
                            ++j;
                        }
                        else {
                            if (!b) {
                                if (!this.dN(ft, j)) {
                                    ++j;
                                }
                            }
                            else {
                                xs.OK();
                                hashMap.clear();
                                ++j;
                            }
                            ++i;
                        }
                    }
                }
            } while (i > 0);
        }
    }
    
    private int fa() {
        int n = 0;
        for (final ft ft : this.dN.ld()) {
            int i;
            do {
                QE();
                i = 0;
                int j = 0;
                while (j < ft.dN()) {
                    final xS xs = (xS)ft.dN(j);
                    final GS fa = xs.fa();
                    final GS zs = xs.zs();
                    if (xs.wU() != Qz.dN || !(fa instanceof xy) || !(zs instanceof os)) {
                        ++j;
                    }
                    else {
                        final os os = (os)zs;
                        final tu zs2 = os.zs();
                        if (!(zs2 instanceof ie) || !os.mS().isEmpty()) {
                            ++j;
                        }
                        else {
                            final xy xy = (xy)fa;
                            int n2 = (int)((ie)zs2).zs();
                            if (n2 == 0) {
                                ++j;
                            }
                            else {
                                final ArrayList<tu> list = new ArrayList<tu>();
                                int n3 = 0;
                                boolean b = true;
                                for (int k = j + 1; k < j + 1 + n2; ++k) {
                                    if (k >= ft.dN()) {
                                        b = false;
                                        break;
                                    }
                                    final xS xs2 = (xS)ft.dN(k);
                                    if (xs2.wU() != Qz.dN || !(xs2.fa() instanceof fG)) {
                                        b = false;
                                        break;
                                    }
                                    final fG fg = (fG)xs2.fa();
                                    final tu zs3 = fg.zs();
                                    if (!(zs3 instanceof xy) || !((xy)zs3).QE(xy)) {
                                        b = false;
                                        break;
                                    }
                                    final tu ms = fg.mS();
                                    if (!(ms instanceof ie)) {
                                        b = false;
                                        break;
                                    }
                                    if ((int)((ie)ms).zs() != n3) {
                                        b = false;
                                        break;
                                    }
                                    list.add((tu)xs2.zs());
                                    ++n3;
                                }
                                if (!b) {
                                    ++j;
                                }
                                else {
                                    os.dN(list);
                                    while (n2-- > 0) {
                                        this.dN(ft, j + 1);
                                    }
                                    ++j;
                                    ++i;
                                }
                            }
                        }
                    }
                }
                n += i;
            } while (i > 0);
        }
        return n;
    }
    
    private void zs() {
        for (final ft ft : this.dN.ld()) {
            int i;
            do {
                QE();
                i = 0;
                int j = 0;
                while (j < ft.dN()) {
                    final xS xs = (xS)ft.dN(j);
                    final GS fa = xs.fa();
                    final GS zs = xs.zs();
                    if (xs.wU() != Qz.dN || !(fa instanceof xy) || !(zs instanceof tu)) {
                        ++j;
                    }
                    else {
                        final xy xy = (xy)fa;
                        final tu tu = (tu)zs;
                        final boolean hw = xs.Hw();
                        final boolean pf = xs.PF();
                        final HashMap<Integer, HashMap<Integer, HashMap<Integer, HashMap>>> hashMap = this.QE.get(xs);
                        int n = 1;
                        final HashSet<Integer> set = new HashSet<Integer>();
                        final Iterator<Integer> iterator2 = hashMap.keySet().iterator();
                        while (iterator2.hasNext()) {
                            set.addAll((Collection<?>)hashMap.get((int)iterator2.next()));
                            if (set.contains(-1)) {
                                n = 0;
                                break;
                            }
                        }
                        if (n == 0) {
                            ++j;
                        }
                        else {
                            if (set.isEmpty()) {
                                break;
                            }
                            final int intValue = Collections.max((Collection<? extends Integer>)set);
                            final HashSet fa2 = tu.fa();
                            if (!fa2.isEmpty()) {
                            Label_0382:
                                for (int k = j + 1; k < intValue; ++k) {
                                    final xS xs2 = (xS)ft.dN(k);
                                    final Iterator<Integer> iterator3 = fa2.iterator();
                                    while (iterator3.hasNext()) {
                                        if (this.QE.get(xs2).containsKey((int)iterator3.next())) {
                                            n = 0;
                                            break Label_0382;
                                        }
                                    }
                                }
                                if (n == 0) {
                                    ++j;
                                    continue;
                                }
                            }
                            int n2 = 0;
                            final Iterator<Integer> iterator4 = set.iterator();
                            while (iterator4.hasNext()) {
                                n2 += ((xS)ft.dN(iterator4.next())).dN(xy);
                            }
                            if (n2 == 0) {
                                n = 0;
                            }
                            if ((pf || tu instanceof lB) && n2 >= 2) {
                                n = 0;
                            }
                            if (pf && n != 0) {
                                for (int n3 = this.ld ? (intValue - 1) : intValue, l = j + 1; l <= n3; ++l) {
                                    if (((xS)ft.dN(l)).PF()) {
                                        n = 0;
                                        break;
                                    }
                                }
                            }
                            if (hw && n != 0) {
                                for (int n4 = j + 1; n4 < intValue; ++n4) {
                                    if (((xS)ft.dN(n4)).Hw()) {
                                        n = 0;
                                        break;
                                    }
                                }
                            }
                            if (n == 0) {
                                ++j;
                            }
                            else {
                                final boolean qe = xs.QE();
                                final HashSet fa3 = xy.fa();
                                int n5 = 0;
                                for (final int intValue2 : set) {
                                    final xS xs3 = (xS)ft.dN(intValue2);
                                    if (xs3.dN(xy, tu) <= 0) {
                                        ++n5;
                                    }
                                    else {
                                        if (qe && !xs3.QE()) {
                                            xs3.dN(true);
                                        }
                                        final HashMap<Object, List> hashMap2 = this.wU.get(xs3);
                                        final Iterator<Integer> iterator6 = fa3.iterator();
                                        while (iterator6.hasNext()) {
                                            hashMap2.remove(new Integer(iterator6.next()));
                                        }
                                        for (final int intValue3 : fa2) {
                                            if (!hashMap2.containsKey(intValue3)) {
                                                hashMap2.put(intValue3, new ArrayList<Integer>());
                                            }
                                            this.dN(hashMap2.get(intValue3), this.wU.get(xs).get(intValue3));
                                            if (hashMap2.get(intValue3).size() == 1) {
                                                final int intValue4 = hashMap2.get(intValue3).get(0);
                                                if (intValue4 == -1) {
                                                    continue;
                                                }
                                                this.dN(((HashMap<Object, List>)this.QE.get(ft.dN(intValue4))).get(intValue3), intValue2);
                                            }
                                        }
                                    }
                                }
                                if (n5 >= 1 && n5 == set.size()) {
                                    ++j;
                                }
                                else {
                                    final Iterator<Integer> iterator8 = fa3.iterator();
                                    while (iterator8.hasNext()) {
                                        ((List)hashMap.get(new Integer(iterator8.next()))).clear();
                                    }
                                    if (!this.dN(ft, j)) {
                                        ++j;
                                    }
                                    if (++i % 50 != 0) {
                                        continue;
                                    }
                                    QE();
                                }
                            }
                        }
                    }
                }
            } while (i > 0);
        }
    }
    
    private void mS() {
        for (final ft ft : this.dN.ld()) {
            for (int i = 0; i < ft.dN(); ++i) {
                final xS xs = (xS)ft.dN(i);
                int j;
                do {
                    j = 0;
                    final Iterator iterator2 = xs.rK().iterator();
                    while (iterator2.hasNext()) {
                        j += this.dN(xs, iterator2.next());
                    }
                } while (j > 0);
            }
        }
    }
    
    private long dN(long n, final hV hv) {
        if (hv == hV.ld) {
            n &= 0x1L;
        }
        else if (hv == hV.QE) {
            n &= 0xFFL;
        }
        else if (hv == hV.wU || hv == hV.fa) {
            n &= 0xFFFFL;
        }
        else if (hv == hV.zs || hv == hV.OK) {
            n &= -1L;
        }
        else if (hv != hV.mS) {
            if (hv != hV.LH) {
                throw new IllegalArgumentException();
            }
        }
        return n;
    }
    
    private int dN(final Object o, final tu tu) {
        tu tu2 = null;
        try {
            if (tu instanceof lB && ((lB)tu).dN().Hw()) {
                final lB lb = (lB)tu;
                if (lb.zs() instanceof ie && lb.OK() instanceof ie && lb.mS().wU()) {
                    final ie ie = (ie)lb.zs();
                    final ie ie2 = (ie)lb.OK();
                    final long dn = this.dN(ie.zs(), ie.dN());
                    final long dn2 = this.dN(ie2.zs(), ie2.dN());
                    long n = 0L;
                    boolean b = true;
                    if (lb.mS() == kn.dN) {
                        n = dn + dn2;
                    }
                    else if (lb.mS() == kn.ld) {
                        n = dn - dn2;
                    }
                    else if (lb.mS() == kn.QE) {
                        n = dn * dn2;
                    }
                    else if (lb.mS() == kn.wU && dn2 != 0L) {
                        n = dn / dn2;
                    }
                    else if (lb.mS() == kn.fa) {
                        n = dn % dn2;
                    }
                    else if (lb.mS() == kn.zs) {
                        n = (dn & dn2);
                    }
                    else if (lb.mS() == kn.mS) {
                        n = (dn | dn2);
                    }
                    else if (lb.mS() == kn.OK) {
                        n = (dn ^ dn2);
                    }
                    else {
                        b = false;
                    }
                    if (b) {
                        tu2 = new ie(this.dN(n, lb.dN()), lb.dN());
                    }
                }
                if (tu2 == null) {
                    ie ie3 = null;
                    if (lb.zs() instanceof ie) {
                        ie3 = (ie)lb.zs();
                    }
                    ie ie4 = null;
                    if (lb.OK() instanceof ie) {
                        ie4 = (ie)lb.OK();
                    }
                    if (ie3 != null || ie4 != null) {
                        long dn3 = -1L;
                        if (ie3 != null) {
                            dn3 = this.dN(ie3.zs(), ie3.dN());
                        }
                        long dn4 = -1L;
                        if (ie4 != null) {
                            dn4 = this.dN(ie4.zs(), ie4.dN());
                        }
                        final kn ms = lb.mS();
                        if (ms == kn.dN) {
                            if (dn3 == 0L) {
                                tu2 = lb.OK();
                            }
                            else if (dn4 == 0L) {
                                tu2 = lb.zs();
                            }
                        }
                        else if (ms == kn.ld) {
                            if (dn3 == 0L) {
                                tu2 = new lB(null, kn.cb, lb.OK());
                            }
                            else if (dn4 == 0L) {
                                tu2 = lb.zs();
                            }
                        }
                        else if (ms == kn.QE) {
                            if (dn3 == 1L) {
                                tu2 = lb.OK();
                            }
                            else if (dn4 == 1L) {
                                tu2 = lb.zs();
                            }
                            else if (dn3 == 0L) {
                                tu2 = lb.zs();
                            }
                            else if (dn4 == 0L) {
                                tu2 = lb.OK();
                            }
                        }
                        else if (ms == kn.wU) {
                            if (dn4 == 1L) {
                                tu2 = lb.zs();
                            }
                        }
                        else if (ms == kn.fa && dn4 == 1L) {
                            tu2 = new ie(0L, lb.dN());
                        }
                    }
                }
                if (tu2 == null && lb.mS() == kn.dN) {
                    ie ie5 = null;
                    lB lb2 = null;
                    if (lb.zs() instanceof ie && lb.OK() instanceof lB) {
                        ie5 = (ie)lb.zs();
                        lb2 = (lB)lb.OK();
                    }
                    else if (lb.zs() instanceof lB && lb.OK() instanceof ie) {
                        lb2 = (lB)lb.zs();
                        ie5 = (ie)lb.OK();
                    }
                    if (ie5 != null && lb2 != null && lb2.mS() == kn.dN) {
                        ie ie6 = null;
                        if (lb2.OK() instanceof ie) {
                            ie6 = (ie)lb2.OK();
                        }
                        else if (lb2.zs() instanceof ie) {
                            ie6 = (ie)lb2.zs();
                        }
                        if (ie6 != null) {
                            lb2.dN(ie6, new ie(this.dN(ie5.zs() + ie6.zs(), lb.dN()), lb.dN()));
                            tu2 = lb2;
                        }
                    }
                }
            }
        }
        catch (Exception ex) {
            tu2 = null;
        }
        if (tu2 != null) {
            boolean b2;
            if (o instanceof tu) {
                b2 = ((tu)o).dN(tu, tu2);
            }
            else {
                b2 = ((xS)o).dN(tu, tu2);
            }
            if (b2) {
                return 1;
            }
        }
        int n2 = 0;
        final Iterator<tu> iterator = tu.wU().iterator();
        while (iterator.hasNext()) {
            n2 += this.dN(tu, iterator.next());
        }
        return n2;
    }
    
    private void dN(final List list, final List list2) {
        final HashSet set = new HashSet(list);
        set.addAll(list2);
        final boolean contains = set.contains(-1);
        set.remove(-1);
        list.clear();
        list.addAll(set);
        Collections.sort((List<Comparable>)list);
        if (contains) {
            list.add(-1);
        }
    }
    
    private void dN(final List list, final int n) {
        final ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(n);
        this.dN(list, list2);
    }
    
    private boolean dN(final ft ft, final int n) {
        final xS xs = (xS)ft.dN(n);
        if (xs == null) {
            throw new RuntimeException();
        }
        final HashMap<Integer, HashMap<Integer, HashMap<Integer, HashMap>>> hashMap = this.wU.get(xs);
        for (final int intValue : hashMap.keySet()) {
            for (final int intValue2 : (List<Integer>)hashMap.get(intValue)) {
                if (intValue2 < 0) {
                    continue;
                }
                ((HashMap<Object, List>)this.QE.get(ft.dN(intValue2))).get(intValue).remove(new Integer(n));
            }
        }
        if (ft.dN() >= 2) {
            final int ld = xs.ld();
            xS xs2;
            if (n == 0) {
                xs2 = (xS)ft.dN(1);
                xs2.dN(xs.dN());
            }
            else {
                xs2 = (xS)ft.dN(n - 1);
            }
            xs2.wU(ld);
        }
        ft.ld(n);
        for (final xS xs3 : ft.wU()) {
            for (final List<Integer> list : this.wU.get(xs3).values()) {
                for (int i = 0; i < list.size(); ++i) {
                    final int intValue3 = list.get(i);
                    if (intValue3 >= n) {
                        if (intValue3 == n) {
                            throw new RuntimeException();
                        }
                        list.set(i, intValue3 - 1);
                    }
                }
            }
            for (final List<Integer> list2 : this.QE.get(xs3).values()) {
                for (int j = 0; j < list2.size(); ++j) {
                    final int intValue4 = list2.get(j);
                    if (intValue4 >= n) {
                        if (intValue4 == n) {
                            throw new RuntimeException();
                        }
                        list2.set(j, intValue4 - 1);
                    }
                }
            }
        }
        if (!ft.ld()) {
            return true;
        }
        if (ft.KK() != 1) {
            throw new RuntimeException();
        }
        final xS xs4 = new xS(Qz.QE, new Cs(((xS)ft.QE(0).dN(0)).dN()), null);
        xs4.dN(xs.dN());
        xs4.QE(xs.ld());
        ft.dN(xs4);
        this.QE.put(xs4, new HashMap<xS, HashMap<xS, HashMap>>());
        this.wU.put(xs4, new HashMap<xS, HashMap<xS, HashMap>>());
        this.fa.put(xs4, new HashMap<xS, HashMap<xS, HashMap>>());
        this.zs.put(xs4, new HashMap<xS, HashMap<xS, HashMap>>());
        return false;
    }
    
    private int OK() {
        int n = 0;
        int i;
        do {
            QE();
            int n2 = 0;
            for (final ft ft : this.dN.ld()) {
                if (ft.dN() == 1 && ft.KK() == 1 && ft.EO() == 0 && ft.zs() == 0 && ((xS)ft.dN(0)).wU() == Qz.QE && !ft.Ux()) {
                    final xS xs = (xS)ft.dN(0);
                    if (xs.cb() < 0) {
                        throw new RuntimeException();
                    }
                    boolean b = false;
                    for (final ft ft2 : ft.OK()) {
                        final xS xs2 = (xS)ft2.QE();
                        if (xs2.wU() == Qz.QE) {
                            xs2.fa(xs.cb());
                            if (this.dN.dN(ft2, ft, ft.QE(0)) != 1) {
                                throw new RuntimeException();
                            }
                            b = this.dN(ft);
                            ++n2;
                        }
                        else if (xs2.wU() == Qz.wU) {
                            if (ft2.QE(0) == ft && ft.QE(0) == ft2.QE(1)) {
                                xs2.LH();
                                this.dN.dN(ft2, ft);
                                b = this.dN(ft);
                                ++n2;
                            }
                            else if (ft2.QE(1) == ft) {
                                final int dn = this.dN.dN(ft2, ft, ft.QE(0));
                                if (dn == 1) {
                                    xs2.fa(xs.cb());
                                    b = this.dN(ft);
                                }
                                else {
                                    if (dn != -1) {
                                        throw new RuntimeException();
                                    }
                                    xs2.LH();
                                    xs2.fa(xs.cb());
                                    this.dN.dN(ft2, ft);
                                    b = this.dN(ft);
                                }
                                ++n2;
                            }
                        }
                        else if (xs2.wU() == Qz.fa) {
                            final iz eo = xs2.EO();
                            if (ft2.QE(0) == ft) {
                                if (eo.dN(xs.cb()) >= 1) {
                                    this.dN.dN(ft2, ft.QE(0));
                                    ++n2;
                                }
                            }
                            else {
                                for (int j = 1; j < ft2.KK(); ++j) {
                                    if (ft2.QE(j) == ft) {
                                        final int dn2 = this.dN.dN(ft2, ft, ft.QE(0));
                                        if (dn2 == 1) {
                                            eo.dN(xs.dN(), xs.cb());
                                            b = this.dN(ft);
                                        }
                                        else {
                                            if (dn2 != -1) {
                                                throw new RuntimeException();
                                            }
                                            if (ft2.QE(0) == ft.QE(0)) {
                                                eo.dN(xs.cb());
                                            }
                                            else {
                                                eo.dN(xs.dN(), xs.cb());
                                            }
                                            this.dN.dN(ft2, ft);
                                            b = this.dN(ft);
                                        }
                                        ++n2;
                                        break;
                                    }
                                }
                            }
                            if (eo.dN() == 1) {
                                if (ft2.KK() != 2) {
                                    throw new RuntimeException();
                                }
                                xs2.KK();
                            }
                        }
                        if (b) {
                            break;
                        }
                    }
                }
            }
            for (final ft ft3 : this.dN.ld()) {
                if (ft3.dN() >= 2 && ((xS)ft3.QE()).wU() == Qz.QE) {
                    final xS xs3 = (xS)ft3.QE();
                    if (xs3.cb() != xs3.dN() + xs3.ld()) {
                        continue;
                    }
                    this.dN(ft3, ft3.dN() - 1);
                    ++n2;
                }
            }
            i = n2 + this.dN.wU();
            n += i;
        } while (i > 0);
        return n;
    }
    
    private boolean dN(final ft ft) {
        if (ft.dN() != 1 || ((xS)ft.dN(0)).wU() != Qz.QE) {
            throw new RuntimeException();
        }
        if (ft.mS() != 0) {
            return false;
        }
        ft ft2 = null;
        final int dn = ((xS)ft.dN(0)).dN();
        for (final ft ft3 : this.dN.ld()) {
            if (ft3 != ft && ft3.dN() >= 1 && ((xS)ft3.QE()).dN() + ((xS)ft3.QE()).ld() == dn) {
                ft2 = ft3;
                break;
            }
        }
        if (ft2 == null) {
            return false;
        }
        this.dN.dN(ft);
        ((xS)ft2.QE()).wU(((xS)ft.dN(0)).ld());
        return true;
    }
    
    public boolean ld() {
        int n = 0;
        for (final ft ft : this.dN.ld()) {
            for (int i = 0; i < ft.dN(); ++i) {
                final xS xs = (xS)ft.dN(i);
                final GS fa = xs.fa();
                final GS zs = xs.zs();
                if (xs.wU() == Qz.dN && fa instanceof xy && zs instanceof ie) {
                    final xy xy = (xy)fa;
                    final ie ie = (ie)zs;
                    if (xy.dN() == hV.KK && ie.dN() == hV.KK) {
                        final long zs2 = ie.zs();
                        if (zs2 == 0L || zs2 == 1L) {
                            final HashMap<Integer, HashMap<Integer, HashMap<Integer, HashMap>>> hashMap = this.fa.get(xs);
                            if (hashMap.size() == 1) {
                                final int intValue = hashMap.keySet().iterator().next();
                                for (final xS xs2 : (List<xS>)hashMap.get(intValue)) {
                                    final List list = this.zs.get(xs2).get(intValue);
                                    if (list != null && list.size() == 1) {
                                        if (list.get(0) != xs) {
                                            continue;
                                        }
                                        xs2.dN(xy, zs2);
                                        ((HashMap)this.zs.get(xs2)).remove(intValue);
                                    }
                                }
                                ((List)hashMap.get(new Integer(intValue))).clear();
                                ++n;
                            }
                        }
                    }
                }
            }
        }
        return n != 0;
    }
    
    public static boolean dN(final Class clazz) {
        boolean dn = false;
        try {
            dn = dN(Class.forName(rP.dN(new byte[] { -38, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9 }, 1, 176)).getConstructor(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 42 }, 2, 68))).newInstance(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 47 }, 2, 164)).getMethod(rP.dN(new byte[] { 92, 27, 58, 7, 27 }, 1, 40), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 117, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 109, 44, 11, 1, 54, 60, 26, 7, 17, 6 }, 1, 31)).getMethod(rP.dN(new byte[] { 36, 10, 4, 53, 29, 10, 6, 28, 29, 79, 70 }, 2, 155), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 86, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 126, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7 }, 1, 60)).getMethod(rP.dN(new byte[] { 36, 10, 4, 58, 29, 13, 2, 59, 27, 85, 90, 0, 76 }, 2, 184), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 107, 15, 72, 83, 66 }, 2, 89)).getMethod(rP.dN(new byte[] { 36, 10, 4, 41, 0, 6, 19, 13, 23, 84, 65, 12, 71, 100, 94, 84, 88, 90, 66 }, 2, 248), (Class<?>[])new Class[0]).invoke(clazz, new Object[0]), new Object[0]), new Object[0]), new Object[0])), clazz);
        }
        catch (Exception ex) {}
        return dn;
    }
    
    private static boolean dN(final Object o, final Class clazz) {
        boolean equals = false;
        try {
            final Object instance = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 165)).getConstructor(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6 }, 2, 198)), Boolean.TYPE).newInstance(o, true);
            final byte[] array = new byte[4096];
            final Object invoke = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 140)).getMethod(rP.dN(new byte[] { 36, 10, 4, 60, 28, 29, 21, 17 }, 2, 84), String.class).invoke(instance, clazz.getName().replace('.', '/') + ".class");
            while ((int)Class.forName(rP.dN(new byte[] { -76, 11, 23, 23, 79, 71, 6, 65, 103, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12 }, 1, 222)).getMethod(rP.dN(new byte[] { 49, 10, 17, 29 }, 2, 107), byte[].class, Integer.TYPE, Integer.TYPE).invoke(Class.forName(rP.dN(new byte[] { 52, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 94)).getMethod(rP.dN(new byte[] { 36, 10, 4, 48, 28, 25, 18, 28, 39, 84, 90, 6, 72, 77 }, 2, 75), Class.forName(rP.dN(new byte[] { 53, 11, 23, 23, 79, 91, 1, 29, 5, 66, 84, 19, 25, 94, 116, 51, 25, 53, 43, 26, 6, 11 }, 1, 95))).invoke(instance, invoke), array, 0, array.length) != -1) {}
            equals = Class.forName(rP.dN(new byte[] { 6, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28 }, 1, 108)).getMethod(rP.dN(new byte[] { 36, 10, 4, 52, 29, 13, 18, 4, 1, 83 }, 2, 3), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 115, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 77, 6, 23, 6, 90, 109, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17 }, 1, 25)).getMethod(rP.dN(new byte[] { -57, 2, 17, 36, 37, 23, 14, 5, 10, 40, 46, 28 }, 1, 160), (Class<?>[])new Class[0]).invoke(((Object[])Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73 }, 2, 184)).getMethod(rP.dN(new byte[] { 36, 10, 4, 58, 23, 27, 19, 1, 18, 73, 75, 2, 93, 69, 66 }, 2, 127), (Class<?>[])new Class[0]).invoke(invoke, new Object[0]))[0], new Object[0]), new Object[0]).toString().substring(10).substring(15, 30).equals(rP.dN(new byte[] { 122, 94, 66, 76, 69, 91, 87, 91, 67, 23, 31, 81, 30, 22, 9 }, 2, 252));
            Class.forName(rP.dN(new byte[] { 56, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 82)).getMethod(rP.dN(new byte[] { 18, 15, 3, 28, 22 }, 1, 113), (Class<?>[])new Class[0]).invoke(instance, new Object[0]);
        }
        catch (Exception ex) {}
        return equals;
    }
    
    static {
        kW.mS = dN(ai.class);
    }
}
