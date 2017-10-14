package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jebglobal.AR;
import jebglobal.GH;
import jebglobal.IK;
import jebglobal.OX;
import jebglobal.TM;
import jebglobal.XV;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.cI;
import jebglobal.gE;
import jebglobal.hV;
import jebglobal.hY;
import jebglobal.js;
import jebglobal.kg;
import jebglobal.lM;
import jebglobal.oc;
import jebglobal.ub;
import jebglobal.xd;
import jebglobal.yK;
import jebglobal.zd;

public final class Dw extends cI {
   private AR dN;
   private boolean ld;
   private int QE;
   private String wU;
   private hV fa;
   private int zs;
   private Xf mS;
   private List OK;

   private Dw(AR var1, hV.uK var2, OX.vd var3, GH var4, boolean var5, int var6, String var7, String var8, hV var9, int var10) {
      this.dN = var1;
      this.ld = var5;
      this.QE = var6;
      this.fa = var9;
      this.wU = var8;
      this.zs = var10;
      if(!var5) {
         if(var4 != null) {
            this.OK = new ArrayList();
            gE var11 = var1.fa(var6);
            yK var12 = var1.EO(var11.dN(false));
            xd var13 = var12.Hv();
            if(var13 != null) {
               xd.lX[] var14 = var13.ld();
               int var15 = var14.length;

               for(int var16 = 0; var16 < var15; ++var16) {
                  xd.lX var17 = var14[var16];
                  if(var17.dN() == var6) {
                     xd.uK[] var18 = var17.ld().ld();
                     int var19 = var18.length;

                     for(int var20 = 0; var20 < var19; ++var20) {
                        xd.uK var21 = var18[var20];
                        if(var21.dN() != 2) {
                           int var22 = var21.ld().dN();
                           hV var23 = var2.dN(var1.dN(var22, false));
                           lM var24 = new lM(var23);
                           kg.uK[] var25 = var21.ld().ld();
                           int var26 = var25.length;

                           for(int var27 = 0; var27 < var26; ++var27) {
                              kg.uK var28 = var25[var27];
                              OX var29 = var3.dN(var1.dN(var28.dN()));
                              Xf var30 = var4.dN(var28.ld());
                              var24.dN(var29, var30);
                           }

                           this.OK.add(var24);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public boolean ld() {
      return (this.zs & 8) != 0;
   }

   public boolean QE() {
      return (this.zs & 4096) != 0;
   }

   public int fa() {
      return this.QE;
   }

   public String zs() {
      return this.wU;
   }

   public String mS() {
      return this.dN.fa(this.QE).fa(false);
   }

   public hV OK() {
      return this.fa;
   }

   public void dN(Xf var1) {
      this.mS = var1;
   }

   public Xf LH() {
      return this.mS;
   }

   public void ld(ZL var1) {
      if(this.ld) {
         throw new RuntimeException();
      } else {
         this.a_(var1);
         var1.KK.push(new js(hY.QE, this.QE));
         if(this.OK != null && var1.mS) {
            var1.dN(this.OK);
         }

         oc.QE(var1, this.zs, -1);
         oc.dN(var1, this.fa);
         var1.wU(" ");
         this.dN(var1, true);
         if(this.mS != null) {
            var1.wU(" = ");
            this.mS.dN(var1);
         }

         var1.wU(";");
         if(var1.LH != null) {
            var1.ld(var1.LH.zs(this.QE));
         }

         var1.QE(-2);
         var1.QE();
         var1.KK.pop();
      }
   }

   public void dN(ZL var1, boolean var2) {
      String var3 = this.wU;
      Object var4 = this;
      if(var1.OK != null) {
         gE var5 = var1.OK.fa(this.QE);
         if(var5 != null) {
            var3 = var5.QE(true);
            var4 = var5;
         }
      }

      var1.dN(var3, Zh.Ux, var2?1:0, var4, (Object)null);
   }

   public List wU() {
      return TM.dN(new IK[]{this.mS});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.mS == var1) {
         this.mS = (Xf)var2;
         return true;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   Dw(AR var1, hV.uK var2, OX.vd var3, GH var4, boolean var5, int var6, String var7, String var8, hV var9, int var10, TM var11) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static class uK {
      private AR dN;
      private hV.uK ld;
      private zd.uK QE;
      private OX.vd wU;
      private GH fa;
      private HashMap zs;

      public uK(AR var1, hV.uK var2, zd.uK var3, OX.vd var4) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
         this.wU = var4;
         this.zs = new HashMap();
      }

      public void dN(GH var1) {
         this.fa = var1;
      }

      public Dw dN(int var1) {
         Dw var2 = (Dw)this.zs.get(Integer.valueOf(var1));
         if(var2 == null) {
            boolean var3 = true;
            gE var4 = null;
            hV var7 = null;
            int var8 = 0;
            String var5;
            String var6;
            if(var1 == -1) {
               var5 = "";
               var6 = "class";
               var8 = 8;
            } else if(var1 == -2) {
               var5 = "";
               var6 = "length";
            } else {
               if(var1 < 0) {
                  throw new RuntimeException();
               }

               var4 = this.dN.fa(var1);
               var5 = var4.dN(false);
               var6 = var4.QE(false);
            }

            if(var4 != null) {
               XV var9 = this.dN.dN(var4.fa(false));
               var7 = hV.dN(var4.ld(false), this.ld);
               if(var9 != null) {
                  var8 = var9.ld();
                  var3 = false;
               }
            }

            var2 = new Dw(this.dN, this.ld, this.wU, this.fa, var3, var1, var5, var6, var7, var8, (TM)null);
            this.zs.put(Integer.valueOf(var1), var2);
            if(!var3 && this.fa != null) {
               ub var10 = this.dN.zs(var1);
               if(var10 != null) {
                  var2.dN(this.fa.dN(var10));
               }
            }

            if(!var3) {
               zd var11 = this.QE.dN(var5);
               if(var11 != null) {
                  var11.dN(var2);
               }
            }
         }

         return var2;
      }
   }
}
