package jebglobal;

import java.util.List;
import jebglobal.At;
import jebglobal.Dq;
import jebglobal.EG;
import jebglobal.FX;
import jebglobal.II;
import jebglobal.Ro;
import jebglobal.WM;
import jebglobal.Xf;
import jebglobal.kd;
import jebglobal.yF;

public final class Ps extends yF implements WM {
   private Xf QE;

   public Ps(Xf var1) {
      this.dN = yF.uK.zs;
      this.ld = yF.vd.dN;
      this.QE = var1;
   }

   public Xf dN() {
      return this.QE;
   }

   public II dN(List var1, int var2, int[] var3) {
      II var4 = (II)var1.get(var2++);
      if(!(var4 instanceof Ps)) {
         throw new RuntimeException();
      } else {
         Xf var5 = ((Ps)var4).dN();
         int[] var6 = new int[1];
         Dq var8 = new Dq(var5);

         while(true) {
            var4 = (II)var1.get(var2++);
            if(var4 instanceof FX) {
               var3[0] = var2;
               return var8;
            }

            II var7;
            if(var4 instanceof At) {
               List var9 = ((At)var4).dN();
               var4 = (II)var1.get(var2);
               if(!(var4 instanceof kd)) {
                  throw new RuntimeException();
               }

               var7 = ((kd)var4).dN(var1, var2, var6);
               var2 = var6[0];
               var8.dN(var9, (EG)var7);
            } else {
               if(!(var4 instanceof Ro)) {
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
