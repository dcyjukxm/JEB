package jebglobal;

import jebglobal.TM;
import jebglobal.fL;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public final class Zf extends fL {
   private Text dN;
   private String ld;
   private Font QE;
   private String wU;

   public Zf(Shell var1, Font var2, String var3) {
      super(var1, "Jump to");
      this.QE = var2;
      this.wU = var3;
   }

   public String dN() {
      super.ld();
      return this.ld;
   }

   public void dN(final Shell var1) {
      var1.setLayout(new RowLayout(512));
      this.dN = TM.dN(var1, 30, this.wU, (SelectionListener)null);
      this.dN.setFont(this.QE);
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new RowLayout(256));
      Button var3 = TM.dN((Composite)var2, (String)"OK", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private Zf ld = Zf.this;

         public void widgetSelected(SelectionEvent var1) {
            this.ld.ld = this.ld.dN.getText();
            this.dN.close();
         }
      }));
      TM.dN((Composite)var2, (String)"Cancel", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private Zf ld = Zf.this;

         public void widgetSelected(SelectionEvent var1) {
            this.ld.ld = null;
            this.dN.close();
         }
      }));
      var1.setDefaultButton(var3);
   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }
}
