package jebglobal;

import jebglobal.ED;
import jebglobal.Kf;
import jebglobal.MA;
import jebglobal.Mt;
import jebglobal.PS;
import jebglobal.UD;
import jebglobal.aj;
import jebglobal.dN;
import jebglobal.dx;
import jebglobal.eA;

public class Vi extends ED implements Mt {
   protected final UD dN;

   public Vi(UD var1) {
      this.dN = var1;
   }

   public void dN(Kf var1, dx var2) {
      String var3 = var2.QE().mS().dN();
      if("style".equals(var3)) {
         (new aj(this.dN, new PS[0], (dN)null)).dN(var1, var2);
      } else if("array".equals(var3)) {
         (new eA(this.dN, new PS[0])).dN(var1, var2);
      } else if("plurals".equals(var3)) {
         (new MA(this.dN, new PS[0])).dN(var1, var2);
      } else {
         var1.ld((String)null, "item");
         var1.dN((String)null, "type", var3);
         var1.dN((String)null, "name", var2.QE().fa());
         var1.QE((String)null, "item");
      }
   }
}
