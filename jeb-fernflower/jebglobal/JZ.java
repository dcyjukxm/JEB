package jebglobal;

import jebglobal.QH;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public final class JZ extends Composite implements QH {
   private Text dN;

   public JZ(Composite var1, String var2, String var3, int var4) {
      super(var1, 0);
      this.setLayout(new GridLayout(2, false));
      this.dN = new Text(this, 2052);
      if(var3 != null) {
         this.dN.setText(var3);
      }

      if(var4 >= 1) {
         GC var6 = new GC(this.dN);

         GridData var5;
         try {
            var6.setFont(this.dN.getFont());
            FontMetrics var7 = var6.getFontMetrics();
            var5 = new GridData(var4 * var7.getAverageCharWidth(), 1 * var7.getHeight());
         } finally {
            var6.dispose();
         }

         this.dN.setLayoutData(var5);
      }

      Label var11 = new Label(this, 0);
      if(var2 != null) {
         var11.setText(var2);
      }

   }

   public String dN() {
      return this.dN.getText();
   }
}
