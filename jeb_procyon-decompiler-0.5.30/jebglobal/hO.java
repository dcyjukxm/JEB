// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;

public final class hO implements Oa
{
    private AR dN;
    private int ld;
    private int QE;
    private int wU;
    private int fa;
    private String zs;
    
    hO(final AR dn, final int ld, final int qe, final int wu, final int fa) {
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
    
    public AV ld() {
        return this.dN.dN.get(this.wU(false));
    }
    
    public boolean QE() {
        return this.ld() != null;
    }
    
    public boolean dN(final String s) {
        return this.dN(s, true);
    }
    
    public boolean ld(final String s) {
        return this.dN(s, false);
    }
    
    private boolean dN(String zs, final boolean b) {
        if ((zs == null && this.zs == null) || (zs != null && zs.equals(this.zs))) {
            return false;
        }
        if (zs != null && !lP.QE(zs)) {
            return false;
        }
        if (zs != null && zs.equals(this.ld(false))) {
            zs = null;
            if (this.zs == null) {
                return true;
            }
        }
        if (zs != null) {
            final yK eo = this.dN.EO(this.dN(false));
            if (eo != null) {
                final Uk s = eo.s();
                if (s != null) {
                    final Iterator iterator = s.zs().iterator();
                    while (iterator.hasNext()) {
                        final hO ms = this.dN.mS(iterator.next().ld());
                        if (ms != this && (ms.ld(false).equals(zs) || ms.ld(true).equals(zs))) {
                            return false;
                        }
                    }
                }
            }
        }
        if (!b) {
            this.zs = zs;
            if (this.QE()) {
                this.dN.QE = null;
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
    
    public int mS() {
        return this.wU;
    }
    
    public Bw OK() {
        return this.dN.wU(this.wU);
    }
    
    public int LH() {
        return this.fa;
    }
    
    public String ld(final boolean b) {
        if (b && this.zs != null) {
            return this.zs;
        }
        return this.dN.dN(this.fa);
    }
    
    public String QE(final boolean b) {
        return this.dN.dN(this.QE, b) + "->" + this.ld(b);
    }
    
    public String wU(final boolean b) {
        return this.QE(b) + this.OK().QE(b);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
