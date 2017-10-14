package jebglobal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Fu;
import jebglobal.Gz;
import jebglobal.HI;
import jebglobal.KT;
import jebglobal.TM;
import jebglobal.Uk;
import jebglobal.XV;
import jebglobal.Yx;
import jebglobal.ZL;
import jebglobal.ai;
import jebglobal.b;
import jebglobal.jI;
import jebglobal.kW;
import jebglobal.oh;
import jebglobal.rK;
import jebglobal.rP;
import jebglobal.yK;
import jebglobal.zd;

public class Rg {
   private AR dN;
   private Yx ld;
   private HashMap QE;
   private HashMap wU;
   private ArrayList fa;
   private boolean zs;
   private boolean mS;
   private boolean OK;
   private boolean LH;
   private int KK;
   private boolean EO;
   private boolean cb;
   private boolean PF;
   private boolean Hw;
   private boolean rK;
   private boolean Ux;
   private boolean ZY;
   private boolean s;
   private int Hv;
   private int VX;
   private String ci;
   private static boolean bG = dN(jI.class);

   public Rg(AR var1) {
      this.dN = var1;
      this.ld = new Yx(var1);
      this.QE = new HashMap();
      this.wU = new HashMap();
      this.fa = new ArrayList();
      this.zs = false;
      this.OK = true;
      this.LH = true;
      this.KK = 0;
      this.EO = true;
      this.cb = true;
      this.PF = true;
      this.Hw = true;
      this.rK = true;
      this.Ux = true;
      this.s = true;
      this.Hv = 0;
      this.VX = 0;
      this.ci = null;
   }

   public Yx dN() {
      return this.ld;
   }

   public void dN(int var1) {
      if(var1 <= 0) {
         var1 = 0;
      }

      this.KK = var1;
   }

   public void dN(KT var1) {
      this.fa.add(var1);
   }

   public void ld(KT var1) {
      this.fa.remove(var1);
   }

   private void dN(KT.uK var1) {
      Iterator var2 = this.fa.iterator();

      while(var2.hasNext()) {
         KT var3 = (KT)var2.next();
         var3.dN(var1);
      }

   }

   public void dN(boolean var1) {
      this.zs = var1;
   }

   public void ld(boolean var1) {
      this.cb = var1;
   }

   public void QE(boolean var1) {
      this.EO = var1;
   }

   public void wU(boolean var1) {
      if(var1) {
         this.ld.zs.dN(HI.vd.ld);
      } else {
         this.ld.zs.dN(HI.vd.dN);
      }

   }

   public void fa(boolean var1) {
      this.PF = var1;
   }

   public void zs(boolean var1) {
      this.Hw = var1;
   }

   public void mS(boolean var1) {
      this.rK = var1;
   }

   public void OK(boolean var1) {
      this.Ux = var1;
   }

   public void LH(boolean var1) {
      this.ZY = var1;
   }

   public void KK(boolean var1) {
      this.s = var1;
   }

   public zd dN(String var1) {
      yK var2 = this.dN.cb(var1);
      if(var2 == null) {
         throw new RuntimeException();
      } else {
         var1 = var2.ld(false);
         return (zd)this.wU.get(var1);
      }
   }

   public Fu ld(String var1) {
      AV var2 = this.dN.wU(var1);
      if(var2 == null) {
         throw new RuntimeException();
      } else {
         var1 = this.dN.mS(var2.ld()).wU(false);
         return (Fu)this.QE.get(var1);
      }
   }

   private void QE(String var1, ZL var2) {
      AV var3 = this.dN.wU(var1);
      if(var3 == null) {
         throw new RuntimeException();
      } else {
         var1 = this.dN.mS(var3.ld()).wU(false);
         if(!bG) {
            rK.dN = 0;
         }

         Fu var4 = this.ld(var1);
         if(var4 == null || this.zs) {
            this.dN(new KT.uK(KT.vd.ld, var1));
            byte var5 = 0;
            if(var4 != null) {
               var4.ld();
            }

            if(var3.wU() == null) {
               ai var6 = new ai(this.ld, var3);
               var4 = var6.dN();
            } else {
               oh var12 = var3.wU().fa();
               var12.zs();
               Gz var7 = new Gz(this.dN, var3, this.ld.ld);
               var7.dN(this.cb);
               this.dN(new KT.uK(KT.vd.QE));
               var7.dN();
               oh var8 = var7.ld();
               kW var9 = new kW(var8);
               var9.dN(this.EO);
               this.dN(new KT.uK(KT.vd.wU));
               var9.dN();
               ai var10 = new ai(this.ld, var7);
               if(this.OK) {
                  this.dN(new KT.uK(KT.vd.fa));
                  var4 = var10.QE();
                  if(this.LH) {
                     b var11 = new b(this.ld, var4);
                     var11.dN(this.PF);
                     var11.ld(this.Hw);
                     var11.QE(this.rK);
                     var11.wU(this.Ux);
                     var11.fa(this.ZY);
                     var11.zs(this.s);
                     this.dN(new KT.uK(KT.vd.zs));
                     var11.dN();
                  }

                  if(var10.dN) {
                     var5 = 2;
                     ++this.VX;
                  }
               } else {
                  this.dN(new KT.uK(KT.vd.fa));
                  var4 = var10.ld();
               }

               ++this.Hv;
            }

            var4.dN(var5, (String)null);
            this.QE.put(var1, var4);
            this.dN(new KT.uK(KT.vd.mS, var1));
         }

         if(var2 != null) {
            var2.dN(this.dN);
            var2.dN((zd.uK)null);
            var2.dN((zd)null);
            var4.ld(var2);
         }

      }
   }

   public void dN(final String var1, final ZL var2, int var3) {
      Thread var4 = null;
      this.ci = null;
      this.mS = false;

      try {
         var4 = TM.ld(new Runnable() {
            // $FF: synthetic field
            private String dN = var1;
            // $FF: synthetic field
            private ZL ld = var2;
            // $FF: synthetic field
            private Rg QE = Rg.this;

            public void run() {
               try {
                  this.QE.QE(this.dN, this.ld);
               } catch (Exception var2) {
                  this.QE.ci = TM.dN((Throwable)var2);
               }

            }
         });
         var4.join((long)var3);
         if(var4.isAlive()) {
            throw new RuntimeException("Decompilation timeout (stopping)");
         }
      } catch (Exception var7) {
         this.mS = var7 instanceof InterruptedException;
         boolean var6 = TM.dN(var4);
         Object[] var10000 = new Object[]{Boolean.valueOf(var6)};
         throw new RuntimeException(var7);
      }

      if(this.ci != null) {
         throw new RuntimeException(this.ci);
      }
   }

   public void dN(String var1, ZL var2) {
      this.dN(var1, var2, this.KK);
   }

   public boolean ld(String var1, ZL var2) {
      yK var3 = this.dN.cb(var1);
      if(var3 == null) {
         throw new RuntimeException();
      } else {
         var1 = var3.ld(false);
         zd var4 = (zd)this.wU.get(var1);
         if(var4 == null || this.zs) {
            this.dN(new KT.uK(KT.vd.dN, var1));
            if(var4 == null) {
               var4 = this.ld.fa.ld(var1);
            }

            Uk var5 = var3.s();
            if(var5 != null) {
               Iterator var6 = var5.QE().iterator();

               while(var6.hasNext()) {
                  XV var7 = (XV)var6.next();
                  this.ld.mS.dN(var7.dN());
               }

               var6 = var5.zs().iterator();

               while(var6.hasNext()) {
                  AV var14 = (AV)var6.next();
                  String var8 = this.dN.mS(var14.ld()).wU(false);
                  String var9 = null;

                  try {
                     this.dN((String)var8, (ZL)null);
                  } catch (Exception var12) {
                     var9 = TM.dN((Throwable)var12);
                  }

                  if(var9 != null) {
                     Fu var10 = this.ld.zs.dN(var14.ld(), var14.zs());
                     var10.dN(1, (String)var9);
                     this.QE.put(var8, var10);
                     if(this.mS) {
                        this.mS = false;
                        return false;
                     }
                  }
               }
            }

            int[] var13 = var3.fa();
            int var20;
            if(var13 != null) {
               int[] var15 = var13;
               int var17 = var13.length;

               for(int var19 = 0; var19 < var17; ++var19) {
                  var20 = var15[var19];
                  if(!this.ld(this.dN.dN(var20, false), (ZL)null)) {
                     return false;
                  }
               }
            }

            if(var5 != null) {
               HashSet var16 = new HashSet();
               Iterator var18 = var5.zs().iterator();

               while(var18.hasNext()) {
                  AV var21 = (AV)var18.next();
                  var16.add(Integer.valueOf(var21.ld()));
               }

               var18 = this.dN.Hw().iterator();

               while(var18.hasNext()) {
                  yK var22 = (yK)var18.next();
                  var20 = var22.QE();
                  int var11 = var22.wU();
                  if(var16.contains(Integer.valueOf(var11))) {
                     if(!this.ld(this.dN.dN(var22.zs(), false), (ZL)null)) {
                        return false;
                     }
                  } else if(var20 == var3.zs() && !this.ld(this.dN.dN(var22.zs(), false), (ZL)null)) {
                     return false;
                  }
               }
            }

            this.wU.put(var3.dN(false), var4);
            this.dN(new KT.uK(KT.vd.OK, var1));
         }

         if(var2 != null) {
            var2.dN(this.dN);
            var2.dN(this.ld.fa);
            var2.dN(var4);
            var4.ld(var2);
         }

         return true;
      }
   }

   public static boolean dN(Class var0) {
      boolean var1 = false;

      try {
         Object var2 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 107, 15, 72, 83, 66}, 2, 20)).getMethod(rP.dN(new byte[]{36, 10, 4, 41, 0, 6, 19, 13, 23, 84, 65, 12, 71, 100, 94, 84, 88, 90, 66}, 2, 2), new Class[0]).invoke(var0, new Object[0]);
         Object var3 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13}, 2, 233)).getMethod(rP.dN(new byte[]{-115, 2, 17, 55, 44, 11, 1, 54, 60, 26, 7, 17, 6}, 1, 234), new Class[0]).invoke(var2, new Object[0]);
         Object var4 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86}, 2, 4)).getMethod(rP.dN(new byte[]{59, 2, 17, 56, 35, 12, 2, 21, 29, 6, 1}, 1, 92), new Class[0]).invoke(var3, new Object[0]);
         Object var5 = Class.forName(rP.dN(new byte[]{-117, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 30}, 1, 225)).getMethod(rP.dN(new byte[]{-91, 27, 58, 7, 27}, 1, 209), new Class[0]).invoke(var4, new Object[0]);
         Object var6 = Class.forName(rP.dN(new byte[]{92, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9}, 1, 54)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 42}, 2, 218))}).newInstance(new Object[]{var5});
         var1 = dN(var6, var0);
      } catch (Exception var7) {
         ;
      }

      return var1;
   }

   private static boolean dN(Object var0, Class var1) {
      boolean var2 = false;

      try {
         Object var3 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 126)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6}, 2, 87)), Boolean.TYPE}).newInstance(new Object[]{var0, Boolean.valueOf(true)});
         byte[] var4 = new byte[4096];
         String var5 = var1.getName().replace('.', '/') + ".class";
         Object var6 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 200)).getMethod(rP.dN(new byte[]{36, 10, 4, 60, 28, 29, 21, 17}, 2, 87), new Class[]{String.class}).invoke(var3, new Object[]{var5});
         Object var7 = Class.forName(rP.dN(new byte[]{-123, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 239)).getMethod(rP.dN(new byte[]{121, 2, 17, 61, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12}, 1, 30), new Class[]{Class.forName(rP.dN(new byte[]{-81, 11, 23, 23, 79, 91, 1, 29, 5, 66, 84, 19, 25, 94, 116, 51, 25, 53, 43, 26, 6, 11}, 1, 197))}).invoke(var3, new Object[]{var6});
         Method var8 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 61, 78, 88, 22, 93, 115, 69, 75, 92, 82, 65}, 2, 98)).getMethod(rP.dN(new byte[]{49, 10, 17, 29}, 2, 194), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});

         while(true) {
            if(((Integer)var8.invoke(var7, new Object[]{var4, Integer.valueOf(0), Integer.valueOf(var4.length)})).intValue() == -1) {
               Object[] var9 = (Object[])((Object[])Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73}, 2, 35)).getMethod(rP.dN(new byte[]{36, 10, 4, 58, 23, 27, 19, 1, 18, 73, 75, 2, 93, 69, 66}, 2, 5), new Class[0]).invoke(var6, new Object[0]));
               Object var10 = Class.forName(rP.dN(new byte[]{-11, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 77, 6, 23, 6, 90, 109, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17}, 1, 159)).getMethod(rP.dN(new byte[]{36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26}, 2, 56), new Class[0]).invoke(var9[0], new Object[0]);
               Object var11 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 88, 87, 77, 86, 94, 70, 83, 83, 84, 64, 2, 114, 28, 51, 49, 22, 14, 9, 73, 2, 37, 1, 86}, 2, 101)).getMethod(rP.dN(new byte[]{36, 10, 4, 52, 29, 13, 18, 4, 1, 83}, 2, 115), new Class[0]).invoke(var10, new Object[0]);
               var2 = var11.toString().substring(10).substring(15, 30).equals(rP.dN(new byte[]{122, 94, 66, 76, 69, 91, 87, 91, 67, 23, 31, 81, 30, 22, 9}, 2, 72));
               Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 17)).getMethod(rP.dN(new byte[]{-25, 15, 3, 28, 22}, 1, 132), new Class[0]).invoke(var3, new Object[0]);
               break;
            }
         }
      } catch (Exception var12) {
         ;
      }

      return var2;
   }
}
