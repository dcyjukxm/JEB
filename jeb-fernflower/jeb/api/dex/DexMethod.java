package jeb.api.dex;

import jebglobal.hO;

public class DexMethod {
   private hO m;

   DexMethod(hO var1) {
      this.m = var1;
   }

   public int getIndex() {
      return this.m.dN();
   }

   public int getClassTypeIndex() {
      return this.m.fa();
   }

   public int getPrototypeIndex() {
      return this.m.mS();
   }

   public int getNameIndex() {
      return this.m.LH();
   }

   public String getName() {
      return this.m.ld(true);
   }

   public String getName(boolean var1) {
      return this.m.ld(var1);
   }

   public String getSignature(boolean var1) {
      return this.m.wU(var1);
   }
}
