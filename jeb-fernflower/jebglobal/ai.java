package jebglobal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;
import jebglobal.AV;
import jebglobal.Dc;
import jebglobal.Dq;
import jebglobal.EG;
import jebglobal.Fu;
import jebglobal.Gy;
import jebglobal.Gz;
import jebglobal.HI;
import jebglobal.II;
import jebglobal.KO;
import jebglobal.Qa;
import jebglobal.Qz;
import jebglobal.Rg;
import jebglobal.SP;
import jebglobal.TB;
import jebglobal.Xf;
import jebglobal.Yx;
import jebglobal.eO;
import jebglobal.ft;
import jebglobal.jM;
import jebglobal.kn;
import jebglobal.lk;
import jebglobal.oh;
import jebglobal.rK;
import jebglobal.rP;
import jebglobal.sX;
import jebglobal.tE;
import jebglobal.wB;
import jebglobal.xS;
import jebglobal.zn;

public class ai {
   private static final long LK = 844563159190538443L;
   private Yx ld;
   private Gz QE;
   private oh wU;
   private List fa;
   private List zs;
   private Fu mS;
   private TB OK;
   private rK LH;
   private HashMap KK;
   private HashMap EO;
   private HashMap cb;
   private HashMap PF;
   private HashMap Hw = new HashMap();
   public boolean dN = false;
   private int rK;
   private int Ux;
   private Stack ZY;
   private Stack s;
   private static boolean Hv = dN(Rg.class);
   private static boolean VX = dN(Dc.class);
   private static boolean ci = dN(rK.class);

   public ai(Yx var1, Gz var2) {
      this.ld = var1;
      this.QE = var2;
      this.wU = var2.ld();
      this.fa = this.wU.ld();
      this.zs = new ArrayList();
      Iterator var3 = this.fa.iterator();

      while(var3.hasNext()) {
         ft var4 = (ft)var3.next();
         this.zs.addAll(var4.wU());
      }

      this.dN(var2.fa());
   }

   public ai(Yx var1, AV var2) {
      this.ld = var1;
      this.dN(var2);
   }

   private void dN(AV var1) {
      this.mS = this.ld.zs.dN(var1.ld(), var1.zs());
      this.OK = new TB(this.ld.dN, this.wU, true, this.ld.ld, this.ld.QE, this.ld.wU, this.ld.zs, this.ld.mS, this.mS.s(), this.mS.Hv());
   }

   public Fu dN() {
      return this.mS;
   }

   public Fu ld() {
      if(this.zs == null) {
         throw new RuntimeException();
      } else {
         Iterator var1 = this.zs.iterator();

         while(var1.hasNext()) {
            xS var2 = (xS)var1.next();
            II var3 = var2.dN(this.OK);
            if(var3 != null) {
               this.mS.dN(var3);
            }
         }

         this.fa();
         return this.mS;
      }
   }

   public Fu QE() {
      if(this.zs == null) {
         throw new RuntimeException();
      } else {
         if(!Hv || !VX || !ci) {
            rK.dN = 0;
         }

         ArrayList var1 = new ArrayList();
         ArrayList var2 = new ArrayList();
         this.wU.dN((List)var1, (List)var2);
         this.LH = new rK(var1, var2);
         this.KK = this.LH.dN();
         this.wU();
         String var3 = this.mS.zs() + "->" + this.mS.mS();
         Dc var4 = new Dc(this.LH, var3.getBytes());
         this.EO = var4.QE();
         this.cb = var4.dN();
         this.PF = var4.ld();
         this.dN = var4.dN;
         this.dN(this.mS.VX());
         this.fa();
         return this.mS;
      }
   }

   private void wU() {
      List var1 = this.QE.QE();
      if(var1 != null && !var1.isEmpty()) {
         Iterator var5;
         Iterator var7;
         Gz.uK var8;
         for(int var2 = 1; var2 <= this.KK.size(); ++var2) {
            ft var3 = this.wU.dN(((Integer)this.KK.get(Integer.valueOf(var2))).intValue() - 1);
            int var4 = ((xS)var3.dN(0)).dN();
            var5 = var1.iterator();

            while(var5.hasNext()) {
               Gz.vd var6 = (Gz.vd)var5.next();
               if(var4 >= var6.dN && var4 < var6.ld) {
                  var6.wU.add(Integer.valueOf(var2));
               }

               var7 = var6.QE.iterator();

               while(var7.hasNext()) {
                  var8 = (Gz.uK)var7.next();
                  if(var8.QE == var4) {
                     var8.wU = var2;
                  }
               }
            }
         }

         Iterator var13 = var1.iterator();

         wB var17;
         label175:
         while(var13.hasNext()) {
            Gz.vd var15 = (Gz.vd)var13.next();
            var17 = null;
            var5 = var15.wU.iterator();

            while(true) {
               while(true) {
                  if(!var5.hasNext()) {
                     continue label175;
                  }

                  int var22 = ((Integer)var5.next()).intValue();
                  if(var17 != null && var22 == var17.ld + 1) {
                     var17.ld = var22;
                  } else {
                     var17 = new wB(var22, var22);
                     this.Hw.put(Integer.valueOf(var22), var17);
                     var7 = var15.QE.iterator();

                     while(var7.hasNext()) {
                        var8 = (Gz.uK)var7.next();
                        var17.QE.add(new eO(var8.wU, var8.dN, var8.ld));
                     }
                  }
               }
            }
         }

         ArrayList var14 = new ArrayList(this.Hw.values());
         Collections.sort(var14, new Comparator() {
            public int dN(wB var1, wB var2) {
               return var1.dN - var2.dN;
            }

            // $FF: synthetic method
            public int compare(Object var1, Object var2) {
               return this.dN((wB)var1, (wB)var2);
            }
         });
         int var16 = 0;

         while(true) {
            wB var20;
            while(var16 < var14.size() - 1) {
               var17 = (wB)var14.get(var16);
               var20 = (wB)var14.get(var16 + 1);
               if(var17.ld + 1 == var20.dN && this.dN(var17.QE, var20.QE)) {
                  var17.ld = var20.ld;
                  this.Hw.remove(Integer.valueOf(var20.dN));
                  var14.remove(var16 + 1);
               } else {
                  ++var16;
               }
            }

            ArrayList var18 = new ArrayList();
            Iterator var19 = this.Hw.keySet().iterator();

            while(true) {
               Iterator var9;
               int var21;
               label144:
               while(var19.hasNext()) {
                  var21 = ((Integer)var19.next()).intValue();
                  wB var23 = (wB)this.Hw.get(Integer.valueOf(var21));

                  for(int var25 = var23.dN; var25 <= var23.ld; ++var25) {
                     ft var27 = this.wU.dN(((Integer)this.KK.get(Integer.valueOf(var25))).intValue() - 1);
                     var9 = var27.wU().iterator();

                     while(var9.hasNext()) {
                        xS var10 = (xS)var9.next();
                        if(var10.QE()) {
                           continue label144;
                        }
                     }
                  }

                  var18.add(Integer.valueOf(var21));
               }

               var19 = var18.iterator();

               while(var19.hasNext()) {
                  var21 = ((Integer)var19.next()).intValue();
                  this.Hw.remove(Integer.valueOf(var21));
               }

               var19 = this.Hw.values().iterator();

               while(true) {
                  boolean var24;
                  boolean var26;
                  do {
                     do {
                        if(!var19.hasNext()) {
                           return;
                        }

                        var20 = (wB)var19.next();
                        var24 = true;
                        var26 = false;
                        Iterator var28 = var20.QE.iterator();

                        while(var28.hasNext()) {
                           eO var29 = (eO)var28.next();
                           if(var29.dN <= var20.ld) {
                              var24 = false;
                              break;
                           }

                           if(var29.dN == var20.ld + 1) {
                              var26 = true;
                           }
                        }
                     } while(!var24);
                  } while(!var26);

                  ArrayList var30 = new ArrayList();
                  var9 = var20.QE.iterator();

                  eO var32;
                  while(var9.hasNext()) {
                     var32 = (eO)var9.next();
                     var30.add(Integer.valueOf(var32.dN));
                  }

                  Collections.sort(var30);
                  HashMap var31 = new HashMap();

                  int var33;
                  for(var33 = 0; var33 < var30.size() - 1; ++var33) {
                     int var11 = ((Integer)var30.get(var33)).intValue();
                     int var12 = ((Integer)var30.get(var33 + 1)).intValue() - 1;
                     var31.put(Integer.valueOf(var11), Integer.valueOf(var12));
                  }

                  if(var30.size() >= 1) {
                     var33 = ((Integer)var30.get(var30.size() - 1)).intValue();
                     var31.put(Integer.valueOf(var33), Integer.valueOf(var33));
                  }

                  eO var34;
                  for(Iterator var35 = var20.QE.iterator(); var35.hasNext(); var34.ld = ((Integer)var31.get(Integer.valueOf(var34.dN))).intValue()) {
                     var34 = (eO)var35.next();
                  }

                  Collections.sort(var20.QE, new Comparator() {
                     public int dN(eO var1, eO var2) {
                        return var1.dN - var2.dN;
                     }

                     // $FF: synthetic method
                     public int compare(Object var1, Object var2) {
                        return this.dN((eO)var1, (eO)var2);
                     }
                  });
                  var32 = (eO)var20.QE.get(var20.QE.size() - 1);
                  var32.ld = this.dN(var32.dN);
                  var20.wU = true;
               }
            }
         }
      }
   }

   private boolean dN(List var1, List var2) {
      if(var1.size() != var2.size()) {
         return false;
      } else {
         int var3 = var1.size();

         for(int var4 = 0; var4 < var3; ++var4) {
            if(((eO)var1.get(var4)).dN != ((eO)var2.get(var4)).dN) {
               return false;
            }
         }

         return true;
      }
   }

   private int dN(int var1) {
      int var2 = var1 + 1;

      label67:
      for(int var3 = this.LH.ld(); var2 <= var3; ++var2) {
         Iterator var4 = this.LH.ld(var2).iterator();

         while(var4.hasNext()) {
            int var5 = ((Integer)var4.next()).intValue();
            if(var5 < var1) {
               break label67;
            }
         }
      }

      int var12 = var2 - 1;
      if(var12 == var1) {
         return var1;
      } else {
         HashSet var13 = new HashSet();
         var13.add(Integer.valueOf(var1));
         HashSet var6 = new HashSet();
         var6.add(Integer.valueOf(var1));

         while(!var13.isEmpty()) {
            HashSet var7 = new HashSet();
            Iterator var8 = var13.iterator();

            while(var8.hasNext()) {
               int var9 = ((Integer)var8.next()).intValue();
               Iterator var10 = this.LH.wU(var9).iterator();

               while(var10.hasNext()) {
                  int var11 = ((Integer)var10.next()).intValue();
                  if(var11 >= var1 && var11 <= var12 && !var6.contains(Integer.valueOf(var11))) {
                     var7.add(Integer.valueOf(var11));
                  }
               }
            }

            var6.addAll(var13);
            var13 = var7;
         }

         for(int var14 = var1; var14 <= var12; ++var14) {
            if(!var6.contains(Integer.valueOf(var14))) {
               return var14 - 1;
            }
         }

         return var12;
      }
   }

   private void fa() {
      List var1 = this.OK.KK.ld();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Qa var3 = (Qa)var2.next();
         this.mS.dN(var3.dN(), (II)var3);
      }

      TreeMap var7 = this.QE.wU();
      Iterator var8 = var1.iterator();

      while(var8.hasNext()) {
         Qa var4 = (Qa)var8.next();
         int var5 = var4.dN();
         Integer var6 = (Integer)var7.get(Integer.valueOf(var5));
         if(var6 != null) {
            var4.dN(var6.intValue());
         }
      }

   }

   private void dN(EG var1) {
      this.rK = 1;
      this.Ux = this.fa.size() + 1;
      this.ZY = new Stack();
      this.s = new Stack();

      while(true) {
         for(; this.rK < this.Ux; ++this.rK) {
            EG var3;
            if(this.Hw.containsKey(Integer.valueOf(this.rK))) {
               wB var2 = (wB)this.Hw.get(Integer.valueOf(this.rK));
               var3 = new EG();
               SP var4 = new SP(var3);
               var1.dN((II)var4);
               this.ZY.push(var1);
               this.s.push(Integer.valueOf(this.Ux));
               int var5;
               eO var6;
               HI var7;
               sX var8;
               EG var19;
               if(!var2.wU) {
                  for(var5 = 0; var5 < var2.QE.size(); ++var5) {
                     var6 = (eO)var2.QE.get(var5);
                     var7 = null;
                     if(var6.wU != null) {
                        var8 = (sX)var6.wU.dN(this.OK);
                        var7 = var8.dN();
                     }

                     var19 = new EG();
                     var4.dN(var6.QE, var7, var19);
                     ft var9 = (ft)this.fa.get(((Integer)this.KK.get(Integer.valueOf(var6.dN))).intValue() - 1);
                     xS var10 = (xS)var9.dN(0);
                     int var11 = var10.dN();
                     if(var10.wU() == Qz.OK) {
                        var11 += var10.ld();
                     }

                     Qa var12 = this.mS.Hv().dN(var11, "label_" + var11);
                     var19.dN((II)(new KO(var12)));
                  }
               } else {
                  for(var5 = var2.QE.size() - 1; var5 >= 0; --var5) {
                     var6 = (eO)var2.QE.get(var5);
                     var7 = null;
                     if(var6.wU != null) {
                        var8 = (sX)var6.wU.dN(this.OK);
                        var7 = var8.dN();
                     }

                     var19 = new EG();
                     var4.dN(var6.QE, var7, var19);
                     this.ZY.push(var19);
                     this.s.push(Integer.valueOf(var6.ld + 1));
                  }
               }

               var1 = var3;
               this.Ux = var2.ld + 1;
            }

            if(this.cb.containsKey(Integer.valueOf(this.rK))) {
               Dc.vd var13 = (Dc.vd)this.cb.get(Integer.valueOf(this.rK));
               lk var16;
               if(var13.ld == Dc.lX.ld) {
                  var3 = new EG();
                  var16 = new lk(new Gy((Xf)null, kn.Hw, this.ld.wU.dN(true)));
                  jM var17 = new jM(var3, var16);
                  var1.dN((II)var17);
                  this.ZY.push(var1);
                  this.s.push(Integer.valueOf(this.Ux));
                  var1 = var3;
                  this.Ux = Math.min(var13.dN + 1, ((Integer)this.s.peek()).intValue());
               } else {
                  var3 = new EG();
                  var16 = new lk(new Gy((Xf)null, kn.Hw, this.ld.wU.dN(true)));
                  zn var18 = new zn(var16, var3);
                  var1.dN((II)var18);
                  this.ZY.push(var1);
                  this.s.push(Integer.valueOf(this.Ux));
                  var1 = var3;
                  this.Ux = Math.min(var13.dN + 1, ((Integer)this.s.peek()).intValue());
               }
            }

            ft var14 = (ft)this.fa.get(((Integer)this.KK.get(Integer.valueOf(this.rK))).intValue() - 1);
            this.dN(var14, var1);
            if((this.EO.containsKey(Integer.valueOf(this.rK)) || this.PF.containsKey(Integer.valueOf(this.rK))) && var1.zs() >= 1 && var1.OK() instanceof Dq) {
               this.QE(var14, var1);
            } else if(this.PF.containsKey(Integer.valueOf(this.rK)) && var1.zs() >= 1 && var1.OK() instanceof tE) {
               EG[] var15 = new EG[1];
               if(!this.dN(var14, var1, var15)) {
                  this.ld(var14, var1);
               } else {
                  var1 = var15[0];
               }
            } else {
               this.ld(var14, var1);
            }
         }

         if(this.ZY.isEmpty()) {
            return;
         }

         var1 = (EG)this.ZY.pop();
         this.Ux = ((Integer)this.s.pop()).intValue();
      }
   }

   private void dN(ft var1, EG var2) {
      Iterator var3 = var1.wU().iterator();

      while(var3.hasNext()) {
         xS var4 = (xS)var3.next();
         II var5 = var4.dN(this.OK);
         if(var5 != null && !(var5 instanceof sX)) {
            var2.dN(var5);
         }
      }

   }

   private void ld(ft var1, EG var2) {
      if(var1.KK() >= 1) {
         xS var3 = (xS)var1.QE();
         int var4 = var3.dN() + var3.ld();
         Qa var5 = this.mS.Hv().dN(var4, "label_" + var4);
         KO var6 = new KO(var5);
         var2.dN((II)var6);
      }

   }

   private boolean dN(ft var1, EG var2, EG[] var3) {
      tE var4 = (tE)var2.OK();
      Dc.uK var5 = (Dc.uK)this.PF.get(Integer.valueOf(this.rK));
      List var6 = this.LH.QE(this.rK);
      int var7 = this.rK + 1;
      if(!var6.contains(Integer.valueOf(var7))) {
         return false;
      } else {
         ft var8 = (ft)this.fa.get(((Integer)this.KK.get(Integer.valueOf(var7))).intValue() - 1);
         if(var1.KK() == 2 && var1.PF().contains(var8)) {
            boolean var9 = var1.QE(0) == var8;
            EG var10 = var4.QE(0);
            int var11 = ((xS)var1.QE(0).dN(0)).dN();
            Qa var12 = this.mS.Hv().dN(var11, "label_" + var11);
            KO var13 = new KO(var12);
            if(var6.contains(Integer.valueOf(var5.ld))) {
               if(var9) {
                  var2.dN(var10.LH());
                  var4.ld(0).LH();
                  var10.dN((II)var13);
               } else {
                  var2.dN((II)var13);
               }

               this.ZY.push(var2);
               this.s.push(Integer.valueOf(this.Ux));
               var3[0] = var10;
               this.Ux = Math.min(var5.ld, ((Integer)this.s.peek()).intValue());
            } else {
               EG var14 = new EG();
               var4.dN(var14);
               if(var9) {
                  var14.dN(var10.LH());
                  var4.ld(0).LH();
                  var10.dN((II)var13);
               } else {
                  var14.dN((II)var13);
               }

               ft var15 = (ft)this.fa.get(((Integer)this.KK.get(Integer.valueOf(var5.ld))).intValue() - 1);
               int var16 = ((xS)var15.dN(0)).dN();
               Qa var17 = this.mS.Hv().dN(var16, "label_" + var16);
               KO var18 = new KO(var17);
               var2.dN((II)var18);
               int var19 = ((Integer)var6.get(0)).intValue();
               int var20 = ((Integer)var6.get(1)).intValue();
               int var21;
               if(var19 == var5.dN + 1) {
                  var21 = var20;
               } else {
                  if(var20 != var5.dN + 1) {
                     throw new RuntimeException();
                  }

                  var21 = var19;
               }

               this.ZY.push(var2);
               this.s.push(Integer.valueOf(this.Ux));
               this.ZY.push(var14);
               this.s.push(Integer.valueOf(Math.min(var5.ld, ((Integer)this.s.peek()).intValue())));
               var3[0] = var10;
               this.Ux = Math.min(var21, ((Integer)this.s.peek()).intValue());
            }

            return true;
         } else {
            throw new RuntimeException();
         }
      }
   }

   private boolean QE(ft var1, EG var2) {
      Dq var3 = (Dq)var2.OK();
      Dc.uK var4 = (Dc.uK)this.EO.get(Integer.valueOf(this.rK));
      if(var4 == null) {
         var4 = (Dc.uK)this.PF.get(Integer.valueOf(this.rK));
      }

      List var5 = this.LH.QE(this.rK);
      int var6 = -1;
      ft var7 = (ft)this.fa.get(((Integer)this.KK.get(Integer.valueOf(var4.ld))).intValue() - 1);
      int var10;
      if(var1.QE(0) != var7) {
         var3.dN(new EG());
         ft var8 = var1.QE(0);
         Iterator var9 = var5.iterator();

         while(var9.hasNext()) {
            var10 = ((Integer)var9.next()).intValue();
            if(this.fa.get(((Integer)this.KK.get(Integer.valueOf(var10))).intValue() - 1) == var8) {
               var6 = var10;
               break;
            }
         }
      }

      Collections.sort(var5);
      int var18;
      if(!var5.isEmpty()) {
         var18 = ((Integer)var5.get(var5.size() - 1)).intValue();
         if(var18 >= var4.ld) {
            int var10000 = var4.ld;
         }
      }

      this.ZY.push(var2);
      this.s.push(Integer.valueOf(this.Ux));
      var18 = this.ZY.size();

      for(int var19 = 0; var19 < var5.size(); ++var19) {
         var10 = ((Integer)var5.get(var19)).intValue();
         ft var11 = (ft)this.fa.get(((Integer)this.KK.get(Integer.valueOf(var10))).intValue() - 1);
         int var12 = ((xS)var11.dN(0)).dN();
         EG var13 = null;
         Iterator var14 = var3.OK().iterator();

         while(var14.hasNext()) {
            EG var15 = (EG)var14.next();
            KO var16 = (KO)var15.ld(0);
            int var17 = var16.dN().dN();
            if(var12 == var17) {
               var13 = var15;
               break;
            }
         }

         int var20 = var19 + 1 < var5.size()?((Integer)var5.get(var19 + 1)).intValue():var4.ld;
         if(var13 != null) {
            this.ZY.add(var18, var13);
            this.s.add(var18, Integer.valueOf(var20));
         } else if(var6 == var10) {
            this.ZY.add(var18, var3.KK());
            this.s.add(var18, Integer.valueOf(var20));
         }
      }

      this.Ux = -1;
      return true;
   }

   public static boolean dN(Class var0) {
      boolean var1 = false;

      try {
         Object var2 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 107, 15, 72, 83, 66}, 2, 143)).getMethod(rP.dN(new byte[]{36, 10, 4, 41, 0, 6, 19, 13, 23, 84, 65, 12, 71, 100, 94, 84, 88, 90, 66}, 2, 76), new Class[0]).invoke(var0, new Object[0]);
         Object var3 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13}, 2, 17)).getMethod(rP.dN(new byte[]{99, 2, 17, 55, 44, 11, 1, 54, 60, 26, 7, 17, 6}, 1, 4), new Class[0]).invoke(var2, new Object[0]);
         Object var4 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86}, 2, 38)).getMethod(rP.dN(new byte[]{28, 2, 17, 56, 35, 12, 2, 21, 29, 6, 1}, 1, 123), new Class[0]).invoke(var3, new Object[0]);
         Object var5 = Class.forName(rP.dN(new byte[]{-86, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 30}, 1, 192)).getMethod(rP.dN(new byte[]{-61, 27, 58, 7, 27}, 1, 183), new Class[0]).invoke(var4, new Object[0]);
         Object var6 = Class.forName(rP.dN(new byte[]{1, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9}, 1, 107)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{91, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 27}, 1, 49))}).newInstance(new Object[]{var5});
         var1 = dN(var6, var0);
      } catch (Exception var7) {
         ;
      }

      return var1;
   }

   private static boolean dN(Object var0, Class var1) {
      boolean var2 = false;

      try {
         Object var3 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 138)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6}, 2, 75)), Boolean.TYPE}).newInstance(new Object[]{var0, Boolean.valueOf(true)});
         byte[] var4 = new byte[4096];
         String var5 = var1.getName().replace('.', '/') + ".class";
         Object var6 = Class.forName(rP.dN(new byte[]{102, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 12)).getMethod(rP.dN(new byte[]{65, 2, 17, 49, 43, 26, 6, 11}, 1, 38), new Class[]{String.class}).invoke(var3, new Object[]{var5});
         Object var7 = Class.forName(rP.dN(new byte[]{-21, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 129)).getMethod(rP.dN(new byte[]{36, 10, 4, 48, 28, 25, 18, 28, 39, 84, 90, 6, 72, 77}, 2, 192), new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 82, 10, 89, 14, 107, 80, 73, 118, 66, 84, 64, 73}, 2, 125))}).invoke(var3, new Object[]{var6});
         Method var8 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 61, 78, 88, 22, 93, 115, 69, 75, 92, 82, 65}, 2, 248)).getMethod(rP.dN(new byte[]{-127, 23, 4, 5}, 1, 243), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});

         while(true) {
            if(((Integer)var8.invoke(var7, new Object[]{var4, Integer.valueOf(0), Integer.valueOf(var4.length)})).intValue() == -1) {
               Object[] var9 = (Object[])((Object[])Class.forName(rP.dN(new byte[]{74, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 55, 43, 26, 6, 11}, 1, 32)).getMethod(rP.dN(new byte[]{57, 2, 17, 55, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17, 22}, 1, 94), new Class[0]).invoke(var6, new Object[0]));
               Object var10 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 82, 92, 75, 71, 2, 99, 87, 66, 69, 90, 74, 73, 44, 19, 21, 6}, 2, 167)).getMethod(rP.dN(new byte[]{36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26}, 2, 190), new Class[0]).invoke(var9[0], new Object[0]);
               Object var11 = Class.forName(rP.dN(new byte[]{-25, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28}, 1, 141)).getMethod(rP.dN(new byte[]{36, 10, 4, 52, 29, 13, 18, 4, 1, 83}, 2, 68), new Class[0]).invoke(var10, new Object[0]);
               var2 = var11.toString().substring(10).substring(15, 30).equals(rP.dN(new byte[]{-103, 8, 3, 7, 2, 5, 2, 3, 4, 0, 0, 5, 5, 1, 14}, 1, 160));
               Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 84)).getMethod(rP.dN(new byte[]{32, 3, 31, 10, 23}, 2, 241), new Class[0]).invoke(var3, new Object[0]);
               break;
            }
         }
      } catch (Exception var12) {
         ;
      }

      return var2;
   }
}
