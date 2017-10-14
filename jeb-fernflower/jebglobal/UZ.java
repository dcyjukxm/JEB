package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.yK;

public final class UZ {
   private AR dN;
   private HashMap ld = new HashMap();

   public UZ(AR var1) {
      this.dN = var1;
      this.dN();
   }

   private void dN() {
      int var1 = this.dN.mS().ld("Ljava/lang/Object;");
      HashSet var2 = new HashSet();
      Iterator var3 = this.dN.Hw().iterator();

      UZ.uK var5;
      int var7;
      while(var3.hasNext()) {
         yK var4 = (yK)var3.next();
         var5 = new UZ.uK(var4.zs());
         var5.ld = var4.Hw();
         if(var5.ld < 0) {
            var5.ld = var1;
         }

         if(var5.ld >= 0) {
            var2.add(Integer.valueOf(var5.ld));
         }

         int[] var6 = var4.rK();
         var7 = var6.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            int var9 = var6[var8];
            var5.QE.add(Integer.valueOf(var9));
            var2.add(Integer.valueOf(var9));
         }

         this.ld.put(Integer.valueOf(var5.dN), var5);
      }

      var3 = var2.iterator();

      int var12;
      while(var3.hasNext()) {
         var12 = ((Integer)var3.next()).intValue();
         if(!this.ld.containsKey(Integer.valueOf(var12))) {
            this.ld.put(Integer.valueOf(var12), new UZ.uK(var12));
         }
      }

      var3 = this.ld.keySet().iterator();

      UZ.uK var20;
      label81:
      while(var3.hasNext()) {
         var12 = ((Integer)var3.next()).intValue();
         var5 = (UZ.uK)this.ld.get(Integer.valueOf(var12));
         Iterator var16 = this.ld.keySet().iterator();

         while(true) {
            do {
               if(!var16.hasNext()) {
                  continue label81;
               }

               var7 = ((Integer)var16.next()).intValue();
            } while(var7 == var12);

            var20 = (UZ.uK)this.ld.get(Integer.valueOf(var7));
            if(var20.ld == var12) {
               var5.wU.add(Integer.valueOf(var7));
            }

            Iterator var21 = var20.QE.iterator();

            while(var21.hasNext()) {
               int var10 = ((Integer)var21.next()).intValue();
               if(var10 == var12) {
                  var5.wU.add(Integer.valueOf(var7));
               }
            }
         }
      }

      int var11 = 0;

      for(Iterator var13 = this.dN.cb().iterator(); var13.hasNext(); ++var11) {
         hO var14 = (hO)var13.next();
         int var17 = var14.zs().dN();
         UZ.uK var19 = (UZ.uK)this.ld.get(Integer.valueOf(var17));
         if(var19 != null) {
            var19.fa.add(Integer.valueOf(var11));
         }
      }

      var12 = 0;

      for(Iterator var15 = this.dN.KK().iterator(); var15.hasNext(); ++var12) {
         gE var18 = (gE)var15.next();
         var7 = var18.zs().dN();
         var20 = (UZ.uK)this.ld.get(Integer.valueOf(var7));
         if(var20 != null) {
            var20.zs.add(Integer.valueOf(var12));
         }
      }

   }

   public UZ.uK dN(int var1) {
      return (UZ.uK)this.ld.get(Integer.valueOf(var1));
   }

   public static class uK {
      public int dN;
      public int ld;
      public List QE;
      public List wU;
      public List fa;
      public List zs;

      uK(int var1) {
         this.dN = var1;
         this.ld = -1;
         this.QE = new ArrayList();
         this.wU = new ArrayList();
         this.fa = new ArrayList();
         this.zs = new ArrayList();
      }
   }
}
