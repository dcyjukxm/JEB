package jebglobal;

public final class XV {
   private int dN;
   private int ld;
   private int QE;

   XV(int var1, int var2) {
      this.dN = var1;
      this.ld = var2;
      this.QE = 0;
   }

   public int dN() {
      return this.dN;
   }

   public int ld() {
      return this.ld;
   }

   public boolean QE() {
      return (this.ld & 8) != 0;
   }

   public int wU() {
      return this.QE;
   }

   public void dN(int var1) {
      this.QE = var1;
   }
}
