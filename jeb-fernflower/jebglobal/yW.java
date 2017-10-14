package jebglobal;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.BA;
import jebglobal.CB;
import jebglobal.EK;
import jebglobal.GE;
import jebglobal.Gq;
import jebglobal.HC;
import jebglobal.QA;
import jebglobal.Qq;
import jebglobal.Rg;
import jebglobal.TM;
import jebglobal.Vm;
import jebglobal.WV;
import jebglobal.WX;
import jebglobal.Xa;
import jebglobal.aH;
import jebglobal.cn;
import jebglobal.eI;
import jebglobal.ew;
import jebglobal.fc;
import jebglobal.l;
import jebglobal.lW;
import jebglobal.ly;
import jebglobal.pQ;
import jebglobal.rB;
import jebglobal.rP;
import jebglobal.uK;
import jebglobal.vv;
import jebglobal.yn;
import jebglobal.yx;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;

public final class yW extends eI {
   private static final long LK = 844563159190538443L;
   private static yW Ux = null;
   private List ZY = new ArrayList();
   private Display s;
   private HC Hv;
   private Font VX;
   private fc ci;
   private Shell bG;
   private ToolBar BQ;
   private Gq Ee;
   private SashForm De;
   private l rn;
   private Label LR;
   private yx Nh;
   private String XZ;
   private int nA = 5;
   private boolean Ai;
   private Thread uM;
   private Thread kq;

   public static void dN(String var0, String var1, String var2, String[] var3) {
      if(Ux != null) {
         throw new RuntimeException("JEB is already running on a different thread.");
      } else {
         if(ld == EK.dN) {
            try {
               BA.launch(var0, var1, var2, var3);
            } catch (Exception var5) {
               var5.printStackTrace();
               System.out.println("Error: please use the -XstartOnFirstThread flag in jeb_macos.sh");
            }
         } else {
            (new yW(var0, var1, var2, var3)).rn();
         }

         System.exit(0);
      }
   }

   yW(String var1, String var2, String var3, String[] var4) {
      super(var1, var2, var3, var4);
      Ux = this;
      Display.setAppName("JEB");
      Display.setAppVersion(dN.toString());
      this.s = new Display();
      if(System.getProperty("os.name").startsWith("Mac")) {
         vv var5 = new vv("JEB");
         var5.hookApplicationMenu(this);
      }

      this.Hv = HC.dN();
      this.bG = new Shell(this.s);
      this.bG.setText("JEB");
      this.bG.setImages(this.Hv.dN(new String[]{"icon-jeb.png", "icon-jeb-32.png", "icon-jeb-48.png", "icon-jeb-128.png"}));
      int var7;
      int var9;
      if(this.rK.ld(WV.cb)) {
         this.bG.setMaximized(true);
      } else {
         var9 = this.rK.QE(WV.KK);
         int var6 = this.rK.QE(WV.EO);
         var7 = (this.s.getClientArea().width - var9) / 2;
         int var8 = (this.s.getClientArea().height - var6) / 2;
         if(var7 >= 0 && var8 >= 0) {
            this.bG.setLocation(var7, var8);
         }

         this.bG.setSize(var9, var6);
      }

      this.uB();
      this.dY();
      this.bG.setLayout(new FormLayout());
      this.BQ = new ToolBar(this.bG, 0);
      this.Ee = new Gq(this, this.BQ, this.nA);

      for(var9 = 0; var9 < this.nA; ++var9) {
         String var11 = this.Hw.dN("last_opened" + var9);
         if(var11 == null) {
            break;
         }

         this.Ee.ld(var11);
      }

      this.bG.setMenuBar(this.Ee.QE());
      this.bG.addListener(21, new Listener() {
         // $FF: synthetic field
         private yW dN = yW.this;

         public void handleEvent(Event var1) {
            if(this.dN.Nh.s() && !this.dN.Nh.dN(2)) {
               var1.doit = false;
            } else {
               this.dN.nb();
               if(this.dN.bG != null) {
                  this.dN.rK.dN(WV.KK, this.dN.bG.getSize().x);
                  this.dN.rK.dN(WV.EO, this.dN.bG.getSize().y);
                  this.dN.rK.dN(WV.cb, this.dN.bG.getMaximized());
               }

               if(this.dN.De != null) {
                  int[] var2 = this.dN.De.getWeights();
                  if(var2 != null && var2.length == 2) {
                     int var3 = 100 * var2[1] / (var2[0] + var2[1]);
                     this.dN.rK.dN(WV.PF, var3);
                  }
               }

               this.dN.rK.dN();
            }
         }
      });
      this.BQ.pack();
      FormData var10 = new FormData();
      var10.left = new FormAttachment(0);
      var10.right = new FormAttachment(100);
      var10.top = new FormAttachment(0);
      var10.height = this.BQ.computeSize(-1, -1).y;
      this.BQ.setLayoutData(var10);
      this.LR = new Label(this.bG, 2048);
      var10 = new FormData();
      var10.left = new FormAttachment(0, 0);
      var10.right = new FormAttachment(100, 0);
      var10.bottom = new FormAttachment(100, 0);
      var10.height = this.LR.computeSize(-1, -1).y;
      this.LR.setLayoutData(var10);
      this.LR.setText("");
      this.De = new SashForm(this.bG, 512);
      var10 = new FormData();
      var10.left = new FormAttachment(0);
      var10.right = new FormAttachment(100);
      var10.top = new FormAttachment(this.BQ);
      var10.bottom = new FormAttachment(this.LR);
      this.De.setLayoutData(var10);
      this.Nh = new yx(this.De, this);
      DropTarget var12 = new DropTarget(this.Nh, 7);
      var12.setTransfer(new Transfer[]{FileTransfer.getInstance()});
      var12.addDropListener(new DropTargetAdapter() {
         // $FF: synthetic field
         private yW dN = yW.this;

         public void drop(DropTargetEvent var1) {
            if(FileTransfer.getInstance().isSupportedType(var1.currentDataType)) {
               String[] var2 = (String[])((String[])var1.data);
               if(var2.length >= 1) {
                  String var3 = var2[0];
                  this.dN.dN(var3);
               }
            }

         }
      });
      this.rn = new l(this.De, this.VX);
      this.rn.dN(true);
      cn.dN((rB)this.rn);
      var7 = this.rK.QE(WV.PF);
      if(var7 < 0 || var7 > 100) {
         var7 = 18;
      }

      this.De.setWeights(new int[]{100 - var7, var7});
   }

   public void rn() {
      super.PF();
      Object[] var10000 = new Object[]{Integer.valueOf(SWT.MOD1), Integer.valueOf(SWT.MOD2), Integer.valueOf(SWT.MOD3), Integer.valueOf(SWT.MOD4), Integer.valueOf(262144), Integer.valueOf(131072), Integer.valueOf(65536), Integer.valueOf(4194304)};
      if(this.rK.ld(WV.BQ)) {
         this.jp();
      }

      if(this.rK.ld(WV.ci)) {
         this.fa(false);
      }

      this.bU();
      this.s.asyncExec(new Runnable() {
         // $FF: synthetic field
         private yW dN = yW.this;

         public void run() {
            this.dN.Qg();
         }
      });
      this.Rm();
      this.bG.open();

      while(!this.bG.isDisposed()) {
         boolean var1 = false;

         try {
            var1 = this.s.readAndDispatch();
         } catch (Exception var3) {
            this.dN(var3);
         }

         if(!var1) {
            CB.dN();
            this.s.sleep();
         }
      }

      cn.ld((rB)this.rn);
      this.s.dispose();
      Ux = null;
      super.Hw();
   }

   private void Qg() {
      if(this.cb != null || this.PF != null) {
         BusyIndicator.showWhile(this.Nh(), new Runnable() {
            // $FF: synthetic field
            private yW dN = yW.this;

            public void run() {
               if(this.dN.cb != null) {
                  this.dN.dN(this.dN.cb);
               }

               if(this.dN.PF != null) {
                  this.dN.XZ = this.dN.PF;
                  this.dN.QE(true);
               }

            }
         });
      }
   }

   public boolean rK() {
      return this.Nh.s();
   }

   public ew Ux() {
      return this.Nh.ld();
   }

   public AR ZY() {
      return this.Nh.QE();
   }

   public Rg s() {
      return this.Nh.wU();
   }

   public boolean Hv() {
      return this.ld(false);
   }

   public boolean VX() {
      return this.dN(0);
   }

   public boolean ld(String var1) {
      Xa var2 = new Xa(this.bG, this.VX, "End-User License Agreement", var1);
      var2.dN(20);
      var2.ld(80);
      var2.dN(false);
      var2.ld(false);
      var2.ld("Accept");
      var2.QE("Decline");
      return var2.dN() != null;
   }

   public String QE(String var1) {
      Qq var2 = new Qq(this.bG, this.VX, var1);
      return var2.dN();
   }

   public void ci() {
      MessageBox var1 = new MessageBox(this.bG, 196);
      var1.setText("Welcome");
      String var2 = String.format("This is your first execution of JEB v%s.\n\nWould you like to see the latest changelist?", new Object[]{dN.toString()});
      var1.setMessage(var2);
      if(var1.open() == 64) {
         Vm.QE("http://www.android-decompiler.com/changelist.php");
      }

   }

   public void bG() {
      MessageBox var1 = new MessageBox(this.bG, 72);
      var1.setText("Support has expired!");
      String var2 = String.format("Support for your JEB license has expired.\nPlease renew your license if you wish to keep receiving software updates.", new Object[0]);
      var1.setMessage(var2);
      var1.open();
   }

   public void dN(final long var1) {
      if(var1 != 0L) {
         this.s.syncExec(new Runnable() {
            // $FF: synthetic field
            private long dN = var1;
            // $FF: synthetic field
            private yW ld = yW.this;

            public void run() {
               MessageBox var1;
               if(this.dN == -1L) {
                  var1 = new MessageBox(this.ld.bG, 200);
                  var1.setText(rP.dN(new byte[]{-7, 44, 1, 26, 6, 29, 3, 0, 9, 23, 82, 69, 23, 0, 29, 29}, 1, 186));
                  var1.setMessage(rP.dN(new byte[]{-68, 60, 13, 69, 67, 12, 1, 26, 6, 29, 3, 0, 9, 23, 82, 73, 26, 83, 85, 27, 28, 23, 22, 3, 31, 1, 29, 26, 31, 19, 69, 79, 29, 82, 85, 27, 28, 23, 4, 2, 11, 9, 3, 14, 9, 73, 12, 106, 15, 7, 98, 87, 30, 5, 0, 76, 84, 17, 23, 31, 4, 7, 15, 21, 17, 75, 36, 93, 56, 26, 25, 8, 68, 89, 22, 26, 85, 76, 5, 2, 14, 69, 84, 27, 79, 83, 18, 23, 19, 69, 89, 22, 26, 7, 82, 87, 24, 29, 25, 84}, 1, 232));
                  if(var1.open() == 64) {
                     this.ld.Hv();
                  }
               } else if(this.dN == 1L) {
                  var1 = new MessageBox(this.ld.bG, 66);
                  var1.setText(rP.dN(new byte[]{-55, 46, 3, 12, 8, 14, 1, 68, 66, 27, 89, 67, 12, 1, 26, 6, 29, 3, 0, 9, 23}, 1, 139));
                  var1.setMessage(rP.dN(new byte[]{75, 33, 79, 77, 2, 29, 23, 69, 83, 22, 4, 21, 7, 83, 65, 19, 23, 69, 65, 23, 23, 8, 5, 13, 3, 14, 9, 69, 84, 27, 79, 82, 7, 27, 78, 106, 15, 7, 108, 36, 90, 34, 23, 22, 0, 83, 111, 4, 107, 84, 27, 79, 84, 17, 23, 31, 4, 7, 15, 21, 17, 69, 84, 28, 13, 69, 80, 2, 29, 8, 21, 19, 12, 67}, 1, 5));
                  var1.open();
               } else if(this.dN == 2L) {
                  var1 = new MessageBox(this.ld.bG, 66);
                  var1.setText(rP.dN(new byte[]{1, 3, 31, 26, 25, 12, 3, 72, 22, 89, 8, 0, 70, 78, 69, 75, 86, 95, 64, 69, 64}, 2, 15));
                  var1.setMessage(rP.dN(new byte[]{97, 60, 13, 69, 67, 15, 5, 12, 11, 26, 84, 73, 26, 83, 84, 27, 0, 79, 79, 3, 8, 72, 12, 80, 28, 9, 4, 18, 22, 69, 85, 5, 20, 5, 21, 17, 69, 106, 15, 7, 108, 36, 90, 34, 23, 22, 0, 83, 111, 4, 107, 84, 27, 79, 84, 17, 23, 31, 4, 7, 15, 21, 17, 69, 84, 28, 13, 69, 80, 2, 29, 8, 21, 19, 12, 67}, 1, 53));
                  var1.open();
               } else if(this.dN == 3L) {
                  var1 = new MessageBox(this.ld.bG, 66);
                  var1.setText(rP.dN(new byte[]{1, 3, 31, 26, 25, 12, 3, 72, 22, 89, 8, 0, 70, 78, 69, 75, 86, 95, 64, 69, 64}, 2, 117));
                  var1.setMessage(rP.dN(new byte[]{10, 1, 19, 22, 31, 25, 6, 28, 29, 66, 68, 6, 9, 66, 68, 80, 85, 87, 95, 12, 18, 93, 80, 88, 73, 0, 60, 7, 19, 6, 76, 47, 101, 35, 78, 5, 65, 11, 82, 84, 1, 17, 83, 67, 14, 8, 18, 27, 3, 5, 13, 17, 23, 83, 79, 82, 36, 76, 0, 73, 17, 12, 9, 27, 17, 23, 0, 6, 10, 83, 17, 26, 19, 69, 23, 79, 46, 10, 80, 28, 28, 29, 14, 28, 13, 14, 34, 51, 91, 69, 66, 74, 25, 124, 103, 0, 70, 95, 17, 71, 73, 82, 34, 27, 15, 2, 24, 0, 0, 21, 6, 1, 15, 31, 0, 79, 14, 6, 18, 77, 79}, 2, 156));
                  var1.open();
               }

               eI.Ee();
            }
         });
      }

   }

   public Shell LR() {
      return this.bG;
   }

   public void dN(aH var1) {
      this.ZY.add(var1);
   }

   public void dN(boolean var1, boolean var2) {
      boolean var3 = this.uB();
      boolean var4 = this.dY();
      if(this.Nh.s()) {
         List var5 = this.Nh.zs();
         Iterator var6;
         Control var7;
         if(var3) {
            var6 = var5.iterator();

            while(var6.hasNext()) {
               var7 = (Control)var6.next();
               if(var7 instanceof lW) {
                  ((lW)var7).setFont(this.VX);
               }

               if(var7 instanceof ly) {
                  ((ly)var7).setFont(this.VX);
               }
            }

            this.rn.setFont(this.VX);
         }

         if(var4) {
            var6 = var5.iterator();

            while(var6.hasNext()) {
               var7 = (Control)var6.next();
               if(var7 instanceof yn) {
                  ((yn)var7).dN(this.ci);
               }
            }
         }

         this.Nh.OK().dN(true);
         this.Nh.cb().dN(true);
      }
   }

   private boolean uB() {
      Font var1 = this.VX;
      this.VX = null;

      try {
         this.VX = this.Hv.dN(new FontData(this.rK.dN(WV.rn)));
      } catch (Exception var13) {
         try {
            int var2 = this.bG.getDisplay().getDPI().y;

            for(int var3 = 9; var3 <= 14; ++var3) {
               this.VX = this.Hv.dN("Courier New", var3, 0);
               GC var6 = new GC(this.bG);

               double var4;
               try {
                  var6.setFont(this.VX);
                  var4 = (double)var6.getFontMetrics().getHeight();
               } finally {
                  var6.dispose();
               }

               if(var4 / (double)var2 >= 0.15625D) {
                  break;
               }
            }
         } catch (Exception var12) {
            this.VX = this.s.getSystemFont();
         }

         this.rK.dN(WV.rn, this.VX.getFontData()[0].toString());
      }

      return var1 == null?true:!this.VX.getFontData()[0].toString().equals(var1.getFontData()[0].toString());
   }

   private boolean dY() {
      this.ci = new fc(this.bG.getDisplay(), this.rK.dN(WV.LR));
      return true;
   }

   public Display Nh() {
      return this.s;
   }

   public Font XZ() {
      return this.VX;
   }

   public fc nA() {
      return this.ci;
   }

   public Gq Ai() {
      return this.Ee;
   }

   public yx uM() {
      return this.Nh;
   }

   public lW kq() {
      return this.rn;
   }

   public boolean ir() {
      FileDialog var1 = new FileDialog(this.bG, 4096);
      var1.setFilterExtensions(new String[]{"*", "*.apk", "*.dex"});
      var1.setFilterNames(new String[]{"All files (*)", "Android applications (*.apk)", "Dalvik files (*.dex)"});
      String var2 = var1.open();
      return var2 == null?false:this.dN(var2);
   }

   public boolean dN(String var1) {
      var1 = this.Nh.dN(var1);
      if(var1 == null) {
         return false;
      } else {
         this.bG.setText(String.format("%s - %s", new Object[]{"JEB", var1}));
         this.Ee.ld(var1);
         int var2 = -1;
         String[] var3 = new String[this.nA];

         int var4;
         for(var4 = 0; var4 < this.nA; ++var4) {
            var3[var4] = this.Hw.dN("last_opened" + var4);
            if(var3[var4] == null) {
               var2 = var4;
               break;
            }
         }

         if(var2 < 0) {
            var2 = this.nA - 1;

            for(var4 = 0; var4 < var2; ++var4) {
               var3[var4] = var3[var4 + 1];
            }
         }

         this.Hw.dN("last_opened" + var2, (new File(var1)).getAbsolutePath());
         this.Hw.dN();
         Iterator var6 = this.ZY.iterator();

         while(var6.hasNext()) {
            aH var5 = (aH)var6.next();
            var5.dN(var1);
         }

         this.cb = var1;
         return true;
      }
   }

   public boolean dN(int var1) {
      if(!this.Nh.s()) {
         return false;
      } else if(!this.Nh.dN(var1)) {
         return false;
      } else {
         this.zs("");
         this.bG.setText("JEB");
         Iterator var2 = this.ZY.iterator();

         while(var2.hasNext()) {
            aH var3 = (aH)var2.next();
            var3.dN();
         }

         this.cb = null;
         return true;
      }
   }

   public boolean ld(boolean var1) {
      return !this.Nh.s()?false:this.Nh.Hv();
   }

   private void Rm() {
      if(this.kq == null) {
         this.kq = new Thread(new Runnable() {
            public void run() {
               while(true) {
                  while(true) {
                     try {
                        int var1 = yW.this.rK.QE(WV.De);
                        if(var1 <= 0) {
                           Thread.sleep(60000L);
                           continue;
                        }

                        Thread.sleep((long)(var1 * 60 * 1000));
                     } catch (InterruptedException var2) {
                        return;
                     }

                     yW.this.s.syncExec(new Runnable() {
                        // $FF: synthetic field
                        private <undefinedtype> dN = <VAR_NAMELESS_ENCLOSURE>;

                        public void run() {
                           yW.this.Hv();
                        }
                     });
                  }
               }
            }
         });
         this.kq.setDaemon(true);
         this.kq.start();
      }

   }

   private void nb() {
      if(TM.dN(this.kq)) {
         this.kq = null;
      }

   }

   public void fa(String var1) {
      this.XZ = var1;
      this.QE(true);
   }

   public void QE(boolean var1) {
      if(!var1 || this.XZ == null) {
         FileDialog var2 = new FileDialog(this.bG, 4096);
         var2.setFilterExtensions(new String[]{"*", "*.py", "*.java"});
         var2.setFilterNames(new String[]{"All files (*)", "Python scripts (*.py)", "Java scripts (*.java)"});
         this.XZ = var2.open();
         if(this.XZ == null) {
            return;
         }
      }

      final GE var7 = new GE(this.bG, this, "Script execution", "Press the button below to interrupt the execution...");
      long var3 = this.De();
      QA var5 = this.dN(this.XZ, false, new Runnable() {
         // $FF: synthetic field
         private yW ld = yW.this;

         public void run() {
            this.ld.s.syncExec(new Runnable() {
               // $FF: synthetic field
               private <undefinedtype> dN = <VAR_NAMELESS_ENCLOSURE>;

               public void run() {
                  var7.QE();
               }
            });
         }
      });
      if(var5 == null) {
         cn.dN("An error occurred, the script could not be loaded");
      } else {
         if(var7.dN().booleanValue()) {
            cn.dN("The script execution was interrupted by the user");
         }

         while(!var5.ld()) {
            try {
               Thread.sleep(200L);
            } catch (InterruptedException var6) {
               ;
            }
         }

         if(var5.dN() != QA.uK.QE) {
            cn.dN("An error occurred, the script could not be terminated");
         }
      }

      this.ld(var3);
   }

   public void rF() {
      if(this.Nh.s()) {
         this.Nh.VX();
      }
   }

   public void zs(String var1) {
      if(!this.Ai) {
         this.LR.setText(var1);
      }
   }

   public String IL() {
      return this.LR.getText();
   }

   public void wU(boolean var1) {
      this.Ai = !var1;
   }

   public void ld(int var1) {
      if(var1 == 0) {
         Vm.QE("http://www.android-decompiler.com/manual.php");
      } else if(var1 == 1) {
         Vm.QE("http://www.android-decompiler.com/apidoc");
      } else if(var1 == 2) {
         Vm.QE("https://groups.google.com/forum/#!forum/jeb-decompiler");
      }

   }

   public void Db() {
      Vm.QE("http://www.android-decompiler.com/changelist.php");
   }

   public void sC() {
      Runtime var1 = Runtime.getRuntime();
      var1.gc();
      double var2 = (double)var1.freeMemory() / 1048576.0D;
      double var4 = (double)var1.totalMemory() / 1048576.0D;
      double var6 = var4 - var2;
      StringBuilder var8 = new StringBuilder();
      var8.append(String.format("%.2f Mb reserved by the JVM.\n- Free: %.2f Mb\n- In use: %.2f Mb\n", new Object[]{Double.valueOf(var4), Double.valueOf(var2), Double.valueOf(var6)}));
      MessageBox var9 = new MessageBox(this.bG, 34);
      var9.setText("Memory usage");
      var9.setMessage(var8.toString());
      var9.open();
   }

   void fa(boolean var1) {
      if(this.uM != null) {
         try {
            this.uM.join(500L);
            if(this.uM.isAlive()) {
               return;
            }
         } catch (InterruptedException var2) {
            ;
         }
      }

      this.uM = TM.ld(new Runnable() {
         // $FF: synthetic field
         private yW dN = yW.this;

         public void run() {
            this.dN.dN(false);
         }
      });
   }

   public void jp() {
      if(mS.contains("OS X") && !fa.startsWith("Apple")) {
         MessageBox var1 = new MessageBox(this.bG, 40);
         var1.setText("Unsupported Java");
         String var2 = "It seems you are not using the standard Apple Java distribution.\n\nUI issues have been reported with SWT and non-Apple Java distributions on Mac OS X.\n\n(This warning may be disabled in the Preferences dialog.)";
         var1.setMessage(var2);
         var1.open();
      }

   }

   public void zs(boolean var1) {
      Runtime var2 = Runtime.getRuntime();
      if(var1) {
         var2.gc();
      }

      double var3 = (double)var2.freeMemory() / 1048576.0D;
      double var5 = (double)var2.totalMemory() / 1048576.0D;
      double var7 = var5 - var3;
      Object[] var10000 = new Object[]{Double.valueOf(var5), Double.valueOf(var3), Double.valueOf(var7)};
   }

   public void mS(String var1) {
      MessageBox var2 = new MessageBox(this.bG, 34);
      var2.setText(rP.dN(new byte[]{7, 10, 29, 22, 82, 5, 14, 5, 29, 84, 73, 23, 64, 79, 95}, 2, 138));
      var2.setMessage(var1);
      var2.open();
   }

   public void dN(Exception var1) {
      String var2 = (new SimpleDateFormat("yyyyMMddHHmmssSSS")).format(new Date());
      File var3 = new File(EO, String.format("error-%s.txt", new Object[]{var2}));

      StringBuilder var4;
      try {
         var4 = new StringBuilder("*** JEB ERROR LOG ***\n");
         var2 = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z")).format(new Date());
         var4.append(String.format("timestamp: %s\n", new Object[]{var2}));
         var4.append(String.format("version: %s\n", new Object[]{dN.toString()}));
         var4.append(String.format("userid: %d\n", new Object[]{Integer.valueOf(0)}));
         var4.append(String.format("build type: %d\n", new Object[]{Integer.valueOf(uK.dN)}));
         var4.append(String.format("floating: %s\n", new Object[]{Boolean.valueOf(uK.wU())}));
         var4.append("stacktrace:\n" + TM.dN((Throwable)var1));
         TM.dN(var3, TM.EO(var4.toString()), false);
      } catch (IOException var6) {
         System.exit(1);
      }

      var4 = new StringBuilder("An unknown error occurred. ");
      var4.append("You may be able to proceed, but it is recommended you save your work and restart JEB.\n\n");
      var4.append(String.format("An error log has been created and dumped to: %s.\n", new Object[]{var3.getAbsolutePath()}));
      var4.append(String.format("Thank you for sending this report to %s.", new Object[]{"support@android-decompiler.com"}));
      MessageBox var5 = new MessageBox(this.bG, 33);
      var5.setText("Error");
      var5.setMessage(var4.toString());
      var5.open();
   }

   public void QE(int var1) {
      this.mS(rP.dN(new byte[]{7, 10, 19, 22, 31, 25, 14, 4, 17, 68, 8, 41, 72, 86, 80, 25, 90, 95, 77, 83, 65, 85, 66, 19, 79, 65, 33, 28, 14, 23, 76, 7, 69, 65, 11, 28, 95, 0, 0, 84, 12, 16, 83, 73, 15, 70, 18, 1, 9, 73, 5, 17, 8, 28, 14, 86, 36, 30, 31, 73, 29, 7, 73}, 2, 203));
   }

   public boolean bU() {
      File var1 = new File(this.LH());
      if(!var1.isDirectory()) {
         cn.dN("Invalid plugin directory");
         return false;
      } else {
         File[] var2 = var1.listFiles();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            File var5 = var2[var4];
            String var6 = var5.getName();
            if(var5.isFile() && (var6.endsWith(".py") || var6.endsWith(".java"))) {
               if(!var5.canRead()) {
                  cn.dN(String.format("Cannot read plugin script: %s", new Object[]{var6}));
               } else {
                  cn.dN(String.format("Loading plugin: %s", new Object[]{var6}));
                  WX var7 = WX.dN(var5);
                  if(var7 == null) {
                     cn.dN("Invalid plugin");
                  } else {
                     if(var7.wU()) {
                        if(this.rK.ld(WV.rK)) {
                           this.fa(var7.dN());
                        } else {
                           cn.dN("Automatic execution of plugins on startup is disabled");
                        }
                     }

                     this.Ee.dN(new pQ(this, var7), true);
                  }
               }
            }
         }

         return true;
      }
   }
}
