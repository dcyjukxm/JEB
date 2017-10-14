// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;

final class ll
{
    private oh wU;
    ft dN;
    HashMap ld;
    HashMap QE;
    
    ll(final oh wu, final ft dn, final boolean b, final boolean b2) {
        this.wU = wu;
        this.dN = dn;
        this.ld = (b ? new HashMap() : null);
        this.QE = (b2 ? new HashMap() : null);
    }
    
    void dN() {
        if (this.ld == null) {
            this.ld = new HashMap();
        }
    }
    
    void ld() {
        if (this.QE == null) {
            this.QE = new HashMap();
        }
    }
    
    HashMap dN(final HashMap hashMap) {
        final HashMap<Integer, HashSet> hashMap2 = new HashMap<Integer, HashSet>();
        for (final int intValue : hashMap.keySet()) {
            hashMap2.put(intValue, new HashSet((Collection<?>)hashMap.get(intValue)));
        }
        return hashMap2;
    }
    
    void dN(final HashMap hashMap, final HashMap hashMap2) {
        for (final int intValue : hashMap2.keySet()) {
            HashSet set = hashMap.get(intValue);
            if (set == null) {
                set = new HashSet();
                hashMap.put(intValue, set);
            }
            set.addAll((Collection)hashMap2.get(intValue));
        }
    }
    
    boolean ld(final HashMap hashMap, final HashMap hashMap2) {
        for (final int intValue : hashMap.keySet()) {
            final HashSet set = hashMap2.get(intValue);
            if (set == null) {
                return false;
            }
            if (!set.equals(hashMap.get(intValue))) {
                return false;
            }
        }
        return true;
    }
    
    void QE() {
        final List dn = this.dN.dN;
        this.ld = this.dN(this.QE);
        for (int i = dn.size() - 1; i >= 0; --i) {
            final bm bm = dn.get(i);
            final Iterator<Integer> iterator = this.wU.dN.get(bm).iterator();
            while (iterator.hasNext()) {
                this.ld.remove((int)iterator.next());
            }
            for (final int intValue : this.wU.ld.get(bm)) {
                HashSet<bm> set = this.ld.get(intValue);
                if (set == null) {
                    set = new HashSet<bm>();
                    this.ld.put(intValue, set);
                }
                set.add(bm);
            }
        }
    }
    
    void wU() {
        final List dn = this.dN.dN;
        this.QE = this.dN(this.ld);
        for (int i = 0; i < dn.size(); ++i) {
            final bm bm = dn.get(i);
            for (final int intValue : this.wU.dN.get(bm)) {
                HashSet<bm> set = this.QE.get(intValue);
                if (set == null) {
                    set = new HashSet<bm>();
                    this.QE.put(intValue, set);
                }
                else {
                    set.clear();
                }
                set.add(bm);
            }
        }
    }
}
