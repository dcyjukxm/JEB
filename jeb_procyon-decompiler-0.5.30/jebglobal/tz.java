// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class tz
{
    public final int dN;
    public final int ld;
    
    public tz(final int n) {
        this(n >> 24, n >> 16 & 0xFF, n & 0xFFFF, n);
    }
    
    public tz(final int dn, final int n, final int n2, final int ld) {
        this.dN = dn;
        this.ld = ld;
    }
    
    @Override
    public String toString() {
        return String.format("0x%08x", this.ld);
    }
    
    @Override
    public int hashCode() {
        return 413 + this.ld;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && this.getClass() == o.getClass() && this.ld == ((tz)o).ld;
    }
}
