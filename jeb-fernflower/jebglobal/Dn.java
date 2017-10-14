package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.nh;

public final class Dn {
   private HashMap dN = new HashMap();
   private HashMap ld = new HashMap();
   private HashMap QE = new HashMap();
   private HashMap wU = new HashMap();
   private boolean fa = false;

   public void dN(AR var1) {
      if(this.fa) {
         throw new RuntimeException();
      } else {
         Iterator var2 = this.QE.keySet().iterator();

         int var3;
         while(var2.hasNext()) {
            var3 = ((Integer)var2.next()).intValue();
            int var4 = var1.fa(var3).fa();
            this.dN(var4, (List)this.QE.get(Integer.valueOf(var3)));
         }

         var2 = this.wU.keySet().iterator();

         while(var2.hasNext()) {
            var3 = ((Integer)var2.next()).intValue();
            String var7 = var1.mS(var3).zs().zs();
            nh.vd var5 = (nh.vd)var1.mS().dN(var7);
            if(var5 != null) {
               int var6 = var5.dN();
               this.dN(var6, (List)this.wU.get(Integer.valueOf(var3)));
            }
         }

         this.fa = true;
      }
   }

   public void dN(int var1, int var2) {
      Object var3 = (List)this.dN.get(Integer.valueOf(var1));
      if(var3 == null) {
         var3 = new ArrayList();
         this.dN.put(Integer.valueOf(var1), var3);
      }

      ((List)var3).add(Integer.valueOf(var2));
   }

   public void ld(int var1, int var2) {
      Object var3 = (List)this.ld.get(Integer.valueOf(var1));
      if(var3 == null) {
         var3 = new ArrayList();
         this.ld.put(Integer.valueOf(var1), var3);
      }

      ((List)var3).add(Integer.valueOf(var2));
   }

   public void dN(int var1, List var2) {
      Object var3 = (List)this.ld.get(Integer.valueOf(var1));
      if(var3 == null) {
         var3 = new ArrayList();
         this.ld.put(Integer.valueOf(var1), var3);
      }

      ((List)var3).addAll(var2);
   }

   public void QE(int var1, int var2) {
      Object var3 = (List)this.QE.get(Integer.valueOf(var1));
      if(var3 == null) {
         var3 = new ArrayList();
         this.QE.put(Integer.valueOf(var1), var3);
      }

      ((List)var3).add(Integer.valueOf(var2));
   }

   public void wU(int var1, int var2) {
      Object var3 = (List)this.wU.get(Integer.valueOf(var1));
      if(var3 == null) {
         var3 = new ArrayList();
         this.wU.put(Integer.valueOf(var1), var3);
      }

      ((List)var3).add(Integer.valueOf(var2));
   }

   public HashMap dN() {
      return this.ld;
   }

   public HashMap ld() {
      return this.QE;
   }

   public HashMap QE() {
      return this.wU;
   }
}
