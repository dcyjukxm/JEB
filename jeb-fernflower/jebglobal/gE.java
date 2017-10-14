package jebglobal;

import java.util.Iterator;
import jebglobal.AR;
import jebglobal.Oa;
import jebglobal.Uk;
import jebglobal.XV;
import jebglobal.lP;
import jebglobal.nh;
import jebglobal.yK;

public final class gE implements Oa {
   private AR dN;
   private int ld;
   private int QE;
   private int wU;
   private int fa;
   private String zs;

   gE(AR var1, int var2, int var3, int var4, int var5) {
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

   public XV ld() {
      return (XV)this.dN.ld.get(this.fa(false));
   }

   public boolean QE() {
      return this.ld() != null;
   }

   public boolean dN(String var1) {
      return this.dN(var1, false);
   }

   private boolean dN(String var1, boolean var2) {
      if((var1 != null || this.zs != null) && (var1 == null || !var1.equals(this.zs))) {
         if(var1 != null && !lP.QE(var1)) {
            return false;
         } else {
            if(var1 != null && var1.equals(this.QE(false))) {
               var1 = null;
               if(this.zs == null) {
                  return true;
               }
            }

            if(var1 != null) {
               yK var3 = this.dN.EO(this.dN(false));
               if(var3 != null) {
                  Uk var4 = var3.s();
                  if(var3 != null) {
                     label75: {
                        Iterator var5 = var4.QE().iterator();

                        gE var7;
                        do {
                           do {
                              if(!var5.hasNext()) {
                                 break label75;
                              }

                              XV var6 = (XV)var5.next();
                              var7 = this.dN.fa(var6.dN());
                           } while(var7 == this);
                        } while(!var7.QE(false).equals(var1) && !var7.QE(true).equals(var1));

                        return false;
                     }
                  }
               }
            }

            if(!var2) {
               this.zs = var1;
               if(this.QE()) {
                  this.dN.wU = null;
               }
            }

            return true;
         }
      } else {
         return true;
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

   public nh.vd mS() {
      return this.dN.QE(this.wU);
   }

   public String ld(boolean var1) {
      return this.dN.dN(this.wU, var1);
   }

   public int OK() {
      return this.fa;
   }

   public String QE(boolean var1) {
      return var1 && this.zs != null?this.zs:this.dN.dN(this.fa);
   }

   public String wU(boolean var1) {
      return this.dN.dN(this.QE, var1) + "->" + this.QE(var1);
   }

   public String fa(boolean var1) {
      return this.wU(var1) + ":" + this.dN.dN(this.wU, var1);
   }

   public String toString() {
      return super.toString();
   }
}
