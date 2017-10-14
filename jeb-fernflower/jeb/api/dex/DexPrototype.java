package jeb.api.dex;

import java.util.Arrays;
import jebglobal.Bw;

public class DexPrototype {
   private Bw p;

   DexPrototype(Bw var1) {
      this.p = var1;
   }

   public int getShortyIndex() {
      return this.p.ld();
   }

   public int getReturnTypeIndex() {
      return this.p.wU();
   }

   public int[] getParameterTypeIndexes() {
      int[] var1 = this.p.zs();
      return Arrays.copyOf(var1, var1.length);
   }
}
