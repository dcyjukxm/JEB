package jebglobal;

import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public final class xh {
   private MenuItem dN;
   private Menu ld;
   private String QE;
   private Image wU;
   private SelectionListener fa;

   public xh(Menu var1, String var2, Image var3, SelectionListener var4) {
      if(var1 != null && var2 != null && var4 != null) {
         this.ld = var1;
         this.QE = var2;
         this.wU = var3;
         this.fa = var4;
      } else {
         throw new RuntimeException();
      }
   }

   public MenuItem dN() {
      return this.dN;
   }

   public void ld() {
      if(this.dN != null) {
         this.dN.dispose();
         this.dN = null;
      }

   }

   public void dN(boolean var1) {
      this.ld(var1);
   }

   void ld(boolean var1) {
      if(this.dN == null) {
         this.dN = new MenuItem(this.ld, 0);
         this.dN.setText(this.QE);
         this.dN.setImage(this.wU);
         this.dN.addSelectionListener(this.fa);
      }

      this.dN.setEnabled(var1);
   }
}
