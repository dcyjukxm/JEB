package jebglobal;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jebglobal.Dp;
import jebglobal.HC;
import jebglobal.JK;
import jebglobal.Oa;
import jebglobal.QV;
import jebglobal.QW;
import jebglobal.Vt;
import jebglobal.XQ;
import jebglobal.ZO;
import jebglobal.aH;
import jebglobal.as;
import jebglobal.fW;
import jebglobal.nS;
import jebglobal.oa;
import jebglobal.rP;
import jebglobal.xh;
import jebglobal.yW;
import jebglobal.yn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Widget;

public final class Gq implements XQ, aH {
   private yW dN;
   private boolean ld;
   private Shell QE;
   private ToolBar wU;
   private Menu fa;
   private HC zs;
   private List mS = new ArrayList();
   private Menu OK;
   private Menu LH;
   private Menu KK;
   private Menu EO;
   private MenuItem cb;
   private MenuItem PF;
   private MenuItem Hw;
   private MenuItem rK;
   private MenuItem Ux;
   private MenuItem ZY;
   private MenuItem s;
   private MenuItem Hv;
   private MenuItem VX;
   private MenuItem ci;
   private MenuItem bG;
   private MenuItem BQ;
   private MenuItem Ee;
   private MenuItem De;
   private MenuItem rn;
   private MenuItem LR;
   private MenuItem Nh;
   private ToolItem XZ;
   private ToolItem nA;
   private ToolItem Ai;
   private int uM = 0;
   private List kq = new ArrayList();
   private ConcurrentHashMap ir = new ConcurrentHashMap();
   private Dp rF;
   private JK IL;

   public Gq(yW var1, ToolBar var2, int var3) {
      this.dN = var1;
      this.ld = var1.cb();
      this.QE = var1.LR();
      this.wU = var2;
      this.fa = new Menu(this.QE, 2);
      this.zs = HC.dN();
      this.uM = var3;
      this.mS();
   }

   public void ld(String var1) {
      if(this.uM > 0 && !this.kq.contains(var1)) {
         int var2 = this.ld?0:2;
         if(this.uM > 0 && this.kq.size() >= this.uM) {
            this.OK.getItem(this.OK.getItemCount() - 1 - var2).dispose();
            this.kq.remove(0);
         } else if(this.kq.isEmpty()) {
            new MenuItem(this.OK, 2, this.OK.getItemCount() - var2);
         }

         int var3 = this.OK.getItemCount() - this.kq.size() - var2;
         MenuItem var4 = new MenuItem(this.OK, 0, var3);
         var4.setEnabled(true);
         var4.setText((new File(var1)).getName());
         var4.setData(var1);
         var4.addSelectionListener(new SelectionAdapter() {
            // $FF: synthetic field
            private Gq dN = Gq.this;

            public void widgetSelected(SelectionEvent var1) {
               String var2 = (String)var1.widget.getData();
               if(var2 != null) {
                  this.dN.dN.dN(var2);
               }

            }
         });
         this.kq.add(var1);
      }
   }

   private void mS() {
      SelectionAdapter var1 = new SelectionAdapter() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void widgetSelected(SelectionEvent var1) {
            new nS(var1.widget);
            if(var1.widget != this.dN.cb && var1.widget != this.dN.XZ) {
               if(var1.widget == this.dN.PF) {
                  this.dN.dN.dN(2);
               } else if(var1.widget == this.dN.rK) {
                  this.dN.dN.QE(0);
               } else if(var1.widget == this.dN.Ux) {
                  this.dN.dN.QE(1);
               } else if(var1.widget == this.dN.ZY) {
                  this.dN.dN.QE(2);
               } else if(var1.widget != this.dN.s && var1.widget != this.dN.nA) {
                  if(var1.widget == this.dN.Hv) {
                     this.dN.dN.ld(true);
                  } else if(var1.widget == this.dN.VX) {
                     this.dN.dN.QE(false);
                  } else if(var1.widget == this.dN.ci) {
                     this.dN.dN.QE(true);
                  } else if(var1.widget == this.dN.bG) {
                     this.dN.dN.rF();
                  } else if(var1.widget == this.dN.BQ) {
                     this.dN.dN.mS(rP.dN(new byte[]{0, 26, 4, 13, 27, 7, 0, 72, 0, 69, 80, 23, 9, 73, 66, 25, 87, 92, 88, 0, 83, 92, 93, 92, 91, 69, 43, 82, 8, 13, 76, 17, 72, 4, 78, 0, 74, 2, 29, 0, 31, 17, 1, 83, 8, 9, 8, 71}, 2, 142));
                  } else {
                     Control var2;
                     if(var1.widget == this.dN.Ee) {
                        var2 = Display.getCurrent().getFocusControl();
                        if(var2 instanceof StyledText) {
                           ((StyledText)var2).copy();
                        }
                     } else if(var1.widget == this.dN.De) {
                        var2 = Display.getCurrent().getFocusControl();
                        if(var2 instanceof StyledText) {
                           ((StyledText)var2).paste();
                        }
                     } else if(var1.widget == this.dN.rn) {
                        var2 = Display.getCurrent().getFocusControl();
                        if(var2 instanceof StyledText) {
                           ((StyledText)var2).selectAll();
                        }
                     } else if(var1.widget == this.dN.Ai) {
                        this.dN.wU();
                     }
                  }
               } else {
                  this.dN.dN.ld(false);
               }
            } else {
               this.dN.dN.ir();
            }

         }
      };
      MenuItem var2 = new MenuItem(this.fa, 64);
      var2.setText("&File");
      Menu var3 = new Menu(this.QE, 4);
      var2.setMenu(var3);
      this.OK = var3;
      var2 = new MenuItem(var3, 0);
      var2.setText("&Open...\tCtrl+O");
      var2.setImage(this.zs.dN("icon-open.png"));
      var2.setAccelerator(SWT.MOD1 | 79);
      var2.addSelectionListener(var1);
      this.cb = var2;
      var2 = new MenuItem(var3, 0);
      var2.setEnabled(false);
      var2.setText("&Close\tCtrl+W");
      var2.setAccelerator(SWT.MOD1 | 87);
      var2.addSelectionListener(var1);
      this.PF = var2;
      new MenuItem(var3, 2);
      var2 = new MenuItem(var3, 64);
      var2.setEnabled(false);
      var2.setText("&Export");
      var2.setImage(this.zs.dN("icon-export.png"));
      this.Hw = var2;
      Menu var4 = new Menu(this.QE, 4);
      this.Hw.setMenu(var4);
      var2 = new MenuItem(var4, 0);
      var2.setText("&Assembly...");
      var2.addSelectionListener(var1);
      this.rK = var2;
      var2 = new MenuItem(var4, 0);
      var2.setText("Decompiled &Java...\tCtrl+J");
      var2.setAccelerator(SWT.MOD1 | 74);
      var2.addSelectionListener(var1);
      this.Ux = var2;
      var2 = new MenuItem(var4, 0);
      var2.setText("&Resources and Assets...");
      var2.addSelectionListener(var1);
      this.ZY = var2;
      var2 = new MenuItem(var3, 0);
      var2.setEnabled(false);
      var2.setText("&Save\tCtrl+S");
      var2.setImage(this.zs.dN("icon-save.png"));
      var2.setAccelerator(SWT.MOD1 | 83);
      var2.addSelectionListener(var1);
      this.s = var2;
      var2 = new MenuItem(var3, 0);
      var2.setEnabled(false);
      var2.setText("Save &As...");
      var2.setImage(this.zs.dN("icon-save.png"));
      var2.addSelectionListener(var1);
      this.Hv = var2;
      new MenuItem(var3, 2);
      var2 = new MenuItem(var3, 0);
      var2.setEnabled(true);
      var2.setText("Run Script...");
      var2.addSelectionListener(var1);
      this.VX = var2;
      var2 = new MenuItem(var3, 0);
      var2.setEnabled(true);
      var2.setText("Run last Script\tCtrl+I");
      var2.setAccelerator(SWT.MOD1 | 73);
      var2.addSelectionListener(var1);
      this.ci = var2;
      new MenuItem(var3, 2);
      var2 = new MenuItem(var3, 0);
      var2.setEnabled(false);
      var2.setText("Prope&rties...");
      var2.setImage(this.zs.dN("icon-properties.png"));
      var2.addSelectionListener(var1);
      this.bG = var2;
      if(!this.ld) {
         new MenuItem(var3, 2);
         var2 = new MenuItem(var3, 0);
         var2.setText("E&xit\tAlt+F4");
         var2.addSelectionListener(new SelectionAdapter() {
            // $FF: synthetic field
            private Gq dN = Gq.this;

            public void widgetSelected(SelectionEvent var1) {
               this.dN.zs();
            }
         });
      }

      var2 = new MenuItem(this.fa, 64);
      var2.setText("&Edit");
      var3 = new Menu(this.QE, 4);
      var2.setMenu(var3);
      var2 = new MenuItem(var3, 0);
      var2.setText("Cu&t\tCtrl+X");
      var2.setAccelerator(SWT.MOD1 | 88);
      var2.addSelectionListener(var1);
      this.BQ = var2;
      var2 = new MenuItem(var3, 0);
      var2.setText("&Copy\tCtrl+C");
      var2.setAccelerator(SWT.MOD1 | 67);
      var2.addSelectionListener(var1);
      this.Ee = var2;
      var2 = new MenuItem(var3, 0);
      var2.setText("&Paste\tCtrl+V");
      var2.setAccelerator(SWT.MOD1 | 86);
      var2.addSelectionListener(var1);
      this.De = var2;
      var2 = new MenuItem(var3, 0);
      var2.setText("Select &All\tCtrl+A");
      var2.setAccelerator(SWT.MOD1 | 65);
      var2.addSelectionListener(var1);
      this.rn = var2;
      new MenuItem(var3, 2);
      var2 = new MenuItem(var3, 0);
      var2.setText("&Find...\tCtrl+F");
      var2.setAccelerator(SWT.MOD1 | 70);
      var2.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void widgetSelected(SelectionEvent var1) {
            QW var2 = this.dN.ld();
            if(var2 != null) {
               fW var3 = new fW(this.dN.QE, var2);
               var3.ld();
            }

         }
      });
      this.LR = var2;
      var2 = new MenuItem(var3, 0);
      var2.setText("Find &Next\tCtrl+K");
      var2.setAccelerator(SWT.MOD1 | 75);
      var2.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void widgetSelected(SelectionEvent var1) {
            QW var2 = this.dN.ld();
            if(var2 != null) {
               var2.dN((oa)null);
            }

         }
      });
      this.Nh = var2;
      if(!this.ld) {
         new MenuItem(var3, 2);
         var2 = new MenuItem(var3, 0);
         var2.setText("&Options...");
         var2.setImage(this.zs.dN("icon-options.png"));
         var2.addSelectionListener(new SelectionAdapter() {
            // $FF: synthetic field
            private Gq dN = Gq.this;

            public void widgetSelected(SelectionEvent var1) {
               this.dN.wU();
            }
         });
      }

      var2 = new MenuItem(this.fa, 64);
      var2.setText("&Action");
      var3 = new Menu(this.QE, 4);
      var2.setMenu(var3);
      this.LH = var3;
      var2 = new MenuItem(var3, 64);
      var2.setText("&Custom Actions");
      var2.setImage(this.zs.dN("icon-script.png"));
      this.KK = new Menu(this.QE, 4);
      var2.setMenu(this.KK);
      var2 = new MenuItem(this.fa, 64);
      var2.setText("&Window");
      var3 = new Menu(this.QE, 4);
      var2.setMenu(var3);
      this.EO = var3;
      var2 = new MenuItem(this.fa, 64);
      var2.setText("&Help");
      var3 = new Menu(this.QE, 4);
      var2.setMenu(var3);
      var2 = new MenuItem(var3, 0);
      if(this.ld) {
         var2.setText("&Online Manual");
      } else {
         var2.setText("&Online Manual\tF1");
         var2.setAccelerator(16777226);
      }

      var2.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.dN.ld(0);
         }
      });
      var2 = new MenuItem(var3, 0);
      var2.setText("API &Documentation");
      var2.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.dN.ld(1);
         }
      });
      var2 = new MenuItem(var3, 0);
      var2.setText("&Bulletin Board");
      var2.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.dN.ld(2);
         }
      });
      new MenuItem(var3, 2);
      var2 = new MenuItem(var3, 0);
      var2.setText("&Changelist");
      var2.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.dN.Db();
         }
      });
      var2 = new MenuItem(var3, 0);
      var2.setText("Check for &Update");
      var2.setEnabled(false);
      var2.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.dN.fa(true);
         }
      });
      var2 = new MenuItem(var3, 0);
      var2.setText("&Memory Usage...");
      var2.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.dN.sC();
         }
      });
      if(!this.ld) {
         new MenuItem(var3, 2);
         var2 = new MenuItem(var3, 0);
         var2.setText("&About...");
         var2.setImage(this.zs.dN("icon-info.png"));
         var2.addSelectionListener(new SelectionAdapter() {
            // $FF: synthetic field
            private Gq dN = Gq.this;

            public void widgetSelected(SelectionEvent var1) {
               this.dN.fa();
            }
         });
      }

      this.QE.getDisplay().addFilter(15, new Listener() {
         // $FF: synthetic field
         private Gq dN = Gq.this;

         public void handleEvent(Event var1) {
            Widget var2 = var1.widget;
            this.dN.BQ.setEnabled(var2 instanceof StyledText && ((StyledText)var2).getEditable());
            this.dN.Ee.setEnabled(var2 instanceof StyledText);
            this.dN.De.setEnabled(var2 instanceof StyledText && ((StyledText)var2).getEditable());
            this.dN.rn.setEnabled(var2 instanceof StyledText);
            QW var3 = this.dN.ld();
            this.dN.LR.setEnabled(var3 != null);
            this.dN.Nh.setEnabled(var3 != null);
         }
      });
      this.dN.dN((aH)this);
      if(this.wU != null) {
         ToolItem var5 = new ToolItem(this.wU, 8);
         var5.setImage(this.zs.dN("icon-open.png"));
         var5.setToolTipText("Open a new file");
         var5.addSelectionListener(var1);
         this.XZ = var5;
         var5 = new ToolItem(this.wU, 8);
         var5.setImage(this.zs.dN("icon-save.png"));
         var5.setToolTipText("Save your analysis");
         var5.addSelectionListener(var1);
         var5.setEnabled(false);
         this.nA = var5;
         new ToolItem(this.wU, 2);
         var5 = new ToolItem(this.wU, 8);
         var5.setImage(this.zs.dN("icon-options.png"));
         var5.setToolTipText("Options");
         var5.addSelectionListener(var1);
         this.Ai = var5;
         new ToolItem(this.wU, 2);
      }
   }

   public QW ld() {
      for(Object var1 = Display.getCurrent().getFocusControl(); var1 != null; var1 = ((Control)var1).getParent()) {
         if(var1 instanceof QW) {
            return (QW)var1;
         }
      }

      return null;
   }

   public void dN(Oa var1) {
      this.mS.add(var1);
   }

   public Menu QE() {
      return this.fa;
   }

   public void dN(final QV var1) {
      MenuItem var2 = new MenuItem(this.EO, 0);
      var2.setText(var1.ld);
      var2.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private QV dN = var1;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.dN.dN(this.dN.ld, true);
         }
      });
   }

   public void ld(QV var1) {
      MenuItem[] var2 = this.EO.getItems();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         MenuItem var5 = var2[var4];
         if(var5.getText().equals(var1.ld)) {
            var5.dispose();
            break;
         }
      }

   }

   public void dN(String var1) {
      this.PF.setEnabled(true);
      this.Hw.setEnabled(true);
      this.s.setEnabled(true);
      this.Hv.setEnabled(true);
      this.bG.setEnabled(true);
      this.nA.setEnabled(true);
   }

   public void dN() {
      this.PF.setEnabled(false);
      this.Hw.setEnabled(false);
      this.s.setEnabled(false);
      this.Hv.setEnabled(false);
      this.bG.setEnabled(false);
      this.nA.setEnabled(false);
   }

   public boolean dN(as var1, boolean var2) {
      String var3 = var1.ld();
      if(var3 != null && !var3.isEmpty()) {
         Vt var4 = (Vt)this.ir.get(var3);
         SelectionAdapter var5 = new SelectionAdapter() {
            // $FF: synthetic field
            private Gq dN = Gq.this;

            public void widgetSelected(SelectionEvent var1) {
               Iterator var2 = this.dN.ir.values().iterator();

               label32:
               while(true) {
                  Vt var3;
                  do {
                     if(!var2.hasNext()) {
                        return;
                     }

                     var3 = (Vt)var2.next();
                  } while(!var3.dN(var1.widget));

                  Iterator var4 = var3.dN().iterator();

                  while(true) {
                     as var5;
                     do {
                        if(!var4.hasNext()) {
                           continue label32;
                        }

                        var5 = (as)var4.next();
                     } while(var5.dN() != null && !var5.dN().Hv());

                     var5.LH();
                  }
               }
            }
         };
         StringBuilder var6 = new StringBuilder(var3);
         int var7 = 0;
         int var8 = var1.QE();
         int var16;
         if(var8 != 0) {
            var6.append('\t');
            int var9 = var1.wU();

            while(var9 != 0) {
               if((var9 & SWT.MOD1) != 0) {
                  var6.append("Ctrl+");
                  var7 |= SWT.MOD1;
                  var9 &= ~SWT.MOD1;
               } else if((var9 & SWT.MOD2) != 0) {
                  var6.append("Shift+");
                  var7 |= SWT.MOD2;
                  var9 &= ~SWT.MOD2;
               } else if((var9 & SWT.MOD3) != 0) {
                  var6.append("Alt+");
                  var7 = SWT.MOD3;
                  var9 &= ~SWT.MOD3;
               } else if((var9 & 262144) != 0) {
                  var6.append("Ctrl+");
                  var7 = 262144;
                  var9 &= -262145;
               } else if((var9 & 131072) != 0) {
                  var6.append("Shift+");
                  var7 = 131072;
                  var9 &= -131073;
               } else {
                  if((var9 & 65536) == 0) {
                     return false;
                  }

                  var6.append("Alt+");
                  var7 = 65536;
                  var9 &= -65537;
               }
            }

            if(Character.isLetterOrDigit(var8)) {
               char var10 = Character.toUpperCase((char)var8);
               var6.append(var10);
               var7 |= var10;
            } else if(var8 >= 16777226 && var8 <= 16777237) {
               var16 = var8 - 16777226 + 1;
               var6.append("F" + var16);
               var7 |= var8;
            } else if(var8 == 13) {
               var6.append("Enter");
               var7 |= var8;
            } else if(var8 == 27) {
               var6.append("Esc");
               var7 |= var8;
            } else {
               if(var8 != 9) {
                  return false;
               }

               var6.append("Tab");
               var7 |= var8;
            }
         }

         String var18 = var6.toString();
         if(this.ld) {
            var16 = var18.indexOf("\t");
            if(var16 >= 0) {
               var18 = var18.substring(0, var16);
            }
         }

         boolean var17 = var1.dN() == null;
         int[] var11 = new int[]{-1};
         Image var12 = var1.mS();
         if(var4 == null) {
            MenuItem var13 = null;
            int var15;
            if(var1.dN(var11)) {
               Menu var14 = var2?this.KK:this.LH;
               var15 = var11[0];
               if(var15 < 0 || var15 > var14.getItemCount()) {
                  var15 = var14.getItemCount();
               }

               var13 = new MenuItem(var14, 0, var15);
               var13.setText(var18);
               if(var7 != 0) {
                  var13.setAccelerator(var7);
               }

               var13.setImage(var12);
               var13.addSelectionListener(var5);
               var13.setEnabled(var17);
            }

            ToolItem var20 = null;
            if(var1.ld(var11) && var12 != null) {
               var15 = var11[0];
               if(var15 < 0 || var15 > this.wU.getItemCount()) {
                  var15 = this.wU.getItemCount();
               }

               var20 = new ToolItem(this.wU, 8, var15);
               var20.setEnabled(var17);
               var20.setToolTipText(var3);
               var20.setImage(var12);
               var20.addSelectionListener(var5);
            }

            var4 = new Vt(var13, var20);
            this.ir.put(var3, var4);
         }

         if(var1.QE((int[])null)) {
            yn var19 = var1.dN();
            if(var19 != null) {
               xh var21 = new xh(var19.s(), var18, var1.mS(), var5);
               var21.dN(true);
               var4.dN(var21);
            }
         }

         var4.dN(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean dN(as var1) {
      String var2 = var1.ld();
      if(var2 != null && !var2.isEmpty()) {
         Vt var3 = (Vt)this.ir.get(var2);
         if(var3 == null) {
            return true;
         } else {
            if(var3.ld() != null) {
               var3.ld().dispose();
            }

            if(var3.QE() != null) {
               var3.QE().dispose();
            }

            Iterator var4 = var3.wU().iterator();

            while(var4.hasNext()) {
               xh var5 = (xh)var4.next();
               var5.ld();
            }

            this.ir.remove(var2);
            return false;
         }
      } else {
         return false;
      }
   }

   public void ld(as var1, boolean var2) {
      Iterator var3 = this.ir.values().iterator();

      while(true) {
         while(var3.hasNext()) {
            Vt var4 = (Vt)var3.next();
            Iterator var5 = var4.dN().iterator();

            while(var5.hasNext()) {
               as var6 = (as)var5.next();
               if(var6 == var1) {
                  var4.dN(var2);
                  break;
               }
            }
         }

         return;
      }
   }

   public void wU() {
      if(this.rF == null) {
         try {
            this.rF = new Dp(this.QE, this.dN);
            if(this.ld) {
               this.rF.setText("Preferences");
            }

            ZO var1 = this.rF.dN();
            if(var1 != null) {
               this.dN.dN(var1.dN.contains(ZO.uK.fa), var1.dN.contains(ZO.uK.zs));
            }
         } finally {
            this.rF = null;
         }

      }
   }

   public void fa() {
      try {
         JK var1 = new JK(this.QE);
         var1.ld();
      } finally {
         this.IL = null;
      }

   }

   public void zs() {
      this.QE.close();
   }
}
