package jebglobal;

public class jN extends Thread {
   private int dN;

   public jN(int var1) {
      if(var1 < 0) {
         var1 = 0;
      }

      this.dN = var1;
   }

   public void run() {
      try {
         Thread.sleep((long)(this.dN * 1000));
      } catch (InterruptedException var1) {
         return;
      }

   }
}
