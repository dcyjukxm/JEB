package jebglobal;

import jebglobal.YJ;
import jebglobal.Zh;

public final class Nd extends YJ {
   private int dN;
   private int ld;
   private Zh QE;
   private int wU;
   private Object fa;
   private Object zs;
   private boolean mS;

   protected Nd(int var1, int var2, Zh var3, int var4, Object var5, Object var6) {
      super(0, 0, var3, 0);
      if(var2 >= 0 && var1 >= 0) {
         if(var2 <= 1023 && var1 <= 4095 && var4 >= 0 && var4 <= 7) {
            throw new RuntimeException();
         } else {
            this.dN = var1;
            this.ld = var2;
            this.QE = var3;
            this.wU = var4;
            this.fa = var5;
            this.zs = var6;
            this.mS = false;
         }
      } else {
         throw new RuntimeException();
      }
   }

   public Zh dN() {
      return this.QE;
   }

   public int ld() {
      return this.ld;
   }

   public int QE() {
      return this.dN;
   }

   public int wU() {
      return this.ld + this.dN;
   }

   public int fa() {
      return this.wU;
   }

   public Object zs() {
      return this.fa;
   }

   public Object mS() {
      return this.zs;
   }

   public void dN(int var1) {
      if(var1 < 0) {
         throw new RuntimeException();
      } else {
         this.ld = var1;
      }
   }

   public void ld(int var1) {
      int var2 = this.dN + var1;
      if(var2 < 0) {
         throw new RuntimeException();
      } else {
         this.dN = var2;
      }
   }

   public boolean OK() {
      return this.mS;
   }

   public void dN(boolean var1) {
      this.mS = var1;
   }
}
