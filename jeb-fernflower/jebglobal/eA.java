package jebglobal;

import jebglobal.Kf;
import jebglobal.Mt;
import jebglobal.PS;
import jebglobal.UD;
import jebglobal.Vi;
import jebglobal.dx;
import jebglobal.fv;

public final class eA extends Vi implements Mt {
   private final fv[] ld;

   eA(UD var1, PS[] var2) {
      super(var1);
      this.ld = new fv[var2.length];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         this.ld[var3] = (fv)var2[var3].ld;
      }

   }

   public void dN(Kf var1, dx var2) {
      String var3 = this.dN();
      var3 = (var3 == null?"":var3 + "-") + "array";
      var1.ld((String)null, var3);
      var1.dN((String)null, "name", var2.QE().fa());

      for(int var4 = 0; var4 < this.ld.length; ++var4) {
         var1.ld((String)null, "item");
         var1.ld(this.ld[var4].zs());
         var1.QE((String)null, "item");
      }

      var1.QE((String)null, var3);
   }

   public String dN() {
      if(this.ld.length == 0) {
         return null;
      } else {
         String var1 = this.ld[0].OK();
         if(!"string".equals(var1) && !"integer".equals(var1)) {
            return null;
         } else {
            for(int var2 = 1; var2 < this.ld.length; ++var2) {
               if(!var1.equals(this.ld[var2].OK())) {
                  return null;
               }
            }

            return var1;
         }
      }
   }
}
