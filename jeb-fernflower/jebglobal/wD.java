package jebglobal;

import java.util.List;
import jebglobal.IK;
import jebglobal.Rx;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.cI;

public final class wD extends cI implements Rx {
   private Xf dN;
   private Xf ld;

   public wD(Xf var1, Xf var2) {
      if(var1 != null && var2 != null) {
         this.dN = var1;
         this.ld = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public Xf ld() {
      return this.dN;
   }

   public Xf QE() {
      return this.ld;
   }

   public void dN(Xf var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
      }
   }

   public void ld(Xf var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.ld = var1;
      }
   }

   public int hashCode() {
      int var1 = 31 + this.dN.hashCode();
      var1 = 31 * var1 + this.ld.hashCode();
      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         wD var2 = (wD)var1;
         return this.dN.equals(var2.dN) && this.ld.equals(var2.ld);
      } else {
         return false;
      }
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN, this.ld});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (Xf)var2;
         return true;
      } else if(this.ld == var1) {
         this.ld = (Xf)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.a_(var1);
      this.dN.dN(var1);
      var1.wU("[");
      this.ld.dN(var1);
      var1.wU("]");
   }
}
