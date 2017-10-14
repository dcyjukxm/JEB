package jebglobal;

import java.util.ArrayList;
import java.util.List;
import jebglobal.EG;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.Rp;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.aZ;
import jebglobal.lk;
import jebglobal.oc;
import jebglobal.wz;

public final class zn extends wz {
   private lk dN;
   private EG ld;

   public zn(lk var1, EG var2) {
      if(var1 != null && var2 != null) {
         this.dN = var1;
         this.ld = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public lk zs() {
      return this.dN;
   }

   public EG mS() {
      return this.ld;
   }

   public void dN(lk var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
      }
   }

   public void dN(EG var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.ld = var1;
      }
   }

   public boolean dN(int var1, II var2) {
      return this.ld.dN(var1, var2);
   }

   public List dN() {
      ArrayList var1 = new ArrayList();
      var1.add(this.ld);
      return var1;
   }

   public List ld() {
      ArrayList var1 = new ArrayList();
      var1.add(new aZ(this.dN));
      var1.addAll(this.ld.ld());
      var1.add(new Rp());
      return var1;
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN, this.ld});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (lk)var2;
         return true;
      } else if(this.ld == var1) {
         this.ld = (EG)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      var1.dN(oc.De);
      var1.wU("(");
      this.dN.dN(var1);
      var1.wU(") ");
      this.ld.dN(var1);
   }
}
