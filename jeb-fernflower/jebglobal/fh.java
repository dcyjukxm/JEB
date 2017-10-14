package jebglobal;

public final class fh {
   private int[] dN = new int[32];
   private int ld;
   private int QE;
   private int wU;

   public final void dN() {
      this.ld = 0;
      this.QE = 0;
      this.wU = 0;
   }

   public final int ld() {
      if(this.ld == 0) {
         return 0;
      } else {
         int var1 = this.ld - 1;
         return this.dN[var1];
      }
   }

   public final int dN(int var1) {
      if(this.ld != 0 && var1 >= 0) {
         if(var1 > this.wU) {
            var1 = this.wU;
         }

         int var2 = 0;

         for(int var3 = 0; var1 != 0; --var1) {
            int var4 = this.dN[var3];
            var2 += var4;
            var3 += 2 + var4 * 2;
         }

         return var2;
      } else {
         return 0;
      }
   }

   public final void dN(int var1, int var2) {
      if(this.wU == 0) {
         this.fa();
      }

      this.fa(2);
      int var3 = this.ld - 1;
      int var4 = this.dN[var3];
      this.dN[var3 - 1 - var4 * 2] = var4 + 1;
      this.dN[var3] = var1;
      this.dN[var3 + 1] = var2;
      this.dN[var3 + 2] = var4 + 1;
      this.ld += 2;
      ++this.QE;
   }

   public final boolean QE() {
      if(this.ld == 0) {
         return false;
      } else {
         int var1 = this.ld - 1;
         int var2 = this.dN[var1];
         if(var2 == 0) {
            return false;
         } else {
            --var2;
            var1 -= 2;
            this.dN[var1] = var2;
            var1 -= 1 + var2 * 2;
            this.dN[var1] = var2;
            this.ld -= 2;
            --this.QE;
            return true;
         }
      }
   }

   public final int ld(int var1) {
      return this.ld(var1, true);
   }

   public final int QE(int var1) {
      return this.ld(var1, false);
   }

   public final int wU(int var1) {
      return this.dN(var1, false);
   }

   public final int wU() {
      return this.wU;
   }

   public final void fa() {
      this.fa(2);
      int var1 = this.ld;
      this.dN[var1] = 0;
      this.dN[var1 + 1] = 0;
      this.ld += 2;
      ++this.wU;
   }

   public final void zs() {
      if(this.ld != 0) {
         int var1 = this.ld - 1;
         int var2 = this.dN[var1];
         if(var1 - 1 - var2 * 2 != 0) {
            this.ld -= 2 + var2 * 2;
            this.QE -= var2;
            --this.wU;
         }
      }
   }

   private void fa(int var1) {
      int var2 = this.dN.length - this.ld;
      if(var2 <= var1) {
         int var3 = (this.dN.length + var2) * 2;
         int[] var4 = new int[var3];
         System.arraycopy(this.dN, 0, var4, 0, this.ld);
         this.dN = var4;
      }
   }

   private final int dN(int var1, boolean var2) {
      if(this.ld == 0) {
         return -1;
      } else {
         int var3 = this.ld - 1;

         for(int var4 = this.wU; var4 != 0; --var4) {
            int var5 = this.dN[var3];

            for(var3 -= 2; var5 != 0; --var5) {
               if(var2) {
                  if(this.dN[var3] == var1) {
                     return this.dN[var3 + 1];
                  }
               } else if(this.dN[var3 + 1] == var1) {
                  return this.dN[var3];
               }

               var3 -= 2;
            }
         }

         return -1;
      }
   }

   private final int ld(int var1, boolean var2) {
      if(this.ld != 0 && var1 >= 0) {
         int var3 = 0;

         for(int var4 = this.wU; var4 != 0; --var4) {
            int var5 = this.dN[var3];
            if(var1 < var5) {
               var3 += 1 + var1 * 2;
               if(!var2) {
                  ++var3;
               }

               return this.dN[var3];
            }

            var1 -= var5;
            var3 += 2 + var5 * 2;
         }

         return -1;
      } else {
         return -1;
      }
   }
}
