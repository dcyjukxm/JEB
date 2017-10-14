package jebglobal;

import java.util.HashSet;

public final class fZ {
   private long dN;
   private long ld;
   private long QE;
   private HashSet wU;

   public fZ(long var1) {
      this.dN = var1;
      System.currentTimeMillis();
      this.ld = 0L;
      this.QE = 0L;
      this.wU = new HashSet();
   }

   public synchronized long dN() {
      return this.dN;
   }

   public synchronized int ld() {
      return this.wU.size();
   }

   public synchronized void dN(long var1) {
      this.wU.add(Long.valueOf(var1));
   }

   public synchronized boolean ld(long var1) {
      return this.wU.remove(Long.valueOf(var1));
   }

   public synchronized long QE() {
      return this.ld;
   }

   public synchronized void wU() {
      this.ld = System.currentTimeMillis();
      ++this.QE;
   }

   public synchronized void QE(long var1) {
      this.dN(var1);
      this.wU();
   }
}
