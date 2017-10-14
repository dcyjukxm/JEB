package jebglobal;

import java.util.HashMap;
import jebglobal.hV;
import jebglobal.lo;

final class Fw implements lo {
   private HashMap dN = new HashMap();

   public void dN() {
      this.dN.clear();
   }

   public String dN(hV var1, int var2) {
      String var3 = "unk";
      if(var1.dN(false)) {
         int var4 = 0;
         if(var1.OK()) {
            var4 = var1.ld();
            var1 = var1.QE();
         }

         if(var1.fa()) {
            if(var1 == hV.ld) {
               var3 = "bool";
            } else if(var1 == hV.QE) {
               var3 = "b";
            } else if(var1 == hV.wU) {
               var3 = "ch";
            } else if(var1 == hV.fa) {
               var3 = "s";
            } else if(var1 == hV.zs) {
               var3 = "i";
            } else if(var1 == hV.mS) {
               var3 = "l";
            } else if(var1 == hV.OK) {
               var3 = "f";
            } else if(var1 == hV.LH) {
               var3 = "d";
            }
         } else if(var1.mS()) {
            String var5 = hV.QE(var1.dN());
            if(var5.length() >= 3) {
               var3 = var5.substring(1, var5.length() - 1);
               char var6 = var3.charAt(0);
               if(Character.isUpperCase(var6)) {
                  var3 = Character.toLowerCase(var6) + var3.substring(1);
               }
            }
         }

         if(var4 == 1) {
            var3 = String.format("array_%s", new Object[]{var3});
         } else if(var4 >= 2) {
            var3 = String.format("array%d_%s", new Object[]{Integer.valueOf(var4), var3});
         }
      }

      Integer var7 = (Integer)this.dN.get(var3);
      if(var7 == null) {
         this.dN.put(var3, Integer.valueOf(0));
         return var3;
      } else {
         this.dN.put(var3, var7 = Integer.valueOf(var7.intValue() + 1));
         return var3 + var7;
      }
   }
}
