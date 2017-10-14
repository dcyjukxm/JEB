// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class fa extends ED
{
    private final String dN;
    
    public fa(final String dn) {
        this.dN = dn;
    }
    
    public String dN() {
        if (!this.dN.startsWith("res/")) {
            throw new zX();
        }
        return this.dN.substring(4);
    }
}
