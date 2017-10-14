package jebglobal;

import jebglobal.HC;
import jebglobal.OX;
import jebglobal.Os;
import jebglobal.YJ;
import jebglobal.as;
import jebglobal.hV;

public final class vL extends as {
   private Os KK;

   public vL(Os var1) {
      super(var1, "Rebase constant");
      this.KK = var1;
      this.ld = 98;
      this.fa = HC.dN().dN("icon-letter-b.png");
      this.OK = false;
   }

   public boolean OK() {
      return this.dN(true);
   }

   public boolean LH() {
      return this.dN(false);
   }

   private boolean dN(boolean var1) {
      YJ var2 = this.KK.OK();
      if(var2 == null) {
         return false;
      } else {
         Object var3 = var2.zs();
         if(var3 != null && var3 instanceof OX) {
            OX var4 = (OX)var3;
            hV var5 = var4.ld();
            if(!var5.Hw()) {
               return false;
            } else if(var1) {
               return true;
            } else {
               OX.uK var6 = var4.ci();
               if(var6 != null && var6 != OX.uK.ld) {
                  if(var6 == OX.uK.QE) {
                     var6 = OX.uK.dN;
                  } else if(var6 == OX.uK.dN) {
                     var6 = OX.uK.ld;
                  } else {
                     var6 = null;
                  }
               } else {
                  var6 = OX.uK.QE;
               }

               var4.dN(var6);
               this.KK.dN(var4.toString());
               return true;
            }
         } else {
            return false;
         }
      }
   }
}
