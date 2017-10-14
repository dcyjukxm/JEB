// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.OutputStream;

final class OF extends OutputStream
{
    private StringBuilder dN;
    
    public OF(final StringBuilder dn) {
        this.dN = dn;
    }
    
    @Override
    public void write(final int n) {
        this.dN.append((char)n);
    }
}
