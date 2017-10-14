package jebglobal;

import java.util.List;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.cI;

public final class rY extends cI implements Xf {
   private Xf dN;
   private Xf ld;
   private Xf QE;

   public rY(Xf var1, Xf var2, Xf var3) {
      if(var1 != null && var2 != null && var3 != null) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
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

   public Xf fa() {
      return this.QE;
   }

   public int hashCode() {
      int var1 = 31 + (this.dN == null?0:this.dN.hashCode());
      var1 = 31 * var1 + this.ld.hashCode();
      var1 = 31 * var1 + this.QE.hashCode();
      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         rY var2 = (rY)var1;
         return this.dN.equals(var2.dN) && this.ld.equals(var2.ld) && this.QE.equals(var2.QE);
      } else {
         return false;
      }
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN, this.ld, this.QE});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (Xf)var2;
         return true;
      } else if(this.ld == var1) {
         this.ld = (Xf)var2;
         return true;
      } else if(this.QE == var1) {
         this.QE = (Xf)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.a_(var1);
      this.dN.dN(var1);
      var1.wU(" ? ");
      this.ld.dN(var1);
      var1.wU(" : ");
      this.QE.dN(var1);
   }
}
