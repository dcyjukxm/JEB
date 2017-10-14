package jeb.api.ast;

import jeb.api.ast.IExpression;
import jeb.api.ast.NonStatement;
import jeb.api.ast.Operator;
import jeb.api.ast.U;
import jebglobal.Gy;

public class Expression extends NonStatement implements IExpression {
   Gy object;

   Expression(Gy var1) {
      super(var1);
      this.object = var1;
   }

   public static Expression build(IExpression var0, Operator var1, IExpression var2) {
      return new Expression(new Gy(U.getWrappedExpression(var0), var1.object, U.getWrappedExpression(var2)));
   }

   public IExpression getLeft() {
      return U.wrapExpression(this.object.ld());
   }

   public IExpression getRight() {
      return U.wrapExpression(this.object.QE());
   }

   public Operator getOperator() {
      return Operator.build(this.object.fa());
   }
}
