package jebglobal;

import jebglobal.yn;
import org.eclipse.swt.graphics.Image;

public abstract class as {
   protected yn dN;
   private String KK = null;
   protected int ld = 0;
   protected int QE = 0;
   protected int wU = 0;
   private int EO = 0;
   protected Image fa = null;
   protected boolean zs = true;
   protected int mS = -1;
   protected boolean OK = false;
   protected int LH = -1;
   private boolean cb = true;

   public as(yn var1, String var2) {
      this.dN = var1;
      this.KK = var2;
   }

   public yn dN() {
      return this.dN;
   }

   public String ld() {
      return this.KK;
   }

   public int QE() {
      return this.ld;
   }

   public int wU() {
      return this.QE;
   }

   public int fa() {
      return this.wU;
   }

   public int zs() {
      return 0;
   }

   public Image mS() {
      return this.fa;
   }

   public boolean dN(int[] var1) {
      if(this.zs && var1 != null && var1.length >= 1) {
         var1[0] = this.mS;
      }

      return this.zs;
   }

   public boolean ld(int[] var1) {
      if(this.OK && var1 != null && var1.length >= 1) {
         var1[0] = this.LH;
      }

      return this.OK;
   }

   public boolean QE(int[] var1) {
      return this.cb;
   }

   public abstract boolean OK();

   public abstract boolean LH();
}
