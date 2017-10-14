package jebglobal;

import java.util.List;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.oc;

public final class cq extends II {
   private Xf dN;

   public cq(Xf var1) {
      this.dN = var1;
   }

   public Xf dN() {
      return this.dN;
   }

   public void dN(Xf var1) {
      this.dN = var1;
   }

   public boolean ld() {
      return this.dN == null;
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (Xf)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.ld(var1);
      var1.dN(oc.s);
      if(this.dN != null) {
         var1.wU(" ");
         this.dN.dN(var1);
      }

   }
}
