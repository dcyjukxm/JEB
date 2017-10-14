package jebglobal;

import jebglobal.TM;
import jebglobal.fL;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Xa extends fL {
   private String ld;
   private Font QE;
   private int wU;
   private int fa;
   private boolean zs;
   private boolean mS;
   private String OK;
   private String LH;
   private String KK;
   protected Button dN;

   public Xa(Shell var1, Font var2, String var3, String var4) {
      super(var1, var3);
      this.QE = var2;
      this.wU = 1;
      this.fa = 20;
      this.zs = true;
      this.mS = false;
      this.OK = var4;
      this.LH = "OK";
      this.KK = "Cancel";
   }

   public void dN(String var1) {
      this.OK = var1;
   }

   public void dN(int var1) {
      this.wU = var1;
   }

   public void ld(int var1) {
      this.fa = var1;
   }

   public void dN(boolean var1) {
      this.zs = var1;
   }

   public void ld(boolean var1) {
      this.mS = var1;
   }

   public void ld(String var1) {
      this.LH = var1;
   }

   public void QE(String var1) {
      this.KK = var1;
   }

   public String dN() {
      super.ld();
      return this.ld;
   }

   public void dN(final Shell var1) {
      var1.setLayout(new RowLayout(512));
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new GridLayout(1, true));
      new GridData();
      final Text var4;
      if(this.wU >= 2) {
         var4 = new Text(var2, 2626);
      } else {
         var4 = new Text(var2, 2052);
      }

      var4.setFont(this.QE);
      GC var5 = new GC(var4);

      GridData var3;
      try {
         var5.setFont(var4.getFont());
         FontMetrics var6 = var5.getFontMetrics();
         var3 = new GridData(this.fa * var6.getAverageCharWidth(), this.wU * var6.getHeight());
      } finally {
         var5.dispose();
      }

      var4.setLayoutData(var3);
      var4.setText(this.OK);
      var4.setEditable(this.zs);
      if(this.mS) {
         var4.selectAll();
      }

      var4.addTraverseListener(new TraverseListener() {
         public void keyTraversed(TraverseEvent var1) {
            if(var1.detail == 16 || var1.detail == 8) {
               var1.doit = true;
            }

         }
      });
      Composite var10 = new Composite(var1, 0);
      var10.setLayout(new RowLayout(256));
      if(this.LH != null) {
         this.dN = TM.dN((Composite)var10, (String)this.LH, (SelectionListener)(new SelectionAdapter() {
            // $FF: synthetic field
            private Text dN = var4;
            // $FF: synthetic field
            private Shell ld = var1;
            // $FF: synthetic field
            private Xa QE = Xa.this;

            public void widgetSelected(SelectionEvent var1) {
               this.QE.ld = this.dN.getText();
               this.ld.close();
            }
         }));
         var1.setDefaultButton(this.dN);
      }

      if(this.KK != null) {
         TM.dN((Composite)var10, (String)this.KK, (SelectionListener)(new SelectionAdapter() {
            // $FF: synthetic field
            private Shell dN = var1;
            // $FF: synthetic field
            private Xa ld = Xa.this;

            public void widgetSelected(SelectionEvent var1) {
               this.ld.ld = null;
               this.dN.close();
            }
         }));
      }

   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }
}
