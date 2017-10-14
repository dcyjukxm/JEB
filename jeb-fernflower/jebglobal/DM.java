package jebglobal;

import jebglobal.ZF;
import jebglobal.lW;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;

public final class DM extends lW {
   public DM(Composite var1, Font var2) {
      super(var1, var2, false);
   }

   public void dN(byte[] var1) {
      String var2 = ZF.dN(var1, 0, var1.length, 0);
      this.zs.setText(var2);
   }
}
