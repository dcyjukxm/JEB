package jebglobal;

import jebglobal.AR;
import jebglobal.Bw;
import jebglobal.Cl;

public final class bG extends Cl {
   bG(AR var1, int var2) {
      super(var1, var2);
   }

   int dN(int var1, int var2, int[] var3) {
      int var4 = this.ld.size();
      Bw var5 = new Bw(this.dN, var4, var1, var2, var3);
      this.ld.add(var5);
      this.QE.put(var5.QE(false), var5);
      return var4;
   }
}
