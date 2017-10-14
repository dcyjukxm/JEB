package jebglobal;

import jebglobal.MB;
import jebglobal.Zh;

public class Es extends MB {
   private Object dN;

   protected Es(int var1, int var2, Zh var3, int var4, Object var5) {
      super(var1, var2, var3, var4);
      if(var5 == null) {
         throw new RuntimeException();
      } else {
         this.dN = var5;
      }
   }

   public Object zs() {
      return this.dN;
   }
}
