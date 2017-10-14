package jeb.api.ast;

import jeb.api.ast.Compound;
import jeb.api.ast.Statement;
import jeb.api.ast.U;
import jebglobal.EG;

public class Block extends Compound {
   EG object;

   Block(EG var1) {
      super(var1);
      this.object = var1;
   }

   public static Block build() {
      return new Block(new EG());
   }

   public int size() {
      return this.object.zs();
   }

   public Statement get(int var1) {
      return U.wrapStatement(this.object.ld(var1));
   }

   public void set(int var1, Statement var2) {
      this.object.ld(var1, var2.object);
   }

   public Statement remove(int var1) {
      return U.wrapStatement(this.object.QE(var1));
   }

   public void add(Statement var1) {
      this.object.dN(var1.object);
   }

   public void insert(int var1, Statement var2) {
      this.object.QE(var1, var2.object);
   }
}
