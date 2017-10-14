package jebglobal;

import jebglobal.Zh;
import jebglobal.hv;
import jebglobal.wy;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;

public class YJ implements hv {
   private int dN;
   private wy ld = null;
   private wy QE = null;

   protected YJ(int var1, int var2, Zh var3, int var4) {
      int var5 = var3.ordinal();
      if(var4 >= 0 && var4 <= 7 && var5 >= 0 && var5 <= 63 && var2 >= 0 && var2 <= 1023 && var1 >= 0 && var1 <= 4095) {
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
      return this.dN >> 28 & 7;
   }

   public Object zs() {
      return null;
   }

   public Object mS() {
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

   public boolean OK() {
      return (this.dN >> 31 & 1) != 0;
   }

   public void dN(boolean var1) {
      if(var1) {
         this.dN |= Integer.MIN_VALUE;
      } else {
         this.dN &= Integer.MAX_VALUE;
      }

   }

   public StyleRange QE(int var1) {
      return !this.OK()?this.dN(var1, this.ld):this.dN(var1, this.QE);
   }

   public boolean LH() {
      return this.QE != null;
   }

   public void dN(wy var1) {
      this.ld = var1;
   }

   public void ld(wy var1) {
      this.QE = var1;
   }

   private StyleRange dN(int var1, wy var2) {
      return this.dN(var1, var2.dN, var2.ld, var2.QE, var2.wU, false);
   }

   private StyleRange dN(int var1, Color var2, Color var3, boolean var4, boolean var5, boolean var6) {
      StyleRange var7 = new StyleRange();
      var7.data = this;
      var7.start = var1 + this.QE();
      var7.length = this.ld();
      var7.foreground = var2;
      var7.background = var3;
      var7.fontStyle = 0 | (var4?1:0) | (var5?2:0) | (var6?0:0);
      return var7;
   }

   public String toString() {
      return String.format("[is_active=%s beg=%d end=%d obj=%s extra=%s]", new Object[]{Boolean.valueOf(this.OK()), Integer.valueOf(this.QE()), Integer.valueOf(this.wU()), this.zs(), this.mS()});
   }
}
