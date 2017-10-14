// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public class Vp extends fv
{
    protected final int dN;
    
    public Vp(final int n, final String s) {
        this(n, s, "integer");
    }
    
    public Vp(final int dn, final String s, final String s2) {
        super(s2, s);
        this.dN = dn;
    }
    
    public int ld() {
        return this.dN;
    }
    
    @Override
    protected String dN() {
        return String.valueOf(this.dN);
    }
}
