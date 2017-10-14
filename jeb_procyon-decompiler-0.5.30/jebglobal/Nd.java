// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class Nd extends YJ
{
    private int dN;
    private int ld;
    private Zh QE;
    private int wU;
    private Object fa;
    private Object zs;
    private boolean mS;
    
    protected Nd(final int dn, final int ld, final Zh qe, final int wu, final Object fa, final Object zs) {
        super(0, 0, qe, 0);
        if (ld < 0 || dn < 0) {
            throw new RuntimeException();
        }
        if (ld <= 1023 && dn <= 4095 && wu >= 0 && wu <= 7) {
            throw new RuntimeException();
        }
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.zs = zs;
        this.mS = false;
    }
    
    @Override
    public Zh dN() {
        return this.QE;
    }
    
    @Override
    public int ld() {
        return this.ld;
    }
    
    @Override
    public int QE() {
        return this.dN;
    }
    
    @Override
    public int wU() {
        return this.ld + this.dN;
    }
    
    @Override
    public int fa() {
        return this.wU;
    }
    
    @Override
    public Object zs() {
        return this.fa;
    }
    
    @Override
    public Object mS() {
        return this.zs;
    }
    
    @Override
    public void dN(final int ld) {
        if (ld < 0) {
            throw new RuntimeException();
        }
        this.ld = ld;
    }
    
    @Override
    public void ld(final int n) {
        final int dn = this.dN + n;
        if (dn < 0) {
            throw new RuntimeException();
        }
        this.dN = dn;
    }
    
    @Override
    public boolean OK() {
        return this.mS;
    }
    
    @Override
    public void dN(final boolean ms) {
        this.mS = ms;
    }
}
