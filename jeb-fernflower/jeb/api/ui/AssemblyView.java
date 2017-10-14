package jeb.api.ui;

import jeb.api.ui.CodePosition;
import jeb.api.ui.CodeView;
import jeb.api.ui.JebUI;
import jebglobal.Ky;
import jebglobal.Pl;

public class AssemblyView extends CodeView {
   Pl v;

   AssemblyView(JebUI var1, Pl var2) {
      super(var1, var2);
      this.v = var2;
   }

   public CodePosition getCodePosition(final int var1) {
      return (CodePosition)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            Ky var1x = AssemblyView.this.v.QE(var1);
            if(var1x != null) {
               this.result = new CodePosition(var1x.ld != null?var1x.ld:var1x.dN, var1x.mS >= 0 && var1x.zs >= 0?var1x.zs:-1);
            }

         }
      });
   }

   public boolean setCodePosition(final CodePosition var1) {
      return ((Boolean)this.ui.execReturn(new JebUI.RunnableEx() {
         public void run() {
            if(var1 != null) {
               this.result = Boolean.valueOf(AssemblyView.this.v.ld(var1.getSignature()));
            }

         }
      })).booleanValue();
   }
}
