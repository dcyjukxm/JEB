package jebglobal;

import jebglobal.Gy;
import jebglobal.OX;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.kn;

public final class lk extends Gy {
   public lk(Xf var1, kn var2, Xf var3) {
      super(var1, var2, var3);
      if(!var2.fa()) {
         throw new IllegalArgumentException();
      }
   }

   public lk(Gy var1) {
      this(var1.dN, var1.ld, var1.QE);
   }

   public boolean zs() {
      return this.dN == null && this.ld == kn.Hw && this.QE instanceof OX && ((OX)this.QE).Hw();
   }

   public boolean mS() {
      return this.dN == null && this.ld == kn.Hw && this.QE instanceof OX && ((OX)this.QE).rK();
   }

   public boolean OK() {
      boolean var1 = false;
      if(this.dN instanceof lk) {
         var1 = ((lk)this.dN).OK();
      }

      if(this.QE instanceof lk) {
         var1 = ((lk)this.QE).OK();
      }

      if(this.dN != null && this.QE instanceof OX && (this.ld == kn.Hv || this.ld == kn.VX)) {
         if(((OX)this.QE).Hw()) {
            this.ld = this.ld == kn.Hv?kn.Hw:kn.rK;
            this.QE = this.dN;
            this.dN = null;
            return true;
         } else if(((OX)this.QE).rK()) {
            this.ld = this.ld == kn.Hv?kn.rK:kn.Hw;
            this.QE = this.dN;
            this.dN = null;
            return true;
         } else {
            return var1;
         }
      } else {
         return var1;
      }
   }

   public void LH() {
      if(this.ld == kn.Hw) {
         this.ld = kn.rK;
      } else if(this.ld == kn.rK) {
         this.ld = kn.Hw;
      } else if(this.ld == kn.Hv) {
         this.ld = kn.VX;
      } else if(this.ld == kn.VX) {
         this.ld = kn.Hv;
      } else if(this.ld == kn.ci) {
         this.ld = kn.bG;
      } else if(this.ld == kn.bG) {
         this.ld = kn.ci;
      } else if(this.ld == kn.BQ) {
         this.ld = kn.Ee;
      } else if(this.ld == kn.Ee) {
         this.ld = kn.BQ;
      } else if(this.ld == kn.Ux) {
         ((lk)this.dN).LH();
         this.ld = kn.ZY;
         ((lk)this.QE).LH();
      } else if(this.ld == kn.ZY) {
         ((lk)this.dN).LH();
         this.ld = kn.Ux;
         ((lk)this.QE).LH();
      } else {
         if(this.ld != kn.s) {
            throw new IllegalStateException();
         }

         this.QE = new lk(this);
         this.dN = null;
         this.ld = kn.rK;
      }

   }

   public void dN(ZL var1) {
      super.dN(var1);
   }
}
