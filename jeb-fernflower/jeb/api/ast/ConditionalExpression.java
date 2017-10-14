package jeb.api.ast;

import jeb.api.ast.IExpression;
import jeb.api.ast.NonStatement;
import jeb.api.ast.U;
import jebglobal.rY;

public class ConditionalExpression extends NonStatement implements IExpression {
   rY object;

   ConditionalExpression(rY var1) {
      super(var1);
      this.object = var1;
   }

   public static ConditionalExpression build(IExpression var0, IExpression var1, IExpression var2) {
      return new ConditionalExpression(new rY(U.getWrappedExpression(var0), U.getWrappedExpression(var1), U.getWrappedExpression(var2)));
   }

   public IExpression getLeft() {
      return U.wrapExpression(this.object.ld());
   }

   public IExpression getRight0() {
      return U.wrapExpression(this.object.QE());
   }

   public IExpression getRight1() {
      return U.wrapExpression(this.object.fa());
   }
}
