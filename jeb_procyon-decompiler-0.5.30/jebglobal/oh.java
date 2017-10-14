// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class oh
{
    private static final long LK = 844563159190538443L;
    private List QE;
    private boolean wU;
    HashMap dN;
    HashMap ld;
    private HashMap fa;
    private HashMap zs;
    private HashMap mS;
    private HashMap OK;
    private HashMap LH;
    private HashMap KK;
    
    public oh(final List list) {
        this.QE = null;
        this.wU = false;
        this.dN = null;
        this.ld = null;
        this.fa = null;
        this.zs = null;
        this.mS = null;
        this.OK = null;
        this.LH = null;
        this.KK = null;
        this.QE = new ArrayList(list.size());
        final HashMap<Integer, ft> hashMap = new HashMap<Integer, ft>();
        for (final Js js : list) {
            final ft ft = new ft();
            ft.dN = js.dN;
            ft.ld = js.ld;
            ft.QE = js.QE;
            this.QE.add(ft);
            final Iterator iterator2 = ft.dN.iterator();
            while (iterator2.hasNext()) {
                hashMap.put(iterator2.next().dN(), ft);
            }
        }
        this.dN(hashMap);
    }
    
    public oh(final List list, final List list2) {
        this.QE = null;
        this.wU = false;
        this.dN = null;
        this.ld = null;
        this.fa = null;
        this.zs = null;
        this.mS = null;
        this.OK = null;
        this.LH = null;
        this.KK = null;
        this.ld(list, list2);
    }
    
    public ft dN(final int n) {
        return this.QE.get(n);
    }
    
    public int dN() {
        return this.QE.size();
    }
    
    public List ld() {
        return new ArrayList(this.QE);
    }
    
    public ft ld(final int n) {
        for (final ft ft : this.QE) {
            if (ft.dN(0).dN() == n) {
                return ft;
            }
        }
        return null;
    }
    
    public List QE() {
        final ArrayList list = new ArrayList();
        final Iterator<ft> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            list.addAll(iterator.next().dN);
        }
        list.trimToSize();
        return list;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(String.format("CFG(%d): ", this.QE.size()));
        int n = 0;
        for (final ft ft : this.QE) {
            if (n > 0) {
                sb.append(", ");
            }
            sb.append(ft);
            ++n;
        }
        return sb.toString();
    }
    
    public void dN(final List list, final List list2) {
        final HashMap<ft, Integer> hashMap = new HashMap<ft, Integer>();
        int n = 1;
        final Iterator<ft> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            hashMap.put(iterator.next(), n);
            ++n;
        }
        for (final ft ft : this.QE) {
            for (int i = ft.fa.size() - 1; i >= 0; --i) {
                list.add(new int[] { hashMap.get(ft), hashMap.get(ft.fa.get(i)) });
            }
            for (int j = ft.mS.size() - 1; j >= 0; --j) {
                list2.add(new int[] { hashMap.get(ft), hashMap.get(ft.mS.get(j)) });
            }
        }
    }
    
    private void ld(final List list, final List list2) {
        if (list.size() == 0 || list.get(0).dN() != 0) {
            throw new RuntimeException();
        }
        Collections.sort((List<Object>)list, new tf(this));
        final bm bm = list.get(list.size() - 1);
        final int n = bm.dN() + bm.ld();
        final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < list.size(); ++i) {
            hashMap.put(list.get(i).dN(), i);
        }
        this.QE = new ArrayList();
        final HashMap<Object, ft> hashMap2 = new HashMap<Object, ft>();
        final ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
        arrayDeque.push(0);
        int n2 = 0;
        while (true) {
            if (!arrayDeque.isEmpty()) {
                int intValue = arrayDeque.pop();
                final ft ft = hashMap2.get(intValue);
                if (ft != null) {
                    if (((bm)ft.dN.get(0)).dN() == intValue) {
                        continue;
                    }
                    int n3 = -1;
                    int n4 = 0;
                    final Iterator iterator = ft.dN.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().dN() == intValue) {
                            n3 = n4;
                            break;
                        }
                        ++n4;
                    }
                    if (n3 < 0) {
                        throw new RuntimeException();
                    }
                    final ft ft2 = new ft();
                    this.QE.add(ft2);
                    for (int j = n3; j < ft.dN.size(); ++j) {
                        final bm bm2 = ft.dN.get(j);
                        ft2.dN.add(bm2);
                        hashMap2.put(bm2.dN(), ft2);
                    }
                    ft2.ld = new ArrayList(ft.ld);
                    for (int n5 = ft.dN.size() - n3, k = 0; k < n5; ++k) {
                        ft.dN.remove(n3);
                    }
                    ft.ld.clear();
                    ft.ld.add(intValue);
                }
                else {
                    final ft ft3 = new ft();
                    this.QE.add(ft3);
                    while (true) {
                        final ft ft4 = hashMap2.get(intValue);
                        if (ft4 != null) {
                            if (ft3.dN.isEmpty()) {
                                throw new RuntimeException();
                            }
                            ft3.ld.add(((bm)ft4.dN.get(0)).dN());
                            break;
                        }
                        else {
                            final bm bm3 = list.get(hashMap.get(intValue));
                            ft3.dN.add(bm3);
                            hashMap2.put(intValue, ft3);
                            final ArrayList<Integer> list3 = new ArrayList<Integer>();
                            if (bm3.dN(list3)) {
                                for (final int intValue2 : list3) {
                                    ft3.ld.add(intValue2);
                                    arrayDeque.push(intValue2);
                                }
                                break;
                            }
                            intValue += bm3.ld();
                        }
                    }
                }
            }
            else {
                if (list2 == null || n2 > 0) {
                    if (list2 != null) {
                        for (final QE qe : list2) {
                            for (final ft ft5 : this.QE) {
                                final int dn = ft5.dN.get(0).dN();
                                if (dn >= qe.dN && dn <= qe.ld && !ft5.QE.contains(qe.QE)) {
                                    ft5.QE.add(qe.QE);
                                }
                            }
                        }
                    }
                    this.dN(hashMap2);
                    return;
                }
                for (final QE qe2 : list2) {
                    arrayDeque.push(qe2.QE);
                    arrayDeque.push(qe2.dN);
                    final bm bm4 = list.get(hashMap.get(qe2.ld));
                    final int n6 = bm4.dN() + bm4.ld();
                    if (n6 < n) {
                        arrayDeque.push(n6);
                    }
                }
                ++n2;
            }
        }
    }
    
    private void dN(final HashMap hashMap) {
        for (final ft ft : this.QE) {
            final Iterator iterator2 = ft.ld.iterator();
            while (iterator2.hasNext()) {
                final ft ft2 = hashMap.get((int)iterator2.next());
                ft.fa.add(ft2);
                ft2.wU.add(ft);
            }
            final Iterator iterator3 = ft.QE.iterator();
            while (iterator3.hasNext()) {
                final ft ft3 = hashMap.get((int)iterator3.next());
                ft.mS.add(ft3);
                ft3.zs.add(ft);
            }
            ft.ld = null;
            ft.QE = null;
        }
        Collections.sort((List<Object>)this.QE, new pm(this));
    }
    
    public int wU() {
        int n = 0;
        int i = 0;
        while (i < this.QE.size()) {
            final ft ft = this.QE.get(i);
            if (ft.KK() == 1 && ft.EO() == 0 && ft.dN() >= 1 && !ft.QE().dN(null)) {
                ft ft2 = null;
                final bm qe = ft.QE();
                final int n2 = qe.dN() + qe.ld();
                for (final ft ft3 : this.QE) {
                    if (ft3.fa() == 1 && ft3.zs() == 0 && ft3.EO() == 0 && ft3.dN(0).dN() == n2) {
                        ft2 = ft3;
                        break;
                    }
                }
                if (ft2 != null) {
                    final Iterator iterator2 = ft2.dN.iterator();
                    while (iterator2.hasNext()) {
                        ft.dN.add(iterator2.next());
                    }
                    this.dN(ft2);
                    ++n;
                    continue;
                }
            }
            ++i;
        }
        return n;
    }
    
    public int fa() {
        int n = 0;
        int i = 0;
        while (i < this.QE.size()) {
            final ft ft = this.QE.get(i);
            if (ft.KK() == 1 && ft.dN() >= 1 && !ft.QE().dN(null)) {
                final bm qe = ft.QE();
                final int n2 = qe.dN() + qe.ld();
                final ft qe2 = ft.QE(0);
                if (qe2.dN(0).dN() == n2 && qe2.fa() == 1 && qe2.zs() == 0 && qe2.EO() == 0) {
                    boolean b = true;
                    final Iterator iterator = qe2.dN.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().QE()) {
                            b = false;
                            break;
                        }
                    }
                    if (b) {
                        final Iterator iterator2 = qe2.dN.iterator();
                        while (iterator2.hasNext()) {
                            ft.dN.add(iterator2.next());
                        }
                        this.dN(qe2);
                        ++n;
                        continue;
                    }
                }
            }
            ++i;
        }
        return n;
    }
    
    public void dN(final ft ft) {
        if (ft.zs() != 0) {
            throw new RuntimeException();
        }
        if (ft.KK() == 1) {
            final ft ft2 = ft.fa.get(0);
            if (ft2 == ft) {
                throw new RuntimeException();
            }
            int i = 0;
            while (i < ft2.wU.size()) {
                if (ft2.wU.get(i) == ft) {
                    ft2.wU.remove(i);
                }
                else {
                    ++i;
                }
            }
            for (final ft ft3 : ft.wU) {
                for (int j = 0; j < ft3.fa.size(); ++j) {
                    if (ft3.fa.get(j) == ft) {
                        ft3.fa.set(j, ft2);
                        ft2.wU.add(ft3);
                    }
                }
            }
        }
        else if (ft.fa() == 1) {
            final ft ft4 = ft.wU.get(0);
            if (ft4 == ft) {
                throw new RuntimeException();
            }
            int k = 0;
            while (k < ft4.fa.size()) {
                if (ft4.fa.get(k) == ft) {
                    ft4.fa.remove(k);
                }
                else {
                    ++k;
                }
            }
            for (final ft ft5 : ft.fa) {
                for (int l = 0; l < ft5.wU.size(); ++l) {
                    if (ft5.wU.get(l) == ft) {
                        ft5.wU.set(l, ft4);
                        ft4.fa.add(ft5);
                    }
                }
            }
        }
        for (final ft ft6 : ft.mS) {
            int n = 0;
            while (n < ft6.zs.size()) {
                if (ft6.zs.get(n) == ft) {
                    ft6.wU.remove(n);
                }
                else {
                    ++n;
                }
            }
        }
        this.QE.remove(ft);
    }
    
    public int dN(final ft ft, final ft ft2, final ft ft3) {
        int n = -1;
        for (int i = 0; i < ft.fa.size(); ++i) {
            final ft ft4 = ft.fa.get(i);
            if (ft4 == ft2) {
                if (n != -1) {
                    throw new RuntimeException();
                }
                n = i;
            }
            else if (ft4 == ft3) {
                return -1;
            }
        }
        if (n < 0) {
            return 0;
        }
        ft.fa.set(n, ft3);
        ft2.wU.remove(ft);
        ft3.wU.add(ft);
        return 1;
    }
    
    public boolean dN(final ft ft, final ft ft2) {
        int n = -1;
        for (int i = 0; i < ft.fa.size(); ++i) {
            if (ft.fa.get(i) == ft2) {
                if (n != -1) {
                    throw new RuntimeException();
                }
                n = i;
            }
        }
        if (n < 0) {
            return false;
        }
        ft.fa.remove(n);
        ft2.wU.remove(ft);
        return true;
    }
    
    public void zs() {
        this.dN(false, null);
    }
    
    public void dN(final boolean b) {
        this.dN(b, null);
    }
    
    private void dN(final boolean b, final List list) {
        if (this.wU && !b) {
            return;
        }
        this.EO();
        this.cb();
        this.PF();
        this.Hw();
        this.dN(list);
        this.rK();
        this.wU = true;
    }
    
    private void EO() {
        this.wU = false;
        this.dN = null;
        this.ld = null;
        this.fa = null;
        this.zs = null;
        this.mS = null;
        this.OK = null;
        this.LH = null;
        this.KK = null;
    }
    
    public HashMap mS() {
        return this.mS;
    }
    
    public HashMap OK() {
        return this.LH;
    }
    
    public HashMap LH() {
        return this.OK;
    }
    
    public HashMap KK() {
        return this.KK;
    }
    
    private void cb() {
        this.dN = new HashMap();
        this.ld = new HashMap();
        final Iterator<ft> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            for (final bm bm : iterator.next().dN) {
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                bm.dN(list, list2, null);
                this.dN.put(bm, list);
                this.ld.put(bm, list2);
            }
        }
    }
    
    private void PF() {
        this.fa = new HashMap();
        final ArrayDeque<ll> arrayDeque = new ArrayDeque<ll>();
        for (final ft ft : this.QE) {
            final ll ll = new ll(this, ft, true, false);
            if (ft.cb() == 0) {
                ll.ld();
                arrayDeque.push(ll);
            }
            this.fa.put(ft, ll);
        }
        if (arrayDeque.isEmpty()) {
            final ll ll2 = this.fa.get(this.QE.get(0));
            ll2.ld();
            arrayDeque.push(ll2);
        }
        while (!arrayDeque.isEmpty()) {
            while (!arrayDeque.isEmpty()) {
                ((ll)arrayDeque.pop()).QE();
            }
            for (final ll ll3 : this.fa.values()) {
                final HashMap qe = new HashMap();
                final Iterator iterator3 = ll3.dN.rK().iterator();
                while (iterator3.hasNext()) {
                    ll3.dN(qe, ((ll)this.fa.get(iterator3.next())).ld);
                }
                if (ll3.QE == null || !ll3.ld(qe, ll3.QE)) {
                    ll3.QE = qe;
                    arrayDeque.push(ll3);
                }
            }
        }
        final Iterator<ft> iterator4 = this.QE.iterator();
        while (iterator4.hasNext()) {
            final ll ll4 = this.fa.get(iterator4.next());
            if (ll4.QE == null) {
                ll4.ld();
            }
        }
    }
    
    private void Hw() {
        this.mS = new HashMap();
        this.LH = new HashMap();
        for (final ft ft : this.QE) {
            for (int i = 0; i < ft.dN(); ++i) {
                final bm dn = ft.dN(i);
                final ArrayList list = new ArrayList<Integer>(this.dN.get(dn));
                final HashMap<bm, ArrayList<Integer>> hashMap = new HashMap<bm, ArrayList<Integer>>();
                final HashMap<bm, ArrayList<bm>> hashMap2 = new HashMap<bm, ArrayList<bm>>();
                for (final int intValue : list) {
                    hashMap.put((bm)intValue, new ArrayList<Integer>());
                    hashMap2.put((bm)intValue, new ArrayList<bm>());
                }
                for (int j = i + 1; j < ft.dN(); ++j) {
                    final bm dn2 = ft.dN(j);
                    for (final int intValue2 : this.ld.get(dn2)) {
                        if (list.contains(intValue2)) {
                            hashMap.get(intValue2).add(j);
                            hashMap2.get(intValue2).add(dn2);
                        }
                    }
                    for (final int intValue3 : this.dN.get(dn2)) {
                        if (list.contains(intValue3)) {
                            list.remove(new Integer(intValue3));
                        }
                    }
                }
                final ll ll = this.fa.get(ft);
                for (final int intValue4 : ll.QE.keySet()) {
                    if (list.contains(intValue4)) {
                        hashMap.get(intValue4).add(-1);
                        hashMap2.get(intValue4).addAll((Collection<?>)ll.QE.get(intValue4));
                    }
                }
                this.mS.put(dn, hashMap);
                this.LH.put(dn, hashMap2);
            }
        }
        final HashMap<Object, ArrayList> hashMap3 = new HashMap<Object, ArrayList>();
        final ll ll2 = this.fa.get(this.QE.get(0));
        for (final Integer n : ll2.ld.keySet()) {
            hashMap3.put(n, new ArrayList());
            hashMap3.get(n).addAll((Collection)ll2.ld.get(n));
        }
        this.LH.put(null, hashMap3);
    }
    
    private void dN(final List list) {
        this.zs = new HashMap();
        final ArrayDeque<ll> arrayDeque = new ArrayDeque<ll>();
        int n = 0;
        for (final ft ft : this.QE) {
            final ll ll = new ll(this, ft, false, true);
            if (n++ == 0) {
                ll.dN();
                arrayDeque.push(ll);
                if (list != null) {
                    for (final int intValue : list) {
                        final HashSet<Object> set = new HashSet<Object>();
                        set.add(null);
                        ll.ld.put(intValue, set);
                    }
                }
            }
            this.zs.put(ft, ll);
        }
        while (!arrayDeque.isEmpty()) {
            while (!arrayDeque.isEmpty()) {
                ((ll)arrayDeque.pop()).wU();
            }
            for (final ll ll2 : this.zs.values()) {
                final HashMap ld = new HashMap();
                final Iterator iterator4 = ll2.dN.LH().iterator();
                while (iterator4.hasNext()) {
                    ll2.dN(ld, ((ll)this.zs.get(iterator4.next())).QE);
                }
                if (ll2.ld == null || !ll2.ld(ld, ll2.ld)) {
                    ll2.ld = ld;
                    arrayDeque.push(ll2);
                }
            }
        }
        final Iterator<ft> iterator5 = this.QE.iterator();
        while (iterator5.hasNext()) {
            final ll ll3 = this.zs.get(iterator5.next());
            if (ll3.ld == null) {
                ll3.dN();
            }
        }
    }
    
    private void rK() {
        this.OK = new HashMap();
        this.KK = new HashMap();
        for (final ft ft : this.QE) {
            for (int i = 0; i < ft.dN.size(); ++i) {
                final bm bm = ft.dN.get(i);
                final ArrayList list = new ArrayList<Integer>(this.ld.get(bm));
                final HashMap<bm, ArrayList<Integer>> hashMap = new HashMap<bm, ArrayList<Integer>>();
                final HashMap<bm, ArrayList<bm>> hashMap2 = new HashMap<bm, ArrayList<bm>>();
                for (final int intValue : list) {
                    hashMap.put((bm)intValue, new ArrayList<Integer>());
                    hashMap2.put((bm)intValue, new ArrayList<bm>());
                }
            Label_0362:
                for (int j = i - 1; j >= 0; --j) {
                    final bm bm2 = ft.dN.get(j);
                    for (final int intValue2 : this.dN.get(bm2)) {
                        if (list.contains(intValue2)) {
                            hashMap.get(intValue2).add(j);
                            hashMap2.get(intValue2).add(bm2);
                            list.remove(new Integer(intValue2));
                            if (list.isEmpty()) {
                                break Label_0362;
                            }
                            continue;
                        }
                    }
                }
                final ll ll = this.zs.get(ft);
                for (final int intValue3 : ll.ld.keySet()) {
                    if (list.contains(intValue3)) {
                        hashMap.get(intValue3).add(-1);
                        hashMap2.get(intValue3).addAll((Collection<?>)ll.ld.get(intValue3));
                    }
                }
                this.OK.put(bm, hashMap);
                this.KK.put(bm, hashMap2);
            }
        }
    }
}
