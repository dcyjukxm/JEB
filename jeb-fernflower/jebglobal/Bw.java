package jebglobal;

import java.util.ArrayList;
import java.util.List;
import jebglobal.AR;
import jebglobal.Oa;
import jebglobal.nh;

public final class Bw implements Oa {
   private AR dN;
   private int ld;
   private int QE;
   private int wU;
   private int[] fa;

   Bw(AR var1, int var2, int var3, int var4, int[] var5) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
      this.wU = var4;
      this.fa = var5 != null?var5:new int[0];
   }

   public int dN() {
      return this.ld;
   }

   public int ld() {
      return this.QE;
   }

   public String QE() {
      return this.dN.dN(this.QE);
   }

   public int wU() {
      return this.wU;
   }

   public nh.vd fa() {
      return this.dN.QE(this.wU);
   }

   public String dN(boolean var1) {
      return this.dN.dN(this.wU, var1);
   }

   public int[] zs() {
      return this.fa;
   }

   public nh.vd[] mS() {
      nh.vd[] var1 = new nh.vd[this.fa.length];
      int var2 = 0;
      int[] var3 = this.fa;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3[var5];
         var1[var2] = this.dN.QE(var6);
         ++var2;
      }

      return var1;
   }

   public String[] ld(boolean var1) {
      String[] var2 = new String[this.fa.length];
      int var3 = 0;
      int[] var4 = this.fa;
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var4[var6];
         var2[var3] = this.dN.dN(var7, var1);
         ++var3;
      }

      return var2;
   }

   public String QE(boolean var1) {
      StringBuffer var2 = new StringBuffer();
      var2.append("(");
      int[] var3 = this.fa;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3[var5];
         var2.append(this.dN.dN(var6, var1));
      }

      var2.append(")");
      var2.append(this.dN.dN(this.wU, var1));
      return var2.toString();
   }

   public String toString() {
      return super.toString();
   }

   public static List dN(String var0, String[] var1) {
      if(var0 == null) {
         return null;
      } else {
         int var2 = var0.length();
         if(var2 >= 3 && var0.charAt(0) == 40) {
            ArrayList var3 = new ArrayList(16);
            StringBuilder var4 = new StringBuilder();
            boolean var5 = false;
            int var6 = 1;

            while(var6 < var2) {
               int var7 = var6;
               char var8 = var0.charAt(var6++);
               if(var8 == 41) {
                  if(var5) {
                     return null;
                  }

                  var5 = true;
               } else {
                  int var9;
                  for(var9 = 0; var6 < var2 && var8 == 91; var8 = var0.charAt(var6++)) {
                     ++var9;
                  }

                  if(var9 >= 1 && var8 == 91) {
                     return null;
                  }

                  switch(var8) {
                  case 'B':
                  case 'C':
                  case 'D':
                  case 'F':
                  case 'I':
                  case 'J':
                  case 'S':
                  case 'Z':
                     break;
                  case 'E':
                  case 'G':
                  case 'H':
                  case 'K':
                  case 'M':
                  case 'N':
                  case 'O':
                  case 'P':
                  case 'Q':
                  case 'R':
                  case 'T':
                  case 'U':
                  case 'W':
                  case 'X':
                  case 'Y':
                  default:
                     return null;
                  case 'L':
                     int var10 = var0.indexOf(59, var6);
                     if(var10 <= var6 + 1) {
                        return null;
                     }

                     var6 = var10 + 1;
                     break;
                  case 'V':
                     if(!var5) {
                        return null;
                     }
                  }

                  if(var9 >= 1) {
                     var8 = 76;
                  }

                  String var11 = var0.substring(var7, var6);
                  if(var5) {
                     var3.add(0, var11);
                     var4.insert(0, var8);
                     break;
                  }

                  var3.add(var11);
                  var4.append(var8);
               }
            }

            if(var5 && var6 == var2) {
               if(var1 != null && var1.length >= 1) {
                  var1[0] = var4.toString();
               }

               return var3;
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }
}
