package jebglobal;

import jebglobal.QW;
import jebglobal.fL;
import jebglobal.oa;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public final class fW extends fL {
   private QW dN;
   private oa ld;
   private Text QE;
   private Button wU;
   private Button fa;
   private Button zs;
   private Button mS;
   private Button OK;

   public fW(Shell var1, QW var2) {
      super(var1, "Find");
      this.dN = var2;
      this.ld = var2.dN();
      if(this.ld == null) {
         this.ld = new oa();
      }

   }

   public Object ld() {
      super.ld();
      oa var10000 = this.ld;
      return null;
   }

   protected void dN(final Shell var1) {
      var1.setLayout(new RowLayout(512));
      RowLayout var2 = new RowLayout();
      var2.fill = true;
      var2.wrap = false;
      var2.pack = true;
      var2.justify = true;
      var2.type = 256;
      var2.marginLeft = 5;
      var2.marginTop = 5;
      var2.marginRight = 5;
      var2.marginBottom = 5;
      var2.spacing = 5;
      Composite var3 = new Composite(var1, 0);
      var3.setLayout(var2);
      Composite var4 = new Composite(var1, 0);
      var4.setLayout(new RowLayout(512));
      Composite var5 = new Composite(var1, 0);
      var5.setLayout(var2);
      Label var6 = new Label(var3, 16896);
      var6.setText("Search string:  ");
      Composite var7 = new Composite(var3, 0);
      var7.setLayout(new RowLayout(512));
      this.QE = new Text(var7, 2048);
      GC var9 = new GC(this.QE);

      RowData var8;
      try {
         var9.setFont(this.QE.getFont());
         FontMetrics var10 = var9.getFontMetrics();
         var8 = new RowData(30 * var10.getAverageCharWidth(), 1 * var10.getHeight());
      } finally {
         var9.dispose();
      }

      this.QE.setLayoutData(var8);
      this.QE.setText(this.ld.dN);
      this.QE.selectAll();
      this.QE.pack(false);
      this.QE.addKeyListener(new KeyListener() {
         // $FF: synthetic field
         private fW dN = fW.this;

         public void keyPressed(KeyEvent var1) {
            if(var1.character == 13) {
               this.dN.dN();
            }

         }

         public void keyReleased(KeyEvent var1) {
         }
      });
      Composite var14 = new Composite(var4, 0);
      var14.setLayout(new RowLayout(256));
      this.wU = new Button(var14, 32);
      this.wU.setText("Case sensitive");
      this.wU.setSelection(this.ld.ld);
      this.fa = new Button(var14, 32);
      this.fa.setText("Reverse search");
      this.fa.setSelection(this.ld.QE);
      Composite var11 = new Composite(var4, 0);
      var11.setLayout(new RowLayout(256));
      this.zs = new Button(var11, 32);
      this.zs.setText("Wrap around");
      this.zs.setSelection(this.ld.wU);
      this.mS = new Button(var5, 8);
      this.mS.setText("  Find  ");
      this.mS.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private fW dN = fW.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.dN();
         }
      });
      this.OK = new Button(var5, 8);
      this.OK.setText("  Close  ");
      this.OK.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.close();
         }
      });
   }

   private void dN() {
      String var1 = this.QE.getText();
      if(var1.length() > 0) {
         this.ld.dN = var1;
         this.ld.ld = this.wU.getSelection();
         this.ld.QE = this.fa.getSelection();
         this.ld.wU = this.zs.getSelection();
         this.dN.dN(this.ld);
      }

   }
}
