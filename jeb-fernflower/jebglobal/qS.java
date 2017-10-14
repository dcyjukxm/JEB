package jebglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public final class qS extends Composite {
   public qS(Composite var1, File var2) {
      super(var1, 0);
      this.setLayout(new FillLayout());
      Label var3 = new Label(this, 16777216);

      try {
         Image var4 = new Image(var1.getDisplay(), new FileInputStream(var2));
         var3.setImage(var4);
      } catch (SWTException var5) {
         ;
      } catch (FileNotFoundException var6) {
         ;
      }

   }

   public qS(Composite var1, Image var2) {
      super(var1, 0);
      this.setLayout(new FillLayout());
      Label var3 = new Label(this, 16777216);

      try {
         var3.setImage(var2);
      } catch (SWTException var4) {
         ;
      }

   }
}
