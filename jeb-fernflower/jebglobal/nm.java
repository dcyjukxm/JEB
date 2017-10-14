package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.bt;

public final class nm {
   private int dN;
   private int ld;
   private List QE;

   public nm(int var1, int var2, List var3) {
      if(var1 >= 0 && var2 >= 0 && var3 != null) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;

         for(int var4 = 0; var4 < var3.size() && ((bt)var3.get(var4)).dN(); ++var4) {
            ;
         }

      } else {
         throw new RuntimeException();
      }
   }

   public int dN() {
      return this.dN;
   }

   public int ld() {
      return this.ld;
   }

   public int QE() {
      return this.dN + this.ld;
   }

   public List wU() {
      return new ArrayList(this.QE);
   }

   public List fa() {
      ArrayList var1 = new ArrayList(this.QE.size());
      Iterator var2 = this.QE.iterator();

      while(var2.hasNext()) {
         bt var3 = (bt)var2.next();
         var1.add(Integer.valueOf(var3.QE()));
      }

      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(String.format("try=[%X-%X[ handlers=[", new Object[]{Integer.valueOf(this.dN), Integer.valueOf(this.dN + this.ld)}));
      int var2 = 0;

      bt var4;
      for(Iterator var3 = this.QE.iterator(); var3.hasNext(); var1.append(var4.toString())) {
         var4 = (bt)var3.next();
         if(var2++ >= 1) {
            var1.append(", ");
         }
      }

      var1.append("]");
      return var1.toString();
   }
}
