// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class wb
{
    private cN dN;
    
    public String dN(final int n, final int n2, final String s, final int n3) {
        final fv dn = this.dN.mS().dN(n, n2, s);
        String dn2 = null;
        if (n3 != 0) {
            dn2 = ((sm)this.dN().wU().dN(n3).ld().wU()).dN(dn);
        }
        return (dn2 != null) ? dn2 : dn.fa();
    }
    
    public cN dN() {
        if (this.dN == null) {
            throw new zX();
        }
        return this.dN;
    }
    
    public void dN(final cN dn) {
        this.dN = dn;
    }
}
