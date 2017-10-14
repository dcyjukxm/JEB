// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class SP extends wz
{
    private EG dN;
    private List ld;
    private EG QE;
    
    public SP(final EG dn) {
        if (dn == null) {
            throw new RuntimeException();
        }
        this.dN = dn;
        this.ld = new ArrayList();
        this.QE = null;
    }
    
    public EG zs() {
        return this.dN;
    }
    
    public void dN(final hV hv, final HI hi, final EG eg) {
        this.ld.add(new uK(hv, hi, eg));
    }
    
    public int mS() {
        return this.ld.size();
    }
    
    public hV ld(final int n) {
        return this.ld.get(n).dN;
    }
    
    public EG QE(final int n) {
        return this.ld.get(n).QE;
    }
    
    public HI wU(final int n) {
        return this.ld.get(n).ld;
    }
    
    public void dN(final EG qe) {
        this.QE = qe;
    }
    
    public EG OK() {
        return this.QE;
    }
    
    public boolean LH() {
        return this.QE != null;
    }
    
    @Override
    public boolean dN(final int n, final II ii) {
        if (this.dN.dN(n, ii)) {
            return true;
        }
        final Iterator<uK> iterator = this.ld.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().QE.dN(n, ii)) {
                return true;
            }
        }
        return this.QE != null && this.QE.dN(n, ii);
    }
    
    @Override
    public List dN() {
        final ArrayList<EG> list = new ArrayList<EG>();
        list.add(this.dN);
        final Iterator<uK> iterator = (Iterator<uK>)this.ld.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().QE);
        }
        if (this.QE != null) {
            list.add(this.QE);
        }
        return list;
    }
    
    @Override
    public List ld() {
        final ArrayList<tP> list = new ArrayList<tP>();
        list.add(new wJ());
        list.addAll((Collection<?>)this.dN.ld());
        for (final uK uk : this.ld) {
            list.add((wJ)new Je(uk.dN, uk.ld));
            list.addAll((Collection<?>)uk.QE.ld());
        }
        if (this.QE != null) {
            list.add((wJ)new IF());
            list.addAll((Collection<?>)this.QE.ld());
        }
        list.add((wJ)new tP());
        return list;
    }
    
    @Override
    public List wU() {
        final List dn = TM.dN(new IK[] { this.dN });
        for (final uK uk : this.ld) {
            if (uk.ld != null) {
                TM.dN(dn, uk.ld);
            }
            TM.dN(dn, uk.QE);
        }
        return TM.dN(dn, this.QE);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (EG)ik2;
            return true;
        }
        for (final uK uk : this.ld) {
            if (uk.ld == ik) {
                uk.ld = (HI)ik2;
                return true;
            }
            if (uk.QE == ik) {
                uk.QE = (EG)ik2;
                return true;
            }
        }
        if (this.QE == ik) {
            this.QE = (EG)ik2;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        zl.dN(oc.Ee);
        zl.s();
        this.dN.dN(zl);
        for (final uK uk : this.ld) {
            zl.QE();
            zl.dN(oc.QE);
            zl.wU("(");
            if (uk.dN != null) {
                oc.dN(zl, uk.dN);
                zl.wU(" ");
            }
            if (uk.ld != null) {
                zl.dN(uk.ld.dN(true), Zh.EO, 1, uk.ld, null);
            }
            zl.wU(") ");
            uk.QE.dN(zl);
        }
        if (this.QE != null) {
            zl.QE();
            zl.dN(oc.KK);
            zl.s();
            this.QE.dN(zl);
        }
    }
    
    final class uK
    {
        hV dN;
        HI ld;
        EG QE;
        
        uK(final SP sp, final hV dn, final HI ld, final EG qe) {
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
        }
    }
}
