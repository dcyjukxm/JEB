package jeb.api.dex;

import jebglobal.gE;

public class DexField {
   private gE f;

   DexField(gE var1) {
      this.f = var1;
   }

   public int getIndex() {
      return this.f.dN();
   }

   public int getClassTypeIndex() {
      return this.f.fa();
   }

   public int getTypeIndex() {
      return this.f.mS().dN();
   }

   public int getNameIndex() {
      return this.f.OK();
   }

   public String getName() {
      return this.f.QE(true);
   }

   public String getName(boolean var1) {
      return this.f.QE(var1);
   }

   public String getSignature(boolean var1) {
      return this.f.fa(var1);
   }
}
