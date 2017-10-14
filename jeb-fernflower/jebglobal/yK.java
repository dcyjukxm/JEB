package jebglobal;

import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Oa;
import jebglobal.Uk;
import jebglobal.hO;
import jebglobal.kg;
import jebglobal.nh;
import jebglobal.ub;
import jebglobal.xd;
import jebglobal.yL;

public final class yK implements Oa {
   private AR dN;
   private int ld;
   private int QE;
   private int wU;
   private int[] fa;
   private int zs;
   private xd mS;
   private Uk OK;
   private ub[] LH;
   private boolean KK = false;
   private int EO = -1;
   private int cb = -1;
   private int[] PF = null;
   private String Hw = null;
   private String rK = "";
   private int Ux;

   yK(AR var1, int var2, int var3, int var4, int var5, int[] var6, int var7, xd var8, Uk var9, ub[] var10) {
      this.dN = var1;
      this.ld = var3;
      this.QE = var4;
      this.wU = var5;
      this.fa = var6 == null?new int[0]:var6;
      this.zs = var7;
      this.mS = var8;
      this.OK = var9;
      this.LH = var10 == null?new ub[0]:var10;
      if(var8 != null) {
         this.bG();
      }

      String var11 = var1.dN(var3, false);
      int var12 = var11.lastIndexOf(47);
      if(var12 < 0) {
         var12 = 0;
      }

      String var13 = var11.substring(var12 + 1, var11.length() - 1);
      if(!this.KK) {
         this.Hw = var13;
      } else if(!this.BQ()) {
         this.Hw = var13;
      }

   }

   private void bG() {
      xd.vd var1 = this.mS.dN();
      if(var1 != null) {
         for(int var2 = 0; var2 < var1.dN(); ++var2) {
            xd.uK var3 = var1.dN(var2);
            if(var3.dN() == 2) {
               kg var4 = var3.ld();
               String var5 = this.dN.dN(var4.dN(), false);
               boolean var6;
               kg.uK[] var7;
               int var8;
               int var9;
               kg.uK var10;
               String var11;
               if(var5.equals("Ldalvik/annotation/InnerClass;")) {
                  this.KK = true;
                  var6 = false;
                  var7 = var4.ld();
                  var8 = var7.length;

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var7[var9];
                     var11 = this.dN.dN(var10.dN());
                     if(var11.equals("name")) {
                        if(var10.ld().ld()) {
                           this.Hw = "";
                        } else {
                           this.Hw = this.dN.dN(var10.ld().KK());
                        }

                        var6 = true;
                     }
                  }

                  if(!var6) {
                     throw new yL();
                  }
               } else if(var5.equals("Ldalvik/annotation/EnclosingClass;")) {
                  var6 = false;
                  var7 = var4.ld();
                  var8 = var7.length;

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var7[var9];
                     var11 = this.dN.dN(var10.dN());
                     if(var11.equals("value")) {
                        this.EO = var10.ld().EO();
                        var6 = true;
                     }
                  }

                  if(!var6) {
                     throw new yL();
                  }
               } else if(var5.equals("Ldalvik/annotation/EnclosingMethod;")) {
                  var6 = false;
                  var7 = var4.ld();
                  var8 = var7.length;

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var7[var9];
                     var11 = this.dN.dN(var10.dN());
                     if(var11.equals("value")) {
                        this.cb = var10.ld().PF();
                        var6 = true;
                     }
                  }

                  if(!var6) {
                     throw new yL();
                  }
               } else if(var5.equals("Ldalvik/annotation/MemberClasses;")) {
                  var6 = false;
                  var7 = var4.ld();
                  var8 = var7.length;

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var7[var9];
                     var11 = this.dN.dN(var10.dN());
                     if(var11.equals("value")) {
                        this.PF = new int[var10.ld().rK().length];
                        int var12 = 0;
                        ub[] var13 = var10.ld().rK();
                        int var14 = var13.length;

                        for(int var15 = 0; var15 < var14; ++var15) {
                           ub var16 = var13[var15];
                           this.PF[var12++] = var16.EO();
                        }

                        var6 = true;
                     }
                  }

                  if(!var6) {
                     throw new yL();
                  }
               }
            }
         }

         if(this.KK) {
            if(this.EO < 0) {
               int var10000 = this.cb;
            }

            if(this.EO >= 0 && this.cb >= 0) {
               throw new yL();
            }
         }
      }

      xd.eI[] var26 = this.mS.QE();
      if(var26 != null) {
         xd.eI[] var27 = var26;
         int var28 = var26.length;

         for(int var29 = 0; var29 < var28; ++var29) {
            xd.eI var31 = var27[var29];
            hO var30 = this.dN.mS(var31.dN());
            AV var32 = this.dN.QE(var30.wU(false));
            if(var32 == null) {
               throw new yL();
            }

            xd.uK[] var34 = var31.ld().ld();
            int var33 = var34.length;

            for(int var35 = 0; var35 < var33; ++var35) {
               xd.uK var36 = var34[var35];
               if(var36.dN() == 2) {
                  kg var37 = var36.ld();
                  String var38 = this.dN.dN(var37.dN(), false);
                  if(var38.equals("Ldalvik/annotation/Throws;")) {
                     int[] var39 = null;
                     kg.uK[] var40 = var37.ld();
                     int var17 = var40.length;

                     for(int var18 = 0; var18 < var17; ++var18) {
                        kg.uK var19 = var40[var18];
                        String var20 = this.dN.dN(var19.dN());
                        if(var20.equals("value")) {
                           var39 = new int[var19.ld().rK().length];
                           int var21 = 0;
                           ub[] var22 = var19.ld().rK();
                           int var23 = var22.length;

                           for(int var24 = 0; var24 < var23; ++var24) {
                              ub var25 = var22[var24];
                              var39[var21++] = var25.EO();
                           }
                        }
                     }

                     if(var39 == null) {
                        throw new yL();
                     }

                     var32.dN(var39);
                  }
               }
            }
         }
      }

   }

   private boolean BQ() {
      String var1 = this.dN(false);
      if(!var1.endsWith(this.Hw + ";")) {
         return false;
      } else {
         int var2 = var1.length() - 1 - this.Hw.length();
         char var4 = 32;

         int var3;
         for(var3 = var2 - 1; var3 >= 0; --var3) {
            var4 = var1.charAt(var3);
            if(var4 == 47 || var4 == 36) {
               break;
            }
         }

         if(var4 != 36) {
            return false;
         } else {
            this.rK = var1.substring(var3 + 1, var2);

            for(int var5 = 0; var5 < this.rK.length(); ++var5) {
               if(!Character.isDigit(this.rK.charAt(var5))) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public boolean dN() {
      return this.KK;
   }

   public boolean ld() {
      return this.KK && this.Hw == "";
   }

   public int QE() {
      return this.EO;
   }

   public int wU() {
      return this.cb;
   }

   public int[] fa() {
      return this.PF;
   }

   public String dN(boolean var1) {
      return this.dN.dN(this.ld, var1);
   }

   public String ld(boolean var1) {
      return this.dN.dN(this.ld, var1);
   }

   public int zs() {
      return this.ld;
   }

   public String QE(boolean var1) {
      return !var1?this.Hw:((nh.vd)this.dN.mS().dN(this.ld)).ld(true);
   }

   public String mS() {
      return this.rK;
   }

   public boolean dN(String var1) {
      return ((nh.vd)this.dN.mS().dN(this.ld)).dN(var1);
   }

   public boolean OK() {
      return ((nh.vd)this.dN.mS().dN(this.ld)).LH();
   }

   public int LH() {
      return this.QE;
   }

   public boolean KK() {
      return (this.QE & 25088) == 0;
   }

   public boolean EO() {
      return (this.QE & 16384) != 0;
   }

   public boolean cb() {
      return (this.QE & 512) != 0;
   }

   public boolean PF() {
      return (this.QE & 8192) != 0;
   }

   public String wU(boolean var1) {
      return this.wU < 0?"Ljava/lang/Object;":this.dN.dN(this.wU, var1);
   }

   public int Hw() {
      return this.wU;
   }

   public String[] fa(boolean var1) {
      String[] var2 = new String[this.fa.length];
      int var3 = 0;
      int[] var4 = this.fa;
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var4[var6];
         var2[var3] = this.dN.dN(var7, var1);
         ++var3;
      }

      return var2;
   }

   public int[] rK() {
      return this.fa;
   }

   public int Ux() {
      return this.zs;
   }

   public ub[] ZY() {
      return this.LH;
   }

   public Uk s() {
      return this.OK;
   }

   public xd Hv() {
      return this.mS;
   }

   public xd.uK[] VX() {
      if(this.mS != null) {
         xd.vd var1 = this.mS.dN();
         if(var1 != null) {
            return var1.ld();
         }
      }

      return null;
   }

   public xd.uK[] dN(int var1) {
      if(this.mS != null) {
         xd.lX[] var2 = this.mS.ld();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            xd.lX var5 = var2[var4];
            int var6 = var5.dN();
            if(var6 == var1) {
               return var5.ld().ld();
            }

            if(var6 > var1) {
               break;
            }
         }
      }

      return null;
   }

   public xd.uK[] ld(int var1) {
      if(this.mS != null) {
         xd.eI[] var2 = this.mS.QE();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            xd.eI var5 = var2[var4];
            int var6 = var5.dN();
            if(var6 == var1) {
               return var5.ld().ld();
            }

            if(var6 > var1) {
               break;
            }
         }
      }

      return null;
   }

   public xd.vd[] QE(int var1) {
      if(this.mS != null) {
         xd.vn[] var2 = this.mS.wU();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            xd.vn var5 = var2[var4];
            int var6 = var5.dN();
            if(var6 == var1) {
               return var5.ld();
            }

            if(var6 > var1) {
               break;
            }
         }
      }

      return null;
   }

   public int ci() {
      return this.Ux;
   }

   public void wU(int var1) {
      this.Ux = var1;
   }

   public String toString() {
      return super.toString();
   }
}
