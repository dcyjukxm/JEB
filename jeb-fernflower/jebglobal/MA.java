package jebglobal;

import jebglobal.Kf;
import jebglobal.Mt;
import jebglobal.PS;
import jebglobal.UD;
import jebglobal.Vi;
import jebglobal.dx;
import jebglobal.fv;

public final class MA extends Vi implements Mt {
   private final fv[] ld = new fv[6];
   private static final String[] QE = new String[]{"other", "zero", "one", "two", "few", "many"};

   MA(UD var1, PS[] var2) {
      super(var1);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         this.ld[((Integer)var2[var3].dN).intValue() - 16777220] = (fv)var2[var3].ld;
      }

   }

   public void dN(Kf var1, dx var2) {
      var1.ld((String)null, "plurals");
      var1.dN((String)null, "name", var2.QE().fa());

      for(int var3 = 0; var3 < this.ld.length; ++var3) {
         fv var4 = this.ld[var3];
         if(var4 != null) {
            var1.ld((String)null, "item");
            var1.dN((String)null, "quantity", QE[var3]);
            var1.ld(var4.mS());
            var1.QE((String)null, "item");
         }
      }

      var1.QE((String)null, "plurals");
   }
}
