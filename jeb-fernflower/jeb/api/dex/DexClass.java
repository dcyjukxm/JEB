package jeb.api.dex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jeb.api.dex.DexAnnotationsDirectory;
import jeb.api.dex.DexClassData;
import jeb.api.dex.DexValue;
import jebglobal.Uk;
import jebglobal.ub;
import jebglobal.xd;
import jebglobal.yK;

public class DexClass {
   yK c;

   DexClass(yK var1) {
      this.c = var1;
   }

   public int getClasstypeIndex() {
      return this.c.zs();
   }

   public int getAccessFlags() {
      return this.c.LH();
   }

   public int getSuperclassIndex() {
      return this.c.Hw();
   }

   public int[] getInterfaceIndexes() {
      int[] var1 = this.c.rK();
      return Arrays.copyOf(var1, var1.length);
   }

   public int getSourceIndex() {
      return this.c.Ux();
   }

   public DexClassData getData() {
      Uk var1 = this.c.s();
      return var1 == null?null:new DexClassData(var1);
   }

   public List getStaticInitializers() {
      ArrayList var1 = new ArrayList();
      ub[] var2 = this.c.ZY();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ub var5 = var2[var4];
         var1.add(new DexValue(var5));
      }

      return var1;
   }

   public DexAnnotationsDirectory getAnnotationsDirectory() {
      xd var1 = this.c.Hv();
      return var1 == null?null:new DexAnnotationsDirectory(var1);
   }

   public int getUserFlags() {
      return this.c.ci();
   }

   public void setUserFlags(int var1) {
      this.c.wU(var1);
   }
}
