package jeb.api.ast;

import jeb.api.ast.Label;
import jeb.api.ast.Statement;
import jebglobal.PZ;
import jebglobal.Qa;

public class Continue extends Statement {
   PZ object;

   Continue(PZ var1) {
      super(var1);
      this.object = var1;
   }

   public static Continue build(Label var0) {
      return new Continue(new PZ(var0 == null?null:var0.object));
   }

   public Label getLabel() {
      Qa var1 = this.object.dN();
      return var1 == null?null:new Label(var1);
   }

   public void setLabel(Label var1) {
      this.object.dN(var1 == null?null:var1.object);
   }
}
