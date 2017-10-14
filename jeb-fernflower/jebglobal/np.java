package jebglobal;

import java.util.HashSet;
import java.util.List;
import jebglobal.Dw;
import jebglobal.Np;
import jebglobal.TB;
import jebglobal.Ts;
import jebglobal.Xf;
import jebglobal.YK;
import jebglobal.ZF;
import jebglobal.hV;
import jebglobal.tu;
import jebglobal.xy;

public final class np extends Ts {
   private YK ld;
   private String QE;
   private String wU;

   public np(YK var1, hV var2, String var3, String var4) {
      if((var1 != null || "class".equals(var4)) && var2 != null && var3 != null) {
         this.ld = var1;
         this.dN = var2;
         this.QE = var3;
         this.wU = var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public HashSet fa() {
      return new HashSet();
   }

   hV dN(int var1) {
      return hV.dN;
   }

   boolean dN(int var1, hV var2) {
      return false;
   }

   public boolean ld() {
      return false;
   }

   public boolean QE() {
      return true;
   }

   int dN(xy var1) {
      return 0;
   }

   int dN(xy var1, tu var2) {
      return 0;
   }

   int dN(xy var1, long var2) {
      return 0;
   }

   void dN(hV var1, hV var2) {
      super.dN(var1, var2);
   }

   public List wU() {
      return ZF.dN(new tu[0]);
   }

   public boolean dN(tu var1, tu var2) {
      return false;
   }

   public String toString() {
      return this.wU == null?String.format("%s->%s<%s>", new Object[]{this.QE, this.ld, this.dN}):String.format("%s->%s<%s>", new Object[]{this.QE, this.wU, this.dN});
   }

   public Xf dN(TB var1) {
      Dw var2 = var1.OK.dN(this.ld == null?-1:this.ld.dN());
      hV var3 = hV.dN(this.QE, var1.wU);
      return new Np(var3, var2);
   }
}
