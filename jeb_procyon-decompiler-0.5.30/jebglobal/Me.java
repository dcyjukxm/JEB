// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.LinkedHashMap;
import java.util.Map;

public final class Me
{
    private final String dN;
    private final Map ld;
    
    public Me(final String dn, final LP lp, final cN cn) {
        this.ld = new LinkedHashMap();
        this.dN = dn;
    }
    
    public String dN() {
        return this.dN;
    }
    
    public void dN(final UW uw) {
        if (this.ld.put(uw.fa(), uw) != null) {
            throw new zX();
        }
    }
    
    @Override
    public String toString() {
        return this.dN;
    }
}
