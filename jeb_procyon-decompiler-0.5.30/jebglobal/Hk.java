// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.DataOutput;

public final class Hk implements DataOutput
{
    private DataOutputStream dN;
    private byte[] ld;
    
    public Hk(final OutputStream outputStream) {
        this.dN = new DataOutputStream(outputStream);
        this.ld = new byte[8];
    }
    
    public final void dN() {
        this.dN.close();
    }
    
    @Override
    public final synchronized void write(final int n) {
        this.dN.write(n);
    }
    
    @Override
    public final void write(final byte[] array) {
        this.dN.write(array, 0, array.length);
    }
    
    @Override
    public final synchronized void write(final byte[] array, final int n, final int n2) {
        this.dN.write(array, n, n2);
    }
    
    @Override
    public final void writeBoolean(final boolean b) {
        this.dN.writeBoolean(b);
    }
    
    @Override
    public final void writeByte(final int n) {
        this.dN.writeByte(n);
    }
    
    @Override
    public final void writeBytes(final String s) {
        this.dN.writeBytes(s);
    }
    
    @Override
    public final void writeChar(final int n) {
        this.ld[0] = (byte)n;
        this.ld[1] = (byte)(n >> 8);
        this.dN.write(this.ld, 0, 2);
    }
    
    @Override
    public final void writeChars(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            this.writeChar(s.charAt(i));
        }
    }
    
    @Override
    public final void writeDouble(final double n) {
        this.writeLong(Double.doubleToLongBits(n));
    }
    
    @Override
    public final void writeFloat(final float n) {
        this.writeInt(Float.floatToIntBits(n));
    }
    
    @Override
    public final void writeInt(final int n) {
        this.ld[0] = (byte)n;
        this.ld[1] = (byte)(n >> 8);
        this.ld[2] = (byte)(n >> 16);
        this.ld[3] = (byte)(n >> 24);
        this.dN.write(this.ld, 0, 4);
    }
    
    @Override
    public final void writeLong(final long n) {
        this.ld[0] = (byte)n;
        this.ld[1] = (byte)(n >> 8);
        this.ld[2] = (byte)(n >> 16);
        this.ld[3] = (byte)(n >> 24);
        this.ld[4] = (byte)(n >> 32);
        this.ld[5] = (byte)(n >> 40);
        this.ld[6] = (byte)(n >> 48);
        this.ld[7] = (byte)(n >> 56);
        this.dN.write(this.ld, 0, 8);
    }
    
    @Override
    public final void writeShort(final int n) {
        this.ld[0] = (byte)n;
        this.ld[1] = (byte)(n >> 8);
        this.dN.write(this.ld, 0, 2);
    }
    
    @Override
    public final void writeUTF(final String s) {
        this.dN.writeUTF(s);
    }
}
