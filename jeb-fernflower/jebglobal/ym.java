package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.CQ;
import jebglobal.DL;
import jebglobal.ME;
import jebglobal.OD;
import jebglobal.OM;
import jebglobal.Oa;
import jebglobal.Tg;
import jebglobal.Uk;
import jebglobal.Wu;
import jebglobal.XV;
import jebglobal.Xo;
import jebglobal.ZF;
import jebglobal.Zh;
import jebglobal.bm;
import jebglobal.bt;
import jebglobal.ft;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.kg;
import jebglobal.nh;
import jebglobal.nm;
import jebglobal.oh;
import jebglobal.rT;
import jebglobal.u;
import jebglobal.ub;
import jebglobal.vD;
import jebglobal.xd;
import jebglobal.yK;

public final class ym {
   private AR dN;
   private ME ld;

   public ym(AR var1) {
      this.dN = var1;
   }

   public void dN(ME var1) {
      this.ld = var1;
      var1.QE("          ");
      this.dN();
   }

   private void dN() {
      Iterator var1 = this.dN.Hw().iterator();

      while(var1.hasNext()) {
         yK var2 = (yK)var1.next();
         int var3 = this.ld.LH();
         this.ld.dN(rT.dN);
         this.ld.s();
         CQ.dN(this.ld, var2.LH(), -1);
         this.ld.dN(this.dN, var2.zs(), true);
         if(this.ld.ZY != null) {
            this.dN(this.ld.ZY.wU(var2.zs()));
         }

         this.ld.QE();
         this.ld.dN(rT.ld);
         this.ld.s();
         int var4 = var2.Hw();
         if(var4 >= 0) {
            this.ld.wU(this.dN, var4);
         } else {
            String var5 = var2.wU(true);
            this.ld.dN(var5, Zh.rK, this.dN.KK(var5));
         }

         this.ld.QE();
         if(this.ld.mS) {
            this.ld.dN(DL.dN);
            this.ld.s();
            this.ld.dN(this.dN, var2.Ux());
            this.ld.QE();
         }

         this.ld.QE();
         int[] var18 = var2.rK();
         int var8;
         int var9;
         if(var18.length > 0) {
            int[] var6 = var18;
            int var7 = var18.length;

            for(var8 = 0; var8 < var7; ++var8) {
               var9 = var6[var8];
               this.ld.dN(rT.QE);
               this.ld.s();
               this.ld.wU(this.dN, var9);
               this.ld.QE();
            }

            this.ld.QE();
         }

         if(this.ld.zs) {
            xd.uK[] var19 = var2.VX();
            if(var19 != null) {
               xd.uK[] var21 = var19;
               var8 = var19.length;

               for(var9 = 0; var9 < var8; ++var9) {
                  xd.uK var10 = var21[var9];
                  this.dN(var10);
                  this.ld.QE();
               }
            }
         }

         Uk var20 = var2.s();
         if(var20 != null) {
            if(!var20.QE().isEmpty()) {
               ub[] var22 = var2.ZY();
               if(var22.length > var20.dN().size()) {
                  throw new RuntimeException();
               }

               var8 = 0;
               Iterator var26 = var20.QE().iterator();

               while(var26.hasNext()) {
                  XV var28 = (XV)var26.next();
                  int var11 = this.ld.LH();
                  gE var12 = this.dN.fa(var28.dN());
                  this.ld.dN(rT.OK);
                  this.ld.s();
                  CQ.dN(this.ld, var28.ld(), -1);
                  this.ld.dN(var12.QE(true), Zh.Ux, 1, var12, (Object)null);
                  this.ld.wU(":");
                  this.ld.dN(this.dN, var12.mS());
                  if(var28.QE() && var8 < var22.length) {
                     this.ld.wU(" = ");
                     this.dN(var22[var8++]);
                  }

                  if(this.ld.ZY != null) {
                     this.dN(this.ld.ZY.zs(var28.dN()));
                  }

                  this.ld.QE();
                  if(this.ld.zs) {
                     xd.uK[] var13 = var2.dN(var28.dN());
                     if(var13 != null) {
                        this.ld.rK();
                        xd.uK[] var14 = var13;
                        int var15 = var13.length;

                        for(int var16 = 0; var16 < var15; ++var16) {
                           xd.uK var17 = var14[var16];
                           this.dN(var17);
                        }

                        this.ld.Ux();
                        this.ld.dN(rT.LH);
                        this.ld.QE();
                     }
                  }

                  String var31 = var12.fa(false);
                  this.ld.PF.put(var31, Integer.valueOf(var11));
                  this.ld.Ux.add(new ME.uK(var31, var11, this.ld.LH()));
               }

               this.ld.QE();
            }

            Iterator var23 = var20.zs().iterator();

            while(var23.hasNext()) {
               AV var25 = (AV)var23.next();
               hO var27 = this.dN.mS(var25.ld());
               int var29 = this.ld.LH();
               this.ld.dN(rT.KK);
               this.ld.s();
               CQ.dN(this.ld, var25.QE(), -1);
               this.ld.dN(var27.ld(true), Zh.ZY, 1, var27, (Object)null);
               this.ld.dN(this.dN, var27.OK());
               if(this.ld.ZY != null) {
                  this.dN(this.ld.ZY.fa(var25.ld()));
               }

               this.ld.QE();
               this.ld.EO();
               this.dN(var2, var25);
               this.ld.cb();
               this.ld.dN(rT.EO);
               this.ld.QE();
               this.ld.QE();
               ME var10000 = this.ld;
               String var30 = var27.wU(false);
               this.ld.PF.put(var30, Integer.valueOf(var29));
               this.ld.rK.add(new ME.uK(var30, var29, this.ld.LH()));
            }
         }

         if(this.ld.wU != null) {
            this.ld.dN((String)this.ld.wU, (Zh)Zh.ld);
            this.ld.QE();
         }

         String var24 = var2.ld(false);
         this.ld.PF.put(var24, Integer.valueOf(var3));
         this.ld.Hw.add(new ME.uK(var24, var3, this.ld.LH()));
      }

   }

   private void dN(yK var1, AV var2) {
      OM var3 = var2.wU();
      if(var3 != null) {
         this.ld.dN(rT.bG);
         this.ld.wU(String.format(" %d", new Object[]{Integer.valueOf(var3.zs())}));
         this.ld.QE();
      }

      vD var4 = null;
      if(var3 != null && this.ld.mS) {
         var4 = var3.KK();
      }

      int var8;
      if(this.ld.zs) {
         xd.uK[] var5 = var1.ld(var2.ld());
         if(var5 != null) {
            xd.uK[] var6 = var5;
            int var7 = var5.length;

            for(var8 = 0; var8 < var7; ++var8) {
               xd.uK var9 = var6[var8];
               this.dN(var9);
            }
         }
      }

      int var30 = var2.zs()?0:1;
      String var31 = this.dN.mS(var2.ld()).OK().QE();
      ArrayList var32 = new ArrayList();

      for(var8 = 1; var8 < var31.length(); ++var8) {
         var32.add(Integer.valueOf(var30));
         switch(var31.charAt(var8)) {
         case 'B':
         case 'C':
         case 'F':
         case 'I':
         case 'L':
         case 'S':
         case 'Z':
            ++var30;
            break;
         case 'D':
         case 'J':
            var30 += 2;
         case 'E':
         case 'G':
         case 'H':
         case 'K':
         case 'M':
         case 'N':
         case 'O':
         case 'P':
         case 'Q':
         case 'R':
         case 'T':
         case 'U':
         case 'V':
         case 'W':
         case 'X':
         case 'Y':
         }
      }

      boolean var33 = false;
      int var13;
      int var14;
      int var17;
      int var18;
      if(this.ld.zs) {
         xd.vd[] var34 = var1.QE(var2.ld());
         if(var34 != null) {
            int[] var10 = null;
            if(var4 != null) {
               var10 = var4.dN();
               var33 = true;
            }

            int var11 = 0;
            xd.vd[] var12 = var34;
            var13 = var34.length;

            for(var14 = 0; var14 < var13; ++var14) {
               xd.vd var15 = var12[var14];
               this.ld.dN(rT.cb);
               this.ld.wU(String.format(" p%d", new Object[]{Integer.valueOf(var11 < var32.size()?((Integer)var32.get(var11)).intValue():-1)}));
               if(var10 != null && var11 < var10.length) {
                  this.ld.wU(", ");
                  this.ld.dN(this.dN, var10[var11]);
               }

               this.ld.QE();
               this.ld.rK();
               xd.uK[] var16 = var15.ld();
               var17 = var16.length;

               for(var18 = 0; var18 < var17; ++var18) {
                  xd.uK var19 = var16[var18];
                  this.dN(var19);
               }

               this.ld.Ux();
               this.ld.dN(rT.PF);
               this.ld.QE();
               ++var11;
            }
         }
      }

      if(var3 != null) {
         int var35 = var3.zs() - var30;
         int var40;
         if(var4 != null && !var33) {
            int var36 = 0;
            int[] var37 = var4.dN();
            var40 = var37.length;

            for(var13 = 0; var13 < var40; ++var13) {
               var14 = var37[var13];
               this.ld.dN(rT.cb);
               this.ld.wU(String.format(" p%d, ", new Object[]{Integer.valueOf(var36 < var32.size()?((Integer)var32.get(var36)).intValue():-1)}));
               this.ld.dN(this.dN, var14);
               this.ld.QE();
               ++var36;
            }
         }

         oh var38 = var3.fa();
         if(var38 != null) {
            this.ld.cb();
            ArrayList var39 = new ArrayList();
            var40 = 0;

            int var22;
            Iterator var41;
            int var56;
            for(var41 = var38.ld().iterator(); var41.hasNext(); ++var40) {
               ft var43 = (ft)var41.next();
               if(this.ld.KK && var40 > 0) {
                  this.ld.QE();
               }

               if(!var43.ld() && ((Wu)var43.dN(0)).dN() > 0) {
                  this.dN(var43.dN(0), var3, true);
                  this.ld.QE();
               }

               Wu var47;
               for(Iterator var44 = var43.wU().iterator(); var44.hasNext(); this.ld.dN((Oa)(new Tg(var47.dN())))) {
                  var47 = (Wu)var44.next();
                  var17 = var47.dN();
                  var18 = var47.OK();
                  if(var4 != null) {
                     this.ld.EO();
                     vD.uK var51 = var4.dN(var17 / 2);
                     if(var51.fa >= 0) {
                        this.ld.dN(DL.dN);
                        this.ld.s();
                        this.ld.dN(this.dN, var51.fa);
                        this.ld.QE();
                     }

                     if(var51.QE) {
                        this.ld.dN(DL.ld);
                        this.ld.QE();
                     }

                     if(var51.wU) {
                        this.ld.dN(DL.QE);
                        this.ld.QE();
                     }

                     if(this.ld.OK && var51.dN >= 0) {
                        this.ld.dN(DL.wU);
                        this.ld.wU(" " + var51.dN);
                        this.ld.QE();
                     }

                     if(var51.ld != null) {
                        Iterator var20 = var51.ld.iterator();

                        while(var20.hasNext()) {
                           vD.vd var21 = (vD.vd)var20.next();
                           this.ld.dN(DL.fa);
                           this.ld.wU(String.format(" v%d, %s:%s", new Object[]{Integer.valueOf(var21.ld()), this.dN.dN(var21.QE(), "", true), this.dN.dN(var21.wU(), false)}));
                           this.ld.QE();
                        }
                     }

                     this.ld.cb();
                  }

                  this.dN(var17);
                  String var54;
                  if(this.ld.ld > 0) {
                     var54 = ZF.ld(var47.zs(), 0, var47.ld(), this.ld.ld);
                     this.ld.dN((String)var54, (Zh)Zh.wU);
                  }

                  var54 = var47.wU();
                  this.ld.dN(var54, Zh.mS, var54);
                  if(var18 >= 1) {
                     var56 = Math.max(1, this.ld.QE - var54.length());
                     this.ld.OK(var56);
                  }

                  var56 = var47.fa();
                  if(var56 == 43 || var56 == 44 || var56 == 38) {
                     var39.add(var47);
                  }

                  boolean var60 = false;
                  if(this.ld.EO && var18 > 1 && (var56 >= 110 && var56 <= 114 || var56 >= 116 && var56 <= 120 || var56 == 36 || var56 == 37 || var56 >= 8959 && var56 <= 9983 || var56 == 1535)) {
                     var60 = true;
                  }

                  for(var22 = 0; var22 < var18; ++var22) {
                     int var23;
                     long var24;
                     if(var60) {
                        var23 = var47.dN((var22 + 1) % var18);
                        var24 = var47.ld((var22 + 1) % var18);
                        if(var22 == 0) {
                           this.ld.wU("{");
                        } else if(var22 == var18 - 1) {
                           this.ld.wU("}");
                        }
                     } else {
                        var23 = var47.dN(var22);
                        var24 = var47.ld(var22);
                     }

                     if(var22 >= 1) {
                        this.ld.wU(", ");
                     }

                     int var65;
                     if(var23 == 0) {
                        var65 = (int)var24;
                        if(this.ld.LH && var65 >= var35) {
                           this.ld.wU(String.format("p%d", new Object[]{Integer.valueOf(var65 - var35)}));
                        } else {
                           this.ld.wU(String.format("v%d", new Object[]{Integer.valueOf(var65)}));
                        }
                     } else if(var23 == 1) {
                        Long var26 = this.dN.dN(var24);
                        this.ld.dN(String.format("0x%X", new Object[]{Long.valueOf(var24)}), Zh.cb, var26);
                        if(var24 >= 10L && var24 <= 2147483647L) {
                           int var27 = (int)var24;
                           if(this.ld.cb != null && this.ld.ZY != null) {
                              Xo var28 = this.ld.cb.dN(var27);
                              if(var28 != null) {
                                 String var29 = String.format("R.%s.%s", new Object[]{var28.dN(), var28.ld()});
                                 var29 = ZF.QE(var29, true);
                                 if(this.ld.ZY.QE(var3.dN(), var47.dN()) == null) {
                                    this.ld.ZY.dN(OD.vd.fa, var3.dN(), var47.dN(), var29, (byte[])null);
                                 }
                              }
                           }
                        }
                     } else if(var23 == 2) {
                        var65 = (int)var24;
                        if(Wu.QE(var56)) {
                           this.ld.dN(this.dN, var65);
                        } else if(Wu.wU(var56)) {
                           this.ld.dN(this.dN, this.dN.QE(var65));
                        } else if(Wu.fa(var56)) {
                           this.ld.QE(this.dN, var65);
                        } else {
                           if(!Wu.zs(var56)) {
                              throw new RuntimeException();
                           }

                           this.ld.ld(this.dN, var65);
                        }
                     } else if(var23 == 3) {
                        var65 = var47.dN() + (int)var24 * 2;
                        this.dN(var65, var3, false);
                     } else {
                        if(var23 != 4) {
                           throw new RuntimeException();
                        }

                        this.ld.wU(String.format("v%d .. v%d", new Object[]{Long.valueOf(var24 & 65535L), Long.valueOf(var24 >> 32 & 65535L)}));
                     }
                  }

                  if(this.ld.ZY != null) {
                     this.dN(this.ld.ZY.QE(var3.dN(), var47.dN()));
                  }
               }
            }

            this.ld.EO();
            nm[] var42 = var3.LH();
            var14 = var42.length;

            int var45;
            for(var45 = 0; var45 < var14; ++var45) {
               nm var48 = var42[var45];
               var17 = var48.dN();
               var18 = var48.QE();
               Iterator var55 = var48.wU().iterator();

               while(var55.hasNext()) {
                  bt var58 = (bt)var55.next();
                  if(var58.dN()) {
                     this.ld.dN(rT.Hw);
                     this.ld.s();
                     nh.vd var63 = this.dN.QE(var58.ld());
                     this.ld.dN(this.dN, var63);
                     this.ld.s();
                  } else {
                     this.ld.dN(rT.rK);
                     this.ld.s();
                  }

                  this.ld.wU("{");
                  this.dN(var17, var3, false);
                  this.ld.wU(" .. ");
                  this.dN(var18, var3, false);
                  this.ld.wU("} ");
                  this.dN(var58.QE(), var3, false);
                  this.ld.QE();
               }
            }

            var41 = var39.iterator();

            while(true) {
               while(var41.hasNext()) {
                  Wu var46 = (Wu)var41.next();
                  var45 = var46.fa();
                  Wu.lX.uK[] var50;
                  int var64;
                  if(var45 == 43) {
                     this.ld.cb();
                     this.dN(var46.LH().dN());
                     this.ld.dN(rT.Ux);
                     var50 = var46.cb();
                     if(var50.length >= 1) {
                        var17 = var50[0].dN();
                        this.ld.wU(String.format(" 0x%X", new Object[]{Integer.valueOf(var17)}));
                     }

                     this.ld.QE();
                     this.ld.EO();
                     this.ld.rK();
                     Wu.lX.uK[] var52 = var50;
                     var18 = var50.length;

                     for(int var59 = 0; var59 < var18; ++var59) {
                        Wu.lX.uK var62 = var52[var59];
                        var64 = var46.dN() + var62.ld() * 2;
                        this.dN(var64, var3, false);
                        this.ld.QE();
                     }

                     this.ld.Ux();
                     this.ld.dN(rT.ZY);
                     this.ld.QE();
                  } else if(var45 == 44) {
                     this.ld.cb();
                     this.dN(var46.LH().dN());
                     this.ld.dN(rT.s);
                     this.ld.QE();
                     this.ld.EO();
                     this.ld.rK();
                     var50 = var46.cb();
                     var17 = var50.length;

                     for(var18 = 0; var18 < var17; ++var18) {
                        Wu.lX.uK var57 = var50[var18];
                        var56 = var46.dN() + var57.ld() * 2;
                        this.ld.wU(String.format("0x%X -> ", new Object[]{Integer.valueOf(var57.dN())}));
                        this.dN(var56, var3, false);
                        this.ld.QE();
                     }

                     this.ld.Ux();
                     this.ld.dN(rT.Hv);
                     this.ld.QE();
                  } else {
                     if(var45 != 38) {
                        throw new RuntimeException();
                     }

                     this.ld.cb();
                     this.dN(var46.PF().dN());
                     this.ld.dN(rT.VX);
                     byte[][] var49 = var46.Hw();
                     this.ld.wU(String.format(" %d", new Object[]{Integer.valueOf(var49[0].length)}));
                     if(!this.ld.EO) {
                        this.ld.wU(String.format(" x 0x%X", new Object[]{Integer.valueOf(var49.length)}));
                     }

                     this.ld.QE();
                     this.ld.EO();
                     this.ld.rK();

                     for(var17 = 0; var17 < var49.length; ++var17) {
                        byte[] var61 = var49[var17];
                        long var53;
                        switch(var61.length) {
                        case 1:
                           var53 = (long)var61[0];
                           break;
                        case 2:
                           var53 = (long)(var61[0] | var61[1] << 8);
                           break;
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                        default:
                           var53 = 0L;
                           break;
                        case 4:
                           var53 = (long)(var61[0] | var61[1] << 8 | var61[2] << 16 | var61[3] << 24);
                           break;
                        case 8:
                           var64 = var61[0] | var61[1] << 8 | var61[2] << 16 | var61[3] << 24;
                           var22 = var61[4] | var61[5] << 8 | var61[6] << 16 | var61[7] << 24;
                           var53 = (long)var64 | (long)var22 << 32;
                        }

                        if(var53 >= 0L) {
                           this.ld.wU(String.format("0x%X", new Object[]{Long.valueOf(var53)}));
                        } else {
                           this.ld.wU(String.format("-0x%X", new Object[]{Long.valueOf(-var53)}));
                        }

                        if(this.ld.EO) {
                           this.ld.wU("t");
                        }

                        this.ld.QE();
                     }

                     this.ld.Ux();
                     this.ld.dN(rT.ci);
                     this.ld.QE();
                  }
               }

               this.ld.cb();
               return;
            }
         }
      }
   }

   private void dN(bm var1, OM var2, boolean var3) {
      int var4 = var1.dN();
      String var5 = null;
      if(this.ld.ZY != null) {
         u var6 = this.ld.ZY.dN(var2.dN(), var4);
         if(var6 != null && var6.LH()) {
            var5 = var6.Hw();
         }
      }

      if(var5 == null) {
         var5 = OM.QE(var4);
      }

      this.ld.dN(":" + var5, Zh.LH, var3?1:0, var1, var2);
   }

   private void dN(int var1, OM var2, boolean var3) {
      Wu var4 = var2.ld(var1);
      if(var4 == null) {
         String var5 = OM.QE(var1);
         this.ld.dN((String)(":" + var5), (Zh)Zh.LH);
      } else {
         this.dN(var4, var2, var3);
      }
   }

   private void dN(int var1) {
      if(this.ld.dN && var1 >= 0) {
         String var2 = String.format("%08X", new Object[]{Integer.valueOf(var1)});
         this.ld.dN((String)var2, (Zh)Zh.QE);
         this.ld.OK(2);
      } else {
         this.ld.OK(10);
      }

   }

   private void dN(OD var1) {
      if(var1 != null) {
         String var2 = var1.PF();
         byte[] var3 = var1.Hw();
         if(var2 != null || var3 != null) {
            String var4 = "  #";
            var4 = var4 + (var3 != null?"(!) ":" ");
            var4 = var4 + (var2 != null?var2:"");
            this.ld.dN((String)var4, (Zh)Zh.ld);
         }
      }

   }

   private void dN(xd.uK var1) {
      kg var2 = var1.ld();
      this.ld.dN(rT.wU);
      this.ld.s();
      this.ld(var1.dN());
      this.dN(var2);
      this.ld.dN(rT.fa);
      this.ld.QE();
   }

   private void dN(kg var1) {
      this.ld.dN(this.dN, this.dN.QE(var1.dN()));
      this.ld.QE();
      this.ld.rK();
      kg.uK[] var2 = var1.ld();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         kg.uK var5 = var2[var4];
         String var6 = this.dN.dN(var5.dN(), "", true);
         ub var7 = var5.ld();
         this.ld.wU(var6);
         this.ld.wU(" = ");
         this.dN(var7);
         this.ld.QE();
      }

      this.ld.Ux();
   }

   private void ld(int var1) {
      if(var1 == 0) {
         this.ld.wU("build ");
      } else if(var1 == 1) {
         this.ld.wU("runtime ");
      } else if(var1 == 2) {
         this.ld.wU("system ");
      } else {
         this.ld.wU("unknown-visibility ");
      }

   }

   private void ld(kg var1) {
      this.ld.dN(rT.zs);
      this.ld.s();
      this.dN(var1);
      this.ld.dN(rT.mS);
      this.ld.QE();
   }

   private void dN(ub var1) {
      switch(var1.dN()) {
      case 0:
         this.ld.wU(String.format("0x%X", new Object[]{Byte.valueOf(var1.QE())}));
         break;
      case 1:
      case 5:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      default:
         this.ld.wU("<unknown value>");
         break;
      case 2:
         this.ld.wU(String.format("0x%X", new Object[]{Short.valueOf(var1.wU())}));
         break;
      case 3:
         this.ld.wU(String.format("\'%s\'", new Object[]{ZF.dN(var1.fa(), !this.ld.EO)}));
         break;
      case 4:
         this.ld.wU(String.format("0x%X", new Object[]{Integer.valueOf(var1.zs())}));
         break;
      case 6:
         this.ld.wU(String.format("0x%XL", new Object[]{Long.valueOf(var1.mS())}));
         break;
      case 16:
         this.ld.wU(String.format("%ff", new Object[]{Float.valueOf(var1.OK())}));
         break;
      case 17:
         this.ld.wU(String.format("%f", new Object[]{Double.valueOf(var1.LH())}));
         break;
      case 23:
         this.ld.dN(this.dN, var1.KK());
         break;
      case 24:
         this.ld.wU(this.dN, var1.EO());
         break;
      case 25:
         this.ld.QE(this.dN, var1.cb());
         break;
      case 26:
         this.ld.ld(this.dN, var1.PF());
         break;
      case 27:
         this.ld.QE(this.dN, var1.Hw());
         break;
      case 28:
         this.ld.wU("{");
         this.ld.QE();
         this.ld.rK();
         int var2 = 0;
         ub[] var3 = var1.rK();
         ub[] var4 = var3;
         int var5 = var3.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            ub var7 = var4[var6];
            this.dN(var7);
            ++var2;
            if(var2 < var3.length) {
               this.ld.wU(",");
            }

            this.ld.QE();
         }

         this.ld.Ux();
         this.ld.wU("}");
         break;
      case 29:
         this.ld(var1.Ux());
         break;
      case 30:
         this.ld.wU("null");
         break;
      case 31:
         this.ld.wU(String.format("%s", new Object[]{Boolean.valueOf(var1.ZY())}));
      }

   }
}
