package jebglobal;

import java.util.Iterator;
import jebglobal.IK;
import jebglobal.Tp;
import jebglobal.ZL;
import jebglobal.bJ;

public abstract class cI implements IK {
   private Tp dN = null;

   public Tp dN() {
      if(this.dN == null) {
         this.dN = new Tp();
      }

      return this.dN;
   }

   public void a_(ZL var1) {
      if(this.dN != null) {
         Iterator var2 = this.dN.dN().iterator();

         while(var2.hasNext()) {
            bJ var3 = (bJ)var2.next();
            var1.dN((bJ)var3);
         }
      }

   }
}
