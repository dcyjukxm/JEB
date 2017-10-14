package jebglobal;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class fL extends Dialog {
   public fL(Shell var1, String var2, int var3) {
      super(var1, var3);
      if(var2 != null) {
         this.setText(var2);
      }

   }

   public fL(Shell var1, String var2) {
      this(var1, var2, 67680);
   }

   public Object ld() {
      Shell var1 = this.getParent();
      Rectangle var2 = var1.getBounds();
      int var3 = (int)(0.9D * (double)var2.width);
      int var4 = (int)(0.9D * (double)var2.height);
      Shell var5 = new Shell(var1, this.getStyle());
      var5.setSize(var3, var4);
      var5.setText(this.getText());
      this.dN(var5);
      var5.pack();
      Point var6 = var5.getSize();
      if(var6.x > var3) {
         var6.x = var3;
      }

      if(var6.y > var4) {
         var6.y = var4;
      }

      var5.setSize(var6);
      var6 = var5.getSize();
      var5.setLocation(var2.x + (var2.width - var6.x) / 2, var2.y + (var2.height - var6.y) / 2);
      var5.open();
      Display var7 = var1.getDisplay();

      while(!var5.isDisposed()) {
         if(!var7.readAndDispatch()) {
            var7.sleep();
         }
      }

      return null;
   }

   protected abstract void dN(Shell var1);
}
