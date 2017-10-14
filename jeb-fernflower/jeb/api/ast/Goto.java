package jeb.api.ast;

import jeb.api.ast.Label;
import jeb.api.ast.Statement;
import jebglobal.KO;

public class Goto extends Statement {
   KO object;

   Goto(KO var1) {
      super(var1);
      this.object = var1;
   }

   public static Goto build(Label var0) {
      return new Goto(new KO(var0.object));
   }

   public Label getLabel() {
      return new Label(this.object.dN());
   }

   public void setLabel(Label var1) {
      this.object.dN(var1.object);
   }
}
