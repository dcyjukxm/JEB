package jebglobal;

import java.util.HashSet;
import java.util.List;
import jebglobal.CZ;
import jebglobal.Dw;
import jebglobal.TB;
import jebglobal.Ts;
import jebglobal.Xf;
import jebglobal.YK;
import jebglobal.ZF;
import jebglobal.hV;
import jebglobal.tu;
import jebglobal.xy;

public final class Kt extends Ts {
   private tu ld;
   private YK QE;
   private String wU;

   public Kt(tu var1, YK var2, hV var3, String var4) {
      if((var2 != null || "length".equals(var4)) && var1 != null && var3 != null) {
         this.ld = var1;
         this.QE = var2;
         this.dN = var3;
         this.wU = var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public HashSet fa() {
      HashSet var1 = new HashSet();
      var1.addAll(this.ld.fa());
      return var1;
   }

   hV dN(int var1) {
      return this.ld.dN(var1);
   }

   boolean dN(int var1, hV var2) {
      return this.ld.dN(var1, var2);
   }

   public boolean ld() {
      return this.ld.ld();
   }

   public boolean QE() {
      return true;
   }

   int dN(xy var1) {
      return this.ld.dN(var1);
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

      return var3;
   }

   int dN(xy var1, long var2) {
      return 0;
   }

   void dN(hV var1, hV var2) {
      super.dN(var1, var2);
      this.ld.dN(var1, var2);
   }

   public List wU() {
      return ZF.dN(new tu[]{this.ld});
   }

   public boolean dN(tu var1, tu var2) {
      if(this.ld == var1) {
         this.ld = var2;
         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return this.wU == null?String.format("%s.%s<%s>", new Object[]{this.ld, this.QE, this.dN}):String.format("%s.%s<%s>", new Object[]{this.ld, this.wU, this.dN});
   }

   public Xf dN(TB var1) {
      Dw var2 = var1.OK.dN(this.QE == null?-2:this.QE.dN());
      Xf var3 = this.ld.dN(var1);
      return new CZ(var3, var2);
   }
}
