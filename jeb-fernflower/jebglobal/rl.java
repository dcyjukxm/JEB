package jebglobal;

import jebglobal.HC;
import jebglobal.SA;
import jebglobal.TH;
import jebglobal.cn;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public final class rl extends Composite implements SA {
   private TH dN;
   private HC ld;
   private Label QE;
   private Label wU;
   private Label fa;

   public rl(Composite var1, final TH var2) {
      super(var1, 0);
      this.setLayout(new RowLayout(256));
      this.dN = var2;
      var2.dN((SA)this);
      this.ld = HC.dN();
      this.QE = new Label(this, 0);
      this.wU = new Label(this, 0);
      this.fa = new Label(this, 0);
      this.QE.setImage(this.ld.dN("icon-media-record.png"));
      this.QE.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private TH dN = var2;
         // $FF: synthetic field
         private rl ld = rl.this;

         public void mouseUp(MouseEvent var1) {
            try {
               if(this.dN.dN() == 0) {
                  if(this.dN.fa()) {
                     this.ld.QE.setImage(this.ld.ld.dN("icon-media-stop.png"));
                     this.ld.wU.setEnabled(false);
                  }
               } else if(this.dN.dN() == 1 && this.dN.zs()) {
                  this.ld.QE.setImage(this.ld.ld.dN("icon-media-record.png"));
                  this.ld.wU.setEnabled(true);
                  this.ld.fa.setEnabled(true);
               }
            } catch (Exception var2) {
               cn.dN("Audio error");
            }

         }

         public void mouseDown(MouseEvent var1) {
         }

         public void mouseDoubleClick(MouseEvent var1) {
         }
      });
      this.wU.setImage(this.ld.dN("icon-media-play.png"));
      this.wU.setEnabled(var2.ld());
      this.wU.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private TH dN = var2;
         // $FF: synthetic field
         private rl ld = rl.this;

         public void mouseUp(MouseEvent var1) {
            try {
               if(this.dN.dN() == 0) {
                  if(this.dN.mS()) {
                     this.ld.wU.setImage(this.ld.ld.dN("icon-media-pause.png"));
                     this.ld.QE.setEnabled(false);
                     this.ld.fa.setEnabled(false);
                  }
               } else if(this.dN.dN() == 2 && this.dN.OK()) {
                  this.ld.wU.setImage(this.ld.ld.dN("icon-media-play.png"));
                  this.ld.QE.setEnabled(true);
                  this.ld.fa.setEnabled(true);
               }
            } catch (Exception var2) {
               cn.dN("Audio error");
            }

         }

         public void mouseDown(MouseEvent var1) {
         }

         public void mouseDoubleClick(MouseEvent var1) {
         }
      });
      this.fa.setImage(this.ld.dN("icon-delete.png"));
      this.fa.setEnabled(var2.ld());
      this.fa.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private TH dN = var2;
         // $FF: synthetic field
         private rl ld = rl.this;

         public void mouseUp(MouseEvent var1) {
            try {
               if(this.dN.dN() == 0 && this.dN.QE()) {
                  this.ld.wU.setEnabled(false);
                  this.ld.fa.setEnabled(false);
               }
            } catch (Exception var2) {
               cn.dN("Audio error");
            }

         }

         public void mouseDown(MouseEvent var1) {
         }

         public void mouseDoubleClick(MouseEvent var1) {
         }
      });
   }

   public void dN(int var1, int var2) {
      if(var1 == 2 && var2 == 0) {
         Display.getDefault().syncExec(new Runnable() {
            // $FF: synthetic field
            private rl dN = rl.this;

            public void run() {
               this.dN.wU.setImage(this.dN.ld.dN("icon-media-play.png"));
               this.dN.QE.setEnabled(true);
               this.dN.fa.setEnabled(true);
            }
         });
      }

   }

   public void dispose() {
      this.dN.ld(this);

      try {
         this.dN.wU();
      } catch (Exception var1) {
         ;
      }

      this.dN.dN(0, -1L);
      super.dispose();
   }
}
