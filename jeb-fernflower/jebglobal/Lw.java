package jebglobal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jebglobal.Br;
import jebglobal.Zq;
import jebglobal.zX;

public final class Lw implements Zq {
   public void dN(InputStream var1, OutputStream var2) {
      try {
         byte[] var3 = Br.dN(var1);
         var2.write(var3);
      } catch (IOException var4) {
         throw new zX(var4);
      }
   }
}
