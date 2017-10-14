package jebglobal;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import jebglobal.Zq;
import jebglobal.zX;

public final class Bl {
   private final Map dN = new HashMap();

   public void dN(InputStream var1, OutputStream var2, String var3) {
      this.dN(var3).dN(var1, var2);
   }

   public Zq dN(String var1) {
      Zq var2 = (Zq)this.dN.get(var1);
      if(var2 == null) {
         throw new zX();
      } else {
         return var2;
      }
   }

   public void dN(String var1, Zq var2) {
      this.dN.put(var1, var2);
   }
}
