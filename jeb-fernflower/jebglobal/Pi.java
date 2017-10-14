package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jebglobal.Fu;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.hV;
import jebglobal.oc;
import jebglobal.yK;
import jebglobal.zd;

public final class Pi extends II implements Xf {
   private hV dN;
   private Fu ld;
   private List QE;

   public Pi(hV var1, Fu var2) {
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
         this.ld = var2;
         this.QE = new ArrayList();
      }
   }

   public hV dN() {
      return this.dN;
   }

   public Fu ld() {
      return this.ld;
   }

   public List zs() {
      return this.QE;
   }

   public void dN(Xf var1) {
      this.QE.add(var1);
   }

   public List wU() {
      List var1 = TM.dN(new IK[]{this.ld});
      return TM.dN((List)var1, (Collection)this.QE);
   }

   public boolean dN(IK var1, IK var2) {
      if(this.ld == var1) {
         this.ld = (Fu)var2;
         return true;
      } else {
         for(int var3 = 0; var3 < this.QE.size(); ++var3) {
            if(this.QE.get(var3) == var1) {
               this.QE.set(var3, (Xf)var2);
               return true;
            }
         }

         return false;
      }
   }

   public void dN(ZL var1) {
      this.ld(var1);
      boolean var2 = false;
      if(var1.OK != null) {
         yK var3 = var1.OK.EO(this.dN.KK());
         var2 = var3 != null && var3.ld();
      }

      var1.dN(oc.Ux);
      var1.wU(" ");
      if(!var2) {
         oc.dN(var1, this.dN);
         var1.wU("(");

         for(int var4 = 0; var4 < this.QE.size(); ++var4) {
            if(var4 >= 1) {
               var1.wU(", ");
            }

            ((Xf)this.QE.get(var4)).dN(var1);
         }

         var1.wU(")");
      } else {
         zd var5 = var1.dN(this.dN);
         if(var5 != null) {
            var5.ld(var1);
         }
      }

   }
}
