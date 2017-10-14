package jebglobal;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class RB extends OutputStream {
   private static final byte[] dN = new byte[0];
   private final List ld;
   private int QE;
   private int wU;
   private byte[] fa;
   private int zs;

   public RB() {
      this(1024);
   }

   public RB(int var1) {
      this.ld = new ArrayList();
      if(var1 < 0) {
         throw new IllegalArgumentException("Negative initial size: " + var1);
      } else {
         synchronized(this) {
            this.dN(var1);
         }
      }
   }

   private void dN(int var1) {
      if(this.QE < this.ld.size() - 1) {
         this.wU += this.fa.length;
         ++this.QE;
         this.fa = (byte[])this.ld.get(this.QE);
      } else {
         int var2;
         if(this.fa == null) {
            var2 = var1;
            this.wU = 0;
         } else {
            var2 = Math.max(this.fa.length << 1, var1 - this.wU);
            this.wU += this.fa.length;
         }

         ++this.QE;
         this.fa = new byte[var2];
         this.ld.add(this.fa);
      }

   }

   public void write(byte[] var1, int var2, int var3) {
      if(var2 >= 0 && var2 <= var1.length && var3 >= 0 && var2 + var3 <= var1.length && var2 + var3 >= 0) {
         if(var3 != 0) {
            synchronized(this) {
               int var5 = this.zs + var3;
               int var6 = var3;
               int var7 = this.zs - this.wU;

               while(var6 > 0) {
                  int var8 = Math.min(var6, this.fa.length - var7);
                  System.arraycopy(var1, var2 + var3 - var6, this.fa, var7, var8);
                  var6 -= var8;
                  if(var6 > 0) {
                     this.dN(var5);
                     var7 = 0;
                  }
               }

               this.zs = var5;
            }
         }
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   public synchronized void write(int var1) {
      int var2 = this.zs - this.wU;
      if(var2 == this.fa.length) {
         this.dN(this.zs + 1);
         var2 = 0;
      }

      this.fa[var2] = (byte)var1;
      ++this.zs;
   }

   public void close() {
   }

   public synchronized byte[] dN() {
      int var1 = this.zs;
      if(var1 == 0) {
         return dN;
      } else {
         byte[] var2 = new byte[var1];
         int var3 = 0;
         Iterator var4 = this.ld.iterator();

         while(var4.hasNext()) {
            byte[] var5 = (byte[])var4.next();
            int var6 = Math.min(var5.length, var1);
            System.arraycopy(var5, 0, var2, var3, var6);
            var3 += var6;
            var1 -= var6;
            if(var1 == 0) {
               break;
            }
         }

         return var2;
      }
   }

   public String toString() {
      return new String(this.dN());
   }
}
