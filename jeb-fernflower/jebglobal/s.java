package jebglobal;

import jebglobal.HC;
import jebglobal.as;
import jebglobal.yn;
import org.eclipse.swt.SWT;

public final class s extends as {
   public s(yn var1) {
      super(var1, "Refresh");
      if(var1.QE().cb()) {
         this.ld = 82;
         this.QE = SWT.MOD1;
      } else {
         this.ld = 16777230;
      }

      this.fa = HC.dN().dN("icon-refresh.png");
      this.OK = true;
   }

   public boolean OK() {
      return true;
   }

   public boolean LH() {
      this.dN.dN(true);
      return true;
   }
}
