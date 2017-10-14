package jebglobal;

import java.util.List;
import jebglobal.EG;
import jebglobal.HI;
import jebglobal.IF;
import jebglobal.II;
import jebglobal.Je;
import jebglobal.SP;
import jebglobal.WM;
import jebglobal.hV;
import jebglobal.kd;
import jebglobal.tP;
import jebglobal.yF;

public final class wJ extends yF implements WM {
   public wJ() {
      this.dN = yF.uK.mS;
      this.ld = yF.vd.dN;
   }

   public II dN(List var1, int var2, int[] var3) {
      II var4 = (II)var1.get(var2++);
      if(!(var4 instanceof wJ)) {
         throw new RuntimeException();
      } else {
         var4 = (II)var1.get(var2);
         if(!(var4 instanceof kd)) {
            throw new RuntimeException();
         } else {
            int[] var5 = new int[1];
            II var6 = ((kd)var4).dN(var1, var2, var5);
            var2 = var5[0];
            SP var7 = new SP((EG)var6);

            while(true) {
               var4 = (II)var1.get(var2++);
               if(var4 instanceof tP) {
                  var3[0] = var2;
                  return var7;
               }

               if(var4 instanceof Je) {
                  hV var8 = ((Je)var4).dN();
                  HI var9 = ((Je)var4).ld();
                  var4 = (II)var1.get(var2);
                  if(!(var4 instanceof kd)) {
                     throw new RuntimeException();
                  }

                  var6 = ((kd)var4).dN(var1, var2, var5);
                  var2 = var5[0];
                  var7.dN(var8, var9, (EG)var6);
               } else {
                  if(!(var4 instanceof IF)) {
                     throw new RuntimeException();
                  }

                  var4 = (II)var1.get(var2);
                  if(!(var4 instanceof kd)) {
                     throw new RuntimeException();
                  }

                  var6 = ((kd)var4).dN(var1, var2, var5);
                  var2 = var5[0];
                  var7.dN((EG)var6);
               }
            }
         }
      }
   }
}
