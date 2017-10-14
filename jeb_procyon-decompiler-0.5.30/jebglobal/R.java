// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class R extends iD
{
    private Object dN;
    
    public R(final int n, final int n2, final Zh zh, final int n3, final Object o, final Object dn) {
        super(n, n2, zh, n3, o);
        if (dn == null) {
            throw new RuntimeException();
        }
        this.dN = dn;
    }
    
    @Override
    public Object mS() {
        return this.dN;
    }
}
