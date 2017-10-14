// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class rK
{
    private static final long LK = 844563159190538443L;
    public static int dN;
    private List ld;
    
    public rK(final List list) {
        this(list, null);
    }
    
    public rK(final List list, final List list2) {
        this.ld = new ArrayList();
        final int[][] array = new int[list.size()][];
        for (int i = 0; i < array.length; ++i) {
            array[i] = list.get(i);
        }
        int[][] array2 = null;
        if (list2 != null) {
            array2 = new int[list2.size()][];
            for (int j = 0; j < array2.length; ++j) {
                array2[j] = list2.get(j);
            }
        }
        this.dN(array, array2);
    }
    
    private rK() {
        this.ld = new ArrayList();
    }
    
    private void dN(final int[][] array, final int[][] array2) {
        if (array == null) {
            throw new IllegalArgumentException();
        }
        if (array.length == 0 && (array2 == null || array2.length == 0)) {
            this.ld.add(new eY(1));
            return;
        }
        final int[][][] array5;
        if (array2 != null) {
            final int[][][] array4;
            final int[][][] array3 = array4 = new int[2][][];
            array3[0] = array;
            array3[1] = array2;
        }
        else {
            array5 = new int[][][] { array };
        }
        final int[][][] array6 = array5;
        final HashSet<Integer> set = new HashSet<Integer>();
        int n = 0;
        for (final int[][] array8 : array6) {
            for (final int[] array9 : array8) {
                if (array9.length != 2) {
                    throw new RuntimeException();
                }
                set.add(array9[0]);
                set.add(array9[1]);
                if (array9[0] > n) {
                    n = array9[0];
                }
                if (array9[1] > n) {
                    n = array9[1];
                }
            }
        }
        for (int k = 1; k <= n; ++k) {
            if (!set.contains(k)) {
                throw new RuntimeException();
            }
            this.ld.add(new eY(k));
        }
        for (final int[] array10 : array) {
            final eY zs = this.zs(array10[0]);
            final eY zs2 = this.zs(array10[1]);
            if (zs.QE.contains(zs2)) {
                zs2.ld.contains(zs);
            }
            zs.QE.add(zs2);
            zs2.ld.add(zs);
        }
        if (array2 != null) {
            for (final int[] array11 : array2) {
                final eY zs3 = this.zs(array11[0]);
                final eY zs4 = this.zs(array11[1]);
                if (zs3.fa.contains(zs4)) {
                    zs4.wU.contains(zs3);
                }
                zs3.fa.add(zs4);
                zs4.wU.add(zs3);
            }
        }
        for (final eY ey : this.ld) {
            if (ey.dN != 1 && ey.ld().isEmpty()) {
                throw new RuntimeException();
            }
        }
        if (!this.fa(n)) {
            throw new RuntimeException();
        }
    }
    
    private boolean fa(final int n) {
        final HashSet set = new HashSet();
        this.dN(this.ld.get(0), set);
        return set.size() == n;
    }
    
    private void dN(final eY ey, final HashSet set) {
        if (set.contains(ey)) {
            return;
        }
        set.add(ey);
        final Iterator<eY> iterator = (Iterator<eY>)ey.dN().iterator();
        while (iterator.hasNext()) {
            this.dN(iterator.next(), set);
        }
    }
    
    public HashMap dN() {
        return this.dN(this.LH());
    }
    
    public HashMap dN(final List list) {
        final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        final ArrayList<eY> ld = new ArrayList<eY>();
        int n = 1;
        for (final int intValue : list) {
            final eY ey = this.ld.get(intValue - 1);
            ld.add(ey);
            ey.dN = n++;
            hashMap.put(ey.dN, intValue);
        }
        this.ld = ld;
        return hashMap;
    }
    
    private eY zs(final int n) {
        if (n <= 0 || n > this.ld.size()) {
            throw new IllegalArgumentException();
        }
        return this.ld.get(n - 1);
    }
    
    public int ld() {
        return this.ld.size();
    }
    
    public int QE() {
        int n = 0;
        final Iterator<eY> iterator = this.ld.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().QE();
        }
        return n;
    }
    
    public List dN(final int n) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final Iterator<eY> iterator = this.zs(n).ld.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().dN);
        }
        return list;
    }
    
    public List ld(final int n) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final Iterator<eY> iterator = this.zs(n).ld.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().dN);
        }
        final Iterator<eY> iterator2 = (Iterator<eY>)this.zs(n).wU.iterator();
        while (iterator2.hasNext()) {
            list.add(iterator2.next().dN);
        }
        return list;
    }
    
    public List QE(final int n) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final Iterator<eY> iterator = this.zs(n).QE.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().dN);
        }
        return list;
    }
    
    public List wU(final int n) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final Iterator<eY> iterator = this.zs(n).QE.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().dN);
        }
        final Iterator<eY> iterator2 = (Iterator<eY>)this.zs(n).fa.iterator();
        while (iterator2.hasNext()) {
            list.add(iterator2.next().dN);
        }
        return list;
    }
    
    public boolean wU() {
        return this.ld.size() == 1 && this.ld.get(0).ld.size() == 0 && this.ld.get(0).QE.size() == 0;
    }
    
    public boolean fa() {
        final eY ey = this.ld.get(0);
        if (this.ld.size() == 3 && ey.ld.size() == 0 && ey.QE.size() == 2) {
            final eY ey2 = ey.QE.get(0);
            final eY ey3 = ey.QE.get(1);
            if (ey2.ld.size() == 2 && ey2.ld.contains(ey3) && ey2.ld.contains(ey) && ey2.QE.size() == 1 && ey2.QE.contains(ey3) && ey3.ld.size() == 2 && ey3.ld.contains(ey2) && ey3.ld.contains(ey) && ey3.QE.size() == 1 && ey3.QE.contains(ey2)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("(%d, [", this.ld.size()));
        int n = 0;
        for (final eY ey : this.ld) {
            for (final eY ey2 : ey.QE) {
                if (n++ > 0) {
                    sb.append(", ");
                }
                sb.append(String.format("%d>%d", ey.dN, ey2.dN));
            }
            for (final eY ey3 : ey.fa) {
                if (n++ > 0) {
                    sb.append(", ");
                }
                sb.append(String.format("%d\\%d", ey.dN, ey3.dN));
            }
        }
        sb.append("])");
        return sb.toString();
    }
    
    public JP zs() {
        final JP jp = new JP();
        for (final List<eY> list : this.KK()) {
            final ArrayList<Integer> list2 = new ArrayList<Integer>();
            final Iterator<eY> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                list2.add(iterator2.next().dN);
            }
            jp.dN.add(list2);
        }
        return jp;
    }
    
    private List KK() {
        final eY ey = this.ld.get(0);
        final ArrayDeque<eY> arrayDeque = new ArrayDeque<eY>();
        arrayDeque.push(ey);
        final ArrayList<eY> list = new ArrayList<eY>(this.ld);
        list.remove(ey);
        final ArrayList<ArrayList<eY>> list2 = new ArrayList<ArrayList<eY>>();
        while (!arrayDeque.isEmpty()) {
            final ArrayList<eY> list3 = new ArrayList<eY>();
            list3.add(arrayDeque.pop());
            while (true) {
                final ArrayList<eY> list4 = new ArrayList<eY>();
                for (final eY ey2 : list) {
                    boolean b = true;
                    final Iterator iterator2 = ey2.ld().iterator();
                    while (iterator2.hasNext()) {
                        if (!list3.contains(iterator2.next())) {
                            b = false;
                            break;
                        }
                    }
                    if (b) {
                        list3.add(ey2);
                        list4.add(ey2);
                    }
                }
                if (list4.size() == 0) {
                    break;
                }
                final Iterator<eY> iterator3 = list4.iterator();
                while (iterator3.hasNext()) {
                    list.remove(iterator3.next());
                }
            }
            final ArrayList<eY> list5 = new ArrayList<eY>();
            for (final eY ey3 : list) {
                final Iterator iterator5 = ey3.ld().iterator();
                while (iterator5.hasNext()) {
                    if (list3.contains(iterator5.next())) {
                        list5.add(ey3);
                        break;
                    }
                }
            }
            for (final eY ey4 : list5) {
                arrayDeque.push(ey4);
                list.remove(ey4);
            }
            list2.add(list3);
        }
        return list2;
    }
    
    private int dN(final List list, final eY ey) {
        int n = 0;
        final Iterator<List<eY>> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Iterator<eY> iterator2 = iterator.next().iterator();
            while (iterator2.hasNext()) {
                if (iterator2.next() == ey) {
                    return n;
                }
            }
            ++n;
        }
        return -1;
    }
    
    public GY mS() {
        final GY gy = new GY();
        rK rk = this;
        while (true) {
            final JP zs = rk.zs();
            gy.dN.add(new GY.uK(rk, zs));
            if (zs.dN() == rk.ld()) {
                break;
            }
            final List kk = rk.KK();
            final rK rk2 = new rK();
            int n = 1;
            for (final List<eY> list : kk) {
                final eY ey = new eY(n);
                ey.zs = new ArrayList();
                for (final eY ey2 : list.get(0).ld()) {
                    if (!list.contains(ey2)) {
                        ey.ld.add(ey2);
                    }
                }
                final Iterator<eY> iterator3 = list.iterator();
                while (iterator3.hasNext()) {
                    for (final eY ey3 : iterator3.next().dN()) {
                        if (!list.contains(ey3) && !ey.dN().contains(ey3)) {
                            ey.QE.add(ey3);
                        }
                    }
                }
                rk2.ld.add(ey);
                ++n;
            }
            for (final eY ey4 : rk2.ld) {
                final ArrayList<eY> ld = new ArrayList<eY>();
                final Iterator iterator6 = ey4.ld.iterator();
                while (iterator6.hasNext()) {
                    final eY ey5 = rk2.ld.get(this.dN(kk, iterator6.next()));
                    if (!ld.contains(ey5)) {
                        ld.add(ey5);
                    }
                }
                ey4.ld = ld;
                final ArrayList<eY> qe = new ArrayList<eY>();
                final Iterator iterator7 = ey4.QE.iterator();
                while (iterator7.hasNext()) {
                    final eY ey6 = rk2.ld.get(this.dN(kk, iterator7.next()));
                    if (!qe.contains(ey6)) {
                        qe.add(ey6);
                    }
                }
                ey4.QE = qe;
            }
            rk = rk2;
        }
        return gy;
    }
    
    public List OK() {
        final Iterator<eY> iterator = this.ld.iterator();
        while (iterator.hasNext()) {
            iterator.next().mS.clear();
        }
        final ArrayList<eY> list = new ArrayList<eY>();
        this.dN(this.ld.get(0), list);
        final ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; --i) {
            final int dn = list.get(i).dN;
            if (!list2.contains(dn)) {
                list2.add(dn);
            }
        }
        return list2;
    }
    
    private void dN(final eY ey, final List list) {
        if (list.contains(ey) && ey.mS.size() == ey.QE.size() + ey.fa.size()) {
            return;
        }
        list.add(ey);
        for (final eY ey2 : ey.dN()) {
            if (ey.mS.contains(ey2)) {
                continue;
            }
            ey.mS.add(ey2);
            this.dN(ey2, list);
            list.add(ey);
        }
    }
    
    public List dN(final boolean b) {
        final eY ey = this.ld.get(0);
        final HashMap<eY, HashSet<eY>> hashMap = new HashMap<eY, HashSet<eY>>();
        for (final eY ey2 : this.ld) {
            if (ey2 == ey) {
                final HashSet<eY> set = new HashSet<eY>();
                set.add(ey);
                hashMap.put(ey, set);
            }
            else {
                hashMap.put(ey2, new HashSet<eY>(this.ld));
            }
        }
        boolean b2;
        do {
            b2 = false;
            for (final eY ey3 : this.ld) {
                if (ey3 == ey) {
                    continue;
                }
                final HashSet<Object> set2 = new HashSet<Object>();
                int n = 0;
                for (final eY ey4 : b ? ey3.ld() : ey3.ld) {
                    if (n == 0) {
                        set2.addAll(hashMap.get(ey4));
                    }
                    else {
                        set2.retainAll(hashMap.get(ey4));
                    }
                    ++n;
                }
                set2.add(ey3);
                if (set2.equals(hashMap.get(ey3))) {
                    continue;
                }
                hashMap.put(ey3, (HashSet<eY>)set2);
                b2 = true;
            }
        } while (b2);
        final ArrayList<HashSet<Integer>> list = new ArrayList<HashSet<Integer>>();
        for (final eY ey5 : this.ld) {
            final HashSet<Integer> set3 = new HashSet<Integer>();
            final Iterator<eY> iterator5 = hashMap.get(ey5).iterator();
            while (iterator5.hasNext()) {
                set3.add(iterator5.next().dN);
            }
            list.add(set3);
        }
        return list;
    }
    
    public List ld(final boolean b) {
        final List dn = this.dN(b);
        final ArrayList<Integer> list = new ArrayList<Integer>();
        int n = 1;
        for (final HashSet<Integer> set : dn) {
            int n2 = -1;
            for (final int intValue : set) {
                if (intValue == n) {
                    continue;
                }
                if (n2 < 0) {
                    n2 = intValue;
                }
                else {
                    if (!dn.get(intValue - 1).contains(n2)) {
                        continue;
                    }
                    n2 = intValue;
                }
            }
            list.add(n2);
            ++n;
        }
        return list;
    }
    
    public List LH() {
        rK rk = this;
        final ArrayList<Ec> list = new ArrayList<Ec>();
        int n = -1;
        while (true) {
            final Ec ec = new Ec(rk, rk.zs());
            list.add(ec);
            if (n == 0 || rk.wU() || rk.fa()) {
                break;
            }
            final JP ld = ec.ld;
            final rK rk2 = new rK();
            int n2 = 1;
            n = 0;
            for (final List<Integer> list2 : ld.dN) {
                final int intValue = list2.get(0);
                boolean b = false;
                final Iterator iterator2 = rk.ld(intValue).iterator();
                while (iterator2.hasNext()) {
                    if (list2.contains((int)iterator2.next())) {
                        b = true;
                        break;
                    }
                }
                if (!b && ld.dN() > 1) {
                    for (final int intValue2 : list2) {
                        final eY ey = new eY(n2++);
                        ey.OK.addAll(rk.ld(intValue2));
                        ey.LH.addAll(rk.wU(intValue2));
                        rk2.ld.add(ey);
                        ec.wU.put(intValue2, ey.dN);
                        ec.QE.put(ey.dN, TM.dN(new int[] { intValue2 }));
                        ey.zs = new ArrayList((Collection<?>)ec.QE.get(ey.dN));
                    }
                }
                else {
                    ++n;
                    final HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
                    final HashMap<Integer, Integer> hashMap2 = new HashMap<Integer, Integer>();
                    int n3 = 1;
                    for (final int intValue3 : list2) {
                        hashMap.put(intValue3, n3);
                        hashMap2.put(n3, intValue3);
                        ++n3;
                    }
                    final ArrayList<int[]> list3 = new ArrayList<int[]>();
                    final ArrayList<Integer> list4 = new ArrayList<Integer>();
                    for (final int intValue4 : list2) {
                        for (final int intValue5 : rk.wU(intValue4)) {
                            if (intValue5 == intValue || !list2.contains(intValue5)) {
                                if (intValue5 != intValue) {
                                    continue;
                                }
                                list4.add(hashMap.get(intValue4));
                            }
                            else {
                                list3.add(new int[] { hashMap.get(intValue4), hashMap.get(intValue5) });
                            }
                        }
                    }
                    rK rk3 = new rK(list3);
                    if (!list4.isEmpty()) {
                        final int intValue6 = hashMap.get(intValue);
                        final List wu = rk3.wU(intValue6);
                        if (wu.size() == 2) {
                            final int[] array = new int[2];
                            int n4 = 0;
                            for (final int intValue7 : wu) {
                                final Iterator<Object> iterator8 = list4.iterator();
                                while (iterator8.hasNext()) {
                                    if (rk3.dN(intValue7, iterator8.next())) {
                                        final int[] array2 = array;
                                        final int n5 = n4;
                                        ++array2[n5];
                                    }
                                }
                                ++n4;
                            }
                            if (array[0] != array[1]) {
                                final int[] array3 = { intValue6, (array[0] > array[1]) ? wu.get(1) : wu.get(0) };
                                final int[] array4 = { intValue6, (array[0] > array[1]) ? wu.get(0) : wu.get(1) };
                                boolean b2 = false;
                                int n6 = 0;
                                for (final int[] array5 : list3) {
                                    if (Arrays.equals(array5, array3)) {
                                        break;
                                    }
                                    if (Arrays.equals(array5, array4)) {
                                        b2 = true;
                                    }
                                    ++n6;
                                }
                                if (b2) {
                                    list3.remove(n6);
                                    list3.add(0, array3);
                                    rk3 = new rK(list3);
                                }
                            }
                        }
                    }
                    final List ok = rk3.OK();
                    for (int i = 0; i < ok.size(); ++i) {
                        ok.set(i, hashMap2.get(ok.get(i)));
                    }
                    final eY ey2 = new eY(n2++);
                    final Iterator<Integer> iterator10 = list2.iterator();
                    while (iterator10.hasNext()) {
                        for (final int intValue8 : rk.wU(iterator10.next())) {
                            if (!list2.contains(intValue8)) {
                                ey2.LH.add(intValue8);
                            }
                        }
                    }
                    for (final int intValue9 : rk.ld(intValue)) {
                        if (!list2.contains(intValue9)) {
                            ey2.OK.add(intValue9);
                        }
                    }
                    rk2.ld.add(ey2);
                    final Iterator<Integer> iterator13 = list2.iterator();
                    while (iterator13.hasNext()) {
                        ec.wU.put((int)iterator13.next(), ey2.dN);
                    }
                    ec.QE.put(ey2.dN, new ArrayList(list2));
                    ey2.zs = ok;
                }
            }
            final rK[] array6 = { rk2, rk, rk, rk2, rk2, rk2, rk2, rk, rk, rk };
            for (final eY ey3 : rk2.ld) {
                final Iterator iterator15 = ey3.LH.iterator();
                while (iterator15.hasNext()) {
                    final eY ey4 = rk2.ld.get(ec.wU.get((int)iterator15.next()) - 1);
                    if (!ey3.QE.contains(ey4)) {
                        ey3.QE.add(ey4);
                    }
                }
                final Iterator iterator16 = ey3.OK.iterator();
                while (iterator16.hasNext()) {
                    final eY ey5 = rk2.ld.get(ec.wU.get((int)iterator16.next()) - 1);
                    if (!ey3.ld.contains(ey5)) {
                        ey3.ld.add(ey5);
                    }
                }
            }
            rk = array6[0];
        }
        final ArrayList<Integer> list5 = new ArrayList<Integer>();
        if (rk.wU()) {
            list5.add(1);
        }
        else if (rk.fa()) {
            list5.add(1);
            list5.add(2);
            list5.add(3);
        }
        else {
            if (n != 0) {
                throw new RuntimeException();
            }
            for (int j = 0; j < rk.ld(); ++j) {
                list5.add(j + 1);
            }
        }
        for (int k = list.size() - 1; k >= 1; --k) {
            final Ec ec2 = list.get(k);
            List list6;
            for (int l = 0; l < list5.size(); l += list6.size()) {
                list6 = (List)ec2.dN.ld.get(list5.get(l) - 1).zs;
                this.dN(list5, l, list6);
            }
        }
        return list5;
    }
    
    private void dN(final List list, final int n, final List list2) {
        list.remove(n);
        for (int i = 0; i < list2.size(); ++i) {
            list.add(n + i, list2.get(i));
        }
    }
    
    public boolean dN(final int n, final int n2) {
        final Iterator<eY> iterator = this.ld.iterator();
        while (iterator.hasNext()) {
            iterator.next().mS.clear();
        }
        return this.dN(this.zs(n), this.zs(n2), new ArrayList());
    }
    
    private boolean dN(final eY ey, final eY ey2, final List list) {
        if (list.contains(ey) && ey.mS.size() == ey.QE()) {
            return false;
        }
        if (ey == ey2) {
            return true;
        }
        list.add(ey);
        for (final eY ey3 : ey.dN()) {
            if (ey.mS.contains(ey3)) {
                continue;
            }
            ey.mS.add(ey3);
            if (this.dN(ey3, ey2, list)) {
                return true;
            }
            list.add(ey);
        }
        return false;
    }
    
    static {
        rK.dN = 0;
    }
}
