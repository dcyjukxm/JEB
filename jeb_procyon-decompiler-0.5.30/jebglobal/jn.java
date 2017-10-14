// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public final class jn
{
    private nm[] dN;
    private nm[] ld;
    private nm[] QE;
    
    public jn(final nm[] qe, final boolean b) {
        this.dN = qe;
        this.ld = qe;
        this.QE = qe;
        if (this.QE()) {
            this.dN(true);
        }
    }
    
    private boolean QE() {
        final HashMap<Integer, bt> hashMap = new HashMap<Integer, bt>();
        final nm[] dn = this.dN;
        for (int length = dn.length, i = 0; i < length; ++i) {
            for (final bt bt : dn[i].wU()) {
                hashMap.put(bt.QE(), bt);
            }
        }
        final HashMap<Integer, List<uK>> hashMap2 = new HashMap<Integer, List<uK>>();
        for (final nm nm : this.dN) {
            for (final int intValue : nm.fa()) {
                List<uK> list = hashMap2.get(intValue);
                if (list == null) {
                    list = new ArrayList<uK>();
                    hashMap2.put(intValue, list);
                }
                boolean b = false;
                for (final uK uk : list) {
                    if (uk.ld == nm.dN()) {
                        uk.ld = nm.QE();
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    list.add(new uK(nm.dN(), nm.QE(), hashMap.get(intValue)));
                }
            }
        }
        final ArrayList<uK> list2 = new ArrayList<uK>();
        final Iterator<List<uK>> iterator4 = hashMap2.values().iterator();
        while (iterator4.hasNext()) {
            list2.addAll((Collection<?>)iterator4.next());
        }
        Collections.sort((List<Object>)list2, new US(this));
        int k = 0;
        while (k < list2.size() - 1) {
            final uK uk2 = list2.get(k);
            final uK uk3 = list2.get(k + 1);
            if (uk2.dN == uk3.dN && uk2.ld == uk3.ld) {
                uk2.dN(uk3.QE);
                list2.remove(k + 1);
            }
            else {
                if (uk3.dN < uk2.ld && uk3.ld > uk2.ld) {
                    return false;
                }
                ++k;
            }
        }
        this.QE = new nm[list2.size()];
        for (int l = 0; l < list2.size(); ++l) {
            final uK uk4 = list2.get(l);
            this.QE[l] = new nm(uk4.dN, uk4.ld - uk4.dN, uk4.QE);
        }
        return true;
    }
    
    public void dN(final boolean b) {
        this.dN = (b ? this.QE : this.ld);
    }
    
    public int dN() {
        return this.dN.length;
    }
    
    public nm dN(final int n) {
        return this.dN[n];
    }
    
    public HashSet ld() {
        final HashSet set = new HashSet();
        final nm[] dn = this.dN;
        for (int length = dn.length, i = 0; i < length; ++i) {
            set.addAll(dn[i].fa());
        }
        return set;
    }
    
    public bt ld(final int n) {
        final nm[] dn = this.dN;
        for (int length = dn.length, i = 0; i < length; ++i) {
            for (final bt bt : dn[i].wU()) {
                if (bt.QE() == n) {
                    return bt;
                }
            }
        }
        return null;
    }
    
    public static final class uK
    {
        private int dN;
        private int ld;
        private List QE;
        
        public uK(final int dn, final int ld, final bt bt) {
            this.QE = new ArrayList();
            this.dN = dn;
            this.ld = ld;
            this.QE.add(bt);
        }
        
        public void dN(final List list) {
            this.QE.addAll(list);
        }
    }
}
