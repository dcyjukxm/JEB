package jeb.api.dex;

import java.util.ArrayList;
import java.util.List;
import jeb.api.dex.DexAnnotationItem;
import jebglobal.xd;

public class DexAnnotationsDirectory {
   xd ad;

   DexAnnotationsDirectory(xd var1) {
      this.ad = var1;
   }

   public List getClassAnnotations() {
      xd.vd var1 = this.ad.dN();
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList(var1.dN());
         xd.uK[] var3 = var1.ld();
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            xd.uK var6 = var3[var5];
            var2.add(new DexAnnotationItem(var6));
         }

         return var2;
      }
   }

   public List getFieldsAnnotations() {
      ArrayList var1 = new ArrayList();
      xd.lX[] var2 = this.ad.ld();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         xd.lX var5 = var2[var4];
         var1.add(new DexAnnotationsDirectory.FieldAnnotation(var5));
      }

      return var1;
   }

   public List getMethodsAnnotations() {
      ArrayList var1 = new ArrayList();
      xd.eI[] var2 = this.ad.QE();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         xd.eI var5 = var2[var4];
         var1.add(new DexAnnotationsDirectory.MethodAnnotation(var5));
      }

      return var1;
   }

   public List getParametersAnnotations() {
      ArrayList var1 = new ArrayList();
      xd.vn[] var2 = this.ad.wU();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         xd.vn var5 = var2[var4];
         var1.add(new DexAnnotationsDirectory.ParameterAnnotation(var5));
      }

      return var1;
   }

   public static class ParameterAnnotation {
      xd.vn pa;

      ParameterAnnotation(xd.vn var1) {
         this.pa = var1;
      }

      public int getMethodIndex() {
         return this.pa.dN();
      }

      public List getAnnotationItemSets() {
         ArrayList var1 = new ArrayList();
         xd.vd[] var2 = this.pa.ld();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            xd.vd var5 = var2[var4];
            ArrayList var6 = new ArrayList();
            xd.uK[] var7 = var5.ld();
            int var8 = var7.length;

            for(int var9 = 0; var9 < var8; ++var9) {
               xd.uK var10 = var7[var9];
               var6.add(new DexAnnotationItem(var10));
            }

            var1.add(var6);
         }

         return var1;
      }
   }

   public static class MethodAnnotation {
      xd.eI ma;

      MethodAnnotation(xd.eI var1) {
         this.ma = var1;
      }

      public int getMethodIndex() {
         return this.ma.dN();
      }

      public List getAnnotationItemSet() {
         ArrayList var1 = new ArrayList();
         xd.uK[] var2 = this.ma.ld().ld();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            xd.uK var5 = var2[var4];
            var1.add(new DexAnnotationItem(var5));
         }

         return var1;
      }
   }

   public static class FieldAnnotation {
      xd.lX fa;

      FieldAnnotation(xd.lX var1) {
         this.fa = var1;
      }

      public int getFieldIndex() {
         return this.fa.dN();
      }

      public List getAnnotationItemSet() {
         ArrayList var1 = new ArrayList();
         xd.uK[] var2 = this.fa.ld().ld();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            xd.uK var5 = var2[var4];
            var1.add(new DexAnnotationItem(var5));
         }

         return var1;
      }
   }
}
