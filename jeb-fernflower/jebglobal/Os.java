package jebglobal;

import java.util.HashMap;
import jebglobal.AR;
import jebglobal.AV;
import jebglobal.Ky;
import jebglobal.LW;
import jebglobal.PL;
import jebglobal.RL;
import jebglobal.XR;
import jebglobal.XV;
import jebglobal.ZL;
import jebglobal.cr;
import jebglobal.gv;
import jebglobal.hY;
import jebglobal.oV;
import jebglobal.of;
import jebglobal.qO;
import jebglobal.vL;
import jebglobal.yK;
import jebglobal.yx;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Composite;

public final class Os extends cr {
   private static final long LK = 844563159190538443L;
   private AR OK;
   private ZL LH;
   private String KK;
   private Ky EO;
   private oV cb = new oV();
   private HashMap PF = new HashMap();

   public Os(Composite var1, yx var2) {
      super(var1, var2);
      this.OK = var2.QE();
      this.dN(new gv(this));
      this.dN(new qO(this));
      this.dN(new vL(this));
      this.dN(new of(this));
      this.dN(new RL(this));
   }

   public ZL Hw() {
      return this.LH;
   }

   public String rK() {
      return this.KK;
   }

   public void dN(boolean var1) {
      this.EO();
      if(this.KK != null) {
         yK var2 = this.OK.EO(this.KK);
         if(var2 != null) {
            this.KK = var2.ld(false);
            this.LH = new ZL(this.ld);
            XR var3 = new XR(this.dN);
            var3.dN(this.KK, this.LH);
            var3.dN();
            this.LH.wU();
            this.fa = (oV)this.PF.get(this.KK);
            if(this.fa == null) {
               this.fa = new oV();
               this.PF.put(this.KK, this.fa);
            }

            int var4 = 0;
            if(this.EO != null) {
               hY var5 = null;
               int var6 = -1;
               int var7 = -1;
               if(this.EO.wU != null) {
                  if(this.OK.QE(this.EO.wU) != null) {
                     var6 = this.OK.QE(this.EO.wU).ld();
                     var5 = hY.ld;
                     var7 = this.EO.zs;
                  }
               } else if(this.EO.fa != null) {
                  if(this.OK.dN(this.EO.fa) != null) {
                     var6 = this.OK.dN(this.EO.fa).dN();
                     var5 = hY.QE;
                  }
               } else if(this.EO.QE != null && this.OK.EO(this.EO.QE) != null) {
                  var6 = this.OK.EO(this.EO.QE).zs();
                  var5 = hY.dN;
               }

               if(var5 != null) {
                  int var8 = Integer.MAX_VALUE;

                  for(int var9 = 0; var9 < this.LH.OK(); ++var9) {
                     PL var10 = (PL)this.LH.zs(var9);
                     if(var10 != null && var10.dN() == var5 && var10.ld() == var6) {
                        if(var5 != hY.ld || var7 < 0) {
                           var4 = var9;
                           break;
                        }

                        int var11 = var10.QE() - var7;
                        if(Math.abs(var11) < var8) {
                           var8 = Math.abs(var11);
                           var4 = var9;
                        }

                        if(var11 >= 0) {
                           break;
                        }
                     }
                  }
               }

               this.EO = null;
            }

            if(var1) {
               this.dN(this.LH, this.zs.getTopIndex(), this.zs.getCaretOffset());
            } else {
               this.dN(this.LH, var4, -1);
            }

         }
      }
   }

   public void dN(String var1, Ky var2) {
      this.dN(var1, var2, true);
   }

   public void dN(String var1, Ky var2, boolean var3) {
      if(var3 && this.KK != null) {
         this.cb.dN(this.KK);
         this.fa.dN(new LW(this.QE, this.wU));
      }

      this.KK = var1;
      this.EO = var2;
      this.dN(false);
   }

   public oV Ux() {
      return this.cb;
   }

   public void verifyKey(VerifyEvent var1) {
      int var10000 = var1.keyCode;
      super.verifyKey(var1);
   }

   public void keyTraversed(TraverseEvent var1) {
      if(var1.detail == 16) {
         Ky var2 = this.ZY();
         if(var2 != null) {
            this.dN.OK().dN(var2);
         }

         this.dN.EO();
         var1.doit = true;
      }

   }

   public void caretMoved(CaretEvent var1) {
      super.caretMoved(var1);
      Ky var2 = this.ZY();
      if(var2 != null) {
         String var3 = "?";
         if(var2.ld != null) {
            var3 = var2.ld;
         } else if(var2.dN != null) {
            var3 = var2.dN;
         }

         String var4 = "";
         var4 = var4 + String.format("%d:%d  |  %s", new Object[]{Integer.valueOf(this.QE), Integer.valueOf(this.wU), var3});
         var4 = var4 + String.format("  |  %X", new Object[]{Integer.valueOf(var2.zs)});
         this.dN.dN().zs(var4);
         yK var5 = this.OK.EO(var2.QE);
         if(var5 != null) {
            this.dN.mS().dN(var5.ld(true));
         }

      }
   }

   public Ky QE(int var1) {
      if(this.LH == null) {
         return null;
      } else {
         PL var2 = (PL)this.LH.zs(var1);
         if(var2 == null) {
            return null;
         } else {
            Ky var3 = new Ky();
            int var4 = var2.ld();
            AV var5;
            switch(Os.SyntheticClass_1.dN[var2.dN().ordinal()]) {
            case 1:
               var3.QE = this.OK.QE(var4).dN(false);
               var3.dN = var3.QE;
               yK var7 = this.OK.EO(var3.dN);
               if(var7 != null) {
                  var3.ld = var7.ld(true);
               }
               break;
            case 2:
               var3.fa = this.OK.fa(var4).fa(false);
               var3.dN = var3.fa;
               XV var6 = this.OK.dN(var3.dN);
               if(var6 != null) {
                  var3.ld = this.OK.fa(var6.dN()).fa(true);
               }
               break;
            case 3:
               var3.wU = this.OK.mS(var4).wU(false);
               var3.dN = var3.wU;
               var5 = this.OK.QE(var3.dN);
               if(var5 != null) {
                  var3.ld = this.OK.mS(var5.ld()).wU(true);
               }
            }

            var3.zs = var2.QE();
            if(var3.wU != null) {
               var5 = this.OK.QE(var3.wU);
               if(var5 != null && var5.wU() != null) {
                  var3.mS = var5.wU().ld();
               }
            }

            return var3;
         }
      }
   }

   public Ky ZY() {
      return this.QE(this.QE);
   }

   public int wU(int var1) {
      return 0;
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[hY.values().length];

      static {
         try {
            dN[hY.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            dN[hY.QE.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[hY.ld.ordinal()] = 3;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }
}
