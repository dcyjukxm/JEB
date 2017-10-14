package jebglobal;

import jebglobal.Gy;
import jebglobal.TB;
import jebglobal.Xf;
import jebglobal.hV;
import jebglobal.kn;
import jebglobal.lB;
import jebglobal.lk;
import jebglobal.tu;

public final class vC extends lB {
   public vC(tu var1, kn var2, tu var3) {
      super(var1, var2, var3);
      this.dN(hV.ld);
      if(!var2.fa()) {
         throw new RuntimeException();
      }
   }

   public Xf dN(TB var1) {
      Gy var2 = (Gy)super.dN(var1);
      return new lk(var2);
   }
}
