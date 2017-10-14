package jebglobal;

import java.util.LinkedHashMap;
import java.util.Map;
import jebglobal.Ja;
import jebglobal.UW;
import jebglobal.dx;

public final class NM {
   private final Ja dN;
   private final Map ld = new LinkedHashMap();

   public NM(Ja var1) {
      this.dN = var1;
   }

   public Ja dN() {
      return this.dN;
   }

   public void dN(dx var1) {
      this.dN(var1, false);
   }

   public void dN(dx var1, boolean var2) {
      UW var3 = var1.QE();
      if(!this.ld.containsKey(var3) || var2) {
         this.ld.put(var3, var1);
      }
   }

   public String toString() {
      return this.dN.toString();
   }
}
