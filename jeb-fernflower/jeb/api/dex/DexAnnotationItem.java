package jeb.api.dex;

import jeb.api.dex.DexAnnotation;
import jebglobal.kg;
import jebglobal.xd;

public class DexAnnotationItem {
   public static final int VISIBILITY_BUILD = 0;
   public static final int VISIBILITY_RUNTIME = 1;
   public static final int VISIBILITY_SYSTEM = 2;
   xd.uK ai;

   DexAnnotationItem(xd.uK var1) {
      this.ai = var1;
   }

   public int getVisibility() {
      return this.ai.dN();
   }

   public DexAnnotation getAnnotation() {
      kg var1 = this.ai.ld();
      return var1 == null?null:new DexAnnotation(var1);
   }
}
