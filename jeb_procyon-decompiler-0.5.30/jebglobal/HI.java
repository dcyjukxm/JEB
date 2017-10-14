// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class HI extends cI implements Rx
{
    private String dN;
    private String ld;
    private int QE;
    
    private HI(final String dn, final int qe) {
        this.ld = null;
        if (dn == null) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
        this.QE = qe;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    public String dN(final boolean b) {
        if (!b || this.ld == null) {
            return this.dN;
        }
        return this.ld;
    }
    
    public boolean dN(String ld) {
        if ((ld == null && this.ld == null) || (ld != null && ld.equals(this.ld))) {
            return true;
        }
        if (ld != null && !lP.QE(ld)) {
            return false;
        }
        if (ld != null && ld.equals(this.dN(false))) {
            ld = null;
            if (this.ld == null) {
                return true;
            }
        }
        this.ld = ld;
        return true;
    }
    
    public int ld() {
        return this.QE;
    }
    
    @Override
    public List wU() {
        return TM.dN(new IK[0]);
    }
    
    @Override
    public boolean dN(final IK ik, final IK ik2) {
        return false;
    }
    
    @Override
    public String toString() {
        return this.dN(true);
    }
    
    @Override
    public void dN(final ZL zl) {
        this.a_(zl);
        if (this.dN.equals("this")) {
            zl.dN(oc.ci);
        }
        else {
            zl.dN(this.dN(true), Zh.EO, this);
        }
    }
    
    public enum vd
    {
        dN("DEFAULT", 0), 
        ld("NAME_FROM_TYPE", 1);
        
        private vd(final String s, final int n) {
        }
    }
    
    public static final class uK
    {
        private boolean dN;
        private lo ld;
        private HashMap QE;
        private HashMap wU;
        
        uK(final vd vd) {
            this(false, vd);
        }
        
        private uK(final boolean dn, final vd vd) {
            this.dN = dn;
            switch (HI$1.dN[vd.ordinal()]) {
                case 1: {
                    this.ld = new Fw();
                    break;
                }
                default: {
                    this.ld = new rO();
                    break;
                }
            }
            this.QE = new HashMap();
            this.wU = new HashMap();
        }
        
        public void dN() {
            this.ld.dN();
            this.QE.clear();
            this.wU.clear();
        }
        
        public wm dN(final int n, final hV hv, final int n2, String dn) {
            final boolean b = this.dN && hv.zs();
            if (dn == null) {
                dn = this.ld.dN(hv, n2);
            }
            final HI hi = this.QE.get(dn);
            if (hi == null) {
                final HI hi2 = new HI(dn, n2, null);
                final wm wm = new wm(n, hv, hi2);
                this.QE.put(dn, hi2);
                List<?> list = this.wU.get(n2);
                if (list == null) {
                    list = new ArrayList<Object>();
                    this.wU.put(n2, list);
                }
                list.add(wm);
                return wm;
            }
            final List<wm> list2 = this.wU.get(n2);
            if (list2 == null) {
                throw new RuntimeException();
            }
            for (final wm wm2 : list2) {
                final hV ld = wm2.ld();
                if (ld.equals(hv) || (b && ld.zs())) {
                    if (wm2.zs() != hi) {
                        throw new RuntimeException();
                    }
                    return wm2;
                }
            }
            throw new RuntimeException();
        }
        
        public List dN(final int n) {
            return this.wU.get(n);
        }
        
        public wm dN(final HI hi) {
            for (final wm wm : this.wU.get(hi.ld())) {
                if (wm.zs() == hi) {
                    return wm;
                }
            }
            return null;
        }
        
        public wm dN(final int n, final hV hv, final StringBuilder sb, final hV[] array) {
            final boolean b = this.dN && hv.zs();
            final List<wm> list = this.wU.get(n);
            sb.setLength(0);
            if (list != null) {
                int n2 = 0;
                for (final wm wm : list) {
                    final hV ld = wm.ld();
                    if (ld.equals(hv) || (b && ld.zs())) {
                        array[0] = ld;
                        return wm;
                    }
                    ++n2;
                }
                sb.append("_" + n2);
            }
            return null;
        }
    }
}
