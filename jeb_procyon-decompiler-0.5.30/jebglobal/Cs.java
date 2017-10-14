// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashSet;

public final class Cs implements GS
{
    private int dN;
    
    public Cs(final int dn) {
        this.dN = dn;
    }
    
    @Override
    public int hashCode() {
        return 31 + this.dN;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.dN == ((Cs)o).dN);
    }
    
    public int dN() {
        return this.dN;
    }
    
    public void dN(final int dn) {
        this.dN = dn;
    }
    
    @Override
    public HashSet fa() {
        return new HashSet();
    }
    
    @Override
    public String toString() {
        return String.format("->%X", this.dN);
    }
}
