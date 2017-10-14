package jebglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import jebglobal.IW;
import jebglobal.oM;

public final class oH extends IW {
   private File QE;

   public oH(File var1) {
      if(!var1.isDirectory()) {
         throw new oM();
      } else {
         this.QE = var1;
      }
   }

   protected IW KK(String var1) {
      File var2 = new File(this.cb(var1));
      var2.mkdir();
      return new oH(var2);
   }

   protected InputStream OK(String var1) {
      try {
         return new FileInputStream(this.cb(var1));
      } catch (FileNotFoundException var3) {
         throw new oM(var3);
      }
   }

   protected OutputStream LH(String var1) {
      try {
         return new FileOutputStream(this.cb(var1));
      } catch (FileNotFoundException var3) {
         throw new oM(var3);
      }
   }

   protected void wU() {
      this.fa();
   }

   protected void QE() {
      this.fa();
   }

   protected void EO(String var1) {
      (new File(this.cb(var1))).delete();
   }

   private String cb(String var1) {
      return this.zs().getPath() + '/' + var1;
   }

   private void fa() {
      this.dN = new LinkedHashSet();
      this.ld = new LinkedHashMap();
      File[] var1 = this.zs().listFiles();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         File var3 = var1[var2];
         if(var3.isFile()) {
            this.dN.add(var3.getName());
         } else {
            try {
               this.ld.put(var3.getName(), new oH(var3));
            } catch (oM var4) {
               ;
            }
         }
      }

   }

   private File zs() {
      return this.QE;
   }
}
