package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import jebglobal.AR;

public final class vD {
   private int[] dN;
   private HashMap ld;
   private HashMap QE;
   private HashMap wU;
   private HashMap fa;
   private HashSet zs;
   private HashSet mS;
   private HashMap OK;

   private vD(int var1) {
      this.dN = new int[var1];
      this.ld = new HashMap();
      this.QE = new HashMap();
      this.wU = new HashMap();
      this.fa = new HashMap();
      this.zs = new HashSet();
      this.mS = new HashSet();
      this.OK = new HashMap();
   }

   public vD.uK dN(int var1) {
      vD.uK var2 = new vD.uK();
      Integer var3 = (Integer)this.ld.get(Integer.valueOf(var1));
      var2.dN = var3 == null?-1:var3.intValue();
      var2.ld = (List)this.QE.get(Integer.valueOf(var1));
      var2.QE = this.zs.contains(Integer.valueOf(var1));
      var2.wU = this.mS.contains(Integer.valueOf(var1));
      var3 = (Integer)this.OK.get(Integer.valueOf(var1));
      var2.fa = var3 == null?-1:var3.intValue();
      return var2;
   }

   public int[] dN() {
      return this.dN;
   }

   static vD dN(byte[] var0, int var1, int var2) {
      int[] var4 = new int[1];
      int var5 = AR.ld(var0, var1, var4);
      int var3 = var1 + var4[0];
      int var6 = AR.ld(var0, var3, var4);
      var3 += var4[0];
      vD var7 = new vD(var6);

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7.dN[var8] = AR.QE(var0, var3, var4);
         var3 += var4[0];
      }

      var8 = 0;
      int var9 = var5;
      int var10 = -2;
      boolean var11 = false;
      boolean var12 = false;

      while(true) {
         int var13 = var0[var3] & 255;
         ++var3;
         if(var13 == 0) {
            return var7;
         }

         int var14;
         if(var13 == 1) {
            var14 = AR.ld(var0, var3, var4);
            var3 += var4[0];
            var8 += var14;
         } else if(var13 == 2) {
            var14 = AR.dN(var0, var3, var4);
            var3 += var4[0];
            var9 += var14;
         } else {
            int var15;
            int var16;
            if(var13 == 3) {
               var14 = AR.ld(var0, var3, var4);
               var3 += var4[0];
               var15 = AR.QE(var0, var3, var4);
               var3 += var4[0];
               var16 = AR.QE(var0, var3, var4);
               var3 += var4[0];
               dN(var7, new vD.vd(var8, var14, var15, var16, -1));
            } else if(var13 == 4) {
               var14 = AR.ld(var0, var3, var4);
               var3 += var4[0];
               var15 = AR.QE(var0, var3, var4);
               var3 += var4[0];
               var16 = AR.QE(var0, var3, var4);
               var3 += var4[0];
               int var17 = AR.QE(var0, var3, var4);
               var3 += var4[0];
               dN(var7, new vD.vd(var8, var14, var15, var16, var17));
            } else {
               Object var18;
               if(var13 == 5) {
                  var14 = AR.ld(var0, var3, var4);
                  var3 += var4[0];
                  var18 = (List)var7.wU.get(Integer.valueOf(var8));
                  if(var18 == null) {
                     var18 = new ArrayList();
                     var7.wU.put(Integer.valueOf(var8), var18);
                  }

                  ((List)var18).add(Integer.valueOf(var14));
               } else if(var13 == 6) {
                  var14 = AR.ld(var0, var3, var4);
                  var3 += var4[0];
                  var18 = (List)var7.fa.get(Integer.valueOf(var8));
                  if(var18 == null) {
                     var18 = new ArrayList();
                     var7.fa.put(Integer.valueOf(var8), var18);
                  }

                  ((List)var18).add(Integer.valueOf(var14));
               } else if(var13 == 7) {
                  var11 = true;
               } else if(var13 == 8) {
                  var12 = true;
               } else if(var13 == 9) {
                  var14 = AR.QE(var0, var3, var4);
                  var3 += var4[0];
                  var10 = var14;
               } else {
                  var13 -= 10;
                  var9 += -4 + var13 % 15;
                  var8 += var13 / 15;
                  var7.ld.put(Integer.valueOf(var8), Integer.valueOf(var9));
                  if(var11) {
                     var7.zs.add(Integer.valueOf(var8));
                     var11 = false;
                  }

                  if(var12) {
                     var7.mS.add(Integer.valueOf(var8));
                     var12 = false;
                  }

                  if(var10 >= -1) {
                     var7.OK.put(Integer.valueOf(var8), Integer.valueOf(var10));
                     var10 = -2;
                  }
               }
            }
         }
      }
   }

   private static void dN(vD var0, vD.vd var1) {
      Object var2 = (List)var0.QE.get(Integer.valueOf(var1.dN));
      if(var2 == null) {
         var2 = new ArrayList();
         var0.QE.put(Integer.valueOf(var1.dN), var2);
      }

      ((List)var2).add(var1);
   }

   public static class uK {
      public int dN;
      public List ld;
      public boolean QE;
      public boolean wU;
      public int fa;
   }

   public static class vd {
      private int dN;
      private int ld;
      private int QE;
      private int wU;
      private int fa;

      vd(int var1, int var2, int var3, int var4, int var5) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
         this.wU = var4;
         this.fa = var5;
      }

      public int dN() {
         return this.dN;
      }

      public int ld() {
         return this.ld;
      }

      public int QE() {
         return this.QE;
      }

      public int wU() {
         return this.wU;
      }

      public int fa() {
         return this.fa;
      }
   }
}
