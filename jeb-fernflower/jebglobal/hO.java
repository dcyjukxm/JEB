package jebglobal;

import java.util.Iterator;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Bw;
import jebglobal.Oa;
import jebglobal.Uk;
import jebglobal.lP;
import jebglobal.nh;
import jebglobal.yK;

public final class hO implements Oa {
   private AR dN;
   private int ld;
   private int QE;
   private int wU;
   private int fa;
   private String zs;

   hO(AR var1, int var2, int var3, int var4, int var5) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
      this.wU = var4;
      this.fa = var5;
      this.zs = null;
   }

   public int dN() {
      return this.ld;
   }

   public AV ld() {
      return (AV)this.dN.dN.get(this.wU(false));
   }

   public boolean QE() {
      return this.ld() != null;
   }

   public boolean dN(String var1) {
      return this.dN(var1, true);
   }

   public boolean ld(String var1) {
      return this.dN(var1, false);
   }

   private boolean dN(String var1, boolean var2) {
      if((var1 != null || this.zs != null) && (var1 == null || !var1.equals(this.zs))) {
         if(var1 != null && !lP.QE(var1)) {
            return false;
         } else {
            if(var1 != null && var1.equals(this.ld(false))) {
               var1 = null;
               if(this.zs == null) {
                  return true;
               }
            }

            if(var1 != null) {
               yK var3 = this.dN.EO(this.dN(false));
               if(var3 != null) {
                  Uk var4 = var3.s();
                  if(var4 != null) {
                     label75: {
                        Iterator var5 = var4.zs().iterator();

                        hO var7;
                        do {
                           do {
                              if(!var5.hasNext()) {
                                 break label75;
                              }

                              AV var6 = (AV)var5.next();
                              var7 = this.dN.mS(var6.ld());
                           } while(var7 == this);
                        } while(!var7.ld(false).equals(var1) && !var7.ld(true).equals(var1));

                        return false;
                     }
                  }
               }
            }

            if(!var2) {
               this.zs = var1;
               if(this.QE()) {
                  this.dN.QE = null;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean wU() {
      return this.zs != null;
   }

   public int fa() {
      return this.QE;
   }

   public nh.vd zs() {
      return this.dN.QE(this.QE);
   }

   public String dN(boolean var1) {
      return this.dN.dN(this.QE, var1);
   }

   public int mS() {
      return this.wU;
   }

   public Bw OK() {
      return this.dN.wU(this.wU);
   }

   public int LH() {
      return this.fa;
   }

   public String ld(boolean var1) {
      return var1 && this.zs != null?this.zs:this.dN.dN(this.fa);
   }

   public String QE(boolean var1) {
      return this.dN.dN(this.QE, var1) + "->" + this.ld(var1);
   }

   public String wU(boolean var1) {
      return this.QE(var1) + this.OK().QE(var1);
   }

   public String toString() {
      return super.toString();
   }
}
