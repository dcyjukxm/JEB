package jebglobal;

import jebglobal.ME;

public enum CQ {
   dN,
   ld,
   QE,
   wU,
   fa,
   zs,
   mS,
   OK,
   LH,
   KK,
   EO,
   cb,
   PF,
   Hw,
   rK,
   Ux,
   ZY,
   s,
   Hv,
   VX,
   ci,
   bG,
   BQ,
   Ee,
   De,
   rn,
   LR,
   Nh,
   XZ,
   nA,
   Ai,
   uM,
   kq,
   ir,
   rF,
   IL,
   Db,
   sC,
   jp,
   bU,
   Qg,
   uB,
   dY,
   Rm,
   nb,
   nI,
   My,
   kU,
   mD,
   LV,
   uo,
   H,
   go,
   BP,
   bL,
   U;

   public static void dN(ME var0, int var1, int var2) {
      int[] var3 = new int[]{0};
      dN(var0, var3, var1, 1, jp);
      dN(var0, var3, var1, 2, Db);
      dN(var0, var3, var1, 4, sC);
      dN(var0, var3, var1, 8, uB);
      dN(var0, var3, var1, 16, bG);
      dN(var0, var3, var1, 1024, dN);
      dN(var0, var3, var1, 512, uM);
      dN(var0, var3, var1, 16384, VX);
      dN(var0, var3, var1, 32, nI);
      dN(var0, var3, var1, 64, bL);
      dN(var0, var3, var1, 64, zs);
      dN(var0, var3, var1, 128, uo);
      dN(var0, var3, var1, 128, go);
      dN(var0, var3, var1, 256, ir);
      dN(var0, var3, var1, 2048, dY);
      dN(var0, var3, var1, 4096, My);
      dN(var0, var3, var1, 8192, ld);
      dN(var0, var3, var1, 65536, PF);
      dN(var0, var3, var1, 131072, rK);
      if(var2 == 1 || var2 == -1 && var3[0] > 0) {
         var0.wU(" ");
      }

   }

   private static void dN(ME var0, int[] var1, int var2, int var3, CQ var4) {
      if(var4 != null && (var2 & var3) != 0) {
         if(var1[0] > 0) {
            var0.wU(" ");
         }

         var0.dN(var4);
         ++var1[0];
      }

   }
}
