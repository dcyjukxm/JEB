package jebglobal;

import java.io.File;
import jebglobal.CC;
import jebglobal.Sj;
import jebglobal.oH;

public final class vl extends File {
   private Sj dN;

   public vl(File var1) {
      super(var1.getPath());
   }

   public Sj dN() {
      if(this.dN == null) {
         if(this.isDirectory()) {
            this.dN = new oH(this);
         } else {
            this.dN = new CC(this);
         }
      }

      return this.dN;
   }
}
