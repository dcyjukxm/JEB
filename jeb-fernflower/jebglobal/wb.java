package jebglobal;

import jebglobal.cN;
import jebglobal.fv;
import jebglobal.sm;
import jebglobal.zX;

public final class wb {
   private cN dN;

   public String dN(int var1, int var2, String var3, int var4) {
      fv var5 = this.dN.mS().dN(var1, var2, var3);
      String var6 = null;
      if(var4 != 0) {
         sm var7 = (sm)this.dN().wU().dN(var4).ld().wU();
         var6 = var7.dN(var5);
      }

      return var6 != null?var6:var5.fa();
   }

   public cN dN() {
      if(this.dN == null) {
         throw new zX();
      } else {
         return this.dN;
      }
   }

   public void dN(cN var1) {
      this.dN = var1;
   }
}
