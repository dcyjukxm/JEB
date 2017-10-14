package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.bm;

public final class ft {
   List dN = new ArrayList();
   List ld = new ArrayList();
   List QE = new ArrayList();
   List wU = new ArrayList();
   List fa = new ArrayList();
   List zs = new ArrayList();
   List mS = new ArrayList();

   public int dN() {
      return this.dN.size();
   }

   public boolean ld() {
      return this.dN.isEmpty();
   }

   public bm dN(int var1) {
      return (bm)this.dN.get(var1);
   }

   public bm QE() {
      return (bm)this.dN.get(this.dN.size() - 1);
   }

   public List wU() {
      return new ArrayList(this.dN);
   }

   public boolean ld(int var1) {
      this.dN.remove(var1);
      if(!this.dN.isEmpty()) {
         return false;
      } else if(this.KK() != 1) {
         throw new RuntimeException();
      } else {
         return true;
      }
   }

   public void dN(bm var1) {
      this.dN.add(var1);
   }

   public int fa() {
      return this.wU.size();
   }

   public int zs() {
      return this.zs.size();
   }

   public int mS() {
      return this.wU.size() + this.zs.size();
   }

   public List OK() {
      return new ArrayList(this.wU);
   }

   public List LH() {
      ArrayList var1 = new ArrayList(this.wU);
      var1.addAll(this.zs);
      return var1;
   }

   public int KK() {
      return this.fa.size();
   }

   public int EO() {
      return this.mS.size();
   }

   public int cb() {
      return this.fa.size() + this.mS.size();
   }

   public ft QE(int var1) {
      return (ft)this.fa.get(var1);
   }

   public List PF() {
      return new ArrayList(this.fa);
   }

   public List Hw() {
      return new ArrayList(this.mS);
   }

   public List rK() {
      ArrayList var1 = new ArrayList(this.fa);
      var1.addAll(this.mS);
      return var1;
   }

   public boolean Ux() {
      if(this.fa.size() > 0 && this.wU.size() > 0) {
         Iterator var1 = this.fa.iterator();

         while(var1.hasNext()) {
            ft var2 = (ft)var1.next();
            if(this.wU.contains(var2)) {
               return true;
            }
         }
      }

      return false;
   }

   public String toString() {
      if(this.dN.size() == 0) {
         return "(Empty block)";
      } else {
         int var1 = ((bm)this.dN.get(0)).dN();
         int var2 = ((bm)this.dN.get(this.dN.size() - 1)).dN();
         return String.format("(%X-%X,%d)", new Object[]{Integer.valueOf(var1), Integer.valueOf(var2), Integer.valueOf(this.dN.size())});
      }
   }
}
