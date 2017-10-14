package jebglobal;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;

public final class OZ implements DataInput {
   private DataInputStream dN;
   private InputStream ld;
   private byte[] QE;

   public OZ(InputStream var1) {
      this.ld = var1;
      this.dN = new DataInputStream(var1);
      this.QE = new byte[8];
   }

   public final void dN() {
      this.dN.close();
   }

   public final int dN(byte[] var1, int var2, int var3) {
      return this.ld.read(var1, var2, var3);
   }

   public final boolean readBoolean() {
      return this.dN.readBoolean();
   }

   public final byte readByte() {
      return this.dN.readByte();
   }

   public final char readChar() {
      this.dN.readFully(this.QE, 0, 2);
      return (char)((this.QE[1] & 255) << 8 | this.QE[0] & 255);
   }

   public final double readDouble() {
      return Double.longBitsToDouble(this.readLong());
   }

   public final float readFloat() {
      return Float.intBitsToFloat(this.readInt());
   }

   public final void readFully(byte[] var1) {
      this.dN.readFully(var1, 0, var1.length);
   }

   public final void readFully(byte[] var1, int var2, int var3) {
      this.dN.readFully(var1, var2, var3);
   }

   public final int readInt() {
      this.dN.readFully(this.QE, 0, 4);
      return this.QE[3] << 24 | (this.QE[2] & 255) << 16 | (this.QE[1] & 255) << 8 | this.QE[0] & 255;
   }

   public final String readLine() {
      return this.dN.readLine();
   }

   public final long readLong() {
      this.dN.readFully(this.QE, 0, 8);
      return (long)this.QE[7] << 56 | (long)(this.QE[6] & 255) << 48 | (long)(this.QE[5] & 255) << 40 | (long)(this.QE[4] & 255) << 32 | (long)(this.QE[3] & 255) << 24 | (long)(this.QE[2] & 255) << 16 | (long)(this.QE[1] & 255) << 8 | (long)(this.QE[0] & 255);
   }

   public final short readShort() {
      this.dN.readFully(this.QE, 0, 2);
      return (short)((this.QE[1] & 255) << 8 | this.QE[0] & 255);
   }

   public final String readUTF() {
      return this.dN.readUTF();
   }

   public final int readUnsignedByte() {
      return this.dN.readUnsignedByte();
   }

   public final int readUnsignedShort() {
      this.dN.readFully(this.QE, 0, 2);
      return (this.QE[1] & 255) << 8 | this.QE[0] & 255;
   }

   public final int skipBytes(int var1) {
      return this.dN.skipBytes(var1);
   }
}
