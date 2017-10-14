package jebglobal;

import java.io.Writer;
import java.util.Arrays;
import jebglobal.cn;
import jebglobal.eI;

final class eW extends Writer {
   public eW(eI var1) {
   }

   public void write(char[] var1, int var2, int var3) {
      if(var3 > 0) {
         cn.ld(new String(Arrays.copyOfRange(var1, var2, var2 + var3)));
      }

   }

   public void flush() {
   }

   public void close() {
   }
}
