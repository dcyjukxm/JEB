package jebglobal;

import jebglobal.AR;
import jebglobal.cn;
import jebglobal.kg;

public final class xd {
   private xd.vd dN = null;
   private xd.lX[] ld = null;
   private xd.eI[] QE = null;
   private xd.vn[] wU = null;

   public xd.vd dN() {
      return this.dN;
   }

   public xd.lX[] ld() {
      return this.ld;
   }

   public xd.eI[] QE() {
      return this.QE;
   }

   public xd.vn[] wU() {
      return this.wU;
   }

   static xd dN(byte[] var0, int var1) {
      int var2 = AR.ld(var0, var1);
      int var3 = AR.ld(var0, var1 + 4);
      int var4 = AR.ld(var0, var1 + 8);
      int var5 = AR.ld(var0, var1 + 12);
      xd var6 = new xd();
      if(var2 > 0) {
         var6.dN = xd.vd.dN(var0, var2);
      }

      int var7 = var1 + 16;
      var6.ld = new xd.lX[var3];

      int var8;
      int var9;
      int var10;
      xd.vd var11;
      for(var8 = 0; var8 < var3; ++var8) {
         var9 = AR.ld(var0, var7);
         var10 = AR.ld(var0, var7 + 4);
         var11 = xd.vd.dN(var0, var10);
         var6.ld[var8] = new xd.lX(var9, var11);
         var7 += 8;
      }

      var6.QE = new xd.eI[var4];

      for(var8 = 0; var8 < var4; ++var8) {
         var9 = AR.ld(var0, var7);
         var10 = AR.ld(var0, var7 + 4);
         var11 = xd.vd.dN(var0, var10);
         var6.QE[var8] = new xd.eI(var9, var11);
         var7 += 8;
      }

      var6.wU = new xd.vn[var5];

      for(var8 = 0; var8 < var5; ++var8) {
         var9 = AR.ld(var0, var7);
         var10 = AR.ld(var0, var7 + 4);
         int var15 = AR.ld(var0, var10);
         var6.wU[var8] = new xd.vn(var9, var15);

         for(int var12 = 0; var12 < var15; ++var12) {
            int var13 = AR.ld(var0, var10 + 4 + 4 * var12);
            xd.vd var14 = xd.vd.dN(var0, var13);
            var6.wU[var8].ld[var12] = var14;
         }

         var7 += 8;
      }

      return var6;
   }

   public static class vn {
      private int dN;
      private xd.vd[] ld;

      vn(int var1, int var2) {
         this.dN = var1;
         this.ld = new xd.vd[var2];
      }

      public int dN() {
         return this.dN;
      }

      public xd.vd[] ld() {
         return this.ld;
      }
   }

   public static class eI {
      private int dN;
      private xd.vd ld;

      eI(int var1, xd.vd var2) {
         this.dN = var1;
         this.ld = var2;
      }

      public int dN() {
         return this.dN;
      }

      public xd.vd ld() {
         return this.ld;
      }
   }

   public static class lX {
      private int dN;
      private xd.vd ld;

      lX(int var1, xd.vd var2) {
         this.dN = var1;
         this.ld = var2;
      }

      public int dN() {
         return this.dN;
      }

      public xd.vd ld() {
         return this.ld;
      }
   }

   public static class vd {
      private xd.uK[] dN;

      private vd(int var1) {
         this.dN = new xd.uK[var1];
      }

      public int dN() {
         return this.dN.length;
      }

      public xd.uK dN(int var1) {
         return this.dN[var1];
      }

      public xd.uK[] ld() {
         return this.dN;
      }

      static xd.vd dN(byte[] var0, int var1) {
         int var2 = AR.ld(var0, var1);
         xd.vd var3 = new xd.vd(var2);

         for(int var4 = 0; var4 < var2; ++var4) {
            int var5 = AR.ld(var0, var1 + 4 + 4 * var4);
            int var6 = var0[var5] & 255;
            if(var6 < 0 || var6 > 2) {
               cn.dN(String.format("Invalid visibility for annotation (%d), forcing to BUILD", new Object[]{Integer.valueOf(var6)}));
               var6 = 0;
            }

            int[] var7 = new int[1];
            kg var8 = kg.dN(var0, var5 + 1, var7);
            var3.dN[var4] = new xd.uK(var6, var8);
         }

         return var3;
      }
   }

   public static class uK {
      private int dN;
      private kg ld;

      uK(int var1, kg var2) {
         this.dN = var1;
         this.ld = var2;
      }

      public int dN() {
         return this.dN;
      }

      public kg ld() {
         return this.ld;
      }
   }
}
