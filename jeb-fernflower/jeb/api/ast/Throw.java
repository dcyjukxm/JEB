package jeb.api.ast;

import jeb.api.ast.IExpression;
import jeb.api.ast.Statement;
import jeb.api.ast.U;
import jebglobal.vE;

public class Throw extends Statement {
   vE object;

   Throw(vE var1) {
      super(var1);
      this.object = var1;
   }

   public static Throw build(IExpression var0) {
      return new Throw(new vE(U.getWrappedExpression(var0)));
   }

   public IExpression getExpression() {
      return U.wrapExpression(this.object.dN());
   }

   public void setExpression(IExpression var1) {
      this.object.dN(U.getWrappedExpression(var1));
   }
}
