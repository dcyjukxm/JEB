package jebglobal;

import jebglobal.HC;
import jebglobal.Ky;
import jebglobal.LW;
import jebglobal.Os;
import jebglobal.as;
import jebglobal.yn;

public final class cF extends as {
   public cF(yn var1) {
      super(var1, "Navigate backward");
      this.ld = 27;
      this.fa = HC.dN().dN("icon-arrow-left.png");
      this.OK = true;
   }

   public boolean OK() {
      if(this.dN.LH().QE()) {
         return true;
      } else if(this.dN instanceof Os) {
         Os var1 = (Os)this.dN;
         return var1.Ux().QE();
      } else {
         return false;
      }
   }

   public boolean LH() {
      LW var1 = new LW(this.dN.zs(), this.dN.mS());
      LW var2 = (LW)this.dN.LH().ld(var1);
      if(var2 != null) {
         this.dN.dN(var2, false);
         return true;
      } else {
         if(this.dN instanceof Os) {
            Os var3 = (Os)this.dN;
            String var4 = (String)var3.Ux().ld(var3.rK());
            if(var4 != null) {
               var3.dN(var4, (Ky)null, false);
               LW var5 = (LW)var3.LH().ld((Object)null);
               if(var5 != null) {
                  var3.dN(var5, false);
               }

               return true;
            }
         }

         return false;
      }
   }
}
