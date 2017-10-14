package jebglobal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.Gy;
import jebglobal.HI;
import jebglobal.TB;
import jebglobal.Ts;
import jebglobal.Xf;
import jebglobal.ZF;
import jebglobal.hV;
import jebglobal.kn;
import jebglobal.oh;
import jebglobal.tu;
import jebglobal.wm;
import jebglobal.xS;

public final class xy extends Ts {
   private int ld;
   private int QE;

   public xy(int var1, hV var2) {
      if(var1 >= 0 && var1 <= '\uffff') {
         this.ld = var1;
         if(var2.rK()) {
            this.QE = -1;
         } else {
            if(!var2.Ux()) {
               throw new IllegalArgumentException();
            }

            this.QE = var1 + 1;
            if(var1 == '\uffff') {
               throw new RuntimeException();
            }
         }

         this.dN = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public boolean ld(xy var1) {
      return this.ld == var1.ld && this.QE == var1.QE;
   }

   public boolean QE(xy var1) {
      return this.ld == var1.ld && this.QE == var1.QE;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         xy var2 = (xy)var1;
         return this.ld == var2.ld && this.QE == var2.QE && this.dN.equals(var2.dN);
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = 31 + this.ld;
      var1 = 31 * var1 + this.QE;
      var1 = 31 * var1 + this.dN.hashCode();
      return var1;
   }

   public HashSet fa() {
      HashSet var1 = new HashSet();
      var1.add(Integer.valueOf(this.ld));
      if(this.QE >= 0) {
         var1.add(Integer.valueOf(this.QE));
      }

      return var1;
   }

   hV dN(int var1) {
      return var1 != this.ld && var1 != this.QE?hV.dN:this.dN;
   }

   boolean dN(int var1, hV var2) {
      return var1 != this.ld && var1 != this.QE?false:this.dN((hV)var2);
   }

   public boolean ld() {
      return false;
   }

   public boolean QE() {
      return false;
   }

   int dN(xy var1) {
      if(this.ld == var1.ld && this.QE == var1.QE) {
         this.dN.dN(var1.dN);
         return 1;
      } else {
         return 0;
      }
   }

   int dN(xy var1, tu var2) {
      return 0;
   }

   int dN(xy var1, long var2) {
      return 0;
   }

   void dN(hV var1, hV var2) {
      super.dN(var1, var2);
   }

   public List wU() {
      return ZF.dN(new tu[0]);
   }

   public boolean dN(tu var1, tu var2) {
      return false;
   }

   public String toString() {
      return this.QE >= 0?String.format("v%d:v%d<%s>", new Object[]{Integer.valueOf(this.QE), Integer.valueOf(this.ld), this.dN}):String.format("v%d<%s>", new Object[]{Integer.valueOf(this.ld), this.dN});
   }

   public Xf dN(TB var1) {
      this.dN.ld(var1.QE);
      if(var1.cb) {
         StringBuilder var7 = new StringBuilder();
         hV[] var8 = new hV[1];
         wm var9 = var1.LH.dN(this.ld, this.dN, var7, var8);
         if(var9 != null) {
            var1.PF.put(var1.EO, var9);
            return var9.zs();
         } else {
            var9 = var1.LH.dN(var1.EO.dN(), this.dN, this.ld, (String)null);
            var9.dN(var1.EO.mS());
            var1.PF.put(var1.EO, var9);
            return var9;
         }
      } else {
         HashSet var2 = this.ld(var1);
         if(var2.isEmpty()) {
            throw new RuntimeException();
         } else {
            var2.size();
            wm var3 = (wm)var2.iterator().next();
            HI var4 = var3.zs();
            hV var5 = var3.ld();
            if(this.dN == var5) {
               return var4;
            } else if(this.dN == hV.zs && (var5 == hV.QE || var5 == hV.wU || var5 == hV.fa)) {
               return var4;
            } else if(this.dN.equals(var1.wU.dN("Ljava/lang/Object;"))) {
               return var4;
            } else {
               kn var6 = var1.fa.dN(this.dN);
               return new Gy((Xf)null, var6, var4);
            }
         }
      }
   }

   private HashSet ld(TB var1) {
      var1.ld.zs();
      HashSet var2 = new HashSet();
      HashMap var3 = new HashMap();
      Iterator var4 = var1.LH.dN(this.ld).iterator();

      while(var4.hasNext()) {
         wm var5 = (wm)var4.next();
         var3.put(Integer.valueOf(var5.dN()), var5);
      }

      this.dN(var1.ld, this.ld, var1.EO, var1.PF, var2, new HashSet());
      if(var2.isEmpty() && var3.containsKey(Integer.valueOf(-1))) {
         var2.add(var3.get(Integer.valueOf(-1)));
      }

      return var2;
   }

   private void dN(oh var1, int var2, xS var3, HashMap var4, HashSet var5, HashSet var6) {
      if(!var6.contains(var3)) {
         var6.add(var3);
         List var7 = (List)((HashMap)var1.KK().get(var3)).get(Integer.valueOf(var2));
         if(var7 != null) {
            Iterator var8 = var7.iterator();

            while(true) {
               while(var8.hasNext()) {
                  xS var9 = (xS)var8.next();
                  wm var10 = (wm)var4.get(var9);
                  if(var10 != null && var10.zs().ld() == var2) {
                     var5.add(var10);
                  } else {
                     this.dN(var1, var2, var9, var4, var5, var6);
                  }
               }

               return;
            }
         }
      }
   }
}
