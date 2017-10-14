package jeb.api.ast;

import jeb.api.ast.Statement;
import jebglobal.Qa;

public class Label extends Statement {
   Qa object;

   Label(Qa var1) {
      super(var1);
      this.object = var1;
   }

   public String getName() {
      return this.object.dN(true);
   }
}
