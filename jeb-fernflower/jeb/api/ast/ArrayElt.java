package jeb.api.ast;

import jeb.api.ast.IExpression;
import jeb.api.ast.ILeftExpression;
import jeb.api.ast.NonStatement;
import jeb.api.ast.U;
import jebglobal.wD;

public class ArrayElt extends NonStatement implements ILeftExpression {
   wD object;

   ArrayElt(wD var1) {
      super(var1);
      this.object = var1;
   }

   public static ArrayElt build(IExpression var0, IExpression var1) {
      return new ArrayElt(new wD(U.getWrappedExpression(var0), U.getWrappedExpression(var1)));
   }

   public IExpression getArray() {
      return U.wrapExpression(this.object.ld());
   }

   public IExpression getIndex() {
      return U.wrapExpression(this.object.QE());
   }

   public void setArray(IExpression var1) {
      this.object.dN(U.getWrappedExpression(var1));
   }

   public void setIndex(IExpression var1) {
      this.object.ld(U.getWrappedExpression(var1));
   }
}
