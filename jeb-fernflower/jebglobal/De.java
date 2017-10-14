package jebglobal;

import jebglobal.rP;

public class De extends Thread {
   private static final long LK = 844563159190538443L;
   private static long dN = dN();

   private static long dN() {
      try {
         return ((Long)Class.forName(rP.dN(new byte[]{-113, 11, 23, 23, 79, 66, 13, 15, 9, 73, 125, 42, 10, 7, 17, 8}, 1, 229)).getMethod(rP.dN(new byte[]{32, 26, 2, 11, 23, 7, 19, 60, 29, 77, 77, 46, 64, 76, 93, 80, 74}, 2, 153), new Class[0]).invoke((Object)null, new Object[0])).longValue();
      } catch (Exception var0) {
         return 0L;
      }
   }

   public void run() {
      this.ld();
   }

   private void ld() {
      try {
         while(true) {
            int var1 = 107 * (dN % 10L == 0L?34:33);
            var1 *= 1000;
            if(dN() - dN > (long)var1) {
               ;
            }

            Long var2 = Long.valueOf(120000L);
            Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 124, 11, 91, 69, 80, 93}, 2, 142)).getMethod(rP.dN(new byte[]{48, 3, 21, 28, 2}, 2, 156), new Class[]{Long.TYPE}).invoke((Object)null, new Object[]{var2});
         }
      } catch (Exception var3) {
         ;
      }
   }
}
