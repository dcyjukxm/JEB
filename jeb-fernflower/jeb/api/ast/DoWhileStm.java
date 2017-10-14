package jeb.api.ast;

import jeb.api.ast.Block;
import jeb.api.ast.Compound;
import jeb.api.ast.Predicate;
import jebglobal.jM;

public class DoWhileStm extends Compound {
   jM object;

   DoWhileStm(jM var1) {
      super(var1);
      this.object = var1;
   }

   public static DoWhileStm build(Predicate var0, Block var1) {
      return new DoWhileStm(new jM(var1.object, var0.object));
   }

   public Predicate getPredicate() {
      return new Predicate(this.object.mS());
   }

   public Block getBody() {
      return new Block(this.object.zs());
   }

   public void setPredicate(Predicate var1) {
      this.object.dN(var1.object);
   }

   public void setBody(Block var1) {
      this.object.dN(var1.object);
   }
}
