package jeb.api.ast;

import jeb.api.ast.Expression;
import jeb.api.ast.IExpression;
import jeb.api.ast.Operator;
import jeb.api.ast.U;
import jebglobal.lk;

public class Predicate extends Expression {
   lk object;

   Predicate(lk var1) {
      super(var1);
      this.object = var1;
   }

   public static Predicate build(IExpression var0, Operator var1, IExpression var2) {
      return new Predicate(new lk(U.getWrappedExpression(var0), var1.object, U.getWrappedExpression(var2)));
   }

   public boolean isLitteralTrue() {
      return this.object.zs();
   }

   public boolean isLitteralFalse() {
      return this.object.mS();
   }

   public void reverse() {
      this.object.LH();
   }
}
