package jebglobal;

import jebglobal.Ji;
import jebglobal.ZF;
import jebglobal.ew;
import jebglobal.fL;
import jebglobal.k;
import jebglobal.kM;
import jebglobal.lW;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Shell;

public final class PM extends fL {
   private Font dN;
   private ew ld;

   public PM(Shell var1, Font var2, ew var3) {
      super(var1, "Properties");
      this.dN = var2;
      this.ld = var3;
   }

   protected void dN(Shell var1) {
      var1.setLayout(new GridLayout(1, false));
      lW var2 = new lW(var1, this.dN, false);
      GC var4 = new GC(var2);

      GridData var3;
      try {
         var4.setFont(var2.getFont());
         FontMetrics var5 = var4.getFontMetrics();
         var3 = new GridData(120 * var5.getAverageCharWidth(), 20 * var5.getHeight());
      } finally {
         var4.dispose();
      }

      var2.setLayoutData(var3);
      StringBuilder var11 = new StringBuilder();
      var11.append("> File properties\n");
      k var6 = this.ld.QE();
      var11.append(String.format("Original path: %s\n", new Object[]{var6.LH()}));
      var11.append(String.format("MD5: %s\n", new Object[]{ZF.ld(var6.KK())}));
      var11.append(String.format("SHA-1: %s\n", new Object[]{ZF.ld(var6.EO())}));
      var11.append(String.format("SHA-256: %s\n", new Object[]{ZF.ld(var6.cb())}));
      var11.append("\n");
      var11.append("> Analysts\n");

      for(int var7 = 0; var7 < this.ld.fa(); ++var7) {
         kM var8 = this.ld.dN(var7);
         var11.append(String.format("%s (%s)\n", new Object[]{var8.LH(), var8.KK()}));
      }

      var11.append("\n");
      var11.append("> Version\n");
      Ji var12 = this.ld.wU();
      var11.append(String.format("%d.%d.%d\n", new Object[]{Integer.valueOf(var12.LH()), Integer.valueOf(var12.KK()), Integer.valueOf(var12.EO())}));
      var2.QE(var11.toString());
   }
}
