// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class tE extends wz
{
    private List dN;
    private List ld;
    private EG QE;
    
    public tE(final lk lk, final II ii) {
        if (lk == null || ii == null) {
            throw new IllegalArgumentException();
        }
        this.dN = new ArrayList();
        this.ld = new ArrayList();
        this.QE = null;
        this.dN(lk, new EG(ii));
    }
    
    public tE(final lk lk, final EG eg) {
        if (lk == null || eg == null) {
            throw new IllegalArgumentException();
        }
        this.dN = new ArrayList();
        this.ld = new ArrayList();
        this.QE = null;
        this.dN(lk, eg);
    }
    
    public void dN(final lk lk, final EG eg) {
        if (lk == null || eg == null) {
            throw new IllegalArgumentException();
        }
        this.dN.add(lk);
        this.ld.add(eg);
    }
    
    public void dN(final int n, final lk lk, final EG eg) {
        if (lk == null || eg == null) {
            throw new IllegalArgumentException();
        }
        this.dN.add(n, lk);
        this.ld.add(n, eg);
    }
    
    public lk ld(final int n) {
        return this.dN.get(n);
    }
    
    public List zs() {
        return this.dN;
    }
    
    public void dN(final int n, final lk lk) {
        this.dN.set(n, lk);
    }
    
    public EG QE(final int n) {
        return this.ld.get(n);
    }
    
    public void dN(final int n, final EG eg) {
        this.ld.set(n, eg);
    }
    
    public void wU(final int n) {
        this.dN.remove(n);
        this.ld.remove(n);
    }
    
    public boolean mS() {
        return this.QE != null;
    }
    
    public EG OK() {
        return this.QE;
    }
    
    public void dN(final EG qe) {
        this.QE = qe;
    }
    
    public int LH() {
        return this.dN.size() + ((this.QE != null) ? 1 : 0);
    }
    
    public int KK() {
        return this.dN.size();
    }
    
    @Override
    public boolean dN(final int n, final II ii) {
        final Iterator<EG> iterator = this.ld.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().dN(n, ii)) {
                return true;
            }
        }
        return this.QE != null && this.QE.dN(n, ii);
    }
    
    @Override
    public List dN() {
        final ArrayList<EG> list = new ArrayList<EG>();
        final Iterator<EG> iterator = this.ld.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        if (this.QE != null) {
            list.add(this.QE);
        }
        return list;
    }
    
    @Override
    public List ld() {
        final ArrayList<rj> list = new ArrayList<rj>();
        list.add(new h(this.dN.get(0)));
        list.addAll((Collection<?>)this.ld.get(0).ld());
        for (int size = this.dN.size(), i = 1; i < size; ++i) {
            list.add((h)new gl((lk)this.dN.get(i)));
            list.addAll((Collection<?>)((EG)this.ld.get(i)).ld());
        }
        if (this.QE != null) {
            list.add((h)new hs());
            list.addAll((Collection<?>)this.QE.ld());
        }
        list.add((h)new rj());
        return list;
    }
    
    @Override
    public List wU() {
        final List dn = TM.dN(this.dN);
        TM.dN(dn, this.ld);
        return TM.dN(dn, this.QE);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        for (int i = 0; i < this.dN.size(); ++i) {
            if (this.dN.get(i) == ik) {
                this.dN.set(i, ik2);
                return true;
            }
        }
        for (int j = 0; j < this.ld.size(); ++j) {
            if (this.ld.get(j) == ik) {
                this.ld.set(j, ik2);
                return true;
            }
        }
        if (this.QE == ik) {
            this.QE = (EG)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        for (int i = 0; i < this.dN.size(); ++i) {
            if (i >= 1) {
                zl.QE();
                zl.dN(oc.OK);
                zl.wU(" ");
            }
            zl.dN(oc.PF);
            zl.wU("(");
            ((lk)this.dN.get(i)).dN(zl);
            zl.wU(") ");
            ((EG)this.ld.get(i)).dN(zl);
        }
        if (this.QE != null) {
            zl.QE();
            zl.dN(oc.OK);
            zl.wU(" ");
            this.QE.dN(zl);
        }
    }
}
