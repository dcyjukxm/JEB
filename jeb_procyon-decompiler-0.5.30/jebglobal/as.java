// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.Image;

public abstract class as
{
    protected yn dN;
    private String KK;
    protected int ld;
    protected int QE;
    protected int wU;
    private int EO;
    protected Image fa;
    protected boolean zs;
    protected int mS;
    protected boolean OK;
    protected int LH;
    private boolean cb;
    
    public as(final yn dn, final String kk) {
        this.KK = null;
        this.ld = 0;
        this.QE = 0;
        this.wU = 0;
        this.EO = 0;
        this.fa = null;
        this.zs = true;
        this.mS = -1;
        this.OK = false;
        this.LH = -1;
        this.cb = true;
        this.dN = dn;
        this.KK = kk;
    }
    
    public yn dN() {
        return this.dN;
    }
    
    public String ld() {
        return this.KK;
    }
    
    public int QE() {
        return this.ld;
    }
    
    public int wU() {
        return this.QE;
    }
    
    public int fa() {
        return this.wU;
    }
    
    public int zs() {
        return 0;
    }
    
    public Image mS() {
        return this.fa;
    }
    
    public boolean dN(final int[] array) {
        if (this.zs && array != null && array.length >= 1) {
            array[0] = this.mS;
        }
        return this.zs;
    }
    
    public boolean ld(final int[] array) {
        if (this.OK && array != null && array.length >= 1) {
            array[0] = this.LH;
        }
        return this.OK;
    }
    
    public boolean QE(final int[] array) {
        return this.cb;
    }
    
    public abstract boolean OK();
    
    public abstract boolean LH();
}
