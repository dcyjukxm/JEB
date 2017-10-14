package jebglobal;

import java.io.PrintStream;
import jebglobal.iR;

public final class lb extends Exception {
   private Throwable dN;

   public lb(String var1) {
      super(var1);
   }

   public lb(String var1, iR var2, Throwable var3) {
      super((var1 == null?"":var1 + " ") + (var2 == null?"":"(position:" + var2.cb() + ") ") + (var3 == null?"":"caused by: " + var3));
      if(var2 != null) {
         var2.OK();
         var2.rK();
      }

      this.dN = var3;
   }

   public void printStackTrace() {
      if(this.dN == null) {
         super.printStackTrace();
      } else {
         PrintStream var1 = System.err;
         synchronized(System.err) {
            System.err.println(super.getMessage() + "; nested exception is:");
            this.dN.printStackTrace();
         }
      }

   }
}
