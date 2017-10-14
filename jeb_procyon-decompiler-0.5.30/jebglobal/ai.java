// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.TreeMap;
import java.util.HashSet;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
import java.util.List;

public class ai
{
    private static final long LK = 844563159190538443L;
    private Yx ld;
    private Gz QE;
    private oh wU;
    private List fa;
    private List zs;
    private Fu mS;
    private TB OK;
    private rK LH;
    private HashMap KK;
    private HashMap EO;
    private HashMap cb;
    private HashMap PF;
    private HashMap Hw;
    public boolean dN;
    private int rK;
    private int Ux;
    private Stack ZY;
    private Stack s;
    private static boolean Hv;
    private static boolean VX;
    private static boolean ci;
    
    public ai(final Yx ld, final Gz qe) {
        this.Hw = new HashMap();
        this.dN = false;
        this.ld = ld;
        this.QE = qe;
        this.wU = qe.ld();
        this.fa = this.wU.ld();
        this.zs = new ArrayList();
        final Iterator<ft> iterator = this.fa.iterator();
        while (iterator.hasNext()) {
            this.zs.addAll(iterator.next().wU());
        }
        this.dN(qe.fa());
    }
    
    public ai(final Yx ld, final AV av) {
        this.Hw = new HashMap();
        this.dN = false;
        this.ld = ld;
        this.dN(av);
    }
    
    private void dN(final AV av) {
        this.mS = this.ld.zs.dN(av.ld(), av.zs());
        this.OK = new TB(this.ld.dN, this.wU, true, this.ld.ld, this.ld.QE, this.ld.wU, this.ld.zs, this.ld.mS, this.mS.s(), this.mS.Hv());
    }
    
    public Fu dN() {
        return this.mS;
    }
    
    public Fu ld() {
        if (this.zs == null) {
            throw new RuntimeException();
        }
        final Iterator<xS> iterator = this.zs.iterator();
        while (iterator.hasNext()) {
            final II dn = iterator.next().dN(this.OK);
            if (dn == null) {
                continue;
            }
            this.mS.dN(dn);
        }
        this.fa();
        return this.mS;
    }
    
    public Fu QE() {
        if (this.zs == null) {
            throw new RuntimeException();
        }
        if (!ai.Hv || !ai.VX || !ai.ci) {
            jebglobal.rK.dN = 0;
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        this.wU.dN(list, list2);
        this.LH = new rK(list, list2);
        this.KK = this.LH.dN();
        this.wU();
        final Dc dc = new Dc(this.LH, (this.mS.zs() + "->" + this.mS.mS()).getBytes());
        this.EO = dc.QE();
        this.cb = dc.dN();
        this.PF = dc.ld();
        this.dN = dc.dN;
        this.dN(this.mS.VX());
        this.fa();
        return this.mS;
    }
    
    private void wU() {
        final List qe = this.QE.QE();
        if (qe == null || qe.isEmpty()) {
            return;
        }
        for (int i = 1; i <= this.KK.size(); ++i) {
            final int dn = ((xS)this.wU.dN(this.KK.get(i) - 1).dN(0)).dN();
            for (final Gz.vd vd : qe) {
                if (dn >= vd.dN && dn < vd.ld) {
                    vd.wU.add(i);
                }
                for (final Gz.uK uk : vd.QE) {
                    if (uk.QE == dn) {
                        uk.wU = i;
                    }
                }
            }
        }
        for (final Gz.vd vd2 : qe) {
            wB wb = null;
            for (final int intValue : vd2.wU) {
                if (wb == null || intValue != wb.ld + 1) {
                    wb = new wB(intValue, intValue);
                    this.Hw.put(intValue, wb);
                    for (final Gz.uK uk2 : vd2.QE) {
                        wb.QE.add(new eO(uk2.wU, uk2.dN, uk2.ld));
                    }
                }
                else {
                    wb.ld = intValue;
                }
            }
        }
        final ArrayList<wB> list = new ArrayList<wB>(this.Hw.values());
        Collections.sort((List<Object>)list, new Aj(this));
        int j = 0;
        while (j < list.size() - 1) {
            final wB wb2 = list.get(j);
            final wB wb3 = list.get(j + 1);
            if (wb2.ld + 1 == wb3.dN && this.dN(wb2.QE, wb3.QE)) {
                wb2.ld = wb3.ld;
                this.Hw.remove(wb3.dN);
                list.remove(j + 1);
            }
            else {
                ++j;
            }
        }
        final ArrayList<Integer> list2 = new ArrayList<Integer>();
    Label_0563:
        for (final int intValue2 : this.Hw.keySet()) {
            final wB wb4 = this.Hw.get(intValue2);
            for (int k = wb4.dN; k <= wb4.ld; ++k) {
                final Iterator iterator7 = this.wU.dN(this.KK.get(k) - 1).wU().iterator();
                while (iterator7.hasNext()) {
                    if (iterator7.next().QE()) {
                        continue Label_0563;
                    }
                }
            }
            list2.add(intValue2);
        }
        final Iterator<Object> iterator8 = list2.iterator();
        while (iterator8.hasNext()) {
            this.Hw.remove((int)iterator8.next());
        }
        for (final wB wb5 : this.Hw.values()) {
            boolean b = true;
            boolean b2 = false;
            for (final eO eo : wb5.QE) {
                if (eo.dN <= wb5.ld) {
                    b = false;
                    break;
                }
                if (eo.dN != wb5.ld + 1) {
                    continue;
                }
                b2 = true;
            }
            if (b) {
                if (!b2) {
                    continue;
                }
                final ArrayList<Comparable> list3 = new ArrayList<Comparable>();
                final Iterator iterator11 = wb5.QE.iterator();
                while (iterator11.hasNext()) {
                    list3.add(iterator11.next().dN);
                }
                Collections.sort(list3);
                final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
                for (int l = 0; l < list3.size() - 1; ++l) {
                    hashMap.put((int)list3.get(l), list3.get(l + 1) - 1);
                }
                if (list3.size() >= 1) {
                    final int intValue3 = list3.get(list3.size() - 1);
                    hashMap.put(intValue3, intValue3);
                }
                for (final eO eo2 : wb5.QE) {
                    eo2.ld = hashMap.get(eo2.dN);
                }
                Collections.sort((List<Object>)wb5.QE, new Nn(this));
                final eO eo3 = wb5.QE.get(wb5.QE.size() - 1);
                eo3.ld = this.dN(eo3.dN);
                wb5.wU = true;
            }
        }
    }
    
    private boolean dN(final List list, final List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (list.get(i).dN != list2.get(i).dN) {
                return false;
            }
        }
        return true;
    }
    
    private int dN(final int n) {
        int i = 0;
    Label_0075:
        for (i = n + 1; i <= this.LH.ld(); ++i) {
            final Iterator iterator = this.LH.ld(i).iterator();
            while (iterator.hasNext()) {
                if (iterator.next() < n) {
                    break Label_0075;
                }
            }
        }
        final int n2 = i - 1;
        if (n2 == n) {
            return n;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        final HashSet<Object> set2 = new HashSet<Object>();
        set2.add(n);
        while (!set.isEmpty()) {
            final HashSet<Integer> set3 = new HashSet<Integer>();
            final Iterator<Integer> iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                for (final int intValue : this.LH.wU(iterator2.next())) {
                    if (intValue >= n && intValue <= n2 && !set2.contains(intValue)) {
                        set3.add(intValue);
                    }
                }
            }
            set2.addAll(set);
            set = set3;
        }
        for (int j = n; j <= n2; ++j) {
            if (!set2.contains(j)) {
                return j - 1;
            }
        }
        return n2;
    }
    
    private void fa() {
        final List ld = this.OK.KK.ld();
        for (final Qa qa : ld) {
            this.mS.dN(qa.dN(), qa);
        }
        final TreeMap wu = this.QE.wU();
        for (final Qa qa2 : ld) {
            final Integer n = wu.get(qa2.dN());
            if (n != null) {
                qa2.dN(n);
            }
        }
    }
    
    private void dN(EG o) {
        this.rK = 1;
        this.Ux = this.fa.size() + 1;
        this.ZY = new Stack();
        this.s = new Stack();
        while (true) {
            if (this.rK >= this.Ux) {
                if (this.ZY.isEmpty()) {
                    break;
                }
                o = this.ZY.pop();
                this.Ux = this.s.pop();
            }
            else {
                if (this.Hw.containsKey(this.rK)) {
                    final wB wb = this.Hw.get(this.rK);
                    final EG eg = new EG();
                    final SP sp = new SP(eg);
                    ((EG)o).dN(sp);
                    this.ZY.push(o);
                    this.s.push(this.Ux);
                    if (!wb.wU) {
                        for (int i = 0; i < wb.QE.size(); ++i) {
                            final eO eo = wb.QE.get(i);
                            HI dn = null;
                            if (eo.wU != null) {
                                dn = ((sX)eo.wU.dN(this.OK)).dN();
                            }
                            final EG eg2 = new EG();
                            sp.dN(eo.QE, dn, eg2);
                            final xS xs = (xS)this.fa.get(this.KK.get(eo.dN) - 1).dN(0);
                            int dn2 = xs.dN();
                            if (xs.wU() == Qz.OK) {
                                dn2 += xs.ld();
                            }
                            eg2.dN(new KO(this.mS.Hv().dN(dn2, "label_" + dn2)));
                        }
                    }
                    else {
                        for (int j = wb.QE.size() - 1; j >= 0; --j) {
                            final eO eo2 = wb.QE.get(j);
                            HI dn3 = null;
                            if (eo2.wU != null) {
                                dn3 = ((sX)eo2.wU.dN(this.OK)).dN();
                            }
                            final EG eg3 = new EG();
                            sp.dN(eo2.QE, dn3, eg3);
                            this.ZY.push(eg3);
                            this.s.push(eo2.ld + 1);
                        }
                    }
                    o = eg;
                    this.Ux = wb.ld + 1;
                }
                if (this.cb.containsKey(this.rK)) {
                    final Dc.vd vd = this.cb.get(this.rK);
                    if (vd.ld == Dc.lX.ld) {
                        final EG eg4 = new EG();
                        ((EG)o).dN(new jM(eg4, new lk(new Gy(null, kn.Hw, this.ld.wU.dN(true)))));
                        this.ZY.push(o);
                        this.s.push(this.Ux);
                        o = eg4;
                        this.Ux = Math.min(vd.dN + 1, this.s.peek());
                    }
                    else {
                        final EG eg5 = new EG();
                        ((EG)o).dN(new zn(new lk(new Gy(null, kn.Hw, this.ld.wU.dN(true))), eg5));
                        this.ZY.push(o);
                        this.s.push(this.Ux);
                        o = eg5;
                        this.Ux = Math.min(vd.dN + 1, this.s.peek());
                    }
                }
                final ft ft = this.fa.get(this.KK.get(this.rK) - 1);
                this.dN(ft, (EG)o);
                if ((this.EO.containsKey(this.rK) || this.PF.containsKey(this.rK)) && ((EG)o).zs() >= 1 && ((EG)o).OK() instanceof Dq) {
                    this.QE(ft, (EG)o);
                }
                else if (this.PF.containsKey(this.rK) && ((EG)o).zs() >= 1 && ((EG)o).OK() instanceof tE) {
                    final EG[] array = { null };
                    if (!this.dN(ft, (EG)o, array)) {
                        this.ld(ft, (EG)o);
                    }
                    else {
                        o = array[0];
                    }
                }
                else {
                    this.ld(ft, (EG)o);
                }
                ++this.rK;
            }
        }
    }
    
    private void dN(final ft ft, final EG eg) {
        final Iterator<xS> iterator = ft.wU().iterator();
        while (iterator.hasNext()) {
            final II dn = iterator.next().dN(this.OK);
            if (dn == null) {
                continue;
            }
            if (dn instanceof sX) {
                continue;
            }
            eg.dN(dn);
        }
    }
    
    private void ld(final ft ft, final EG eg) {
        if (ft.KK() >= 1) {
            final xS xs = (xS)ft.QE();
            final int n = xs.dN() + xs.ld();
            eg.dN(new KO(this.mS.Hv().dN(n, "label_" + n)));
        }
    }
    
    private boolean dN(final ft ft, final EG eg, final EG[] array) {
        final tE te = (tE)eg.OK();
        final Dc.uK uk = this.PF.get(this.rK);
        final List qe = this.LH.QE(this.rK);
        final int n = this.rK + 1;
        if (!qe.contains(n)) {
            return false;
        }
        final ft ft2 = this.fa.get(this.KK.get(n) - 1);
        if (ft.KK() != 2 || !ft.PF().contains(ft2)) {
            throw new RuntimeException();
        }
        final boolean b = ft.QE(0) == ft2;
        final EG qe2 = te.QE(0);
        final int dn = ((xS)ft.QE(0).dN(0)).dN();
        final KO ko = new KO(this.mS.Hv().dN(dn, "label_" + dn));
        if (qe.contains(uk.ld)) {
            if (b) {
                eg.dN(qe2.LH());
                te.ld(0).LH();
                qe2.dN(ko);
            }
            else {
                eg.dN(ko);
            }
            this.ZY.push(eg);
            this.s.push(this.Ux);
            array[0] = qe2;
            this.Ux = Math.min(uk.ld, this.s.peek());
        }
        else {
            final EG eg2 = new EG();
            te.dN(eg2);
            if (b) {
                eg2.dN(qe2.LH());
                te.ld(0).LH();
                qe2.dN(ko);
            }
            else {
                eg2.dN(ko);
            }
            final int dn2 = ((xS)this.fa.get(this.KK.get(uk.ld) - 1).dN(0)).dN();
            eg.dN(new KO(this.mS.Hv().dN(dn2, "label_" + dn2)));
            final int intValue = qe.get(0);
            final int intValue2 = qe.get(1);
            int n2;
            if (intValue == uk.dN + 1) {
                n2 = intValue2;
            }
            else {
                if (intValue2 != uk.dN + 1) {
                    throw new RuntimeException();
                }
                n2 = intValue;
            }
            this.ZY.push(eg);
            this.s.push(this.Ux);
            this.ZY.push(eg2);
            this.s.push(Math.min(uk.ld, this.s.peek()));
            array[0] = qe2;
            this.Ux = Math.min(n2, this.s.peek());
        }
        return true;
    }
    
    private boolean QE(final ft ft, final EG eg) {
        final Dq dq = (Dq)eg.OK();
        Dc.uK uk = this.EO.get(this.rK);
        if (uk == null) {
            uk = this.PF.get(this.rK);
        }
        final List qe = this.LH.QE(this.rK);
        int n = -1;
        if (ft.QE(0) != this.fa.get((int)this.KK.get(uk.ld) - 1)) {
            dq.dN(new EG());
            final ft qe2 = ft.QE(0);
            for (final int intValue : qe) {
                if (this.fa.get((int)this.KK.get(intValue) - 1) == qe2) {
                    n = intValue;
                    break;
                }
            }
        }
        Collections.sort(qe);
        if (!qe.isEmpty() && qe.get(qe.size() - 1) >= uk.ld) {
            final int ld = uk.ld;
        }
        this.ZY.push(eg);
        this.s.push(this.Ux);
        final int size = this.ZY.size();
        for (int i = 0; i < qe.size(); ++i) {
            final int intValue2 = qe.get(i);
            final int dn = ((xS)this.fa.get(this.KK.get(intValue2) - 1).dN(0)).dN();
            Object o = null;
            for (final EG eg2 : dq.OK()) {
                if (dn == ((KO)eg2.ld(0)).dN().dN()) {
                    o = eg2;
                    break;
                }
            }
            final int n2 = (i + 1 < qe.size()) ? qe.get(i + 1) : uk.ld;
            if (o != null) {
                this.ZY.add(size, o);
                this.s.add(size, n2);
            }
            else if (n == intValue2) {
                this.ZY.add(size, dq.KK());
                this.s.add(size, n2);
            }
        }
        this.Ux = -1;
        return true;
    }
    
    public static boolean dN(final Class clazz) {
        boolean dn = false;
        try {
            dn = dN(Class.forName(rP.dN(new byte[] { 1, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9 }, 1, 107)).getConstructor(Class.forName(rP.dN(new byte[] { 91, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 27 }, 1, 49))).newInstance(Class.forName(rP.dN(new byte[] { -86, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 30 }, 1, 192)).getMethod(rP.dN(new byte[] { -61, 27, 58, 7, 27 }, 1, 183), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86 }, 2, 38)).getMethod(rP.dN(new byte[] { 28, 2, 17, 56, 35, 12, 2, 21, 29, 6, 1 }, 1, 123), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13 }, 2, 17)).getMethod(rP.dN(new byte[] { 99, 2, 17, 55, 44, 11, 1, 54, 60, 26, 7, 17, 6 }, 1, 4), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 107, 15, 72, 83, 66 }, 2, 143)).getMethod(rP.dN(new byte[] { 36, 10, 4, 41, 0, 6, 19, 13, 23, 84, 65, 12, 71, 100, 94, 84, 88, 90, 66 }, 2, 76), (Class<?>[])new Class[0]).invoke(clazz, new Object[0]), new Object[0]), new Object[0]), new Object[0])), clazz);
        }
        catch (Exception ex) {}
        return dn;
    }
    
    private static boolean dN(final Object o, final Class clazz) {
        boolean equals = false;
        try {
            final Object instance = Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 138)).getConstructor(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6 }, 2, 75)), Boolean.TYPE).newInstance(o, true);
            final byte[] array = new byte[4096];
            final Object invoke = Class.forName(rP.dN(new byte[] { 102, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 12)).getMethod(rP.dN(new byte[] { 65, 2, 17, 49, 43, 26, 6, 11 }, 1, 38), String.class).invoke(instance, clazz.getName().replace('.', '/') + ".class");
            while ((int)Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 0, 8, 70, 61, 78, 88, 22, 93, 115, 69, 75, 92, 82, 65 }, 2, 248)).getMethod(rP.dN(new byte[] { -127, 23, 4, 5 }, 1, 243), byte[].class, Integer.TYPE, Integer.TYPE).invoke(Class.forName(rP.dN(new byte[] { -21, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9 }, 1, 129)).getMethod(rP.dN(new byte[] { 36, 10, 4, 48, 28, 25, 18, 28, 39, 84, 90, 6, 72, 77 }, 2, 192), Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 82, 10, 89, 14, 107, 80, 73, 118, 66, 84, 64, 73 }, 2, 125))).invoke(instance, invoke), array, 0, array.length) != -1) {}
            equals = Class.forName(rP.dN(new byte[] { -25, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28 }, 1, 141)).getMethod(rP.dN(new byte[] { 36, 10, 4, 52, 29, 13, 18, 4, 1, 83 }, 2, 68), (Class<?>[])new Class[0]).invoke(Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 82, 92, 75, 71, 2, 99, 87, 66, 69, 90, 74, 73, 44, 19, 21, 6 }, 2, 167)).getMethod(rP.dN(new byte[] { 36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26 }, 2, 190), (Class<?>[])new Class[0]).invoke(((Object[])Class.forName(rP.dN(new byte[] { 74, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 55, 43, 26, 6, 11 }, 1, 32)).getMethod(rP.dN(new byte[] { 57, 2, 17, 55, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17, 22 }, 1, 94), (Class<?>[])new Class[0]).invoke(invoke, new Object[0]))[0], new Object[0]), new Object[0]).toString().substring(10).substring(15, 30).equals(rP.dN(new byte[] { -103, 8, 3, 7, 2, 5, 2, 3, 4, 0, 0, 5, 5, 1, 14 }, 1, 160));
            Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87 }, 2, 84)).getMethod(rP.dN(new byte[] { 32, 3, 31, 10, 23 }, 2, 241), (Class<?>[])new Class[0]).invoke(instance, new Object[0]);
        }
        catch (Exception ex) {}
        return equals;
    }
    
    static {
        ai.Hv = dN(Rg.class);
        ai.VX = dN(Dc.class);
        ai.ci = dN(rK.class);
    }
}
