package jebglobal;

import java.util.List;
import jebglobal.EG;
import jebglobal.II;
import jebglobal.RT;
import jebglobal.WM;
import jebglobal.yF;

public final class kd extends yF implements WM {
   public kd() {
      this.dN = yF.uK.dN;
      this.ld = yF.vd.dN;
   }

   public II dN(List var1, int var2, int[] var3) {
      II var4 = (II)var1.get(var2++);
      if(!(var4 instanceof kd)) {
         throw new RuntimeException();
      } else {
         EG var5 = new EG();

         while(true) {
            var4 = (II)var1.get(var2);
            if(var4 instanceof RT) {
               ++var2;
               var3[0] = var2;
               return var5;
            }

            if(var4 instanceof WM) {
               int[] var6 = new int[1];
               II var7 = ((WM)var4).dN(var1, var2, var6);
               var5.dN(var7);
               var2 = var6[0];
            } else {
               var5.dN(var4);
               ++var2;
            }
         }
      }
   }
}
