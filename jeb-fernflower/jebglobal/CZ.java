package jebglobal;

import java.util.List;
import jebglobal.Dw;
import jebglobal.HI;
import jebglobal.IK;
import jebglobal.Rx;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.cI;
import jebglobal.hV;
import jebglobal.oc;

public final class CZ extends cI implements Rx {
   private Xf dN;
   private Dw ld;

   public CZ(Xf var1, Dw var2) {
      if(var1 != null && var2 != null && !var2.ld()) {
         this.dN = var1;
         this.ld = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public Xf ld() {
      return this.dN;
   }

   public Dw QE() {
      return this.ld;
   }

   public void dN(Xf var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
      }
   }

   public void dN(Dw var1) {
      if(var1 != null && !var1.ld()) {
         this.ld = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int hashCode() {
      int var1 = 31 + this.ld.hashCode();
      var1 = 31 * var1 + this.dN.hashCode();
      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         CZ var2 = (CZ)var1;
         return this.dN.equals(var2.dN) && this.ld.equals(var2.ld);
      } else {
         return false;
      }
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN, this.ld});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (Xf)var2;
         return true;
      } else if(this.ld == var1) {
         this.ld = (Dw)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.a_(var1);
      if(this.dN instanceof HI && ((HI)this.dN).dN(false).equals("this") && this.ld.zs().equals("this$0")) {
         hV var2 = this.ld.OK();
         if(var2 != null && var2.mS()) {
            oc.dN(var1, var2);
            var1.wU(".");
            var1.dN(oc.ci);
            return;
         }
      }

      this.dN.dN(var1);
      var1.wU(".");
      this.ld.dN(var1, false);
   }
}
