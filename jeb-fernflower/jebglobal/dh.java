package jebglobal;

import jebglobal.TM;
import jebglobal.fL;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public final class dh extends fL {
   private String dN;
   private Font ld;
   private int QE;
   private String wU;
   private String fa;

   public dh(Shell var1, Font var2, int var3, String var4, String var5, String var6) {
      super(var1, var4);
      this.ld = var2;
      this.QE = var3;
      this.wU = var5;
      this.fa = var6;
   }

   public String dN() {
      super.ld();
      return this.dN == null?null:this.dN;
   }

   public void dN(final Shell var1) {
      var1.setLayout(new RowLayout(512));
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new GridLayout(1, false));
      Composite var3 = new Composite(var1, 0);
      var3.setLayout(new RowLayout(256));
      if(this.wU != null) {
         Label var4 = new Label(var2, 0);
         var4.setText(this.wU);
      }

      final Text var11;
      if(this.QE >= 2) {
         var11 = new Text(var2, 2626);
      } else {
         var11 = new Text(var2, 2052);
      }

      var11.setFont(this.ld);
      GC var6 = new GC(var11);

      GridData var5;
      try {
         var6.setFont(var11.getFont());
         FontMetrics var7 = var6.getFontMetrics();
         var5 = new GridData(200, this.QE * var7.getHeight());
      } finally {
         var6.dispose();
      }

      var11.setLayoutData(var5);
      if(this.fa != null) {
         var11.setText(this.fa);
      }

      var11.selectAll();
      Button var12 = TM.dN((Composite)var3, (String)"OK", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Text dN = var11;
         // $FF: synthetic field
         private Shell ld = var1;
         // $FF: synthetic field
         private dh QE = dh.this;

         public void widgetSelected(SelectionEvent var1) {
            this.QE.dN = this.dN.getText();
            this.ld.close();
         }
      }));
      TM.dN((Composite)var3, (String)"Cancel", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private dh ld = dh.this;

         public void widgetSelected(SelectionEvent var1) {
            this.ld.dN = null;
            this.dN.close();
         }
      }));
      var1.setDefaultButton(var12);
   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }
}
