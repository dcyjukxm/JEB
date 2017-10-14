package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.EG;
import jebglobal.GH;
import jebglobal.Gz;
import jebglobal.HI;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.OX;
import jebglobal.Qa;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.cI;
import jebglobal.hO;
import jebglobal.hV;
import jebglobal.hY;
import jebglobal.js;
import jebglobal.kd;
import jebglobal.kg;
import jebglobal.lM;
import jebglobal.nh;
import jebglobal.oc;
import jebglobal.rP;
import jebglobal.u;
import jebglobal.vD;
import jebglobal.wm;
import jebglobal.wz;
import jebglobal.xd;
import jebglobal.yK;
import jebglobal.zd;

public final class Fu extends cI {
   private AR dN;
   private hV.uK ld;
   private OX.vd QE;
   private GH wU;
   private boolean fa;
   private int zs;
   private int mS;
   private hV OK;
   private String LH;
   private String KK;
   private zd EO;
   private List cb;
   private List PF;
   private List Hw;
   private EG rK;
   private HI.uK Ux;
   private Qa.uK ZY;
   private int s;

   private Fu(int var1, boolean var2, AR var3, hV.uK var4, OX.vd var5, zd.uK var6, GH var7, HI.vd var8) {
      this.dN = var3;
      this.ld = var4;
      this.QE = var5;
      this.wU = var7;
      hO var9 = var3.mS(var1);
      AV var10 = var9.ld();
      zd var11 = null;
      nh.vd var12 = var9.zs();
      if(!var12.fa()) {
         var11 = var6.ld(var12.zs());
      }

      this.mS = var1;
      this.LH = var9.dN(false);
      this.KK = var9.ld(false);
      this.EO = var11;
      if(var10 == null) {
         this.fa = true;
         this.zs = var2?8:0;
         this.OK = null;
      } else {
         this.fa = false;
         this.zs = var10.QE();
         this.OK = hV.dN(var9.OK(), var4)[0];
         this.cb = new ArrayList();
         this.rK = new EG();
         this.Ux = new HI.uK(var8);
         this.ZY = new Qa.uK();
         if(var10.wU() == null && !var10.mS() && !var10.OK()) {
            throw new RuntimeException();
         } else {
            this.ld();
            var11.dN(this);
         }
      }
   }

   public void ld() {
      this.s = 0;
      if(!this.fa) {
         this.rK.KK();
         this.Ux.dN();
         this.ZY.dN();
         this.cb.clear();
         hO var1 = this.dN.mS(this.mS);
         AV var2 = var1.ld();
         int var7;
         hV var8;
         String var9;
         if(var2.wU() == null) {
            hV[] var3 = hV.dN(this.dN.mS(var2.ld()).OK(), this.ld);
            byte var4 = 0;
            hV var5 = hV.dN(this.LH, this.ld);
            wm var6 = this.Ux.dN(-1, var5, 0, "this");
            var6.dN(-2);
            this.cb.add(var6);
            int var29 = var4 + 1;

            for(var7 = 1; var7 < var3.length; ++var7) {
               var8 = var3[var7];
               var9 = "arg" + var29;
               var6 = this.Ux.dN(-1, var8, var29, var9);
               var6.dN(-2);
               this.cb.add(var6);
               ++var29;
            }
         } else {
            HashMap var27 = Gz.dN(this.dN, var2, this.ld);
            TreeMap var30 = new TreeMap(var27);
            int var31 = 0;
            Iterator var35 = var30.keySet().iterator();

            while(var35.hasNext()) {
               var7 = ((Integer)var35.next()).intValue();
               if(var7 >= 0) {
                  var8 = (hV)var27.get(Integer.valueOf(var7));
                  var9 = "arg" + var7;
                  if(var31 == 0 && !var2.zs()) {
                     var9 = "this";
                  }

                  wm var10 = this.Ux.dN(-1, var8, var7, var9);
                  var10.dN(-2);
                  this.cb.add(var10);
                  ++var31;
               }
            }
         }

         if(this.wU != null) {
            this.PF = new ArrayList();
            this.Hw = new ArrayList();
            yK var28 = this.dN.EO(var1.dN(false));
            xd var32 = var28.Hv();
            if(var32 != null) {
               xd.eI[] var33 = var32.QE();
               int var36 = var33.length;

               int var11;
               int var18;
               int var40;
               label103:
               for(var7 = 0; var7 < var36; ++var7) {
                  xd.eI var37 = var33[var7];
                  if(var37.dN() == this.mS) {
                     xd.uK[] var39 = var37.ld().ld();
                     var40 = var39.length;
                     var11 = 0;

                     while(true) {
                        if(var11 >= var40) {
                           break label103;
                        }

                        xd.uK var12 = var39[var11];
                        if(var12.dN() != 2) {
                           int var13 = var12.ld().dN();
                           hV var14 = this.ld.dN(this.dN.dN(var13, false));
                           lM var15 = new lM(var14);
                           kg.uK[] var16 = var12.ld().ld();
                           int var17 = var16.length;

                           for(var18 = 0; var18 < var17; ++var18) {
                              kg.uK var19 = var16[var18];
                              OX var20 = this.QE.dN(this.dN.dN(var19.dN()));
                              Xf var21 = this.wU.dN(var19.ld());
                              var15.dN(var20, var21);
                           }

                           this.PF.add(var15);
                        }

                        ++var11;
                     }
                  }
               }

               xd.vn[] var34 = var32.wU();
               var36 = var34.length;

               for(var7 = 0; var7 < var36; ++var7) {
                  xd.vn var38 = var34[var7];
                  if(var38.dN() == this.mS) {
                     xd.vd[] var41 = var38.ld();
                     var40 = var41.length;

                     for(var11 = 0; var11 < var40; ++var11) {
                        xd.vd var42 = var41[var11];
                        ArrayList var43 = new ArrayList();
                        xd.uK[] var44 = var42.ld();
                        int var45 = var44.length;

                        for(int var46 = 0; var46 < var45; ++var46) {
                           xd.uK var47 = var44[var46];
                           if(var47.dN() != 2) {
                              var18 = var47.ld().dN();
                              hV var48 = this.ld.dN(this.dN.dN(var18, false));
                              lM var49 = new lM(var48);
                              kg.uK[] var50 = var47.ld().ld();
                              int var22 = var50.length;

                              for(int var23 = 0; var23 < var22; ++var23) {
                                 kg.uK var24 = var50[var23];
                                 OX var25 = this.QE.dN(this.dN.dN(var24.dN()));
                                 Xf var26 = this.wU.dN(var24.ld());
                                 var49.dN(var25, var26);
                              }

                              var43.add(var49);
                           }
                        }

                        this.Hw.add(var43);
                     }

                     return;
                  }
               }
            }
         }

      }
   }

   public int QE() {
      return this.mS;
   }

   public List fa() {
      if(this.fa) {
         throw new RuntimeException();
      } else {
         return this.cb;
      }
   }

   public String zs() {
      return this.LH;
   }

   public String mS() {
      return this.KK;
   }

   public String OK() {
      return this.dN.mS(this.mS).wU(false);
   }

   public zd LH() {
      return this.EO;
   }

   public boolean KK() {
      return this.fa;
   }

   public boolean EO() {
      return (this.zs & 65536) != 0 || this.OK == hV.dN && ("<init>".equals(this.KK) || "<clinit>".equals(this.KK));
   }

   public boolean cb() {
      return (this.zs & 8) != 0;
   }

   public boolean PF() {
      return (this.zs & 4096) != 0;
   }

   public boolean Hw() {
      return (this.zs & 1024) != 0;
   }

   public boolean rK() {
      return (this.zs & 1) != 0;
   }

   public boolean Ux() {
      return (this.zs & 4) != 0;
   }

   public boolean ZY() {
      return (this.zs & 2) != 0;
   }

   public void dN(int var1, String var2) {
      this.s = 0;
   }

   public HI.uK s() {
      if(this.fa) {
         throw new RuntimeException();
      } else {
         return this.Ux;
      }
   }

   public Qa.uK Hv() {
      if(this.fa) {
         throw new RuntimeException();
      } else {
         return this.ZY;
      }
   }

   public EG VX() {
      return this.rK;
   }

   public boolean ci() {
      return this.rK.zs() == 0;
   }

   public void dN(II var1) {
      this.rK.dN(var1);
   }

   public II bG() {
      return this.rK.OK();
   }

   public void ld(ZL var1) {
      if(this.fa) {
         throw new RuntimeException();
      } else {
         this.a_(var1);
         var1.KK.push(new js(hY.ld, this.mS));
         var1.dN(this.mS);
         if(var1.LH != null) {
            Iterator var2 = this.ZY.ld().iterator();

            while(var2.hasNext()) {
               Qa var3 = (Qa)var2.next();
               u var4 = var1.LH.dN(var1.ld(), var3.QE());
               if(var4 != null && var4.LH()) {
                  var3.dN(var4.Hw());
               }
            }
         }

         if(this.PF != null && var1.mS) {
            var1.dN(this.PF);
         }

         int var13 = this.zs;
         if(this.LH().QE()) {
            var13 &= -1026;
         }

         oc.ld(var1, var13, -1);
         boolean var14 = false;
         if(this.EO()) {
            if(this.cb()) {
               var14 = true;
            } else {
               oc.dN(var1, this.LH().fa());
            }
         } else {
            oc.dN(var1, this.OK);
            var1.wU(" ");
            if(var1.OK != null) {
               hO var15 = var1.OK.mS(this.mS);
               var1.dN(var15.ld(true), Zh.ZY, 1, var15, (Object)null);
            } else {
               var1.dN(this.KK, Zh.ZY, 1, this, (Object)null);
            }
         }

         int var9;
         int var10;
         if(!var14) {
            int var16 = this.cb()?0:1;
            if(var1.QE && var1.OK != null) {
               AV var5 = var1.OK.mS(this.mS).ld();
               if(var5 != null && var5.wU() != null) {
                  vD var6 = var5.wU().KK();
                  if(var6 != null) {
                     int var7 = var16;
                     int[] var8 = var6.dN();
                     var9 = var8.length;

                     for(var10 = 0; var10 < var9; ++var10) {
                        int var11 = var8[var10];
                        if(var7 >= this.cb.size()) {
                           break;
                        }

                        String var12 = var1.OK.dN(var11);
                        if(var12 != null && !var12.equals("")) {
                           ((wm)this.cb.get(var7)).zs().dN(var12);
                        }

                        ++var7;
                     }
                  }
               }
            }

            var1.wU("(");

            for(int var18 = var16; var18 < this.cb.size(); ++var18) {
               if(var18 > var16) {
                  var1.wU(", ");
               }

               if(this.Hw != null && var1.mS && var18 - var16 < this.Hw.size()) {
                  List var20 = (List)this.Hw.get(var18 - var16);
                  var1.dN(var20);
               }

               ((wm)this.cb.get(var18)).dN(var1);
            }

            var1.wU(")");
         }

         if(var1.OK != null) {
            AV var17 = var1.OK.mS(this.mS).ld();
            if(var17 != null) {
               int[] var19 = var17.dN();
               if(var19 != null && var19.length >= 1) {
                  var1.s();
                  var1.dN(oc.BQ);
                  int var21 = 0;
                  int[] var22 = var19;
                  int var23 = var19.length;

                  for(var9 = 0; var9 < var23; ++var9) {
                     var10 = var22[var9];
                     if(var21 >= 1) {
                        var1.wU(",");
                     }

                     var1.s();
                     oc.dN(var1, this.ld.dN(this.dN.dN(var10, false)));
                     ++var21;
                  }
               }
            }
         }

         if(var1.LH != null) {
            var1.ld(var1.LH.fa(this.mS));
         }

         var1.QE(-2);
         if(this.Hw()) {
            var1.wU(";");
         } else {
            if(!var14) {
               var1.wU(" ");
            }

            if(this.s == 0) {
               this.rK.dN(var1);
            } else {
               if(this.s != 1 && this.s != 2) {
                  throw new RuntimeException();
               }

               var1.wU("{");
               var1.QE();
               var1.rK();
               if(this.s == 1) {
                  var1.dN(rP.dN(new byte[]{108, 64, 80, 61, 23, 10, 8, 5, 4, 73, 68, 2, 93, 73, 94, 87, 25, 85, 77, 73, 94, 85, 85}, 2, 54), Zh.ld);
               } else if(this.s == 2) {
                  var1.dN(rP.dN(new byte[]{108, 64, 80, 61, 55, 36, 40, 72, 56, 105, 101, 42, 125, 97, 101, 112, 118, 125, 12, 13, 31, 16, 126, 125, 96, 121, 111, 51, 55, 34, 37, 41, 97, 35, 34, 33, 15, 38, 60, 0, 47, 33, 63, 108, 65, 48, 35, 59, 63, 32, 46, 58}, 2, 56), Zh.ld);
               }

               var1.QE();
               var1.Ux();
               var1.wU("}");
            }
         }

         var1.QE();
         var1.KK.pop();
      }
   }

   public boolean dN(int var1, II var2) {
      return this.rK.dN(var1, var2);
   }

   public List BQ() {
      return this.rK.ld();
   }

   public void dN(List var1) {
      II var2 = (II)var1.get(0);
      int[] var3 = new int[1];
      II var4 = ((kd)var2).dN(var1, 0, var3);
      if(var3[0] != var1.size()) {
         throw new RuntimeException();
      } else {
         this.rK = (EG)var4;
      }
   }

   public void Ee() {
      HashSet var1 = new HashSet();
      if(!this.dN(this.rK, var1)) {
         throw new RuntimeException();
      }
   }

   private boolean dN(EG var1, HashSet var2) {
      Iterator var3 = var1.iterator();

      while(true) {
         II var4;
         do {
            if(!var3.hasNext()) {
               return true;
            }

            var4 = (II)var3.next();
            if(var2.contains(var4)) {
               return false;
            }

            var2.add(var4);
         } while(!(var4 instanceof wz));

         Iterator var5 = ((wz)var4).dN().iterator();

         while(var5.hasNext()) {
            EG var6 = (EG)var5.next();
            if(!this.dN(var6, var2)) {
               return false;
            }
         }
      }
   }

   public List De() {
      ArrayList var1 = new ArrayList();
      this.dN((EG)this.rK, (List)var1);
      return var1;
   }

   private void dN(EG var1, List var2) {
      Iterator var3 = var1.iterator();

      while(true) {
         II var4;
         do {
            if(!var3.hasNext()) {
               return;
            }

            var4 = (II)var3.next();
            var2.add(var4);
         } while(!(var4 instanceof wz));

         Iterator var5 = ((wz)var4).dN().iterator();

         while(var5.hasNext()) {
            EG var6 = (EG)var5.next();
            this.dN(var6, var2);
         }
      }
   }

   public boolean ld(II var1) {
      int var2 = this.dN(this.rK, var1);
      if(var2 >= 2) {
         throw new RuntimeException();
      } else {
         return var2 == 1;
      }
   }

   private int dN(EG var1, II var2) {
      int var3 = 0;
      int var4 = 0;

      while(true) {
         while(var4 < var1.zs()) {
            II var5 = var1.ld(var4);
            if(var5 == var2) {
               var1.wU(var4);
               ++var3;
            } else {
               EG var7;
               if(var5 instanceof wz) {
                  for(Iterator var6 = ((wz)var5).dN().iterator(); var6.hasNext(); var3 += this.dN(var7, var2)) {
                     var7 = (EG)var6.next();
                  }
               }

               ++var4;
            }
         }

         return var3;
      }
   }

   public List wU() {
      List var1 = TM.dN((Collection)this.cb);
      return TM.dN((List)var1, (IK)this.rK);
   }

   public boolean dN(IK var1, IK var2) {
      for(int var3 = 0; var3 < this.cb.size(); ++var3) {
         if(this.cb.get(var3) == var1) {
            this.cb.set(var3, (wm)var2);
            return true;
         }
      }

      if(this.rK == var1) {
         this.rK = (EG)var2;
         return true;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   Fu(int var1, boolean var2, AR var3, hV.uK var4, OX.vd var5, zd.uK var6, GH var7, HI.vd var8, TM var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static class uK {
      private AR dN;
      private hV.uK ld;
      private zd.uK QE;
      private OX.vd wU;
      private GH fa;
      private HI.vd zs;
      private HashMap mS;

      public uK(AR var1, hV.uK var2, zd.uK var3, OX.vd var4) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
         this.wU = var4;
         this.zs = HI.vd.dN;
         this.mS = new HashMap();
      }

      public void dN(GH var1) {
         this.fa = var1;
      }

      public void dN(HI.vd var1) {
         this.zs = var1;
      }

      public Fu dN(int var1, boolean var2) {
         if(var1 < 0) {
            throw new RuntimeException();
         } else {
            Fu var3 = (Fu)this.mS.get(Integer.valueOf(var1));
            if(var3 == null) {
               var3 = new Fu(var1, var2, this.dN, this.ld, this.wU, this.QE, this.fa, this.zs, (TM)null);
               this.mS.put(Integer.valueOf(var1), var3);
            }

            return var3;
         }
      }
   }
}
