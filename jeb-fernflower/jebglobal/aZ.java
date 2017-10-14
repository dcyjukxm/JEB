package jebglobal;

import java.util.List;
import jebglobal.EG;
import jebglobal.II;
import jebglobal.Rp;
import jebglobal.WM;
import jebglobal.kd;
import jebglobal.lk;
import jebglobal.yF;
import jebglobal.zn;

public final class aZ extends yF implements WM {
   private lk QE;

   public aZ(lk var1) {
      this.dN = yF.uK.wU;
      this.ld = yF.vd.dN;
      this.QE = var1;
   }

   public lk dN() {
      return this.QE;
   }

   public II dN(List var1, int var2, int[] var3) {
      II var4 = (II)var1.get(var2++);
      if(!(var4 instanceof aZ)) {
         throw new RuntimeException();
      } else {
         lk var5 = ((aZ)var4).dN();
         var4 = (II)var1.get(var2);
         if(!(var4 instanceof kd)) {
            throw new RuntimeException();
         } else {
            int[] var6 = new int[1];
            II var7 = ((kd)var4).dN(var1, var2, var6);
            var2 = var6[0];
            var4 = (II)var1.get(var2++);
            if(!(var4 instanceof Rp)) {
               throw new RuntimeException();
            } else {
               var3[0] = var2;
               return new zn(var5, (EG)var7);
            }
         }
      }
   }
}
