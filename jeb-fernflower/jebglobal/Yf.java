package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.Cx;
import jebglobal.HC;
import jebglobal.Pl;
import jebglobal.Ss;
import jebglobal.WV;
import jebglobal.YJ;
import jebglobal.as;
import jebglobal.hO;
import jebglobal.tg;
import jebglobal.yK;
import jebglobal.yn;
import jebglobal.yx;

public final class Yf extends as {
   public Yf(yn var1) {
      super(var1, "Item info");
      this.ld = 105;
      this.fa = HC.dN().dN("icon-info.png");
      this.OK = true;
   }

   public boolean OK() {
      return this.dN(true);
   }

   public boolean LH() {
      return this.dN(false);
   }

   private boolean dN(boolean var1) {
      YJ var2 = this.dN.OK();
      if(var2 == null) {
         return false;
      } else {
         Object var3 = var2.zs();
         if(var3 == null) {
            return false;
         } else {
            yx var4 = this.dN.wU();
            AR var5 = var4.QE();
            int var6 = -1;
            hO var7 = null;
            if(var3 instanceof String) {
               var6 = var5.mS().ld((String)var3);
               if(var6 < 0) {
                  return false;
               }
            } else if(var3 instanceof yK) {
               yK var8 = (yK)var3;
               var6 = var8.zs();
            } else {
               if(!(var3 instanceof hO)) {
                  return false;
               }

               var7 = (hO)var3;
            }

            if(var1) {
               return true;
            } else {
               if(var6 >= 0) {
                  tg var17 = new tg(this.dN.getShell(), this.dN.QE().XZ(), var5, var6);
                  int var9 = var17.dN().intValue();
                  if(var9 >= 0 && this.dN instanceof Pl) {
                     int var10 = ((Pl)this.dN).Hw().dN(var5.dN(var9, false));
                     if(var10 >= 0) {
                        this.dN.ld(this.dN.OK(var10));
                     }
                  }
               } else if(var7 != null) {
                  Cx var18 = new Cx(var5);
                  ArrayList var19 = new ArrayList();
                  if(!var18.dN((hO)var7, (List)var19)) {
                     return false;
                  }

                  ArrayList var20 = new ArrayList();
                  Iterator var12 = var19.iterator();

                  while(var12.hasNext()) {
                     int var13 = ((Integer)var12.next()).intValue();
                     hO var14 = var5.mS(var13);
                     int var15 = 0;
                     if(this.dN instanceof Pl) {
                        var15 = ((Pl)this.dN).Hw().dN(var14.wU(false));
                     }

                     int var16 = this.dN.OK(var15);
                     var20.add(new Ss.uK(var16, var15, var14.wU(true)));
                  }

                  int var21 = this.dN.QE().EO().QE(WV.nA);
                  Ss var22 = new Ss(this.dN.getShell(), var21, var20, 0, "Method overrides", "Line #", "Information");
                  int var11 = var22.dN().intValue();
                  if(var11 >= 0) {
                     this.dN.ld(((Ss.uK)var20.get(var11)).dN);
                  }
               }

               return true;
            }
         }
      }
   }
}
