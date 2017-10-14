package jeb.api.ast;

import jeb.api.ast.IExpression;
import jeb.api.ast.Statement;
import jeb.api.ast.U;
import jebglobal.mA;

public class Monitor extends Statement {
   mA object;

   Monitor(mA var1) {
      super(var1);
      this.object = var1;
   }

   public boolean isEnter() {
      return this.object.dN();
   }

   public IExpression getLock() {
      return U.wrapExpression(this.object.ld());
   }
}
