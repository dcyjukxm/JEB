package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.EG;
import jebglobal.HI;
import jebglobal.IF;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.Je;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.hV;
import jebglobal.oc;
import jebglobal.tP;
import jebglobal.wJ;
import jebglobal.wz;

public final class SP extends wz {
   private EG dN;
   private List ld;
   private EG QE;

   public SP(EG var1) {
      if(var1 == null) {
         throw new RuntimeException();
      } else {
         this.dN = var1;
         this.ld = new ArrayList();
         this.QE = null;
      }
   }

   public EG zs() {
      return this.dN;
   }

   public void dN(hV var1, HI var2, EG var3) {
      this.ld.add(new SP.uK(var1, var2, var3));
   }

   public int mS() {
      return this.ld.size();
   }

   public hV ld(int var1) {
      return ((SP.uK)this.ld.get(var1)).dN;
   }

   public EG QE(int var1) {
      return ((SP.uK)this.ld.get(var1)).QE;
   }

   public HI wU(int var1) {
      return ((SP.uK)this.ld.get(var1)).ld;
   }

   public void dN(EG var1) {
      this.QE = var1;
   }

   public EG OK() {
      return this.QE;
   }

   public boolean LH() {
      return this.QE != null;
   }

   public boolean dN(int var1, II var2) {
      if(this.dN.dN(var1, var2)) {
         return true;
      } else {
         Iterator var3 = this.ld.iterator();

         SP.uK var4;
         do {
            if(!var3.hasNext()) {
               if(this.QE != null) {
                  return this.QE.dN(var1, var2);
               }

               return false;
            }

            var4 = (SP.uK)var3.next();
         } while(!var4.QE.dN(var1, var2));

         return true;
      }
   }

   public List dN() {
      ArrayList var1 = new ArrayList();
      var1.add(this.dN);
      Iterator var2 = this.ld.iterator();

      while(var2.hasNext()) {
         SP.uK var3 = (SP.uK)var2.next();
         var1.add(var3.QE);
      }

      if(this.QE != null) {
         var1.add(this.QE);
      }

      return var1;
   }

   public List ld() {
      ArrayList var1 = new ArrayList();
      var1.add(new wJ());
      var1.addAll(this.dN.ld());
      Iterator var2 = this.ld.iterator();

      while(var2.hasNext()) {
         SP.uK var3 = (SP.uK)var2.next();
         var1.add(new Je(var3.dN, var3.ld));
         var1.addAll(var3.QE.ld());
      }

      if(this.QE != null) {
         var1.add(new IF());
         var1.addAll(this.QE.ld());
      }

      var1.add(new tP());
      return var1;
   }

   public List wU() {
      List var1 = TM.dN(new IK[]{this.dN});

      SP.uK var3;
      for(Iterator var2 = this.ld.iterator(); var2.hasNext(); TM.dN((List)var1, (IK)var3.QE)) {
         var3 = (SP.uK)var2.next();
         if(var3.ld != null) {
            TM.dN((List)var1, (IK)var3.ld);
         }
      }

      return TM.dN((List)var1, (IK)this.QE);
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (EG)var2;
         return true;
      } else {
         Iterator var3 = this.ld.iterator();

         SP.uK var4;
         do {
            if(!var3.hasNext()) {
               if(this.QE == var1) {
                  this.QE = (EG)var2;
               }

               return false;
            }

            var4 = (SP.uK)var3.next();
            if(var4.ld == var1) {
               var4.ld = (HI)var2;
               return true;
            }
         } while(var4.QE != var1);

         var4.QE = (EG)var2;
         return true;
      }
   }

   public void dN(ZL var1) {
      var1.dN(oc.Ee);
      var1.s();
      this.dN.dN(var1);
      Iterator var2 = this.ld.iterator();

      while(var2.hasNext()) {
         SP.uK var3 = (SP.uK)var2.next();
         var1.QE();
         var1.dN(oc.QE);
         var1.wU("(");
         if(var3.dN != null) {
            oc.dN(var1, var3.dN);
            var1.wU(" ");
         }

         if(var3.ld != null) {
            var1.dN(var3.ld.dN(true), Zh.EO, 1, var3.ld, (Object)null);
         }

         var1.wU(") ");
         var3.QE.dN(var1);
      }

      if(this.QE != null) {
         var1.QE();
         var1.dN(oc.KK);
         var1.s();
         this.QE.dN(var1);
      }

   }

   class uK {
      hV dN;
      HI ld;
      EG QE;

      uK(hV var2, HI var3, EG var4) {
         this.dN = var2;
         this.ld = var3;
         this.QE = var4;
      }
   }
}
