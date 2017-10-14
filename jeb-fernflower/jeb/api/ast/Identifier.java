package jeb.api.ast;

import jeb.api.ast.ILeftExpression;
import jeb.api.ast.NonStatement;
import jebglobal.HI;

public class Identifier extends NonStatement implements ILeftExpression {
   HI object;

   Identifier(HI var1) {
      super(var1);
      this.object = var1;
   }

   public String getName() {
      return this.object.dN(true);
   }
}
