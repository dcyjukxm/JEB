package jebglobal;

import java.util.List;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.cI;
import jebglobal.hV;
import jebglobal.oc;

public final class Vf extends cI implements Xf {
   private hV dN;

   public Vf(hV var1) {
      this.dN(var1);
   }

   public hV ld() {
      return this.dN;
   }

   public void dN(hV var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
      }
   }

   public List wU() {
      return TM.dN(new IK[0]);
   }

   public boolean dN(IK var1, IK var2) {
      return false;
   }

   public void dN(ZL var1) {
      this.a_(var1);
      oc.dN(var1, this.dN);
   }
}
