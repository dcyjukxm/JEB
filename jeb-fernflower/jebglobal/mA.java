package jebglobal;

import java.util.List;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;

public final class mA extends II {
   private boolean dN;
   private Xf ld;

   public mA(boolean var1, Xf var2) {
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
         this.ld = var2;
      }
   }

   public boolean dN() {
      return this.dN;
   }

   public Xf ld() {
      return this.ld;
   }

   public List wU() {
      return TM.dN(new IK[]{this.ld});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.ld == var1) {
         this.ld = (Xf)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.ld(var1);
      var1.wU(String.format("__monitor_%s(", new Object[]{this.dN?"enter":"exit"}));
      this.ld.dN(var1);
      var1.wU(")");
   }
}
