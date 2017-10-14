package jebglobal;

import java.util.HashMap;
import jebglobal.hV;
import jebglobal.lo;

final class rO implements lo {
   private HashMap dN = new HashMap();

   public void dN() {
      this.dN.clear();
   }

   public String dN(hV var1, int var2) {
      String var3 = "v" + var2;
      Integer var4 = (Integer)this.dN.get(Integer.valueOf(var2));
      if(var4 == null) {
         this.dN.put(Integer.valueOf(var2), Integer.valueOf(0));
      } else {
         this.dN.put(Integer.valueOf(var2), var4 = Integer.valueOf(var4.intValue() + 1));
         var3 = var3 + "_" + var4;
      }

      return var3;
   }
}
