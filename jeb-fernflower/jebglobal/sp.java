package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import jebglobal.OD;
import jebglobal.TH;
import jebglobal.fL;
import jebglobal.rl;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
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

public final class sp extends fL {
   private String dN;
   private Font ld;
   private int QE;
   private String wU;
   private byte[] fa;
   private TH zs;
   private rl mS;

   public sp(Shell var1, Font var2, String var3, String var4, byte[] var5) {
      super(var1, var3);
      this.ld = var2;
      this.QE = 1;
      this.wU = var4;
      this.fa = var5;
   }

   public OD.uK dN() {
      super.ld();
      if(this.dN == null) {
         return null;
      } else {
         String var1 = null;
         if(this.dN != null && this.dN.length() > 0) {
            var1 = this.dN;
         }

         byte[] var2 = null;

         try {
            if(this.zs.ld()) {
               ByteArrayOutputStream var3 = new ByteArrayOutputStream();
               if(this.zs.dN((OutputStream)var3)) {
                  var2 = var3.toByteArray();
               }
            }
         } catch (IOException var4) {
            ;
         }

         return new OD.uK(var1, var2);
      }
   }

   public void dN(final Shell var1) {
      var1.setLayout(new RowLayout(512));
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new GridLayout(4, false));
      Composite var3 = new Composite(var1, 0);
      var3.setLayout(new RowLayout(256));
      this.zs = new TH();
      if(this.fa != null) {
         try {
            this.zs.dN((InputStream)(new ByteArrayInputStream(this.fa)));
         } catch (UnsupportedAudioFileException var13) {
            ;
         } catch (IOException var14) {
            ;
         }
      }

      this.mS = new rl(var2, this.zs);
      final Text var4;
      if(this.QE >= 2) {
         var4 = new Text(var2, 2626);
      } else {
         var4 = new Text(var2, 2052);
      }

      var4.setFont(this.ld);
      GC var6 = new GC(var4);

      GridData var5;
      try {
         var6.setFont(var4.getFont());
         FontMetrics var7 = var6.getFontMetrics();
         var5 = new GridData(200, this.QE * var7.getHeight());
      } finally {
         var6.dispose();
      }

      var4.setLayoutData(var5);
      if(this.wU != null) {
         var4.setText(this.wU);
      }

      var4.selectAll();
      Button var15 = new Button(var3, 8);
      var15.setText("   OK   ");
      var15.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Text dN = var4;
         // $FF: synthetic field
         private Shell ld = var1;
         // $FF: synthetic field
         private sp QE = sp.this;

         public void widgetSelected(SelectionEvent var1) {
            this.QE.dN = this.dN.getText();
            this.ld.close();
         }
      });
      Button var8 = new Button(var3, 8);
      var8.setText("   Cancel   ");
      var8.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private sp ld = sp.this;

         public void widgetSelected(SelectionEvent var1) {
            this.ld.dN = null;
            this.dN.close();
         }
      });
      var1.setDefaultButton(var15);
      var1.addDisposeListener(new DisposeListener() {
         // $FF: synthetic field
         private sp dN = sp.this;

         public void widgetDisposed(DisposeEvent var1) {
            this.dN.mS.dispose();
         }
      });
   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }
}
