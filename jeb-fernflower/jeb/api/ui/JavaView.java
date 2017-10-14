package jeb.api.ui;

import jeb.api.ui.CodePosition;
import jeb.api.ui.CodeView;
import jeb.api.ui.JebUI;
import jebglobal.Ky;
import jebglobal.Os;

public class JavaView extends CodeView {
   Os v;

   JavaView(JebUI var1, Os var2) {
      super(var1, var2);
      this.v = var2;
   }

   public CodePosition getCodePosition(final int var1) {
      return (CodePosition)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            Ky var1x = JavaView.this.v.QE(var1);
            if(var1x != null) {
               this.result = new CodePosition(var1x.ld != null?var1x.ld:var1x.dN, var1x.mS >= 0 && var1x.zs >= 0?var1x.zs:-1);
            }

         }
      });
   }
}
