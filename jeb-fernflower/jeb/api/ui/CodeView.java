package jeb.api.ui;

import jeb.api.ui.CodePosition;
import jeb.api.ui.InteractiveTextView;
import jeb.api.ui.JebUI;
import jebglobal.yn;

public abstract class CodeView extends InteractiveTextView {
   CodeView(JebUI var1, yn var2) {
      super(var1, var2);
   }

   public abstract CodePosition getCodePosition(int var1);

   public CodePosition getCodePosition() {
      return (CodePosition)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            this.result = CodeView.this.getCodePosition(CodeView.this.v.zs());
         }
      });
   }
}
