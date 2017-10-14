// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class bt
{
    private int dN;
    private int ld;
    
    public bt(final int n, final int ld) {
        this.dN = ((n < 0) ? -1 : n);
        this.ld = ld;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 + this.ld) + this.dN;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final bt bt = (bt)o;
        return this.ld == bt.ld && this.dN == bt.dN;
    }
    
    public boolean dN() {
        return this.dN >= 0;
    }
    
    public int ld() {
        return this.dN;
    }
    
    public int QE() {
        return this.ld;
    }
    
    @Override
    public String toString() {
        return String.format("%X:t=%s", this.ld, (this.dN < 0) ? "X" : String.format("%X", this.dN));
    }
}
