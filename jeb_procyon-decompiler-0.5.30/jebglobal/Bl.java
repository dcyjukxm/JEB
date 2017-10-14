// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.OutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class Bl
{
    private final Map dN;
    
    public Bl() {
        this.dN = new HashMap();
    }
    
    public void dN(final InputStream inputStream, final OutputStream outputStream, final String s) {
        this.dN(s).dN(inputStream, outputStream);
    }
    
    public Zq dN(final String s) {
        final Zq zq = this.dN.get(s);
        if (zq == null) {
            throw new zX();
        }
        return zq;
    }
    
    public void dN(final String s, final Zq zq) {
        this.dN.put(s, zq);
    }
}
