package jebglobal;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.bm;
import jebglobal.ft;
import jebglobal.oh;

final class ll {
   private oh wU;
   ft dN;
   HashMap ld;
   HashMap QE;

   ll(oh var1, ft var2, boolean var3, boolean var4) {
      this.wU = var1;
      this.dN = var2;
      this.ld = var3?new HashMap():null;
      this.QE = var4?new HashMap():null;
   }

   void dN() {
      if(this.ld == null) {
         this.ld = new HashMap();
      }

   }

   void ld() {
      if(this.QE == null) {
         this.QE = new HashMap();
      }

   }

   HashMap dN(HashMap var1) {
      HashMap var2 = new HashMap();
      Iterator var3 = var1.keySet().iterator();

      while(var3.hasNext()) {
         int var4 = ((Integer)var3.next()).intValue();
         var2.put(Integer.valueOf(var4), new HashSet((Collection)var1.get(Integer.valueOf(var4))));
      }

      return var2;
   }

   void dN(HashMap var1, HashMap var2) {
      int var4;
      HashSet var5;
      for(Iterator var3 = var2.keySet().iterator(); var3.hasNext(); var5.addAll((Collection)var2.get(Integer.valueOf(var4)))) {
         var4 = ((Integer)var3.next()).intValue();
         var5 = (HashSet)var1.get(Integer.valueOf(var4));
         if(var5 == null) {
            var5 = new HashSet();
            var1.put(Integer.valueOf(var4), var5);
         }
      }

   }

   boolean ld(HashMap var1, HashMap var2) {
      Iterator var3 = var1.keySet().iterator();

      int var4;
      HashSet var5;
      do {
         if(!var3.hasNext()) {
            return true;
         }

         var4 = ((Integer)var3.next()).intValue();
         var5 = (HashSet)var2.get(Integer.valueOf(var4));
         if(var5 == null) {
            return false;
         }
      } while(var5.equals(var1.get(Integer.valueOf(var4))));

      return false;
   }

   void QE() {
      List var1 = this.dN.dN;
      this.ld = this.dN(this.QE);

      for(int var2 = var1.size() - 1; var2 >= 0; --var2) {
         bm var3 = (bm)var1.get(var2);
         Iterator var4 = ((List)this.wU.dN.get(var3)).iterator();

         int var5;
         while(var4.hasNext()) {
            var5 = ((Integer)var4.next()).intValue();
            this.ld.remove(Integer.valueOf(var5));
         }

         HashSet var6;
         for(var4 = ((List)this.wU.ld.get(var3)).iterator(); var4.hasNext(); var6.add(var3)) {
            var5 = ((Integer)var4.next()).intValue();
            var6 = (HashSet)this.ld.get(Integer.valueOf(var5));
            if(var6 == null) {
               var6 = new HashSet();
               this.ld.put(Integer.valueOf(var5), var6);
            }
         }
      }

   }

   void wU() {
      List var1 = this.dN.dN;
      this.QE = this.dN(this.ld);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         bm var3 = (bm)var1.get(var2);

         HashSet var6;
         for(Iterator var4 = ((List)this.wU.dN.get(var3)).iterator(); var4.hasNext(); var6.add(var3)) {
            int var5 = ((Integer)var4.next()).intValue();
            var6 = (HashSet)this.QE.get(Integer.valueOf(var5));
            if(var6 == null) {
               var6 = new HashSet();
               this.QE.put(Integer.valueOf(var5), var6);
            } else {
               var6.clear();
            }
         }
      }

   }
}
