// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;

public final class gE implements Oa
{
    private AR dN;
    private int ld;
    private int QE;
    private int wU;
    private int fa;
    private String zs;
    
    gE(final AR dn, final int ld, final int qe, final int wu, final int fa) {
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.zs = null;
    }
    
    public int dN() {
        return this.ld;
    }
    
    public XV ld() {
        return this.dN.ld.get(this.fa(false));
    }
    
    public boolean QE() {
        return this.ld() != null;
    }
    
    public boolean dN(final String s) {
        return this.dN(s, false);
    }
    
    private boolean dN(String zs, final boolean b) {
        if ((zs == null && this.zs == null) || (zs != null && zs.equals(this.zs))) {
            return true;
        }
        if (zs != null && !lP.QE(zs)) {
            return false;
        }
        if (zs != null && zs.equals(this.QE(false))) {
            zs = null;
            if (this.zs == null) {
                return true;
            }
        }
        if (zs != null) {
            final yK eo = this.dN.EO(this.dN(false));
            if (eo != null) {
                final Uk s = eo.s();
                if (eo != null) {
                    final Iterator iterator = s.QE().iterator();
                    while (iterator.hasNext()) {
                        final gE fa = this.dN.fa(iterator.next().dN());
                        if (fa != this && (fa.QE(false).equals(zs) || fa.QE(true).equals(zs))) {
                            return false;
                        }
                    }
                }
            }
        }
        if (!b) {
            this.zs = zs;
            if (this.QE()) {
                this.dN.wU = null;
            }
        }
        return true;
    }
    
    public boolean wU() {
        return this.zs != null;
    }
    
    public int fa() {
        return this.QE;
    }
    
    public nh.vd zs() {
        return this.dN.QE(this.QE);
    }
    
    public String dN(final boolean b) {
        return this.dN.dN(this.QE, b);
    }
    
    public nh.vd mS() {
        return this.dN.QE(this.wU);
    }
    
    public String ld(final boolean b) {
        return this.dN.dN(this.wU, b);
    }
    
    public int OK() {
        return this.fa;
    }
    
    public String QE(final boolean b) {
        if (b && this.zs != null) {
            return this.zs;
        }
        return this.dN.dN(this.fa);
    }
    
    public String wU(final boolean b) {
        return this.dN.dN(this.QE, b) + "->" + this.QE(b);
    }
    
    public String fa(final boolean b) {
        return this.wU(b) + ":" + this.dN.dN(this.wU, b);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
