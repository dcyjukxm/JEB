package jebglobal;

import jebglobal.HC;
import jebglobal.Os;
import jebglobal.Rg;
import jebglobal.as;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;

public final class RL extends as {
   private Os KK;

   public RL(Os var1) {
      super(var1, "Forced Refresh (redecompile)");
      this.KK = var1;
      if(var1.QE().cb()) {
         this.ld = 82;
         this.QE = SWT.MOD1 | SWT.MOD2;
      } else {
         this.ld = 16777230;
         this.QE = SWT.MOD1;
      }

      this.fa = HC.dN().dN("icon-refresh.png");
      this.OK = false;
   }

   public boolean OK() {
      return true;
   }

   public boolean LH() {
      MessageBox var1 = new MessageBox(this.KK.getShell(), 200);
      var1.setText("Confirmation");
      var1.setMessage("Redo a decompilation?");
      if(var1.open() == 128) {
         return false;
      } else {
         Rg var2 = this.KK.wU().wU();
         var2.dN(true);
         this.KK.dN(true);
         var2.dN(false);
         return true;
      }
   }
}
