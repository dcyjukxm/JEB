package jebglobal;

import java.util.Iterator;
import java.util.List;
import jebglobal.HI;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.Rx;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.hV;
import jebglobal.oc;
import jebglobal.u;

public final class wm extends II implements Rx {
   private int dN;
   private hV ld;
   private HI QE;

   wm(int var1, hV var2, HI var3) {
      if(var2 != null && var3 != null) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int dN() {
      return this.dN;
   }

   public hV ld() {
      return this.ld;
   }

   public HI zs() {
      return this.QE;
   }

   public List wU() {
      return TM.dN(new IK[]{this.QE});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.QE == var1) {
         this.QE = (HI)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.ld(var1);
      if(var1.LH != null) {
         List var2 = var1.LH.ld(var1.ld(), this.QE());
         if(var2 != null) {
            int var3 = this.QE.ld();
            Iterator var4 = var2.iterator();

            while(var4.hasNext()) {
               u var5 = (u)var4.next();
               if(var5.LH() && (var5.PF() & '\uffff') == var3) {
                  this.QE.dN(var5.Hw());
                  break;
               }
            }
         }
      }

      oc.dN(var1, this.ld);
      var1.wU(" ");
      var1.dN(this.QE.dN(true), Zh.EO, 1, this.QE, (Object)null);
   }
}
