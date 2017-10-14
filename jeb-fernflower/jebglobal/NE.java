package jebglobal;

import java.util.Iterator;
import java.util.List;
import jebglobal.HC;
import jebglobal.Ky;
import jebglobal.LW;
import jebglobal.Os;
import jebglobal.YJ;
import jebglobal.as;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.yK;
import jebglobal.yn;

public final class NE extends as {
   public NE(yn var1) {
      super(var1, "Follow");
      this.ld = 13;
      this.fa = HC.dN().dN("icon-arrow-down.png");
      this.OK = true;
   }

   public boolean OK() {
      return this.dN(true);
   }

   public boolean LH() {
      return this.dN(false);
   }

   public boolean dN(boolean var1) {
      return this.ld(var1)?true:(this.dN instanceof Os?this.QE(var1):false);
   }

   public boolean ld(boolean var1) {
      YJ var2 = this.dN.OK();
      if(var2 == null) {
         return false;
      } else {
         List var3 = this.dN.ld(var2);
         if(var3 == null) {
            return false;
         } else {
            LW var4 = null;
            Iterator var5 = var3.iterator();

            while(var5.hasNext()) {
               LW var6 = (LW)var5.next();
               if(var6.QE().fa() == 1) {
                  var4 = var6;
                  break;
               }
            }

            return var4 == null?false:(var1?true:this.dN.dN(var4, true));
         }
      }
   }

   private boolean QE(boolean var1) {
      YJ var2 = this.dN.OK();
      if(var2 == null) {
         return false;
      } else {
         Os var3 = (Os)this.dN;
         Object var4 = var2.zs();
         if(var4 == null) {
            return false;
         } else {
            String var6;
            if(var4 instanceof yK) {
               if(var1) {
                  return true;
               } else {
                  yK var11 = (yK)var4;
                  var6 = var11.dN(false);
                  Ky var12 = new Ky();
                  var12.dN = var6;
                  var12.QE = var6;
                  var3.dN(var6, var12);
                  return true;
               }
            } else {
               String var7;
               yK var8;
               Ky var9;
               if(var4 instanceof hO) {
                  hO var10 = (hO)var4;
                  if(!var10.QE()) {
                     return false;
                  } else {
                     var6 = var10.wU(false);
                     var7 = var10.dN(false);
                     var8 = var3.wU().QE().EO(var7);
                     if(var8 == null) {
                        return false;
                     } else if(var1) {
                        return true;
                     } else {
                        var9 = new Ky();
                        var9.dN = var6;
                        var9.QE = var7;
                        var9.wU = var6;
                        var3.dN(var7, var9);
                        return true;
                     }
                  }
               } else if(var4 instanceof gE) {
                  gE var5 = (gE)var4;
                  if(!var5.QE()) {
                     return false;
                  } else {
                     var6 = var5.fa(false);
                     var7 = var5.dN(false);
                     var8 = var3.wU().QE().EO(var7);
                     if(var8 == null) {
                        return false;
                     } else if(var1) {
                        return true;
                     } else {
                        var9 = new Ky();
                        var9.dN = var6;
                        var9.QE = var7;
                        var9.fa = var6;
                        var3.dN(var7, var9);
                        return true;
                     }
                  }
               } else {
                  return false;
               }
            }
         }
      }
   }
}
