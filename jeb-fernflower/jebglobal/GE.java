package jebglobal;

import jebglobal.TM;
import jebglobal.Xp;
import jebglobal.fL;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public final class GE extends fL {
   private Shell dN;
   private Xp ld;
   private boolean QE;
   private boolean wU;
   private String fa;

   public GE(Shell var1, Xp var2, String var3, String var4) {
      super(var1, var3);
      if(var2 != null && var4 != null) {
         this.ld = var2;
         this.fa = var4;
      } else {
         throw new RuntimeException();
      }
   }

   public Boolean dN() {
      super.ld();
      return Boolean.valueOf(this.QE);
   }

   public void dN(Shell var1) {
      var1.addListener(31, new Listener() {
         public void handleEvent(Event var1) {
            if(var1.detail == 2) {
               var1.doit = false;
            }

         }
      });
      var1.addListener(21, new Listener() {
         // $FF: synthetic field
         private GE dN = GE.this;

         public void handleEvent(Event var1) {
            if(!this.dN.wU) {
               var1.doit = false;
            }

         }
      });
      var1.setLayout(new RowLayout(512));
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new GridLayout(1, false));
      Composite var3 = new Composite(var1, 0);
      var3.setLayout(new RowLayout(256));
      Label var4 = new Label(var2, 0);
      var4.setText(this.fa);
      Button var5 = TM.dN((Composite)var3, (String)"Stop", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private GE dN = GE.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.QE = true;
            ((Button)var1.widget).setEnabled(false);
            this.dN.ld.ld(1L);
         }
      }));
      var1.setDefaultButton(var5);
      this.dN = var1;
   }

   public void QE() {
      if(this.dN != null && !this.dN.isDisposed()) {
         this.wU = true;
         this.dN.close();
      }

   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }
}
