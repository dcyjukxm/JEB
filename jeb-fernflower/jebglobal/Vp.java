package jebglobal;

import jebglobal.fv;

public class Vp extends fv {
   protected final int dN;

   public Vp(int var1, String var2) {
      this(var1, var2, "integer");
   }

   public Vp(int var1, String var2, String var3) {
      super(var3, var2);
      this.dN = var1;
   }

   public int ld() {
      return this.dN;
   }

   protected String dN() {
      return String.valueOf(this.dN);
   }
}
