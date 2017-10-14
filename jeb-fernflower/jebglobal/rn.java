package jebglobal;

import jebglobal.HC;
import jebglobal.cr;
import jebglobal.lW;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolTip;

public final class rn extends Canvas implements MouseTrackListener, PaintListener {
   private cr dN;
   private int ld;
   private int QE = -1;
   private int wU;
   private int[] fa;
   private int[] zs;
   private ToolTip mS;

   public rn(Composite var1) {
      super(var1, 2048);
      this.addPaintListener(this);
      this.addMouseTrackListener(this);
   }

   public void dN(cr var1) {
      this.dN = var1;
      var1.dN(new lW.uK() {
         // $FF: synthetic field
         private rn dN = rn.this;

         public void dN(int var1) {
            if(this.dN.QE != var1) {
               this.dN.QE = var1;
               this.dN.dN();
            }

         }
      });
   }

   public void dN() {
      this.wU = 0;
      this.redraw();
   }

   public void paintControl(PaintEvent var1) {
      Rectangle var2 = this.getClientArea();
      int var3 = var2.width;
      int var4 = var2.height;
      this.ld = this.dN.Ee();
      if(this.wU != var4) {
         this.wU = var4;
         this.ld();
      }

      this.dN(var1.gc, this.zs, var3, this.ld, true);
      this.dN(var1.gc, this.fa, var3, this.ld, false);
   }

   private void ld() {
      int var1 = this.wU / this.ld;
      int var2 = -2;
      this.fa = new int[var1 * 2 + 1];
      int var3 = -2;
      this.zs = new int[var1 * 2 + 1];

      for(int var4 = 0; var4 < var1; ++var4) {
         int var5 = this.QE + var4;
         int var6 = this.dN.wU(var5);
         int var7 = 0;
         if((var6 & 1) != 0) {
            if((var6 & 2048) != 0) {
               var7 = 16724736;
            } else if((var6 & 512) != 0) {
               var7 = 10092339;
            } else if((var6 & 1024) != 0) {
               var7 = 10092339;
            } else if((var6 & 4) != 0) {
               var7 = 255;
            } else if((var6 & 256) != 0) {
               var7 = 13408512;
            }
         }

         if(var2 >= 0 && this.fa[var2 + 1] == var7) {
            ++this.fa[var2];
         } else {
            var2 += 2;
            this.fa[var2] = 1;
            this.fa[var2 + 1] = var7;
         }

         var7 = 0;
         if((var6 & 6) != 0) {
            if((var6 & 2048) != 0) {
               var7 = 16724736;
            } else if((var6 & 512) != 0) {
               var7 = 10092339;
            } else if((var6 & 4) != 0) {
               var7 = 255;
            } else if((var6 & 256) != 0) {
               var7 = 13408512;
            }
         }

         if(var3 >= 0 && this.zs[var3 + 1] == var7) {
            ++this.zs[var3];
         } else {
            var3 += 2;
            this.zs[var3] = 1;
            this.zs[var3 + 1] = var7;
         }
      }

      this.fa[var2 + 2] = -1;
      this.zs[var3 + 2] = -1;
   }

   private void dN(GC var1, int[] var2, int var3, int var4, boolean var5) {
      int var6 = var5?0:var3 / 2;
      int var7 = 0;
      int var8 = 0;

      while(true) {
         int var9 = var2[var8];
         if(var9 < 0) {
            return;
         }

         int var10 = var9 * var4;
         Color var11 = HC.dN().dN(var2[var8 + 1]);
         var1.setForeground(var11);
         var1.setBackground(var11);
         var1.fillRectangle(var6, var7 + 2, var3 / 2, var10);
         var7 += var10;
         var8 += 2;
      }
   }

   public void mouseEnter(MouseEvent var1) {
   }

   public void mouseExit(MouseEvent var1) {
   }

   public void mouseHover(MouseEvent var1) {
      if(this.mS != null) {
         this.mS.setVisible(false);
         this.mS.dispose();
      }

      this.mS = new ToolTip(this.dN.QE().LR(), 0);
      int var2 = this.QE + var1.y / this.ld;
      int var3 = this.dN.wU(var2);
      String var4 = this.dN.fa(var3);
      this.mS.setMessage(var4);
      this.mS.setAutoHide(true);
      this.mS.setVisible(true);
   }
}
