package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jebglobal.Fw;
import jebglobal.IK;
import jebglobal.Rx;
import jebglobal.TM;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.cI;
import jebglobal.hV;
import jebglobal.lP;
import jebglobal.lo;
import jebglobal.oc;
import jebglobal.rO;
import jebglobal.wm;

public final class HI extends cI implements Rx {
   private String dN;
   private String ld;
   private int QE;

   private HI(String var1, int var2) {
      this.ld = null;
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
         this.QE = var2;
      }
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public String dN(boolean var1) {
      return var1 && this.ld != null?this.ld:this.dN;
   }

   public boolean dN(String var1) {
      if((var1 != null || this.ld != null) && (var1 == null || !var1.equals(this.ld))) {
         if(var1 != null && !lP.QE(var1)) {
            return false;
         } else {
            if(var1 != null && var1.equals(this.dN(false))) {
               var1 = null;
               if(this.ld == null) {
                  return true;
               }
            }

            this.ld = var1;
            return true;
         }
      } else {
         return true;
      }
   }

   public int ld() {
      return this.QE;
   }

   public List wU() {
      return TM.dN(new IK[0]);
   }

   public boolean dN(IK var1, IK var2) {
      return false;
   }

   public String toString() {
      return this.dN(true);
   }

   public void dN(ZL var1) {
      this.a_(var1);
      if(this.dN.equals("this")) {
         var1.dN(oc.ci);
      } else {
         var1.dN(this.dN(true), Zh.EO, this);
      }

   }

   // $FF: synthetic method
   HI(String var1, int var2, HI.SyntheticClass_1 var3) {
      this(var1, var2);
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[HI.vd.values().length];

      static {
         try {
            dN[HI.vd.ld.ordinal()] = 1;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }

   public static class uK {
      private boolean dN;
      private lo ld;
      private HashMap QE;
      private HashMap wU;

      uK(HI.vd var1) {
         this(false, var1);
      }

      private uK(boolean var1, HI.vd var2) {
         this.dN = var1;
         switch(HI.SyntheticClass_1.dN[var2.ordinal()]) {
         case 1:
            this.ld = new Fw();
            break;
         default:
            this.ld = new rO();
         }

         this.QE = new HashMap();
         this.wU = new HashMap();
      }

      public void dN() {
         this.ld.dN();
         this.QE.clear();
         this.wU.clear();
      }

      public wm dN(int var1, hV var2, int var3, String var4) {
         boolean var5 = this.dN && var2.zs();
         if(var4 == null) {
            var4 = this.ld.dN(var2, var3);
         }

         HI var6 = (HI)this.QE.get(var4);
         if(var6 == null) {
            var6 = new HI(var4, var3, (HI.SyntheticClass_1)null);
            wm var12 = new wm(var1, var2, var6);
            this.QE.put(var4, var6);
            Object var13 = (List)this.wU.get(Integer.valueOf(var3));
            if(var13 == null) {
               var13 = new ArrayList();
               this.wU.put(Integer.valueOf(var3), var13);
            }

            ((List)var13).add(var12);
            return var12;
         } else {
            List var7 = (List)this.wU.get(Integer.valueOf(var3));
            if(var7 == null) {
               throw new RuntimeException();
            } else {
               Iterator var8 = var7.iterator();

               wm var9;
               hV var10;
               do {
                  if(!var8.hasNext()) {
                     throw new RuntimeException();
                  }

                  var9 = (wm)var8.next();
                  var10 = var9.ld();
               } while(!var10.equals(var2) && (!var5 || !var10.zs()));

               HI var11 = var9.zs();
               if(var11 != var6) {
                  throw new RuntimeException();
               } else {
                  return var9;
               }
            }
         }
      }

      public List dN(int var1) {
         return (List)this.wU.get(Integer.valueOf(var1));
      }

      public wm dN(HI var1) {
         Iterator var2 = ((List)this.wU.get(Integer.valueOf(var1.ld()))).iterator();

         wm var3;
         do {
            if(!var2.hasNext()) {
               return null;
            }

            var3 = (wm)var2.next();
         } while(var3.zs() != var1);

         return var3;
      }

      public wm dN(int var1, hV var2, StringBuilder var3, hV[] var4) {
         boolean var5 = this.dN && var2.zs();
         List var6 = (List)this.wU.get(Integer.valueOf(var1));
         var3.setLength(0);
         if(var6 != null) {
            int var7 = 0;
            Iterator var8 = var6.iterator();

            while(true) {
               if(!var8.hasNext()) {
                  var3.append("_" + var7);
                  break;
               }

               wm var9 = (wm)var8.next();
               hV var10 = var9.ld();
               if(var10.equals(var2) || var5 && var10.zs()) {
                  var4[0] = var10;
                  return var9;
               }

               ++var7;
            }
         }

         return null;
      }
   }

   public static enum vd {
      dN,
      ld;
   }
}
