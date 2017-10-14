package jebglobal;

import jebglobal.QH;
import jebglobal.TM;
import jebglobal.WV;
import jebglobal.ZO;
import jebglobal.vI;

final class DE {
   private WV dN;
   private ZO.uK ld;
   private QH QE;

   DE(WV var1, ZO.uK var2) {
      this.dN = var1;
      this.ld = var2;
      this.QE = null;
   }

   ZO.uK dN() {
      return this.ld;
   }

   void dN(QH var1) {
      this.QE = var1;
   }

   boolean dN(TM var1) {
      boolean var2 = false;
      if(this.dN.wU() == vI.dN) {
         boolean var3;
         try {
            var3 = Boolean.parseBoolean(this.QE.dN());
         } catch (Exception var5) {
            var3 = Boolean.parseBoolean(this.dN.QE());
         }

         if(var1.ld(this.dN) != var3) {
            var2 = true;
         }

         var1.dN(this.dN, var3);
      } else if(this.dN.wU() == vI.ld) {
         int var7;
         try {
            var7 = Integer.parseInt(this.QE.dN());
         } catch (Exception var4) {
            var7 = Integer.parseInt(this.dN.QE());
         }

         if(var1.QE(this.dN) != var7) {
            var2 = true;
         }

         var1.dN(this.dN, var7);
      } else {
         if(this.dN.wU() != vI.QE) {
            throw new RuntimeException();
         }

         String var6 = this.QE.dN();
         var1.dN(this.dN, var6);
      }

      return var2;
   }
}
