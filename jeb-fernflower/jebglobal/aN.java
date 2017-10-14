package jebglobal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jebglobal.Br;
import jebglobal.Zq;
import jebglobal.zX;

public final class aN implements Zq {
   public void dN(InputStream var1, OutputStream var2) {
      try {
         Br.dN(var1, var2);
      } catch (IOException var3) {
         throw new zX();
      }
   }
}
