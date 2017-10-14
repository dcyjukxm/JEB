package jebglobal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Qz;
import jebglobal.bt;
import jebglobal.ft;
import jebglobal.hV;
import jebglobal.jI;
import jebglobal.jn;
import jebglobal.kW;
import jebglobal.nm;
import jebglobal.oh;
import jebglobal.xS;

public final class Gz {
   private static final long LK = 844563159190538443L;
   private List dN;
   private AR ld;
   private AV QE;
   private hV.uK wU;
   private boolean fa;
   private oh zs;
   private TreeMap mS;
   private HashMap OK;
   private HashMap LH;
   private HashMap KK;

   public Gz(AR var1, AV var2, hV.uK var3) {
      this.ld = var1;
      this.QE = var2;
      this.wU = var3;
      this.fa = true;
   }

   public void dN(boolean var1) {
      this.fa = var1;
   }

   public void dN() {
      if(this.zs == null) {
         jI var1 = new jI(this.ld, this.QE, this.wU);
         var1.dN(this.fa);
         List var2 = var1.dN();
         List var3 = var1.ld();
         this.zs = new oh(var2, var3);
         this.zs.zs();
         if(this.zs.fa() >= 1) {
            this.zs.dN(true);
         }

         HashMap var4 = var1.QE();
         ArrayList var5 = new ArrayList();
         Iterator var6 = this.zs.ld().iterator();

         while(true) {
            ft var7;
            int var8;
            do {
               if(!var6.hasNext()) {
                  nm[] var20 = new nm[var5.size()];
                  var5.toArray(var20);
                  jn var21 = new jn(var20, true);
                  this.dN = new ArrayList();

                  int var28;
                  for(var8 = 0; var8 < var21.dN(); ++var8) {
                     nm var23 = var21.dN(var8);
                     int var26 = var23.dN();
                     var28 = var23.QE();
                     Gz.vd var29 = new Gz.vd(var26, var28);
                     Iterator var31 = var23.wU().iterator();

                     while(var31.hasNext()) {
                        bt var32 = (bt)var31.next();
                        int var15 = var32.QE();
                        ft var16 = this.zs.ld(var15);
                        if(var16 == null) {
                           throw new RuntimeException();
                        }

                        xS var17 = null;
                        if(((xS)var16.dN(0)).wU() == Qz.OK) {
                           var17 = (xS)var16.dN(0);
                        }

                        String var18 = var32.dN()?this.ld.dN(var32.ld(), false):"Ljava/lang/Throwable;";
                        hV var19 = this.wU.dN(var18);
                        var29.QE.add(new Gz.uK(var19, var17, var15));
                     }

                     this.dN.add(var29);
                  }

                  this.mS = new TreeMap();
                  Iterator var22 = this.zs.ld().iterator();

                  while(var22.hasNext()) {
                     ft var25 = (ft)var22.next();
                     xS var27 = (xS)var25.dN(0);
                     var28 = var27.dN();
                     int var30 = var27.mS();
                     this.mS.put(Integer.valueOf(var28), Integer.valueOf(var30));
                  }

                  this.KK = dN(this.ld, this.QE, this.wU);
                  kW var24 = new kW(this.zs);
                  if(var24.ld()) {
                     this.zs.dN(true);
                  }

                  this.OK = this.zs.OK();
                  this.LH = this.zs.KK();
                  this.zs();
                  return;
               }

               var7 = (ft)var6.next();
            } while(var7.EO() == 0);

            var8 = ((xS)var7.dN(0)).dN();
            int var9 = ((xS)var7.QE()).dN() + ((xS)var7.QE()).ld();
            ArrayList var10 = new ArrayList();
            Iterator var11 = var7.Hw().iterator();

            while(var11.hasNext()) {
               ft var12 = (ft)var11.next();
               int var13 = ((xS)var12.dN(0)).dN();
               int var14 = ((Integer)var4.get(Integer.valueOf(var13))).intValue();
               var10.add(new bt(var14, var13));
            }

            var5.add(new nm(var8, var9 - var8, var10));
         }
      }
   }

   public oh ld() {
      return this.zs;
   }

   public List QE() {
      return this.dN;
   }

   public TreeMap wU() {
      return this.mS;
   }

   public AV fa() {
      return this.QE;
   }

   private void zs() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.zs.ld().iterator();

      while(var2.hasNext()) {
         ft var3 = (ft)var2.next();
         var1.addAll(var3.wU());
      }

      this.dN(this.KK);
      hV var10 = (hV)this.KK.get(Integer.valueOf(-1));
      xS var5;
      if(var10.EO()) {
         if(var10 == hV.zs) {
            var10 = hV.cb;
         }

         Iterator var11 = this.zs.ld().iterator();

         label65:
         while(true) {
            do {
               if(!var11.hasNext()) {
                  break label65;
               }

               ft var4 = (ft)var11.next();
               var5 = (xS)var4.QE();
            } while(var5.wU() != Qz.zs);

            ArrayList var6 = new ArrayList();
            ArrayList var7 = new ArrayList();
            var5.dN(var6, var7, (Object)null);
            Iterator var8 = var7.iterator();

            while(var8.hasNext()) {
               int var9 = ((Integer)var8.next()).intValue();
               var5.ld(var9, var10);
            }
         }
      }

      HashSet var12 = new HashSet();
      var12.addAll(var1);

      while(!var12.isEmpty()) {
         ArrayList var13 = new ArrayList(var12.size());
         var13.addAll(var12);
         Collections.sort(var13, new Comparator() {
            public int dN(xS var1, xS var2) {
               return var1.dN() - var2.dN();
            }

            // $FF: synthetic method
            public int compare(Object var1, Object var2) {
               return this.dN((xS)var1, (xS)var2);
            }
         });
         var12.clear();
         Iterator var15 = var13.iterator();

         xS var16;
         HashSet var17;
         while(var15.hasNext()) {
            var16 = (xS)var15.next();
            var17 = this.dN(var16);
            var12.addAll(var17);
         }

         var15 = var13.iterator();

         while(var15.hasNext()) {
            var16 = (xS)var15.next();
            var17 = this.ld(var16);
            var12.addAll(var17);
         }
      }

      Iterator var14 = var1.iterator();

      while(var14.hasNext()) {
         var5 = (xS)var14.next();
         var5.dN(hV.cb, hV.zs);
         var5.dN(hV.KK, hV.zs);
         var5.dN(hV.EO, hV.mS);
         var5.dN(hV.PF, this.wU.dN("Ljava/lang/Object;"));
      }

   }

   private void dN(HashMap var1) {
      HashMap var2 = (HashMap)this.OK.get((Object)null);
      Iterator var3 = var2.keySet().iterator();

      while(true) {
         int var4;
         hV var5;
         do {
            if(!var3.hasNext()) {
               return;
            }

            var4 = ((Integer)var3.next()).intValue();
            var5 = (hV)var1.get(Integer.valueOf(var4));
         } while(var5 == null);

         if(!var5.cb()) {
            throw new RuntimeException();
         }

         hV var6 = hV.dN(var5, true);
         Iterator var7 = ((List)var2.get(Integer.valueOf(var4))).iterator();

         while(var7.hasNext()) {
            xS var8 = (xS)var7.next();
            var8.ld(var4, var6);
         }
      }
   }

   private HashSet dN(xS var1) {
      HashMap var2 = (HashMap)this.OK.get(var1);
      HashSet var3 = new HashSet();
      Iterator var4 = var2.keySet().iterator();

      while(true) {
         int var5;
         hV var6;
         do {
            if(!var4.hasNext()) {
               return var3;
            }

            var5 = ((Integer)var4.next()).intValue();
            var6 = var1.zs(var5);
         } while(!var6.cb());

         hV var7 = hV.dN(var6, true);
         Iterator var8 = ((List)var2.get(Integer.valueOf(var5))).iterator();

         while(var8.hasNext()) {
            xS var9 = (xS)var8.next();
            if(var9.ld(var5, var7)) {
               var3.add(var9);
            }
         }
      }
   }

   private HashSet ld(xS var1) {
      HashMap var2 = (HashMap)this.LH.get(var1);
      HashSet var3 = new HashSet();
      Iterator var4 = var2.keySet().iterator();

      while(true) {
         int var5;
         hV var6;
         do {
            if(!var4.hasNext()) {
               return var3;
            }

            var5 = ((Integer)var4.next()).intValue();
            var6 = var1.mS(var5);
         } while(!var6.cb());

         hV var7 = hV.dN(var6, false);
         Iterator var8 = ((List)var2.get(Integer.valueOf(var5))).iterator();

         while(var8.hasNext()) {
            xS var9 = (xS)var8.next();
            if(var9.dN(var5, var7)) {
               var3.add(var9);
            }
         }
      }
   }

   public static HashMap dN(AR var0, AV var1, hV.uK var2) {
      HashMap var3 = new HashMap();
      int var4 = var1.wU().zs() - 1;
      hV[] var5 = hV.dN(var0.mS(var1.ld()).OK(), var2);

      for(int var6 = var5.length - 1; var6 >= 1; --var6) {
         if(var4 < 0) {
            throw new RuntimeException();
         }

         if(var5[var6].rK()) {
            var3.put(Integer.valueOf(var4), var5[var6]);
         } else {
            if(!var5[var6].Ux()) {
               throw new RuntimeException();
            }

            --var4;
            if(var4 < 0) {
               throw new RuntimeException();
            }

            var3.put(Integer.valueOf(var4), var5[var6]);
         }

         --var4;
      }

      if(!var1.zs()) {
         if(var4 < 0) {
            throw new RuntimeException();
         }

         String var7 = var0.mS(var1.ld()).dN(false);
         var3.put(Integer.valueOf(var4), hV.dN(var7, var2));
      }

      var3.put(Integer.valueOf(-1), var5[0]);
      return var3;
   }

   public static class vd {
      public int dN;
      public int ld;
      public List QE = new ArrayList();
      public List wU = new ArrayList();

      vd(int var1, int var2) {
         this.dN = var1;
         this.ld = var2;
      }
   }

   public static class uK {
      public hV dN;
      public xS ld;
      public int QE;
      public int wU = -1;

      uK(hV var1, xS var2, int var3) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
      }
   }
}
