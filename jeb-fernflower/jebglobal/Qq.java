package jebglobal;

import jebglobal.TM;
import jebglobal.Vm;
import jebglobal.fL;
import jebglobal.rP;
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

public final class Qq extends fL {
   private String dN;
   private Font ld;
   private String QE;

   public Qq(Shell var1, Font var2, String var3) {
      super(var1, "JEB");
      this.ld = var2;
      this.QE = var3;
   }

   public String dN() {
      super.ld();
      return this.dN == null?null:this.dN;
   }

   public void dN(final Shell var1) {
      String var2 = rP.dN(new byte[]{-49, 66, 45, 9, 0, 3, 79, 5, 86, 93, 14, 121, 54, 26, 85, 78, 11, 0, 1, 68, 65, 65, 76, 5, 10, 6, 11, 29, 22, 69, 75, 14, 28, 89, 84, 27, 79, 85, 6, 22, 69, 106, 15, 7, 108, 14, 116, 60, 1, 26, 83, 79, 1, 11, 72, 89, 29, 4, 8, 69, 79, 31, 21, 23, 19, 21, 29, 6, 1, 78, 87, 30, 5, 0, 76, 79, 1, 2, 21, 89, 84, 21, 10, 14, 69, 65, 65, 70, 3, 18, 87, 83, 22, 6, 12, 1, 10, 23, 93, 36, 0, 90, 60, 9, 4, 18, 22, 69, 86, 31, 26, 26, 29, 84, 5, 86, 95, 12, 65, 15, 10, 68, 85, 6, 22, 69, 84, 28, 13, 69, 70, 9, 3, 0, 3, 24, 30, 7, 9, 71, 2, 78, 5, 10, 6, 11, 29, 22, 69, 68, 5, 21, 21, 67, 2, 66, 14, 3, 13, 66, 84, 27, 79, 71, 2, 11, 11, 23, 19, 21, 17, 69, 65, 65, 75, 14, 28, 87, 36}, 1, 197);
      String var3 = String.format(var2, new Object[]{"              ", "http://www.android-decompiler.com/genlk.php"});
      var1.setLayout(new RowLayout(512));
      Label var4 = new Label(var1, 0);
      var4.setText(var3);
      Composite var5 = new Composite(var1, 0);
      var5.setLayout(new RowLayout(256));
      TM.dN((Composite)var5, (String)rP.dN(new byte[]{-93, 63, 21, 11, 78, 73, 7, 78, 66, 16, 29, 24, 4, 22, 23}, 1, 236), (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Qq dN = Qq.this;

         public void widgetSelected(SelectionEvent var1) {
            String var2 = String.format(rP.dN(new byte[]{42, 86, 76, 83, 5, 10, 7, 5, 21, 21, 92, 24, 86}, 1, 15), new Object[]{"http://www.android-decompiler.com/genlk.php", this.dN.QE});
            Vm.QE(var2);
         }
      }));
      (new Label(var1, 0)).setText(rP.dN(new byte[]{95, 70, 37, 10, 6, 11, 29, 22, 69, 68, 5, 21, 21, 91, 26}, 1, 85));
      Composite var6 = new Composite(var1, 0);
      var6.setLayout(new GridLayout(1, false));
      Text var7 = new Text(var6, 2060);
      var7.setFont(this.ld);
      GC var9 = new GC(var7);

      GridData var8;
      try {
         var9.setFont(var7.getFont());
         FontMetrics var10 = var9.getFontMetrics();
         var8 = new GridData(70 * var10.getAverageCharWidth(), var10.getHeight());
      } finally {
         var9.dispose();
      }

      var7.setLayoutData(var8);
      var7.setText(this.QE);
      var7.selectAll();
      (new Label(var1, 0)).setText(rP.dN(new byte[]{-51, 37, 10, 6, 11, 29, 22, 69, 75, 14, 28, 67, 26}, 1, 129));
      Composite var21 = new Composite(var1, 0);
      var21.setLayout(new GridLayout(1, false));
      final Text var11 = new Text(var21, 2052);
      var11.setFont(this.ld);
      var9 = new GC(var11);

      GridData var12;
      try {
         var9.setFont(var11.getFont());
         FontMetrics var13 = var9.getFontMetrics();
         var12 = new GridData(30 * var13.getAverageCharWidth(), var13.getHeight());
      } finally {
         var9.dispose();
      }

      var11.setLayoutData(var12);
      var11.selectAll();
      Composite var22 = new Composite(var1, 0);
      var22.setLayout(new RowLayout(256));
      Button var14 = TM.dN((Composite)var22, (String)"OK", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Text dN = var11;
         // $FF: synthetic field
         private Shell ld = var1;
         // $FF: synthetic field
         private Qq QE = Qq.this;

         public void widgetSelected(SelectionEvent var1) {
            this.QE.dN = this.dN.getText();
            this.ld.close();
         }
      }));
      TM.dN((Composite)var22, (String)"Cancel", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private Qq ld = Qq.this;

         public void widgetSelected(SelectionEvent var1) {
            this.ld.dN = null;
            this.dN.close();
         }
      }));
      var1.setDefaultButton(var14);
   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }
}
