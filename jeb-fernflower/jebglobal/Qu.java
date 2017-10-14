package jebglobal;

import java.io.File;
import jebglobal.LP;
import jebglobal.Qj;
import jebglobal.Sj;
import jebglobal.oM;
import jebglobal.vl;
import jebglobal.zX;

public final class Qu {
   private final Qj dN = new Qj();
   private static final String[] ld = new String[]{"resources.arsc", "AndroidManifest.xml", "res"};

   public LP dN(vl var1) {
      return this.dN.dN(var1);
   }

   public void dN(vl var1, File var2) {
      try {
         var1.dN();
         var1.dN().dN(var2, ld);
      } catch (oM var4) {
         throw new zX(var4);
      }
   }

   public void dN(vl var1, File var2, LP var3) {
      this.dN.dN(var3, var1, var2);
   }

   public void ld(vl var1, File var2) {
      try {
         Sj var3 = var1.dN();
         if(var3.ld("assets")) {
            var3.dN(var2, "assets");
         }

         if(var3.ld("lib")) {
            var3.dN(var2, "lib");
         }

      } catch (oM var4) {
         throw new zX(var4);
      }
   }
}
