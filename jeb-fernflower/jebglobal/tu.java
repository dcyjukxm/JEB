package jebglobal;

import java.util.List;
import jebglobal.GS;
import jebglobal.TB;
import jebglobal.Xf;
import jebglobal.hV;
import jebglobal.xy;

public abstract class tu implements GS {
   hV dN;

   public hV dN() {
      return this.dN;
   }

   final boolean dN(hV var1) {
      if(this.dN == null) {
         if(var1.EO()) {
            this.dN = var1;
            return true;
         }
      } else {
         if(this.dN.ld(var1)) {
            if(!var1.equals(this.dN)) {
               this.dN = var1;
               return true;
            }

            return false;
         }

         if(this.dN.zs() && var1.zs()) {
            return false;
         }

         if(var1 == hV.cb && this.dN.PF()) {
            return false;
         }
      }

      return false;
   }

   abstract hV dN(int var1);

   abstract boolean dN(int var1, hV var2);

   abstract boolean ld();

   abstract boolean QE();

   abstract int dN(xy var1);

   abstract int dN(xy var1, tu var2);

   abstract int dN(xy var1, long var2);

   void dN(hV var1, hV var2) {
      if(this.dN.equals(var1)) {
         this.dN = var2;
      }

   }

   public abstract List wU();

   public abstract boolean dN(tu var1, tu var2);

   abstract Xf dN(TB var1);
}
