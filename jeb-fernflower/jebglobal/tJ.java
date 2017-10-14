package jebglobal;

import jebglobal.AR;
import jebglobal.Cl;
import jebglobal.gE;

public final class tJ extends Cl {
   tJ(AR var1, int var2) {
      super(var1, var2);
   }

   public int dN(int var1, int var2, int var3) {
      int var4 = this.ld.size();
      gE var5 = new gE(this.dN, var4, var1, var2, var3);
      this.ld.add(var5);
      this.QE.put(var5.fa(false), var5);
      return var4;
   }
}
