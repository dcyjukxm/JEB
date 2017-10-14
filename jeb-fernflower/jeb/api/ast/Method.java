package jeb.api.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jeb.api.JebInstance;
import jeb.api.ast.Block;
import jeb.api.ast.Class;
import jeb.api.ast.Definition;
import jeb.api.ast.NonStatement;
import jebglobal.EG;
import jebglobal.Fu;
import jebglobal.Yx;
import jebglobal.wm;
import jebglobal.zd;

public class Method extends NonStatement {
   Fu object;

   public Method(Object var1) {
      super((Fu)var1);
      if(!(var1 instanceof Fu)) {
         throw new RuntimeException();
      } else {
         this.object = (Fu)var1;
      }
   }

   public String getName() {
      return this.object.mS();
   }

   public String getSignature() {
      return this.object.OK();
   }

   public List getParameters() {
      ArrayList var1 = new ArrayList();
      if(!this.object.KK()) {
         Iterator var2 = this.object.fa().iterator();

         while(var2.hasNext()) {
            wm var3 = (wm)var2.next();
            var1.add(new Definition(var3));
         }
      }

      return var1;
   }

   public Block getBody() {
      if(this.object.KK()) {
         return null;
      } else {
         EG var1 = this.object.VX();
         return var1 == null?null:new Block(var1);
      }
   }

   public Class getContainingClass() {
      zd var1 = this.object.LH();
      return var1 == null?null:new Class(var1);
   }

   public boolean isStatic() {
      return this.object.cb();
   }

   public static class Builder {
      Fu.uK mf;

      public Builder(JebInstance var1) {
         this.mf = ((Yx)var1.getGO()).fa();
      }

      public Method build(int var1, boolean var2) {
         Fu var3 = this.mf.dN(var1, var2);
         return var3 == null?null:new Method(var3);
      }
   }
}
