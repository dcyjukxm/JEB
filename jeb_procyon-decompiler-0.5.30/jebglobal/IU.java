// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class IU extends fv
{
    private final float dN;
    
    public IU(final float dn, final String s) {
        super("float", s);
        this.dN = dn;
    }
    
    @Override
    protected String dN() {
        return String.valueOf(this.dN);
    }
}
