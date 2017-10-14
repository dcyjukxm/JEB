// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashSet;

public final class YK implements GS
{
    private int dN;
    
    public YK(final int dn) {
        if (dn < 0) {
            throw new RuntimeException();
        }
        this.dN = dn;
    }
    
    public int dN() {
        return this.dN;
    }
    
    @Override
    public HashSet fa() {
        return new HashSet();
    }
    
    @Override
    public String toString() {
        return String.format("@%d", this.dN);
    }
}
