package jebglobal;

import jebglobal.OM;

public final class AV {
   private int dN;
   private int ld;
   private OM QE;
   private int[] wU = null;
   private int fa;

   AV(int var1, int var2, OM var3) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
      this.fa = 0;
   }

   public void dN(int[] var1) {
      this.wU = var1;
   }

   public int[] dN() {
      return this.wU;
   }

   public int ld() {
      return this.dN;
   }

   public int QE() {
      return this.ld;
   }

   public OM wU() {
      return this.QE;
   }

   public boolean fa() {
      return (this.ld & 65536) != 0;
   }

   public boolean zs() {
      return (this.ld & 8) != 0;
   }

   public boolean mS() {
      return (this.ld & 1024) != 0;
   }

   public boolean OK() {
      return (this.ld & 256) != 0;
   }

   public boolean LH() {
      return (this.ld & 2) != 0;
   }

   public int KK() {
      return this.fa;
   }

   public void dN(int var1) {
      this.fa = var1;
   }
}
