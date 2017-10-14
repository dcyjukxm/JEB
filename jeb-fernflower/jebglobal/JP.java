package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class JP {
   public List dN = new ArrayList();

   public int dN() {
      return this.dN.size();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      int var2 = 0;

      for(Iterator var3 = this.dN.iterator(); var3.hasNext(); ++var2) {
         List var4 = (List)var3.next();
         var1.append(String.format("%d=%s ", new Object[]{Integer.valueOf(var2), var4}));
      }

      return var1.toString();
   }
}
