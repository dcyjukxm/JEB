// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class MS extends fv
{
    private final boolean dN;
    
    public MS(final boolean dn, final String s) {
        super("bool", s);
        this.dN = dn;
    }
    
    @Override
    protected String dN() {
        return this.dN ? "true" : "false";
    }
}
