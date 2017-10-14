// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.List;

public final class OM
{
    private int dN;
    private int ld;
    private int QE;
    private int wU;
    private vD fa;
    private int zs;
    private int mS;
    private List OK;
    private oh LH;
    private nm[] KK;
    
    OM(final int ld, final int qe, final int wu, final vD fa, final int zs, final int ms, final List ok, final oh lh, final nm[] array) {
        this.dN = -1;
        if (ld < 0 || qe < 0 || wu < 0 || zs < 0 || ok == null) {
            throw new yL();
        }
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.zs = zs;
        this.mS = ms;
        this.OK = ok;
        this.LH = lh;
        this.KK = ((array == null) ? new nm[0] : array);
    }
    
    void dN(final int dn) {
        this.dN = dn;
    }
    
    public int dN() {
        return this.dN;
    }
    
    public int ld() {
        return this.zs;
    }
    
    public int QE() {
        return this.mS;
    }
    
    public List wU() {
        return this.OK;
    }
    
    public oh fa() {
        return this.LH;
    }
    
    public Wu ld(final int n) {
        for (final Wu wu : this.OK) {
            if (wu.dN() == n) {
                return wu;
            }
        }
        return null;
    }
    
    public int zs() {
        return this.ld;
    }
    
    public int mS() {
        return this.QE;
    }
    
    public int OK() {
        return this.wU;
    }
    
    public nm[] LH() {
        return this.KK;
    }
    
    public vD KK() {
        return this.fa;
    }
    
    public static String QE(final int n) {
        return String.format("%X", n);
    }
}
