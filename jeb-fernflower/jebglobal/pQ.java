package jebglobal;

import jebglobal.WX;
import jebglobal.as;
import jebglobal.yW;
import jebglobal.yn;

public final class pQ extends as {
   private yW KK;
   private String EO;

   public pQ(yW var1, WX var2) {
      super((yn)null, var2.ld());
      var2.QE();
      this.ld = var2.fa();
      this.QE = var2.zs();
      this.KK = var1;
      this.EO = var2.dN();
   }

   public boolean OK() {
      return true;
   }

   public boolean LH() {
      this.KK.fa(this.EO);
      return true;
   }
}
