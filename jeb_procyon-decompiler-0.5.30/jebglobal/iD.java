// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public class iD extends YJ
{
    private Object dN;
    
    public iD(final int n, final int n2, final Zh zh, final int n3, final Object dn) {
        super(n, n2, zh, n3);
        if (dn == null) {
            throw new RuntimeException();
        }
        this.dN = dn;
    }
    
    @Override
    public Object zs() {
        return this.dN;
    }
}
