package jebglobal;

import java.util.HashSet;
import jebglobal.GS;

public final class YK implements GS {
   private int dN;

   public YK(int var1) {
      if(var1 < 0) {
         throw new RuntimeException();
      } else {
         this.dN = var1;
      }
   }

   public int dN() {
      return this.dN;
   }

   public HashSet fa() {
      return new HashSet();
   }

   public String toString() {
      return String.format("@%d", new Object[]{Integer.valueOf(this.dN)});
   }
}
