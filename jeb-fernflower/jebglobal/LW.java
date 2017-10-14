package jebglobal;

import jebglobal.hv;

public final class LW {
   private int dN = 0;
   private hv ld = null;
   private int QE = 0;

   public LW(int var1, hv var2) {
      this.dN = var1;
      this.ld = var2;
   }

   public LW(int var1, int var2) {
      this.dN = var1;
      this.QE = var2;
   }

   public int dN() {
      return this.dN;
   }

   public int ld() {
      return this.ld != null?this.ld.QE():this.QE;
   }

   public hv QE() {
      return this.ld;
   }

   public String toString() {
      return String.format("line=%d item=%s offset=%d", new Object[]{Integer.valueOf(this.dN), this.ld, Integer.valueOf(this.QE)});
   }
}
