package jebglobal;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Cs;
import jebglobal.Dm;
import jebglobal.GS;
import jebglobal.IV;
import jebglobal.Kt;
import jebglobal.QE;
import jebglobal.Qz;
import jebglobal.Uo;
import jebglobal.Wu;
import jebglobal.YK;
import jebglobal.bt;
import jebglobal.fG;
import jebglobal.ft;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.hV;
import jebglobal.ie;
import jebglobal.iz;
import jebglobal.jn;
import jebglobal.kW;
import jebglobal.kn;
import jebglobal.lB;
import jebglobal.np;
import jebglobal.oh;
import jebglobal.os;
import jebglobal.rK;
import jebglobal.rP;
import jebglobal.tu;
import jebglobal.vC;
import jebglobal.xS;
import jebglobal.xy;

public class jI {
   private static final long LK = 844563159190538443L;
   private static long dN = wU();
   private boolean ld = false;
   private AR QE;
   private AV wU;
   private hV.uK fa;
   private oh zs;
   private hV mS;
   private hV OK;
   private jI.uK LH = new jI.uK();
   private int KK;
   private List EO;
   private boolean cb;
   private HashMap PF;
   private HashMap Hw;
   private List rK;
   private HashMap Ux;
   private jn ZY;
   private HashSet s;
   private HashMap Hv;
   private List VX;
   private static boolean ci = dN(kW.class);

   private static long wU() {
      try {
         return ((Long)Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 123, 26, 90, 84, 84, 84}, 2, 201)).getMethod(rP.dN(new byte[]{32, 26, 2, 11, 23, 7, 19, 60, 29, 77, 77, 46, 64, 76, 93, 80, 74}, 2, 18), new Class[0]).invoke((Object)null, new Object[0])).longValue();
      } catch (Exception var0) {
         return 0L;
      }
   }

   public jI(AR var1, AV var2, hV.uK var3) {
      if(var1 != null && var2 != null && var3 != null) {
         this.QE = var1;
         this.wU = var2;
         this.fa = var3;
         this.mS = var3.dN("Ljava/lang/String;");
         this.OK = var3.dN("Ljava/lang/Class;");
         this.zs = var2.wU().fa();
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void dN(boolean var1) {
      if(this.ld) {
         throw new RuntimeException();
      } else {
         int var2 = 120 * ((dN & 1L) == 1L?35:36);
         var2 *= 1000;
         if(wU() - dN > (long)var2) {
            ;
         }

         this.KK = 0;
         this.PF = new HashMap();
         this.Hw = new HashMap();
         this.rK = new ArrayList();
         this.Ux = new HashMap();
         if(this.wU.wU().LH() != null) {
            this.ZY = new jn(this.wU.wU().LH(), true);
            this.s = this.ZY.ld();
         }

         this.Hv = new HashMap();
         this.EO = new ArrayList();
         this.cb = false;

         for(int var3 = 0; var3 < this.zs.dN(); ++var3) {
            List var4 = this.dN(var3);
            this.EO.addAll(var4);
         }

         ((ArrayList)this.EO).trimToSize();
         if(!ci) {
            rK.dN = 0;
         }

         Iterator var11 = this.LH.dN().iterator();

         int var5;
         while(var11.hasNext()) {
            Cs var12 = (Cs)var11.next();
            if(!this.PF.containsKey(Integer.valueOf(var12.dN()))) {
               throw new RuntimeException();
            }

            var5 = ((Integer)this.PF.get(Integer.valueOf(var12.dN()))).intValue();
            var12.dN(var5);
         }

         var11 = this.rK.iterator();

         while(var11.hasNext()) {
            Wu var13 = (Wu)var11.next();
            Integer var15 = (Integer)this.PF.get(Integer.valueOf(var13.dN()));
            if(var15 != null && var15.intValue() < this.EO.size()) {
               xS var6 = (xS)this.EO.get(var15.intValue());
               if(var6.dN() == var15.intValue()) {
                  var6.dN((tu)(new ie(0L, hV.PF)));
               }
            }
         }

         this.rK.clear();
         this.VX = new ArrayList();
         if(var1) {
            var11 = this.zs.ld().iterator();

            label81:
            while(true) {
               ft var14;
               do {
                  if(!var11.hasNext()) {
                     break label81;
                  }

                  var14 = (ft)var11.next();
               } while(var14.EO() == 0);

               var5 = ((Wu)var14.dN(0)).dN();
               Integer var16 = (Integer)this.PF.get(Integer.valueOf(var5));
               if(var16 == null) {
                  throw new RuntimeException();
               }

               var5 = var16.intValue();
               int var7 = ((Wu)var14.dN(var14.dN() - 1)).dN();
               var16 = (Integer)this.PF.get(Integer.valueOf(var7));
               if(var16 == null) {
                  throw new RuntimeException();
               }

               var7 = var16.intValue();
               Iterator var8 = var14.Hw().iterator();

               while(var8.hasNext()) {
                  ft var9 = (ft)var8.next();
                  int var10 = ((Wu)var9.dN(0)).dN();
                  var16 = (Integer)this.PF.get(Integer.valueOf(var10));
                  if(var16 == null) {
                     throw new RuntimeException();
                  }

                  var10 = var16.intValue();
                  this.VX.add(new QE(var5, var7, var10));
               }
            }
         }

         this.ld = true;
      }
   }

   public List dN() {
      if(!this.ld) {
         throw new RuntimeException();
      } else {
         return this.EO;
      }
   }

   public List ld() {
      if(!this.ld) {
         throw new RuntimeException();
      } else {
         return this.VX;
      }
   }

   public HashMap QE() {
      if(!this.ld) {
         throw new RuntimeException();
      } else {
         return this.Hv;
      }
   }

   private List dN(int var1) {
      ft var2 = this.zs.dN(var1);
      List var3 = var2.wU();
      ArrayList var4 = new ArrayList();
      int var5 = 0;
      ArrayList var10 = null;
      Wu[] var11 = new Wu[1];
      ArrayList var12 = new ArrayList();

      while(var5 < var3.size()) {
         if(this.cb) {
            this.cb = false;
            ++var5;
            if(var5 >= var3.size()) {
               break;
            }
         }

         Wu var6 = (Wu)var3.get(var5);
         int var7 = var6.fa();
         Wu var8 = null;
         xS var13 = null;
         int var14 = var6.OK();
         int var15 = -1;
         if(var14 >= 1 && var6.dN(0) == 0) {
            var15 = (int)var6.ld(0);
         }

         int var16 = -1;
         if(var14 >= 2 && var6.dN(1) == 0) {
            var16 = (int)var6.ld(1);
         }

         int var17 = -1;
         if(var14 >= 3 && var6.dN(2) == 0) {
            var17 = (int)var6.ld(2);
         }

         int var9;
         int var18;
         String var20;
         hV var24;
         int var27;
         int var28;
         gE var44;
         hV var45;
         int var47;
         hV var48;
         xy var52;
         boolean var54;
         hV var56;
         String var57;
         int var65;
         xy var67;
         int var72;
         int var77;
         switch(var7) {
         case 0:
         case 10:
         case 11:
         case 12:
         case 31:
         case 38:
         case 511:
            break;
         case 1:
         case 2:
         case 3:
            var13 = new xS(Qz.dN, new xy(var15, hV.KK), new xy(var16, hV.KK));
            break;
         case 4:
         case 5:
         case 6:
            var13 = new xS(Qz.dN, new xy(var15, hV.EO), new xy(var16, hV.EO));
            break;
         case 7:
         case 8:
         case 9:
            var13 = new xS(Qz.dN, new xy(var15, hV.PF), new xy(var16, hV.PF));
            break;
         case 13:
            if(var5 != 0) {
               throw new RuntimeException();
            }

            this.Ux.put(Integer.valueOf(this.KK), Integer.valueOf(var15));
            var18 = var6.dN();
            bt var63 = this.ZY.ld(var18);
            if(var63 == null) {
               throw new RuntimeException();
            }

            var20 = var63.dN()?this.QE.dN(var63.ld(), false):"Ljava/lang/Throwable;";
            var56 = this.fa.dN(var20);
            var13 = new xS(Qz.OK, new xy(var15, var56), (GS)null);
            break;
         case 14:
            var13 = new xS(Qz.zs, (GS)null, (GS)null);
            break;
         case 15:
            var13 = new xS(Qz.zs, (GS)null, new xy(var15, hV.KK));
            break;
         case 16:
            var13 = new xS(Qz.zs, (GS)null, new xy(var15, hV.EO));
            break;
         case 17:
            var13 = new xS(Qz.zs, (GS)null, new xy(var15, hV.PF));
            break;
         case 18:
         case 19:
         case 20:
         case 21:
            var13 = new xS(Qz.dN, new xy(var15, hV.KK), new ie((long)((int)var6.ld(1)), hV.KK));
            break;
         case 22:
         case 23:
         case 24:
         case 25:
            var13 = new xS(Qz.dN, new xy(var15, hV.EO), new ie(var6.ld(1), hV.EO));
            break;
         case 26:
         case 27:
            var13 = new xS(Qz.dN, new xy(var15, this.mS), new ie(new YK((int)var6.ld(1)), this.mS));
            break;
         case 28:
         case 255:
            var18 = (int)var6.ld(1);
            var57 = this.QE.dN(var18, false);
            var13 = new xS(Qz.dN, new xy(var15, this.OK), new np((YK)null, this.OK, var57, "class"));
            break;
         case 29:
            var13 = new xS(Qz.LH, (GS)null, new xy(var15, hV.PF));
            break;
         case 30:
            var13 = new xS(Qz.KK, (GS)null, new xy(var15, hV.PF));
            break;
         case 32:
         case 767:
            var18 = (int)var6.ld(2);
            var57 = this.QE.dN(var18, false);
            var13 = new xS(Qz.dN, new xy(var15, hV.ld), new lB(new xy(var16, hV.PF), ld(var7), new Dm(new YK(var18), hV.dN(var57, this.fa))));
            break;
         case 33:
            var13 = new xS(Qz.dN, new xy(var15, hV.zs), new Kt(new xy(var16, hV.PF), (YK)null, hV.zs, "length"));
            break;
         case 34:
         case 1023:
            Object var62 = (List)this.Hw.get(Integer.valueOf(var15));
            if(var62 == null) {
               var62 = new ArrayList();
               this.Hw.put(Integer.valueOf(var15), var62);
            }

            ((List)var62).add(var6);
            break;
         case 35:
         case 1279:
            var18 = (int)var6.ld(2);
            var57 = this.QE.dN(var18, false);
            var48 = hV.dN(var57, this.fa);
            if(var48.ld() <= 0) {
               throw new RuntimeException();
            }

            ArrayList var59 = null;
            if(var5 + 1 < var3.size()) {
               var8 = (Wu)var3.get(var5 + 1);
               var9 = var8.fa();
               if(var9 != 38) {
                  var8 = null;
               } else {
                  var59 = new ArrayList();
                  byte[] var78 = new byte[8];
                  ByteBuffer var76 = ByteBuffer.wrap(var78);
                  var76.order(ByteOrder.LITTLE_ENDIAN);
                  var24 = var48.QE();
                  if(!var24.fa()) {
                     throw new RuntimeException();
                  }

                  byte[][] var80 = var8.Hw();

                  for(var77 = 0; var77 < var80.length; ++var77) {
                     for(var27 = 0; var27 < var80[var77].length; ++var27) {
                        var78[var27] = var80[var77][var27];
                     }

                     long var83 = var76.getLong(0);
                     var59.add(new ie(var83, var24));
                  }
               }
            }

            var13 = new xS(Qz.dN, new xy(var15, var48), new os(new YK(var18), var48, new xy(var16, hV.cb), var59));
            break;
         case 36:
         case 37:
         case 1535:
            var18 = (int)var6.ld(0);
            var57 = this.QE.QE(var18).dN(false);
            var48 = hV.dN(var57, this.fa);
            var52 = this.ld(var1, var5, var48, var11);
            if(var52 != null) {
               var8 = var11[0];
            }

            int[] var73;
            if(var7 == 36) {
               var73 = new int[var6.OK() - 1];

               for(var65 = 1; var65 < var6.OK(); ++var65) {
                  var73[var65 - 1] = (int)var6.ld(var65);
               }
            } else {
               long var69 = var6.ld(1);
               var72 = (int)(var69 & -1L);
               var77 = (int)(var69 >> 32 & -1L);
               var73 = new int[var77 - var72 + 1];
               var27 = 0;

               for(var28 = var72; var28 <= var77; var73[var27++] = var28++) {
                  ;
               }
            }

            hV var75 = var48.wU();
            ArrayList var74 = new ArrayList(var73.length);

            for(var72 = 0; var72 < var73.length; ++var72) {
               var74.add(new xy(var73[var72], var75));
            }

            os var79 = new os(new YK(var18), var48, new ie((long)var74.size(), hV.zs), var74);
            if(var52 != null) {
               var13 = new xS(Qz.dN, var52, var79);
            } else {
               var13 = new xS(Qz.ld, (GS)null, var79);
            }
            break;
         case 39:
            var13 = new xS(Qz.mS, (GS)null, new xy(var15, hV.PF));
            break;
         case 40:
         case 41:
         case 42:
            var18 = var6.dN() + 2 * (int)var6.ld(0);
            if(var18 != var6.dN() + var6.ld()) {
               var13 = new xS(Qz.QE, this.LH.dN(var18), (GS)null);
            }
            break;
         case 43:
         case 44:
            var18 = var6.dN() + var6.ld();
            var54 = false;
            iz var55 = new iz();
            Wu.lX.uK[] var58 = var6.cb();
            int var70 = var58.length;

            for(var65 = 0; var65 < var70; ++var65) {
               Wu.lX.uK var71 = var58[var65];
               var72 = var6.dN() + 2 * var71.ld();
               if(var72 != var18) {
                  var54 = true;
                  var55.dN(var71.dN(), this.LH.dN(var72));
               }
            }

            if(var54) {
               var13 = new xS(Qz.fa, var55, new xy(var15, hV.cb));
            }
            break;
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
            var8 = null;
            var9 = -1;
            if(var5 + 1 < var3.size()) {
               var8 = (Wu)var3.get(var5 + 1);
               var9 = var8.fa();
               if(var9 >= 56 && var9 <= 61) {
                  this.zs.zs();
                  List var46 = (List)((HashMap)this.zs.mS().get(var6)).get(Integer.valueOf(var15));
                  if(var46 == null || var46.size() != 1 || ((Integer)var46.get(0)).intValue() != var5 + 1) {
                     var8 = null;
                  }
               } else {
                  var8 = null;
               }
            }

            if(var8 == null) {
               hO var49 = null;
               if(var7 != 45 && var7 != 46) {
                  if(var7 != 47 && var7 != 48) {
                     if(var7 == 49) {
                        var49 = this.QE.OK("Ljava/lang/Long;->compare(JJ)I");
                     }
                  } else {
                     var49 = this.QE.OK("Ljava/lang/Double;->compare(DD)I");
                  }
               } else {
                  var49 = this.QE.OK("Ljava/lang/Float;->compare(FF)I");
               }

               if(var49 == null) {
                  throw new RuntimeException();
               }

               hV[] var50 = hV.dN(var49.OK(), this.fa);
               xy var51 = new xy(var15, var50[0]);
               var52 = new xy(var16, var50[1]);
               var67 = new xy(var17, var50[2]);
               Uo var64 = new Uo(new YK(var49.dN()), new xy[]{var52, var67}, var50[0], var49.ld(false), Uo.uK.wU);
               var13 = new xS(Qz.dN, var51, var64);
            } else {
               var18 = var8.dN() + 2 * (int)var8.ld(1);
               if(var18 != var8.dN() + var8.ld()) {
                  var45 = QE(var7);
                  kn var53 = ld(var9);
                  var13 = new xS(Qz.wU, this.LH.dN(var18), new vC(new xy(var16, var45), var53, new xy(var17, var45)));
               }
            }
            break;
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
            var18 = var6.dN() + var6.ld();
            var47 = var6.dN() + 2 * (int)var6.ld(2);
            if(var47 != var18) {
               var13 = new xS(Qz.wU, this.LH.dN(var47), new vC(new xy(var15, hV.KK), ld(var7), new xy(var16, hV.KK)));
            }
            break;
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
            var18 = var6.dN() + var6.ld();
            var47 = var6.dN() + 2 * (int)var6.ld(1);
            if(var47 != var18) {
               var13 = new xS(Qz.wU, this.LH.dN(var47), new vC(new xy(var15, hV.KK), ld(var7), new ie(0L, hV.KK)));
            }
            break;
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
            hV var43 = QE(var7);
            var45 = var43.PF()?hV.cb:var43;
            var13 = new xS(Qz.dN, new xy(var15, var45), new fG(new xy(var16, hV.PF), new xy(var17, hV.cb), var43));
            break;
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
            var13 = new xS(Qz.dN, new fG(new xy(var16, hV.PF), new xy(var17, hV.cb), QE(var7)), new xy(var15, QE(var7)));
            break;
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 95:
         case 1791:
         case 2047:
         case 2303:
         case 2559:
         case 2815:
         case 3071:
         case 3327:
         case 3583:
         case 3839:
         case 4095:
         case 4351:
         case 4607:
         case 4863:
         case 5119:
            var18 = (int)var6.ld(2);
            var44 = this.QE.fa(var18);
            var20 = var44.QE(false);
            var56 = hV.dN(var44.mS().dN(false), this.fa);
            var67 = new xy(var15, var56);
            Kt var61 = new Kt(new xy(var16, this.fa.dN(var44.dN(false))), new YK(var18), var56, var20);
            if((var7 < 82 || var7 > 88) && (var7 < 1791 || var7 > 3327)) {
               var13 = new xS(Qz.dN, var61, var67);
            } else {
               var13 = new xS(Qz.dN, var67, var61);
            }
            break;
         case 96:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 5375:
         case 5631:
         case 5887:
         case 6143:
         case 6399:
         case 6655:
         case 6911:
         case 7167:
         case 7423:
         case 7679:
         case 7935:
         case 8191:
         case 8447:
         case 8703:
            var18 = (int)var6.ld(1);
            var44 = this.QE.fa(var18);
            var48 = hV.dN(var44.mS().dN(false), this.fa);
            var52 = new xy(var15, var48);
            np var66 = new np(new YK(var18), var48, var44.dN(false), var44.QE(false));
            if((var7 < 96 || var7 > 102) && (var7 < 5375 || var7 > 6911)) {
               var13 = new xS(Qz.dN, var66, var52);
            } else {
               var13 = new xS(Qz.dN, var52, var66);
            }
            break;
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 8959:
         case 9215:
         case 9471:
         case 9727:
         case 9983:
            var18 = (int)var6.ld(0);
            hO var19 = this.QE.mS(var18);
            var20 = var19.dN(false);
            String var21 = var19.QE(false);
            Uo.uK var22 = Uo.uK.dN;
            if(var7 != 111 && var7 != 117 && var7 != 9215) {
               if(var7 != 112 && var7 != 118 && var7 != 9471) {
                  if(var7 != 113 && var7 != 119 && var7 != 9727) {
                     if(var7 == 114 || var7 == 120 || var7 == 9983) {
                        var22 = Uo.uK.fa;
                     }
                  } else {
                     var22 = Uo.uK.wU;
                  }
               } else {
                  var22 = Uo.uK.QE;
               }
            } else {
               var22 = Uo.uK.ld;
            }

            hV[] var23 = hV.dN(var19.OK(), this.fa);
            var24 = var23[0];
            if(var24 == hV.QE || var24 == hV.wU || var24 == hV.fa) {
               var24 = hV.cb;
            }

            xy var25 = this.dN(var1, var5, var24, var11);
            if(var25 != null) {
               var8 = var11[0];
            }

            boolean var26 = var22 == Uo.uK.wU;
            var27 = 0;
            var28 = 0;
            if(!var26) {
               ++var27;
               ++var28;
            }

            for(int var29 = 1; var29 < var23.length; ++var29) {
               if(var23[var29] == hV.mS || var23[var29] == hV.LH) {
                  ++var27;
               }

               ++var27;
               ++var28;
            }

            int var32;
            int var33;
            int var35;
            int[] var81;
            if(var7 >= 110 && var7 <= 114) {
               var81 = new int[var6.OK() - 1];

               for(int var82 = 1; var82 < var6.OK(); ++var82) {
                  var81[var82 - 1] = (int)var6.ld(var82);
               }
            } else {
               long var30 = var6.ld(1);
               var32 = (int)(var30 & -1L);
               var33 = (int)(var30 >> 32 & -1L);
               var81 = new int[var33 - var32 + 1];
               int var34 = 0;

               for(var35 = var32; var35 <= var33; var81[var34++] = var35++) {
                  ;
               }
            }

            if(var27 != var81.length) {
               throw new RuntimeException();
            }

            tu[] var84 = new tu[var28];
            int var31 = 0;
            var32 = 0;
            if(!var26) {
               ++var31;
               var84[0] = new xy(var81[0], hV.dN(var20, this.fa));
               ++var32;
            }

            for(var33 = 1; var31 < var84.length; ++var33) {
               hV var85 = var23[var33];
               if(var85 == hV.zs) {
                  var85 = hV.cb;
               }

               var84[var31++] = new xy(var81[var32], var85);
               if(var85 == hV.mS || var85 == hV.LH) {
                  if(var81[var32 + 1] != var81[var32] + 1) {
                     throw new RuntimeException();
                  }

                  ++var32;
               }

               ++var32;
            }

            if(var19.ld(false).equals("<init>")) {
               var12.clear();
               Wu var86 = this.dN(var6, var81[0], var12, this.rK, var2, var5);
               if(var86 != null) {
                  var35 = var81[0];
                  int var36 = (int)var86.ld(1);
                  String var37 = this.QE.dN(var36, false);
                  if(!var37.equals(var20)) {
                     throw new RuntimeException();
                  }

                  hV var38 = this.fa.dN(var20);
                  tu[] var39 = new tu[var84.length - 1];

                  for(int var40 = 1; var40 < var84.length; ++var40) {
                     var39[var40 - 1] = var84[var40];
                  }

                  var13 = new xS(Qz.dN, new xy(var35, var38), new IV(var38, new YK((int)var6.ld(0)), var39));
                  if(!var12.isEmpty()) {
                     var10 = new ArrayList(var12.size());
                     Iterator var88 = var12.iterator();

                     while(var88.hasNext()) {
                        int var41 = ((Integer)var88.next()).intValue();
                        xS var42 = new xS(Qz.dN, new xy(var41, var38), new xy(var35, var38));
                        var10.add(var42);
                     }
                  }
               }
            }

            if(var13 == null) {
               Uo var87 = new Uo(new YK((int)var6.ld(0)), var84, var24, var21, var22);
               if(var25 != null) {
                  var13 = new xS(Qz.dN, var25, var87);
               } else {
                  var13 = new xS(Qz.ld, (GS)null, var87);
               }
            }
            break;
         case 123:
         case 124:
         case 125:
         case 126:
         case 127:
         case 128:
            var13 = new xS(Qz.dN, new xy(var15, QE(var7)), new lB((tu)null, ld(var7), new xy(var16, QE(var7))));
            break;
         case 129:
            var13 = new xS(Qz.dN, new xy(var15, hV.mS), new lB((tu)null, ld(var7), new xy(var16, hV.cb)));
            break;
         case 130:
            var13 = new xS(Qz.dN, new xy(var15, hV.OK), new lB((tu)null, ld(var7), new xy(var16, hV.cb)));
            break;
         case 131:
            var13 = new xS(Qz.dN, new xy(var15, hV.LH), new lB((tu)null, ld(var7), new xy(var16, hV.cb)));
            break;
         case 132:
            var13 = new xS(Qz.dN, new xy(var15, hV.zs), new lB((tu)null, ld(var7), new xy(var16, hV.mS)));
            break;
         case 133:
            var13 = new xS(Qz.dN, new xy(var15, hV.OK), new lB((tu)null, ld(var7), new xy(var16, hV.mS)));
            break;
         case 134:
            var13 = new xS(Qz.dN, new xy(var15, hV.LH), new lB((tu)null, ld(var7), new xy(var16, hV.mS)));
            break;
         case 135:
            var13 = new xS(Qz.dN, new xy(var15, hV.zs), new lB((tu)null, ld(var7), new xy(var16, hV.OK)));
            break;
         case 136:
            var13 = new xS(Qz.dN, new xy(var15, hV.mS), new lB((tu)null, ld(var7), new xy(var16, hV.OK)));
            break;
         case 137:
            var13 = new xS(Qz.dN, new xy(var15, hV.LH), new lB((tu)null, ld(var7), new xy(var16, hV.OK)));
            break;
         case 138:
            var13 = new xS(Qz.dN, new xy(var15, hV.zs), new lB((tu)null, ld(var7), new xy(var16, hV.LH)));
            break;
         case 139:
            var13 = new xS(Qz.dN, new xy(var15, hV.mS), new lB((tu)null, ld(var7), new xy(var16, hV.LH)));
            break;
         case 140:
            var13 = new xS(Qz.dN, new xy(var15, hV.OK), new lB((tu)null, ld(var7), new xy(var16, hV.LH)));
            break;
         case 141:
            var13 = new xS(Qz.dN, new xy(var15, hV.QE), new lB((tu)null, ld(var7), new xy(var16, hV.cb)));
            break;
         case 142:
            var13 = new xS(Qz.dN, new xy(var15, hV.wU), new lB((tu)null, ld(var7), new xy(var16, hV.cb)));
            break;
         case 143:
            var13 = new xS(Qz.dN, new xy(var15, hV.fa), new lB((tu)null, ld(var7), new xy(var16, hV.cb)));
            break;
         case 144:
         case 145:
         case 146:
         case 147:
         case 148:
         case 149:
         case 150:
         case 151:
         case 152:
         case 153:
         case 154:
            var13 = new xS(Qz.dN, new xy(var15, hV.zs), new lB(new xy(var16, QE(var7)), ld(var7), new xy(var17, QE(var7))));
            break;
         case 155:
         case 156:
         case 157:
         case 158:
         case 159:
         case 160:
         case 161:
         case 162:
         case 166:
         case 167:
         case 168:
         case 169:
         case 170:
         case 171:
         case 172:
         case 173:
         case 174:
         case 175:
            var13 = new xS(Qz.dN, new xy(var15, QE(var7)), new lB(new xy(var16, QE(var7)), ld(var7), new xy(var17, QE(var7))));
            break;
         case 163:
         case 164:
         case 165:
            var13 = new xS(Qz.dN, new xy(var15, QE(var7)), new lB(new xy(var16, QE(var7)), ld(var7), new xy(var17, hV.cb)));
            break;
         case 176:
         case 177:
         case 178:
         case 179:
         case 180:
         case 181:
         case 182:
         case 183:
         case 184:
         case 185:
         case 186:
            var13 = new xS(Qz.dN, new xy(var15, hV.zs), new lB(new xy(var15, QE(var7)), ld(var7), new xy(var16, QE(var7))));
            break;
         case 187:
         case 188:
         case 189:
         case 190:
         case 191:
         case 192:
         case 193:
         case 194:
         case 198:
         case 199:
         case 200:
         case 201:
         case 202:
         case 203:
         case 204:
         case 205:
         case 206:
         case 207:
            var13 = new xS(Qz.dN, new xy(var15, QE(var7)), new lB(new xy(var15, QE(var7)), ld(var7), new xy(var16, QE(var7))));
            break;
         case 195:
         case 196:
         case 197:
            var13 = new xS(Qz.dN, new xy(var15, QE(var7)), new lB(new xy(var15, QE(var7)), ld(var7), new xy(var16, hV.cb)));
            break;
         case 208:
         case 210:
         case 211:
         case 212:
         case 213:
         case 214:
         case 215:
         case 216:
         case 218:
         case 219:
         case 220:
         case 221:
         case 222:
         case 223:
         case 224:
         case 225:
         case 226:
            var13 = new xS(Qz.dN, new xy(var15, hV.zs), new lB(new xy(var16, hV.cb), ld(var7), new ie((long)((int)var6.ld(2)), hV.cb)));
            break;
         case 209:
         case 217:
            var13 = new xS(Qz.dN, new xy(var15, hV.zs), new lB(new ie((long)((int)var6.ld(2)), hV.cb), ld(var7), new xy(var16, hV.cb)));
            break;
         default:
            throw new RuntimeException();
         }

         var18 = var6.dN();
         if(this.s != null && this.s.contains(Integer.valueOf(var18))) {
            var47 = this.ZY.ld(var18).ld();
            this.Hv.put(Integer.valueOf(this.KK), Integer.valueOf(var47));
         }

         this.PF.put(Integer.valueOf(var18), Integer.valueOf(this.KK));
         if(var8 != null) {
            this.PF.put(Integer.valueOf(var8.dN()), Integer.valueOf(this.KK));
         }

         var54 = var6.QE() || var8 != null && var8.QE();
         if(var13 != null) {
            var13.dN(var54);
            var13.dN(this.KK++);
            var13.ld(var6.dN());
            var4.add(var13);
         }

         ++var5;
         if(var8 != null) {
            this.cb = true;
         }

         if(var10 != null) {
            Iterator var60 = var10.iterator();

            while(var60.hasNext()) {
               xS var68 = (xS)var60.next();
               var68.dN(var54);
               var68.dN(this.KK++);
               var4.add(var68);
            }

            var10 = null;
         }
      }

      return var4;
   }

   private xy dN(int var1, int var2, hV var3, Wu[] var4) {
      ft var5 = this.zs.dN(var1);
      Wu var6 = null;
      if(var2 + 1 < var5.dN()) {
         var6 = (Wu)var5.dN(var2 + 1);
      } else if(var1 + 1 < this.zs.dN()) {
         var5 = this.zs.dN(var1 + 1);
         var6 = (Wu)var5.dN(0);
      }

      if(var6 == null) {
         return null;
      } else {
         int var7 = var6.fa();
         if(var7 != 10 && var7 != 12 && var7 != 11) {
            return null;
         } else {
            byte var8;
            if(var3 != hV.ld && var3 != hV.QE && var3 != hV.wU && var3 != hV.fa && var3 != hV.zs && var3 != hV.OK) {
               if(var3 != hV.mS && var3 != hV.LH) {
                  if(var3.zs()) {
                     var8 = 12;
                  } else {
                     if(var3 != hV.cb) {
                        throw new RuntimeException();
                     }

                     var8 = 10;
                  }
               } else {
                  var8 = 11;
               }
            } else {
               var8 = 10;
            }

            if(var8 != var7) {
               throw new RuntimeException();
            } else {
               int var9 = (int)var6.ld(0);
               xy var10 = new xy(var9, var3);
               var4[0] = var6;
               return var10;
            }
         }
      }
   }

   private xy ld(int var1, int var2, hV var3, Wu[] var4) {
      ft var5 = this.zs.dN(var1);
      Wu var6 = null;
      if(var2 + 1 < var5.dN()) {
         var6 = (Wu)var5.dN(var2 + 1);
      } else if(var1 + 1 < this.zs.dN()) {
         var5 = this.zs.dN(var1 + 1);
         var6 = (Wu)var5.dN(0);
      }

      if(var6 == null) {
         return null;
      } else {
         int var7 = var6.fa();
         if(var7 != 10 && var7 != 11) {
            if(var7 != 12) {
               return null;
            } else {
               int var8 = (int)var6.ld(0);
               xy var9 = new xy(var8, var3);
               var4[0] = var6;
               return var9;
            }
         } else {
            throw new RuntimeException();
         }
      }
   }

   private Wu dN(Wu var1, int var2, List var3, List var4, ft var5, int var6) {
      this.zs.zs();
      Wu var7 = var1;
      int var8 = var2;
      List var9 = (List)((HashMap)this.zs.KK().get(var1)).get(Integer.valueOf(var2));
      if(var9 != null && var9.size() == 1) {
         Wu var10 = (Wu)var9.get(0);
         int var11 = var10.fa();
         if(var11 == 34 || var11 == 1023) {
            if(var10.ld(0) != (long)var2) {
               throw new RuntimeException();
            } else {
               return var10;
            }
         }
      }

      int var16 = var6;

      while(true) {
         List var17 = (List)((HashMap)this.zs.LH().get(var7)).get(Integer.valueOf(var8));
         if(var17 != null && var17.size() == 1) {
            int var12 = ((Integer)var17.get(0)).intValue();
            if(var12 >= 0 && var12 < var6) {
               Wu var13 = (Wu)var5.dN(var12);
               List var14 = (List)((HashMap)this.zs.mS().get(var13)).get(Integer.valueOf(var8));
               if(var14 != null && this.dN(var14, var16, var6)) {
                  int var15 = var13.fa();
                  if(var15 != 34 && var15 != 1023) {
                     if(var15 != 7 && var15 != 8 && var15 != 9) {
                        return null;
                     }

                     if(var13.ld(0) != (long)var8) {
                        throw new RuntimeException();
                     }

                     var8 = (int)var13.ld(1);
                     var7 = var13;
                     var3.add(Integer.valueOf(var8));
                     var4.add(var13);
                     var16 = var12;
                     continue;
                  }

                  if(var13.ld(0) != (long)var8) {
                     throw new RuntimeException();
                  }

                  return var13;
               }

               return null;
            }

            return null;
         }

         return null;
      }
   }

   private boolean dN(List var1, int var2, int var3) {
      Iterator var4 = var1.iterator();

      int var5;
      do {
         if(!var4.hasNext()) {
            return true;
         }

         var5 = ((Integer)var4.next()).intValue();
      } while(var5 < 0 || var5 > var3 || var5 == var2);

      return false;
   }

   private static kn ld(int var0) {
      switch(var0) {
      case 32:
         return kn.s;
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
      case 67:
      case 68:
      case 69:
      case 70:
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 82:
      case 83:
      case 84:
      case 85:
      case 86:
      case 87:
      case 88:
      case 89:
      case 90:
      case 91:
      case 92:
      case 93:
      case 94:
      case 95:
      case 96:
      case 97:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 104:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 115:
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 122:
      default:
         throw new RuntimeException();
      case 50:
      case 56:
         return kn.Hv;
      case 51:
      case 57:
         return kn.VX;
      case 52:
      case 58:
         return kn.ci;
      case 53:
      case 59:
         return kn.bG;
      case 54:
      case 60:
         return kn.BQ;
      case 55:
      case 61:
         return kn.Ee;
      case 123:
      case 125:
      case 127:
      case 128:
         return kn.cb;
      case 124:
      case 126:
         return kn.PF;
      case 129:
      case 136:
      case 139:
         return kn.XZ;
      case 130:
      case 133:
      case 140:
         return kn.nA;
      case 131:
      case 134:
      case 137:
         return kn.Ai;
      case 132:
      case 135:
      case 138:
         return kn.Nh;
      case 141:
         return kn.De;
      case 142:
         return kn.rn;
      case 143:
         return kn.LR;
      case 144:
      case 155:
      case 166:
      case 171:
      case 176:
      case 187:
      case 198:
      case 203:
      case 208:
      case 216:
         return kn.dN;
      case 145:
      case 156:
      case 167:
      case 172:
      case 177:
      case 188:
      case 199:
      case 204:
      case 209:
      case 217:
         return kn.ld;
      case 146:
      case 157:
      case 168:
      case 173:
      case 178:
      case 189:
      case 200:
      case 205:
      case 210:
      case 218:
         return kn.QE;
      case 147:
      case 158:
      case 169:
      case 174:
      case 179:
      case 190:
      case 201:
      case 206:
      case 211:
      case 219:
         return kn.wU;
      case 148:
      case 159:
      case 170:
      case 175:
      case 180:
      case 191:
      case 202:
      case 207:
      case 212:
      case 220:
         return kn.fa;
      case 149:
      case 160:
      case 181:
      case 192:
      case 213:
      case 221:
         return kn.zs;
      case 150:
      case 161:
      case 182:
      case 193:
      case 214:
      case 222:
         return kn.mS;
      case 151:
      case 162:
      case 183:
      case 194:
      case 215:
      case 223:
         return kn.OK;
      case 152:
      case 163:
      case 184:
      case 195:
      case 224:
         return kn.LH;
      case 153:
      case 164:
      case 185:
      case 196:
      case 225:
         return kn.KK;
      case 154:
      case 165:
      case 186:
      case 197:
      case 226:
         return kn.EO;
      }
   }

   private static hV QE(int var0) {
      switch(var0) {
      case 45:
      case 46:
         return hV.OK;
      case 47:
      case 48:
         return hV.LH;
      case 49:
         return hV.mS;
      case 68:
      case 75:
      case 82:
      case 89:
      case 96:
      case 103:
      case 1791:
      case 3583:
      case 5375:
      case 7167:
         return hV.KK;
      case 69:
      case 76:
      case 83:
      case 90:
      case 97:
      case 104:
      case 2047:
      case 3839:
      case 5631:
      case 7423:
         return hV.EO;
      case 70:
      case 77:
      case 84:
      case 91:
      case 98:
      case 105:
      case 2303:
      case 4095:
      case 5887:
      case 7679:
         return hV.PF;
      case 71:
      case 78:
      case 85:
      case 92:
      case 99:
      case 106:
      case 2559:
      case 4351:
      case 6143:
      case 7935:
         return hV.ld;
      case 72:
      case 79:
      case 86:
      case 93:
      case 100:
      case 107:
      case 2815:
      case 4607:
      case 6399:
      case 8191:
         return hV.QE;
      case 73:
      case 80:
      case 87:
      case 94:
      case 101:
      case 108:
      case 3071:
      case 4863:
      case 6655:
      case 8447:
         return hV.wU;
      case 74:
      case 81:
      case 88:
      case 95:
      case 102:
      case 109:
      case 3327:
      case 5119:
      case 6911:
      case 8703:
         return hV.fa;
      case 123:
      case 124:
         return hV.cb;
      case 125:
      case 126:
         return hV.mS;
      case 127:
         return hV.OK;
      case 128:
         return hV.LH;
      case 144:
      case 145:
      case 146:
      case 147:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
         return hV.cb;
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 163:
      case 164:
      case 165:
         return hV.mS;
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
         return hV.OK;
      case 171:
      case 172:
      case 173:
      case 174:
      case 175:
         return hV.LH;
      case 176:
      case 177:
      case 178:
      case 179:
      case 180:
      case 181:
      case 182:
      case 183:
      case 184:
      case 185:
      case 186:
         return hV.cb;
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
         return hV.mS;
      case 198:
      case 199:
      case 200:
      case 201:
      case 202:
         return hV.OK;
      case 203:
      case 204:
      case 205:
      case 206:
      case 207:
         return hV.LH;
      default:
         throw new RuntimeException();
      }
   }

   public static boolean dN(Class var0) {
      boolean var1 = false;

      try {
         Object var2 = Class.forName(rP.dN(new byte[]{-56, 11, 23, 23, 79, 66, 13, 15, 9, 73, 109, 47, 13, 18, 0}, 1, 162)).getMethod(rP.dN(new byte[]{-45, 2, 17, 36, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7}, 1, 180), new Class[0]).invoke(var0, new Object[0]);
         Object var3 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13}, 2, 36)).getMethod(rP.dN(new byte[]{-67, 2, 17, 55, 44, 11, 1, 54, 60, 26, 7, 17, 6}, 1, 218), new Class[0]).invoke(var2, new Object[0]);
         Object var4 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86}, 2, 142)).getMethod(rP.dN(new byte[]{-30, 2, 17, 56, 35, 12, 2, 21, 29, 6, 1}, 1, 133), new Class[0]).invoke(var3, new Object[0]);
         Object var5 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 47}, 2, 211)).getMethod(rP.dN(new byte[]{47, 27, 58, 7, 27}, 1, 91), new Class[0]).invoke(var4, new Object[0]);
         Object var6 = Class.forName(rP.dN(new byte[]{-98, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9}, 1, 244)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 42}, 2, 90))}).newInstance(new Object[]{var5});
         var1 = dN(var6, var0);
      } catch (Exception var7) {
         ;
      }

      return var1;
   }

   private static boolean dN(Object var0, Class var1) {
      boolean var2 = false;

      try {
         Object var3 = Class.forName(rP.dN(new byte[]{18, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 120)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6}, 2, 112)), Boolean.TYPE}).newInstance(new Object[]{var0, Boolean.valueOf(true)});
         byte[] var4 = new byte[4096];
         String var5 = var1.getName().replace('.', '/') + ".class";
         Object var6 = Class.forName(rP.dN(new byte[]{109, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 7)).getMethod(rP.dN(new byte[]{36, 10, 4, 60, 28, 29, 21, 17}, 2, 75), new Class[]{String.class}).invoke(var3, new Object[]{var5});
         Object var7 = Class.forName(rP.dN(new byte[]{16, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 122)).getMethod(rP.dN(new byte[]{62, 2, 17, 61, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12}, 1, 89), new Class[]{Class.forName(rP.dN(new byte[]{54, 11, 23, 23, 79, 91, 1, 29, 5, 66, 84, 19, 25, 94, 116, 51, 25, 53, 43, 26, 6, 11}, 1, 92))}).invoke(var3, new Object[]{var6});
         Method var8 = Class.forName(rP.dN(new byte[]{-100, 11, 23, 23, 79, 71, 6, 65, 103, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12}, 1, 246)).getMethod(rP.dN(new byte[]{49, 10, 17, 29}, 2, 197), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});

         while(true) {
            if(((Integer)var8.invoke(var7, new Object[]{var4, Integer.valueOf(0), Integer.valueOf(var4.length)})).intValue() == -1) {
               Object[] var9 = (Object[])((Object[])Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73}, 2, 242)).getMethod(rP.dN(new byte[]{36, 10, 4, 58, 23, 27, 19, 1, 18, 73, 75, 2, 93, 69, 66}, 2, 176), new Class[0]).invoke(var6, new Object[0]));
               Object var10 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 82, 92, 75, 71, 2, 99, 87, 66, 69, 90, 74, 73, 44, 19, 21, 6}, 2, 117)).getMethod(rP.dN(new byte[]{36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26}, 2, 174), new Class[0]).invoke(var9[0], new Object[0]);
               Object var11 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 88, 87, 77, 86, 94, 70, 83, 83, 84, 64, 2, 114, 28, 51, 49, 22, 14, 9, 73, 2, 37, 1, 86}, 2, 21)).getMethod(rP.dN(new byte[]{36, 10, 4, 52, 29, 13, 18, 4, 1, 83}, 2, 69), new Class[0]).invoke(var10, new Object[0]);
               var2 = var11.toString().substring(10).substring(15, 30).equals(rP.dN(new byte[]{-27, 8, 3, 7, 2, 5, 2, 3, 4, 0, 0, 5, 5, 1, 14}, 1, 220));
               Class.forName(rP.dN(new byte[]{-29, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 137)).getMethod(rP.dN(new byte[]{-36, 15, 3, 28, 22}, 1, 191), new Class[0]).invoke(var3, new Object[0]);
               break;
            }
         }
      } catch (Exception var12) {
         ;
      }

      return var2;
   }

   class uK {
      private List dN = new ArrayList();

      public Cs dN(int var1) {
         Cs var2 = new Cs(var1);
         this.dN.add(var2);
         return var2;
      }

      public List dN() {
         return this.dN;
      }
   }
}
