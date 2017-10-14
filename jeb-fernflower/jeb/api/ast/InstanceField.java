package jeb.api.ast;

import jeb.api.ast.Field;
import jeb.api.ast.IExpression;
import jeb.api.ast.ILeftExpression;
import jeb.api.ast.NonStatement;
import jeb.api.ast.U;
import jebglobal.CZ;

public class InstanceField extends NonStatement implements ILeftExpression {
   CZ object;

   InstanceField(CZ var1) {
      super(var1);
      this.object = var1;
   }

   public static InstanceField build(IExpression var0, Field var1) {
      return new InstanceField(new CZ(U.getWrappedExpression(var0), var1.object));
   }

   public IExpression getInstance() {
      return U.wrapExpression(this.object.ld());
   }

   public Field getField() {
      return new Field(this.object.QE());
   }

   public void setInstance(IExpression var1) {
      this.object.dN(U.getWrappedExpression(var1));
   }

   public void setField(Field var1) {
      this.object.dN(var1.object);
   }
}
