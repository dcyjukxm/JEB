package jebglobal;

import jebglobal.AR;
import jebglobal.Cl;
import jebglobal.Uk;
import jebglobal.ub;
import jebglobal.xd;
import jebglobal.yK;

public final class Mx extends Cl {
   Mx(AR var1, int var2) {
      super(var1, var2);
   }

   public int dN(int var1, int var2, int var3, int[] var4, int var5, xd var6, Uk var7, ub[] var8) {
      int var9 = this.ld.size();
      yK var10 = new yK(this.dN, var9, var1, var2, var3, var4, var5, var6, var7, var8);
      this.ld.add(var10);
      this.QE.put(var10.ld(false), var10);
      return var9;
   }
}
