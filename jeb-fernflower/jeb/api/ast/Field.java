package jeb.api.ast;

import jeb.api.JebInstance;
import jeb.api.ast.IExpression;
import jeb.api.ast.NonStatement;
import jeb.api.ast.U;
import jebglobal.Dw;
import jebglobal.Yx;

public class Field extends NonStatement {
   Dw object;

   Field(Dw var1) {
      super(var1);
      this.object = var1;
   }

   public String getType() {
      return this.object.OK().KK();
   }

   public String getName() {
      return this.object.zs();
   }

   public String getSignature() {
      return this.object.mS();
   }

   public IExpression getInitialValue() {
      return U.wrapExpression(this.object.LH());
   }

   public static class Builder {
      Dw.uK ff;

      public Builder(JebInstance var1) {
         this.ff = ((Yx)var1.getGO()).zs();
      }

      public Field build(int var1) {
         Dw var2 = this.ff.dN(var1);
         return var2 == null?null:new Field(var2);
      }
   }
}
