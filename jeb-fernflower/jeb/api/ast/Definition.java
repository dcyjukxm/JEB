package jeb.api.ast;

import jeb.api.ast.ILeftExpression;
import jeb.api.ast.Identifier;
import jeb.api.ast.Statement;
import jebglobal.wm;

public class Definition extends Statement implements ILeftExpression {
   wm object;

   Definition(wm var1) {
      super(var1);
      this.object = var1;
   }

   public String getType() {
      return this.object.ld().KK();
   }

   public Identifier getIdentifier() {
      return new Identifier(this.object.zs());
   }
}
