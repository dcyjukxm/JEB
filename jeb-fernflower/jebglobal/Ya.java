package jebglobal;

import java.util.List;
import jebglobal.EG;
import jebglobal.II;
import jebglobal.WM;
import jebglobal.aY;
import jebglobal.jM;
import jebglobal.kd;
import jebglobal.lk;
import jebglobal.yF;

public final class Ya extends yF implements WM {
   public Ya() {
      this.dN = yF.uK.QE;
      this.ld = yF.vd.dN;
   }

   public II dN(List var1, int var2, int[] var3) {
      II var4 = (II)var1.get(var2++);
      if(!(var4 instanceof Ya)) {
         throw new RuntimeException();
      } else {
         var4 = (II)var1.get(var2);
         if(!(var4 instanceof kd)) {
            throw new RuntimeException();
         } else {
            int[] var5 = new int[1];
            II var6 = ((kd)var4).dN(var1, var2, var5);
            var2 = var5[0];
            var4 = (II)var1.get(var2++);
            if(!(var4 instanceof aY)) {
               throw new RuntimeException();
            } else {
               lk var7 = ((aY)var4).dN();
               var3[0] = var2;
               return new jM((EG)var6, var7);
            }
         }
      }
   }
}
