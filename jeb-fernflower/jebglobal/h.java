package jebglobal;

import java.util.List;
import jebglobal.EG;
import jebglobal.II;
import jebglobal.WM;
import jebglobal.gl;
import jebglobal.hs;
import jebglobal.kd;
import jebglobal.lk;
import jebglobal.rj;
import jebglobal.tE;
import jebglobal.yF;

public final class h extends yF implements WM {
   private lk QE;

   public h(lk var1) {
      this.dN = yF.uK.ld;
      this.ld = yF.vd.dN;
      this.QE = var1;
   }

   public lk dN() {
      return this.QE;
   }

   public II dN(List var1, int var2, int[] var3) {
      II var4 = (II)var1.get(var2++);
      if(!(var4 instanceof h)) {
         throw new RuntimeException();
      } else {
         lk var5 = ((h)var4).dN();
         var4 = (II)var1.get(var2);
         if(!(var4 instanceof kd)) {
            throw new RuntimeException();
         } else {
            int[] var6 = new int[1];
            II var7 = ((kd)var4).dN(var1, var2, var6);
            var2 = var6[0];
            tE var8 = new tE(var5, (EG)var7);

            while(true) {
               var4 = (II)var1.get(var2++);
               if(var4 instanceof rj) {
                  var3[0] = var2;
                  return var8;
               }

               if(var4 instanceof gl) {
                  var5 = ((gl)var4).dN();
                  var4 = (II)var1.get(var2);
                  if(!(var4 instanceof kd)) {
                     throw new RuntimeException();
                  }

                  var7 = ((kd)var4).dN(var1, var2, var6);
                  var2 = var6[0];
                  var8.dN(var5, (EG)var7);
               } else {
                  if(!(var4 instanceof hs)) {
                     throw new RuntimeException();
                  }

                  var4 = (II)var1.get(var2);
                  if(!(var4 instanceof kd)) {
                     throw new RuntimeException();
                  }

                  var7 = ((kd)var4).dN(var1, var2, var6);
                  var2 = var6[0];
                  var8.dN((EG)var7);
               }
            }
         }
      }
   }
}
