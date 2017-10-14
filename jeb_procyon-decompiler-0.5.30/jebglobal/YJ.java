// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.custom.StyleRange;

public class YJ implements hv
{
    private int dN;
    private wy ld;
    private wy QE;
    
    protected YJ(final int n, final int n2, final Zh zh, final int n3) {
        this.ld = null;
        this.QE = null;
        final int ordinal = zh.ordinal();
        if (n3 < 0 || n3 > 7 || ordinal < 0 || ordinal > 63 || n2 < 0 || n2 > 1023 || n < 0 || n > 4095) {
            throw new RuntimeException();
        }
        this.dN = (n3 << 28 | ordinal << 22 | n2 << 12 | n);
    }
    
    @Override
    public Zh dN() {
        return Zh.values()[this.dN >> 22 & 0x3F];
    }
    
    @Override
    public int ld() {
        return this.dN >> 12 & 0x3FF;
    }
    
    @Override
    public int QE() {
        return this.dN & 0xFFF;
    }
    
    @Override
    public int wU() {
        return (this.dN & 0xFFF) + (this.dN >> 12 & 0x3FF);
    }
    
    @Override
    public int fa() {
        return this.dN >> 28 & 0x7;
    }
    
    @Override
    public Object zs() {
        return null;
    }
    
    public Object mS() {
        return null;
    }
    
    @Override
    public void dN(final int n) {
        if (n == this.ld()) {
            return;
        }
        if (n < 0 || n > 1023) {
            throw new RuntimeException();
        }
        this.dN &= 0xFFC00FFF;
        this.dN |= n << 12;
    }
    
    @Override
    public void ld(final int n) {
        if (n == 0) {
            return;
        }
        final int n2 = this.QE() + n;
        if (n2 < 0 || n2 > 4095) {
            throw new RuntimeException();
        }
        this.dN &= 0xFFFFF000;
        this.dN |= n2;
    }
    
    public boolean OK() {
        return (this.dN >> 31 & 0x1) != 0x0;
    }
    
    public void dN(final boolean b) {
        if (b) {
            this.dN |= Integer.MIN_VALUE;
        }
        else {
            this.dN &= Integer.MAX_VALUE;
        }
    }
    
    public StyleRange QE(final int n) {
        if (!this.OK()) {
            return this.dN(n, this.ld);
        }
        return this.dN(n, this.QE);
    }
    
    public boolean LH() {
        return this.QE != null;
    }
    
    public void dN(final wy ld) {
        this.ld = ld;
    }
    
    public void ld(final wy qe) {
        this.QE = qe;
    }
    
    private StyleRange dN(final int n, final wy wy) {
        return this.dN(n, wy.dN, wy.ld, wy.QE, wy.wU, false);
    }
    
    private StyleRange dN(final int n, final Color foreground, final Color background, final boolean b, final boolean b2, final boolean b3) {
        final StyleRange styleRange = new StyleRange();
        styleRange.data = this;
        styleRange.start = n + this.QE();
        styleRange.length = this.ld();
        styleRange.foreground = foreground;
        styleRange.background = background;
        styleRange.fontStyle = (((false | b) ? 1 : 0) | (b2 ? 2 : 0) | ((b3 && false) ? 1 : 0));
        return styleRange;
    }
    
    @Override
    public String toString() {
        return String.format("[is_active=%s beg=%d end=%d obj=%s extra=%s]", this.OK(), this.QE(), this.wU(), this.zs(), this.mS());
    }
}
