package jebglobal;

import java.util.Iterator;
import java.util.List;
import jebglobal.Wu;
import jebglobal.nm;
import jebglobal.oh;
import jebglobal.vD;
import jebglobal.yL;

public final class OM {
   private int dN = -1;
   private int ld;
   private int QE;
   private int wU;
   private vD fa;
   private int zs;
   private int mS;
   private List OK;
   private oh LH;
   private nm[] KK;

   OM(int var1, int var2, int var3, vD var4, int var5, int var6, List var7, oh var8, nm[] var9) {
      if(var1 >= 0 && var2 >= 0 && var3 >= 0 && var5 >= 0 && var7 != null) {
         this.ld = var1;
         this.QE = var2;
         this.wU = var3;
         this.fa = var4;
         this.zs = var5;
         this.mS = var6;
         this.OK = var7;
         this.LH = var8;
         this.KK = var9 == null?new nm[0]:var9;
      } else {
         throw new yL();
      }
   }

   void dN(int var1) {
      this.dN = var1;
   }

   public int dN() {
      return this.dN;
   }

   public int ld() {
      return this.zs;
   }

   public int QE() {
      return this.mS;
   }

   public List wU() {
      return this.OK;
   }

   public oh fa() {
      return this.LH;
   }

   public Wu ld(int var1) {
      Iterator var2 = this.OK.iterator();

      Wu var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (Wu)var2.next();
      } while(var3.dN() != var1);

      return var3;
   }

   public int zs() {
      return this.ld;
   }

   public int mS() {
      return this.QE;
   }

   public int OK() {
      return this.wU;
   }

   public nm[] LH() {
      return this.KK;
   }

   public vD KK() {
      return this.fa;
   }

   public static String QE(int var0) {
      return String.format("%X", new Object[]{Integer.valueOf(var0)});
   }
}
