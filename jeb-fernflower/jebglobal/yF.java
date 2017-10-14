package jebglobal;

import java.util.List;
import jebglobal.II;
import jebglobal.ZL;
import jebglobal.wz;

public abstract class yF extends II {
   yF.uK dN;
   yF.vd ld;

   public static int dN(List var0, int var1) {
      II var2 = (II)var0.get(var1);
      if(!(var2 instanceof yF)) {
         throw new RuntimeException();
      } else {
         yF var3 = (yF)var2;
         if(var3.ld != yF.vd.dN && var3.ld != yF.vd.ld) {
            throw new RuntimeException();
         } else {
            int var4 = 1;

            for(int var5 = var1 + 1; var5 < var0.size(); ++var5) {
               II var6 = (II)var0.get(var5);
               if(var6 instanceof yF) {
                  yF var7 = (yF)var6;
                  if(var7.dN == var3.dN) {
                     if(var7.ld == yF.vd.dN) {
                        ++var4;
                     } else if(var7.ld == yF.vd.QE) {
                        --var4;
                        if(var4 == 0) {
                           return var5;
                        }
                     }
                  }
               } else if(var6 instanceof wz) {
                  throw new RuntimeException();
               }
            }

            throw new RuntimeException();
         }
      }
   }

   public void dN(ZL var1) {
      throw new RuntimeException();
   }

   public static enum vd {
      dN,
      ld,
      QE;
   }

   public static enum uK {
      dN,
      ld,
      QE,
      wU,
      fa,
      zs,
      mS,
      OK;
   }
}
