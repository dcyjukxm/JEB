package jebglobal;

import java.util.ArrayList;
import java.util.List;
import jebglobal.EG;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Ya;
import jebglobal.ZL;
import jebglobal.aY;
import jebglobal.lk;
import jebglobal.oc;
import jebglobal.wz;

public final class jM extends wz {
   private EG dN;
   private lk ld;

   public jM(EG var1, lk var2) {
      if(var1 != null && var2 != null) {
         this.dN = var1;
         this.ld = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public EG zs() {
      return this.dN;
   }

   public lk mS() {
      return this.ld;
   }

   public void dN(EG var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
      }
   }

   public void dN(lk var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.ld = var1;
      }
   }

   public boolean dN(int var1, II var2) {
      return this.dN.dN(var1, var2);
   }

   public List dN() {
      ArrayList var1 = new ArrayList();
      var1.add(this.dN);
      return var1;
   }

   public List ld() {
      ArrayList var1 = new ArrayList();
      var1.add(new Ya());
      var1.addAll(this.dN.ld());
      var1.add(new aY(this.ld));
      return var1;
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN, this.ld});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (EG)var2;
         return true;
      } else if(this.ld == var1) {
         this.ld = (lk)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      var1.dN(oc.mS);
      var1.wU(" ");
      this.dN.dN(var1);
      var1.QE();
      var1.dN(oc.De);
      var1.wU("(");
      this.ld.dN(var1);
      var1.wU(")");
   }
}
