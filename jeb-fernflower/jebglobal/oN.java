package jebglobal;

import java.io.DataInput;

public abstract class oN implements DataInput {
   private DataInput dN;

   public oN(DataInput var1) {
      this.dN = var1;
   }

   public int skipBytes(int var1) {
      return this.dN.skipBytes(var1);
   }

   public int readUnsignedShort() {
      return this.dN.readUnsignedShort();
   }

   public int readUnsignedByte() {
      return this.dN.readUnsignedByte();
   }

   public String readUTF() {
      return this.dN.readUTF();
   }

   public short readShort() {
      return this.dN.readShort();
   }

   public long readLong() {
      return this.dN.readLong();
   }

   public String readLine() {
      return this.dN.readLine();
   }

   public int readInt() {
      return this.dN.readInt();
   }

   public void readFully(byte[] var1, int var2, int var3) {
      this.dN.readFully(var1, var2, var3);
   }

   public void readFully(byte[] var1) {
      this.dN.readFully(var1);
   }

   public float readFloat() {
      return this.dN.readFloat();
   }

   public double readDouble() {
      return this.dN.readDouble();
   }

   public char readChar() {
      return this.dN.readChar();
   }

   public byte readByte() {
      return this.dN.readByte();
   }

   public boolean readBoolean() {
      return this.dN.readBoolean();
   }
}
