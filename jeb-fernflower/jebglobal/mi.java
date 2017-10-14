package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jebglobal.Fu;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.hO;
import jebglobal.oc;
import jebglobal.zd;

public final class mi extends II implements Xf {
   private Fu dN;
   private List ld;
   private boolean QE;

   public mi(Fu var1, boolean var2) {
      this.dN(var1, var2);
      this.ld = new ArrayList();
   }

   public mi(Fu var1, boolean var2, List var3) {
      this(var1, var2);
      this.ld.addAll(var3);
   }

   public Fu dN() {
      return this.dN;
   }

   public void dN(Fu var1, boolean var2) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
         this.QE = var2;
      }
   }

   public boolean ld() {
      return this.QE;
   }

   public int zs() {
      return this.ld.size();
   }

   public List mS() {
      return this.ld;
   }

   public void dN(Xf var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.ld.add(var1);
      }
   }

   public void dN(int var1, Xf var2) {
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         this.ld.set(var1, var2);
      }
   }

   public void ld(int var1, Xf var2) {
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         this.ld.add(var1, var2);
      }
   }

   public Xf ld(int var1) {
      return (Xf)this.ld.remove(var1);
   }

   public List wU() {
      List var1 = TM.dN(new IK[]{this.dN});
      return TM.dN((List)var1, (Collection)this.ld);
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (Fu)var2;
         return true;
      } else {
         for(int var3 = 0; var3 < this.ld.size(); ++var3) {
            if(this.ld.get(var3) == var1) {
               this.ld.set(var3, (Xf)var2);
               return true;
            }
         }

         return false;
      }
   }

   public void dN(ZL var1) {
      this.ld(var1);
      boolean var2 = true;
      String var3 = this.dN.mS();
      int var4 = this.dN.QE();
      Object var5 = this;
      boolean var6 = var3.equals("<init>");
      if(var6) {
         var3 = "super";
         if(var1.dN() != null) {
            String var7 = this.dN.zs();
            String var8 = var1.dN().ld();
            if(var7 != null && var8 != null && var7.equals(var8)) {
               var3 = "this";
            }
         }

         var2 = false;
         if(var1.OK != null && var4 >= 0) {
            var5 = var1.OK.mS(var4);
         }
      } else if(var1.OK != null && var4 >= 0) {
         hO var9 = var1.OK.mS(var4);
         var3 = var9.ld(true);
         var5 = var9;
      }

      byte var10;
      if(this.dN.cb()) {
         zd var11 = this.dN.LH();
         if(var11 != null) {
            oc.dN(var1, var11.fa());
         } else {
            var1.wU(this.dN.zs());
         }

         var1.wU(".");
         var10 = 0;
      } else {
         if(var2) {
            if(this.QE) {
               var1.dN(oc.Hv);
            } else {
               ((Xf)this.ld.get(0)).dN(var1);
            }

            var1.wU(".");
         }

         var10 = 1;
      }

      var1.dN(var3, Zh.ZY, var5);
      var1.wU("(");

      for(int var12 = var10; var12 < this.ld.size(); ++var12) {
         if(var12 > var10) {
            var1.wU(", ");
         }

         ((Xf)this.ld.get(var12)).dN(var1);
      }

      var1.wU(")");
   }
}
