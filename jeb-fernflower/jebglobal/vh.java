package jebglobal;

import jebglobal.HC;
import jebglobal.cr;
import jebglobal.lW;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolTip;

public final class vh extends Canvas implements MouseListener, MouseMoveListener, MouseTrackListener, PaintListener {
   private cr dN;
   private int ld = -1;
   private boolean QE;
   private boolean wU;
   private int fa;
   private int[] zs;
   private int[] mS;
   private ToolTip OK;

   public vh(Composite var1) {
      super(var1, 2048);
      this.addPaintListener(this);
      this.addMouseListener(this);
      this.addMouseMoveListener(this);
      this.addMouseTrackListener(this);
   }

   public void dN(cr var1) {
      this.dN = var1;
      var1.dN(new lW.uK() {
         // $FF: synthetic field
         private vh dN = vh.this;

         public void dN(int var1) {
            int var2 = this.dN.dN.BQ();
            int var3 = this.dN.getClientArea().width * var1 / var2;
            if(var3 != this.dN.ld) {
               this.dN.ld = var3;
               this.dN.redraw();
            }

         }
      });
   }

   public void dN() {
      this.fa = 0;
      this.redraw();
   }

   public void paintControl(PaintEvent var1) {
      Rectangle var2 = this.getClientArea();
      int var3 = var2.width;
      int var4 = var2.height;
      if(!this.wU && this.fa != var3) {
         this.fa = var3;
         this.ld();
      }

      this.dN(var1.gc, this.mS, var4, true);
      this.dN(var1.gc, this.zs, var4, false);
      if(this.ld >= 0 && this.ld < var3) {
         Color var5 = HC.dN().dN(16776960);
         var1.gc.setForeground(var5);
         var1.gc.setBackground(var5);
         var1.gc.fillPolygon(new int[]{this.ld - 5, var4, this.ld + 5, var4, this.ld, var4 - 7});
      }

   }

   private void ld() {
      int var1 = this.fa;
      int var2 = this.dN.BQ();
      int var3 = -2;
      this.zs = new int[var1 * 2 + 1];
      int var4 = -2;
      this.mS = new int[var1 * 2 + 1];

      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = var5 * var2 / var1;
         int var7 = this.dN.wU(var6);
         int var8 = 0;
         if((var7 & 1) != 0) {
            if((var7 & 2048) != 0) {
               var8 = 16724736;
            } else if((var7 & 512) != 0) {
               var8 = 10092339;
            } else if((var7 & 1024) != 0) {
               var8 = 10092339;
            } else if((var7 & 4) != 0) {
               var8 = 255;
            } else if((var7 & 256) != 0) {
               var8 = 13408512;
            }
         }

         if(var3 >= 0 && this.zs[var3 + 1] == var8) {
            ++this.zs[var3];
         } else {
            var3 += 2;
            this.zs[var3] = 1;
            this.zs[var3 + 1] = var8;
         }

         var8 = 0;
         if((var7 & 6) != 0) {
            if((var7 & 2048) != 0) {
               var8 = 16724736;
            } else if((var7 & 512) != 0) {
               var8 = 10092339;
            } else if((var7 & 4) != 0) {
               var8 = 255;
            } else if((var7 & 256) != 0) {
               var8 = 13408512;
            }
         }

         if(var4 >= 0 && this.mS[var4 + 1] == var8) {
            ++this.mS[var4];
         } else {
            var4 += 2;
            this.mS[var4] = 1;
            this.mS[var4 + 1] = var8;
         }
      }

      this.zs[var3 + 2] = -1;
      this.mS[var4 + 2] = -1;
   }

   private void dN(GC var1, int[] var2, int var3, boolean var4) {
      int var5 = var4?0:var3 / 2;
      int var6 = var4?var3 / 2:var3;
      int var7 = 0;
      int var8 = 0;

      while(true) {
         int var9 = var2[var8];
         if(var9 < 0) {
            return;
         }

         Color var10 = HC.dN().dN(var2[var8 + 1]);
         var1.setForeground(var10);
         if(var9 == 1) {
            var1.drawLine(var7, var5, var7, var6);
            ++var7;
         } else {
            var1.setBackground(var10);
            var1.fillRectangle(var7, var5, var9, var3 / 2);
            var7 += var9;
         }

         var8 += 2;
      }
   }

   public void mouseDoubleClick(MouseEvent var1) {
   }

   public void mouseDown(MouseEvent var1) {
      this.QE = true;
      this.dN(var1.x);
   }

   public void mouseUp(MouseEvent var1) {
      this.QE = false;
      this.wU = false;
   }

   public void mouseMove(MouseEvent var1) {
      if(this.QE) {
         this.wU = true;
         this.dN(var1.x);
      }

   }

   private void dN(int var1) {
      int var2 = this.dN.BQ() * var1 / this.getClientArea().width;
      this.dN.LH(var2);
   }

   public void mouseEnter(MouseEvent var1) {
   }

   public void mouseExit(MouseEvent var1) {
   }

   public void mouseHover(MouseEvent var1) {
      if(this.OK != null) {
         this.OK.setVisible(false);
         this.OK.dispose();
      }

      this.OK = new ToolTip(this.dN.QE().LR(), 0);
      int var2 = this.dN.BQ() * var1.x / this.getClientArea().width;
      int var3 = this.dN.wU(var2);
      String var4 = this.dN.fa(var3);
      this.OK.setMessage(var4);
      this.OK.setAutoHide(true);
      this.OK.setVisible(true);
   }
}
