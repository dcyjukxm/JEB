package jeb.api.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jeb.api.ast.Block;
import jeb.api.ast.Statement;
import jebglobal.EG;
import jebglobal.wz;

public abstract class Compound extends Statement {
   wz object;

   Compound(wz var1) {
      super(var1);
      this.object = var1;
   }

   public List getBlocks() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.object.dN().iterator();

      while(var2.hasNext()) {
         EG var3 = (EG)var2.next();
         var1.add(new Block(var3));
      }

      return var1;
   }
}
