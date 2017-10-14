package jeb.api.ast;

import jeb.api.JebInstance;
import jeb.api.ast.Method;
import jebglobal.Fu;
import jebglobal.Yx;
import jebglobal.b;

public class Optimizer {
   b astopt;
   Fu object;

   public Optimizer(JebInstance var1, Method var2) {
      this.astopt = new b((Yx)var1.getGO(), var2.object);
      this.object = var2.object;
   }

   public int runAllOptimizations() {
      return this.astopt.dN();
   }

   public int removeUnreferencedLabels() {
      return this.astopt.zs(this.object);
   }

   public int removeUselessGotos() {
      int var1 = 0 + this.astopt.wU(this.object);
      var1 += this.astopt.wU(this.object.VX());
      var1 += this.astopt.fa(this.object.VX());
      return var1;
   }
}
