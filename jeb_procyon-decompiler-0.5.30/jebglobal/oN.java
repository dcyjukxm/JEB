// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.DataInput;

public abstract class oN implements DataInput
{
    private DataInput dN;
    
    public oN(final DataInput dn) {
        this.dN = dn;
    }
    
    @Override
    public int skipBytes(final int n) {
        return this.dN.skipBytes(n);
    }
    
    @Override
    public int readUnsignedShort() {
        return this.dN.readUnsignedShort();
    }
    
    @Override
    public int readUnsignedByte() {
        return this.dN.readUnsignedByte();
    }
    
    @Override
    public String readUTF() {
        return this.dN.readUTF();
    }
    
    @Override
    public short readShort() {
        return this.dN.readShort();
    }
    
    @Override
    public long readLong() {
        return this.dN.readLong();
    }
    
    @Override
    public String readLine() {
        return this.dN.readLine();
    }
    
    @Override
    public int readInt() {
        return this.dN.readInt();
    }
    
    @Override
    public void readFully(final byte[] array, final int n, final int n2) {
        this.dN.readFully(array, n, n2);
    }
    
    @Override
    public void readFully(final byte[] array) {
        this.dN.readFully(array);
    }
    
    @Override
    public float readFloat() {
        return this.dN.readFloat();
    }
    
    @Override
    public double readDouble() {
        return this.dN.readDouble();
    }
    
    @Override
    public char readChar() {
        return this.dN.readChar();
    }
    
    @Override
    public byte readByte() {
        return this.dN.readByte();
    }
    
    @Override
    public boolean readBoolean() {
        return this.dN.readBoolean();
    }
}
