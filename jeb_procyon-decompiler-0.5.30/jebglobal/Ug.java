// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.LinkedHashSet;
import java.util.Set;

public final class Ug
{
    private final cN dN;
    private final Me ld;
    private final NM QE;
    private final Set wU;
    
    public Ug(final cN dn, final Me ld, final NM qe) {
        this.wU = new LinkedHashSet();
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
    }
    
    public String dN() {
        return "values" + this.QE.dN().dN() + "/" + this.ld.dN() + (this.ld.dN().endsWith("s") ? "" : "s") + ".xml";
    }
    
    public Set ld() {
        return this.wU;
    }
    
    public boolean dN(final dx dx) {
        return this.dN.QE(dx.QE().wU());
    }
    
    public void ld(final dx dx) {
        this.wU.add(dx);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final Ug ug = (Ug)o;
        return (this.ld == ug.ld || (this.ld != null && this.ld.equals(ug.ld))) && (this.QE == ug.QE || (this.QE != null && this.QE.equals(ug.QE)));
    }
    
    @Override
    public int hashCode() {
        return 37 * (185 + ((this.ld != null) ? this.ld.hashCode() : 0)) + ((this.QE != null) ? this.QE.hashCode() : 0);
    }
}
