package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import jebglobal.AR;
import jebglobal.HC;
import jebglobal.UZ;
import jebglobal.fL;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public final class tg extends fL {
   private Tree ld;
   private Font QE;
   private AR wU;
   private int fa;
   private UZ zs;
   public Integer dN = Integer.valueOf(-1);

   public tg(Shell var1, Font var2, AR var3, int var4) {
      super(var1, "Type information", 67696);
      this.QE = var2;
      this.wU = var3;
      this.fa = var4;
      this.zs = var3.ZY();
   }

   public Integer dN() {
      super.ld();
      return this.dN;
   }

   public void dN(final Shell var1) {
      var1.setLayout(new FillLayout());
      this.ld = new Tree(var1, 2048);
      this.ld.setLayout(new FillLayout());
      this.ld.setFont(this.QE);
      Menu var2 = new Menu(this.ld);
      MenuItem var3 = new MenuItem(var2, 0);
      var3.setText("Info");
      var3.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private tg dN = tg.this;

         public void widgetSelected(SelectionEvent var1) {
            TreeItem[] var2 = this.dN.ld.getSelection();
            if(var2 != null && var2.length == 1) {
               Integer var3 = (Integer)var2[0].getData();
               if(var3 != null && var3.intValue() != this.dN.fa) {
                  this.dN.fa = var3.intValue();
                  this.dN.ld.removeAll();
                  this.dN.QE();
               }
            }

         }
      });
      this.ld.setMenu(var2);
      this.ld.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Shell dN = var1;
         // $FF: synthetic field
         private tg ld = tg.this;

         public void widgetDefaultSelected(SelectionEvent var1) {
            Integer var2 = (Integer)var1.item.getData();
            if(var2 != null && var2.intValue() != this.ld.fa) {
               this.ld.dN = var2;
               this.dN.close();
            }

         }
      });
      this.QE();
      Point var4 = var1.computeSize(-1, -1);
      var4.x = (int)((double)var4.x * 1.2D);
      var4.y = (int)((double)var4.y * 1.2D);
      var1.setSize(var4);
   }

   private void QE() {
      ArrayList var1 = new ArrayList();

      int var2;
      UZ.uK var3;
      for(var2 = this.fa; var2 >= 0; var2 = var3.ld) {
         var3 = this.zs.dN(var2);
         var1.add(0, Integer.valueOf(var2));
         if(var3 == null) {
            break;
         }
      }

      var2 = 0;
      TreeItem var9 = null;

      for(Iterator var4 = var1.iterator(); var4.hasNext(); ++var2) {
         int var5 = ((Integer)var4.next()).intValue();
         String var6 = this.wU.QE(var5).dN(true);
         var6 = var6.substring(1, var6.length() - 1).replace('/', '.');
         if(var2 == 0) {
            var9 = new TreeItem(this.ld, 0);
         } else {
            var9 = new TreeItem(var9, 0);
         }

         var9.setText(var6);
         var9.setData(Integer.valueOf(var5));
         if(var5 == this.fa) {
            var9.setBackground(HC.dN().dN(255, 192, 192));
         }

         this.ld.showItem(var9);
      }

      TreeItem var10 = var9;
      this.ld.setSelection(var9);
      UZ.uK var11 = this.zs.dN(this.fa);
      if(var11 != null) {
         Iterator var12 = var11.wU.iterator();

         int var7;
         String var8;
         while(var12.hasNext()) {
            var7 = ((Integer)var12.next()).intValue();
            var8 = this.wU.QE(var7).dN(true);
            var8 = var8.substring(1, var8.length() - 1).replace('/', '.');
            var9 = new TreeItem(var10, 0);
            var9.setText(var8);
            var9.setData(Integer.valueOf(var7));
            this.ld.showItem(var9);
         }

         if(!var11.QE.isEmpty()) {
            var10 = new TreeItem(this.ld, 0);
            var10.setText("implements:");
            var12 = var11.QE.iterator();

            while(var12.hasNext()) {
               var7 = ((Integer)var12.next()).intValue();
               var8 = this.wU.QE(var7).dN(true);
               var8 = var8.substring(1, var8.length() - 1).replace('/', '.');
               var9 = new TreeItem(var10, 0);
               var9.setText(var8);
               var9.setData(Integer.valueOf(var7));
               this.ld.showItem(var9);
            }
         }
      }

   }

   // $FF: synthetic method
   public Object ld() {
      return this.dN();
   }
}
