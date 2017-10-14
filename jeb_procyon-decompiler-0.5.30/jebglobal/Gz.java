// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Comparator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;

public final class Gz
{
    private static final long LK = 844563159190538443L;
    private List dN;
    private AR ld;
    private AV QE;
    private hV.uK wU;
    private boolean fa;
    private oh zs;
    private TreeMap mS;
    private HashMap OK;
    private HashMap LH;
    private HashMap KK;
    
    public Gz(final AR ld, final AV qe, final hV.uK wu) {
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = true;
    }
    
    public void dN(final boolean fa) {
        this.fa = fa;
    }
    
    public void dN() {
        if (this.zs != null) {
            return;
        }
        final jI ji = new jI(this.ld, this.QE, this.wU);
        ji.dN(this.fa);
        (this.zs = new oh(ji.dN(), ji.ld())).zs();
        if (this.zs.fa() >= 1) {
            this.zs.dN(true);
        }
        final HashMap qe = ji.QE();
        final ArrayList<nm> list = new ArrayList<nm>();
        for (final ft ft : this.zs.ld()) {
            if (ft.EO() == 0) {
                continue;
            }
            final int dn = ((xS)ft.dN(0)).dN();
            final int n = ((xS)ft.QE()).dN() + ((xS)ft.QE()).ld();
            final ArrayList<bt> list2 = new ArrayList<bt>();
            final Iterator iterator2 = ft.Hw().iterator();
            while (iterator2.hasNext()) {
                final int dn2 = ((xS)iterator2.next().dN(0)).dN();
                list2.add(new bt(qe.get(dn2), dn2));
            }
            list.add(new nm(dn, n - dn, list2));
        }
        final nm[] array = new nm[list.size()];
        list.toArray(array);
        final jn jn = new jn(array, true);
        this.dN = new ArrayList();
        for (int i = 0; i < jn.dN(); ++i) {
            final nm dn3 = jn.dN(i);
            final vd vd = new vd(dn3.dN(), dn3.QE());
            for (final bt bt : dn3.wU()) {
                final int qe2 = bt.QE();
                final ft ld = this.zs.ld(qe2);
                if (ld == null) {
                    throw new RuntimeException();
                }
                xS xs = null;
                if (((xS)ld.dN(0)).wU() == Qz.OK) {
                    xs = (xS)ld.dN(0);
                }
                vd.QE.add(new uK(this.wU.dN(bt.dN() ? this.ld.dN(bt.ld(), false) : "Ljava/lang/Throwable;"), xs, qe2));
            }
            this.dN.add(vd);
        }
        this.mS = new TreeMap();
        final Iterator<ft> iterator4 = this.zs.ld().iterator();
        while (iterator4.hasNext()) {
            final xS xs2 = (xS)iterator4.next().dN(0);
            this.mS.put(xs2.dN(), xs2.mS());
        }
        this.KK = dN(this.ld, this.QE, this.wU);
        if (new kW(this.zs).ld()) {
            this.zs.dN(true);
        }
        this.OK = this.zs.OK();
        this.LH = this.zs.KK();
        this.zs();
    }
    
    public oh ld() {
        return this.zs;
    }
    
    public List QE() {
        return this.dN;
    }
    
    public TreeMap wU() {
        return this.mS;
    }
    
    public AV fa() {
        return this.QE;
    }
    
    private void zs() {
        final ArrayList<xS> list = new ArrayList<xS>();
        final Iterator<ft> iterator = (Iterator<ft>)this.zs.ld().iterator();
        while (iterator.hasNext()) {
            list.addAll((Collection<?>)iterator.next().wU());
        }
        this.dN(this.KK);
        hV cb = this.KK.get(-1);
        if (cb.EO()) {
            if (cb == hV.zs) {
                cb = hV.cb;
            }
            final Iterator<ft> iterator2 = (Iterator<ft>)this.zs.ld().iterator();
            while (iterator2.hasNext()) {
                final xS xs = (xS)iterator2.next().QE();
                if (xs.wU() == Qz.zs) {
                    final ArrayList list2 = new ArrayList();
                    final ArrayList<Integer> list3 = new ArrayList<Integer>();
                    xs.dN(list2, list3, null);
                    final Iterator<Object> iterator3 = list3.iterator();
                    while (iterator3.hasNext()) {
                        xs.ld(iterator3.next(), cb);
                    }
                }
            }
        }
        final HashSet<Object> set = new HashSet<Object>();
        set.addAll(list);
        while (!set.isEmpty()) {
            final ArrayList list4 = new ArrayList<Object>(set.size());
            list4.addAll((Collection<?>)set);
            Collections.sort((List<Object>)list4, new KN(this));
            set.clear();
            final Iterator<T> iterator4 = (Iterator<T>)list4.iterator();
            while (iterator4.hasNext()) {
                set.addAll(this.dN((xS)iterator4.next()));
            }
            final Iterator<T> iterator5 = (Iterator<T>)list4.iterator();
            while (iterator5.hasNext()) {
                set.addAll(this.ld((xS)iterator5.next()));
            }
        }
        for (final xS xs2 : list) {
            xs2.dN(hV.cb, hV.zs);
            xs2.dN(hV.KK, hV.zs);
            xs2.dN(hV.EO, hV.mS);
            xs2.dN(hV.PF, this.wU.dN("Ljava/lang/Object;"));
        }
    }
    
    private void dN(final HashMap hashMap) {
        final HashMap<Integer, HashMap<Integer, HashMap<Integer, HashMap>>> hashMap2 = this.OK.get(null);
        for (final int intValue : hashMap2.keySet()) {
            final hV hv = hashMap.get(intValue);
            if (hv == null) {
                continue;
            }
            if (!hv.cb()) {
                throw new RuntimeException();
            }
            final hV dn = hV.dN(hv, true);
            final Iterator iterator2 = ((List)hashMap2.get(intValue)).iterator();
            while (iterator2.hasNext()) {
                iterator2.next().ld(intValue, dn);
            }
        }
    }
    
    private HashSet dN(final xS xs) {
        final HashMap<Integer, HashMap<Integer, HashMap<Integer, HashMap>>> hashMap = this.OK.get(xs);
        final HashSet<xS> set = new HashSet<xS>();
        for (final int intValue : hashMap.keySet()) {
            final hV zs = xs.zs(intValue);
            if (!zs.cb()) {
                continue;
            }
            final hV dn = hV.dN(zs, true);
            for (final xS xs2 : (List)hashMap.get(intValue)) {
                if (xs2.ld(intValue, dn)) {
                    set.add(xs2);
                }
            }
        }
        return set;
    }
    
    private HashSet ld(final xS xs) {
        final HashMap<Integer, HashMap<Integer, HashMap<Integer, HashMap>>> hashMap = this.LH.get(xs);
        final HashSet<xS> set = new HashSet<xS>();
        for (final int intValue : hashMap.keySet()) {
            final hV ms = xs.mS(intValue);
            if (!ms.cb()) {
                continue;
            }
            final hV dn = hV.dN(ms, false);
            for (final xS xs2 : (List)hashMap.get(intValue)) {
                if (xs2.dN(intValue, dn)) {
                    set.add(xs2);
                }
            }
        }
        return set;
    }
    
    public static HashMap dN(final AR ar, final AV av, final hV.uK uk) {
        final HashMap<Integer, hV> hashMap = new HashMap<Integer, hV>();
        int n = av.wU().zs() - 1;
        final hV[] dn = hV.dN(ar.mS(av.ld()).OK(), uk);
        for (int i = dn.length - 1; i >= 1; --i) {
            if (n < 0) {
                throw new RuntimeException();
            }
            if (dn[i].rK()) {
                hashMap.put(n, dn[i]);
            }
            else {
                if (!dn[i].Ux()) {
                    throw new RuntimeException();
                }
                if (--n < 0) {
                    throw new RuntimeException();
                }
                hashMap.put(n, dn[i]);
            }
            --n;
        }
        if (!av.zs()) {
            if (n < 0) {
                throw new RuntimeException();
            }
            hashMap.put(n, hV.dN(ar.mS(av.ld()).dN(false), uk));
        }
        hashMap.put(-1, dn[0]);
        return hashMap;
    }
    
    public static final class uK
    {
        public hV dN;
        public xS ld;
        public int QE;
        public int wU;
        
        uK(final hV dn, final xS ld, final int qe) {
            this.wU = -1;
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
        }
    }
    
    public static final class vd
    {
        public int dN;
        public int ld;
        public List QE;
        public List wU;
        
        vd(final int dn, final int ld) {
            this.QE = new ArrayList();
            this.wU = new ArrayList();
            this.dN = dn;
            this.ld = ld;
        }
    }
}
