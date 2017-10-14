// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.DataInput;

public final class hq extends oN
{
    public hq(final DataInput dataInput) {
        super(dataInput);
    }
    
    public int[] dN(final int n) {
        final int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = this.readInt();
        }
        return array;
    }
    
    public void dN() {
        this.skipBytes(4);
    }
    
    public void ld(final int n) {
        if (this.readInt() != n) {
            throw new IOException();
        }
    }
    
    public void dN(final short n) {
        if (this.readShort() != n) {
            throw new IOException();
        }
    }
    
    public void dN(final byte b) {
        if (this.readByte() != b) {
            throw new IOException();
        }
    }
    
    public String dN(int n, final boolean b) {
        final StringBuilder sb = new StringBuilder(16);
        while (n-- != 0) {
            final short short1 = this.readShort();
            if (short1 == 0) {
                break;
            }
            sb.append((char)short1);
        }
        if (b) {
            this.skipBytes(n * 2);
        }
        return sb.toString();
    }
}
