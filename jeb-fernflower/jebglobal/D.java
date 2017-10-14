package jebglobal;

import jebglobal.Vp;

public final class D extends Vp {
   public D(int var1, String var2) {
      super(var1, var2, "color");
   }

   protected String dN() {
      return String.format("#%08x", new Object[]{Integer.valueOf(this.dN)});
   }
}
