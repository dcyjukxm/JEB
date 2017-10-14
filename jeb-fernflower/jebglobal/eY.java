package jebglobal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class eY {
   int dN = -1;
   List ld = new ArrayList();
   List QE = new ArrayList();
   List wU = new ArrayList();
   List fa = new ArrayList();
   Object zs = null;
   HashSet mS = new HashSet();
   List OK = new ArrayList();
   List LH = new ArrayList();

   eY(int var1) {
      if(var1 <= 0) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
      }
   }

   List dN() {
      ArrayList var1 = new ArrayList(this.QE);
      var1.addAll(this.fa);
      return var1;
   }

   List ld() {
      ArrayList var1 = new ArrayList(this.ld);
      var1.addAll(this.wU);
      return var1;
   }

   int QE() {
      return this.QE.size() + this.fa.size();
   }
}
