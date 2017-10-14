package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jebglobal.AR;
import jebglobal.Cl;
import jebglobal.Oa;
import jebglobal.TM;
import jebglobal.lP;
import jebglobal.yK;

public final class nh extends Cl {
   private HashMap wU = new HashMap();
   private HashMap fa = new HashMap();
   private boolean zs;
   private HashMap mS = null;

   nh(AR var1, int var2) {
      super(var1, var2);
   }

   nh.vd ld(int var1) {
      return this.wU(this.dN.dN(var1));
   }

   private nh.vd wU(String var1) {
      if(this.zs && var1.startsWith("[")) {
         throw new RuntimeException();
      } else {
         String var2 = null;
         int var6;
         if(var1.endsWith(";")) {
            byte var3 = 0;
            var6 = var3 + 1;

            char var4;
            for(var4 = var1.charAt(0); var4 == 91; var4 = var1.charAt(var6++)) {
               ;
            }

            if(var4 != 76) {
               throw new RuntimeException();
            }

            String var5 = var1.substring(var6 - 1);
            var2 = (String)this.wU.get(var5);
            if(var2 == null) {
               var2 = var5;
               this.wU.put(var5, var5);
               this.fa.put(var5, new ArrayList());
            }
         }

         var6 = this.ld.size();
         nh.vd var7 = new nh.vd(var6, var1, var2, (TM)null);
         this.ld.add(var7);
         this.QE.put(var1, var7);
         if(var2 != null) {
            ((List)this.fa.get(var2)).add(var7);
         }

         return var7;
      }
   }

   void wU() {
      if(this.zs) {
         throw new RuntimeException();
      } else {
         this.zs = true;
         String[] var1 = new String[]{"Ljava/lang/Object;", "Ljava/lang/String;", "Ljava/lang/Class;", "Ljava/lang/Enum;", "Ljava/lang/Throwable;"};
         String[] var2 = var1;
         int var3 = var1.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            String var5 = var2[var4];
            if(this.dN(var5) == null) {
               this.dN.fa(var5);
               this.wU(var5);
            }
         }

         Iterator var13 = this.wU.keySet().iterator();

         while(var13.hasNext()) {
            String var15 = (String)var13.next();
            if(this.dN(var15) == null) {
               this.dN.fa(var15);
               this.wU(var15);
            }
         }

         this.mS = new HashMap();
         List var14 = this.dN.Hw();
         Iterator var16 = var14.iterator();

         yK var17;
         int var18;
         while(var16.hasNext()) {
            var17 = (yK)var16.next();
            var18 = var17.zs();
            String var6 = ((nh.vd)this.ld.get(var18)).ld;
            String var7 = var17.QE(false);
            String var8 = var17.mS();
            nh.uK var9 = (nh.uK)this.mS.get(Integer.valueOf(var18));
            if(var9 == null) {
               var9 = new nh.uK(var8, var7, var18);
               this.mS.put(Integer.valueOf(var18), var9);
            }

            Iterator var10 = ((List)this.fa.get(var6)).iterator();

            while(var10.hasNext()) {
               nh.vd var11 = (nh.vd)var10.next();
               var11.fa = var18;
            }
         }

         var16 = var14.iterator();

         while(var16.hasNext()) {
            var17 = (yK)var16.next();
            if(var17.dN()) {
               var18 = var17.zs();
               nh.uK var19 = (nh.uK)this.mS.get(Integer.valueOf(var18));
               yK var20 = this.dN.dN(var17);
               if(var20 != null) {
                  int var21 = var20.zs();
                  String var22 = ((nh.vd)this.ld.get(var21)).ld;
                  String var23 = var20.QE(false);
                  String var24 = var20.mS();
                  Object[] var10000 = new Object[]{var22};
                  nh.uK var12 = (nh.uK)this.mS.get(Integer.valueOf(var21));
                  if(var12 == null) {
                     var12 = new nh.uK(var24, var23, var21);
                     this.mS.put(Integer.valueOf(var21), var12);
                  }

                  var19.dN(var12);
                  var12.ld(var19);
               }
            }
         }

      }
   }

   public String dN(int var1, boolean var2) {
      return var1 >= 0 && var1 < this.ld.size()?((nh.vd)this.ld.get(var1)).dN(var2):null;
   }

   public int ld(String var1) {
      nh.vd var2 = (nh.vd)this.QE.get(var1);
      return var2 == null?-1:var2.dN();
   }

   public Set fa() {
      return this.wU.keySet();
   }

   public String QE(String var1) {
      return (String)this.wU.get(var1);
   }

   public class vd implements Oa {
      private final int dN;
      private final String ld;
      private final String QE;
      private int wU;
      private int fa;
      // $FF: synthetic field
      private nh zs;

      private vd(int var2, String var3, String var4) {
         this.zs = nh.this;
         super();
         this.fa = -1;
         this.dN = var2;
         this.ld = var3;
         this.QE = var4;
         int var5 = 0;
         byte var6 = 0;
         int var9 = var6 + 1;

         char var7;
         for(var7 = var3.charAt(0); var7 == 91; ++var5) {
            var7 = var3.charAt(var9++);
         }

         this.wU = var5;
         if(var7 == 76) {
            if(!var3.endsWith(";")) {
               throw new RuntimeException();
            }

            String var8 = var3.substring(var9 - 1);
            if(!var8.equals(var4)) {
               throw new RuntimeException();
            }
         }

      }

      public int dN() {
         return this.dN;
      }

      public boolean ld() {
         return this.ld.equals(this.QE);
      }

      public boolean QE() {
         return this.wU >= 1;
      }

      public int wU() {
         return this.wU;
      }

      public boolean fa() {
         return this.QE == null && this.wU >= 1;
      }

      public String zs() {
         return this.QE;
      }

      public boolean mS() {
         return this.fa >= 0;
      }

      public String dN(boolean var1) {
         if(var1 && this.QE != null) {
            if(this.fa < 0) {
               return this.ld;
            } else {
               nh.uK var2 = (nh.uK)this.zs.mS.get(Integer.valueOf(this.fa));
               String var3 = var2.dN(true);
               String var4 = this.ld.substring(0, this.ld.length() - this.QE.length());
               return var4 + var3;
            }
         } else {
            return this.ld;
         }
      }

      public String OK() {
         if(!this.ld()) {
            throw new RuntimeException();
         } else {
            int var1 = this.QE.lastIndexOf(47);
            return var1 < 0?"":this.QE.substring(1, var1 + 1);
         }
      }

      public String ld(boolean var1) {
         if(this.fa < 0) {
            return null;
         } else {
            nh.uK var2 = (nh.uK)this.zs.mS.get(Integer.valueOf(this.fa));
            return var2.ld(var1);
         }
      }

      public boolean dN(String var1) {
         if(this.fa < 0) {
            return false;
         } else {
            nh.uK var2 = (nh.uK)this.zs.mS.get(Integer.valueOf(this.fa));
            return var2.dN(var1);
         }
      }

      public boolean LH() {
         if(this.fa < 0) {
            return false;
         } else {
            nh.uK var1 = (nh.uK)this.zs.mS.get(Integer.valueOf(this.fa));
            return var1.ld();
         }
      }

      // $FF: synthetic method
      vd(int var2, String var3, String var4, TM var5) {
         this(var2, var3, var4);
      }
   }

   class uK {
      private String dN;
      private String ld;
      private int QE;
      private nh.uK wU;
      private List fa;
      private String zs;
      // $FF: synthetic field
      private nh mS;

      uK(String var2, String var3, int var4) {
         this.mS = nh.this;
         super();
         this.dN = var2;
         this.ld = var3;
         this.QE = var4;
         this.wU = null;
         this.fa = new ArrayList();
         this.zs = null;
      }

      void dN(nh.uK var1) {
         this.wU = var1;
      }

      void ld(nh.uK var1) {
         this.fa.add(var1);
      }

      public String dN(boolean var1) {
         if(!var1) {
            return ((nh.vd)this.mS.dN(this.QE)).dN(false);
         } else {
            StringBuilder var2 = new StringBuilder(";");
            var2.insert(0, this.ld(true));
            var2.insert(0, this.dN());

            for(nh.uK var3 = this.wU; var3 != null; var3 = var3.wU) {
               var2.insert(0, "$");
               var2.insert(0, var3.ld(true));
               var2.insert(0, var3.dN());
            }

            var2.insert(0, ((nh.vd)this.mS.dN(this.QE)).OK());
            var2.insert(0, "L");
            return var2.toString();
         }
      }

      public String ld(boolean var1) {
         return var1 && this.zs != null?this.zs:this.ld;
      }

      public String dN() {
         return this.dN;
      }

      public boolean dN(String var1) {
         if(var1 == null && this.zs == null || var1 != null && var1.equals(this.zs)) {
            return true;
         } else if(var1 != null && !lP.QE(var1)) {
            return false;
         } else {
            if(var1 != null && var1.equals(this.ld(false))) {
               var1 = null;
               if(this.zs == null) {
                  return true;
               }
            }

            if(var1 != null) {
               String var2 = ((nh.vd)this.mS.dN(this.QE)).OK();
               int var3 = 0;
               Iterator var4 = this.mS.ld.iterator();

               while(var4.hasNext()) {
                  nh.vd var5 = (nh.vd)var4.next();
                  if(var3++ != this.QE && var5.ld()) {
                     String var6 = var5.OK();
                     if(var6.equals(var2) && var5.mS() && (var1.equals(var5.ld(false)) || var1.equals(var5.ld(true)))) {
                        return false;
                     }
                  }
               }
            }

            this.zs = var1;
            this.mS.dN.wU = null;
            this.mS.dN.QE = null;
            this.mS.dN.fa = null;
            return true;
         }
      }

      public boolean ld() {
         return this.zs != null;
      }
   }
}
