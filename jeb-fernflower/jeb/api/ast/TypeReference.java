package jeb.api.ast;

import jeb.api.ast.IExpression;
import jeb.api.ast.NonStatement;
import jebglobal.Vf;

public class TypeReference extends NonStatement implements IExpression {
   Vf object;

   TypeReference(Vf var1) {
      super(var1);
      this.object = var1;
   }

   public String getType() {
      return this.object.ld().KK();
   }
}
