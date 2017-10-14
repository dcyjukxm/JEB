package jeb;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import jebglobal.TM;
import jebglobal.cd;
import jebglobal.eI;
import jebglobal.uK;
import jebglobal.yW;

public class Launcher {
   public static void main(String[] var0) {
      String var1 = null;
      String var2 = null;
      String var3 = null;
      String[] var4 = null;
      boolean var5 = false;
      int var6 = 0;
      String[] var7 = var0;
      int var8 = var0.length;

      int var9;
      for(var9 = 0; var9 < var8; ++var9) {
         String var10 = var7[var9];
         if(var10.equals("--") || !var10.startsWith("-")) {
            break;
         }

         if(var10.equals("--help") || var10.equals("-h")) {
            ld();
            System.exit(0);
         }

         if(!var10.equals("--license") && !var10.equals("-l")) {
            if(!var10.equals("--automation") && !var10.equals("-a")) {
               if(!var10.startsWith("--config=") && !var10.equals("-c=")) {
                  if(!var10.startsWith("--script=") && !var10.equals("-s=")) {
                     System.out.println("Invalid command-line.");
                     ld();
                     System.exit(1);
                  } else {
                     var3 = var10.substring(var10.indexOf(61) + 1);
                  }
               } else {
                  var1 = var10.substring(var10.indexOf(61) + 1);
               }
            } else {
               var5 = true;
            }
         } else {
            QE();
            System.exit(0);
         }

         ++var6;
      }

      var7 = new String[var0.length - var6];

      for(var8 = var6; var8 < var0.length; ++var8) {
         var7[var8 - var6] = var0[var8];
      }

      label59:
      for(var8 = 0; var8 < var7.length; ++var8) {
         if(var8 == 0 && !var7[0].equals("--")) {
            var2 = var7[0];
         } else if(var7[var8].equals("--")) {
            ++var8;
            var9 = var8;
            var4 = new String[var7.length - var8];

            while(true) {
               if(var8 >= var7.length) {
                  break label59;
               }

               var4[var8 - var9] = var7[var8];
               ++var8;
            }
         }
      }

      if(var5) {
         cd.dN(var1, var2, var3, var4);
      } else {
         yW.dN(var1, var2, var3, var4);
      }

      System.exit(0);
   }

   private static String dN() {
      return String.format("%s %s v%s (c) %s, %s", new Object[]{"JEB", uK.QE(), eI.dN.toString(), "PNF Software", "2013-2014"});
   }

   private static void ld() {
      StringBuilder var0 = new StringBuilder();
      var0.append(dN());
      var0.append("\n");
      var0.append("Usages:\n");
      var0.append("  JEB [options] [inputpath] [-- scriptarg1 [scriptarg2 [...]]]\n");
      var0.append("Arguments:\n");
      var0.append("  inputpath                DEX/APK/JDB file\n");
      var0.append("  scriptargX               script arguments\n");
      var0.append("Options:\n");
      var0.append("  --help                   Print this message and exit\n");
      var0.append("  --license                Display license information\n");
      var0.append("  --automation             Automation mode (default: UI, unless the license is automation-only)\n");
      var0.append("  --script=<scriptpath>    Execute a script at startup (default: no input script)\n");
      var0.append(String.format("  --config=<configpath>    Set alternate config file (default: %s in JEB directory)\n", new Object[]{"jeb-config.txt"}));
      System.out.println(var0);
   }

   private static void QE() {
      System.out.println(dN());
      System.out.println(eI.BQ());
   }

   public static File dN(String var0) {
      String var1 = String.format("assets/%s", new Object[]{var0});
      return new File(Launcher.class.getResource(var1).getPath());
   }

   public static InputStream ld(String var0) {
      String var1 = String.format("assets/%s", new Object[]{var0});
      return Launcher.class.getResourceAsStream(var1);
   }

   public static byte[] QE(String var0) {
      InputStream var1 = ld(var0);
      if(var1 == null) {
         return null;
      } else {
         try {
            byte[] var2 = TM.dN(var1);
            return var2;
         } catch (IOException var10) {
            ;
         } finally {
            try {
               var1.close();
            } catch (IOException var9) {
               ;
            }

         }

         return null;
      }
   }
}
