package jebglobal;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import jebglobal.GV;
import jebglobal.RB;

public final class Br {
   public static byte[] dN(InputStream var0) {
      RB var1 = new RB();
      dN(var0, var1);
      return var1.dN();
   }

   public static int dN(InputStream var0, OutputStream var1) {
      long var2 = ld(var0, var1);
      return var2 > 2147483647L?-1:(int)var2;
   }

   public static long ld(InputStream var0, OutputStream var1) {
      return dN(var0, var1, new byte[4096]);
   }

   public static long dN(InputStream var0, OutputStream var1, byte[] var2) {
      long var3;
      int var5;
      for(var3 = 0L; -1 != (var5 = var0.read(var2)); var3 += (long)var5) {
         var1.write(var2, 0, var5);
      }

      return var3;
   }

   static {
      char var10000 = File.separatorChar;
      GV var0 = new GV(4);
      PrintWriter var1 = new PrintWriter(var0);
      var1.println();
      var1.close();
   }
}
