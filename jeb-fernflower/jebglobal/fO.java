package jebglobal;

import jebglobal.De;
import jebglobal.Vm;
import jebglobal.jN;

public class fO {
   private static final long LK = 844563159190538443L;
   private static Vm dN;
   private static Thread ld;
   private static Thread QE;

   public static void dN(Vm var0) {
      if(dN != null) {
         throw new RuntimeException();
      } else {
         dN = var0;
      }
   }

   public static synchronized void dN() {
      if(ld == null) {
         ld = new De();
         ld.setDaemon(true);
         ld.start();
      }

   }

   public static synchronized void ld() {
      if(QE == null) {
         QE = new jN(120);
         QE.start();
      }

   }

   public static synchronized void QE() {
      if(QE != null) {
         QE.interrupt();

         try {
            QE.join(5000L);
         } catch (InterruptedException var0) {
            return;
         }

         QE = null;
      }

   }
}
