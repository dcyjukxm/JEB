package jebglobal;

import java.util.HashSet;
import java.util.List;
import jebglobal.TB;
import jebglobal.Ts;
import jebglobal.Xf;
import jebglobal.ZF;
import jebglobal.hV;
import jebglobal.ie;
import jebglobal.tu;
import jebglobal.wD;
import jebglobal.xy;

public final class fG extends Ts {
   private tu ld;
   private tu QE;

   public fG(tu var1, tu var2, hV var3) {
      if(var1 != null && var2 != null && var3 != null) {
         this.ld = var1;
         this.QE = var2;
         this.dN = var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public tu zs() {
      return this.ld;
   }

   public tu mS() {
      return this.QE;
   }

   public HashSet fa() {
      HashSet var1 = new HashSet();
      var1.addAll(this.ld.fa());
      var1.addAll(this.QE.fa());
      return var1;
   }

   hV dN(int var1) {
      hV var2 = this.ld.dN(var1);
      hV var3 = this.QE.dN(var1);
      if(!var2.EO()) {
         return var3;
      } else if(!var3.EO()) {
         return var2;
      } else if(var2 != var3) {
         throw new RuntimeException();
      } else {
         return var3;
      }
   }

   boolean dN(int var1, hV var2) {
      boolean var3 = this.ld.dN(var1, var2);
      if(var3) {
         hV var4 = this.ld.dN();
         if(var4 != null && var4.OK()) {
            this.dN((hV)var4.wU());
         }
      }

      boolean var5 = this.QE.dN(var1, var2);
      return var3 || var5;
   }

   public boolean ld() {
      return this.ld.ld() || this.QE.ld();
   }

   public boolean QE() {
      return true;
   }

   int dN(xy var1) {
      int var2 = 0 + this.ld.dN(var1);
      var2 += this.QE.dN(var1);
      return var2;
   }

   int dN(xy var1, tu var2) {
      int var3 = 0;
      if(this.ld instanceof xy) {
         if(var1.ld((xy)this.ld)) {
            this.ld = var2;
            ++var3;
         }
      } else {
         var3 = 0 + this.ld.dN(var1, var2);
      }

      if(this.QE instanceof xy) {
         if(var1.ld((xy)this.QE)) {
            this.QE = var2;
            ++var3;
         }
      } else {
         var3 += this.QE.dN(var1, var2);
      }

      return var3;
   }

   int dN(xy var1, long var2) {
      int var4 = 0;
      if(this.QE instanceof xy) {
         if(var1.QE((xy)this.QE)) {
            hV var5 = this.QE.dN();
            if(ie.ld(var5)) {
               this.QE = new ie(var2, var5);
               ++var4;
            }
         }
      } else {
         var4 = 0 + this.QE.dN(var1, var2);
      }

      return var4;
   }

   void dN(hV var1, hV var2) {
      super.dN(var1, var2);
      this.ld.dN(var1, var2);
      this.QE.dN(var1, var2);
   }

   public List wU() {
      return ZF.dN(new tu[]{this.ld, this.QE});
   }

   public boolean dN(tu var1, tu var2) {
      if(this.ld == var1) {
         this.ld = var2;
         return true;
      } else if(this.QE == var1) {
         this.QE = var2;
         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return String.format("(%s[%s])<%s>", new Object[]{this.ld, this.QE, this.dN});
   }

   public Xf dN(TB var1) {
      Xf var2 = this.ld.dN(var1);
      Xf var3 = this.QE.dN(var1);
      return new wD(var2, var3);
   }
}
