package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.PX;

public class UY extends Thread {
   private static final long LK = 844563159190538443L;

   public void run() {
      int var1 = 0;

      while(true) {
         long var2 = this.dN();
         if(var2 == 0L) {
            var1 = 0;
         } else {
            boolean var4 = false;
            if(var2 <= -1L) {
               ++var1;
               if(var1 >= 4) {
                  var4 = true;
               }
            } else {
               var4 = true;
            }

            if(var4) {
               null.dN(var2);
            }
         }

         try {
            Thread.sleep(10000L);
         } catch (InterruptedException var5) {
            return;
         }
      }
   }

   private long dN() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         Hk var2 = new Hk(var1);
         var2.writeInt(0);
         var2.writeLong(0L);
         var2.writeLong(0L);
         var2.dN();
         int[] var3 = new int[1];
         byte[] var4 = PX.dN(var1.toByteArray(), var3);
         String var5 = PX.dN(var4);
         String var6 = null.dN(var5);
         if(var6 == null) {
            return -1L;
         } else {
            PX var7 = PX.ld(PX.dN(var6.trim()));
            if(var7 == null) {
               return -1L;
            } else {
               byte[] var8 = var7.wU();
               OZ var9 = new OZ(new ByteArrayInputStream(var8));
               int var10 = var9.readInt();
               return var10 != 1?-1L:var9.readLong();
            }
         }
      } catch (Exception var11) {
         return -1L;
      }
   }
}
