package jebglobal;

import jebglobal.ED;
import jebglobal.NM;
import jebglobal.UW;

public final class dx {
   private final NM dN;
   private final UW ld;
   private final ED QE;

   public dx(NM var1, UW var2, ED var3) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
   }

   public String dN() {
      return this.ld.mS().dN() + this.dN.dN().dN() + "/" + this.ld.fa();
   }

   public NM ld() {
      return this.dN;
   }

   public UW QE() {
      return this.ld;
   }

   public ED wU() {
      return this.QE;
   }

   public void dN(ED var1) {
      dx var2 = new dx(this.dN, this.ld, var1);
      this.dN.dN(var2, true);
      this.ld.dN(var2, true);
   }

   public String toString() {
      return this.dN();
   }
}
