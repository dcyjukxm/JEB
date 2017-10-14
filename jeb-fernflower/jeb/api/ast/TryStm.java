package jeb.api.ast;

import jeb.api.ast.Block;
import jeb.api.ast.Compound;
import jeb.api.ast.Identifier;
import jebglobal.HI;
import jebglobal.SP;

public class TryStm extends Compound {
   SP object;

   TryStm(SP var1) {
      super(var1);
      this.object = var1;
   }

   public Block getTryBody() {
      return new Block(this.object.zs());
   }

   public int getCatchCount() {
      return this.object.mS();
   }

   public Block getCatchBody(int var1) {
      return new Block(this.object.QE(var1));
   }

   public String getCatchType(int var1) {
      return this.object.ld(var1).KK();
   }

   public Identifier getCatchIdentifier(int var1) {
      HI var2 = this.object.wU(var1);
      return var2 == null?null:new Identifier(var2);
   }

   public Block getFinallyBody() {
      return new Block(this.object.OK());
   }
}
