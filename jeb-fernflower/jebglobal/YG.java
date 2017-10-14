package jebglobal;

import jebglobal.Nd;
import jebglobal.R;
import jebglobal.YJ;
import jebglobal.Zh;
import jebglobal.fc;
import jebglobal.hv;
import jebglobal.iD;
import jebglobal.jt;

public final class YG implements jt {
   private fc dN = null;

   public YG(fc var1) {
      this.dN = var1;
   }

   public void dN(fc var1) {
      this.dN = var1;
   }

   public YJ ld(int var1, int var2, Zh var3, int var4, Object var5, Object var6) {
      if(var2 <= 1023 && var1 <= 4095 && var4 >= 0 && var4 <= 7) {
         if(var5 == null) {
            if(var6 == null) {
               return this.dN(var1, var2, var3, var4);
            } else {
               throw new RuntimeException();
            }
         } else {
            return var6 == null?this.dN(var1, var2, var3, var4, var5):this.QE(var1, var2, var3, var4, var5, var6);
         }
      } else {
         return this.wU(var1, var2, var3, var4, var5, var6);
      }
   }

   private YJ dN(int var1, int var2, Zh var3, int var4) {
      YJ var5 = new YJ(var1, var2, var3, var4);
      fc.uK var6 = dN(var3);
      var5.dN(this.dN.dN(var6));
      var5.ld(this.dN.ld(var6));
      return var5;
   }

   private YJ dN(int var1, int var2, Zh var3, int var4, Object var5) {
      iD var6 = new iD(var1, var2, var3, var4, var5);
      fc.uK var7 = dN(var3);
      var6.dN(this.dN.dN(var7));
      var6.ld(this.dN.ld(var7));
      return var6;
   }

   private YJ QE(int var1, int var2, Zh var3, int var4, Object var5, Object var6) {
      R var7 = new R(var1, var2, var3, var4, var5, var6);
      fc.uK var8 = dN(var3);
      var7.dN(this.dN.dN(var8));
      var7.ld(this.dN.ld(var8));
      return var7;
   }

   private YJ wU(int var1, int var2, Zh var3, int var4, Object var5, Object var6) {
      Nd var7 = new Nd(var1, var2, var3, var4, var5, var6);
      fc.uK var8 = dN(var3);
      var7.dN(this.dN.dN(var8));
      var7.ld(this.dN.ld(var8));
      return var7;
   }

   private static fc.uK dN(Zh var0) {
      switch(YG.SyntheticClass_1.dN[var0.ordinal()]) {
      case 1:
         return fc.uK.dN;
      case 2:
         return fc.uK.ld;
      case 3:
         return fc.uK.QE;
      case 4:
         return fc.uK.wU;
      case 5:
         return fc.uK.fa;
      case 6:
         return fc.uK.zs;
      case 7:
         return fc.uK.mS;
      case 8:
         return fc.uK.OK;
      case 9:
         return fc.uK.LH;
      case 10:
         return fc.uK.KK;
      case 11:
         return fc.uK.EO;
      case 12:
         return fc.uK.cb;
      case 13:
         return fc.uK.PF;
      case 14:
         return fc.uK.Hw;
      case 15:
         return fc.uK.rK;
      case 16:
         return fc.uK.Ux;
      case 17:
         return fc.uK.ZY;
      case 18:
         return fc.uK.s;
      case 19:
         return fc.uK.Hv;
      case 20:
         return fc.uK.VX;
      case 21:
         return fc.uK.ci;
      case 22:
         return fc.uK.bG;
      default:
         return fc.uK.dN;
      }
   }

   // $FF: synthetic method
   public hv dN(int var1, int var2, Zh var3, int var4, Object var5, Object var6) {
      return this.ld(var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[Zh.values().length];

      static {
         try {
            dN[Zh.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var21) {
            ;
         }

         try {
            dN[Zh.ld.ordinal()] = 2;
         } catch (NoSuchFieldError var20) {
            ;
         }

         try {
            dN[Zh.QE.ordinal()] = 3;
         } catch (NoSuchFieldError var19) {
            ;
         }

         try {
            dN[Zh.wU.ordinal()] = 4;
         } catch (NoSuchFieldError var18) {
            ;
         }

         try {
            dN[Zh.fa.ordinal()] = 5;
         } catch (NoSuchFieldError var17) {
            ;
         }

         try {
            dN[Zh.zs.ordinal()] = 6;
         } catch (NoSuchFieldError var16) {
            ;
         }

         try {
            dN[Zh.mS.ordinal()] = 7;
         } catch (NoSuchFieldError var15) {
            ;
         }

         try {
            dN[Zh.OK.ordinal()] = 8;
         } catch (NoSuchFieldError var14) {
            ;
         }

         try {
            dN[Zh.LH.ordinal()] = 9;
         } catch (NoSuchFieldError var13) {
            ;
         }

         try {
            dN[Zh.KK.ordinal()] = 10;
         } catch (NoSuchFieldError var12) {
            ;
         }

         try {
            dN[Zh.EO.ordinal()] = 11;
         } catch (NoSuchFieldError var11) {
            ;
         }

         try {
            dN[Zh.cb.ordinal()] = 12;
         } catch (NoSuchFieldError var10) {
            ;
         }

         try {
            dN[Zh.PF.ordinal()] = 13;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            dN[Zh.Hw.ordinal()] = 14;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            dN[Zh.rK.ordinal()] = 15;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            dN[Zh.Ux.ordinal()] = 16;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            dN[Zh.ZY.ordinal()] = 17;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            dN[Zh.s.ordinal()] = 18;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            dN[Zh.Hv.ordinal()] = 19;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            dN[Zh.VX.ordinal()] = 20;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            dN[Zh.ci.ordinal()] = 21;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[Zh.bG.ordinal()] = 22;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }
}
