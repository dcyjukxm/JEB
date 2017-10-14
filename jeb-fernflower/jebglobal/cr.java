package jebglobal;

import jebglobal.yn;
import jebglobal.yx;
import org.eclipse.swt.widgets.Composite;

public abstract class cr extends yn {
   public cr(Composite var1, yx var2) {
      super(var1, var2, var2.dN().XZ(), var2.dN().nA(), var2.dN().Ai());
   }

   public abstract int wU(int var1);

   public String fa(int var1) {
      StringBuilder var2 = new StringBuilder();
      if((var1 & 4) != 0) {
         var2.append("method ");
      } else if((var1 & 2) != 0) {
         var2.append("field ");
      } else if((var1 & 1) != 0) {
         var2.append("class ");
      }

      if((var1 & 1536) != 0) {
         var2.append("library ");
      }

      if((var1 & 256) != 0) {
         var2.append("constant ");
      }

      if((var1 & 2048) != 0) {
         var2.append("alert ");
      }

      return var2.toString();
   }
}
