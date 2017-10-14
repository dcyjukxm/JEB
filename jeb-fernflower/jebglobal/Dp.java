package jebglobal;

import java.util.HashMap;
import java.util.Iterator;
import jebglobal.C;
import jebglobal.Co;
import jebglobal.DE;
import jebglobal.Dg;
import jebglobal.JZ;
import jebglobal.QH;
import jebglobal.TM;
import jebglobal.Vm;
import jebglobal.WV;
import jebglobal.ZO;
import jebglobal.fL;
import jebglobal.fc;
import jebglobal.qG;
import jebglobal.v;
import jebglobal.yW;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

public final class Dp extends fL {
   static HashMap dN = new HashMap();
   private TM ld;
   private CTabFolder QE;
   private FontData wU;
   private boolean fa;
   private ZO zs = new ZO();

   static void dN(WV var0, ZO.uK var1) {
      dN.put(var0, new DE(var0, var1));
   }

   public Dp(Shell var1, yW var2) {
      super(var1, "Options", 67696);
      this.ld = var2.EO();
   }

   private Button dN(Composite var1, WV var2) {
      Button var3 = TM.dN((Composite)var1, (String)var2.dN(), (SelectionListener)null);
      return var3;
   }

   private QH ld(Composite var1, WV var2) {
      v var3 = new v(var1, var2.dN(), this.ld.ld(var2));
      ((DE)dN.get(var2)).dN((QH)var3);
      return var3;
   }

   private QH QE(Composite var1, WV var2) {
      Dg var3 = new Dg(var1, var2.dN(), this.ld.dN(var2));
      var3.setLayoutData(new GridData(4, 128, true, false));
      ((DE)dN.get(var2)).dN((QH)var3);
      return var3;
   }

   private QH wU(Composite var1, WV var2) {
      JZ var3 = new JZ(var1, var2.dN(), this.ld.dN(var2), 5);
      var3.setLayoutData(new GridData(4, 128, true, false));
      ((DE)dN.get(var2)).dN((QH)var3);
      return var3;
   }

   private QH fa(Composite var1, WV var2) {
      qG var3 = new qG(var1, var2.dN(), this.ld.dN(var2));
      var3.setLayoutData(new GridData(4, 128, true, false));
      ((DE)dN.get(var2)).dN((QH)var3);
      return var3;
   }

   public ZO dN() {
      super.ld();
      this.ld.dN(WV.Hw, this.QE.getSelectionIndex());
      this.ld.dN();
      return this.fa?this.zs:null;
   }

   protected void dN(final Shell var1) {
      var1.setLayout(new GridLayout(3, false));
      Co var2 = new Co(var1, false);
      this.QE = var2.dN();
      GridData var3 = new GridData();
      var3.horizontalSpan = 3;
      var3.horizontalAlignment = 4;
      var3.verticalAlignment = 4;
      var3.grabExcessHorizontalSpace = true;
      var3.grabExcessVerticalSpace = true;
      this.QE.setLayoutData(var3);
      Control var4 = this.dN((Composite)this.QE, (Shell)var1);
      var2.dN("   General   ", var4);
      Control var5 = this.ld(this.QE, (Shell)var1);
      var2.dN("   Style   ", var5);
      Control var6 = this.QE(this.QE, (Shell)var1);
      var2.dN("   Scripts   ", var6);
      Control var7 = this.dN((Composite)this.QE);
      var2.dN("   Parsers   ", var7);
      Control var8 = this.ld((Composite)this.QE);
      var2.dN("   Decompiler   ", var8);
      Control var9 = this.QE((Composite)this.QE);
      var2.dN("   Assembly   ", var9);
      Control var10 = this.wU(this.QE);
      var2.dN("   Java   ", var10);
      Control var11 = this.fa(this.QE);
      var2.dN("   XML   ", var11);
      Button var12 = TM.dN((Composite)var1, (String)"OK", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private Dp ld = Dp.this;

         public void widgetSelected(SelectionEvent var1) {
            Iterator var2 = Dp.dN.keySet().iterator();

            while(var2.hasNext()) {
               WV var3 = (WV)var2.next();
               DE var4 = (DE)Dp.dN.get(var3);
               if(var4.dN(this.ld.ld)) {
                  this.ld.zs.dN.add(var4.dN());
               }
            }

            if(this.ld.wU != null) {
               this.ld.ld.dN(WV.rn, this.ld.wU.toString());
            }

            if(this.ld.ld.QE(WV.De) < 0) {
               this.ld.ld.dN((WV)WV.De, 0);
            }

            this.ld.ld.dN();
            this.ld.fa = true;
            this.dN.close();
         }
      }));
      TM.dN((Composite)var1, (String)"Cancel", (SelectionListener)(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.close();
         }
      }));
      Button var13 = TM.dN((Composite)var1, (String)"Help", (SelectionListener)(new SelectionAdapter() {
         public void widgetSelected(SelectionEvent var1) {
            Vm.QE("http://www.android-decompiler.com/manual.php");
         }
      }));
      GridData var14 = new GridData();
      var14.horizontalAlignment = 3;
      var13.setLayoutData(var14);
      var1.setDefaultButton(var12);
      var2.dN(this.ld.QE(WV.Hw), true);
   }

   private Control dN(Composite var1, Shell var2) {
      Composite var3 = new Composite(var1, 0);
      var3.setLayout(new GridLayout(1, false));
      Group var4 = new Group(var3, 0);
      var4.setLayout(new GridLayout(1, false));
      var4.setText("Internet");
      var4.setLayoutData(new GridData(4, 4, true, false));
      Group var5 = new Group(var3, 0);
      var5.setLayout(new GridLayout(1, false));
      var5.setText("Database");
      var5.setLayoutData(new GridData(4, 128, true, false));
      Group var6 = new Group(var3, 0);
      var6.setLayout(new GridLayout());
      var6.setText("Documentation");
      var6.setLayoutData(new GridData(4, 4, true, true));
      this.ld(var4, (WV)WV.ci);
      this.ld(var4, (WV)WV.BQ);
      this.QE(var4, (WV)WV.VX);
      this.ld(var5, (WV)WV.Ee);
      this.wU(var5, WV.De);
      this.fa(var6, WV.s);
      this.fa(var6, WV.Hv);
      return var3;
   }

   private Control ld(Composite var1, final Shell var2) {
      Composite var3 = new Composite(var1, 0);
      var3.setLayout(new GridLayout(1, false));
      Group var4 = new Group(var3, 0);
      var4.setLayout(new GridLayout(1, false));
      var4.setText("Font and Colors");
      var4.setLayoutData(new GridData(4, 4, true, false));
      Group var5 = new Group(var3, 0);
      var5.setLayout(new GridLayout(1, false));
      var5.setText("Class hierarchy");
      var5.setLayoutData(new GridData(4, 4, true, false));
      Group var6 = new Group(var3, 0);
      var6.setLayout(new GridLayout(1, false));
      var6.setText("Other");
      var6.setLayoutData(new GridData(4, 4, true, true));
      Composite var7 = new Composite(var4, 0);
      var7.setLayout(TM.QE());
      Button var8 = this.dN(var7, WV.rn);
      var8.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var2;
         // $FF: synthetic field
         private Dp ld = Dp.this;

         public void widgetSelected(SelectionEvent var1) {
            FontDialog var2 = new FontDialog(this.dN);
            FontData[] var3 = new FontData[1];
            if(this.ld.wU == null) {
               try {
                  this.ld.wU = new FontData(this.ld.ld.dN(WV.rn));
               } catch (Exception var5) {
                  ;
               }
            }

            var3[0] = this.ld.wU;
            var2.setFontList(var3);
            FontData var4 = var2.open();
            if(var4 != null) {
               this.ld.wU = var4;
            }

         }
      });
      Button var9 = this.dN(var7, WV.LR);
      var9.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var2;
         // $FF: synthetic field
         private Dp ld = Dp.this;

         public void widgetSelected(SelectionEvent var1) {
            C var2 = new C(this.dN, this.ld.ld);
            fc var3 = var2.dN();
            if(var3 != null) {
               this.ld.ld.dN(WV.LR, var3.toString());
               this.ld.ld.dN();
            }

         }
      });
      this.ld(var5, (WV)WV.Nh);
      this.QE(var5, (WV)WV.XZ);
      this.wU(var6, WV.nA);
      return var3;
   }

   private Control QE(Composite var1, Shell var2) {
      Composite var3 = new Composite(var1, 0);
      var3.setLayout(new GridLayout(1, false));
      Group var4 = new Group(var3, 0);
      var4.setLayout(new GridLayout(1, false));
      var4.setText("General");
      var4.setLayoutData(new GridData(4, 4, true, true));
      this.fa(var4, WV.Ux);
      this.fa(var4, WV.ZY);
      return var3;
   }

   private Control dN(Composite var1) {
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new GridLayout(1, false));
      Group var3 = new Group(var2, 0);
      var3.setLayout(new GridLayout(1, false));
      var3.setText("APK parser");
      var3.setLayoutData(new GridData(4, 128, true, false));
      Group var4 = new Group(var2, 0);
      var4.setLayout(new GridLayout(1, false));
      var4.setText("DEX parser");
      var4.setLayoutData(new GridData(4, 4, true, true));
      this.ld(var3, (WV)WV.Ai);
      this.ld(var3, (WV)WV.uM);
      this.ld(var4, (WV)WV.kq);
      this.ld(var4, (WV)WV.ir);
      this.ld(var4, (WV)WV.rF);
      this.ld(var4, (WV)WV.IL);
      return var2;
   }

   private Control ld(Composite var1) {
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new GridLayout(1, false));
      Group var3 = new Group(var2, 0);
      var3.setLayout(new GridLayout(1, false));
      var3.setText("General");
      var3.setLayoutData(new GridData(4, 4, true, false));
      Group var4 = new Group(var2, 0);
      var4.setLayout(new GridLayout(1, false));
      var4.setText("Engine");
      var4.setLayoutData(new GridData(4, 4, true, false));
      Group var5 = new Group(var2, 0);
      var5.setLayout(new GridLayout(1, false));
      var5.setText("Rendering");
      var5.setLayoutData(new GridData(4, 4, true, true));
      this.wU(var3, WV.Db);
      this.ld(var4, (WV)WV.sC);
      this.ld(var4, (WV)WV.jp);
      this.ld(var5, (WV)WV.bU);
      this.ld(var5, (WV)WV.Qg);
      this.ld(var5, (WV)WV.uB);
      this.ld(var5, (WV)WV.dY);
      this.ld(var5, (WV)WV.Rm);
      this.ld(var5, (WV)WV.nb);
      this.ld(var5, (WV)WV.nI);
      return var2;
   }

   private Control QE(Composite var1) {
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new GridLayout(1, false));
      Group var3 = new Group(var2, 0);
      var3.setLayout(new GridLayout(1, false));
      var3.setText("Visualization");
      var3.setLayoutData(new GridData(4, 4, true, false));
      Group var4 = new Group(var2, 0);
      var4.setLayout(new GridLayout(1, false));
      var4.setText("Output");
      var4.setLayoutData(new GridData(4, 4, true, true));
      this.wU(var3, WV.My);
      this.ld(var4, (WV)WV.kU);
      this.ld(var4, (WV)WV.mD);
      this.ld(var4, (WV)WV.LV);
      this.ld(var4, (WV)WV.uo);
      this.ld(var4, (WV)WV.H);
      this.ld(var4, (WV)WV.go);
      this.ld(var4, (WV)WV.BP);
      this.ld(var4, (WV)WV.bL);
      this.ld(var4, (WV)WV.U);
      return var2;
   }

   private Control wU(Composite var1) {
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new GridLayout(1, false));
      Group var3 = new Group(var2, 0);
      var3.setLayout(new GridLayout(1, false));
      var3.setText("Output");
      var3.setLayoutData(new GridData(4, 4, true, true));
      this.wU(var3, WV.qL);
      this.ld(var3, (WV)WV.kz);
      this.ld(var3, (WV)WV.lx);
      this.ld(var3, (WV)WV.cM);
      this.ld(var3, (WV)WV.VV);
      this.ld(var3, (WV)WV.LK);
      this.ld(var3, (WV)WV.Mq);
      this.ld(var3, (WV)WV.FY);
      return var2;
   }

   private Control fa(Composite var1) {
      Composite var2 = new Composite(var1, 0);
      var2.setLayout(new GridLayout(1, false));
      Group var3 = new Group(var2, 0);
      var3.setLayout(new GridLayout(1, false));
      var3.setText("Output");
      var3.setLayoutData(new GridData(4, 4, true, true));
      this.wU(var3, WV.zE);
      return var2;
   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }

   static {
      dN(WV.VX, ZO.uK.dN);
      dN(WV.ci, ZO.uK.dN);
      dN(WV.BQ, ZO.uK.dN);
      dN(WV.Ee, ZO.uK.dN);
      dN(WV.De, ZO.uK.dN);
      dN(WV.s, ZO.uK.dN);
      dN(WV.Hv, ZO.uK.dN);
      dN(WV.Ux, ZO.uK.dN);
      dN(WV.ZY, ZO.uK.dN);
      dN(WV.Nh, ZO.uK.dN);
      dN(WV.XZ, ZO.uK.dN);
      dN(WV.nA, ZO.uK.dN);
      dN(WV.Ai, ZO.uK.ld);
      dN(WV.uM, ZO.uK.ld);
      dN(WV.kq, ZO.uK.QE);
      dN(WV.ir, ZO.uK.QE);
      dN(WV.rF, ZO.uK.QE);
      dN(WV.IL, ZO.uK.QE);
      dN(WV.Db, ZO.uK.wU);
      dN(WV.sC, ZO.uK.wU);
      dN(WV.jp, ZO.uK.wU);
      dN(WV.bU, ZO.uK.wU);
      dN(WV.Qg, ZO.uK.wU);
      dN(WV.uB, ZO.uK.wU);
      dN(WV.dY, ZO.uK.wU);
      dN(WV.Rm, ZO.uK.wU);
      dN(WV.nb, ZO.uK.wU);
      dN(WV.nI, ZO.uK.wU);
      dN(WV.My, ZO.uK.fa);
      dN(WV.kU, ZO.uK.fa);
      dN(WV.mD, ZO.uK.fa);
      dN(WV.LV, ZO.uK.fa);
      dN(WV.uo, ZO.uK.fa);
      dN(WV.H, ZO.uK.fa);
      dN(WV.go, ZO.uK.fa);
      dN(WV.BP, ZO.uK.fa);
      dN(WV.bL, ZO.uK.fa);
      dN(WV.U, ZO.uK.fa);
      dN(WV.qL, ZO.uK.zs);
      dN(WV.kz, ZO.uK.zs);
      dN(WV.lx, ZO.uK.zs);
      dN(WV.cM, ZO.uK.zs);
      dN(WV.VV, ZO.uK.zs);
      dN(WV.LK, ZO.uK.zs);
      dN(WV.Mq, ZO.uK.zs);
      dN(WV.FY, ZO.uK.zs);
      dN(WV.zE, ZO.uK.mS);
   }
}
