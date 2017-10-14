package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.HC;
import jebglobal.Ky;
import jebglobal.Os;
import jebglobal.Ss;
import jebglobal.WV;
import jebglobal.YJ;
import jebglobal.as;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.yK;
import jebglobal.yx;
import org.eclipse.swt.SWT;

public final class of extends as {
   private Os KK;

   public of(Os var1) {
      super(var1, "Cross-references (real)");
      this.KK = var1;
      this.ld = 120;
      this.QE = SWT.MOD1;
      this.fa = HC.dN().dN("icon-letter-x-red.png");
      this.OK = true;
   }

   public boolean OK() {
      return this.dN(true);
   }

   public boolean LH() {
      return this.dN(false);
   }

   public boolean dN(boolean var1) {
      YJ var2 = this.KK.OK();
      if(var2 == null) {
         return false;
      } else {
         Object var3 = var2.zs();
         if(!(var3 instanceof yK) && !(var3 instanceof gE) && !(var3 instanceof hO)) {
            return false;
         } else if(var1) {
            return true;
         } else {
            AR var4 = this.KK.wU().QE();
            List var5 = null;
            int var7;
            if(var3 instanceof yK) {
               yK var6 = (yK)var3;
               var7 = var6.zs();
               var5 = (List)var4.zs().dN().get(Integer.valueOf(var7));
            } else if(var3 instanceof gE) {
               gE var14 = (gE)var3;
               var7 = var14.dN();
               var5 = (List)var4.zs().ld().get(Integer.valueOf(var7));
            } else if(var3 instanceof hO) {
               hO var15 = (hO)var3;
               var7 = var15.dN();
               var5 = (List)var4.zs().QE().get(Integer.valueOf(var7));
            }

            if(var5 == null) {
               return false;
            } else {
               ArrayList var16 = new ArrayList();

               int var9;
               String var10;
               for(Iterator var8 = var5.iterator(); var8.hasNext(); var16.add(new Ss.uK(var9, var9, var10))) {
                  var9 = ((Integer)var8.next()).intValue();
                  var10 = "?";
                  hO var11 = var4.LH(var9);
                  if(var11 != null) {
                     var10 = var11.wU(true);
                  }
               }

               int var17 = this.KK.QE().EO().QE(WV.nA);
               Ss var18 = new Ss(this.KK.getShell(), var17, var16, 0, "Cross-references (code)", "Code offset", "Method");
               var7 = var18.dN().intValue();
               if(var7 >= 0) {
                  Ss.uK var19 = (Ss.uK)var16.get(var7);
                  yx var20 = this.KK.wU();
                  Ky var12 = new Ky();
                  hO var13 = var4.LH(var19.dN);
                  var12.wU = var13.wU(false);
                  var12.dN = var12.wU;
                  var12.ld = var13.wU(true);
                  var12.mS = var13.ld().wU().ld();
                  var12.zs = var19.dN - var12.mS;
                  var20.OK().dN(var12);
                  var20.EO();
                  var20.OK().rK();
               }

               return true;
            }
         }
      }
   }
}
