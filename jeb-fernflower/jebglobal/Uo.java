package jebglobal;

import java.util.HashSet;
import java.util.List;
import jebglobal.Fu;
import jebglobal.TB;
import jebglobal.Xf;
import jebglobal.YK;
import jebglobal.ZF;
import jebglobal.hV;
import jebglobal.ie;
import jebglobal.mi;
import jebglobal.tu;
import jebglobal.xy;
import jebglobal.yX;

public class Uo extends tu implements yX {
   YK ld;
   tu[] QE;
   private String wU;
   private Uo.uK fa;

   public Uo(YK var1, tu[] var2, hV var3, String var4, Uo.uK var5) {
      this.ld = var1;
      this.QE = var2;
      this.dN = var3;
      this.wU = var4;
      this.fa = var5;
   }

   public HashSet fa() {
      HashSet var1 = new HashSet();
      tu[] var2 = this.QE;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         tu var5 = var2[var4];
         var1.addAll(var5.fa());
      }

      return var1;
   }

   public hV dN(int var1) {
      tu[] var2 = this.QE;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         tu var5 = var2[var4];
         if(!(var5 instanceof xy) && !(var5 instanceof ie)) {
            throw new RuntimeException();
         }

         hV var6 = var5.dN(var1);
         if(var6.EO()) {
            if(!var6.cb()) {
               throw new RuntimeException();
            }

            return var6;
         }
      }

      return hV.dN;
   }

   public boolean dN(int var1, hV var2) {
      boolean var3 = false;
      tu[] var4 = this.QE;
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         tu var7 = var4[var6];
         if(var7.dN(var1, var2)) {
            var3 = true;
         }
      }

      return var3;
   }

   public boolean ld() {
      return true;
   }

   public boolean QE() {
      return true;
   }

   int dN(xy var1) {
      int var2 = 0;
      tu[] var3 = this.QE;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         tu var6 = var3[var5];
         var2 += var6.dN(var1);
      }

      return var2;
   }

   int dN(xy var1, tu var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < this.QE.length; ++var4) {
         tu var5 = this.QE[var4];
         if(var5 instanceof xy) {
            if(var1.ld((xy)var5)) {
               this.QE[var4] = var2;
               ++var3;
            }
         } else {
            var3 += var5.dN(var1, var2);
         }
      }

      return var3;
   }

   int dN(xy var1, long var2) {
      int var4 = 0;

      for(int var5 = 0; var5 < this.QE.length; ++var5) {
         tu var6 = this.QE[var5];
         if(var6 instanceof xy) {
            if(var1.QE((xy)var6)) {
               hV var7 = var6.dN();
               if(ie.ld(var7)) {
                  this.QE[var5] = new ie(var2, var7);
                  ++var4;
               }
            }
         } else {
            var4 += var6.dN(var1, var2);
         }
      }

      return var4;
   }

   void dN(hV var1, hV var2) {
      super.dN(var1, var2);
      tu[] var3 = this.QE;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         tu var6 = var3[var5];
         var6.dN(var1, var2);
      }

   }

   public List wU() {
      return ZF.dN(this.QE);
   }

   public boolean dN(tu var1, tu var2) {
      for(int var3 = 0; var3 < this.QE.length; ++var3) {
         if(this.QE[var3] == var1) {
            this.QE[var3] = var2;
            return true;
         }
      }

      return false;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder("");
      if(this.wU == null) {
         var1.append("method_" + this.ld);
      } else {
         var1.append(this.wU);
      }

      var1.append("(");
      int var2 = 0;
      tu[] var3 = this.QE;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         tu var6 = var3[var5];
         if(var2 > 0) {
            var1.append(", ");
         }

         var1.append(var6);
         ++var2;
      }

      var1.append(")");
      return String.format("(%s)<%s>", new Object[]{var1, this.dN});
   }

   public Xf dN(TB var1) {
      Fu var2 = var1.mS.dN(this.ld.dN(), this.fa == Uo.uK.wU);
      mi var3 = new mi(var2, this.fa == Uo.uK.ld);
      tu[] var4 = this.QE;
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         tu var7 = var4[var6];
         Xf var8 = var7.dN(var1);
         var3.dN(var8);
      }

      return var3;
   }

   public static enum uK {
      dN,
      ld,
      QE,
      wU,
      fa;
   }
}
