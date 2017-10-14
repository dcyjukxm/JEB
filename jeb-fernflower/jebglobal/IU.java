package jebglobal;

import jebglobal.fv;

public final class IU extends fv {
   private final float dN;

   public IU(float var1, String var2) {
      super("float", var2);
      this.dN = var1;
   }

   protected String dN() {
      return String.valueOf(this.dN);
   }
}
