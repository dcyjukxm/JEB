package jebglobal;

import jebglobal.AV;
import jebglobal.HC;
import jebglobal.Ky;
import jebglobal.OD;
import jebglobal.OM;
import jebglobal.Pl;
import jebglobal.XV;
import jebglobal.as;
import jebglobal.sp;
import jebglobal.yK;
import jebglobal.yx;

public final class ak extends as {
   private Pl KK;

   public ak(Pl var1) {
      super(var1, "Comment");
      this.KK = var1;
      this.ld = 99;
      this.wU = 47;
      this.fa = HC.dN().dN("icon-letter-c.png");
      this.OK = true;
   }

   public boolean OK() {
      return this.dN(true);
   }

   public boolean LH() {
      return this.dN(false);
   }

   private boolean dN(boolean var1) {
      String var2 = null;
      byte[] var3 = null;
      Ky var4 = this.KK.Ux();
      if(var4 == null) {
         return false;
      } else {
         OD.vd var5 = null;
         int var6 = -1;
         int var7 = -1;
         String var8 = "Inline comment";
         yx var9 = this.KK.wU();
         OD var21;
         if(var4.wU != null) {
            AV var10 = var9.QE().QE(var4.wU);
            if(var10 != null) {
               if(var4.zs >= 0) {
                  OM var11 = var10.wU();
                  if(var11 != null) {
                     var8 = "Instruction comment";
                     var5 = OD.vd.fa;
                     var6 = var11.dN();
                     var7 = var4.zs;
                     OD var12 = var9.ld().QE(var6, var7);
                     if(var12 != null) {
                        var2 = var12.PF();
                        var3 = var12.Hw();
                     }
                  }
               } else {
                  var8 = "Method comment";
                  var5 = OD.vd.QE;
                  var6 = var10.ld();
                  var21 = var9.ld().fa(var6);
                  if(var21 != null) {
                     var2 = var21.PF();
                     var3 = var21.Hw();
                  }
               }
            }
         } else if(var4.fa != null) {
            XV var18 = var9.QE().dN(var4.fa);
            if(var18 != null) {
               var8 = "Field comment";
               var5 = OD.vd.wU;
               var6 = var18.dN();
               var21 = var9.ld().zs(var6);
               if(var21 != null) {
                  var2 = var21.PF();
                  var3 = var21.Hw();
               }
            }
         } else if(var4.QE != null) {
            yK var19 = var9.QE().EO(var4.QE);
            if(var19 != null) {
               var8 = "Class comment";
               var5 = OD.vd.ld;
               var6 = var19.zs();
               var21 = var9.ld().wU(var6);
               if(var21 != null) {
                  var2 = var21.PF();
                  var3 = var21.Hw();
               }
            }
         }

         if(var5 != null) {
            if(var1) {
               return true;
            }

            sp var20 = new sp(this.KK.getShell(), this.KK.QE().XZ(), var8, var2, var3);
            OD.uK var22 = var20.dN();
            if(var22 != null) {
               int var23 = this.KK.zs();
               String var13 = this.KK.mS(var23);
               String var14 = this.KK.Hw().dN(var23, var22.dN, var22.ld);
               int var15 = this.KK.OK(var23);
               int var16;
               int var17;
               if(var2 == null) {
                  var16 = var13.lastIndexOf(35);
                  if(var16 >= 0) {
                     var17 = var13.length() - var16 + 2;
                     this.KK.dN(var15 + var13.length() - var17, var17, var14);
                  } else {
                     this.KK.dN(var15 + var13.length(), 0, var14);
                  }
               } else {
                  var16 = var13.lastIndexOf(35, var13.length() - var2.length());
                  var17 = var13.length() - var16 + 2;
                  this.KK.dN(var15 + var13.length() - var17, var17, var14);
               }

               var9.ld().dN(var5, var6, var7, var22.dN, var22.ld);
               return true;
            }
         }

         return false;
      }
   }
}
