// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.List;

public abstract class II implements IK
{
    private int dN;
    private int ld;
    private Tp QE;
    
    public II() {
        this.dN = -1;
        this.ld = -1;
        this.QE = null;
    }
    
    public abstract void dN(final ZL p0);
    
    public void dN(final int dn, final int n) {
        this.dN = dn;
    }
    
    public void dN(final int ld) {
        this.ld = ld;
    }
    
    public int QE() {
        return this.ld;
    }
    
    static boolean dN(final List list, final int n, final II ii) {
        for (int i = 0; i < list.size(); ++i) {
            final II ii2 = list.get(i);
            if (ii2.dN == n) {
                list.add(i, ii);
                return true;
            }
            if (ii2 instanceof wz && ((wz)ii2).dN(n, ii)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public List wU() {
        throw new RuntimeException();
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        throw new RuntimeException();
    }
    
    public Tp fa() {
        if (this.QE == null) {
            this.QE = new Tp();
        }
        return this.QE;
    }
    
    public void ld(final ZL zl) {
        if (this.QE != null) {
            final Iterator<bJ> iterator = this.QE.dN().iterator();
            while (iterator.hasNext()) {
                zl.dN(iterator.next());
            }
        }
    }
}
