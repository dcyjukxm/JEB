// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class zn extends wz
{
    private lk dN;
    private EG ld;
    
    public zn(final lk dn, final EG ld) {
        if (dn == null || ld == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
    }
    
    public lk zs() {
        return this.dN;
    }
    
    public EG mS() {
        return this.ld;
    }
    
    public void dN(final lk dn) {
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
    }
    
    public void dN(final EG ld) {
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        this.ld = ld;
    }
    
    @Override
    public boolean dN(final int n, final II ii) {
        return this.ld.dN(n, ii);
    }
    
    @Override
    public List dN() {
        final ArrayList<EG> list = new ArrayList<EG>();
        list.add(this.ld);
        return list;
    }
    
    @Override
    public List ld() {
        final ArrayList<Rp> list = new ArrayList<Rp>();
        list.add(new aZ(this.dN));
        list.addAll((Collection<?>)this.ld.ld());
        list.add((aZ)new Rp());
        return list;
    }
    
    @Override
    public List wU() {
        return TM.dN(this.dN, this.ld);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        if (this.dN == ik) {
            this.dN = (lk)ik2;
            return true;
        }
        if (this.ld == ik) {
            this.ld = (EG)ik2;
            return true;
        }
        return false;
    }
    
    @Override
    public void dN(final ZL zl) {
        zl.dN(oc.De);
        zl.wU("(");
        this.dN.dN(zl);
        zl.wU(") ");
        this.ld.dN(zl);
    }
}
