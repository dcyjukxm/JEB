package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.Qa;
import jebglobal.RT;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.jM;
import jebglobal.kd;
import jebglobal.wz;

public final class EG extends wz implements Iterable {
   private List dN;

   public EG() {
      this.dN = new ArrayList();
   }

   public EG(II var1) {
      this();
      this.dN(var1);
   }

   public int zs() {
      return this.dN.size();
   }

   public boolean mS() {
      return this.dN.isEmpty();
   }

   public void dN(II var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN.add(var1);
      }
   }

   public II ld(int var1) {
      return (II)this.dN.get(var1);
   }

   public II OK() {
      return (II)this.dN.get(this.dN.size() - 1);
   }

   public II QE(int var1) {
      II var2 = (II)this.dN.get(var1);
      this.dN.remove(var1);
      return var2;
   }

   public II LH() {
      int var1 = this.dN.size() - 1;
      II var2 = (II)this.dN.get(var1);
      this.dN.remove(var1);
      return var2;
   }

   public void wU(int var1) {
      this.dN.remove(var1);
   }

   public boolean ld(II var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         return this.dN.remove(var1);
      }
   }

   public void ld(int var1, II var2) {
      this.wU(var1);
      this.QE(var1, var2);
   }

   public void QE(int var1, II var2) {
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN.add(var1, var2);
      }
   }

   public void dN(int var1, EG var2) {
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         for(Iterator var3 = var2.dN.iterator(); var3.hasNext(); ++var1) {
            II var4 = (II)var3.next();
            this.dN.add(var1, var4);
         }

      }
   }

   public void KK() {
      this.dN.clear();
   }

   public boolean dN(int var1, II var2) {
      return dN(this.dN, var1, var2);
   }

   public List dN() {
      ArrayList var1 = new ArrayList();
      var1.add(this);
      return var1;
   }

   public List ld() {
      ArrayList var1 = new ArrayList();
      var1.add(new kd());
      Iterator var2 = this.dN.iterator();

      while(var2.hasNext()) {
         II var3 = (II)var2.next();
         if(var3 instanceof wz) {
            var1.addAll(((wz)var3).ld());
         } else {
            var1.add(var3);
         }
      }

      var1.add(new RT());
      return var1;
   }

   public Iterator iterator() {
      return this.dN.iterator();
   }

   public List wU() {
      return TM.dN((Collection)this.dN);
   }

   public boolean dN(IK var1, IK var2) {
      for(int var3 = 0; var3 < this.dN.size(); ++var3) {
         if(this.dN.get(var3) == var1) {
            this.dN.set(var3, (II)var2);
            return true;
         }
      }

      return false;
   }

   public void dN(ZL var1) {
      var1.wU("{");
      var1.QE();
      var1.rK();
      int var2 = 0;

      for(Iterator var3 = this.dN.iterator(); var3.hasNext(); ++var2) {
         II var4 = (II)var3.next();
         boolean var5 = var4 instanceof Qa && var1.Hw() >= 0;
         if(var5) {
            var1.Ux();
         }

         if(var1.LH != null) {
            var1.ld(var1.LH.QE(var1.ld(), var4.QE()));
         }

         var1.QE(var4.QE());
         var4.dN(var1);
         if(var5) {
            var1.rK();
         }

         if(!(var4 instanceof Qa) && (!(var4 instanceof wz) || var4 instanceof jM)) {
            var1.wU(";");
         }

         var1.QE();
         if(var4 instanceof wz && var1.dN && var2 + 1 < this.dN.size()) {
            var1.QE();
         }
      }

      var1.Ux();
      var1.wU("}");
   }
}
