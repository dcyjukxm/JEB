// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.Serializable;
import java.io.Writer;

public final class GV extends Writer implements Serializable
{
    private final StringBuilder dN;
    
    public GV() {
        this.dN = new StringBuilder();
    }
    
    public GV(final int n) {
        this.dN = new StringBuilder(n);
    }
    
    @Override
    public Writer append(final char c) {
        this.dN.append(c);
        return this;
    }
    
    @Override
    public Writer append(final CharSequence charSequence) {
        this.dN.append(charSequence);
        return this;
    }
    
    @Override
    public Writer append(final CharSequence charSequence, final int n, final int n2) {
        this.dN.append(charSequence, n, n2);
        return this;
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void write(final String s) {
        if (s != null) {
            this.dN.append(s);
        }
    }
    
    @Override
    public void write(final char[] array, final int n, final int n2) {
        if (array != null) {
            this.dN.append(array, n, n2);
        }
    }
    
    @Override
    public String toString() {
        return this.dN.toString();
    }
}
