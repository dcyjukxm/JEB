package jebglobal;

import jebglobal.AR;
import jebglobal.Cl;
import jebglobal.hO;

public final class Fx extends Cl {
   Fx(AR var1, int var2) {
      super(var1, var2);
   }

   public int dN(int var1, int var2, int var3) {
      int var4 = this.ld.size();
      hO var5 = new hO(this.dN, var4, var1, var2, var3);
      this.ld.add(var5);
      this.QE.put(var5.wU(false), var5);
      return var4;
   }
}
