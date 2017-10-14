package jebglobal;

import java.util.LinkedHashMap;
import java.util.Map;
import jebglobal.LP;
import jebglobal.UW;
import jebglobal.cN;
import jebglobal.zX;

public final class Me {
   private final String dN;
   private final Map ld = new LinkedHashMap();

   public Me(String var1, LP var2, cN var3) {
      this.dN = var1;
   }

   public String dN() {
      return this.dN;
   }

   public void dN(UW var1) {
      if(this.ld.put(var1.fa(), var1) != null) {
         throw new zX();
      }
   }

   public String toString() {
      return this.dN;
   }
}
