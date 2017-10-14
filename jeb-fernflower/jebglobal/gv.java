package jebglobal;

import java.util.Iterator;
import java.util.List;
import jebglobal.FB;
import jebglobal.HC;
import jebglobal.HI;
import jebglobal.LW;
import jebglobal.OM;
import jebglobal.Os;
import jebglobal.PL;
import jebglobal.Qa;
import jebglobal.Xa;
import jebglobal.YJ;
import jebglobal.as;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.u;
import jebglobal.yK;
import jebglobal.yW;
import jebglobal.yx;

public final class gv extends as {
   private Os KK;

   public gv(Os var1) {
      super(var1, "Rename item");
      this.KK = var1;
      this.ld = 110;
      this.fa = HC.dN().dN("icon-letter-n.png");
      this.OK = true;
   }

   public boolean OK() {
      return this.dN(true);
   }

   public boolean LH() {
      return this.dN(false);
   }

   public boolean dN(boolean var1) {
      YJ var2 = this.KK.OK();
      if(var2 == null) {
         return false;
      } else {
         Object var3 = var2.zs();
         if(var3 == null) {
            return false;
         } else {
            yW var4 = this.KK.QE();
            yx var5 = this.KK.wU();
            if(var3 instanceof yK) {
               return FB.dN(this.KK, (yK)((yK)var3), var1, (String)null);
            } else if(var3 instanceof hO) {
               return FB.dN(this.KK, (hO)((hO)var3), var1, (String)null);
            } else if(var3 instanceof gE) {
               return FB.dN(this.KK, (gE)((gE)var3), var1, (String)null);
            } else {
               String var6;
               String var7;
               int var10;
               String var13;
               Xa var18;
               if(var3 instanceof HI) {
                  HI var8 = (HI)var3;
                  List var9 = this.KK.ld(var2);
                  if(var9 == null) {
                     return false;
                  }

                  var10 = -1;
                  Iterator var11 = var9.iterator();

                  while(var11.hasNext()) {
                     LW var12 = (LW)var11.next();
                     if(var12.QE().fa() == 1) {
                        var10 = var12.dN();
                        break;
                     }
                  }

                  if(var10 < 0) {
                     return false;
                  }

                  PL var16 = (PL)this.KK.Hw().zs(var10);
                  if(var16 != null) {
                     if(var1) {
                        return true;
                     }

                     var7 = var8.dN(true);
                     var6 = "Rename identifier";
                     var18 = new Xa(this.KK.getShell(), var4.XZ(), var6, var7);
                     var18.ld(true);
                     var13 = var18.dN();
                     if(var13 != null && var8.dN(var13.equals("")?null:var13)) {
                        this.KK.dN(var8.dN(true));
                        var5.ld().dN(u.uK.fa, var16.ld(), var16.QE(), var8.ld(), var13.equals("")?null:var13);
                        return true;
                     }
                  }
               } else if(var3 instanceof Qa) {
                  Long var14 = (Long)var2.mS();
                  if(var14 != null) {
                     if(var1) {
                        return true;
                     }

                     int var15 = (int)(var14.longValue() >> 32);
                     var10 = (int)(var14.longValue() & -1L);
                     u var17 = var5.ld().dN(var15, var10);
                     var7 = var17 != null && var17.LH()?var17.Hw():OM.QE(var10);
                     var6 = "Rename label";
                     var18 = new Xa(this.KK.getShell(), var4.XZ(), var6, var7);
                     var18.ld(true);
                     var13 = var18.dN();
                     if(var13 != null && var5.ld().dN(u.uK.wU, var15, var10, -1, var13.equals("")?null:var13)) {
                        var17 = var5.ld().dN(var15, var10);
                        if(var17 != null && var17.LH()) {
                           var17.Hw();
                        } else {
                           OM.QE(var10);
                        }

                        this.KK.dN(true);
                        return true;
                     }
                  }
               }

               return false;
            }
         }
      }
   }
}
