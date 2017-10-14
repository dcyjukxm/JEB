package jebglobal;

import jebglobal.Es;
import jebglobal.Hu;
import jebglobal.MB;
import jebglobal.Zh;
import jebglobal.hv;
import jebglobal.jt;
import jebglobal.mD;

public final class BQ implements jt {
   public MB ld(int var1, int var2, Zh var3, int var4, Object var5, Object var6) {
      if(var2 <= 1023 && var1 <= 4095 && var4 >= 0 && var4 <= 15) {
         if(var5 == null) {
            if(var6 == null) {
               return new MB(var1, var2, var3, var4);
            } else {
               throw new RuntimeException();
            }
         } else {
            return (MB)(var6 == null?new Es(var1, var2, var3, var4, var5):new mD(var1, var2, var3, var4, var5, var6));
         }
      } else {
         return new Hu(var1, var2, var3, var4, var5, var6);
      }
   }

   // $FF: synthetic method
   public hv dN(int var1, int var2, Zh var3, int var4, Object var5, Object var6) {
      return this.ld(var1, var2, var3, var4, var5, var6);
   }
}
