package jebglobal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import jebglobal.TM;

public class AM {
   protected File dN;
   private JarFile ld;
   private LinkedHashMap QE;

   public AM(File var1, boolean var2) {
      this.dN = var1;
      this.ld = new JarFile(var1, var2);
      this.dN();
   }

   public AM(String var1, boolean var2) {
      this(new File(var1), var2);
   }

   private void dN() {
      this.QE = new LinkedHashMap();
      Enumeration var1 = this.ld.entries();

      while(var1.hasMoreElements()) {
         JarEntry var2 = (JarEntry)var1.nextElement();
         String var3 = var2.getName();
         long var4 = var2.getSize();
         if(var4 > 2147483647L) {
            throw new IOException();
         }

         this.QE.put(var3, new AM.uK(var3, (int)var4));
      }

   }

   public Collection ld() {
      return this.QE.values();
   }

   public boolean dN(String var1) {
      ZipEntry var2 = this.ld.getEntry(var1);
      return var2 != null && !var2.isDirectory();
   }

   public byte[] ld(String var1) {
      byte[] var2 = null;

      try {
         ZipEntry var3 = this.ld.getEntry(var1);
         if(var3 != null && !var3.isDirectory()) {
            InputStream var4 = this.ld.getInputStream(var3);
            var2 = TM.dN(var4);
            if((long)var2.length != var3.getSize()) {
               throw new IOException();
            }
         }

         return var2;
      } catch (IOException var5) {
         return null;
      }
   }

   public Certificate[] QE(String var1) {
      JarEntry var2 = this.ld.getJarEntry(var1);
      if(var2 == null) {
         return null;
      } else {
         try {
            InputStream var3 = this.ld.getInputStream(var2);
            byte[] var4 = TM.dN(var3);
            if((long)var4.length != var2.getSize()) {
               throw new IOException();
            }
         } catch (IOException var5) {
            return null;
         }

         return var2.getCertificates();
      }
   }

   public static class uK {
      private String dN;

      public uK(String var1, int var2) {
         this.dN = var1;
      }

      public String dN() {
         return this.dN;
      }
   }
}
