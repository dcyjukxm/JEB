// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public class MB implements hv
{
    private int dN;
    
    protected MB(final int n, final int n2, final Zh zh, final int n3) {
        final int ordinal = zh.ordinal();
        if (n3 < 0 || n3 > 15 || ordinal < 0 || ordinal > 63 || n2 < 0 || n2 > 1023 || n < 0 || n > 4095) {
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
        return this.dN >> 28 & 0xF;
    }
    
    @Override
    public Object zs() {
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
}
