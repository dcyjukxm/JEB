package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.HC;
import jebglobal.Ky;
import jebglobal.LW;
import jebglobal.Pl;
import jebglobal.Ss;
import jebglobal.TM;
import jebglobal.WV;
import jebglobal.YJ;
import jebglobal.as;
import jebglobal.yn;
import org.eclipse.swt.widgets.MessageBox;

public final class aJ extends as {
   public aJ(yn var1) {
      super(var1, "Cross-references");
      this.ld = 120;
      this.fa = HC.dN().dN("icon-letter-x.png");
      this.OK = true;
   }

   public boolean OK() {
      YJ var1 = this.dN.OK();
      return var1 != null && this.dN.ld(var1) != null;
   }

   public boolean LH() {
      YJ var1 = this.dN.OK();
      if(var1 == null) {
         return false;
      } else {
         List var2 = this.dN.ld(var1);
         if(var2 == null) {
            return false;
         } else {
            TM var3 = this.dN.QE().EO();
            int var4 = var3.QE(WV.vW);
            int var5 = var2.size();
            if(var4 > 0 && var5 >= var4) {
               MessageBox var6 = new MessageBox(this.dN.getShell(), 200);
               var6.setText("Confirmation");
               var6.setMessage(String.format("%d visual cross-references are about to be displayed.\nThis may take a while. Proceed?", new Object[]{Integer.valueOf(var5)}));
               if(var6.open() == 128) {
                  return false;
               }
            }

            ArrayList var15 = new ArrayList(var2.size());
            int var7 = 0;
            int var8 = 0;

            for(Iterator var9 = var2.iterator(); var9.hasNext(); ++var7) {
               LW var10 = (LW)var9.next();
               int var11 = var10.dN();
               String var12 = null;
               if(this.dN instanceof Pl) {
                  Pl var13 = (Pl)this.dN;
                  Ky var14 = var13.QE(var11);
                  if(var14 != null) {
                     if(var14.ld != null) {
                        var12 = var14.ld;
                     } else if(var14.dN != null) {
                        var12 = var14.dN;
                     }
                  }
               }

               if(var12 == null) {
                  var12 = this.dN.mS(var11);
               }

               var15.add(new Ss.uK(this.dN.OK(var11) + var10.ld(), var11, var12));
               if(var10.QE() == var1) {
                  var8 = var7;
               }
            }

            int var16 = this.dN.QE().EO().QE(WV.nA);
            Ss var17 = new Ss(this.dN.getShell(), var16, var15, var8, "Cross references (visual)", "Line #", "Information");
            var7 = var17.dN().intValue();
            if(var7 >= 0) {
               this.dN.ld(((Ss.uK)var15.get(var7)).dN);
            }

            return true;
         }
      }
   }
}
