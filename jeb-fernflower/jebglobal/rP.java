package jebglobal;

public final class rP {
   private byte[] dN;
   private int ld;
   private int QE;

   public static String dN(byte[] var0, int var1, int var2) {
      return (new rP(var0, var1, var2)).dN();
   }

   rP(byte[] var1, int var2, int var3) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
   }

   String dN() {
      if(this.dN == null) {
         throw new RuntimeException();
      } else if(this.ld != 0 && this.dN.length != 0) {
         int var1;
         byte[] var2;
         int var4;
         if(this.ld == 1) {
            var1 = this.dN.length;
            var2 = new byte[var1];
            byte var6 = (byte)this.QE;

            for(var4 = 0; var4 < var1; ++var4) {
               var2[var4] = (byte)(var6 ^ this.dN[var4]);
               var6 = var2[var4];
            }

            return new String(var2);
         } else if(this.ld != 2) {
            throw new RuntimeException();
         } else {
            var1 = this.dN.length;
            var2 = new byte[var1];
            String var3 = "Copyright (c) 1993, 2013, Oracle and/or its affiliates. All rights reserved.";
            var4 = 0;

            for(int var5 = 0; var5 < var1; ++var5) {
               var2[var5] = (byte)(this.dN[var5] ^ (byte)var3.charAt(var4));
               var4 = (var4 + 1) % var3.length();
            }

            return new String(var2);
         }
      } else {
         return new String(this.dN);
      }
   }
}
