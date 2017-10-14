package jebglobal;

import java.util.HashMap;
import java.util.Iterator;
import jebglobal.cn;
import jebglobal.fZ;
import jebglobal.rP;

public class Am implements Runnable {
   private static final long LK = 844563159190538443L;
   private HashMap dN = new HashMap();
   private int ld = 1;
   private static long QE = 3000L;
   private static long wU = 10000L;

   public Am() {
      cn.dN(String.format(rP.dN(new byte[]{13, 0, 4, 28, 72, 73, 66, 12, 84, 67, 68, 10, 76, 78, 69, 17, 74, 26, 12, 77, 83, 73, 17, 64, 69, 77, 58, 30, 21, 2, 2, 0, 79, 20, 29, 8, 86, 79, 17, 79, 7, 26, 22, 67, 21, 70, 18, 6, 76, 29, 9, 29, 22, 83, 77, 79, 47, 24, 30, 79, 30, 5, 2, 26, 84, 26, 78, 1, 17, 18, 11, 17, 19}, 2, 70), new Object[]{Integer.valueOf(this.ld)}));
   }

   public void run() {
      while(true) {
         this.ld();

         try {
            Thread.sleep(QE);
         } catch (InterruptedException var1) {
            return;
         }
      }
   }

   private synchronized int ld() {
      int var1 = 0;
      long var2 = System.currentTimeMillis();
      Iterator var4 = this.dN.values().iterator();

      while(var4.hasNext()) {
         fZ var5 = (fZ)var4.next();
         if(var2 - var5.QE() >= wU) {
            long var6 = var5.dN();
            if(this.dN.remove(Long.valueOf(var6)) != null) {
               ++var1;
            }
         }
      }

      return var1;
   }

   public synchronized boolean dN(long var1, long var3) {
      fZ var5 = (fZ)this.dN.get(Long.valueOf(var1));
      if(var5 == null) {
         if(this.dN.size() >= this.ld) {
            return false;
         }

         var5 = new fZ(var1);
         this.dN.put(Long.valueOf(var1), var5);
      }

      var5.QE(var3);
      return true;
   }

   public synchronized boolean ld(long var1, long var3) {
      fZ var5 = (fZ)this.dN.get(Long.valueOf(var1));
      if(var5 != null) {
         var5.ld(var3);
         if(var5.ld() == 0 && this.dN.remove(Long.valueOf(var1)) != null) {
            return true;
         }
      }

      return false;
   }

   public synchronized Am.uK dN() {
      Am.uK var1 = new Am.uK();
      var1.dN = this.ld;
      var1.ld = this.dN.size();
      return var1;
   }

   public static class uK {
      private int dN;
      private int ld;

      public int dN() {
         return this.dN;
      }

      public int ld() {
         return this.ld;
      }
   }
}
