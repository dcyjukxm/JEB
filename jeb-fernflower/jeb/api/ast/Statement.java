package jeb.api.ast;

import java.util.List;
import jeb.api.ast.IElement;
import jeb.api.ast.U;
import jebglobal.II;
import jebglobal.wz;

public abstract class Statement implements IElement {
   II object;

   Statement(II var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.object = var1;
      }
   }

   public boolean isCompound() {
      return this.object instanceof wz;
   }

   public List getSubElements() {
      return U.getSubElements(this.object);
   }

   public boolean replaceSubElement(IElement var1, IElement var2) {
      return U.replaceSubElement(this.object, var1, var2);
   }

   public void attachTag(String var1, Object var2) {
      this.object.fa().dN(var1, var2);
   }

   public Object retrieveTag(String var1) {
      return this.object.fa().dN(var1);
   }
}
