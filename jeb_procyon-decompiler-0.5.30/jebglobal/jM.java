// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class jM extends wz
{
    private EG dN;
    private lk ld;
    
    public jM(final EG dn, final lk ld) {
        if (dn == null || ld == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
    }
    
    public EG zs() {
        return this.dN;
    }
    
    public lk mS() {
        return this.ld;
    }
    
    public void dN(final EG dn) {
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
    }
    
    public void dN(final lk ld) {
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
    }
    
    @Override
    public boolean dN(final int n, final II ii) {
        return this.dN.dN(n, ii);
    }
    
    @Override
    public List dN() {
        final ArrayList<EG> list = new ArrayList<EG>();
        list.add(this.dN);
        return list;
    }
    
    @Override
    public List ld() {
        final ArrayList<aY> list = new ArrayList<aY>();
        list.add(new Ya());
        list.addAll((Collection<?>)this.dN.ld());
        list.add((Ya)new aY(this.ld));
        return list;
    }
    
    @Override
    public List wU() {
        return TM.dN(this.dN, this.ld);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (EG)ik2;
            return true;
        }
        if (this.ld == ik) {
            this.ld = (lk)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        zl.dN(oc.mS);
        zl.wU(" ");
        this.dN.dN(zl);
        zl.QE();
        zl.dN(oc.De);
        zl.wU("(");
        this.ld.dN(zl);
        zl.wU(")");
    }
}
