package jeb.api.ast;

import jeb.api.ast.Block;
import jeb.api.ast.Compound;
import jeb.api.ast.Predicate;
import jebglobal.zn;

public class WhileStm extends Compound {
   zn object;

   WhileStm(zn var1) {
      super(var1);
      this.object = var1;
   }

   public static WhileStm build(Predicate var0, Block var1) {
      return new WhileStm(new zn(var0.object, var1.object));
   }

   public Predicate getPredicate() {
      return new Predicate(this.object.zs());
   }

   public Block getBody() {
      return new Block(this.object.mS());
   }

   public void setPredicate(Predicate var1) {
      this.object.dN(var1.object);
   }

   public void setBody(Block var1) {
      this.object.dN(var1.object);
   }
}
