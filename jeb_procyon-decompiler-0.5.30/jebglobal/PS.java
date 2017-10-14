// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class PS
{
    public final Object dN;
    public final Object ld;
    
    public PS(final Object dn, final Object ld) {
        this.dN = dn;
        this.ld = ld;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final PS ps = (PS)o;
        return (this.dN == ps.dN || (this.dN != null && this.dN.equals(ps.dN))) && (this.ld == ps.ld || (this.ld != null && this.ld.equals(ps.ld)));
    }
    
    @Override
    public int hashCode() {
        return 71 * (213 + ((this.dN != null) ? this.dN.hashCode() : 0)) + ((this.ld != null) ? this.ld.hashCode() : 0);
    }
}
