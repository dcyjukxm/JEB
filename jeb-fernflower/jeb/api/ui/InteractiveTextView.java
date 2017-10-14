package jeb.api.ui;

import jeb.api.ui.JebUI;
import jeb.api.ui.TextView;
import jebglobal.YJ;
import jebglobal.yn;

public class InteractiveTextView extends TextView {
   yn v;

   InteractiveTextView(JebUI var1, yn var2) {
      super(var1, var2);
      this.v = var2;
   }

   public String getActiveItem() {
      return (String)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            YJ var1 = InteractiveTextView.this.v.OK();
            if(var1 == null) {
               this.result = null;
            } else {
               int var2 = InteractiveTextView.this.v.OK(InteractiveTextView.this.v.zs());
               this.result = InteractiveTextView.this.v.bG().substring(var2 + var1.QE(), var2 + var1.wU());
            }

         }
      });
   }
}
