// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.InputStream;

public final class MR extends ca
{
    private long dN;
    
    public MR(final InputStream inputStream) {
        super(inputStream);
    }
    
    @Override
    public synchronized long skip(final long n) {
        final long skip = super.skip(n);
        this.dN += skip;
        return skip;
    }
    
    @Override
    protected synchronized void dN(final int n) {
        if (n != -1) {
            this.dN += n;
        }
    }
    
    public int dN() {
        final long ld = this.ld();
        if (ld > 2147483647L) {
            throw new ArithmeticException("The byte count " + ld + " is too large to be converted to an int");
        }
        return (int)ld;
    }
    
    public synchronized long ld() {
        return this.dN;
    }
}
