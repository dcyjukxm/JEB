package jebglobal;

import jebglobal.HC;
import jebglobal.Ky;
import jebglobal.LW;
import jebglobal.Os;
import jebglobal.as;
import jebglobal.yn;
import org.eclipse.swt.SWT;

public final class ER extends as {
   public ER(yn var1) {
      super(var1, "Navigate forward");
      this.ld = 13;
      this.QE = SWT.MOD1;
      this.fa = HC.dN().dN("icon-arrow-right.png");
      this.OK = true;
   }

   public boolean OK() {
      if(this.dN.LH().wU()) {
         return true;
      } else if(this.dN instanceof Os) {
         Os var1 = (Os)this.dN;
         return var1.Ux().wU();
      } else {
         return false;
      }
   }

   public boolean LH() {
      LW var1 = new LW(this.dN.zs(), this.dN.mS());
      LW var2 = (LW)this.dN.LH().QE(var1);
      if(var2 != null) {
         this.dN.dN(var2, false);
         return true;
      } else {
         if(this.dN instanceof Os) {
            Os var3 = (Os)this.dN;
            String var4 = (String)var3.Ux().QE(var3.rK());
            if(var4 != null) {
               var3.dN(var4, (Ky)null, false);
               LW var5 = (LW)var3.LH().QE((Object)null);
               if(var5 != null) {
                  var3.dN(var5, false);
               }

               return true;
            }
         }

         return false;
      }
   }
}
