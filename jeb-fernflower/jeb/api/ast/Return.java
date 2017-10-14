package jeb.api.ast;

import jeb.api.ast.IExpression;
import jeb.api.ast.Statement;
import jeb.api.ast.U;
import jebglobal.cq;

public class Return extends Statement {
   cq object;

   Return(cq var1) {
      super(var1);
      this.object = var1;
   }

   public static Return build(IExpression var0) {
      return new Return(new cq(U.getWrappedExpression(var0)));
   }

   public IExpression getExpression() {
      return U.wrapExpression(this.object.dN());
   }

   public void setExpression(IExpression var1) {
      this.object.dN(U.getWrappedExpression(var1));
   }
}
