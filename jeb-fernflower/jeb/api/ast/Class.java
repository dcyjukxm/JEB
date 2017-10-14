package jeb.api.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jeb.api.ast.Field;
import jeb.api.ast.Method;
import jeb.api.ast.NonStatement;
import jebglobal.Dw;
import jebglobal.Fu;
import jebglobal.zd;

public class Class extends NonStatement {
   zd object;

   public Class(Object var1) {
      super((zd)var1);
      if(!(var1 instanceof zd)) {
         throw new RuntimeException();
      } else {
         this.object = (zd)var1;
      }
   }

   public String getType() {
      return this.object.fa().KK();
   }

   public List getInnerClasses() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.object.zs().iterator();

      while(var2.hasNext()) {
         zd var3 = (zd)var2.next();
         var1.add(new Class(var3));
      }

      return var1;
   }

   public List getFields() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.object.OK().iterator();

      while(var2.hasNext()) {
         Dw var3 = (Dw)var2.next();
         var1.add(new Field(var3));
      }

      return var1;
   }

   public List getMethods() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.object.mS().iterator();

      while(var2.hasNext()) {
         Fu var3 = (Fu)var2.next();
         var1.add(new Method(var3));
      }

      return var1;
   }
}
