package jeb.api.ast;

import jeb.api.ast.Block;
import jeb.api.ast.Compound;
import jeb.api.ast.Predicate;
import jebglobal.tE;

public class IfStm extends Compound {
   tE object;

   IfStm(tE var1) {
      super(var1);
      this.object = var1;
   }

   public static IfStm build(Predicate var0, Block var1) {
      return new IfStm(new tE(var0.object, var1.object));
   }

   public int size() {
      return this.object.LH();
   }

   public Predicate getBranchPredicate(int var1) {
      return new Predicate(this.object.ld(var1));
   }

   public Block getBranchBody(int var1) {
      return new Block(this.object.QE(var1));
   }

   public Block getDefaultBlock() {
      return !this.object.mS()?null:new Block(this.object.OK());
   }

   public void setBranchPredicate(int var1, Predicate var2) {
      this.object.dN(var1, var2.object);
   }

   public void setBranchBody(int var1, Block var2) {
      this.object.dN(var1, var2.object);
   }

   public void insertBranch(int var1, Predicate var2, Block var3) {
      this.object.dN(var1, var2.object, var3.object);
   }

   public void removeBranch(int var1) {
      this.object.wU(var1);
   }
}
