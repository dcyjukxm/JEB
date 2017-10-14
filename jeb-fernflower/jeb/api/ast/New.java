package jeb.api.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jeb.api.ast.IExpression;
import jeb.api.ast.Method;
import jeb.api.ast.Statement;
import jeb.api.ast.U;
import jebglobal.Fu;
import jebglobal.Pi;
import jebglobal.Xf;

public class New extends Statement implements IExpression {
   Pi object;

   New(Pi var1) {
      super(var1);
      this.object = var1;
   }

   public String getType() {
      return this.object.dN().KK();
   }

   public Method getMethod() {
      Fu var1 = this.object.ld();
      return new Method(var1);
   }

   public List getArguments() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.object.zs().iterator();

      while(var2.hasNext()) {
         Xf var3 = (Xf)var2.next();
         var1.add(U.wrapExpression(var3));
      }

      return var1;
   }
}
