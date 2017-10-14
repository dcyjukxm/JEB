// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;

public final class UW
{
    private final tz dN;
    private final String ld;
    private final cN QE;
    private final Me wU;
    private final Map fa;
    
    public UW(final tz dn, final String ld, final cN qe, final Me wu) {
        this.fa = new LinkedHashMap();
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
    }
    
    public Set dN() {
        return new LinkedHashSet(this.fa.values());
    }
    
    public dx dN(final Ja ja) {
        final dx dx = this.fa.get(ja);
        if (dx == null) {
            throw new Gd();
        }
        return dx;
    }
    
    public dx ld() {
        return this.dN(new Ja());
    }
    
    public boolean QE() {
        return this.fa.containsKey(new Ja());
    }
    
    public String dN(final cN cn, final boolean b) {
        return this.dN(this.zs().equals(cn), b);
    }
    
    public String dN(final boolean b, final boolean b2) {
        return (b ? "" : (this.zs().zs() + ":")) + (b2 ? "" : (this.mS().dN() + "/")) + this.fa();
    }
    
    public tz wU() {
        return this.dN;
    }
    
    public String fa() {
        return this.ld;
    }
    
    public cN zs() {
        return this.QE;
    }
    
    public Me mS() {
        return this.wU;
    }
    
    public void dN(final dx dx) {
        this.dN(dx, false);
    }
    
    public void dN(final dx dx, final boolean b) {
        final Ja dn = dx.ld().dN();
        if (this.fa.containsKey(dn) && !b) {
            return;
        }
        this.fa.put(dn, dx);
    }
    
    @Override
    public String toString() {
        return this.dN.toString() + " " + this.wU.toString() + "/" + this.ld;
    }
}
