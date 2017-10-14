package jebglobal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class ca extends FilterInputStream {
   public ca(InputStream var1) {
      super(var1);
   }

   public int read() {
      try {
         int var1 = this.in.read();
         this.dN(var1 != -1?1:-1);
         return var1;
      } catch (IOException var2) {
         this.dN(var2);
         return -1;
      }
   }

   public int read(byte[] var1) {
      try {
         int var2 = this.in.read(var1);
         this.dN(var2);
         return var2;
      } catch (IOException var3) {
         this.dN(var3);
         return -1;
      }
   }

   public int read(byte[] var1, int var2, int var3) {
      try {
         int var4 = this.in.read(var1, var2, var3);
         this.dN(var4);
         return var4;
      } catch (IOException var5) {
         this.dN(var5);
         return -1;
      }
   }

   public long skip(long var1) {
      try {
         return this.in.skip(var1);
      } catch (IOException var4) {
         this.dN(var4);
         return 0L;
      }
   }

   public int available() {
      try {
         return super.available();
      } catch (IOException var2) {
         this.dN(var2);
         return 0;
      }
   }

   public void close() {
      try {
         this.in.close();
      } catch (IOException var2) {
         this.dN(var2);
      }

   }

   public synchronized void mark(int var1) {
      this.in.mark(var1);
   }

   public synchronized void reset() {
      try {
         this.in.reset();
      } catch (IOException var2) {
         this.dN(var2);
      }

   }

   public boolean markSupported() {
      return this.in.markSupported();
   }

   protected void dN(int var1) {
   }

   protected void dN(IOException var1) {
      throw var1;
   }
}
