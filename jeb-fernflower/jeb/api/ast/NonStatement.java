package jeb.api.ast;

import java.util.List;
import jeb.api.ast.IElement;
import jeb.api.ast.U;
import jebglobal.cI;

public abstract class NonStatement implements IElement {
   cI object;

   NonStatement(cI var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.object = var1;
      }
   }

   public List getSubElements() {
      return U.getSubElements(this.object);
   }

   public boolean replaceSubElement(IElement var1, IElement var2) {
      return U.replaceSubElement(this.object, var1, var2);
   }

   public void attachTag(String var1, Object var2) {
      this.object.dN().dN(var1, var2);
   }

   public Object retrieveTag(String var1) {
      return this.object.dN().dN(var1);
   }
}
