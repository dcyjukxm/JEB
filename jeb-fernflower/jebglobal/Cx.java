package jebglobal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.UZ;
import jebglobal.hO;

public final class Cx {
   private AR dN;
   private int ld;
   private String QE;
   private int[] wU;
   private UZ fa;

   public Cx(AR var1) {
      this.dN = var1;
   }

   public boolean dN(hO var1, List var2) {
      if(!var1.QE()) {
         return false;
      } else {
         AV var3 = var1.ld();
         if(var3 == null) {
            return false;
         } else {
            this.fa = this.dN.ZY();
            this.ld = var1.zs().dN();
            this.QE = var1.ld(false);
            this.wU = var1.OK().zs();
            ArrayList var4 = new ArrayList();
            this.dN(this.ld, var4);
            var2.clear();
            var2.addAll(var4);
            return true;
         }
      }
   }

   private void dN(int var1, List var2) {
      UZ.uK var3 = this.fa.dN(var1);
      if(var3 != null) {
         Iterator var4;
         int var5;
         if(var1 != this.ld) {
            var4 = var3.fa.iterator();

            while(var4.hasNext()) {
               var5 = ((Integer)var4.next()).intValue();
               hO var6 = this.dN.mS(var5);
               AV var7 = var6.ld();
               if(var7 != null && !var7.LH()) {
                  String var8 = var6.ld(false);
                  if(this.QE.equals(var8)) {
                     int[] var9 = var6.OK().zs();
                     if(Arrays.equals(this.wU, var9)) {
                        var2.add(Integer.valueOf(var5));
                        break;
                     }
                  }
               }
            }
         }

         var4 = var3.wU.iterator();

         while(var4.hasNext()) {
            var5 = ((Integer)var4.next()).intValue();
            this.dN(var5, var2);
         }

      }
   }

   public List dN(hO var1) {
      this.fa = this.dN.ZY();
      ArrayList var2 = new ArrayList();
      int var3 = var1.zs().dN();
      this.dN(var1, var3, var2, true, -1);
      return var2;
   }

   private void dN(hO var1, int var2, List var3, boolean var4, int var5) {
      UZ.uK var6 = this.fa.dN(var2);
      if(var6 != null) {
         int var7 = this.dN(var6, var1);
         if(var7 >= 0 && !var3.contains(Integer.valueOf(var7))) {
            var3.add(Integer.valueOf(var7));
         }

         Iterator var8 = var6.wU.iterator();

         while(var8.hasNext()) {
            int var9 = ((Integer)var8.next()).intValue();
            if(var9 != var5) {
               this.dN(var1, var9, var3, false, -1);
            }
         }

         if(var4) {
            ArrayList var12 = new ArrayList(var6.QE);
            if(var6.ld >= 0) {
               var12.add(Integer.valueOf(var6.ld));
            }

            Iterator var13 = var12.iterator();

            while(var13.hasNext()) {
               int var10 = ((Integer)var13.next()).intValue();
               UZ.uK var11 = this.fa.dN(var10);
               if(var11 != null) {
                  var7 = this.dN(var11, var1);
                  if(var7 >= 0) {
                     this.dN(var1, var10, var3, true, var2);
                     break;
                  }
               }
            }
         }

      }
   }

   int dN(UZ.uK var1, hO var2) {
      Iterator var3 = var1.fa.iterator();

      while(var3.hasNext()) {
         int var4 = ((Integer)var3.next()).intValue();
         hO var5 = this.dN.mS(var4);
         String var6 = var2.ld(false);
         String var7 = var5.ld(false);
         if(var6.equals(var7)) {
            int[] var8 = var2.OK().zs();
            int[] var9 = var5.OK().zs();
            if(Arrays.equals(var8, var9)) {
               return var4;
            }
         }
      }

      return -1;
   }
}
