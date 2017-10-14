// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.InputStream;
import java.io.DataInputStream;
import java.io.DataInput;

public final class OZ implements DataInput
{
    private DataInputStream dN;
    private InputStream ld;
    private byte[] QE;
    
    public OZ(final InputStream ld) {
        this.ld = ld;
        this.dN = new DataInputStream(ld);
        this.QE = new byte[8];
    }
    
    public final void dN() {
        this.dN.close();
    }
    
    public final int dN(final byte[] array, final int n, final int n2) {
        return this.ld.read(array, n, n2);
    }
    
    @Override
    public final boolean readBoolean() {
        return this.dN.readBoolean();
    }
    
    @Override
    public final byte readByte() {
        return this.dN.readByte();
    }
    
    @Override
    public final char readChar() {
        this.dN.readFully(this.QE, 0, 2);
        return (char)((this.QE[1] & 0xFF) << 8 | (this.QE[0] & 0xFF));
    }
    
    @Override
    public final double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }
    
    @Override
    public final float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }
    
    @Override
    public final void readFully(final byte[] array) {
        this.dN.readFully(array, 0, array.length);
    }
    
    @Override
    public final void readFully(final byte[] array, final int n, final int n2) {
        this.dN.readFully(array, n, n2);
    }
    
    @Override
    public final int readInt() {
        this.dN.readFully(this.QE, 0, 4);
        return this.QE[3] << 24 | (this.QE[2] & 0xFF) << 16 | (this.QE[1] & 0xFF) << 8 | (this.QE[0] & 0xFF);
    }
    
    @Override
    public final String readLine() {
        return this.dN.readLine();
    }
    
    @Override
    public final long readLong() {
        this.dN.readFully(this.QE, 0, 8);
        return this.QE[7] << 56 | (this.QE[6] & 0xFF) << 48 | (this.QE[5] & 0xFF) << 40 | (this.QE[4] & 0xFF) << 32 | (this.QE[3] & 0xFF) << 24 | (this.QE[2] & 0xFF) << 16 | (this.QE[1] & 0xFF) << 8 | (this.QE[0] & 0xFF);
    }
    
    @Override
    public final short readShort() {
        this.dN.readFully(this.QE, 0, 2);
        return (short)((this.QE[1] & 0xFF) << 8 | (this.QE[0] & 0xFF));
    }
    
    @Override
    public final String readUTF() {
        return this.dN.readUTF();
    }
    
    @Override
    public final int readUnsignedByte() {
        return this.dN.readUnsignedByte();
    }
    
    @Override
    public final int readUnsignedShort() {
        this.dN.readFully(this.QE, 0, 2);
        return (this.QE[1] & 0xFF) << 8 | (this.QE[0] & 0xFF);
    }
    
    @Override
    public final int skipBytes(final int n) {
        return this.dN.skipBytes(n);
    }
}
