// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public abstract class ca extends FilterInputStream
{
    public ca(final InputStream inputStream) {
        super(inputStream);
    }
    
    @Override
    public int read() {
        try {
            final int read = this.in.read();
            this.dN((read != -1) ? 1 : -1);
            return read;
        }
        catch (IOException ex) {
            this.dN(ex);
            return -1;
        }
    }
    
    @Override
    public int read(final byte[] array) {
        try {
            final int read = this.in.read(array);
            this.dN(read);
            return read;
        }
        catch (IOException ex) {
            this.dN(ex);
            return -1;
        }
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        try {
            final int read = this.in.read(array, n, n2);
            this.dN(read);
            return read;
        }
        catch (IOException ex) {
            this.dN(ex);
            return -1;
        }
    }
    
    @Override
    public long skip(final long n) {
        try {
            return this.in.skip(n);
        }
        catch (IOException ex) {
            this.dN(ex);
            return 0L;
        }
    }
    
    @Override
    public int available() {
        try {
            return super.available();
        }
        catch (IOException ex) {
            this.dN(ex);
            return 0;
        }
    }
    
    @Override
    public void close() {
        try {
            this.in.close();
        }
        catch (IOException ex) {
            this.dN(ex);
        }
    }
    
    @Override
    public synchronized void mark(final int n) {
        this.in.mark(n);
    }
    
    @Override
    public synchronized void reset() {
        try {
            this.in.reset();
        }
        catch (IOException ex) {
            this.dN(ex);
        }
    }
    
    @Override
    public boolean markSupported() {
        return this.in.markSupported();
    }
    
    protected void dN(final int n) {
    }
    
    protected void dN(final IOException ex) {
        throw ex;
    }
}
