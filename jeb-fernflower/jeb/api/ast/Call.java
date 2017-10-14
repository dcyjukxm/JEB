package jeb.api.ast;

import java.util.List;
import jeb.api.ast.IExpression;
import jeb.api.ast.Method;
import jeb.api.ast.Statement;
import jeb.api.ast.U;
import jebglobal.mi;

public class Call extends Statement implements IExpression {
   mi object;

   Call(mi var1) {
      super(var1);
      this.object = var1;
   }

   public static Call build(Method var0, boolean var1, List var2) {
      return new Call(new mi(var0.object, var1, U.getWrappedExpressionList(var2)));
   }

   public Method getMethod() {
      return new Method(this.object.dN());
   }

   public void setMethod(Method var1, boolean var2) {
      this.object.dN(var1.object, var2);
   }

   public boolean isSuperCall() {
      return this.object.ld();
   }

   public List getArguments() {
      return U.wrapExpressionList(this.object.mS());
   }

   public void insertArgument(int var1, IExpression var2) {
      this.object.ld(var1, U.getWrappedExpression(var2));
   }

   public IExpression removeArgument(int var1) {
      return U.wrapExpression(this.object.ld(var1));
   }
}
