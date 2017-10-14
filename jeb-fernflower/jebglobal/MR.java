package jebglobal;

import java.io.InputStream;
import jebglobal.ca;

public final class MR extends ca {
   private long dN;

   public MR(InputStream var1) {
      super(var1);
   }

   public synchronized long skip(long var1) {
      long var3 = super.skip(var1);
      this.dN += var3;
      return var3;
   }

   protected synchronized void dN(int var1) {
      if(var1 != -1) {
         this.dN += (long)var1;
      }

   }

   public int dN() {
      long var1 = this.ld();
      if(var1 > 2147483647L) {
         throw new ArithmeticException("The byte count " + var1 + " is too large to be converted to an int");
      } else {
         return (int)var1;
      }
   }

   public synchronized long ld() {
      return this.dN;
   }
}
