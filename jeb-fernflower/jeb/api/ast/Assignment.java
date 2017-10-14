package jeb.api.ast;

import jeb.api.ast.IExpression;
import jeb.api.ast.ILeftExpression;
import jeb.api.ast.Operator;
import jeb.api.ast.Statement;
import jeb.api.ast.U;
import jebglobal.XM;
import jebglobal.Xf;
import jebglobal.kn;

public class Assignment extends Statement {
   XM object;

   Assignment(XM var1) {
      super(var1);
      this.object = var1;
   }

   public static Assignment build(ILeftExpression var0, IExpression var1) {
      return new Assignment(new XM(U.getWrappedLeftExpression(var0), U.getWrappedExpression(var1)));
   }

   public ILeftExpression getLeft() {
      return U.wrapLeftExpression(this.object.OK());
   }

   public IExpression getRight() {
      return U.wrapExpression(this.object.LH());
   }

   public void setLeft(ILeftExpression var1) {
      this.object.dN(U.getWrappedLeftExpression(var1));
   }

   public void setRight(IExpression var1) {
      this.object.dN(U.getWrappedExpression(var1));
   }

   public boolean isSimpleAssignment() {
      return this.object.dN();
   }

   public boolean isCompinedOperatorAssignment() {
      return this.object.ld();
   }

   public void setCombinedOperator(Operator var1) {
      this.object.dN((kn)var1.object, (Xf)null);
   }

   public Operator getCompinedOperator() {
      return Operator.build(this.object.zs());
   }

   public boolean isUnaryOperatorAssignment() {
      return this.object.mS();
   }

   public void setUnaryOperator(boolean var1, boolean var2) {
      this.object.dN(var1, var2);
   }

   public void getUnaryOperator(boolean[] var1) {
      this.object.dN(var1);
   }
}
