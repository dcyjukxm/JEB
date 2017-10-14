package jebglobal;

import jebglobal.TM;
import jebglobal.Xp;

public final class QA {
   private Thread dN;
   private boolean ld;
   private Xp QE;
   private Runnable wU;
   private Runnable fa;
   private QA.uK zs;
   private boolean mS;

   public QA(Thread var1, boolean var2, Xp var3, Runnable var4, Runnable var5) {
      if(var1 != null && var3 != null) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
         this.wU = var4;
         this.fa = var5;
         this.zs = QA.uK.dN;
      } else {
         throw new RuntimeException();
      }
   }

   public synchronized QA.uK dN() {
      return this.zs;
   }

   private synchronized void dN(QA.uK var1) {
      this.zs = var1;
   }

   public synchronized boolean ld() {
      return this.zs == QA.uK.QE || this.zs == QA.uK.wU;
   }

   public synchronized Thread dN(final boolean var1) {
      if(this.zs != QA.uK.dN) {
         throw new RuntimeException();
      } else {
         this.dN(QA.uK.ld);
         Thread var2 = TM.ld(new Runnable() {
            // $FF: synthetic field
            private boolean dN = var1;
            // $FF: synthetic field
            private QA ld = QA.this;

            public void run() {
               if(this.ld.wU != null) {
                  this.ld.wU.run();
               }

               if(!this.ld.ld) {
                  this.ld.dN.start();
               }

               this.ld.mS = TM.dN(this.ld.dN, this.ld.QE);
               Object[] var10000 = new Object[]{Boolean.valueOf(this.ld.mS)};
               if(this.ld.fa != null) {
                  this.ld.fa.run();
               }

               if(!this.dN) {
                  this.ld.dN(this.ld.mS?QA.uK.QE:QA.uK.wU);
               }

            }
         });
         if(var1) {
            try {
               var2.join();
               this.dN(this.mS?QA.uK.QE:QA.uK.wU);
            } catch (InterruptedException var3) {
               this.dN(QA.uK.wU);
            }
         }

         return var2;
      }
   }

   public static enum uK {
      dN,
      ld,
      QE,
      wU;
   }
}
