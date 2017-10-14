package jeb.api.ast;

import jeb.api.ast.Field;
import jeb.api.ast.ILeftExpression;
import jeb.api.ast.NonStatement;
import jebglobal.Np;

public class StaticField extends NonStatement implements ILeftExpression {
   Np object;

   StaticField(Np var1) {
      super(var1);
      this.object = var1;
   }

   public Field getField() {
      return new Field(this.object.QE());
   }
}
