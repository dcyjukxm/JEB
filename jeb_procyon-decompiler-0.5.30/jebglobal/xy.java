// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;

public final class xy extends Ts
{
    private int ld;
    private int QE;
    
    public xy(final int ld, final hV dn) {
        if (ld < 0 || ld > 65535) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
        if (dn.rK()) {
            this.QE = -1;
        }
        else {
            if (!dn.Ux()) {
                throw new IllegalArgumentException();
            }
            this.QE = ld + 1;
            if (ld == 65535) {
                throw new RuntimeException();
            }
        }
        this.dN = dn;
    }
    
    public boolean ld(final xy xy) {
        return this.ld == xy.ld && this.QE == xy.QE;
    }
    
    public boolean QE(final xy xy) {
        return this.ld == xy.ld && this.QE == xy.QE;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final xy xy = (xy)o;
        return this.ld == xy.ld && this.QE == xy.QE && this.dN.equals(xy.dN);
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 + this.ld) + this.QE) + this.dN.hashCode();
    }
    
    @Override
    public HashSet fa() {
        final HashSet<Integer> set = new HashSet<Integer>();
        set.add(this.ld);
        if (this.QE >= 0) {
            set.add(this.QE);
        }
        return set;
    }
    
    @Override
    hV dN(final int n) {
        if (n == this.ld || n == this.QE) {
            return this.dN;
        }
        return hV.dN;
    }
    
    @Override
    boolean dN(final int n, final hV hv) {
        return (n == this.ld || n == this.QE) && this.dN(hv);
    }
    
    public boolean ld() {
        return false;
    }
    
    public boolean QE() {
        return false;
    }
    
    @Override
    int dN(final xy xy) {
        if (this.ld != xy.ld || this.QE != xy.QE) {
            return 0;
        }
        this.dN.dN(xy.dN);
        return 1;
    }
    
    @Override
    int dN(final xy xy, final tu tu) {
        return 0;
    }
    
    @Override
    int dN(final xy xy, final long n) {
        return 0;
    }
    
    @Override
    void dN(final hV hv, final hV hv2) {
        super.dN(hv, hv2);
    }
    
    @Override
    public List wU() {
        return ZF.dN(new tu[0]);
    }
    
    @Override
    public boolean dN(final tu tu, final tu tu2) {
        return false;
    }
    
    @Override
    public String toString() {
        if (this.QE >= 0) {
            return String.format("v%d:v%d<%s>", this.QE, this.ld, this.dN);
        }
        return String.format("v%d<%s>", this.ld, this.dN);
    }
    
    public Xf dN(final TB tb) {
        this.dN.ld(tb.QE);
        if (tb.cb) {
            final wm dn = tb.LH.dN(this.ld, this.dN, new StringBuilder(), new hV[1]);
            if (dn != null) {
                tb.PF.put(tb.EO, dn);
                return dn.zs();
            }
            final wm dn2 = tb.LH.dN(tb.EO.dN(), this.dN, this.ld, null);
            dn2.dN(tb.EO.mS());
            tb.PF.put(tb.EO, dn2);
            return dn2;
        }
        else {
            final HashSet ld = this.ld(tb);
            if (ld.isEmpty()) {
                throw new RuntimeException();
            }
            ld.size();
            final wm wm = ld.iterator().next();
            final HI zs = wm.zs();
            final hV ld2 = wm.ld();
            if (this.dN == ld2) {
                return zs;
            }
            if (this.dN == hV.zs && (ld2 == hV.QE || ld2 == hV.wU || ld2 == hV.fa)) {
                return zs;
            }
            if (this.dN.equals(tb.wU.dN("Ljava/lang/Object;"))) {
                return zs;
            }
            return new Gy(null, tb.fa.dN(this.dN), zs);
        }
    }
    
    private HashSet ld(final TB tb) {
        tb.ld.zs();
        final HashSet<wm> set = new HashSet<wm>();
        final HashMap<Integer, wm> hashMap = new HashMap<Integer, wm>();
        for (final wm wm : tb.LH.dN(this.ld)) {
            hashMap.put(wm.dN(), wm);
        }
        this.dN(tb.ld, this.ld, tb.EO, tb.PF, set, new HashSet());
        if (set.isEmpty() && hashMap.containsKey(-1)) {
            set.add(hashMap.get(-1));
        }
        return set;
    }
    
    private void dN(final oh oh, final int n, final xS xs, final HashMap hashMap, final HashSet set, final HashSet set2) {
        if (set2.contains(xs)) {
            return;
        }
        set2.add(xs);
        final List<xS> list = oh.KK().get(xs).get(n);
        if (list == null) {
            return;
        }
        for (final xS xs2 : list) {
            final wm wm = hashMap.get(xs2);
            if (wm != null && wm.zs().ld() == n) {
                set.add(wm);
            }
            else {
                this.dN(oh, n, xs2, hashMap, set, set2);
            }
        }
    }
}
