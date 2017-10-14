package jebglobal;

import java.util.List;
import jebglobal.EG;
import jebglobal.II;
import jebglobal.WM;
import jebglobal.am;
import jebglobal.bW;
import jebglobal.kd;
import jebglobal.lk;
import jebglobal.yF;

public final class SB extends yF implements WM {
   private II QE;
   private lk wU;
   private II fa;

   public SB(II var1, lk var2, II var3) {
      this.dN = yF.uK.fa;
      this.ld = yF.vd.dN;
      this.QE = var1;
      this.wU = var2;
      this.fa = var3;
   }

   public II dN() {
      return this.QE;
   }

   public lk ld() {
      return this.wU;
   }

   public II zs() {
      return this.fa;
   }

   public II dN(List var1, int var2, int[] var3) {
      II var4 = (II)var1.get(var2++);
      if(!(var4 instanceof SB)) {
         throw new RuntimeException();
      } else {
         II var5 = ((SB)var4).dN();
         lk var6 = ((SB)var4).ld();
         II var7 = ((SB)var4).zs();
         var4 = (II)var1.get(var2);
         if(!(var4 instanceof kd)) {
            throw new RuntimeException();
         } else {
            int[] var8 = new int[1];
            II var9 = ((kd)var4).dN(var1, var2, var8);
            var2 = var8[0];
            var4 = (II)var1.get(var2++);
            if(!(var4 instanceof bW)) {
               throw new RuntimeException();
            } else {
               var3[0] = var2;
               return new am(var5, var6, var7, (EG)var9);
            }
         }
      }
   }
}
