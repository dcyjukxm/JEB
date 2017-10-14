package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.Cs;
import jebglobal.GS;

public final class iz implements GS {
   private HashMap dN = new HashMap();

   public void dN(int var1, Cs var2) {
      if(this.dN.containsKey(Integer.valueOf(var1))) {
         throw new RuntimeException();
      } else {
         this.dN.put(Integer.valueOf(var1), var2);
      }
   }

   public int dN() {
      return this.dN.size();
   }

   public HashSet ld() {
      return new HashSet(this.dN.keySet());
   }

   public List QE() {
      return new ArrayList(new HashSet(this.dN.values()));
   }

   public List dN(Cs var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.dN.keySet().iterator();

      while(var3.hasNext()) {
         int var4 = ((Integer)var3.next()).intValue();
         if(((Cs)this.dN.get(Integer.valueOf(var4))).equals(var1)) {
            var2.add(Integer.valueOf(var4));
         }
      }

      return var2;
   }

   public int dN(int var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.dN.keySet().iterator();

      int var4;
      while(var3.hasNext()) {
         var4 = ((Integer)var3.next()).intValue();
         if(((Cs)this.dN.get(Integer.valueOf(var4))).dN() == var1) {
            var2.add(Integer.valueOf(var4));
         }
      }

      var3 = var2.iterator();

      while(var3.hasNext()) {
         var4 = ((Integer)var3.next()).intValue();
         this.dN.remove(Integer.valueOf(var4));
      }

      return var2.size();
   }

   public int dN(int var1, int var2) {
      int var3 = 0;
      Iterator var4 = this.dN.keySet().iterator();

      while(var4.hasNext()) {
         int var5 = ((Integer)var4.next()).intValue();
         if(((Cs)this.dN.get(Integer.valueOf(var5))).dN() == var1) {
            ((Cs)this.dN.get(Integer.valueOf(var5))).dN(var2);
            ++var3;
         }
      }

      return var3;
   }

   public HashSet fa() {
      return new HashSet();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder("(");
      int var2 = 0;

      for(Iterator var3 = this.dN.keySet().iterator(); var3.hasNext(); ++var2) {
         int var4 = ((Integer)var3.next()).intValue();
         if(var2 >= 1) {
            var1.append(", ");
         }

         var1.append(String.format("%d:%s", new Object[]{Integer.valueOf(var4), this.dN.get(Integer.valueOf(var4))}));
      }

      var1.append(")");
      return var1.toString();
   }
}
