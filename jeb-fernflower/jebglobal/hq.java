package jebglobal;

import java.io.DataInput;
import java.io.IOException;
import jebglobal.oN;

public final class hq extends oN {
   public hq(DataInput var1) {
      super(var1);
   }

   public int[] dN(int var1) {
      int[] var2 = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = this.readInt();
      }

      return var2;
   }

   public void dN() {
      this.skipBytes(4);
   }

   public void ld(int var1) {
      int var2 = this.readInt();
      if(var2 != var1) {
         throw new IOException();
      }
   }

   public void dN(short var1) {
      short var2 = this.readShort();
      if(var2 != var1) {
         throw new IOException();
      }
   }

   public void dN(byte var1) {
      byte var2 = this.readByte();
      if(var2 != var1) {
         throw new IOException();
      }
   }

   public String dN(int var1, boolean var2) {
      StringBuilder var3 = new StringBuilder(16);

      while(var1-- != 0) {
         short var4 = this.readShort();
         if(var4 == 0) {
            break;
         }

         var3.append((char)var4);
      }

      if(var2) {
         this.skipBytes(var1 * 2);
      }

      return var3.toString();
   }
}
