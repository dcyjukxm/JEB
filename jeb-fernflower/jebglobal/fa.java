package jebglobal;

import jebglobal.ED;
import jebglobal.zX;

public final class fa extends ED {
   private final String dN;

   public fa(String var1) {
      this.dN = var1;
   }

   public String dN() {
      if(!this.dN.startsWith("res/")) {
         throw new zX();
      } else {
         return this.dN.substring(4);
      }
   }
}
