package jebglobal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import jebglobal.cn;

public final class WX {
   private String dN;
   private String ld;
   private String QE;
   private String wU;
   private int fa = 0;
   private int zs = 0;
   private boolean mS;

   private WX(File var1) {
      this.dN = var1.getAbsolutePath();
      this.ld = var1.getName();
      int var2 = this.ld.lastIndexOf(46);
      if(var2 >= 0) {
         this.ld = this.ld.substring(0, var2);
      }

   }

   public String dN() {
      return this.dN;
   }

   public String ld() {
      return this.ld;
   }

   public String QE() {
      return this.QE;
   }

   public boolean wU() {
      return this.mS;
   }

   public int fa() {
      return this.fa;
   }

   public int zs() {
      return this.zs;
   }

   public static WX dN(File var0) {
      BufferedReader var1;
      try {
         var1 = new BufferedReader(new InputStreamReader(new FileInputStream(var0)));
      } catch (FileNotFoundException var18) {
         return null;
      }

      WX var2 = new WX(var0);

      String var3;
      label164: {
         try {
            do {
               if((var3 = var1.readLine()) == null) {
                  break label164;
               }

               var3 = var3.trim();
               if(var3.startsWith("#?")) {
                  var3 = var3.substring(2);
                  break label164;
               }
            } while(!var3.startsWith("//?"));

            var3 = var3.substring(3);
            break label164;
         } catch (IOException var19) {
            ;
         } finally {
            try {
               var1.close();
            } catch (IOException var17) {
               return null;
            }
         }

         return null;
      }

      if(var3 == null) {
         return var2;
      } else {
         String[] var4 = var3.split(",");
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            String[] var8 = var7.split("=");
            if(var8.length == 2) {
               String var9 = var8[0].trim();
               String var10 = var8[1].trim();
               if(var9.equals("name")) {
                  var2.ld = var10;
               } else if(var9.equals("shortcut")) {
                  var2.wU = var10;
               } else if(var9.equals("help")) {
                  var2.QE = var10;
               } else if(!var9.equals("author") && var9.equals("autorun")) {
                  var2.mS = Boolean.parseBoolean(var10);
               }
            }
         }

         if(!var2.mS() && var2.wU != null) {
            cn.dN(String.format("Invalid shortcut: %s", new Object[]{var2.wU}));
         }

         return var2;
      }
   }

   private boolean mS() {
      if(this.wU == null) {
         return false;
      } else {
         this.zs = 0;
         this.fa = 0;
         String var1 = this.wU;
         int var2 = 0;

         while(var2 < var1.length() && this.fa == 0) {
            if(var2 > 0 && var1.charAt(var2++) != 43) {
               return false;
            }

            if(var1.substring(var2).startsWith("Ctrl")) {
               this.zs |= 262144;
               var2 += 4;
            } else if(var1.substring(var2).startsWith("Alt")) {
               this.zs |= 65536;
               var2 += 3;
            } else if(var1.substring(var2).startsWith("Shift")) {
               this.zs |= 131072;
               var2 += 5;
            } else if(var1.substring(var2).startsWith("Command")) {
               this.zs |= 4194304;
               var2 += 7;
            } else {
               char var3 = var1.charAt(var2++);
               if(Character.isLetterOrDigit(var3)) {
                  var3 = Character.toUpperCase(var3);
               }

               if(var3 == 70 && var2 < var1.length() && var1.charAt(var2) >= 49 && var1.charAt(var2) <= 57) {
                  char var4 = var1.charAt(var2++);
                  int var5 = var4 - 48;
                  if(var5 == 1 && var2 < var1.length() && var1.charAt(var2) >= 48 && var1.charAt(var2) <= 50) {
                     char var6 = var1.charAt(var2++);
                     var5 = 10 + (var6 - 48);
                  }

                  this.fa = 16777225 + var5;
               } else {
                  this.fa = var3;
               }
            }
         }

         return var2 == var1.length();
      }
   }
}
