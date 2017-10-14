package jebglobal;

import jebglobal.CL;
import jebglobal.CW;
import jebglobal.IL;
import jebglobal.KY;
import jebglobal.Kf;
import jebglobal.XN;
import jebglobal.iR;

public final class GM {
   public static GM dN() {
      return new GM((IL)null);
   }

   protected GM(IL var1) {
      if(var1 == null) {
         IL.ld();
      }

   }

   public XN dN(iR var1) {
      return new CW(var1);
   }

   public CL dN(Kf var1) {
      return new KY(var1, this);
   }
}
