package jebglobal;

public final class bt {
   private int dN;
   private int ld;

   public bt(int var1, int var2) {
      this.dN = var1 < 0?-1:var1;
      this.ld = var2;
   }

   public int hashCode() {
      int var1 = 31 + this.ld;
      var1 = 31 * var1 + this.dN;
      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         bt var2 = (bt)var1;
         return this.ld == var2.ld && this.dN == var2.dN;
      } else {
         return false;
      }
   }

   public boolean dN() {
      return this.dN >= 0;
   }

   public int ld() {
      return this.dN;
   }

   public int QE() {
      return this.ld;
   }

   public String toString() {
      String var1 = this.dN < 0?"X":String.format("%X", new Object[]{Integer.valueOf(this.dN)});
      return String.format("%X:t=%s", new Object[]{Integer.valueOf(this.ld), var1});
   }
}
