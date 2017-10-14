package jebglobal;

import jebglobal.HC;
import jebglobal.TM;
import jebglobal.Vm;
import jebglobal.eI;
import jebglobal.fL;
import jebglobal.yW;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public final class JK extends fL {
   public JK(Shell var1) {
      super(var1, "About JEB");
   }

   public Object ld() {
      super.ld();
      return null;
   }

   public void dN(final Shell var1) {
      Color var2 = var1.getDisplay().getSystemColor(1);
      var1.setLayout(new RowLayout(512));
      var1.setBackground(var2);
      Label var3 = new Label(var1, 0);
      var3.setText(" ");
      var3.setBackground(var2);
      Composite var4 = new Composite(var1, 0);
      var4.setLayout(new RowLayout(256));
      var4.setBackground(var2);
      Label var5 = new Label(var4, 0);
      var5.setBackground(var1.getDisplay().getSystemColor(1));
      var5.setImage(HC.dN().dN("icon-jeb-48.png"));
      Label var6 = new Label(var4, 0);
      var6.setText("    ");
      var6.setBackground(var2);
      Label var7 = new Label(var4, 0);
      var7.setBackground(var2);
      var7.setText(this.dN());
      var7.pack();
      Point var8 = var7.getSize();
      var7.setLayoutData(new RowData(var8.x + 20, var8.y + 30));
      Composite var9 = new Composite(var1, 0);
      var9.setLayout(new RowLayout(256));
      var9.setBackground(var2);
      Button var10 = TM.dN((Composite)var9, (String)"OK", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.close();
         }
      }));
      TM.dN((Composite)var9, (String)"Website", (SelectionListener)(new SelectionAdapter() {
         public void widgetSelected(SelectionEvent var1) {
            Vm.QE("http://www.android-decompiler.com");
         }
      }));
      var1.setDefaultButton(var10);
   }

   private String dN() {
      StringBuffer var1 = new StringBuffer();
      var1.append(String.format("%s - %s\n%s (c) %s\n\nVersion: %s\n", new Object[]{"JEB", "The Interactive Android Decompiler", "PNF Software", "2013-2014", yW.dN.toString()}));
      var1.append('\n');
      var1.append(eI.BQ());
      var1.append(String.format("\n%s", new Object[]{"A copy of the End-User License Agreement\ncan be found in the installation folder.\n"}));
      var1.append(String.format("\n%s", new Object[]{"Third-party software used by JEB:\n- Eclipse SWT (Eclipse Public License)\n- Apache Commons IO (Apache License 2.0)\n- APKTool (Apache License 2.0)\n- Android Framework Resources (Apache License 2.0)\n- Jython (Python Software Foundation License 2.0)"}));
      return var1.toString();
   }
}
