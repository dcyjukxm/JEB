package jebglobal;

import jebglobal.AR;
import jebglobal.ub;

public final class kg {
   private int dN;
   private kg.uK[] ld;

   private kg(int var1, int var2) {
      this.dN = var1;
      this.ld = new kg.uK[var2];
   }

   public int dN() {
      return this.dN;
   }

   public kg.uK[] ld() {
      return this.ld;
   }

   static kg dN(byte[] var0, int var1, int[] var2) {
      int[] var3 = new int[1];
      int var5 = AR.ld(var0, var1, var3);
      int var4 = var1 + var3[0];
      int var6 = AR.ld(var0, var4, var3);
      var4 += var3[0];
      kg var7 = new kg(var5, var6);

      for(int var8 = 0; var8 < var6; ++var8) {
         int var9 = AR.ld(var0, var4, var3);
         var4 += var3[0];
         ub var10 = ub.dN(var0, var4, var3);
         var4 += var3[0];
         kg.uK var11 = new kg.uK(var9, var10);
         var7.ld[var8] = var11;
      }

      var2[0] = var4 - var1;
      return var7;
   }

   public static class uK {
      private int dN;
      private ub ld;

      uK(int var1, ub var2) {
         this.dN = var1;
         this.ld = var2;
      }

      public int dN() {
         return this.dN;
      }

      public ub ld() {
         return this.ld;
      }
   }
}
