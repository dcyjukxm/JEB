package jebglobal;

import jebglobal.Kf;
import jebglobal.TM;
import jebglobal.dx;
import jebglobal.fv;

public final class kB extends fv {
   public kB(String var1) {
      this(var1, "string");
   }

   public kB(String var1, String var2) {
      super(var2, var1);
   }

   public String fa() {
      return TM.ld(this.ld);
   }

   public String zs() {
      return TM.fa(TM.QE(this.ld));
   }

   public String mS() {
      return TM.QE(this.ld);
   }

   protected String dN() {
      throw new UnsupportedOperationException();
   }

   protected void ld(Kf var1, dx var2) {
      if(TM.wU(this.ld)) {
         var1.dN((String)null, "formatted", "false");
      }

   }
}
