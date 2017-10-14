package jebglobal;

import jebglobal.fv;

public final class MS extends fv {
   private final boolean dN;

   public MS(boolean var1, String var2) {
      super("bool", var2);
      this.dN = var1;
   }

   protected String dN() {
      return this.dN?"true":"false";
   }
}
