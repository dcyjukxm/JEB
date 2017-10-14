package jebglobal;

import java.io.File;
import java.io.IOException;
import jebglobal.DM;
import jebglobal.HJ;
import jebglobal.TM;
import jebglobal.lW;
import jebglobal.qS;
import jebglobal.tS;
import jebglobal.yx;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public final class NB extends Composite {
   yx dN;
   private SashForm wU;
   private Tree fa;
   Composite ld;
   Font QE;

   public NB(Composite var1, yx var2, File var3) {
      super(var1, 0);
      this.setLayout(new FillLayout());
      this.dN = var2;
      this.QE = var2.dN().XZ();
      var2.dN().nA();
      this.wU = new SashForm(this, 256);
      this.fa = new Tree(this.wU, 2048);
      this.ld = new Composite(this.wU, 0);
      this.ld.setLayout(new FillLayout());
      this.wU.setWeights(new int[]{20, 80});
      this.dN((TreeItem)null, var3);
      this.dN();
      this.layout();
   }

   private void dN(TreeItem var1, File var2) {
      String[] var3 = var2.list();
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         String var7 = var2.getAbsolutePath() + "/" + var6;
         File var8 = new File(var7);
         TreeItem var9 = var1 == null?new TreeItem(this.fa, 0):new TreeItem(var1, 0);
         var9.setText(var6);
         var9.setData(var8);
         this.fa.showItem(var9);
         if(var8.isDirectory()) {
            this.dN(var9, var8);
         }
      }

   }

   private void dN() {
      this.fa.addSelectionListener(new SelectionListener() {
         // $FF: synthetic field
         private NB dN = NB.this;

         public void widgetDefaultSelected(SelectionEvent var1) {
            TreeItem var2 = (TreeItem)var1.item;
            if(var2 != null) {
               var2.setExpanded(!var2.getExpanded());
            }
         }

         public void widgetSelected(SelectionEvent var1) {
            TreeItem var2 = (TreeItem)var1.item;
            if(var2 != null) {
               File var3 = (File)var2.getData();
               Control[] var4 = this.dN.ld.getChildren();
               int var5 = var4.length;

               for(int var6 = 0; var6 < var5; ++var6) {
                  Control var7 = var4[var6];
                  var7.dispose();
               }

               if(!var3.isDirectory()) {
                  String var10 = var3.getAbsolutePath();
                  byte[] var14;
                  switch(NB.SyntheticClass_1.dN[HJ.dN(var10).ordinal()]) {
                  case 1:
                     tS var12 = new tS(this.dN.ld, this.dN.dN);
                     var12.ld(var10);
                     var12.dN(false);
                     break;
                  case 2:
                     new qS(this.dN.ld, var3);
                     break;
                  case 3:
                  case 4:
                     lW var11 = new lW(this.dN.ld, this.dN.QE, false);

                     try {
                        var14 = TM.QE(var3);
                        var11.QE(new String(var14));
                     } catch (IOException var9) {
                        ;
                     }
                     break;
                  default:
                     DM var13 = new DM(this.dN.ld, this.dN.QE);

                     try {
                        var14 = TM.QE(var3);
                        var13.dN(var14);
                     } catch (IOException var8) {
                        ;
                     }
                  }

                  this.dN.ld.layout();
               }
            }
         }
      });
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[HJ.values().length];

      static {
         try {
            dN[HJ.QE.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            dN[HJ.wU.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            dN[HJ.dN.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[HJ.ld.ordinal()] = 4;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }
}
