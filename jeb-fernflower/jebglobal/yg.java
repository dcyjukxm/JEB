package jebglobal;

import java.util.List;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.Qa;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.oc;

public final class yg extends II {
   private Qa dN;

   public yg(Qa var1) {
      this.dN = var1;
   }

   public Qa dN() {
      return this.dN;
   }

   public void dN(Qa var1) {
      this.dN = var1;
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (Qa)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.ld(var1);
      var1.dN(oc.dN);
      if(this.dN != null) {
         var1.s();
         this.dN.dN(var1, false);
      }

   }
}
