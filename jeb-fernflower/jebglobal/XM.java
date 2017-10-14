package jebglobal;

import java.util.List;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.Rx;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.kn;

public final class XM extends II {
   private Rx dN;
   private Xf ld;
   private kn QE;
   private boolean wU;
   private boolean fa;

   public XM(Rx var1, Xf var2) {
      if(var1 != null && var2 != null) {
         this.dN = var1;
         this.ld = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public boolean dN() {
      return this.ld != null && this.QE == null;
   }

   public boolean ld() {
      return this.ld != null && this.QE != null;
   }

   public kn zs() {
      if(!this.ld()) {
         throw new IllegalStateException();
      } else {
         return this.QE;
      }
   }

   public boolean mS() {
      return this.ld == null;
   }

   public void dN(boolean[] var1) {
      if(!this.mS()) {
         throw new IllegalStateException();
      } else if(var1 != null && var1.length >= 2) {
         var1[0] = this.wU;
         var1[1] = this.fa;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public Rx OK() {
      return this.dN;
   }

   public Xf LH() {
      return this.ld;
   }

   public void dN(Rx var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
      }
   }

   public void dN(Xf var1) {
      if(this.mS()) {
         throw new IllegalStateException();
      } else if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.ld = var1;
      }
   }

   public void dN(kn var1, Xf var2) {
      if(this.mS()) {
         throw new IllegalStateException();
      } else if(var1 != null && var1.mS()) {
         this.QE = var1;
         if(var2 != null) {
            this.ld = var2;
         }

      } else {
         throw new IllegalArgumentException();
      }
   }

   public void dN(boolean var1, boolean var2) {
      this.ld = null;
      this.QE = null;
      this.wU = var1;
      this.fa = var2;
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN, this.ld});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (Rx)var2;
         return true;
      } else if(this.ld == var1) {
         this.ld = (Xf)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.ld(var1);
      if(this.ld == null) {
         if(this.fa) {
            var1.wU(this.wU?"++":"--");
         }

         this.dN.dN(var1);
         if(!this.fa) {
            var1.wU(this.wU?"++":"--");
         }
      } else {
         this.dN.dN(var1);
         if(this.QE != null) {
            var1.wU(String.format(" %s= ", new Object[]{this.QE.toString()}));
         } else {
            var1.wU(" = ");
         }

         this.ld.dN(var1);
      }

   }
}
