package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.ER;
import jebglobal.Gq;
import jebglobal.LW;
import jebglobal.NE;
import jebglobal.Oa;
import jebglobal.YG;
import jebglobal.YJ;
import jebglobal.Yf;
import jebglobal.aJ;
import jebglobal.as;
import jebglobal.cF;
import jebglobal.fc;
import jebglobal.hv;
import jebglobal.lW;
import jebglobal.oV;
import jebglobal.s;
import jebglobal.tt;
import jebglobal.xc;
import jebglobal.yW;
import jebglobal.yx;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.LineStyleEvent;
import org.eclipse.swt.custom.LineStyleListener;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MenuItem;

public abstract class yn extends lW implements Oa, CaretListener, LineStyleListener, MouseListener, TraverseListener {
   protected yx dN;
   private yW OK;
   private fc LH = null;
   protected YG ld = null;
   private xc KK;
   private HashMap EO;
   private YJ cb;
   private HashSet PF;
   private int Hw;
   protected int QE;
   protected int wU;
   private boolean rK;
   protected oV fa;
   private Gq Ux;
   private List ZY;
   private NE s;

   public yn(Composite var1, yx var2, Font var3, fc var4, Gq var5) {
      super(var1, var3, false);
      new ArrayList();
      this.KK = null;
      this.EO = new HashMap();
      this.cb = null;
      this.PF = new HashSet();
      this.Hw = -1;
      this.QE = -1;
      this.wU = -1;
      this.rK = false;
      this.fa = new oV();
      this.ZY = new ArrayList();
      this.dN = var2;
      if(this.dN != null) {
         this.OK = var2.dN();
      }

      this.zs.addLineStyleListener(this);
      this.zs.addCaretListener(this);
      this.zs.addMouseListener(this);
      this.zs.addTraverseListener(this);
      this.zs.setDoubleClickEnabled(false);
      this.LH = var4;
      this.ld = new YG(var4);
      this.setForeground(var4.dN());
      this.setBackground(var4.ld());
      if(var5 != null) {
         var5.dN((Oa)this);
         this.Ux = var5;
      }

      new MenuItem(this.mS, 2);
      this.dN((as)(new s(this)));
      this.s = new NE(this);
      this.dN((as)this.s);
      this.dN((as)(new cF(this)));
      this.dN((as)(new ER(this)));
      this.dN((as)(new tt(this)));
      this.dN((as)(new Yf(this)));
      this.dN((as)(new aJ(this)));
      this.addDisposeListener(new DisposeListener() {
         // $FF: synthetic field
         private yn dN = yn.this;

         public void widgetDisposed(DisposeEvent var1) {
            this.dN.ld();
         }
      });
   }

   public void focusGained(FocusEvent var1) {
      super.focusGained(var1);
      this.cb();
   }

   public void focusLost(FocusEvent var1) {
      super.focusLost(var1);
      this.PF();
   }

   public void dN(as var1) {
      this.ZY.add(var1);
      this.Ux.dN(var1, false);
   }

   public void ld() {
      Iterator var1 = this.ZY.iterator();

      while(var1.hasNext()) {
         as var2 = (as)var1.next();
         this.Ux.dN(var2);
      }

      this.ZY.clear();
   }

   public void dN(fc var1) {
      this.LH = var1;
      this.ld.dN(var1);
      this.setForeground(var1.dN());
      this.setBackground(var1.ld());
   }

   public yW QE() {
      return this.OK;
   }

   public yx wU() {
      return this.dN;
   }

   public int fa() {
      return this.Hw;
   }

   public int zs() {
      return this.QE;
   }

   public int mS() {
      return this.wU;
   }

   public YJ OK() {
      return this.cb;
   }

   public oV LH() {
      return this.fa;
   }

   public List dN(Object var1) {
      return this.KK == null?null:(List)this.EO.get(var1);
   }

   public List dN(YJ var1) {
      if(this.KK == null) {
         return null;
      } else {
         Object var2 = var1.zs();
         return var2 == null?null:(List)this.EO.get(var2);
      }
   }

   public List ld(YJ var1) {
      List var2 = this.dN(var1);
      if(var2 == null) {
         return null;
      } else {
         HashSet var3 = new HashSet(var2);
         ArrayList var4 = new ArrayList(var2.size());

         for(int var5 = 0; var5 < this.KK.OK(); ++var5) {
            List var6 = this.KK.fa(var5);
            if(var6 != null) {
               Iterator var7 = var6.iterator();

               while(var7.hasNext()) {
                  hv var8 = (hv)var7.next();
                  if(var3.contains(var8)) {
                     var4.add(new LW(var5, var8));
                  }
               }
            }
         }

         return var4;
      }
   }

   public void KK() {
      this.dN(true);
   }

   public abstract void dN(boolean var1);

   public void EO() {
      this.KK = null;
      this.EO.clear();
      this.cb = null;
      this.PF.clear();
      this.Hw = 0;
      this.QE = 0;
      this.wU = 0;
   }

   protected void dN(xc var1, int var2, int var3) {
      this.rK = true;
      this.KK = var1;
      this.zs.setText(var1.zs());
      int var4 = var1.OK();

      List var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = var1.fa(var5);
         if(var6 != null) {
            Iterator var7 = var6.iterator();

            while(var7.hasNext()) {
               hv var8 = (hv)var7.next();
               Object var9 = var8.zs();
               if(var9 != null) {
                  Object var10 = (List)this.EO.get(var9);
                  if(var10 == null) {
                     var10 = new ArrayList();
                     this.EO.put(var9, var10);
                  }

                  ((List)var10).add((YJ)var8);
               }
            }
         }
      }

      Iterator var11 = this.EO.values().iterator();

      while(var11.hasNext()) {
         var6 = (List)var11.next();
         if(var6 != null && var6 instanceof ArrayList) {
            ((ArrayList)var6).trimToSize();
         }
      }

      this.rK = false;
      this.zs.redraw();
      if(var3 != -1 || var2 != -1) {
         if(var3 == -1 && var2 != -1) {
            this.dN(var2, false);
         } else if(var3 != -1 && var2 == -1) {
            this.ld(var3, false);
         } else {
            this.zs.setCaretOffset(var3);
            this.zs.setTopIndex(var2);
         }
      }

   }

   public void lineGetStyle(LineStyleEvent var1) {
      if(this.KK != null) {
         int var2 = this.zs.getLineAtOffset(var1.lineOffset);
         int var3 = this.zs.getOffsetAtLine(var2);
         List var4 = this.KK.fa(var2);
         if(var4 != null) {
            StyleRange[] var5 = new StyleRange[var4.size()];
            int var6 = 0;

            hv var8;
            for(Iterator var7 = var4.iterator(); var7.hasNext(); var5[var6++] = ((YJ)var8).QE(var3)) {
               var8 = (hv)var7.next();
            }

            var1.styles = var5;
         }
      }
   }

   public void caretMoved(CaretEvent var1) {
      if(!this.rK) {
         int var2 = var1.caretOffset;
         if(this.QE >= 0) {
            this.zs.setLineBackground(this.QE, 1, (Color)null);
         }

         this.Hw = var2;
         this.QE = this.zs.getLineAtOffset(var2);
         this.wU = var2 - this.zs.getOffsetAtLine(this.QE);
         this.zs.setLineBackground(this.QE, 1, this.LH.QE());
         if(this.KK != null) {
            YJ var3 = null;
            List var4 = this.KK.fa(this.QE);
            Iterator var5;
            if(var4 != null) {
               var5 = var4.iterator();

               while(var5.hasNext()) {
                  hv var6 = (hv)var5.next();
                  int var7 = var6.QE();
                  if(this.wU >= var7 && this.wU < var6.wU()) {
                     var3 = (YJ)var6;
                     break;
                  }
               }
            }

            if(var3 != this.cb && !this.PF.contains(var3)) {
               var5 = this.PF.iterator();

               while(var5.hasNext()) {
                  YJ var9 = (YJ)var5.next();
                  var9.dN(false);
               }

               this.PF.clear();
               this.cb = null;
               if(var3 != null) {
                  this.cb = var3;
                  if(this.cb.LH()) {
                     this.cb.dN(true);
                     this.PF.add(this.cb);
                     Object var8 = this.cb.zs();
                     if(var8 != null) {
                        Iterator var10 = ((List)this.EO.get(var8)).iterator();

                        while(var10.hasNext()) {
                           YJ var11 = (YJ)var10.next();
                           if(!var8.equals(var11.zs())) {
                              throw new RuntimeException();
                           }

                           var11.dN(true);
                           this.PF.add(var11);
                        }
                     }
                  }
               }

               this.cb();
               this.zs.redraw();
            } else {
               this.cb = var3;
            }
         }
      }
   }

   public void cb() {
      Iterator var1 = this.ZY.iterator();

      while(var1.hasNext()) {
         as var2 = (as)var1.next();
         this.Ux.ld(var2, var2.OK());
      }

   }

   public void PF() {
      Iterator var1 = this.ZY.iterator();

      while(var1.hasNext()) {
         as var2 = (as)var1.next();
         this.Ux.ld(var2, false);
      }

   }

   public void dN(String var1) {
      if(this.KK != null) {
         this.rK = true;
         int var2 = var1.length();
         int var3 = 0;
         int[] var4 = this.KK.mS();
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            List var7 = this.KK.fa(var6);
            if(var7 != null) {
               int var8 = var3;

               for(int var9 = 0; var9 < var7.size(); ++var9) {
                  hv var10 = (hv)var7.get(var9);
                  if(this.PF.contains(var10)) {
                     int var11 = var4[var6] + var8 + var10.QE();
                     int var12 = var10.ld();
                     this.zs.replaceTextRange(var11, var12, var1);
                     var3 += var2 - var12;
                     this.KK.dN(var6, var9, var1);
                  }
               }
            }
         }

         this.rK = false;
         this.zs.redraw();
      }
   }

   public void verifyKey(VerifyEvent var1) {
      Iterator var2 = this.ZY.iterator();

      as var3;
      while(var2.hasNext()) {
         var3 = (as)var2.next();
         if(var3.QE() == var1.keyCode && var3.wU() == var1.stateMask) {
            var3.LH();
         }
      }

      var2 = this.ZY.iterator();

      while(var2.hasNext()) {
         var3 = (as)var2.next();
         if(var3.fa() == var1.keyCode && var3.zs() == var1.stateMask) {
            var3.LH();
         }
      }

      int var10000 = var1.keyCode;
      super.verifyKey(var1);
   }

   public void keyTraversed(TraverseEvent var1) {
      if(var1.detail == 16) {
         var1.doit = false;
      }

   }

   public void mouseDown(MouseEvent var1) {
   }

   public void mouseUp(MouseEvent var1) {
   }

   public void mouseDoubleClick(MouseEvent var1) {
      this.s.LH();
   }

   public boolean dN(int var1) {
      return this.dN(var1, true);
   }

   public boolean dN(int var1, boolean var2) {
      LW var3 = new LW(this.QE, this.wU);
      if(!super.dN(var1)) {
         return false;
      } else {
         if(var2) {
            this.fa.dN(var3);
         }

         this.cb();
         return true;
      }
   }

   public boolean ld(int var1) {
      return this.ld(var1, true);
   }

   public boolean ld(int var1, boolean var2) {
      LW var3 = new LW(this.QE, this.wU);
      if(!super.ld(var1)) {
         return false;
      } else {
         if(var2) {
            this.fa.dN(var3);
         }

         this.cb();
         return true;
      }
   }

   public boolean dN(LW var1, boolean var2) {
      int var3 = this.zs.getOffsetAtLine(var1.dN()) + var1.ld();
      return this.ld(var3, var2);
   }

   public boolean ld(Object var1) {
      List var2 = this.dN(var1);
      if(var2 != null && !var2.isEmpty()) {
         List var3 = this.ld((YJ)var2.get(0));
         if(var3 != null && !var3.isEmpty()) {
            LW var4 = (LW)var3.get(0);
            return this.dN(var4, true);
         }
      }

      return false;
   }
}
