package jebglobal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.bt;
import jebglobal.nm;

public final class jn {
   private nm[] dN;
   private nm[] ld;
   private nm[] QE;

   public jn(nm[] var1, boolean var2) {
      this.dN = var1;
      this.ld = var1;
      this.QE = var1;
      if(this.QE()) {
         this.dN(true);
      }

   }

   private boolean QE() {
      HashMap var1 = new HashMap();
      nm[] var2 = this.dN;
      int var3 = var2.length;

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         nm var5 = var2[var4];
         Iterator var6 = var5.wU().iterator();

         while(var6.hasNext()) {
            bt var7 = (bt)var6.next();
            var1.put(Integer.valueOf(var7.QE()), var7);
         }
      }

      HashMap var13 = new HashMap();
      nm[] var14 = this.dN;
      var4 = var14.length;

      for(int var17 = 0; var17 < var4; ++var17) {
         nm var19 = var14[var17];
         Iterator var22 = var19.fa().iterator();

         while(var22.hasNext()) {
            int var8 = ((Integer)var22.next()).intValue();
            Object var9 = (List)var13.get(Integer.valueOf(var8));
            if(var9 == null) {
               var9 = new ArrayList();
               var13.put(Integer.valueOf(var8), var9);
            }

            boolean var10 = false;
            Iterator var11 = ((List)var9).iterator();

            while(var11.hasNext()) {
               jn.uK var12 = (jn.uK)var11.next();
               if(var12.ld == var19.dN()) {
                  var12.ld = var19.QE();
                  var10 = true;
                  break;
               }
            }

            if(!var10) {
               ((List)var9).add(new jn.uK(var19.dN(), var19.QE(), (bt)var1.get(Integer.valueOf(var8))));
            }
         }
      }

      ArrayList var15 = new ArrayList();
      Iterator var16 = var13.values().iterator();

      while(var16.hasNext()) {
         List var18 = (List)var16.next();
         var15.addAll(var18);
      }

      Collections.sort(var15, new Comparator() {
         public int dN(jn.uK var1, jn.uK var2) {
            return var1.dN - var2.dN;
         }

         // $FF: synthetic method
         public int compare(Object var1, Object var2) {
            return this.dN((jn.uK)var1, (jn.uK)var2);
         }
      });
      var4 = 0;

      while(true) {
         jn.uK var20;
         while(var4 < var15.size() - 1) {
            var20 = (jn.uK)var15.get(var4);
            jn.uK var21 = (jn.uK)var15.get(var4 + 1);
            if(var20.dN == var21.dN && var20.ld == var21.ld) {
               var20.dN(var21.QE);
               var15.remove(var4 + 1);
            } else {
               if(var21.dN < var20.ld && var21.ld > var20.ld) {
                  return false;
               }

               ++var4;
            }
         }

         this.QE = new nm[var15.size()];

         for(var4 = 0; var4 < var15.size(); ++var4) {
            var20 = (jn.uK)var15.get(var4);
            this.QE[var4] = new nm(var20.dN, var20.ld - var20.dN, var20.QE);
         }

         return true;
      }
   }

   public void dN(boolean var1) {
      this.dN = var1?this.QE:this.ld;
   }

   public int dN() {
      return this.dN.length;
   }

   public nm dN(int var1) {
      return this.dN[var1];
   }

   public HashSet ld() {
      HashSet var1 = new HashSet();
      nm[] var2 = this.dN;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         nm var5 = var2[var4];
         var1.addAll(var5.fa());
      }

      return var1;
   }

   public bt ld(int var1) {
      nm[] var2 = this.dN;
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         nm var5 = var2[var4];
         Iterator var6 = var5.wU().iterator();

         while(var6.hasNext()) {
            bt var7 = (bt)var6.next();
            if(var7.QE() == var1) {
               return var7;
            }
         }
      }

      return null;
   }

   public static class uK {
      private int dN;
      private int ld;
      private List QE = new ArrayList();

      public uK(int var1, int var2, bt var3) {
         this.dN = var1;
         this.ld = var2;
         this.QE.add(var3);
      }

      public void dN(List var1) {
         this.QE.addAll(var1);
      }
   }
}
