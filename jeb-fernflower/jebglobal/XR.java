package jebglobal;

import jebglobal.GE;
import jebglobal.KT;
import jebglobal.QA;
import jebglobal.Rg;
import jebglobal.TM;
import jebglobal.Xp;
import jebglobal.ZL;
import jebglobal.cn;
import jebglobal.yx;

public final class XR implements KT, Xp {
   private yx dN;
   private Rg ld;
   private String QE;
   private ZL wU;
   private GE fa;
   private long zs = 0L;

   public XR(yx var1) {
      if(var1 == null) {
         throw new RuntimeException();
      } else {
         this.dN = var1;
         this.ld = var1.wU();
      }
   }

   public void dN(String var1, ZL var2) {
      this.QE = var1;
      this.wU = var2;
      this.dN.dN().dN((ZL)var2);
   }

   public void dN() {
      if(this.QE != null) {
         this.fa = new GE(this.dN.getShell(), this, "Decompilation", "Press the button below to interrupt the decompilation...");
         this.ld.dN((KT)this);
         Thread var1 = TM.ld(new Runnable() {
            public void run() {
               try {
                  XR.this.ld.ld(XR.this.QE, XR.this.wU);
               } catch (final Exception var2) {
                  cn.dN(String.format("Error generating decompiled code for class: %s", new Object[]{XR.this.QE}));
                  XR.this.dN.getDisplay().asyncExec(new Runnable() {
                     // $FF: synthetic field
                     private Exception dN = var2;
                     // $FF: synthetic field
                     private <undefinedtype> ld = <VAR_NAMELESS_ENCLOSURE>;

                     public void run() {
                        XR.this.dN.dN().dN(this.dN);
                     }
                  });
               }

            }
         });
         QA var2 = new QA(var1, true, this, (Runnable)null, new Runnable() {
            public void run() {
               XR.this.dN.getDisplay().syncExec(new Runnable() {
                  // $FF: synthetic field
                  private <undefinedtype> dN = <VAR_NAMELESS_ENCLOSURE>;

                  public void run() {
                     XR.this.fa.QE();
                  }
               });
            }
         });
         var2.dN(false);
         if(this.fa.dN().booleanValue()) {
            cn.dN("The decompilation was interrupted by the user");
         }

         while(!var2.ld()) {
            try {
               Thread.sleep(200L);
            } catch (InterruptedException var3) {
               ;
            }
         }

         if(var2.dN() != QA.uK.QE) {
            cn.dN("An error occurred, the decompilation could not be terminated");
         }

         this.ld.ld((KT)this);
         this.fa = null;
      }
   }

   public synchronized long De() {
      return this.zs;
   }

   public synchronized void ld(long var1) {
      this.zs = var1;
   }

   public void dN(KT.uK var1) {
      Object[] var10000;
      switch(XR.SyntheticClass_1.dN[var1.dN.ordinal()]) {
      case 1:
         cn.dN(String.format("Decompiling class %s", new Object[]{var1.ld}));
         break;
      case 2:
         cn.dN(String.format("Decompiling method %s", new Object[]{var1.ld}));
      case 3:
      case 4:
      case 5:
      case 6:
      default:
         break;
      case 7:
         var10000 = new Object[]{var1.ld};
         break;
      case 8:
         var10000 = new Object[]{var1.ld};
      }

   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[KT.vd.values().length];

      static {
         try {
            dN[KT.vd.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            dN[KT.vd.ld.ordinal()] = 2;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            dN[KT.vd.QE.ordinal()] = 3;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            dN[KT.vd.wU.ordinal()] = 4;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            dN[KT.vd.fa.ordinal()] = 5;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            dN[KT.vd.zs.ordinal()] = 6;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            dN[KT.vd.mS.ordinal()] = 7;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[KT.vd.OK.ordinal()] = 8;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }
}
