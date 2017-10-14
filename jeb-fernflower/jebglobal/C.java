package jebglobal;

import jebglobal.HC;
import jebglobal.TM;
import jebglobal.WV;
import jebglobal.fL;
import jebglobal.fc;
import jebglobal.wy;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TypedListener;

public final class C extends fL {
   private TM wU;
   boolean dN = false;
   fc ld;
   CCombo QE;
   private C.uK fa;
   private C.uK zs;

   public C(Shell var1, TM var2) {
      super(var1, "Styles");
      this.wU = var2;
   }

   public fc dN() {
      super.ld();
      return this.dN?this.ld:null;
   }

   protected void dN(final Shell var1) {
      var1.setLayout(new FillLayout());
      String var2 = this.wU.dN(WV.LR);
      this.ld = new fc(var1.getDisplay(), var2);
      Composite var3 = new Composite(var1, 0);
      var3.setLayout(new RowLayout(512));
      Group var4 = new Group(var3, 0);
      var4.setLayout(new RowLayout(512));
      var4.setText("Items");
      Composite var5 = new Composite(var4, 0);
      var5.setLayout(new RowLayout(256));
      Label var6 = new Label(var5, 0);
      var6.setText("Type:  ");
      this.QE = new CCombo(var5, 8390664);
      final fc.uK[] var7 = fc.uK.values();
      fc.uK[] var8 = var7;
      int var9 = var7.length;

      for(int var10 = 0; var10 < var9; ++var10) {
         fc.uK var11 = var8[var10];
         String var12 = var11.toString().toLowerCase().replace('_', ' ');
         var12 = Character.toUpperCase(var12.charAt(0)) + var12.substring(1);
         this.QE.add(var12);
      }

      Group var29 = new Group(var4, 0);
      var29.setLayout(new RowLayout(256));
      var29.setText("Normal");
      final C.uK var30 = new C.uK(var29, "Foreground");
      final C.uK var31 = new C.uK(var29, "Background");
      final Button var32 = TM.ld(var29, "Bold", (SelectionListener)null);
      final Button var33 = TM.ld(var29, "Italic", (SelectionListener)null);
      Group var13 = new Group(var4, 0);
      var13.setLayout(new RowLayout(256));
      var13.setText("Active");
      final C.uK var14 = new C.uK(var13, "Foreground");
      final C.uK var15 = new C.uK(var13, "Background");
      final Button var16 = TM.ld(var13, "Bold", (SelectionListener)null);
      final Button var17 = TM.ld(var13, "Italic", (SelectionListener)null);
      Group var18 = new Group(var3, 0);
      var18.setLayout(new RowLayout(256));
      var18.setText("Backgrounds");
      this.fa = new C.uK(var18, "General");
      this.zs = new C.uK(var18, "Current line");
      Composite var19 = new Composite(var3, 0);
      var19.setLayout(new RowLayout(256));
      Button var20 = TM.dN((Composite)var19, (String)"OK", (SelectionListener)null);
      Button var21 = TM.dN((Composite)var19, (String)"Cancel", (SelectionListener)null);
      Button var22 = TM.dN((Composite)var19, (String)"Reset to defaults", (SelectionListener)null);
      this.QE.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private fc.uK[] dN = var7;
         // $FF: synthetic field
         private C.uK ld = var30;
         // $FF: synthetic field
         private C.uK QE = var31;
         // $FF: synthetic field
         private Button wU = var32;
         // $FF: synthetic field
         private Button fa = var33;
         // $FF: synthetic field
         private C.uK zs = var14;
         // $FF: synthetic field
         private C.uK mS = var15;
         // $FF: synthetic field
         private Button OK = var16;
         // $FF: synthetic field
         private Button LH = var17;
         // $FF: synthetic field
         private C KK = C.this;

         public void widgetSelected(SelectionEvent var1) {
            int var2 = this.KK.QE.getSelectionIndex();
            wy var3 = this.KK.ld.dN(this.dN[var2]);
            this.ld.dN(var3.dN);
            this.QE.dN(var3.ld);
            this.wU.setSelection(var3.QE);
            this.fa.setSelection(var3.wU);
            var3 = this.KK.ld.ld(this.dN[var2]);
            this.zs.dN(var3.dN);
            this.mS.dN(var3.ld);
            this.OK.setSelection(var3.QE);
            this.LH.setSelection(var3.wU);
         }
      });
      SelectionAdapter var23 = new SelectionAdapter() {
         // $FF: synthetic field
         private fc.uK[] dN = var7;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            int var2 = this.ld.QE.getSelectionIndex();
            this.ld.ld.dN(this.dN[var2]).dN = ((C.uK)var1.widget).dN();
         }
      };
      var30.dN((SelectionListener)var23);
      SelectionAdapter var24 = new SelectionAdapter() {
         // $FF: synthetic field
         private fc.uK[] dN = var7;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            int var2 = this.ld.QE.getSelectionIndex();
            this.ld.ld.dN(this.dN[var2]).ld = ((C.uK)var1.widget).dN();
         }
      };
      var31.dN((SelectionListener)var24);
      var32.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private fc.uK[] dN = var7;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            int var2 = this.ld.QE.getSelectionIndex();
            this.ld.ld.dN(this.dN[var2]).QE = ((Button)var1.widget).getSelection();
         }
      });
      var33.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private fc.uK[] dN = var7;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            int var2 = this.ld.QE.getSelectionIndex();
            this.ld.ld.dN(this.dN[var2]).wU = ((Button)var1.widget).getSelection();
         }
      });
      SelectionAdapter var25 = new SelectionAdapter() {
         // $FF: synthetic field
         private fc.uK[] dN = var7;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            int var2 = this.ld.QE.getSelectionIndex();
            this.ld.ld.ld(this.dN[var2]).dN = ((C.uK)var1.widget).dN();
         }
      };
      var14.dN((SelectionListener)var25);
      SelectionAdapter var26 = new SelectionAdapter() {
         // $FF: synthetic field
         private fc.uK[] dN = var7;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            int var2 = this.ld.QE.getSelectionIndex();
            this.ld.ld.ld(this.dN[var2]).ld = ((C.uK)var1.widget).dN();
         }
      };
      var15.dN((SelectionListener)var26);
      var16.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private fc.uK[] dN = var7;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            int var2 = this.ld.QE.getSelectionIndex();
            this.ld.ld.ld(this.dN[var2]).QE = ((Button)var1.widget).getSelection();
         }
      });
      var17.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private fc.uK[] dN = var7;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            int var2 = this.ld.QE.getSelectionIndex();
            this.ld.ld.ld(this.dN[var2]).wU = ((Button)var1.widget).getSelection();
         }
      });
      SelectionAdapter var27 = new SelectionAdapter() {
         // $FF: synthetic field
         private C dN = C.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.ld.dN(((C.uK)var1.widget).dN());
         }
      };
      this.fa.dN((SelectionListener)var27);
      SelectionAdapter var28 = new SelectionAdapter() {
         // $FF: synthetic field
         private C dN = C.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.ld.ld(((C.uK)var1.widget).dN());
         }
      };
      this.zs.dN((SelectionListener)var28);
      var21.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.close();
         }
      });
      var20.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            this.ld.dN = true;
            this.dN.close();
         }
      });
      var22.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private C ld = C.this;

         public void widgetSelected(SelectionEvent var1) {
            String var2 = WV.LR.QE();
            this.ld.ld = new fc(this.dN.getDisplay(), var2);
            this.ld.QE();
         }
      });
      this.QE();
   }

   private void QE() {
      this.QE.select(0);
      this.QE.notifyListeners(13, new Event());
      this.fa.dN(this.ld.ld());
      this.zs.dN(this.ld.QE());
   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }

   class uK extends Composite {
      Label dN;

      uK(Composite var2, String var3, Color var4) {
         super(var2, 0);
         this.setLayout(new FillLayout());
         Label var5 = new Label(var2, 0);
         var5.setText(var3 + ": ");
         this.dN = new Label(var2, 2048);
         this.dN.setText("            ");
         this.dN.setBackground(var4);
         this.dN.addMouseListener(new MouseListener() {
            // $FF: synthetic field
            private C.uK dN = uK.this;

            public void mouseUp(MouseEvent var1) {
               ColorDialog var2 = new ColorDialog(this.dN.getShell());
               var2.setRGB(this.dN.dN.getBackground().getRGB());
               RGB var3 = var2.open();
               if(var3 != null) {
                  this.dN.dN.setBackground(HC.dN().dN(var3));
                  this.dN.notifyListeners(13, new Event());
               }

            }

            public void mouseDown(MouseEvent var1) {
            }

            public void mouseDoubleClick(MouseEvent var1) {
            }
         });
      }

      uK(Composite var2, String var3) {
         this(var2, var3, (Color)null);
      }

      void dN(SelectionListener var1) {
         this.addListener(13, new TypedListener(var1));
      }

      public void dN(Color var1) {
         this.dN.setBackground(var1);
      }

      public Color dN() {
         return this.dN.getBackground();
      }
   }
}
