package jebglobal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import jebglobal.AR;
import jebglobal.CZ;
import jebglobal.Dq;
import jebglobal.Dw;
import jebglobal.EG;
import jebglobal.Fu;
import jebglobal.Gy;
import jebglobal.HI;
import jebglobal.IF;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.Je;
import jebglobal.KO;
import jebglobal.Np;
import jebglobal.OX;
import jebglobal.Oq;
import jebglobal.PZ;
import jebglobal.Pi;
import jebglobal.Qa;
import jebglobal.RT;
import jebglobal.Rx;
import jebglobal.SP;
import jebglobal.TM;
import jebglobal.XM;
import jebglobal.Xf;
import jebglobal.Ya;
import jebglobal.Yx;
import jebglobal.aZ;
import jebglobal.am;
import jebglobal.cq;
import jebglobal.gl;
import jebglobal.h;
import jebglobal.hV;
import jebglobal.hs;
import jebglobal.jK;
import jebglobal.jM;
import jebglobal.kd;
import jebglobal.kn;
import jebglobal.lP;
import jebglobal.lk;
import jebglobal.mi;
import jebglobal.rY;
import jebglobal.rj;
import jebglobal.tE;
import jebglobal.tP;
import jebglobal.vE;
import jebglobal.wD;
import jebglobal.wJ;
import jebglobal.wm;
import jebglobal.wz;
import jebglobal.yF;
import jebglobal.yg;
import jebglobal.zd;
import jebglobal.zn;

public final class b {
   private static final long LK = 844563159190538443L;
   private Fu dN;
   private AR ld;
   private hV.uK QE;
   private OX.vd wU;
   private kn.vd fa;
   private boolean zs;
   private boolean mS;
   private boolean OK;
   private boolean LH;
   private boolean KK;
   private boolean EO;

   private static void ld() {
      if(Thread.interrupted()) {
         throw new RuntimeException("Optimizer interrupted");
      }
   }

   public b(Yx var1, Fu var2) {
      if(var1 != null && var2 != null) {
         this.dN = var2;
         this.ld = var1.dN();
         this.QE = var1.ld();
         this.wU = var1.wU();
         this.fa = var1.QE();
         this.zs = true;
         this.mS = true;
         this.OK = true;
         this.LH = true;
         this.KK = true;
         this.EO = true;
      } else {
         throw new RuntimeException();
      }
   }

   public void dN(boolean var1) {
      this.zs = var1;
   }

   public void ld(boolean var1) {
      this.mS = var1;
   }

   public void QE(boolean var1) {
      this.OK = var1;
   }

   public void wU(boolean var1) {
      this.LH = var1;
   }

   public void fa(boolean var1) {
      this.KK = var1;
   }

   public void zs(boolean var1) {
      this.EO = var1;
   }

   public int dN() {
      this.dN.Ee();
      int var1 = 0;

      int var2;
      do {
         int var3;
         do {
            while(!this.dN.ci()) {
               ld();
               var3 = this.zs(this.dN);
               var2 = 0 + var3;
               var3 = this.wU(this.dN);
               var2 += var3;
               var3 = this.wU(this.dN.VX());
               var2 += var3;
               var3 = this.fa(this.dN.VX());
               var2 += var3;
               var3 = this.zs(this.dN.VX());
               var2 += var3;
               var3 = this.mS(this.dN.VX());
               var2 += var3;
               var3 = this.OK(this.dN.VX());
               var2 += var3;
               var3 = this.LH(this.dN.VX());
               var2 += var3;
               var3 = this.KK(this.dN.VX());
               var2 += var3;
               var3 = this.EO(this.dN.VX());
               var2 += var3;
               var3 = this.cb(this.dN.VX());
               var2 += var3;
               var3 = this.PF(this.dN.VX());
               var2 += var3;
               var3 = this.Hw(this.dN.VX());
               var2 += var3;
               var3 = this.rK(this.dN.VX());
               var2 += var3;
               var3 = this.Ux(this.dN.VX());
               var2 += var3;
               var3 = this.fa(this.dN);
               var2 += var3;
               var3 = this.ZY(this.dN.VX());
               var2 += var3;
               var3 = this.s(this.dN.VX());
               var2 += var3;
               var1 += var2;
               if(var2 <= 0) {
                  break;
               }
            }

            if(this.dN.ci()) {
               break;
            }

            ld();
            var3 = this.Hv(this.dN.VX());
            var2 = 0 + var3;
            var3 = this.dN((IK)this.dN);
            var2 += var3;
            var3 = this.dN(this.dN);
            var2 += var3;
            var3 = this.QE(this.dN);
            var2 += var3;
            var3 = this.dN(this.dN.VX());
            var2 += var3;
            var3 = this.ld(this.dN.VX());
            var2 += var3;
            var1 += var2;
         } while(var2 > 0);

         ld();
         var2 = 0;
         if(this.zs) {
            var3 = this.VX(this.dN.VX());
            var2 = 0 + var3;
            var3 = this.ci(this.dN.VX());
            var2 += var3;
         }

         if(this.mS) {
            var3 = this.bG(this.dN.VX());
            var2 += var3;
         }

         if(this.OK) {
            var3 = this.BQ(this.dN.VX());
            var2 += var3;
         }

         if(this.LH) {
            var3 = this.Ee(this.dN.VX());
            var2 += var3;
         }

         if(this.KK) {
            var3 = this.De(this.dN.VX());
            var2 += var3;
         }

         if(this.EO) {
            var3 = this.rn(this.dN.VX());
            var2 += var3;
         }

         var3 = this.QE(this.dN.VX());
         var2 += var3;
         var3 = this.zs(this.dN);
         var2 += var3;
         var1 += var2;
      } while(var2 > 0);

      this.ld(this.dN);
      return var1;
   }

   public int dN(Fu var1) {
      int var2 = 0;
      List var3 = var1.BQ();

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         II var5 = (II)var3.get(var4);
         if(var5 instanceof KO) {
            Qa var6 = ((KO)var5).dN();

            for(int var7 = 0; var7 < var3.size() - 1; ++var7) {
               II var8 = (II)var3.get(var7);
               if(var8 == var6) {
                  II var9 = (II)var3.get(var7 + 1);
                  if(!(var9 instanceof cq)) {
                     break;
                  }

                  Xf var10 = ((cq)var9).dN();
                  if(var10 == null) {
                     var3.set(var4, new cq((Xf)null));
                     ++var2;
                     break;
                  }

                  if(var10 instanceof OX || var10 instanceof HI) {
                     var3.set(var4, new cq(var10));
                     ++var2;
                  }
                  break;
               }
            }
         }
      }

      if(var2 > 0) {
         var1.dN(var3);
      }

      return var2;
   }

   public int ld(Fu var1) {
      int var2 = 0;
      HashMap var3 = new HashMap();
      ArrayList var4 = new ArrayList();
      List var5 = var1.BQ();

      int var6;
      class 1StmInfo {
         HI dN;
         HashSet ld;
      }

      for(var6 = 0; var6 < var5.size(); ++var6) {
         II var7 = (II)var5.get(var6);
         1StmInfo var8 = new 1StmInfo();
         var3.put(var7, var8);
         if(var7 instanceof XM) {
            XM var9 = (XM)var7;
            if(var9.dN() && var9.OK() instanceof wm) {
               HI var10 = ((wm)var9.OK()).zs();
               var8.dN = var10;
               var4.add(var10);
            }
         }

         if(!(var7 instanceof yF)) {
            var8.ld = this.dN(var7);
         }
      }

      Iterator var18 = var4.iterator();

      while(var18.hasNext()) {
         HI var19 = (HI)var18.next();
         int var20 = -1;
         boolean var21 = false;
         ArrayDeque var11 = new ArrayDeque();
         int var12 = -1;
         int var13 = -1;
         byte var14 = -1;

         II var15;
         for(var6 = 0; var6 < var5.size(); ++var6) {
            var15 = (II)var5.get(var6);
            if(var20 < 0) {
               if(var15 instanceof kd) {
                  var11.push((kd)var15);
               } else if(var15 instanceof RT) {
                  var11.pop();
               }
            } else if(var15 instanceof kd) {
               ++var12;
            } else if(var15 instanceof RT) {
               --var12;
               if(var12 < var13 && var21) {
                  var21 = false;
               }
            }

            1StmInfo var16 = (1StmInfo)var3.get(var15);
            if(var16 != null) {
               if(var16.dN == var19) {
                  var20 = var6;
                  var21 = true;
                  var12 = var11.size();
                  var13 = var12;
               }

               if(var16.ld != null && !var21 && var16.ld.contains(var19)) {
                  var14 = 0;
               }
            }
         }

         if(var14 >= 0 && var20 >= 0) {
            var15 = (II)var5.get(var20);
            XM var22 = (XM)var15;
            wm var17 = (wm)var22.OK();
            var22.dN((Rx)var17.zs());
            var5.add(1, var17);
            ++var2;
         }
      }

      if(var2 > 0) {
         var1.dN(var5);
      }

      return var2;
   }

   private HashSet dN(II var1) {
      HashSet var2 = new HashSet();
      this.dN((IK)var1, (HashSet)var2);
      return var2;
   }

   private void dN(IK var1, HashSet var2) {
      Iterator var3 = var1.wU().iterator();

      while(var3.hasNext()) {
         IK var4 = (IK)var3.next();
         if(!(var4 instanceof zd) && !(var4 instanceof Fu) && !(var4 instanceof Dw)) {
            if(var4 instanceof HI) {
               var2.add((HI)var4);
            }

            this.dN(var4, var2);
         }
      }

   }

   public int QE(Fu var1) {
      if(var1.ci()) {
         return 0;
      } else {
         II var2 = var1.bG();
         if(var2 instanceof cq) {
            cq var3 = (cq)var2;
            if(var3.ld()) {
               var1.ld((II)var3);
               return 1;
            }
         }

         return 0;
      }
   }

   public int dN(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         if(var4 instanceof cq) {
            II var5 = TM.dN(var1, var3 + 1);
            if(var5 instanceof cq && this.dN.ld(var5)) {
               ++var2;
            }
         }

         EG var6;
         if(var4 instanceof wz) {
            for(Iterator var7 = ((wz)var4).dN().iterator(); var7.hasNext(); var2 += this.dN(var6)) {
               var6 = (EG)var7.next();
            }
         }
      }

      return var2;
   }

   public int ld(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof cq && !((cq)var4).ld() && var3 >= 1 && var1.ld(var3 - 1) instanceof XM) {
               XM var5 = (XM)((XM)var1.ld(var3 - 1));
               Rx var6 = var5.OK();
               if(var6 instanceof HI) {
                  Xf var7 = ((cq)var4).dN();
                  if(var7 == var6) {
                     ((cq)var4).dN(var5.LH());
                     var1.wU(var3 - 1);
                     ++var2;
                     continue;
                  }
               }
            }

            EG var9;
            if(var4 instanceof wz) {
               for(Iterator var8 = ((wz)var4).dN().iterator(); var8.hasNext(); var2 += this.ld(var9)) {
                  var9 = (EG)var8.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   public int wU(Fu var1) {
      int var2 = 0;
      List var3 = var1.BQ();
      int var4 = 0;

      while(true) {
         label84:
         while(var4 < var3.size()) {
            II var5 = (II)var3.get(var4);
            if(var5 instanceof KO) {
               Qa var6 = ((KO)var5).dN();
               boolean var7 = true;
               int var8 = var4 + 1;

               label79:
               while(true) {
                  while(true) {
                     while(true) {
                        if(var8 >= var3.size()) {
                           break label79;
                        }

                        II var9 = (II)var3.get(var8);
                        if(var7 && var9 instanceof KO) {
                           var3.remove(var8);
                           ++var2;
                           continue label84;
                        }

                        if(var9 == var6) {
                           var3.remove(var4);
                           ++var2;
                           continue label84;
                        }

                        if(!(var9 instanceof kd) && !(var9 instanceof RT)) {
                           if(!(var9 instanceof Qa) && !(var9 instanceof Ya) && (!(var9 instanceof aZ) || !((aZ)var9).dN().zs()) && (!(var9 instanceof h) || !((h)var9).dN().zs()) && !(var9 instanceof rj) && !(var9 instanceof wJ) && !(var9 instanceof tP)) {
                              if(!(var9 instanceof gl) && !(var9 instanceof hs) && !(var9 instanceof Je) && !(var9 instanceof IF)) {
                                 break label79;
                              }

                              var7 = false;
                              var8 = yF.dN(var3, var8);
                           } else {
                              var7 = false;
                              ++var8;
                           }
                        } else {
                           ++var8;
                        }
                     }
                  }
               }
            }

            ++var4;
         }

         if(var2 > 0) {
            var1.dN(var3);
         }

         return var2;
      }
   }

   public int QE(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         if(var4 instanceof zn || var4 instanceof jM || var4 instanceof am) {
            Qa var5 = null;
            Qa var6 = null;
            EG var7 = null;
            II var8 = TM.dN(this.dN, var4);
            if(var8 instanceof Qa) {
               var5 = (Qa)var8;
            }

            if(var4 instanceof zn) {
               zn var9 = (zn)var4;
               if(var3 >= 1 && var1.ld(var3 - 1) instanceof Qa) {
                  var6 = (Qa)var1.ld(var3 - 1);
               } else if(var9.zs().zs() && var9.mS().zs() >= 1 && var9.mS().ld(0) instanceof Qa) {
                  var6 = (Qa)var9.mS().ld(0);
               }

               var7 = var9.mS();
            } else if(var4 instanceof jM) {
               jM var12 = (jM)var4;
               if(var12.zs().zs() >= 1 && var12.zs().OK() instanceof Qa) {
                  var6 = (Qa)var12.zs().OK();
               } else if(var12.mS().zs() && var12.zs().zs() >= 1 && var12.zs().ld(0) instanceof Qa) {
                  var6 = (Qa)var12.zs().ld(0);
               }

               var7 = var12.zs();
            } else if(var4 instanceof am) {
               am var13 = (am)var4;
               var7 = var13.LH();
            }

            if(var5 != null || var6 != null) {
               var2 += this.dN(var7, var7, var5, var6);
            }
         }

         EG var11;
         if(var4 instanceof wz) {
            for(Iterator var10 = ((wz)var4).dN().iterator(); var10.hasNext(); var2 += this.QE(var11)) {
               var11 = (EG)var10.next();
            }
         }
      }

      return var2;
   }

   private int dN(EG var1, EG var2, Qa var3, Qa var4) {
      int var5 = 0;
      int var6 = 0;

      for(int var7 = var2.zs() - 1; var6 <= var7; ++var6) {
         II var8 = var2.ld(var6);
         if(var8 instanceof KO) {
            Qa var12 = ((KO)var8).dN();
            if(var12 == var3) {
               var2.ld(var6, new yg((Qa)null));
               ++var5;
            } else if(var12 == var4) {
               if(var6 == var7 && var2 == var1) {
                  var2.wU(var6);
               } else {
                  var2.ld(var6, new PZ((Qa)null));
               }

               ++var5;
            }
         } else if(var8 instanceof wz) {
            boolean var9 = var8 instanceof zn || var8 instanceof jM || var8 instanceof am || var8 instanceof Dq;
            EG var11;
            if(!var9) {
               for(Iterator var10 = ((wz)var8).dN().iterator(); var10.hasNext(); var5 += this.dN(var1, var11, var3, var4)) {
                  var11 = (EG)var10.next();
               }
            }
         }
      }

      return var5;
   }

   public int wU(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            EG var6;
            if(var4 instanceof wz) {
               for(Iterator var5 = ((wz)var4).dN().iterator(); var5.hasNext(); var2 += this.wU(var6)) {
                  var6 = (EG)var5.next();
               }
            }

            if(var4 instanceof zn) {
               zn var12 = (zn)var4;
               if(var12.zs().zs()) {
                  var6 = var12.mS();
                  if(var6.zs() >= 2 && var6.ld(0) instanceof Qa && var6.OK() instanceof KO) {
                     KO var7 = (KO)var6.OK();
                     if(var7.dN() == var6.ld(0)) {
                        var6.LH();
                        ++var2;
                        continue;
                     }
                  }
               }
            }

            if(var4 instanceof tE && var3 + 1 < var1.zs()) {
               tE var13 = (tE)var4;
               II var14 = var1.ld(var3 + 1);
               if(var14 instanceof KO) {
                  Qa var15 = ((KO)var14).dN();
                  int var8 = this.dN(var13, var15);
                  var2 += var8;
                  if(var8 == 0 && var13.mS()) {
                     boolean var9 = true;
                     Iterator var10 = var13.dN().iterator();

                     label58: {
                        EG var11;
                        do {
                           if(!var10.hasNext()) {
                              break label58;
                           }

                           var11 = (EG)var10.next();
                        } while(var11.zs() >= 1 && var11.OK() instanceof KO);

                        var9 = false;
                     }

                     if(var9) {
                        var1.wU(var3 + 1);
                        ++var2;
                        continue;
                     }
                  }
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   private int dN(tE var1, Qa var2) {
      int var3 = 0;
      Iterator var4 = var1.dN().iterator();

      while(var4.hasNext()) {
         EG var5 = (EG)var4.next();
         II var6;
         if(var5.zs() >= 1) {
            var6 = var5.OK();
            if(var6 instanceof KO && ((KO)var6).dN() == var2) {
               var5.LH();
               ++var3;
            }
         }

         if(var5.zs() >= 1) {
            var6 = var5.OK();
            if(var6 instanceof tE) {
               var3 += this.dN((tE)var6, var2);
            }
         }
      }

      return var3;
   }

   public int fa(Fu var1) {
      HashMap var3 = new HashMap();
      int var2 = 0 + this.dN(var1.VX(), var3);
      var2 += this.ld(var1.VX(), var3);
      return var2;
   }

   private int dN(EG var1, HashMap var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < var1.zs(); ++var4) {
         II var5 = var1.ld(var4);
         EG var7;
         if(var5 instanceof wz) {
            for(Iterator var6 = ((wz)var5).dN().iterator(); var6.hasNext(); var3 += this.dN(var7, var2)) {
               var7 = (EG)var6.next();
            }
         }

         if(var5 instanceof Qa) {
            Qa var10 = null;

            int var11;
            for(var11 = var4 + 1; var11 < var1.zs(); ++var11) {
               II var8 = var1.ld(var11);
               if(!(var8 instanceof Qa)) {
                  break;
               }

               var10 = (Qa)var8;
            }

            if(var10 != null) {
               int var12 = var11 - var4 - 1;

               for(int var9 = 0; var9 < var12; ++var9) {
                  var2.put((Qa)var1.ld(var4), var10);
                  var1.wU(var4);
               }

               var3 += var12;
            }
         }
      }

      return var3;
   }

   private int ld(EG var1, HashMap var2) {
      int var3 = 0;

      for(int var4 = 0; var4 < var1.zs(); ++var4) {
         II var5 = var1.ld(var4);
         EG var7;
         if(var5 instanceof wz) {
            for(Iterator var6 = ((wz)var5).dN().iterator(); var6.hasNext(); var3 += this.ld(var7, var2)) {
               var7 = (EG)var6.next();
            }
         }

         if(var5 instanceof KO) {
            KO var9 = (KO)var5;
            Qa var10 = var9.dN();
            if(var2.containsKey(var10)) {
               Qa var8 = (Qa)var2.get(var10);
               var9.dN(var8);
               ++var3;
            }
         }
      }

      return var3;
   }

   public int zs(Fu var1) {
      int var2 = 0;
      HashMap var3 = new HashMap();
      HashSet var4 = new HashSet();
      List var5 = var1.De();

      for(int var6 = 0; var6 < var5.size(); ++var6) {
         II var7 = (II)var5.get(var6);
         if(var7 instanceof KO) {
            var3.put((KO)var7, ((KO)var7).dN());
         } else if(var7 instanceof Qa) {
            var4.add((Qa)var7);
         }
      }

      Iterator var9 = var4.iterator();

      while(var9.hasNext()) {
         Qa var10 = (Qa)var9.next();
         if(!var3.values().contains(var10)) {
            var1.ld((II)var10);
            ++var2;
         }
      }

      var9 = var3.keySet().iterator();

      while(var9.hasNext()) {
         KO var11 = (KO)var9.next();
         Qa var8 = (Qa)var3.get(var11);
         if(!var4.contains(var8)) {
            var1.ld((II)var11);
            ++var2;
         }
      }

      return var2;
   }

   public int fa(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         if(var4 instanceof wz) {
            if(var4 instanceof tE || var4 instanceof SP && !((SP)var4).LH()) {
               II var5 = TM.dN(var1, var3 + 1);
               if(var5 instanceof Qa) {
                  Iterator var6 = ((wz)var4).dN().iterator();

                  while(var6.hasNext()) {
                     EG var7 = (EG)var6.next();
                     this.dN(var7, (Qa)var5);
                  }
               }
            }

            EG var9;
            for(Iterator var8 = ((wz)var4).dN().iterator(); var8.hasNext(); var2 += this.fa(var9)) {
               var9 = (EG)var8.next();
            }
         }
      }

      return var2;
   }

   private int dN(EG var1, Qa var2) {
      if(var1.zs() == 0) {
         return 0;
      } else {
         int var3 = 0;
         II var4 = var1.OK();
         if(var4 instanceof KO) {
            if(((KO)var4).dN() != var2) {
               return 0;
            }

            var1.LH();
            ++var3;
            if(var1.zs() == 0) {
               return 1;
            }

            var4 = var1.OK();
         }

         EG var6;
         if(var4 instanceof tE || var4 instanceof SP && !((SP)var4).LH()) {
            for(Iterator var5 = ((wz)var4).dN().iterator(); var5.hasNext(); var3 += this.dN(var6, var2)) {
               var6 = (EG)var5.next();
            }
         }

         return var3;
      }
   }

   public int zs(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         if(var4 instanceof wz) {
            if(var4 instanceof tE && ((tE)var4).mS() || var4 instanceof SP && !((SP)var4).LH()) {
               Qa var5 = null;
               boolean var6 = true;
               Iterator var7 = ((wz)var4).dN().iterator();

               EG var8;
               while(var7.hasNext()) {
                  var8 = (EG)var7.next();
                  if(var8.zs() == 0 || !(var8.OK() instanceof KO)) {
                     var6 = false;
                     break;
                  }

                  Qa var9 = ((KO)var8.OK()).dN();
                  if(var5 == null) {
                     var5 = var9;
                  } else if(var9 != var5) {
                     var6 = false;
                     break;
                  }
               }

               if(var6 && var5 != null) {
                  var7 = ((wz)var4).dN().iterator();

                  while(var7.hasNext()) {
                     var8 = (EG)var7.next();
                     var8.LH();
                  }

                  var1.QE(var3 + 1, new KO(var5));
                  ++var2;
               }
            }

            EG var11;
            for(Iterator var10 = ((wz)var4).dN().iterator(); var10.hasNext(); var2 += this.zs(var11)) {
               var11 = (EG)var10.next();
            }
         }
      }

      return var2;
   }

   public int mS(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         if(var4 instanceof jM) {
            jM var5 = (jM)var4;
            II var6 = TM.dN(var1, var3 + 1);
            if(var6 instanceof Qa) {
               Qa var7 = (Qa)var6;
               if(this.dN(var5, var7)) {
                  ++var2;
               }
            }
         }

         EG var9;
         if(var4 instanceof wz) {
            for(Iterator var8 = ((wz)var4).dN().iterator(); var8.hasNext(); var2 += this.mS(var9)) {
               var9 = (EG)var8.next();
            }
         }
      }

      return var2;
   }

   private boolean dN(jM var1, Qa var2) {
      if(!var1.mS().zs()) {
         return false;
      } else {
         EG var3 = var1.zs();
         if(var3.zs() < 3) {
            return false;
         } else if(!(var3.ld(0) instanceof Qa)) {
            return false;
         } else {
            Qa var4 = (Qa)var3.ld(0);
            if(!(var3.ld(var3.zs() - 1) instanceof KO)) {
               return false;
            } else {
               KO var5 = (KO)var3.ld(var3.zs() - 1);
               if(var5.dN() != var2) {
                  return false;
               } else if(!(var3.ld(var3.zs() - 2) instanceof tE)) {
                  return false;
               } else {
                  tE var6 = (tE)var3.ld(var3.zs() - 2);
                  if(var6.LH() != 1) {
                     return false;
                  } else {
                     EG var7 = var6.QE(0);
                     if(var7.zs() == 1 && var7.ld(0) instanceof KO) {
                        KO var9 = (KO)var7.ld(0);
                        if(var9.dN() == var4) {
                           var3.LH();
                           var1.dN(var6.ld(0));
                           var3.LH();
                           return true;
                        } else {
                           return false;
                        }
                     } else {
                        EG var8 = var6.QE(0);
                        var3.dN(var3.zs() - 1, var8);
                        var6.ld(0).LH();
                        var6.dN(0, (EG)(new EG(new KO(var5.dN()))));
                        return true;
                     }
                  }
               }
            }
         }
      }
   }

   public int OK(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         if(var4 instanceof zn) {
            zn var5 = (zn)var4;
            II var6 = TM.dN(this.dN, var4);
            if(var6 instanceof Qa) {
               Qa var7 = (Qa)var6;
               if(this.dN(var1, var3, var5, var7)) {
                  ++var2;
               } else if(this.ld(var1, var3, var5, var7)) {
                  ++var2;
               }
            }
         }

         EG var9;
         if(var4 instanceof wz) {
            for(Iterator var8 = ((wz)var4).dN().iterator(); var8.hasNext(); var2 += this.OK(var9)) {
               var9 = (EG)var8.next();
            }
         }
      }

      return var2;
   }

   private boolean dN(EG var1, int var2, zn var3, Qa var4) {
      if(!var3.zs().zs()) {
         return false;
      } else {
         EG var5 = var3.mS();
         if(var5.zs() == 0) {
            return false;
         } else {
            boolean var6 = false;

            int var7;
            Qa var8;
            for(var7 = 0; var7 <= 1 && var7 < var5.zs(); ++var7) {
               var8 = TM.dN(var5.ld(var7));
               if(var8 != null && var7 + 2 < var5.zs() && TM.dN(var5.ld(var7 + 1), var4) && var5.ld(var7 + 2) == var8) {
                  var6 = true;
                  break;
               }
            }

            lk var11;
            lk var12;
            if(var6) {
               if(var7 == 0) {
                  var11 = ((tE)var5.ld(0)).ld(0);
                  var3.dN(var11);
                  var5.wU(0);
                  var5.wU(0);
                  return true;
               }

               if(var7 == 1 && var5.ld(0) instanceof Qa) {
                  var8 = (Qa)var5.QE(0);
                  var1.QE(var2, var8);
                  var12 = ((tE)var5.ld(0)).ld(0);
                  var3.dN(var12);
                  var5.wU(0);
                  var5.wU(0);
                  return true;
               }
            }

            if(TM.dN(var5.ld(0)) == var4) {
               var11 = ((tE)var5.ld(0)).ld(0);
               var11.LH();
               var3.dN(var11);
               var5.wU(0);
               return true;
            } else if(var5.zs() >= 2 && var5.ld(0) instanceof Qa && TM.dN(var5.ld(1)) == var4) {
               var8 = (Qa)var5.QE(0);
               var1.QE(var2, var8);
               var12 = ((tE)var5.ld(0)).ld(0);
               var12.LH();
               var3.dN(var12);
               var5.wU(0);
               return true;
            } else {
               tE var9;
               if(var5.zs() == 2 && var5.ld(0) instanceof Qa) {
                  var8 = (Qa)var5.ld(0);
                  if(TM.ld(var5.ld(1))) {
                     var9 = (tE)var5.ld(1);
                     if(var9.OK().zs() == 1 && TM.dN(var9.OK().OK(), var4) && var9.QE(0).zs() >= 1 && TM.dN(var9.QE(0).OK(), var8)) {
                        var5.wU(0);
                        var1.QE(var2, var8);
                        var3.dN(var9.ld(0));
                        var5.wU(0);
                        var9.QE(0).LH();
                        var5.dN(0, (EG)var9.QE(0));
                        return true;
                     }
                  }
               }

               if(var5.zs() == 3 && var5.ld(0) instanceof Qa) {
                  var8 = (Qa)var5.ld(0);
                  if(var5.ld(1) instanceof tE) {
                     var9 = (tE)var5.ld(1);
                     if(var9.LH() == 1 && var9.QE(0).zs() >= 1 && TM.dN(var9.QE(0).OK(), var8) && TM.dN(var5.ld(2), var4)) {
                        var5.wU(0);
                        var1.QE(var2, var8);
                        var3.dN(var9.ld(0));
                        var5.wU(0);
                        var5.wU(0);
                        var9.QE(0).LH();
                        var5.dN(0, (EG)var9.QE(0));
                        return true;
                     }
                  }
               }

               if(var5.zs() == 3 && var5.ld(0) instanceof Qa) {
                  var8 = (Qa)var5.ld(0);
                  if(var5.ld(1) instanceof tE) {
                     var9 = (tE)var5.ld(1);
                     if(var9.LH() == 1 && TM.dN(var5.ld(2), var4)) {
                        var3.dN(var9.ld(0));
                        var5.wU(0);
                        var1.QE(var2, var8);
                        var5.wU(0);
                        var5.dN(0, (EG)var9.QE(0));
                        return true;
                     }
                  }
               }

               if(var5.zs() >= 2 && var5.ld(0) instanceof Qa) {
                  var8 = (Qa)var5.ld(0);
                  if(TM.ld(var5.OK())) {
                     var9 = (tE)var5.OK();
                     if(var9.OK().zs() == 1 && TM.dN(var9.OK().OK(), var4) && var9.QE(0).zs() >= 1 && TM.dN(var9.QE(0).OK(), var8)) {
                        var9.ld(0).LH();
                        EG var10 = var9.QE(0);
                        var9.dN(0, (EG)var9.OK());
                        var9.dN((EG)null);
                        var10.LH();
                        var5.dN(var5.zs(), var10);
                        return true;
                     }
                  }
               }

               return false;
            }
         }
      }
   }

   private boolean ld(EG var1, int var2, zn var3, Qa var4) {
      EG var5 = var3.mS();
      if(var5.zs() == 0) {
         return false;
      } else if(var2 >= 1 && var1.ld(var2 - 1) instanceof Qa) {
         if(var5.zs() >= 2) {
            int var6 = var5.zs() - 2;
            if(var5.ld(var6) instanceof tE) {
               tE var7 = (tE)var5.ld(var6);
               if(var7.LH() == 1 && TM.dN(var5.ld(var6 + 1), var4)) {
                  var7.ld(0).LH();
                  var5.dN(var6 + 1, var7.QE(0));
                  var7.QE(0).KK();
                  var7.QE(0).dN((II)(new KO(var4)));
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public int LH(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof tE) {
               tE var5 = (tE)var4;
               if(var5.OK() == null) {
                  int var6 = var5.LH() - 1;
                  if(var5.QE(var6).zs() == 1) {
                     II var7 = var5.QE(var6).ld(0);
                     if(var7 instanceof tE) {
                        tE var8 = (tE)var7;
                        if(var8.LH() == 1) {
                           lk var9 = new lk(var5.ld(var6), kn.ZY, var8.ld(0));
                           var5.dN(var6, var9);
                           var5.dN(var6, var8.QE(0));
                           ++var2;
                           continue;
                        }
                     }
                  }
               }
            }

            EG var11;
            if(var4 instanceof wz) {
               for(Iterator var10 = ((wz)var4).dN().iterator(); var10.hasNext(); var2 += this.LH(var11)) {
                  var11 = (EG)var10.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   public int KK(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof tE && var3 + 1 < var1.zs() && var1.ld(var3 + 1) instanceof Qa) {
               tE var5 = (tE)var4;
               Qa var6 = (Qa)var1.ld(var3 + 1);
               if(var5.LH() == 1 && var5.QE(0).zs() >= 1) {
                  II var7 = var5.QE(0).ld(0);
                  if(var7 instanceof tE) {
                     tE var8 = (tE)var7;
                     if(var8.LH() == 1 && var8.QE(0).zs() == 1) {
                        II var9 = var8.QE(0).ld(0);
                        if(TM.dN(var9, var6)) {
                           var8.ld(0).LH();
                           lk var10 = new lk(var5.ld(0), kn.ZY, var8.ld(0));
                           var5.dN(0, (lk)var10);
                           var5.QE(0).wU(0);
                           ++var2;
                           continue;
                        }
                     }
                  }
               }
            }

            EG var12;
            if(var4 instanceof wz) {
               for(Iterator var11 = ((wz)var4).dN().iterator(); var11.hasNext(); var2 += this.KK(var12)) {
                  var12 = (EG)var11.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   public int EO(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof tE) {
               tE var5 = (tE)var4;
               if(var5.LH() == 2 && var5.mS() && var5.QE(0).zs() == 1) {
                  II var6 = var5.QE(0).ld(0);
                  if(var6 instanceof KO) {
                     Qa var7 = ((KO)var6).dN();
                     if(var5.OK().zs() >= 2) {
                        II var8 = var5.OK().ld(0);
                        II var9 = var5.OK().ld(1);
                        if(var8 instanceof KO && var9 == var7) {
                           var5.OK().wU(0);
                           var1.dN(var3 + 1, var5.OK());
                           var5.dN((EG)null);
                           var5.ld(0).LH();
                           ((KO)var6).dN(((KO)var8).dN());
                           ++var2;
                           continue;
                        }
                     }
                  }
               }
            }

            EG var11;
            if(var4 instanceof wz) {
               for(Iterator var10 = ((wz)var4).dN().iterator(); var10.hasNext(); var2 += this.EO(var11)) {
                  var11 = (EG)var10.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   public int cb(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof tE) {
               tE var5 = (tE)var4;
               if(var5.LH() >= 2 && var5.OK() != null) {
                  int var6 = var5.LH() - 2;
                  if(var5.QE(var6).zs() == 1 && var5.QE(var6).ld(0) instanceof tE && (var5.OK().zs() != 1 || !(var5.OK().ld(0) instanceof tE))) {
                     EG var13 = var5.QE(var6);
                     EG var14 = var5.OK();
                     var5.ld(var6).LH();
                     var5.dN(var6, var14);
                     var5.dN(var13);
                     ++var2;
                     continue;
                  }

                  if(var5.OK().zs() == 1 && var5.OK().ld(0) instanceof tE) {
                     tE var7 = (tE)var5.OK().ld(0);
                     boolean var8 = var7.OK() != null;
                     int var9 = var7.LH() - (var8?1:0);

                     for(int var10 = 0; var10 < var9; ++var10) {
                        var5.dN(var7.ld(var10), var7.QE(var10));
                     }

                     if(var8) {
                        var5.dN(var7.OK());
                     } else {
                        var5.dN((EG)null);
                     }

                     ++var2;
                     continue;
                  }
               }
            }

            EG var12;
            if(var4 instanceof wz) {
               for(Iterator var11 = ((wz)var4).dN().iterator(); var11.hasNext(); var2 += this.cb(var12)) {
                  var12 = (EG)var11.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   public int PF(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof tE) {
               tE var5 = (tE)var4;
               int var6 = var5.KK();
               if(var6 >= 2) {
                  int var7 = -1;
                  int var8 = -1;
                  HashMap var9 = new HashMap();
                  HashMap var10 = new HashMap();
                  boolean var11 = false;

                  for(int var12 = 0; var12 < var6; ++var12) {
                     EG var13 = var5.QE(var12);
                     if(!var13.mS()) {
                        II var14 = var13.ld(0);
                        Qa var15;
                        if(var14 instanceof Qa) {
                           var15 = (Qa)var14;
                           var9.put(var15, Integer.valueOf(var12));
                           if(var10.keySet().contains(var15)) {
                              var7 = ((Integer)var10.get(var15)).intValue();
                              var8 = var12;
                              var11 = true;
                              break;
                           }
                        } else if(var14 instanceof KO && var13.zs() == 1) {
                           var15 = ((KO)var14).dN();
                           var10.put(var15, Integer.valueOf(var12));
                           if(var9.keySet().contains(var15)) {
                              var7 = ((Integer)var9.get(var15)).intValue();
                              var8 = var12;
                              var11 = false;
                              break;
                           }
                        }
                     }
                  }

                  if(var7 >= 0 && var8 >= 0 && var7 != var8) {
                     lk var18 = new lk(var5.ld(var7), kn.Ux, var5.ld(var8));
                     var5.dN(var7, var18);
                     if(var11) {
                        var5.dN(var7, var5.QE(var8));
                     }

                     var5.wU(var8);
                     ++var2;
                     continue;
                  }
               }
            }

            EG var17;
            if(var4 instanceof wz) {
               for(Iterator var16 = ((wz)var4).dN().iterator(); var16.hasNext(); var2 += this.PF(var17)) {
                  var17 = (EG)var16.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   public int Hw(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof tE) {
               tE var5 = (tE)var4;
               if(var5.LH() == 3 && var5.mS() && var5.QE(0).zs() >= 1 && var5.OK().zs() == 1) {
                  II var6 = TM.dN((EG)var5.QE(0), 0);
                  if(var6 instanceof Qa && TM.dN(var5.OK().ld(0), (Qa)var6)) {
                     var5.ld(1).LH();
                     lk var7 = new lk(var5.ld(0), kn.Ux, var5.ld(1));
                     var5.dN(0, (lk)var7);
                     var5.dN(var5.QE(1));
                     var5.wU(1);
                     ++var2;
                     continue;
                  }
               }
            }

            EG var9;
            if(var4 instanceof wz) {
               for(Iterator var8 = ((wz)var4).dN().iterator(); var8.hasNext(); var2 += this.Hw(var9)) {
                  var9 = (EG)var8.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   public int rK(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof tE) {
               Qa var5 = TM.dN(var4);
               if(var5 != null) {
                  int var6 = -1;

                  int var7;
                  II var8;
                  for(var7 = var3 + 1; var7 < var1.zs(); ++var7) {
                     var8 = var1.ld(var7);
                     if(var8 instanceof KO || var8 instanceof cq || var8 instanceof vE) {
                        var6 = var7;
                        break;
                     }

                     if(var8 instanceof Qa && (Qa)var8 == var5) {
                        var6 = var7 - 1;
                        break;
                     }
                  }

                  if(var6 >= 0) {
                     var8 = TM.dN(var1, var6 + 1);
                     if(var8 instanceof Qa && (Qa)var8 == var5) {
                        ((tE)var4).ld(0).LH();
                        EG var9 = ((tE)var4).QE(0);
                        var9.wU(0);
                        int var10 = var6 + 1 - (var3 + 1);
                        var7 = var3 + 1;

                        while(var10-- > 0) {
                           II var11 = var1.QE(var7);
                           var9.dN(var11);
                        }

                        ++var2;
                        continue;
                     }
                  }
               }
            }

            EG var13;
            if(var4 instanceof wz) {
               for(Iterator var12 = ((wz)var4).dN().iterator(); var12.hasNext(); var2 += this.rK(var13)) {
                  var13 = (EG)var12.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   public int Ux(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         if(var4 instanceof tE && TM.QE(var4)) {
            Qa var5 = null;
            boolean var6 = true;
            Iterator var7 = ((wz)var4).dN().iterator();

            while(var7.hasNext()) {
               EG var8 = (EG)var7.next();
               if(var8.zs() != 0 && var8.OK() instanceof KO) {
                  Qa var9 = ((KO)var8.OK()).dN();
                  if(var5 == null) {
                     var5 = var9;
                     continue;
                  }

                  if(var9 == var5) {
                     continue;
                  }

                  var6 = false;
                  break;
               }

               var6 = false;
               break;
            }

            if(var6 && var5 != null) {
               int var13 = -1;

               int var15;
               for(var15 = var3 + 1; var15 < var1.zs(); ++var15) {
                  II var16 = var1.ld(var15);
                  if(var16 instanceof Qa && var16 == var5) {
                     var13 = var15;
                     break;
                  }

                  if(var16 instanceof wz) {
                     break;
                  }
               }

               if(var13 >= 0) {
                  Iterator var17 = ((wz)var4).dN().iterator();

                  while(var17.hasNext()) {
                     EG var10 = (EG)var17.next();
                     var10.LH();
                  }

                  EG var18 = new EG();
                  ((tE)var4).dN(var18);
                  int var19 = var13 - (var3 + 1);
                  var15 = var3 + 1;

                  while(var19-- > 0) {
                     II var11 = var1.QE(var15);
                     var18.dN(var11);
                  }

                  ++var2;
               }
            }
         }

         EG var14;
         if(var4 instanceof wz) {
            for(Iterator var12 = ((wz)var4).dN().iterator(); var12.hasNext(); var2 += this.Ux(var14)) {
               var14 = (EG)var12.next();
            }
         }
      }

      return var2;
   }

   public int ZY(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         if(var4 instanceof Dq) {
            II var5 = TM.dN(var1, var3 + 1);
            if(var5 instanceof Qa) {
               Dq var6 = (Dq)var4;
               Qa var7 = (Qa)var5;
               Iterator var8 = var6.dN().iterator();

               while(var8.hasNext()) {
                  EG var9 = (EG)var8.next();
                  if(var9.zs() >= 1 && var9.OK() instanceof KO) {
                     KO var10 = (KO)var9.OK();
                     if(var10.dN() == var7) {
                        var9.QE(var9.zs() - 1, new yg((Qa)null));
                        var9.LH();
                        ++var2;
                     }
                  }
               }
            }
         }

         EG var12;
         if(var4 instanceof wz) {
            for(Iterator var11 = ((wz)var4).dN().iterator(); var11.hasNext(); var2 += this.ZY(var12)) {
               var12 = (EG)var11.next();
            }
         }
      }

      return var2;
   }

   public int s(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         if(var4 instanceof XM) {
            XM var5 = (XM)var4;
            Rx var6 = var5.OK();
            if(var6 instanceof HI || var6 instanceof CZ || var6 instanceof Np || var6 instanceof wD) {
               Rx var7 = var5.OK();
               if(var5.dN() && var5.LH() instanceof Gy) {
                  Gy var8 = (Gy)var5.LH();
                  kn var9 = var8.fa();
                  if(var9.mS()) {
                     Xf var10 = null;
                     if(var8.ld().equals(var7)) {
                        var10 = var8.QE();
                     } else if(var8.QE().equals(var7) && (var9 == kn.dN || var9 == kn.QE || var9 == kn.mS || var9 == kn.zs || var9 == kn.OK)) {
                        var10 = var8.ld();
                     }

                     if(var10 != null) {
                        var5.dN(var8.fa(), var10);
                        ++var2;
                     }
                  }
               }

               if(var5.ld() && var5.LH() instanceof OX) {
                  kn var13 = var5.zs();
                  if(var13 == kn.dN || var13 == kn.ld) {
                     OX var14 = (OX)var5.LH();
                     Boolean var15 = null;
                     if(var14.ZY()) {
                        var15 = Boolean.valueOf(var13 == kn.dN);
                     } else if(var14.s()) {
                        var15 = Boolean.valueOf(var13 == kn.ld);
                     }

                     if(var15 != null) {
                        var5.dN(var15.booleanValue(), true);
                        ++var2;
                     }
                  }
               }
            }
         }

         EG var12;
         if(var4 instanceof wz) {
            for(Iterator var11 = ((wz)var4).dN().iterator(); var11.hasNext(); var2 += this.s(var12)) {
               var12 = (EG)var11.next();
            }
         }
      }

      return var2;
   }

   public int Hv(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         Iterator var5;
         if(var4 instanceof tE) {
            var5 = ((tE)var4).zs().iterator();

            while(var5.hasNext()) {
               lk var6 = (lk)var5.next();
               if(var6.OK()) {
                  ++var2;
               }
            }
         } else if(var4 instanceof zn) {
            ((zn)var4).zs().OK();
         } else if(var4 instanceof jM) {
            ((jM)var4).mS().OK();
         } else if(var4 instanceof am) {
            ((am)var4).mS().OK();
         }

         EG var7;
         if(var4 instanceof wz) {
            for(var5 = ((wz)var4).dN().iterator(); var5.hasNext(); var2 += this.Hv(var7)) {
               var7 = (EG)var5.next();
            }
         }
      }

      return var2;
   }

   public int dN(IK var1) {
      if(this.wU == null) {
         return 0;
      } else {
         Set var2 = Collections.newSetFromMap(new IdentityHashMap());
         return this.dN(var1, var2);
      }
   }

   private int dN(IK var1, Set var2) {
      if(var2.contains(var1)) {
         return 0;
      } else {
         var2.add(var1);
         int var3 = 0;
         if(var1 instanceof Gy && this.dN((Gy)var1)) {
            ++var3;
         }

         IK var5;
         for(Iterator var4 = var1.wU().iterator(); var4.hasNext(); var3 += this.dN(var5, var2)) {
            var5 = (IK)var4.next();
         }

         return var3;
      }
   }

   private boolean dN(Gy var1) {
      if(var1.QE() instanceof OX) {
         OX var2 = (OX)var1.QE();
         if(var2.VX()) {
            kn var3 = var1.fa();
            if(var3 == kn.dN || var3 == kn.ld) {
               OX var4 = var2.dN(this.wU);
               if(var4 != null && var1.dN(var2, var4)) {
                  var1.dN(var3 == kn.dN?kn.ld:kn.dN);
                  return true;
               }
            }
         }
      }

      return false;
   }

   public int VX(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof XM) {
               XM var5 = (XM)var4;
               if(var5.LH() instanceof Pi) {
                  Pi var6 = (Pi)var5.LH();
                  if(var6.dN().toString().equals("java.lang.StringBuilder") && this.dN(var1, var3)) {
                     ++var2;
                     ++var3;
                     continue;
                  }
               }
            }

            EG var8;
            if(var4 instanceof wz) {
               for(Iterator var7 = ((wz)var4).dN().iterator(); var7.hasNext(); var2 += this.VX(var8)) {
                  var8 = (EG)var7.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   private boolean dN(EG var1, int var2) {
      XM var3 = (XM)var1.ld(var2);
      Rx var5 = var3.OK();
      HI var4;
      if(var5 instanceof wm) {
         var4 = ((wm)var5).zs();
      } else {
         if(!(var5 instanceof HI)) {
            return false;
         }

         var4 = (HI)var5;
      }

      ArrayList var6 = new ArrayList();
      Pi var7 = (Pi)var3.LH();
      if(!var7.zs().isEmpty()) {
         if(var7.zs().size() != 1) {
            return false;
         }

         Xf var8 = null;
         Xf var9 = (Xf)var7.zs().get(0);
         if(var9 instanceof HI) {
            wm var10 = this.dN.s().dN((HI)var9);
            if(var10 != null) {
               String var11 = var10.ld().toString();
               if(var11.equals("java.lang.String")) {
                  var8 = var9;
               }
            }
         }

         if(var8 == null) {
            return false;
         }

         var6.add(var8);
      }

      ++var2;
      int var15 = 0;

      II var16;
      mi var18;
      for(var16 = null; var2 < var1.zs(); ++var15) {
         var16 = var1.ld(var2);
         HI var17 = null;
         var18 = null;
         if(var16 instanceof XM) {
            XM var12 = (XM)var16;
            if(!var12.dN() || var12.OK() != var4 || !(var12.LH() instanceof mi)) {
               break;
            }

            var17 = (HI)var12.OK();
            var18 = (mi)var12.LH();
         } else if(var16 instanceof mi) {
            var18 = (mi)var16;
         }

         if(var18 == null || !var18.dN().mS().equals("append") || var18.zs() != 2 || var18.mS().get(0) != var4 || var17 != null && var17 != var4) {
            break;
         }

         Xf var20 = (Xf)var18.mS().get(1);
         var6.add(var20);
         ++var2;
      }

      if(var6.isEmpty()) {
         return false;
      } else {
         Object var19 = (Xf)var6.get(0);
         if(var6.size() >= 2) {
            for(int var21 = 1; var21 < var6.size(); ++var21) {
               var19 = new Gy((Xf)var19, kn.dN, (Xf)var6.get(var21));
            }
         }

         if(var16 != null && !(var16 instanceof wz)) {
            var18 = null;
            Iterator var22 = var16.wU().iterator();

            while(var22.hasNext()) {
               IK var13 = (IK)var22.next();
               if(var13 instanceof mi) {
                  var18 = (mi)var13;
                  break;
               }
            }

            if(var18 != null && var18.dN().mS().equals("toString") && var18.mS().size() == 1 && var18.mS().get(0) == var4) {
               try {
                  if(!var16.dN(var18, (IK)var19)) {
                     return false;
                  }
               } catch (ClassCastException var14) {
                  return false;
               }

               var2 -= var15;

               while(var15-- > 0) {
                  var1.wU(var2);
               }

               var1.wU(var2 - 1);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public int ci(EG var1) {
      int var2 = 0;
      HashSet var3 = new HashSet();

      for(int var4 = 0; var4 < var1.zs(); ++var4) {
         II var5 = var1.ld(var4);
         var2 += this.dN((IK)var1, (IK)var5, (HashSet)var3);
      }

      return var2;
   }

   private int dN(IK var1, IK var2, HashSet var3) {
      if(var3.contains(var2)) {
         return 0;
      } else {
         var3.add(var2);
         int var4 = 0;
         if(var2 instanceof mi && this.dN(var1, (mi)var2)) {
            ++var4;
         }

         IK var6;
         for(Iterator var5 = var2.wU().iterator(); var5.hasNext(); var4 += this.dN(var2, var6, var3)) {
            var6 = (IK)var5.next();
         }

         return var4;
      }
   }

   private boolean dN(Fu var1, String var2, String var3) {
      return var1.zs().equals(var2) && var1.mS().equals(var3);
   }

   private boolean dN(IK var1, mi var2) {
      if(!this.dN(var2.dN(), "Ljava/lang/StringBuilder;", "toString")) {
         return false;
      } else {
         ArrayList var3 = new ArrayList();
         ArrayDeque var4 = new ArrayDeque();
         mi var5 = var2;

         while(true) {
            Xf var6 = (Xf)var5.mS().get(0);
            if(!(var6 instanceof mi)) {
               if(!(var6 instanceof Pi)) {
                  return false;
               } else {
                  Pi var7 = (Pi)var6;
                  if(!var7.dN().toString().equals("java.lang.StringBuilder")) {
                     return false;
                  } else {
                     if(!var7.zs().isEmpty()) {
                        if(var7.zs().size() != 1) {
                           return false;
                        }

                        if(this.ld == null) {
                           return false;
                        }

                        int var8 = var7.ld().QE();
                        String var9 = this.ld.mS(var8).OK().QE();
                        if(!var9.equals("VL")) {
                           return false;
                        }

                        Xf var10 = (Xf)var7.zs().get(0);
                        var4.push(var10);
                     }

                     if(var3.isEmpty()) {
                        return false;
                     } else {
                        Object var12;
                        for(var12 = (Xf)var4.pop(); !var4.isEmpty(); var12 = new Gy((Xf)var12, kn.dN, (Xf)var4.pop())) {
                           ;
                        }

                        try {
                           return var1.dN(var2, (IK)var12);
                        } catch (ClassCastException var11) {
                           return false;
                        }
                     }
                  }
               }
            }

            var5 = (mi)var6;
            if(!this.dN(var5.dN(), "Ljava/lang/StringBuilder;", "append")) {
               return false;
            }

            var3.add(var5.mS().get(1));
            var4.push(var5.mS().get(1));
         }
      }
   }

   public int bG(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            int var5 = this.dN((IK)var1, (IK)var4);
            if(var5 > 0) {
               var2 += var5;
            } else {
               EG var7;
               if(var4 instanceof wz) {
                  for(Iterator var6 = ((wz)var4).dN().iterator(); var6.hasNext(); var2 += this.bG(var7)) {
                     var7 = (EG)var6.next();
                  }
               }

               ++var3;
            }
         }

         return var2;
      }
   }

   private int dN(IK var1, IK var2) {
      if(!(var2 instanceof Fu) && !(var2 instanceof zd) && !(var2 instanceof Dw)) {
         int var3 = 0;
         if(var2 instanceof mi && this.ld(var1, (mi)var2)) {
            ++var3;
         }

         IK var5;
         for(Iterator var4 = var2.wU().iterator(); var4.hasNext(); var3 += this.dN(var2, var5)) {
            var5 = (IK)var4.next();
         }

         return var3;
      } else {
         return 0;
      }
   }

   private boolean ld(IK var1, mi var2) {
      Fu var3 = var2.dN();
      String var4 = var3.mS();
      if(var2.dN().cb() && var2.dN().PF() && var4.startsWith("access$")) {
         Dw[] var5 = new Dw[1];
         Np[] var6 = new Np[1];
         Fu[] var7 = new Fu[1];
         Object var8 = null;
         if(this.dN(var3, var5)) {
            var8 = new XM(new CZ((Xf)var2.mS().get(0), var5[0]), (Xf)var2.mS().get(1));
         } else if(this.dN(var3, var6)) {
            var8 = new XM(var6[0], (Xf)var2.mS().get(0));
         } else if(this.ld(var3, var5)) {
            var8 = new CZ((Xf)var2.mS().get(0), var5[0]);
         } else if(this.ld(var3, var6)) {
            var8 = var6[0];
         } else if(this.dN(var3, var7)) {
            var8 = new mi(var7[0], false, var2.mS());
         }

         if(var8 == null) {
            return false;
         } else {
            try {
               return var1.dN(var2, (IK)var8);
            } catch (ClassCastException var9) {
               return var1 instanceof EG && var2 instanceof II?((EG)var1).ld(var2):false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean dN(Fu var1, Dw[] var2) {
      EG var3 = var1.VX();
      if((var3.zs() == 1 || var3.zs() == 2 && var3.ld(1) instanceof cq) && var3.ld(0) instanceof XM) {
         XM var4 = (XM)var3.ld(0);
         if(var4.dN()) {
            List var5 = var1.fa();
            if(var5.size() == 2 && var4.OK() instanceof CZ && var4.LH() instanceof HI) {
               CZ var6 = (CZ)var4.OK();
               HI var7 = (HI)var4.LH();
               if(var6.ld() == ((wm)var5.get(0)).zs() && var7 == ((wm)var5.get(1)).zs()) {
                  var2[0] = var6.QE();
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean dN(Fu var1, Np[] var2) {
      EG var3 = var1.VX();
      if((var3.zs() == 1 || var3.zs() == 2 && var3.ld(1) instanceof cq) && var3.ld(0) instanceof XM) {
         XM var4 = (XM)var3.ld(0);
         if(var4.dN()) {
            List var5 = var1.fa();
            if(var5.size() == 1 && var4.OK() instanceof Np && var4.LH() instanceof HI) {
               Np var6 = (Np)var4.OK();
               HI var7 = (HI)var4.LH();
               if(var7 == ((wm)var5.get(0)).zs()) {
                  var2[0] = var6;
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean ld(Fu var1, Dw[] var2) {
      EG var3 = var1.VX();
      if(var3.zs() == 1 && var3.ld(0) instanceof cq) {
         cq var4 = (cq)var3.ld(0);
         if(var4.dN() instanceof CZ) {
            CZ var5 = (CZ)var4.dN();
            List var6 = var1.fa();
            if(var6.size() == 1 && var5.ld() == ((wm)var6.get(0)).zs()) {
               var2[0] = var5.QE();
               return true;
            }
         }
      }

      return false;
   }

   private boolean ld(Fu var1, Np[] var2) {
      EG var3 = var1.VX();
      if(var3.zs() == 1 && var3.ld(0) instanceof cq) {
         cq var4 = (cq)var3.ld(0);
         if(var4.dN() instanceof Np) {
            List var5 = var1.fa();
            if(var5.size() == 0) {
               var2[0] = (Np)var4.dN();
               return true;
            }
         }
      }

      return false;
   }

   private boolean dN(Fu var1, Fu[] var2) {
      EG var3 = var1.VX();
      if(var3.zs() == 1) {
         mi var4 = null;
         if(var3.ld(0) instanceof mi) {
            var4 = (mi)var3.ld(0);
         } else if(var3.ld(0) instanceof cq) {
            cq var5 = (cq)var3.ld(0);
            if(var5.dN() instanceof mi) {
               var4 = (mi)var5.dN();
            }
         }

         if(var4 != null) {
            List var8 = var1.fa();
            List var6 = var4.mS();
            if(var8.size() == var6.size()) {
               for(int var7 = 0; var7 < var8.size(); ++var7) {
                  if(((wm)var8.get(var7)).zs() != var6.get(var7)) {
                     return false;
                  }
               }

               var2[0] = var4.dN();
               return true;
            }
         }
      }

      return false;
   }

   public int BQ(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            if(var4 instanceof zn && var3 >= 1 && var1.ld(var3 - 1) instanceof XM && this.ld(var1, var3)) {
               ++var2;
            } else {
               EG var6;
               if(var4 instanceof wz) {
                  for(Iterator var5 = ((wz)var4).dN().iterator(); var5.hasNext(); var2 += this.BQ(var6)) {
                     var6 = (EG)var5.next();
                  }
               }

               ++var3;
            }
         }

         return var2;
      }
   }

   private boolean ld(EG var1, int var2) {
      XM var3 = (XM)var1.ld(var2 - 1);
      if(!var3.dN()) {
         return false;
      } else {
         HI var4;
         if(var3.OK() instanceof wm) {
            wm var5 = (wm)var3.OK();
            var4 = var5.zs();
         } else {
            if(!(var3.OK() instanceof HI)) {
               return false;
            }

            var4 = (HI)var3.OK();
         }

         Xf var11 = var3.LH();
         zn var6 = (zn)var1.ld(var2);
         EG var7 = var6.mS();
         if(var7.zs() == 0) {
            return false;
         } else {
            II var8 = var7.OK();
            if(var8 instanceof XM && ((XM)var8).OK() == var4) {
               var7.LH();
               XM var9 = new XM(var4, var11);
               am var10 = new am(var9, var6.zs(), var8, var7);
               var1.ld(var2, var10);
               if(var3.OK() instanceof wm) {
                  var1.ld(var2 - 1, (wm)var3.OK());
               } else if(var3.OK() instanceof HI) {
                  var1.wU(var2 - 1);
               }

               return true;
            } else {
               return false;
            }
         }
      }
   }

   public int Ee(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            EG var6;
            if(!(var4 instanceof wz)) {
               int var5 = this.QE(var1, var3);
               if(var5 >= 0) {
                  ++var2;
                  var3 = var5 + 1;
                  continue;
               }
            } else {
               for(Iterator var7 = ((wz)var4).dN().iterator(); var7.hasNext(); var2 += this.Ee(var6)) {
                  var6 = (EG)var7.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }

   private int QE(EG var1, int var2) {
      II var3 = var1.ld(var2);
      if(!(var3 instanceof II)) {
         throw new RuntimeException();
      } else {
         ArrayList var4 = new ArrayList();
         this.dN((IK)var1, (IK)var3, (HashSet)(new HashSet()), (List)var4);
         if(var4.isEmpty()) {
            return -1;
         } else {
            Object[] var10000 = new Object[]{Integer.valueOf(var4.size())};
            ArrayList var5 = new ArrayList();
            Iterator var6 = var4.iterator();

            mi var7;
            List var8;
            Xf var9;
            List var10;
            while(var6.hasNext()) {
               var7 = (mi)var6.next();
               var8 = var7.mS();
               if(!var8.isEmpty()) {
                  var9 = (Xf)var8.get(var8.size() - 1);
                  if(var9 instanceof jK) {
                     var10 = ((jK)var9).ld();
                     if(var10 != null && var10.size() == 1 && var10.get(0) instanceof OX) {
                        OX var11 = (OX)var10.get(0);
                        if(var11.Ux()) {
                           var7.ld(var8.size() - 1);
                           var5.add(var7);
                        }
                     }
                  }
               }
            }

            var4.removeAll(var5);
            if(var4.isEmpty()) {
               return var2;
            } else {
               var5 = new ArrayList();
               var6 = var4.iterator();

               while(true) {
                  do {
                     do {
                        do {
                           if(!var6.hasNext()) {
                              var4.removeAll(var5);
                              if(var4.isEmpty()) {
                                 return var2;
                              }

                              Xf var19 = null;
                              var7 = null;
                              ArrayList var20 = null;
                              TreeMap var21 = new TreeMap();
                              int var22 = var2 - 1;

                              while(true) {
                                 label208: {
                                    if(var22 >= 0) {
                                       II var24 = var1.ld(var22);
                                       if(!(var24 instanceof XM)) {
                                          return -1;
                                       }

                                       XM var26 = (XM)var24;
                                       if(!var26.dN()) {
                                          return -1;
                                       }

                                       Rx var13 = var26.OK();
                                       Iterator var16;
                                       int var17;
                                       if(var13 instanceof wD) {
                                          wD var29 = (wD)var13;
                                          Xf var30 = var29.ld();
                                          if(var19 == null) {
                                             var16 = var4.iterator();

                                             while(var16.hasNext()) {
                                                mi var32 = (mi)var16.next();
                                                List var18 = var32.mS();
                                                if(!var18.isEmpty() && var18.get(var18.size() - 1) == var30) {
                                                   var19 = var30;
                                                   var7 = var32;
                                                }
                                             }
                                          }

                                          if(var30 != var19) {
                                             return -1;
                                          }

                                          Xf var31 = var29.QE();
                                          if(!(var31 instanceof OX) || ((OX)var31).ld() != hV.zs) {
                                             return -1;
                                          }

                                          var17 = ((OX)var31).OK();
                                          if(!var21.containsKey(Integer.valueOf(var17))) {
                                             var21.put(Integer.valueOf(var17), var26.LH());
                                          }
                                          break label208;
                                       }

                                       if(!(var13 instanceof wm) && !(var13 instanceof HI)) {
                                          break label208;
                                       }

                                       HI var14;
                                       if(var13 instanceof wm) {
                                          var14 = ((wm)var13).zs();
                                       } else {
                                          var14 = (HI)var13;
                                       }

                                       if(var14 != var19) {
                                          return -1;
                                       }

                                       var20 = new ArrayList(var21.size());
                                       int var15 = 0;

                                       for(var16 = var21.keySet().iterator(); var16.hasNext(); ++var15) {
                                          var17 = ((Integer)var16.next()).intValue();
                                          if(var17 != var15) {
                                             return -1;
                                          }

                                          var20.add(var21.get(Integer.valueOf(var17)));
                                       }
                                    }

                                    if(var20 != null && var19 != null && var7 != null) {
                                       if(var20.size() == 1 && var20.get(0) instanceof OX && ((OX)var20.get(0)).PF()) {
                                          Gy var25 = new Gy((Xf)null, this.fa.dN(this.QE.dN("Ljava/lang/Object;")), (Xf)var20.get(0));
                                          var20.set(0, var25);
                                       }

                                       List var27 = var7.mS();
                                       var27.remove(var27.size() - 1);

                                       int var28;
                                       for(var28 = 0; var28 < var20.size(); ++var28) {
                                          var27.add(var20.get(var28));
                                       }

                                       var28 = var20.size() + 1;

                                       for(var2 -= var28; var28 > 0; --var28) {
                                          var1.wU(var2);
                                       }

                                       return var2;
                                    }

                                    var10000 = new Object[]{var20, var19, var7};
                                    return -1;
                                 }

                                 --var22;
                              }
                           }

                           var7 = (mi)var6.next();
                           var8 = var7.mS();
                        } while(var8.isEmpty());

                        var9 = (Xf)var8.get(var8.size() - 1);
                     } while(!(var9 instanceof jK));

                     var10 = ((jK)var9).zs();
                  } while(var10 == null);

                  var7.ld(var8.size() - 1);
                  Iterator var23 = var10.iterator();

                  while(var23.hasNext()) {
                     Xf var12 = (Xf)var23.next();
                     var7.dN(var12);
                  }

                  if(var10.size() == 1 && var10.get(0) instanceof OX && ((OX)var10.get(0)).PF()) {
                     var7.dN(var7.zs() - 1, new Gy((Xf)null, this.fa.dN(this.QE.dN("Ljava/lang/Object;")), (Xf)var10.get(0)));
                  }

                  var5.add(var7);
               }
            }
         }
      }
   }

   private void dN(IK var1, IK var2, HashSet var3, List var4) {
      if(!var3.contains(var2)) {
         var3.add(var2);
         if(var2 instanceof mi && this.dN((mi)var2)) {
            var4.add((mi)var2);
         }

         Iterator var5 = var2.wU().iterator();

         while(var5.hasNext()) {
            IK var6 = (IK)var5.next();
            this.dN(var2, var6, var3, var4);
         }

      }
   }

   private boolean dN(mi var1) {
      Fu var2 = var1.dN();
      String var3 = var2.zs();
      String var4 = var2.mS();
      return !var3.equals("Ljava/lang/String;") && !var3.equals("Ljava/util/Formatter;")?(!var3.equals("Ljava/lang/Class;")?(var3.equals("Ljava/lang/reflect/Method;")?var4.equals("invoke"):(var3.equals("Ljava/lang/reflect/Constructor;")?var4.equals("newInstance"):false)):var4.equals("getConstructor") || var4.equals("getDeclaredConstructor") || var4.equals("getMethod") || var4.equals("getDeclaredMethod")):var4.equals("format");
   }

   public int De(EG var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < var1.zs(); ++var3) {
         II var4 = var1.ld(var3);
         EG var6;
         if(!(var4 instanceof wz)) {
            var2 += this.wU(var1, var3);
         } else {
            for(Iterator var5 = ((wz)var4).dN().iterator(); var5.hasNext(); var2 += this.De(var6)) {
               var6 = (EG)var5.next();
            }
         }
      }

      return var2;
   }

   private int wU(EG var1, int var2) {
      II var3 = var1.ld(var2);
      if(!(var3 instanceof II)) {
         throw new RuntimeException();
      } else {
         ArrayList var4 = new ArrayList();
         this.ld(var1, var3, new HashSet(), var4);
         int var5 = 0;
         Iterator var6 = var4.iterator();

         while(var6.hasNext()) {
            Oq var7 = (Oq)var6.next();
            mi var8 = (mi)var7.ld;
            List var9 = var8.mS();
            if(var9.size() == 2 && var9.get(0) instanceof Np && var9.get(1) instanceof jK) {
               hV var10 = null;
               int var11 = -1;
               List var12 = null;
               Xf var13 = (Xf)var9.get(0);
               hV var14 = ((Np)var13).ld();
               String var15 = ((Np)var13).QE().zs();
               if(var15.equals("TYPE")) {
                  String var16 = lP.wU(var14.dN());
                  var10 = hV.dN(lP.fa(var16), this.QE);
                  var11 = 0;
               } else if(var15.equals("class")) {
                  if(var14.OK()) {
                     var10 = var14.QE();
                     var11 = var14.ld();
                  } else {
                     var10 = var14;
                     var11 = 0;
                  }
               }

               Xf var20 = (Xf)var9.get(1);
               if(((jK)var20).dN().KK().equals("[I")) {
                  var12 = ((jK)var20).zs();
               }

               if(var10 != null && var11 >= 0 && var12 != null) {
                  int var17 = var12.size() + var11;
                  hV var18 = this.QE.dN(var10, var17);
                  jK var19 = new jK(var18, true, var12);
                  if(var7.dN.dN(var8, var19)) {
                     ++var5;
                  }
               }
            }
         }

         return var5;
      }
   }

   private void ld(IK var1, IK var2, HashSet var3, List var4) {
      if(!var3.contains(var2)) {
         var3.add(var2);
         if(var2 instanceof mi && this.ld((mi)var2)) {
            var4.add(new Oq(var1, var2));
         } else {
            Iterator var5 = var2.wU().iterator();

            while(var5.hasNext()) {
               IK var6 = (IK)var5.next();
               this.ld(var2, var6, var3, var4);
            }

         }
      }
   }

   private boolean ld(mi var1) {
      Fu var2 = var1.dN();
      String var3 = var2.zs();
      String var4 = var2.mS();
      return var2.cb() && var3.equals("Ljava/lang/reflect/Array;") && var4.equals("newInstance");
   }

   public int rn(EG var1) {
      int var2 = 0;
      int var3 = 0;

      while(true) {
         while(var3 < var1.zs()) {
            II var4 = var1.ld(var3);
            EG var6;
            if(var4 instanceof tE) {
               tE var5 = (tE)var4;
               if(var5.LH() == 2 && var5.mS()) {
                  var6 = var5.QE(0);
                  EG var7 = var5.OK();
                  if(var6.zs() == 1 && var7.zs() == 1) {
                     II var8 = var6.ld(0);
                     II var9 = var7.ld(0);
                     if(var8 instanceof XM && var9 instanceof XM) {
                        XM var10 = (XM)var8;
                        XM var11 = (XM)var9;
                        if(var10.dN() && var11.dN() || var10.ld() && var11.ld() && var10.zs().equals(var11.zs())) {
                           boolean var12 = false;
                           rY var13;
                           if(!var10.OK().equals(var11.OK()) && (!(var10.OK() instanceof wm) || !((wm)var10.OK()).zs().equals(var11.OK()))) {
                              if(var11.OK() instanceof wm && ((wm)var11.OK()).zs().equals(var10.OK())) {
                                 var13 = new rY(var5.ld(0), var10.LH(), var11.LH());
                                 var11.dN((Xf)var13);
                                 var1.ld(var3, var11);
                                 var12 = true;
                              }
                           } else {
                              var13 = new rY(var5.ld(0), var10.LH(), var11.LH());
                              var10.dN((Xf)var13);
                              var1.ld(var3, var10);
                              var12 = true;
                           }

                           if(var12) {
                              ++var2;
                              continue;
                           }
                        }
                     }
                  }
               }
            }

            if(var4 instanceof wz) {
               for(Iterator var14 = ((wz)var4).dN().iterator(); var14.hasNext(); var2 += this.rn(var6)) {
                  var6 = (EG)var14.next();
               }
            }

            ++var3;
         }

         return var2;
      }
   }
}
