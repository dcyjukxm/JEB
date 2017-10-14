package jebglobal;

public final class PS {
   public final Object dN;
   public final Object ld;

   public PS(Object var1, Object var2) {
      this.dN = var1;
      this.ld = var2;
   }

   public boolean equals(Object var1) {
      if(var1 == null) {
         return false;
      } else if(this.getClass() != var1.getClass()) {
         return false;
      } else {
         PS var2 = (PS)var1;
         return this.dN == var2.dN || this.dN != null && this.dN.equals(var2.dN)?this.ld == var2.ld || this.ld != null && this.ld.equals(var2.ld):false;
      }
   }

   public int hashCode() {
      int var1 = 213 + (this.dN != null?this.dN.hashCode():0);
      var1 = 71 * var1 + (this.ld != null?this.ld.hashCode():0);
      return var1;
   }
}
