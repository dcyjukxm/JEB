package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import jebglobal.HC;
import jebglobal.QW;
import jebglobal.TM;
import jebglobal.ZE;
import jebglobal.Zf;
import jebglobal.cn;
import jebglobal.oa;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class lW extends Composite implements QW, ZE, VerifyKeyListener, FocusListener, PaintListener {
   private static final long LK = 844563159190538443L;
   protected StyledText zs;
   protected Menu mS;
   private oa dN;
   private boolean ld;
   private ArrayList QE;

   public lW(Composite var1, Font var2, boolean var3) {
      this(var1, 2818, var2, var3);
   }

   public lW(Composite var1, int var2, Font var3, boolean var4) {
      super(var1, 0);
      this.dN = null;
      this.QE = new ArrayList();
      this.setLayout(new FillLayout());
      this.zs = new StyledText(this, var2);
      this.zs.setFont(var3);
      this.zs.setEditable(var4);
      this.zs.setData(this);
      this.zs.addFocusListener(this);
      this.zs.addVerifyKeyListener(this);
      this.zs.addPaintListener(this);
      this.zs.setCursor(new Cursor(this.getDisplay(), var4?19:0));
      if(!var4) {
         this.zs.setBackground(HC.dN().dN(15790320));
         this.zs.setForeground(Display.getDefault().getSystemColor(2));
      }

      this.mS = new Menu(this.zs);
      MenuItem var5 = new MenuItem(this.mS, 0);
      var5.setText("Select all\tCtrl+A");
      var5.setAccelerator(SWT.MOD1 | 65);
      var5.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private lW dN = lW.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.VX();
         }
      });
      var5 = new MenuItem(this.mS, 0);
      var5.setText("&Copy\tCtrl+C");
      var5.setAccelerator(SWT.MOD1 | 67);
      var5.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private lW dN = lW.this;

         public void widgetSelected(SelectionEvent var1) {
            this.dN.ci();
         }
      });
      this.zs.setMenu(this.mS);
      this.layout();
   }

   public void KK() {
   }

   public Menu s() {
      return this.mS;
   }

   public void focusGained(FocusEvent var1) {
      this.ld = true;
   }

   public void focusLost(FocusEvent var1) {
      this.ld = false;
   }

   public boolean Hv() {
      return this.ld;
   }

   public void verifyKey(VerifyEvent var1) {
      int var2;
      switch(var1.keyCode) {
      case 97:
         if(var1.stateMask == 262144) {
            this.VX();
         }
         break;
      case 99:
      case 118:
      case 120:
         if(var1.stateMask == 262144 || var1.stateMask == 4194304) {
            var1.doit = false;
         }
         break;
      case 103:
         if(var1.stateMask == 262144) {
            Zf var6 = new Zf(this.getShell(), this.zs.getFont(), "Line number");
            String var3 = var6.dN();
            if(var3 != null) {
               int var4 = -1;

               try {
                  var4 = Integer.parseInt(var3);
               } catch (NumberFormatException var5) {
                  ;
               }

               if(var4 >= 0) {
                  this.dN(var4);
               }
            }
         }
         break;
      case 16777217:
         if(var1.stateMask == 262144) {
            var2 = this.zs.getTopIndex();
            if(var2 >= 1) {
               this.zs.setTopIndex(var2 - 1);
            }
         }
         break;
      case 16777218:
         if(var1.stateMask == 262144) {
            var2 = this.zs.getTopIndex();
            if(var2 < this.zs.getLineCount() - 1) {
               this.zs.setTopIndex(var2 + 1);
            }
         }
      }

   }

   public void VX() {
      int var1 = this.zs.getTopIndex();
      this.zs.selectAll();
      this.zs.setTopIndex(var1);
   }

   public void ci() {
      this.zs.copy();
   }

   public void EO() {
      this.zs.setText("");
   }

   public void QE(String var1) {
      this.zs.setText(var1);
   }

   public String bG() {
      return this.zs.getText();
   }

   public boolean dN(int var1) {
      if(var1 >= 0 && var1 < this.zs.getLineCount()) {
         int var2 = this.zs.getClientArea().height;
         int var3 = this.zs.getLinePixel(var1);
         int var4;
         if(var3 < 0 || var3 >= var2) {
            var4 = var2 / this.zs.getLineHeight();
            int var5 = Math.max(0, var1 - var4 / 2);
            this.zs.setTopIndex(var5);
         }

         var4 = this.zs.getOffsetAtLine(var1);
         this.zs.setCaretOffset(var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean ld(int var1) {
      int var2 = this.zs.getLineAtOffset(var1);
      if(var2 >= 0 && var2 < this.zs.getLineCount()) {
         Point var3 = this.zs.getLocationAtOffset(var1);
         int var4 = var3.y;
         int var5 = var3.x;
         Rectangle var6 = this.zs.getClientArea();
         int var7;
         if(var4 < 0 || var4 >= var6.height) {
            var7 = var6.height / this.zs.getLineHeight();
            int var8 = Math.max(0, var2 - var7 / 2);
            this.zs.setTopIndex(var8);
         }

         if(var5 < 0 || var5 >= var6.width) {
            var7 = this.zs.getHorizontalPixel() + var5;
            if(var7 < var6.width) {
               var7 = 0;
            }

            this.zs.setHorizontalPixel(var7);
         }

         this.zs.setCaretOffset(var1);
         return true;
      } else {
         return false;
      }
   }

   public int fa() {
      return this.zs.getCaretOffset();
   }

   public void zs(int var1) {
      this.zs.setCaretOffset(var1);
   }

   public boolean dN(int var1, int var2) {
      if(var1 >= 0 && var1 < this.zs.getLineCount()) {
         int var3 = this.zs.getOffsetAtLine(var1) + var2;
         if(var3 >= 0 && var3 <= this.zs.getCharCount()) {
            this.zs.setCaretOffset(var3);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public int zs() {
      int var1 = this.zs.getCaretOffset();
      return var1 < 0?-1:this.zs.getLineAtOffset(var1);
   }

   public oa dN() {
      return this.dN;
   }

   public void dN(oa var1) {
      if(var1 == null) {
         var1 = this.dN;
         if(var1 == null) {
            return;
         }
      }

      int var2 = this.zs.getCaretOffset() + (var1.QE?-1:1);
      if(var2 < 0) {
         var2 = 0;
      } else if(var2 >= this.zs.getCharCount()) {
         var2 = this.zs.getCharCount() - 1;
      }

      cn.dN(String.format("Searching for \"%s\" (case sensitive: %s, reverse order: %s)", new Object[]{var1.dN, Boolean.valueOf(var1.ld), Boolean.valueOf(var1.QE)}));
      int var3 = TM.dN(this.zs.getText(), var2, var1.dN, var1.ld, var1.QE);
      if(var3 < 0 && var1.wU) {
         var2 = var1.QE?this.zs.getCharCount() - 1:0;
         var3 = TM.dN(this.zs.getText(), var2, var1.dN, var1.ld, var1.QE);
         if(var3 >= 0) {
            Display.getCurrent().beep();
         }
      }

      if(var3 >= 0) {
         int var4 = this.zs.getLineAtOffset(var3);
         cn.dN(String.format("Found on line %d", new Object[]{Integer.valueOf(var4)}));
         this.ld(var3);
         this.zs.setSelection(var3, var3 + var1.dN.length());
      } else {
         Display.getCurrent().beep();
         cn.dN("Nothing found.");
      }

      this.dN = var1;
   }

   public void dispose() {
      super.dispose();
   }

   public Point computeSize(int var1, int var2, boolean var3) {
      return this.zs.computeSize(var1, var2, var3);
   }

   public Color getBackground() {
      return this.zs.getBackground();
   }

   public boolean getDragDetect() {
      return this.zs.getDragDetect();
   }

   public Color getForeground() {
      return this.zs.getForeground();
   }

   public int getOrientation() {
      return this.zs.getOrientation();
   }

   public void redraw() {
      this.zs.redraw();
   }

   public void redraw(int var1, int var2, int var3, int var4, boolean var5) {
      this.zs.redraw(var1, var2, var3, var4, var5);
   }

   public void setFont(Font var1) {
      this.zs.setFont(var1);
   }

   public void setForeground(Color var1) {
      this.zs.setForeground(var1);
   }

   public void setBackground(Color var1) {
      this.zs.setBackground(var1);
   }

   public void setCursor(Cursor var1) {
      this.zs.setCursor(var1);
   }

   public String mS(int var1) {
      return this.zs.getLine(var1);
   }

   public int BQ() {
      return this.zs.getLineCount();
   }

   public int Ee() {
      return this.zs.getLineHeight();
   }

   public int OK(int var1) {
      return this.zs.getOffsetAtLine(var1);
   }

   public void dN(int var1, int var2, String var3) {
      this.zs.replaceTextRange(var1, var2, var3);
   }

   public void LH(int var1) {
      this.zs.setTopIndex(var1);
   }

   public void paintControl(PaintEvent var1) {
      if(!this.QE.isEmpty()) {
         int var2;
         try {
            var2 = this.zs.getOffsetAtLocation(new Point(0, 0));
         } catch (IllegalArgumentException var6) {
            return;
         }

         int var3 = this.zs.getLineAtOffset(var2);
         Iterator var4 = this.QE.iterator();

         while(var4.hasNext()) {
            lW.uK var5 = (lW.uK)var4.next();
            var5.dN(var3);
         }

      }
   }

   public void dN(lW.uK var1) {
      this.QE.add(var1);
   }

   public boolean setFocus() {
      return this.zs.setFocus();
   }

   public interface uK {
      void dN(int var1);
   }
}
