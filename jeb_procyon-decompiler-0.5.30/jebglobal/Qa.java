// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class Qa extends II
{
    private int dN;
    private String ld;
    private String QE;
    
    private Qa(final int dn, final String ld) {
        this.QE = null;
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.ld = ld;
    }
    
    public int dN() {
        return this.dN;
    }
    
    public String dN(final boolean b) {
        if (!b || this.QE == null) {
            return this.ld;
        }
        return this.QE;
    }
    
    public boolean dN(String qe) {
        if ((qe == null && this.QE == null) || (qe != null && qe.equals(this.QE))) {
            return true;
        }
        if (qe != null && !lP.QE(qe)) {
            return false;
        }
        if (qe != null && qe.equals(this.dN(false))) {
            qe = null;
            if (this.QE == null) {
                return true;
            }
        }
        this.QE = qe;
        return true;
    }
    
    @Override
    public List wU() {
        return TM.dN(new IK[0]);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        return false;
    }
    
    void dN(final ZL zl, final boolean b) {
        this.ld(zl);
        String s = this.dN(true);
        if (b) {
            s += ":";
        }
        Object value = null;
        final int qe = this.QE();
        if (qe >= 0) {
            value = (zl.ld() << 32 | qe);
        }
        zl.dN(s, Zh.LH, b ? 1 : 0, this, value);
    }
    
    @Override
    public void dN(final ZL zl) {
        this.dN(zl, true);
    }
    
    @Override
    public String toString() {
        return String.format("%s(phyoff=%Xh)", super.toString(), this.QE());
    }
    
    public static final class uK
    {
        private HashMap dN;
        
        uK() {
            this.dN = new HashMap();
        }
        
        public void dN() {
            this.dN.clear();
        }
        
        public Qa dN(final int n, final String s) {
            Qa qa = this.dN.get(n);
            if (qa == null) {
                qa = new Qa(n, s, null);
                this.dN.put(n, qa);
            }
            else if (!qa.dN(false).equals(s)) {
                throw new RuntimeException();
            }
            return qa;
        }
        
        public List ld() {
            return new ArrayList(this.dN.values());
        }
    }
}
