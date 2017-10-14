package jebglobal;

import jebglobal.QH;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public final class Dg extends Composite implements QH {
   private Text dN;

   public Dg(Composite var1, String var2, String var3) {
      super(var1, 0);
      this.setLayout(new GridLayout(1, false));
      Label var4 = new Label(this, 0);
      if(var2 != null) {
         var4.setText(var2);
      }

      GridData var5 = new GridData();
      var5.horizontalAlignment = 4;
      var5.grabExcessHorizontalSpace = true;
      var4.setLayoutData(var5);
      this.dN = new Text(this, 2052);
      if(var3 != null) {
         this.dN.setText(var3);
      }

      var5 = new GridData();
      var5.horizontalAlignment = 4;
      var5.grabExcessHorizontalSpace = true;
      this.dN.setLayoutData(var5);
   }

   public String dN() {
      return this.dN.getText();
   }
}
