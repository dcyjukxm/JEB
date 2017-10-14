package jebglobal;

import jebglobal.Bw;
import jebglobal.HC;
import jebglobal.TM;
import jebglobal.Vm;
import jebglobal.WV;
import jebglobal.YJ;
import jebglobal.Zh;
import jebglobal.as;
import jebglobal.hO;
import jebglobal.yn;

public final class tt extends as {
   public tt(yn var1) {
      super(var1, "Object help");
      this.ld = 104;
      this.fa = HC.dN().dN("icon-help.png");
      this.OK = true;
   }

   public boolean OK() {
      return this.dN(true);
   }

   public boolean LH() {
      return this.dN(false);
   }

   private boolean dN(boolean var1) {
      YJ var2 = this.dN.OK();
      if(var2 == null) {
         return false;
      } else {
         Object var3 = var2.zs();
         if(var3 == null) {
            return false;
         } else {
            String var4;
            String var7;
            if(var2.dN() == Zh.mS) {
               if(var1) {
                  return true;
               } else {
                  var4 = var3.toString().replace("-", "").replace("/", "");
                  TM var13 = this.dN.QE().EO();
                  String var15 = var13.dN(WV.Hv);
                  var15 = var15.replace('\\', '/');
                  var7 = String.format("%s#op_%s", new Object[]{var15, var4});
                  Vm.QE(var7);
                  return true;
               }
            } else {
               String var5 = null;
               if(var3 instanceof String) {
                  var4 = var3.toString();
               } else {
                  if(!(var3 instanceof hO)) {
                     return false;
                  }

                  hO var6 = (hO)var3;
                  if(var6.QE()) {
                     return false;
                  }

                  var4 = var6.dN(false);

                  try {
                     var7 = this.dN(var6.OK());
                     if(var7 != null) {
                        var5 = var6.ld(false) + var7;
                     }
                  } catch (Exception var12) {
                     ;
                  }
               }

               if(var4.length() <= 2) {
                  return false;
               } else {
                  var4 = var4.substring(1, var4.length() - 1).replace('$', '.');
                  String[] var14 = new String[]{"android/", "dalvik/", "java/", "javax/", "org/apache/", "org/json/", "org/w3c/", "org/xml/", "org/xmlpull/"};
                  boolean var16 = false;
                  String[] var8 = var14;
                  int var9 = var14.length;

                  for(int var10 = 0; var10 < var9; ++var10) {
                     String var11 = var8[var10];
                     if(var4.startsWith(var11)) {
                        var16 = true;
                        break;
                     }
                  }

                  if(!var1 && var16) {
                     TM var17 = this.dN.QE().EO();
                     String var18 = var17.dN(WV.s);
                     var18 = var18.replace('\\', '/');
                     if(!var18.endsWith("/")) {
                        var18 = var18 + "/";
                     }

                     String var19 = var18 + "reference/" + var4 + ".html";
                     if(var5 != null) {
                        var19 = var19 + "#" + var5;
                     }

                     Vm.QE(var19);
                     return true;
                  } else {
                     return var16;
                  }
               }
            }
         }
      }
   }

   private String dN(Bw var1) {
      StringBuilder var2 = new StringBuilder("(");
      int var3 = 0;
      String[] var4 = var1.ld(false);
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         if(var3++ >= 1) {
            var2.append(",%20");
         }

         byte var8 = 0;
         int var11 = var8 + 1;
         char var9 = var7.charAt(0);

         int var10;
         for(var10 = 0; var9 == 91; var9 = var7.charAt(var11++)) {
            ++var10;
         }

         var7 = var7.substring(var10);
         switch(var9) {
         case 'B':
            var7 = "byte";
            break;
         case 'C':
            var7 = "char";
            break;
         case 'D':
            var7 = "double";
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
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         default:
            return null;
         case 'F':
            var7 = "float";
            break;
         case 'I':
            var7 = "int";
            break;
         case 'J':
            var7 = "long";
            break;
         case 'L':
            var7 = var7.substring(1, var7.length() - 1).replace('/', '.');
            break;
         case 'S':
            var7 = "short";
            break;
         case 'Z':
            var7 = "boolean";
         }

         while(var10-- > 0) {
            var7 = var7 + "[]";
         }

         var2.append(var7);
      }

      var2.append(")");
      return var2.toString();
   }
}
