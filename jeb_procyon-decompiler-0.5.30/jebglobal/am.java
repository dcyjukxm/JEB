// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class am extends wz
{
    private II dN;
    private lk ld;
    private II QE;
    private EG wU;
    
    public am(final II dn, final lk ld, final II qe, final EG wu) {
        if (wu == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
    }
    
    public II zs() {
        return this.dN;
    }
    
    public lk mS() {
        return this.ld;
    }
    
    public II OK() {
        return this.QE;
    }
    
    public EG LH() {
        return this.wU;
    }
    
    public void dN(final II dn) {
        this.dN = dn;
    }
    
    public void dN(final lk ld) {
        this.ld = ld;
    }
    
    public void ld(final II qe) {
        this.QE = qe;
    }
    
    public void dN(final EG wu) {
        if (wu == null) {
            throw new IllegalArgumentException();
        }
        this.wU = wu;
    }
    
    @Override
    public boolean dN(final int n, final II ii) {
        throw new RuntimeException();
    }
    
    @Override
    public List dN() {
        final ArrayList<EG> list = new ArrayList<EG>();
        list.add(this.wU);
        return list;
    }
    
    @Override
    public List ld() {
        final ArrayList<bW> list = new ArrayList<bW>();
        list.add(new SB(this.dN, this.ld, this.QE));
        list.addAll((Collection<?>)this.wU.ld());
        list.add((SB)new bW());
        return list;
    }
    
    @Override
    public List wU() {
        return TM.dN(this.dN, this.ld, this.QE, this.wU);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (II)ik2;
            return true;
        }
        if (this.ld == ik) {
            this.ld = (lk)ik2;
            return true;
        }
        if (this.QE == ik) {
            this.QE = (II)ik2;
            return true;
        }
        if (this.wU == ik) {
            this.wU = (EG)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        zl.dN(oc.EO);
        zl.wU("(");
        if (this.dN != null) {
            this.dN.dN(zl);
        }
        zl.wU("; ");
        if (this.ld != null) {
            this.ld.dN(zl);
        }
        zl.wU("; ");
        if (this.QE != null) {
            this.QE.dN(zl);
        }
        zl.wU(") ");
        this.wU.dN(zl);
    }
}
