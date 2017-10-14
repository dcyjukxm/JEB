package jebglobal;

import java.util.LinkedHashSet;
import java.util.Set;
import jebglobal.Me;
import jebglobal.NM;
import jebglobal.cN;
import jebglobal.dx;

public final class Ug {
   private final cN dN;
   private final Me ld;
   private final NM QE;
   private final Set wU = new LinkedHashSet();

   public Ug(cN var1, Me var2, NM var3) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
   }

   public String dN() {
      return "values" + this.QE.dN().dN() + "/" + this.ld.dN() + (this.ld.dN().endsWith("s")?"":"s") + ".xml";
   }

   public Set ld() {
      return this.wU;
   }

   public boolean dN(dx var1) {
      return this.dN.QE(var1.QE().wU());
   }

   public void ld(dx var1) {
      this.wU.add(var1);
   }

   public boolean equals(Object var1) {
      if(var1 == null) {
         return false;
      } else if(this.getClass() != var1.getClass()) {
         return false;
      } else {
         Ug var2 = (Ug)var1;
         return this.ld == var2.ld || this.ld != null && this.ld.equals(var2.ld)?this.QE == var2.QE || this.QE != null && this.QE.equals(var2.QE):false;
      }
   }

   public int hashCode() {
      int var1 = 185 + (this.ld != null?this.ld.hashCode():0);
      var1 = 37 * var1 + (this.QE != null?this.QE.hashCode():0);
      return var1;
   }
}
