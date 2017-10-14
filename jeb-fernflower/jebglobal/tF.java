package jebglobal;

import jebglobal.HC;
import jebglobal.Pl;
import jebglobal.as;

public final class tF extends as {
   private Pl KK;

   public tF(Pl var1) {
      super(var1, "Decompile a class");
      this.KK = var1;
      this.ld = 9;
      this.fa = HC.dN().dN("icon-code-context.png");
      this.zs = true;
      this.mS = 1;
      this.OK = true;
      this.LH = 4;
   }

   public boolean OK() {
      return this.KK.Ux() != null;
   }

   public boolean LH() {
      if(this.KK.Ux() == null) {
         return false;
      } else {
         this.KK.rK();
         return true;
      }
   }
}
