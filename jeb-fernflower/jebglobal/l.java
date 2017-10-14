package jebglobal;

import java.util.logging.Level;
import jebglobal.lW;
import jebglobal.rB;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MenuItem;

public final class l extends lW implements rB {
   private Display dN;
   private Thread ld;
   private boolean QE;

   public l(Composite var1, Font var2) {
      super(var1, var2, false);
      this.dN = var1.getDisplay();
      this.ld = this.dN.getThread();
      this.zs.addVerifyKeyListener(new VerifyKeyListener() {
         // $FF: synthetic field
         private l dN = l.this;

         public void verifyKey(VerifyEvent var1) {
            switch(var1.keyCode) {
            case 108:
               if(var1.stateMask == 262144) {
                  this.dN.EO();
               }
            default:
            }
         }
      });
      MenuItem var3 = new MenuItem(this.mS, 0);
      var3.setText("C&lear\tCtrl+L");
      var3.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private l dN = l.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.EO();
         }
      });
   }

   public void dN(boolean var1) {
      this.QE = var1;
   }

   public void dN(String var1) {
      this.zs.append(var1);
      if(this.QE) {
         int var2 = this.zs.getLineCount() - 2;
         if(var2 >= 0) {
            this.zs.setTopIndex(var2);
         }
      }

   }

   public void dN(Level var1, final String var2) {
      if(var1 == Level.INFO) {
         if(Thread.currentThread() != this.ld) {
            this.dN.asyncExec(new Runnable() {
               // $FF: synthetic field
               private String dN = var2;
               // $FF: synthetic field
               private l ld = l.this;

               public void run() {
                  this.ld.dN(this.dN);
               }
            });
         } else {
            this.dN(var2);
         }

      }
   }
}
