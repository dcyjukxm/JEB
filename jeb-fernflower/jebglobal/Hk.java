package jebglobal;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.OutputStream;

public final class Hk implements DataOutput {
   private DataOutputStream dN;
   private byte[] ld;

   public Hk(OutputStream var1) {
      this.dN = new DataOutputStream(var1);
      this.ld = new byte[8];
   }

   public final void dN() {
      this.dN.close();
   }

   public final synchronized void write(int var1) {
      this.dN.write(var1);
   }

   public final void write(byte[] var1) {
      this.dN.write(var1, 0, var1.length);
   }

   public final synchronized void write(byte[] var1, int var2, int var3) {
      this.dN.write(var1, var2, var3);
   }

   public final void writeBoolean(boolean var1) {
      this.dN.writeBoolean(var1);
   }

   public final void writeByte(int var1) {
      this.dN.writeByte(var1);
   }

   public final void writeBytes(String var1) {
      this.dN.writeBytes(var1);
   }

   public final void writeChar(int var1) {
      this.ld[0] = (byte)var1;
      this.ld[1] = (byte)(var1 >> 8);
      this.dN.write(this.ld, 0, 2);
   }

   public final void writeChars(String var1) {
      int var2 = var1.length();

      for(int var3 = 0; var3 < var2; ++var3) {
         this.writeChar(var1.charAt(var3));
      }

   }

   public final void writeDouble(double var1) {
      this.writeLong(Double.doubleToLongBits(var1));
   }

   public final void writeFloat(float var1) {
      this.writeInt(Float.floatToIntBits(var1));
   }

   public final void writeInt(int var1) {
      this.ld[0] = (byte)var1;
      this.ld[1] = (byte)(var1 >> 8);
      this.ld[2] = (byte)(var1 >> 16);
      this.ld[3] = (byte)(var1 >> 24);
      this.dN.write(this.ld, 0, 4);
   }

   public final void writeLong(long var1) {
      this.ld[0] = (byte)((int)var1);
      this.ld[1] = (byte)((int)(var1 >> 8));
      this.ld[2] = (byte)((int)(var1 >> 16));
      this.ld[3] = (byte)((int)(var1 >> 24));
      this.ld[4] = (byte)((int)(var1 >> 32));
      this.ld[5] = (byte)((int)(var1 >> 40));
      this.ld[6] = (byte)((int)(var1 >> 48));
      this.ld[7] = (byte)((int)(var1 >> 56));
      this.dN.write(this.ld, 0, 8);
   }

   public final void writeShort(int var1) {
      this.ld[0] = (byte)var1;
      this.ld[1] = (byte)(var1 >> 8);
      this.dN.write(this.ld, 0, 2);
   }

   public final void writeUTF(String var1) {
      this.dN.writeUTF(var1);
   }
}
