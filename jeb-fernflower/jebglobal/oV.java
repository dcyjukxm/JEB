package jebglobal;

import java.util.ArrayList;
import java.util.List;

public final class oV {
   private List dN = new ArrayList();
   private int ld = 0;

   public int dN() {
      return this.dN.size();
   }

   public int ld() {
      return this.ld;
   }

   public void dN(Object var1) {
      while(this.ld < this.dN.size()) {
         this.dN.remove(this.ld);
      }

      this.dN.add(var1);
      ++this.ld;
   }

   public Object ld(Object var1) {
      if(this.ld == 0) {
         return null;
      } else {
         --this.ld;
         Object var2 = this.dN.get(this.ld);
         if(var1 != null) {
            this.dN.set(this.ld, var1);
         }

         return var2;
      }
   }

   public Object QE(Object var1) {
      if(this.ld == this.dN.size()) {
         return null;
      } else {
         Object var2 = this.dN.get(this.ld);
         if(var1 != null) {
            this.dN.set(this.ld, var1);
         }

         ++this.ld;
         return var2;
      }
   }

   public boolean QE() {
      return this.ld > 0;
   }

   public boolean wU() {
      return this.ld < this.dN.size();
   }

   public String toString() {
      return String.format("size=%d pos=%d", new Object[]{Integer.valueOf(this.dN()), Integer.valueOf(this.ld())});
   }
}
