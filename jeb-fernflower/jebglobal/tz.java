package jebglobal;

public final class tz {
   public final int dN;
   public final int ld;

   public tz(int var1) {
      this(var1 >> 24, var1 >> 16 & 255, var1 & '\uffff', var1);
   }

   public tz(int var1, int var2, int var3, int var4) {
      this.dN = var1;
      this.ld = var4;
   }

   public String toString() {
      return String.format("0x%08x", new Object[]{Integer.valueOf(this.ld)});
   }

   public int hashCode() {
      int var1 = 413 + this.ld;
      return var1;
   }

   public boolean equals(Object var1) {
      if(var1 == null) {
         return false;
      } else if(this.getClass() != var1.getClass()) {
         return false;
      } else {
         tz var2 = (tz)var1;
         return this.ld == var2.ld;
      }
   }
}
