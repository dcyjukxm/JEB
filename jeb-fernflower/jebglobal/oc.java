package jebglobal;

import jebglobal.AR;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.hV;
import jebglobal.hY;
import jebglobal.nh;
import jebglobal.yK;
import jebglobal.zd;

public enum oc {
   XZ,
   nA,
   Ai,
   dN,
   uM,
   ld,
   QE,
   kq,
   wU,
   ir,
   fa,
   zs,
   mS,
   rF,
   OK,
   IL,
   LH,
   Db,
   KK,
   sC,
   EO,
   cb,
   PF,
   Hw,
   rK,
   jp,
   bU,
   Qg,
   uB,
   dY,
   Ux,
   ZY,
   Rm,
   nb,
   nI,
   s,
   My,
   kU,
   mD,
   Hv,
   VX,
   LV,
   ci,
   bG,
   BQ,
   uo,
   Ee,
   H,
   go,
   De,
   rn,
   LR,
   Nh;

   public static void dN(ZL var0, int var1, int var2) {
      dN(var0, var1, var2, hY.dN);
   }

   public static void ld(ZL var0, int var1, int var2) {
      dN(var0, var1, var2, hY.ld);
   }

   public static void QE(ZL var0, int var1, int var2) {
      dN(var0, var1, var2, hY.QE);
   }

   public static void dN(ZL var0, int var1, int var2, hY var3) {
      int[] var4 = new int[]{0};
      switch(oc.SyntheticClass_1.dN[var3.ordinal()]) {
      case 1:
         var1 &= 30239;
         break;
      case 2:
         var1 &= 204287;
         break;
      case 3:
         var1 &= 20703;
      }

      dN(var0, var4, var1, 1, nI);
      dN(var0, var4, var1, 2, Rm);
      dN(var0, var4, var1, 4, nb);
      dN(var0, var4, var1, 8, kU);
      dN(var0, var4, var1, 16, Db);
      dN(var0, var4, var1, 1024, XZ);
      dN(var0, var4, var1, 512, Qg);
      dN(var0, var4, var1, 16384, IL);
      dN(var0, var4, var1, 32, LV);
      if(var3 == hY.QE) {
         dN(var0, var4, var1, 64, go);
         dN(var0, var4, var1, 128, uo);
      } else if(var3 == hY.ld) {
         dN(var0, var4, var1, 64, (oc)null);
         dN(var0, var4, var1, 128, (oc)null);
      }

      dN(var0, var4, var1, 256, dY);
      dN(var0, var4, var1, 2048, mD);
      dN(var0, var4, var1, 4096, (oc)null);
      dN(var0, var4, var1, 8192, (oc)null);
      dN(var0, var4, var1, 65536, (oc)null);
      dN(var0, var4, var1, 131072, (oc)null);
      if(var2 == 1 || var2 == -1 && var4[0] > 0) {
         var0.wU(" ");
      }

   }

   private static void dN(ZL var0, int[] var1, int var2, int var3, oc var4) {
      if(var4 != null && (var2 & var3) != 0) {
         if(var1[0] > 0) {
            var0.wU(" ");
         }

         var0.dN(var4);
         ++var1[0];
      }

   }

   public static void dN(ZL var0, hV var1) {
      dN(var0, var1, false);
   }

   public static void dN(ZL var0, hV var1, boolean var2) {
      if(!var1.mS() && (!var1.OK() || !var1.QE().zs())) {
         hV var12 = var1;
         int var13 = 0;
         if(var1.OK()) {
            var12 = var1.QE();
            var13 = var1.ld();
         }

         if(var12 == hV.ld) {
            var0.dN(Ai);
         } else if(var12 == hV.QE) {
            var0.dN(uM);
         } else if(var12 == hV.wU) {
            var0.dN(kq);
         } else if(var12 == hV.fa) {
            var0.dN(My);
         } else if(var12 == hV.zs) {
            var0.dN(bU);
         } else if(var12 == hV.mS) {
            var0.dN(uB);
         } else if(var12 == hV.OK) {
            var0.dN(sC);
         } else if(var12 == hV.LH) {
            var0.dN(rF);
         } else {
            if(var12 != hV.dN) {
               var0.wU(var1.toString());
               throw new RuntimeException();
            }

            var0.dN(H);
         }

         for(int var14 = 0; var14 < var13; ++var14) {
            var0.wU("[]");
         }
      } else {
         AR var3 = var0.OK;
         if(var3 == null) {
            var0.wU(var1.toString());
            return;
         }

         nh.vd var4 = (nh.vd)var3.mS().dN(var1.KK());
         if(var4 == null) {
            var0.wU(var1.toString());
            return;
         }

         String var5 = var4.dN(true);
         nh.vd var6 = var4;
         if(var4.QE()) {
            var6 = (nh.vd)var3.mS().dN(var4.zs());
            if(var6 == null) {
               throw new RuntimeException();
            }

            var5 = var6.dN(true);
         }

         Object var7 = null;
         if(var6.ld()) {
            zd var8 = var0.dN();
            boolean var9 = true;
            if(var8 != null) {
               String var10;
               String var11;
               if(var6.mS()) {
                  if(var6.ld(false).equals("")) {
                     var9 = true;
                  } else {
                     var10 = var6.ld(true);
                     var11 = var8.dN(var10);
                     if(var11 == null || var11.equals(var5)) {
                        var8.dN(var10, var5);
                        var5 = var10;
                        var9 = false;
                     }
                  }
               } else {
                  var10 = var5.substring(var5.lastIndexOf(47) + 1);
                  var10 = var10.substring(0, var10.length() - 1);
                  var11 = var8.dN(var10);
                  if(var11 == null || var11.equals(var5)) {
                     var8.dN(var10, var5);
                     var5 = var10;
                     var9 = false;
                  }
               }
            }

            if(var9) {
               var5 = var5.substring(1, var5.length() - 1).replace('/', '.');
            }

            var7 = var3.KK(var6.dN(false));
         }

         Zh var15 = var7 instanceof yK?Zh.rK:Zh.s;
         var0.dN(var5, var15, var2?1:0, var7, (Object)null);
         if(var4.QE()) {
            for(int var16 = 0; var16 < var4.wU(); ++var16) {
               var0.wU("[]");
            }
         }
      }

   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[hY.values().length];

      static {
         try {
            dN[hY.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            dN[hY.ld.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[hY.QE.ordinal()] = 3;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }
}
