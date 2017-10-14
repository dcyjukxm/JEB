package jebglobal;

import jebglobal.Fu;
import jebglobal.Pi;
import jebglobal.TB;
import jebglobal.Uo;
import jebglobal.Xf;
import jebglobal.YK;
import jebglobal.hV;
import jebglobal.tu;

public final class IV extends Uo {
   public IV(hV var1, YK var2, tu[] var3) {
      super(var2, var3, var1, (String)null, Uo.uK.QE);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder("new " + this.dN + "(");
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
      return var1.toString();
   }

   public Xf dN(TB var1) {
      this.dN.ld(false);
      Fu var2 = var1.mS.dN(this.ld.dN(), false);
      Pi var3 = new Pi(this.dN, var2);
      tu[] var4 = this.QE;
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         tu var7 = var4[var6];
         Xf var8 = var7.dN(var1);
         var3.dN(var8);
      }

      return var3;
   }
}
