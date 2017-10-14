package jebglobal;

import java.util.List;
import jebglobal.Dw;
import jebglobal.IK;
import jebglobal.Rx;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.cI;
import jebglobal.hV;
import jebglobal.oc;

public final class Np extends cI implements Rx {
   private hV dN;
   private Dw ld;

   public Np(hV var1, Dw var2) {
      if(var2 != null && (var2.fa() != -1 || var1 != null)) {
         if(var1 == null) {
            throw new IllegalArgumentException();
         } else {
            this.dN = var1;
            this.ld = var2;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public hV ld() {
      return this.dN;
   }

   public Dw QE() {
      return this.ld;
   }

   public int hashCode() {
      int var1 = 31 + (this.dN == null?0:this.dN.hashCode());
      var1 = 31 * var1 + this.ld.hashCode();
      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         Np var2 = (Np)var1;
         if(this.dN == null) {
            if(var2.dN != null) {
               return false;
            }
         } else if(!this.dN.equals(var2.dN)) {
            return false;
         }

         return this.ld.equals(var2.ld);
      } else {
         return false;
      }
   }

   public List wU() {
      return TM.dN(new IK[]{this.ld});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.ld == var1) {
         this.ld = (Dw)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.a_(var1);
      oc.dN(var1, this.dN);
      var1.wU(".");
      this.ld.dN(var1, false);
   }
}
