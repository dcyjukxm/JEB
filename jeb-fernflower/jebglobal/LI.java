package jebglobal;

import java.util.Arrays;
import java.util.Comparator;
import jebglobal.Kf;
import jebglobal.PS;
import jebglobal.UD;
import jebglobal.Vp;
import jebglobal.dx;
import jebglobal.fv;
import jebglobal.sm;

public final class LI extends sm {
   private final LI.uK[] ld;
   private LI.uK[] QE;
   private LI.uK[] wU;

   LI(UD var1, int var2, Integer var3, Integer var4, Boolean var5, PS[] var6) {
      super(var1, var2, var3, var4, var5);
      this.ld = new LI.uK[var6.length];

      for(int var7 = 0; var7 < var6.length; ++var7) {
         this.ld[var7] = new LI.uK((UD)var6[var7].dN, ((Vp)var6[var7].ld).ld());
      }

   }

   public String dN(fv var1) {
      if(!(var1 instanceof Vp)) {
         return super.dN(var1);
      } else {
         this.ld();
         int var2 = ((Vp)var1).ld();
         if(var2 == 0) {
            return this.dN(this.QE);
         } else {
            LI.uK[] var3 = new LI.uK[this.wU.length];
            int[] var4 = new int[this.wU.length];
            int var5 = 0;

            for(int var6 = 0; var6 < this.wU.length; ++var6) {
               LI.uK var7 = this.wU[var6];
               int var8 = var7.dN;
               if((var2 & var8) == var8 && !this.dN(var8, var4)) {
                  var4[var5] = var8;
                  var3[var5++] = var7;
               }
            }

            return this.dN((LI.uK[])Arrays.copyOf(var3, var5));
         }
      }
   }

   protected void ld(Kf var1, dx var2) {
      for(int var3 = 0; var3 < this.ld.length; ++var3) {
         LI.uK var4 = this.ld[var3];
         var1.ld((String)null, "flag");
         var1.dN((String)null, "name", var4.dN());
         var1.dN((String)null, "value", String.format("0x%08x", new Object[]{Integer.valueOf(var4.dN)}));
         var1.QE((String)null, "flag");
      }

   }

   private boolean dN(int var1, int[] var2) {
      for(int var3 = 0; var3 < var2.length; ++var3) {
         if((var2[var3] & var1) == var1) {
            return true;
         }
      }

      return false;
   }

   private String dN(LI.uK[] var1) {
      String var2 = "";

      for(int var3 = 0; var3 < var1.length; ++var3) {
         var2 = var2 + "|" + var1[var3].dN();
      }

      return var2.isEmpty()?var2:var2.substring(1);
   }

   private void ld() {
      if(this.wU == null) {
         LI.uK[] var1 = new LI.uK[this.ld.length];
         int var2 = 0;
         LI.uK[] var3 = new LI.uK[this.ld.length];
         int var4 = 0;

         for(int var5 = 0; var5 < this.ld.length; ++var5) {
            LI.uK var6 = this.ld[var5];
            if(var6.dN == 0) {
               var1[var2++] = var6;
            } else {
               var3[var4++] = var6;
            }
         }

         this.QE = (LI.uK[])Arrays.copyOf(var1, var2);
         this.wU = (LI.uK[])Arrays.copyOf(var3, var4);
         Arrays.sort(this.wU, new Comparator() {
            public int dN(LI.uK var1, LI.uK var2) {
               return Integer.valueOf(Integer.bitCount(var2.dN)).compareTo(Integer.valueOf(Integer.bitCount(var1.dN)));
            }

            // $FF: synthetic method
            public int compare(Object var1, Object var2) {
               return this.dN((LI.uK)var1, (LI.uK)var2);
            }
         });
      }
   }

   static class uK {
      private UD ld;
      public final int dN;
      private String QE;

      public uK(UD var1, int var2) {
         this.ld = var1;
         this.dN = var2;
      }

      public String dN() {
         if(this.QE == null) {
            this.QE = this.ld.QE().fa();
         }

         return this.QE;
      }
   }
}
