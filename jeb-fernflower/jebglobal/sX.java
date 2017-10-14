package jebglobal;

import jebglobal.HI;
import jebglobal.II;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.wm;

public final class sX extends II {
   private wm dN;
   private HI ld;

   public sX(Xf var1) {
      if(var1 instanceof wm) {
         this.dN = (wm)var1;
      } else {
         if(!(var1 instanceof HI)) {
            throw new RuntimeException();
         }

         this.ld = (HI)var1;
      }

   }

   public HI dN() {
      return this.dN != null?this.dN.zs():this.ld;
   }

   public void dN(ZL var1) {
      throw new RuntimeException();
   }
}
