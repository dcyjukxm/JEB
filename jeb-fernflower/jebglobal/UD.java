package jebglobal;

import jebglobal.Al;
import jebglobal.UW;
import jebglobal.Vp;
import jebglobal.cN;

public final class UD extends Vp {
   private final cN QE;
   private final boolean wU;

   public UD(cN var1, int var2, String var3, boolean var4) {
      super(var2, var3, "reference");
      this.QE = var1;
      this.wU = var4;
   }

   protected String dN() {
      if(this.wU()) {
         return "@null";
      } else {
         UW var1 = this.QE();
         boolean var2 = var1.QE() && var1.ld().wU() instanceof Al;
         return (this.wU?'?':'@') + (var2?"+":"") + var1.dN(this.QE, this.wU && var1.mS().dN().equals("attr"));
      }
   }

   public UW QE() {
      return this.QE.wU().dN(this.ld());
   }

   public boolean wU() {
      return this.dN == 0;
   }
}
