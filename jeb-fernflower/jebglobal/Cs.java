package jebglobal;

import java.util.HashSet;
import jebglobal.GS;

public final class Cs implements GS {
   private int dN;

   public Cs(int var1) {
      this.dN = var1;
   }

   public int hashCode() {
      int var1 = 31 + this.dN;
      return var1;
   }

   public boolean equals(Object var1) {
      return this == var1?true:(var1 != null && this.getClass() == var1.getClass()?this.dN == ((Cs)var1).dN:false);
   }

   public int dN() {
      return this.dN;
   }

   public void dN(int var1) {
      this.dN = var1;
   }

   public HashSet fa() {
      return new HashSet();
   }

   public String toString() {
      return String.format("->%X", new Object[]{Integer.valueOf(this.dN)});
   }
}
