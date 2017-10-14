package jebglobal;

import java.io.File;
import java.security.cert.Certificate;
import jebglobal.AM;
import jebglobal.Uw;

public final class vd extends AM {
   private Certificate[] ld;

   public vd(String var1, boolean var2) {
      super(var1, var2);
   }

   public Certificate[] dN() {
      if(this.ld == null) {
         this.ld = this.QE("AndroidManifest.xml");
      }

      return this.ld;
   }

   public boolean dN(File var1) {
      try {
         Uw var2 = new Uw(this.dN);
         var2.dN(true);
         var2.ld(var1);
         var2.dN(0);
         var2.ld(257);
         var2.dN();
         return true;
      } catch (Exception var3) {
         return false;
      }
   }
}
