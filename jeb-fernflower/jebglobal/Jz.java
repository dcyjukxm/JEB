package jebglobal;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLClassLoader;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import jeb.api.IScript;
import jeb.api.JebInstance;
import jebglobal.Fp;
import jebglobal.OF;
import jebglobal.XW;
import jebglobal.cn;
import jebglobal.eI;

public final class Jz {
   private Fp dN;
   private eI ld;
   private JebInstance QE;
   private IScript wU;

   public Jz(eI var1) {
      if(var1 == null) {
         throw new RuntimeException();
      } else {
         this.dN = null;
         this.ld = var1;
      }
   }

   public boolean dN(String var1) {
      File var2 = new File(var1);
      if(!var2.exists()) {
         cn.dN("Script file was not found");
         return false;
      } else {
         String var3 = var2.getName();
         String var4;
         if(var3.endsWith(".py")) {
            var4 = var3.substring(0, var3.length() - 3);
            return this.dN(var2, var4);
         } else if(var3.endsWith(".java")) {
            var4 = var3.substring(0, var3.length() - 5);
            return this.ld(var2, var4);
         } else {
            cn.dN("Unknown script extension, supported extensions are \".py\" and \".java\"");
            return false;
         }
      }
   }

   public boolean dN(File var1, String var2) {
      try {
         XW var3 = new XW(this.ld, var1.getAbsoluteFile().getParent(), var2);
         this.QE = new JebInstance(this.ld);
         this.wU = var3.dN();
         this.dN = Fp.ld;
         return true;
      } catch (Exception var4) {
         cn.dN(String.format("Error loading Python script:\n%s", new Object[]{var4.toString()}));
         return false;
      }
   }

   public boolean ld(File var1, String var2) {
      try {
         JavaCompiler var3 = ToolProvider.getSystemJavaCompiler();
         if(var3 == null) {
            cn.dN("Java scripts require the use of a JDK");
            return false;
         } else {
            StringBuilder var4 = new StringBuilder();
            int var5 = var3.run((InputStream)null, (OutputStream)null, new OF(var4), new String[]{var1.getAbsolutePath()});
            cn.ld(var4.toString());
            if(var5 != 0) {
               cn.dN("There were compilation errors");
               return false;
            } else {
               File var6 = var1.getParentFile();
               URLClassLoader var7 = URLClassLoader.newInstance(new URL[]{var6.toURI().toURL()});

               Class var8;
               try {
                  var8 = Class.forName(var2, true, var7);
               } catch (NoClassDefFoundError var9) {
                  cn.dN("Error loading Java script, make sure the class is not contained inside any package");
                  return false;
               }

               this.QE = new JebInstance(this.ld);
               this.wU = (IScript)var8.newInstance();
               this.dN = Fp.dN;
               return var5 == 0;
            }
         }
      } catch (Exception var10) {
         cn.dN(String.format("Error loading Java script:\n%s", new Object[]{var10.toString()}));
         return false;
      }
   }

   public boolean dN() {
      try {
         this.wU.run(this.QE);
         return true;
      } catch (Exception var7) {
         cn.dN(String.format("Error executing %s script:\n%s", new Object[]{this.dN.toString().toLowerCase(), var7.toString()}));
         if(this.dN == Fp.dN) {
            StackTraceElement[] var2 = var7.getStackTrace();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               StackTraceElement var5 = var2[var4];
               String var6 = var5.getClassName();
               if(var6.startsWith("jeb.") && !var6.startsWith("jeb.api.") || var6.startsWith("jebglobal.")) {
                  break;
               }

               cn.dN(String.format("    %s", new Object[]{var5}));
            }
         }

         return false;
      }
   }
}
