package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jebglobal.bJ;

public final class Tp {
   private Map dN = new HashMap();

   public void dN(String var1, Object var2) {
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN.put(var1, var2);
      }
   }

   public Object dN(String var1) {
      return this.dN.get(var1);
   }

   public List dN() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.dN.keySet().iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         var1.add(new bJ(var3, this.dN.get(var3)));
      }

      return var1;
   }
}
