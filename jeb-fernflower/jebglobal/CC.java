package jebglobal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import jebglobal.By;
import jebglobal.IW;
import jebglobal.oM;

public final class CC extends IW {
   private ZipFile QE;
   private String wU;

   public CC(File var1) {
      this(var1, "");
   }

   public CC(File var1, String var2) {
      try {
         this.QE = new ZipFile(var1);
      } catch (IOException var4) {
         throw new oM(var4);
      }

      this.wU = var2;
   }

   public CC(ZipFile var1, String var2) {
      this.QE = var1;
      this.wU = var2;
   }

   protected IW KK(String var1) {
      throw new UnsupportedOperationException();
   }

   protected InputStream OK(String var1) {
      try {
         return this.mS().getInputStream(new ZipEntry(this.zs() + var1));
      } catch (IOException var3) {
         throw new By(var1, var3);
      }
   }

   protected OutputStream LH(String var1) {
      throw new UnsupportedOperationException();
   }

   protected void wU() {
      this.fa();
   }

   protected void QE() {
      this.fa();
   }

   protected void EO(String var1) {
      throw new UnsupportedOperationException();
   }

   private void fa() {
      this.dN = new LinkedHashSet();
      this.ld = new LinkedHashMap();
      int var1 = this.zs().length();
      Enumeration var2 = this.mS().entries();

      while(true) {
         while(true) {
            ZipEntry var3;
            String var4;
            do {
               do {
                  if(!var2.hasMoreElements()) {
                     return;
                  }

                  var3 = (ZipEntry)var2.nextElement();
                  var4 = var3.getName();
               } while(var4.equals(this.zs()));
            } while(!var4.startsWith(this.zs()));

            String var5 = var4.substring(var1);
            int var6 = var5.indexOf(47);
            if(var6 == -1) {
               if(!var3.isDirectory()) {
                  this.dN.add(var5);
                  continue;
               }
            } else {
               var5 = var5.substring(0, var6);
            }

            if(!this.ld.containsKey(var5)) {
               CC var7 = new CC(this.mS(), this.zs() + var5 + '/');
               this.ld.put(var5, var7);
            }
         }
      }
   }

   private String zs() {
      return this.wU;
   }

   private ZipFile mS() {
      return this.QE;
   }
}
