package jebglobal;

import jebglobal.Zh;
import jebglobal.iD;

public final class R extends iD {
   private Object dN;

   public R(int var1, int var2, Zh var3, int var4, Object var5, Object var6) {
      super(var1, var2, var3, var4, var5);
      if(var6 == null) {
         throw new RuntimeException();
      } else {
         this.dN = var6;
      }
   }

   public Object mS() {
      return this.dN;
   }
}
