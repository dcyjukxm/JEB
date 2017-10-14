package jebglobal;

import jebglobal.AR;
import jebglobal.AV;
import jebglobal.FB;
import jebglobal.Ky;
import jebglobal.ME;
import jebglobal.TM;
import jebglobal.Tg;
import jebglobal.WV;
import jebglobal.XV;
import jebglobal.ak;
import jebglobal.as;
import jebglobal.cn;
import jebglobal.cr;
import jebglobal.jt;
import jebglobal.tF;
import jebglobal.yK;
import jebglobal.ym;
import jebglobal.yx;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;

public final class Pl extends cr {
   private static final long LK = 844563159190538443L;
   private AR OK;
   private ME LH;

   public Pl(Composite var1, yx var2) {
      super(var1, var2);
      this.OK = var2.QE();
      this.dN((as)(new FB(this)));
      this.dN((as)(new ak(this)));
      this.dN((as)(new tF(this)));
   }

   public ME Hw() {
      return this.LH;
   }

   public boolean ld(String var1) {
      if(this.LH != null) {
         Integer var2 = Integer.valueOf(this.LH.dN(var1));
         if(var2 != null) {
            return this.dN(var2.intValue());
         }
      }

      return false;
   }

   public void EO() {
      super.EO();
      this.LH = null;
   }

   public void dN(boolean var1) {
      this.EO();
      final ym var2 = new ym(this.OK);
      this.LH = new ME(this.ld);
      this.LH.dN(this.dN.ld());
      TM var3 = this.dN.dN().EO();
      this.LH.dN(var3.ld(WV.mD));
      boolean var4 = var3.ld(WV.IL);
      this.LH.ld(var4?24:20);
      this.LH.dN(var3.ld(WV.kU)?(var4?10:8):0);
      this.LH.ld(var3.ld(WV.LV));
      this.LH.QE(var3.ld(WV.uo));
      this.LH.wU(var3.ld(WV.H));
      this.LH.fa(var3.ld(WV.go));
      this.LH.zs(var3.ld(WV.BP));
      this.LH.mS(var3.ld(WV.bL));
      this.LH.dN(var3.ld(WV.U)?this.dN.fa():null);
      this.LH.dN((char)var3.QE(WV.xg), var3.QE(WV.Dx));
      int var5 = this.OK.fa(false).size();
      int var6 = var3.QE(WV.My);
      if(var5 > var6) {
         MessageBox var7 = new MessageBox(this.getShell(), 40);
         var7.setText("Warning");
         var7.setMessage(String.format("This DEX file contains %d internal methods. The interactive output will be disabled for the Assembly view.\nThe threshold (currently %d) can be changed in the Options menu", new Object[]{Integer.valueOf(var5), Integer.valueOf(var6)}));
         var7.open();
         this.LH.dN((jt)null);
      }

      BusyIndicator.showWhile(this.getDisplay(), new Runnable() {
         // $FF: synthetic field
         private ym dN = var2;
         // $FF: synthetic field
         private Pl ld = Pl.this;

         public void run() {
            this.dN.dN(this.ld.LH);
         }
      });
      this.LH.wU();
      if(var1) {
         this.dN(this.LH, this.zs.getTopIndex(), this.zs.getCaretOffset());
      } else {
         this.dN(this.LH, -1, -1);
      }

      this.dN.LH().dN().dN();
      this.dN.LH().ld().dN();
   }

   public void dN(Ky var1) {
      if(var1 != null) {
         int var2 = -1;
         if(var1.wU != null) {
            var2 = this.LH.dN(var1.wU);
            if(var1.zs >= 0) {
               for(int var3 = var2; var3 < this.LH.OK(); ++var3) {
                  Tg var4 = (Tg)this.LH.zs(var3);
                  if(var4 != null && var4.dN() == var1.zs) {
                     var2 = var3;
                     break;
                  }
               }
            }
         } else if(var1.fa != null) {
            var2 = this.LH.dN(var1.fa);
         } else if(var1.QE != null) {
            var2 = this.LH.dN(var1.QE);
         }

         if(var2 >= 0) {
            this.dN(var2);
         }

      }
   }

   public void verifyKey(VerifyEvent var1) {
      int var10000 = var1.keyCode;
      super.verifyKey(var1);
   }

   public void rK() {
      Ky var1 = this.Ux();
      if(var1 != null) {
         String var2 = var1.QE;
         if(var2 != null) {
            yK var3 = this.OK.EO(var2);

            yK var4;
            for(var4 = var3; var4 != null && var4.dN(); var4 = this.OK.dN(var4)) {
               ;
            }

            if(var4 == null) {
               cn.dN(String.format("Could not find enclosing entity for inner class %s", new Object[]{var3.dN(false)}));
               var4 = var3;
            }

            var2 = var4.dN(false);
            this.dN.cb().dN(var2, var1);
         }

         this.dN.PF();
      }
   }

   public void caretMoved(CaretEvent var1) {
      super.caretMoved(var1);
      Ky var2 = this.Ux();
      if(var2 != null) {
         String var3 = "?";
         if(var2.ld != null) {
            var3 = var2.ld;
         } else if(var2.dN != null) {
            var3 = var2.dN;
         }

         String var4 = "-";
         if(var2.mS >= 0 && var2.zs >= 0) {
            var4 = String.format("%Xh", new Object[]{Integer.valueOf(var2.mS + var2.zs)});
         }

         int var5 = this.wU(this.QE);
         StringBuilder var6 = new StringBuilder();
         var6.append(String.format("%d:%d  |  ", new Object[]{Integer.valueOf(this.QE), Integer.valueOf(this.wU)}));
         var6.append(String.format("%s | ", new Object[]{this.fa(var5)}));
         var6.append(String.format("File: %s  |  ", new Object[]{var4}));
         var6.append(String.format("%s", new Object[]{var3}));
         this.dN.dN().zs(var6.toString());
         yK var7 = this.OK.EO(var2.QE);
         if(var7 != null) {
            this.dN.mS().dN(var7.ld(true));
         }

      }
   }

   public Ky QE(int var1) {
      if(this.LH == null) {
         return null;
      } else {
         Ky var2 = new Ky();
         var2.QE = this.LH.QE(var1);
         var2.wU = this.LH.KK(var1);
         var2.fa = this.LH.EO(var1);
         AV var3;
         if(var2.wU != null) {
            var2.dN = var2.wU;
            var3 = this.OK.QE(var2.dN);
            if(var3 != null) {
               var2.ld = this.OK.mS(var3.ld()).wU(true);
            }
         } else if(var2.fa != null) {
            var2.dN = var2.fa;
            XV var5 = this.OK.dN(var2.dN);
            if(var5 != null) {
               var2.ld = this.OK.fa(var5.dN()).fa(true);
            }
         } else if(var2.QE != null) {
            var2.dN = var2.QE;
            yK var6 = this.OK.EO(var2.dN);
            if(var6 != null) {
               var2.ld = var6.ld(true);
            }
         }

         if(var2.wU != null) {
            var3 = this.OK.QE(var2.wU);
            if(var3 != null && var3.wU() != null) {
               var2.mS = var3.wU().ld();
            }

            Tg var4 = (Tg)this.LH.zs(var1);
            if(var4 != null) {
               var2.zs = var4.dN();
            }
         }

         return var2;
      }
   }

   public Ky Ux() {
      return this.QE(this.QE);
   }

   public int wU(int var1) {
      int var2 = 0;
      String var3 = this.LH.QE(var1);
      if(var3 != null) {
         var2 = 1;
         yK var4 = this.OK.EO(var3);
         if(var4 != null) {
            var2 = 1 | this.KK(var4.ci());
         }
      }

      var3 = this.LH.KK(var1);
      if(var3 != null) {
         var2 |= 4;
         AV var5 = this.OK.QE(var3);
         if(var5 != null) {
            var2 |= this.KK(var5.KK());
         }
      } else {
         var3 = this.LH.EO(var1);
         if(var3 != null) {
            var2 |= 2;
            XV var6 = this.OK.dN(var3);
            if(var6 != null) {
               var2 |= this.KK(var6.wU());
               if((var6.ld() & 25) == 25) {
                  var2 |= 256;
               }
            }
         }
      }

      return var2;
   }

   private int KK(int var1) {
      int var2 = 0;
      if((var1 & 1) != 0) {
         var2 = 256;
      }

      if((var1 & 2) != 0) {
         var2 |= 512;
      }

      if((var1 & 4) != 0) {
         var2 |= 1024;
      }

      if((var1 & 8) != 0) {
         var2 |= 2048;
      }

      return var2;
   }
}
