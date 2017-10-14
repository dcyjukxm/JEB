package jebglobal;

import java.util.ArrayList;
import java.util.List;
import jebglobal.OX;
import jebglobal.Xf;
import jebglobal.hV;

public final class lM {
   private hV dN;
   private ArrayList ld;

   public lM(hV var1) {
      this.dN = var1;
      this.ld = new ArrayList();
   }

   public void dN(OX var1, Xf var2) {
      this.ld.add(new lM.uK(var1, var2));
   }

   public hV dN() {
      return this.dN;
   }

   public List ld() {
      return this.ld;
   }

   public static class uK {
      private OX dN;
      private Xf ld;

      public uK(OX var1, Xf var2) {
         this.dN = var1;
         this.ld = var2;
      }

      public OX dN() {
         return this.dN;
      }

      public Xf ld() {
         return this.ld;
      }
   }
}
