package jeb.api.ast;

import java.util.List;
import jeb.api.ast.IExpression;
import jeb.api.ast.Statement;
import jeb.api.ast.U;
import jebglobal.jK;

public class NewArray extends Statement implements IExpression {
   jK object;

   NewArray(jK var1) {
      super(var1);
      this.object = var1;
   }

   public String getType() {
      return this.object.dN().KK();
   }

   public List getSizes() {
      return this.object.ld() == null?null:U.wrapExpressionList(this.object.ld());
   }

   public List getInitialValues() {
      return this.object.zs() == null?null:U.wrapExpressionList(this.object.zs());
   }
}
