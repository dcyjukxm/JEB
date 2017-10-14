package jebglobal;

import jebglobal.QH;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public final class v extends Composite implements QH {
   private Button dN;

   public v(Composite var1, String var2, boolean var3) {
      super(var1, 32);
      GridLayout var4 = new GridLayout(1, false);
      var4.marginHeight = 0;
      var4.verticalSpacing = 0;
      var4.marginWidth = 0;
      var4.horizontalSpacing = 0;
      this.setLayout(var4);
      this.dN = new Button(var1, 32);
      if(var2 != null) {
         this.dN.setText(var2);
      }

      this.dN.setSelection(var3);
   }

   public String dN() {
      return Boolean.toString(this.dN.getSelection());
   }
}
