package jeb.api.ast;

import jeb.api.ast.Block;
import jeb.api.ast.Compound;
import jeb.api.ast.Predicate;
import jeb.api.ast.Statement;
import jeb.api.ast.U;
import jebglobal.am;

public class ForStm extends Compound {
   am object;

   ForStm(am var1) {
      super(var1);
      this.object = var1;
   }

   public static ForStm build(Statement var0, Predicate var1, Statement var2, Block var3) {
      return new ForStm(new am(var0 == null?null:var0.object, var1 == null?null:var1.object, var2 == null?null:var2.object, var3.object));
   }

   public Statement getInitializer() {
      return U.wrapStatement(this.object.zs());
   }

   public Predicate getPredicate() {
      return new Predicate(this.object.mS());
   }

   public Statement getPostStatement() {
      return U.wrapStatement(this.object.OK());
   }

   public Block getBody() {
      return new Block(this.object.LH());
   }

   public void setInitializer(Statement var1) {
      this.object.dN(var1 == null?null:var1.object);
   }

   public void setPredicate(Predicate var1) {
      this.object.dN(var1 == null?null:var1.object);
   }

   public void setPostStatement(Statement var1) {
      this.object.ld(var1 == null?null:var1.object);
   }

   public void setBody(Block var1) {
      this.object.dN(var1.object);
   }
}
