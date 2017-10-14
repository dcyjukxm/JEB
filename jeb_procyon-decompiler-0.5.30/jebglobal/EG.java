// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class EG extends wz implements Iterable
{
    private List dN;
    
    public EG() {
        this.dN = new ArrayList();
    }
    
    public EG(final II ii) {
        this();
        this.dN(ii);
    }
    
    public int zs() {
        return this.dN.size();
    }
    
    public boolean mS() {
        return this.dN.isEmpty();
    }
    
    public void dN(final II ii) {
        if (ii == null) {
            throw new IllegalArgumentException();
        }
        this.dN.add(ii);
    }
    
    public II ld(final int n) {
        return this.dN.get(n);
    }
    
    public II OK() {
        return this.dN.get(this.dN.size() - 1);
    }
    
    public II QE(final int n) {
        final II ii = this.dN.get(n);
        this.dN.remove(n);
        return ii;
    }
    
    public II LH() {
        final int n = this.dN.size() - 1;
        final II ii = this.dN.get(n);
        this.dN.remove(n);
        return ii;
    }
    
    public void wU(final int n) {
        this.dN.remove(n);
    }
    
    public boolean ld(final II ii) {
        if (ii == null) {
            throw new IllegalArgumentException();
        }
        return this.dN.remove(ii);
    }
    
    public void ld(final int n, final II ii) {
        this.wU(n);
        this.QE(n, ii);
    }
    
    public void QE(final int n, final II ii) {
        if (ii == null) {
            throw new IllegalArgumentException();
        }
        this.dN.add(n, ii);
    }
    
    public void dN(int n, final EG eg) {
        if (eg == null) {
            throw new IllegalArgumentException();
        }
        final Iterator<II> iterator = eg.dN.iterator();
        while (iterator.hasNext()) {
            this.dN.add(n, iterator.next());
            ++n;
        }
    }
    
    public void KK() {
        this.dN.clear();
    }
    
    @Override
    public boolean dN(final int n, final II ii) {
        return II.dN(this.dN, n, ii);
    }
    
    @Override
    public List dN() {
        final ArrayList<EG> list = new ArrayList<EG>();
        list.add(this);
        return list;
    }
    
    @Override
    public List ld() {
        final ArrayList<kd> list = new ArrayList<kd>();
        list.add(new kd());
        for (final II ii : this.dN) {
            if (ii instanceof wz) {
                list.addAll(((wz)ii).ld());
            }
            else {
                list.add((kd)ii);
            }
        }
        list.add((kd)new RT());
        return list;
    }
    
    @Override
    public Iterator iterator() {
        return this.dN.iterator();
    }
    
    @Override
    public List wU() {
        return TM.dN(this.dN);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        for (int i = 0; i < this.dN.size(); ++i) {
            if (this.dN.get(i) == ik) {
                this.dN.set(i, ik2);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        zl.wU("{");
        zl.QE();
        zl.rK();
        int n = 0;
        for (final II ii : this.dN) {
            final boolean b = ii instanceof Qa && zl.Hw() >= 0;
            if (b) {
                zl.Ux();
            }
            if (zl.LH != null) {
                zl.ld(zl.LH.QE(zl.ld(), ii.QE()));
            }
            zl.QE(ii.QE());
            ii.dN(zl);
            if (b) {
                zl.rK();
            }
            if (!(ii instanceof Qa) && (!(ii instanceof wz) || ii instanceof jM)) {
                zl.wU(";");
            }
            zl.QE();
            if (ii instanceof wz && zl.dN && n + 1 < this.dN.size()) {
                zl.QE();
            }
            ++n;
        }
        zl.Ux();
        zl.wU("}");
    }
}
