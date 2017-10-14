package jebglobal;

public final class wk implements Comparable {
   private int dN;
   private int ld;
   private int QE;

   public wk(int var1, int var2, int var3) {
      if(var1 >= 0 && var2 >= 0 && var3 >= 0) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
      } else {
         throw new RuntimeException();
      }
   }

   public int dN() {
      return this.dN;
   }

   public int ld() {
      return this.ld;
   }

   public int QE() {
      return this.QE;
   }

   public int hashCode() {
      int var1 = 31 + this.QE;
      var1 = 31 * var1 + this.dN;
      var1 = 31 * var1 + this.ld;
      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         wk var2 = (wk)var1;
         return this.dN == var2.dN && this.ld == var2.ld && this.QE == var2.QE;
      } else {
         return false;
      }
   }

   public int dN(wk var1) {
      return this.dN > var1.dN?1:(this.dN == var1.dN && this.ld > var1.ld?1:(this.dN == var1.dN && this.ld == var1.ld?this.QE - var1.QE:-1));
   }

   public String toString() {
      return String.format("%d.%d.%d", new Object[]{Integer.valueOf(this.dN), Integer.valueOf(this.ld), Integer.valueOf(this.QE)});
   }

   public static wk dN(String var0) {
      String[] var1 = var0.trim().split("\\.", -1);

      try {
         int var2 = Integer.parseInt(var1[0]);
         int var3 = Integer.parseInt(var1[1]);
         int var4 = Integer.parseInt(var1[2]);

         try {
            return new wk(var2, var3, var4);
         } catch (Exception var5) {
            return null;
         }
      } catch (NumberFormatException var6) {
         return null;
      }
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.dN((wk)var1);
   }
}
