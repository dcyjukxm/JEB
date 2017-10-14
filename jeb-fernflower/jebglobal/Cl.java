package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.Oa;

public abstract class Cl implements Iterable {
   protected AR dN;
   private int wU;
   protected ArrayList ld;
   protected HashMap QE;

   Cl(AR var1, int var2) {
      this.dN = var1;
      this.wU = var2;
      this.ld = new ArrayList(var2);
      this.QE = new HashMap();
   }

   public int dN() {
      return this.ld.size();
   }

   public int ld() {
      return this.wU;
   }

   public Oa dN(int var1) {
      return var1 >= 0 && var1 < this.ld.size()?(Oa)this.ld.get(var1):null;
   }

   public Oa dN(String var1) {
      return (Oa)this.QE.get(var1);
   }

   public List QE() {
      return new ArrayList(this.ld);
   }

   public Iterator iterator() {
      return this.ld.iterator();
   }
}
