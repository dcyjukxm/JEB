package jebglobal;

import java.util.ArrayList;
import java.util.List;
import jebglobal.EG;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.SB;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.bW;
import jebglobal.lk;
import jebglobal.oc;
import jebglobal.wz;

public final class am extends wz {
   private II dN;
   private lk ld;
   private II QE;
   private EG wU;

   public am(II var1, lk var2, II var3, EG var4) {
      if(var4 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
         this.wU = var4;
      }
   }

   public II zs() {
      return this.dN;
   }

   public lk mS() {
      return this.ld;
   }

   public II OK() {
      return this.QE;
   }

   public EG LH() {
      return this.wU;
   }

   public void dN(II var1) {
      this.dN = var1;
   }

   public void dN(lk var1) {
      this.ld = var1;
   }

   public void ld(II var1) {
      this.QE = var1;
   }

   public void dN(EG var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.wU = var1;
      }
   }

   public boolean dN(int var1, II var2) {
      throw new RuntimeException();
   }

   public List dN() {
      ArrayList var1 = new ArrayList();
      var1.add(this.wU);
      return var1;
   }

   public List ld() {
      ArrayList var1 = new ArrayList();
      var1.add(new SB(this.dN, this.ld, this.QE));
      var1.addAll(this.wU.ld());
      var1.add(new bW());
      return var1;
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN, this.ld, this.QE, this.wU});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (II)var2;
         return true;
      } else if(this.ld == var1) {
         this.ld = (lk)var2;
         return true;
      } else if(this.QE == var1) {
         this.QE = (II)var2;
         return true;
      } else if(this.wU == var1) {
         this.wU = (EG)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      var1.dN(oc.EO);
      var1.wU("(");
      if(this.dN != null) {
         this.dN.dN(var1);
      }

      var1.wU("; ");
      if(this.ld != null) {
         this.ld.dN(var1);
      }

      var1.wU("; ");
      if(this.QE != null) {
         this.QE.dN(var1);
      }

      var1.wU(") ");
      this.wU.dN(var1);
   }
}
