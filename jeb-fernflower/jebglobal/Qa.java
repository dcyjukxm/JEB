package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.lP;

public final class Qa extends II {
   private int dN;
   private String ld;
   private String QE;

   private Qa(int var1, String var2) {
      this.QE = null;
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
         this.ld = var2;
      }
   }

   public int dN() {
      return this.dN;
   }

   public String dN(boolean var1) {
      return var1 && this.QE != null?this.QE:this.ld;
   }

   public boolean dN(String var1) {
      if((var1 != null || this.QE != null) && (var1 == null || !var1.equals(this.QE))) {
         if(var1 != null && !lP.QE(var1)) {
            return false;
         } else {
            if(var1 != null && var1.equals(this.dN(false))) {
               var1 = null;
               if(this.QE == null) {
                  return true;
               }
            }

            this.QE = var1;
            return true;
         }
      } else {
         return true;
      }
   }

   public List wU() {
      return TM.dN(new IK[0]);
   }

   public boolean dN(IK var1, IK var2) {
      return false;
   }

   void dN(ZL var1, boolean var2) {
      this.ld(var1);
      String var3 = this.dN(true);
      if(var2) {
         var3 = var3 + ":";
      }

      Long var4 = null;
      int var5 = this.QE();
      if(var5 >= 0) {
         var4 = Long.valueOf((long)var1.ld() << 32 | (long)var5);
      }

      var1.dN(var3, Zh.LH, var2?1:0, this, var4);
   }

   public void dN(ZL var1) {
      this.dN(var1, true);
   }

   public String toString() {
      return String.format("%s(phyoff=%Xh)", new Object[]{super.toString(), Integer.valueOf(this.QE())});
   }

   // $FF: synthetic method
   Qa(int var1, String var2, TM var3) {
      this(var1, var2);
   }

   public static class uK {
      private HashMap dN = new HashMap();

      public void dN() {
         this.dN.clear();
      }

      public Qa dN(int var1, String var2) {
         Qa var3 = (Qa)this.dN.get(Integer.valueOf(var1));
         if(var3 == null) {
            var3 = new Qa(var1, var2, (TM)null);
            this.dN.put(Integer.valueOf(var1), var3);
         } else if(!var3.dN(false).equals(var2)) {
            throw new RuntimeException();
         }

         return var3;
      }

      public List ld() {
         return new ArrayList(this.dN.values());
      }
   }
}
