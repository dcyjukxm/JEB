// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashMap;

public final class Dq extends wz
{
    private Xf dN;
    private LinkedHashMap ld;
    private EG QE;
    
    public Dq(final Xf dn) {
        if (dn == null) {
            throw new RuntimeException();
        }
        this.dN = dn;
        this.ld = new LinkedHashMap();
        this.QE = null;
    }
    
    public Xf zs() {
        return this.dN;
    }
    
    public void dN(final Xf dn) {
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
    }
    
    public HashSet mS() {
        final HashSet set = new HashSet();
        final Iterator<List> iterator = this.ld.values().iterator();
        while (iterator.hasNext()) {
            set.addAll(iterator.next());
        }
        return set;
    }
    
    public List OK() {
        return new ArrayList(this.ld.keySet());
    }
    
    public EG ld(final int n) {
        for (final EG eg : this.ld.keySet()) {
            if (((List)this.ld.get(eg)).contains(n)) {
                return eg;
            }
        }
        return null;
    }
    
    public boolean LH() {
        return this.QE != null;
    }
    
    public EG KK() {
        return this.QE;
    }
    
    public void dN(final List list, final EG eg) {
        if (eg == null || list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.ld.put(eg, list);
    }
    
    public void dN(final EG qe) {
        this.QE = qe;
    }
    
    @Override
    public boolean dN(final int n, final II ii) {
        final Iterator<EG> iterator = this.ld.keySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().dN(n, ii)) {
                return true;
            }
        }
        return this.QE != null && this.QE.dN(n, ii);
    }
    
    @Override
    public List dN() {
        final ArrayList<EG> list = new ArrayList<EG>(this.ld.keySet());
        if (this.QE != null) {
            list.add(this.QE);
        }
        return list;
    }
    
    @Override
    public List ld() {
        final ArrayList<Ps> list = new ArrayList<Ps>();
        list.add(new Ps(this.dN));
        for (final EG eg : this.ld.keySet()) {
            list.add((Ps)new At((List)this.ld.get(eg)));
            list.addAll(eg.ld());
        }
        if (this.QE != null) {
            list.add((Ps)new Ro());
            list.addAll(this.QE.ld());
        }
        list.add((Ps)new FX());
        return list;
    }
    
    @Override
    public List wU() {
        final List dn = TM.dN(this.dN);
        TM.dN(dn, this.ld.keySet());
        return TM.dN(dn, this.QE);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (Xf)ik2;
            return true;
        }
        final Iterator<EG> iterator = this.ld.keySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == ik) {
                throw new RuntimeException();
            }
        }
        if (this.QE == ik) {
            this.QE = (EG)ik2;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        zl.dN(oc.VX);
        zl.wU("(");
        this.dN.dN(zl);
        zl.wU(") {");
        zl.QE();
        zl.rK();
        final ArrayList<Object> list = new ArrayList<Object>(this.ld.keySet());
        Collections.sort(list, new sr(this));
        for (final EG eg : list) {
            final List<Comparable> list2 = this.ld.get(eg);
            Collections.sort(list2);
            int n = 0;
            for (final int intValue : list2) {
                if (n >= 1) {
                    zl.QE();
                }
                zl.dN(oc.ld);
                zl.s();
                zl.dN(String.format("%d", intValue), Zh.cb);
                zl.wU(": ");
                ++n;
            }
            eg.dN(zl);
            zl.QE();
        }
        if (this.QE != null) {
            zl.dN(oc.zs);
            zl.wU(": ");
            this.QE.dN(zl);
            zl.QE();
        }
        zl.Ux();
        zl.wU("}");
    }
}
