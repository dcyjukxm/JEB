package jebglobal;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jebglobal.Gd;
import jebglobal.Ja;
import jebglobal.Me;
import jebglobal.cN;
import jebglobal.dx;
import jebglobal.tz;

public final class UW {
   private final tz dN;
   private final String ld;
   private final cN QE;
   private final Me wU;
   private final Map fa = new LinkedHashMap();

   public UW(tz var1, String var2, cN var3, Me var4) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
      this.wU = var4;
   }

   public Set dN() {
      return new LinkedHashSet(this.fa.values());
   }

   public dx dN(Ja var1) {
      dx var2 = (dx)this.fa.get(var1);
      if(var2 == null) {
         throw new Gd();
      } else {
         return var2;
      }
   }

   public dx ld() {
      return this.dN(new Ja());
   }

   public boolean QE() {
      return this.fa.containsKey(new Ja());
   }

   public String dN(cN var1, boolean var2) {
      return this.dN(this.zs().equals(var1), var2);
   }

   public String dN(boolean var1, boolean var2) {
      return (var1?"":this.zs().zs() + ":") + (var2?"":this.mS().dN() + "/") + this.fa();
   }

   public tz wU() {
      return this.dN;
   }

   public String fa() {
      return this.ld;
   }

   public cN zs() {
      return this.QE;
   }

   public Me mS() {
      return this.wU;
   }

   public void dN(dx var1) {
      this.dN(var1, false);
   }

   public void dN(dx var1, boolean var2) {
      Ja var3 = var1.ld().dN();
      if(!this.fa.containsKey(var3) || var2) {
         this.fa.put(var3, var1);
      }
   }

   public String toString() {
      return this.dN.toString() + " " + this.wU.toString() + "/" + this.ld;
   }
}
