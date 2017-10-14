package jebglobal;

import jebglobal.OD;
import jebglobal.ew;
import jebglobal.lW;
import jebglobal.yx;
import org.eclipse.swt.widgets.Composite;

public final class uT extends lW {
   private ew dN;

   public uT(Composite var1, yx var2) {
      super(var1, var2.dN().XZ(), true);
      this.dN = var2.ld();
      if(this.dN == null) {
         throw new RuntimeException();
      }
   }

   public void KK() {
      OD var1 = this.dN.EO();
      if(var1 != null && var1.PF() != null) {
         this.QE(var1.PF());
      } else {
         this.QE("You can type your notes here - they will be saved with your JDB.");
         this.VX();
      }
   }
}
