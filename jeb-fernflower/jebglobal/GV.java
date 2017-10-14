package jebglobal;

import java.io.Serializable;
import java.io.Writer;

public final class GV extends Writer implements Serializable {
   private final StringBuilder dN;

   public GV() {
      this.dN = new StringBuilder();
   }

   public GV(int var1) {
      this.dN = new StringBuilder(var1);
   }

   public Writer append(char var1) {
      this.dN.append(var1);
      return this;
   }

   public Writer append(CharSequence var1) {
      this.dN.append(var1);
      return this;
   }

   public Writer append(CharSequence var1, int var2, int var3) {
      this.dN.append(var1, var2, var3);
      return this;
   }

   public void close() {
   }

   public void flush() {
   }

   public void write(String var1) {
      if(var1 != null) {
         this.dN.append(var1);
      }

   }

   public void write(char[] var1, int var2, int var3) {
      if(var1 != null) {
         this.dN.append(var1, var2, var3);
      }

   }

   public String toString() {
      return this.dN.toString();
   }
}
