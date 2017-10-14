package jeb.api.dex;

import java.util.ArrayList;
import java.util.List;
import jeb.api.dex.DexValue;
import jebglobal.kg;

public class DexAnnotation {
   kg a;

   DexAnnotation(kg var1) {
      this.a = var1;
   }

   public int getTypeIndex() {
      return this.a.dN();
   }

   public List getElements() {
      ArrayList var1 = new ArrayList(this.a.ld().length);
      kg.uK[] var2 = this.a.ld();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         kg.uK var5 = var2[var4];
         var1.add(new DexAnnotation.Element(var5));
      }

      return var1;
   }

   public static class Element {
      kg.uK e;

      Element(kg.uK var1) {
         this.e = var1;
      }

      public int getNameIndex() {
         return this.e.dN();
      }

      public DexValue getValue() {
         return new DexValue(this.e.ld());
      }
   }
}
