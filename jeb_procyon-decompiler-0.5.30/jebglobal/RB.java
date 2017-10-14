// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.OutputStream;

public final class RB extends OutputStream
{
    private static final byte[] dN;
    private final List ld;
    private int QE;
    private int wU;
    private byte[] fa;
    private int zs;
    
    public RB() {
        this(1024);
    }
    
    public RB(final int n) {
        this.ld = new ArrayList();
        if (n < 0) {
            throw new IllegalArgumentException("Negative initial size: " + n);
        }
        synchronized (this) {
            this.dN(n);
        }
    }
    
    private void dN(final int n) {
        if (this.QE < this.ld.size() - 1) {
            this.wU += this.fa.length;
            ++this.QE;
            this.fa = this.ld.get(this.QE);
        }
        else {
            int max;
            if (this.fa == null) {
                max = n;
                this.wU = 0;
            }
            else {
                max = Math.max(this.fa.length << 1, n - this.wU);
                this.wU += this.fa.length;
            }
            ++this.QE;
            this.fa = new byte[max];
            this.ld.add(this.fa);
        }
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        if (n < 0 || n > array.length || n2 < 0 || n + n2 > array.length || n + n2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 == 0) {
            return;
        }
        synchronized (this) {
            final int zs = this.zs + n2;
            int i = n2;
            int n3 = this.zs - this.wU;
            while (i > 0) {
                final int min = Math.min(i, this.fa.length - n3);
                System.arraycopy(array, n + n2 - i, this.fa, n3, min);
                i -= min;
                if (i > 0) {
                    this.dN(zs);
                    n3 = 0;
                }
            }
            this.zs = zs;
        }
    }
    
    @Override
    public synchronized void write(final int n) {
        int n2 = this.zs - this.wU;
        if (n2 == this.fa.length) {
            this.dN(this.zs + 1);
            n2 = 0;
        }
        this.fa[n2] = (byte)n;
        ++this.zs;
    }
    
    @Override
    public void close() {
    }
    
    public synchronized byte[] dN() {
        int zs = this.zs;
        if (zs == 0) {
            return RB.dN;
        }
        final byte[] array = new byte[zs];
        int n = 0;
        for (final byte[] array2 : this.ld) {
            final int min = Math.min(array2.length, zs);
            System.arraycopy(array2, 0, array, n, min);
            n += min;
            zs -= min;
            if (zs == 0) {
                break;
            }
        }
        return array;
    }
    
    @Override
    public String toString() {
        return new String(this.dN());
    }
    
    static {
        dN = new byte[0];
    }
}
