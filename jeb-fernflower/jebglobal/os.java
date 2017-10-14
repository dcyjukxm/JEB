package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.TB;
import jebglobal.Xf;
import jebglobal.YK;
import jebglobal.ZF;
import jebglobal.hV;
import jebglobal.ie;
import jebglobal.jK;
import jebglobal.tu;
import jebglobal.xy;
import jebglobal.yX;

public final class os extends tu implements yX {
   private tu ld;
   private List QE;

   public os(YK var1, hV var2, tu var3, List var4) {
      if(var4 == null) {
         var4 = new ArrayList();
      }

      this.dN = var2;
      this.ld = var3;
      this.QE = (List)var4;
   }

   public tu zs() {
      return this.ld;
   }

   public List mS() {
      return this.QE;
   }

   public void dN(List var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.QE = var1;
      }
   }

   public HashSet fa() {
      HashSet var1 = new HashSet();
      var1.addAll(this.ld.fa());
      Iterator var2 = this.QE.iterator();

      while(var2.hasNext()) {
         tu var3 = (tu)var2.next();
         var1.addAll(var3.fa());
      }

      return var1;
   }

   public hV dN(int var1) {
      ArrayList var2 = new ArrayList(1 + this.QE.size());
      var2.add(this.ld);
      var2.addAll(this.QE);
      Iterator var3 = var2.iterator();

      hV var5;
      do {
         if(!var3.hasNext()) {
            return hV.dN;
         }

         tu var4 = (tu)var3.next();
         if(!(var4 instanceof xy) && !(var4 instanceof ie)) {
            throw new RuntimeException();
         }

         var5 = var4.dN(var1);
      } while(!var5.EO());

      if(!var5.cb()) {
         throw new RuntimeException();
      } else {
         return var5;
      }
   }

   public boolean dN(int var1, hV var2) {
      boolean var3 = this.ld.dN(var1, var2);
      Iterator var4 = this.QE.iterator();

      while(var4.hasNext()) {
         tu var5 = (tu)var4.next();
         if(var5.dN(var1, var2)) {
            var3 = true;
         }
      }

      return var3;
   }

   public boolean ld() {
      return true;
   }

   public boolean QE() {
      return true;
   }

   int dN(xy var1) {
      int var2 = this.ld.dN(var1);

      tu var4;
      for(Iterator var3 = this.QE.iterator(); var3.hasNext(); var2 += var4.dN(var1)) {
         var4 = (tu)var3.next();
      }

      return var2;
   }

   int dN(xy var1, tu var2) {
      int var3 = 0;
      if(this.ld instanceof xy) {
         if(var1.ld((xy)this.ld)) {
            this.ld = var2;
            ++var3;
         }
      } else {
         var3 = 0 + this.ld.dN(var1, var2);
      }

      for(int var4 = 0; var4 < this.QE.size(); ++var4) {
         tu var5 = (tu)this.QE.get(var4);
         if(var5 instanceof xy) {
            if(var1.ld((xy)var5)) {
               this.QE.set(var4, var2);
               ++var3;
            }
         } else {
            var3 += var5.dN(var1, var2);
         }
      }

      return var3;
   }

   int dN(xy var1, long var2) {
      int var4 = 0;
      if(this.ld instanceof xy) {
         if(var1.QE((xy)this.ld)) {
            hV var5 = this.ld.dN();
            if(ie.ld(var5)) {
               this.ld = new ie(var2, var5);
               ++var4;
            }
         }
      } else {
         var4 = 0 + this.ld.dN(var1, var2);
      }

      for(int var8 = 0; var8 < this.QE.size(); ++var8) {
         tu var6 = (tu)this.QE.get(var8);
         if(var6 instanceof xy) {
            if(var1.QE((xy)var6)) {
               hV var7 = var6.dN();
               if(ie.ld(var7)) {
                  this.QE.set(var8, new ie(var2, var7));
                  ++var4;
               }
            }
         } else {
            var4 += var6.dN(var1, var2);
         }
      }

      return var4;
   }

   void dN(hV var1, hV var2) {
      super.dN(var1, var2);
      this.ld.dN(var1, var2);
      Iterator var3 = this.QE.iterator();

      while(var3.hasNext()) {
         tu var4 = (tu)var3.next();
         var4.dN(var1, var2);
      }

   }

   public List wU() {
      List var1 = ZF.dN(new tu[]{this.ld});
      return ZF.dN((List)var1, (Collection)this.QE);
   }

   public boolean dN(tu var1, tu var2) {
      if(this.ld == var1) {
         this.ld = var2;
         return true;
      } else {
         for(int var3 = 0; var3 < this.QE.size(); ++var3) {
            if(this.QE.get(var3) == var1) {
               this.QE.set(var3, var2);
               return true;
            }
         }

         return false;
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder("new ");
      var1.append(this.dN.dN(new String[]{this.ld.toString()}));
      if(!this.QE.isEmpty()) {
         var1.append("{");
         int var2 = 0;

         for(Iterator var3 = this.QE.iterator(); var3.hasNext(); ++var2) {
            tu var4 = (tu)var3.next();
            if(var2 > 0) {
               var1.append(", ");
            }

            var1.append(var4);
         }

         var1.append("}");
      }

      return var1.toString();
   }

   public Xf dN(TB var1) {
      this.dN.ld(false);
      if(this.QE.isEmpty()) {
         Xf var5 = this.ld.dN(var1);
         return new jK(this.dN, var5);
      } else {
         ArrayList var2 = new ArrayList();
         Iterator var3 = this.QE.iterator();

         while(var3.hasNext()) {
            tu var4 = (tu)var3.next();
            var2.add(var4.dN(var1));
         }

         return new jK(this.dN, false, var2);
      }
   }
}
