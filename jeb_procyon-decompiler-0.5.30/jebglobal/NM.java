// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.LinkedHashMap;
import java.util.Map;

public final class NM
{
    private final Ja dN;
    private final Map ld;
    
    public NM(final Ja dn) {
        this.ld = new LinkedHashMap();
        this.dN = dn;
    }
    
    public Ja dN() {
        return this.dN;
    }
    
    public void dN(final dx dx) {
        this.dN(dx, false);
    }
    
    public void dN(final dx dx, final boolean b) {
        final UW qe = dx.QE();
        if (this.ld.containsKey(qe) && !b) {
            return;
        }
        this.ld.put(qe, dx);
    }
    
    @Override
    public String toString() {
        return this.dN.toString();
    }
}
