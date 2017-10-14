package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jebglobal.EG;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.gl;
import jebglobal.h;
import jebglobal.hs;
import jebglobal.lk;
import jebglobal.oc;
import jebglobal.rj;
import jebglobal.wz;

public final class tE extends wz {
   private List dN;
   private List ld;
   private EG QE;

   public tE(lk var1, II var2) {
      if(var1 != null && var2 != null) {
         this.dN = new ArrayList();
         this.ld = new ArrayList();
         this.QE = null;
         this.dN(var1, new EG(var2));
      } else {
         throw new IllegalArgumentException();
      }
   }

   public tE(lk var1, EG var2) {
      if(var1 != null && var2 != null) {
         this.dN = new ArrayList();
         this.ld = new ArrayList();
         this.QE = null;
         this.dN(var1, var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void dN(lk var1, EG var2) {
      if(var1 != null && var2 != null) {
         this.dN.add(var1);
         this.ld.add(var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void dN(int var1, lk var2, EG var3) {
      if(var2 != null && var3 != null) {
         this.dN.add(var1, var2);
         this.ld.add(var1, var3);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public lk ld(int var1) {
      return (lk)this.dN.get(var1);
   }

   public List zs() {
      return this.dN;
   }

   public void dN(int var1, lk var2) {
      this.dN.set(var1, var2);
   }

   public EG QE(int var1) {
      return (EG)this.ld.get(var1);
   }

   public void dN(int var1, EG var2) {
      this.ld.set(var1, var2);
   }

   public void wU(int var1) {
      this.dN.remove(var1);
      this.ld.remove(var1);
   }

   public boolean mS() {
      return this.QE != null;
   }

   public EG OK() {
      return this.QE;
   }

   public void dN(EG var1) {
      this.QE = var1;
   }

   public int LH() {
      return this.dN.size() + (this.QE != null?1:0);
   }

   public int KK() {
      return this.dN.size();
   }

   public boolean dN(int var1, II var2) {
      Iterator var3 = this.ld.iterator();

      EG var4;
      do {
         if(!var3.hasNext()) {
            if(this.QE != null) {
               return this.QE.dN(var1, var2);
            }

            return false;
         }

         var4 = (EG)var3.next();
      } while(!var4.dN(var1, var2));

      return true;
   }

   public List dN() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.ld.iterator();

      while(var2.hasNext()) {
         EG var3 = (EG)var2.next();
         var1.add(var3);
      }

      if(this.QE != null) {
         var1.add(this.QE);
      }

      return var1;
   }

   public List ld() {
      ArrayList var1 = new ArrayList();
      var1.add(new h((lk)this.dN.get(0)));
      var1.addAll(((EG)this.ld.get(0)).ld());
      int var2 = this.dN.size();

      for(int var3 = 1; var3 < var2; ++var3) {
         var1.add(new gl((lk)this.dN.get(var3)));
         var1.addAll(((EG)this.ld.get(var3)).ld());
      }

      if(this.QE != null) {
         var1.add(new hs());
         var1.addAll(this.QE.ld());
      }

      var1.add(new rj());
      return var1;
   }

   public List wU() {
      List var1 = TM.dN((Collection)this.dN);
      TM.dN((List)var1, (Collection)this.ld);
      return TM.dN((List)var1, (IK)this.QE);
   }

   public boolean dN(IK var1, IK var2) {
      int var3;
      for(var3 = 0; var3 < this.dN.size(); ++var3) {
         if(this.dN.get(var3) == var1) {
            this.dN.set(var3, (lk)var2);
            return true;
         }
      }

      for(var3 = 0; var3 < this.ld.size(); ++var3) {
         if(this.ld.get(var3) == var1) {
            this.ld.set(var3, (EG)var2);
            return true;
         }
      }

      if(this.QE == var1) {
         this.QE = (EG)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      for(int var2 = 0; var2 < this.dN.size(); ++var2) {
         if(var2 >= 1) {
            var1.QE();
            var1.dN(oc.OK);
            var1.wU(" ");
         }

         var1.dN(oc.PF);
         var1.wU("(");
         ((lk)this.dN.get(var2)).dN(var1);
         var1.wU(") ");
         ((EG)this.ld.get(var2)).dN(var1);
      }

      if(this.QE != null) {
         var1.QE();
         var1.dN(oc.OK);
         var1.wU(" ");
         this.QE.dN(var1);
      }

   }
}
