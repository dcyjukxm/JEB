package jebglobal;

import jebglobal.Zh;
import jebglobal.hv;

public class MB implements hv {
   private int dN;

   protected MB(int var1, int var2, Zh var3, int var4) {
      int var5 = var3.ordinal();
      if(var4 >= 0 && var4 <= 15 && var5 >= 0 && var5 <= 63 && var2 >= 0 && var2 <= 1023 && var1 >= 0 && var1 <= 4095) {
         this.dN = var4 << 28 | var5 << 22 | var2 << 12 | var1;
      } else {
         throw new RuntimeException();
      }
   }

   public Zh dN() {
      return Zh.values()[this.dN >> 22 & 63];
   }

   public int ld() {
      return this.dN >> 12 & 1023;
   }

   public int QE() {
      return this.dN & 4095;
   }

   public int wU() {
      return (this.dN & 4095) + (this.dN >> 12 & 1023);
   }

   public int fa() {
      return this.dN >> 28 & 15;
   }

   public Object zs() {
      return null;
   }

   public void dN(int var1) {
      int var2 = this.ld();
      if(var1 != var2) {
         if(var1 >= 0 && var1 <= 1023) {
            this.dN &= -4190209;
            this.dN |= var1 << 12;
         } else {
            throw new RuntimeException();
         }
      }
   }

   public void ld(int var1) {
      if(var1 != 0) {
         int var2 = this.QE() + var1;
         if(var2 >= 0 && var2 <= 4095) {
            this.dN &= -4096;
            this.dN |= var2;
         } else {
            throw new RuntimeException();
         }
      }
   }
}
