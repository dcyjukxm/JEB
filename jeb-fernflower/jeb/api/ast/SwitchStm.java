package jeb.api.ast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jeb.api.ast.Block;
import jeb.api.ast.Compound;
import jeb.api.ast.IExpression;
import jeb.api.ast.U;
import jebglobal.Dq;
import jebglobal.EG;

public class SwitchStm extends Compound {
   Dq object;

   SwitchStm(Dq var1) {
      super(var1);
      this.object = var1;
   }

   public static SwitchStm build(IExpression var0) {
      return new SwitchStm(new Dq(U.getWrappedExpression(var0)));
   }

   public IExpression getSwitchedExpression() {
      return U.wrapExpression(this.object.zs());
   }

   public void setSwitchedExpression(IExpression var1) {
      this.object.dN(U.getWrappedExpression(var1));
   }

   public HashSet getCaseKeys() {
      return this.object.mS();
   }

   public List getCaseBodies() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.object.OK().iterator();

      while(var2.hasNext()) {
         EG var3 = (EG)var2.next();
         var1.add(new Block(var3));
      }

      return var1;
   }

   public Block getCaseBody(int var1) {
      EG var2 = this.object.ld(var1);
      return var2 == null?null:new Block(var2);
   }

   public boolean hasDefaultBody() {
      return this.object.LH();
   }

   public Block getDefaultBody() {
      EG var1 = this.object.KK();
      return var1 == null?null:new Block(var1);
   }

   public void addCase(List var1, Block var2) {
      this.object.dN(var1, var2.object);
   }

   public void setDefaultBody(Block var1) {
      this.object.dN(var1 == null?null:var1.object);
   }
}
