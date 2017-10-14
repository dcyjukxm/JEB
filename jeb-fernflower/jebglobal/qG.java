package jebglobal;

import java.io.File;
import java.io.IOException;
import jebglobal.QH;
import jebglobal.TM;
import jebglobal.yW;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public final class qG extends Composite implements QH {
   private Text dN;

   public qG(Composite var1, String var2, String var3) {
      super(var1, 0);
      this.setLayout(new GridLayout(2, false));
      Label var4 = new Label(this, 0);
      if(var2 != null) {
         var4.setText(var2);
      }

      GridData var5 = new GridData();
      var5.horizontalSpan = 2;
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
      TM.dN((Composite)this, (String)"Browse", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private qG dN = qG.this;

         public void widgetSelected(SelectionEvent var1) {
            DirectoryDialog var2 = new DirectoryDialog(this.dN.getShell());
            var2.setMessage("Directory");
            String var3 = this.dN.dN.getText();
            if(var3 != null) {
               File var4 = new File(var3);
               if(!var4.isAbsolute()) {
                  try {
                     var3 = (new File(yW.OK(), var3)).getCanonicalPath();
                  } catch (IOException var5) {
                     ;
                  }
               }
            }

            if(var3 != null) {
               var2.setFilterPath(var3);
            }

            var3 = var2.open();
            if(var3 != null) {
               this.dN.dN.setText(var3);
            }

         }
      }));
   }

   public String dN() {
      return this.dN.getText();
   }
}
