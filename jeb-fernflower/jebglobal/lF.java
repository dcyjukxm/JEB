package jebglobal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jebglobal.QW;
import jebglobal.TM;
import jebglobal.oa;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public final class lF extends Composite implements QW, SelectionListener {
   private Table dN;
   private List ld;
   private List QE;
   private boolean wU;
   private oa fa;

   public lF(Composite var1, boolean var2, String[] var3, List var4, int var5) {
      super(var1, 0);
      this.setLayout(new FillLayout());
      this.wU = var2;
      this.dN(var1, var2, var3, var4, var5);
   }

   public void dN(SelectionListener var1) {
      this.dN.addSelectionListener(var1);
   }

   public Comparable[] ld() {
      return (Comparable[])this.QE.get(this.dN.getSelectionIndex());
   }

   public int QE() {
      if(!this.wU) {
         throw new RuntimeException("First column is not an index");
      } else {
         int var1 = this.dN.getSelectionIndex();
         if(var1 >= 0) {
            TableItem var2 = this.dN.getItem(var1);
            var1 = Integer.parseInt(var2.getText(0));
         }

         return var1;
      }
   }

   public int wU() {
      return this.dN.getItemHeight();
   }

   private void dN(Composite var1, boolean var2, String[] var3, List var4, int var5) {
      if(var3.length == 0) {
         throw new RuntimeException("Invalid table, no column specified");
      } else {
         this.dN = new Table(this, 66306);
         this.dN.setHeaderVisible(true);
         this.dN.setLinesVisible(true);
         this.ld = new ArrayList();
         if(var2) {
            this.dN("Index");
         }

         String[] var6 = var3;
         int var7 = var3.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            String var9 = var6[var8];
            this.dN(var9);
         }

         if(var2) {
            this.dN.setSortColumn((TableColumn)this.ld.get(0));
            this.dN.setSortDirection(1024);
            ArrayList var12 = new ArrayList(((List)var4).size());
            var7 = 0;
            Iterator var15 = ((List)var4).iterator();

            while(var15.hasNext()) {
               Comparable[] var16 = (Comparable[])var15.next();
               Comparable[] var10 = new Comparable[this.ld.size()];
               var10[0] = new Integer(var7++);

               for(int var11 = 0; var11 < var16.length; ++var11) {
                  var10[var11 + 1] = var16[var11];
               }

               var12.add(var10);
            }

            var4 = var12;
         }

         this.QE = (List)var4;
         this.dN((List)var4);
         Iterator var13 = this.ld.iterator();

         while(var13.hasNext()) {
            TableColumn var14 = (TableColumn)var13.next();
            var14.pack();
         }

         if(var5 >= 0) {
            this.dN.setSelection(var5);
         }

      }
   }

   private TableColumn dN(String var1) {
      TableColumn var2 = new TableColumn(this.dN, 16384);
      var2.setText(var1);
      var2.setResizable(true);
      var2.setWidth(100);
      var2.addSelectionListener(this);
      this.ld.add(var2);
      return var2;
   }

   private void dN(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Comparable[] var3 = (Comparable[])var2.next();
         TableItem var4 = new TableItem(this.dN, 0);
         int var5 = 0;
         Comparable[] var6 = var3;
         int var7 = var3.length;

         for(int var8 = 0; var8 < var7; ++var8) {
            Comparable var9 = var6[var8];
            var4.setText(var5++, var9.toString());
         }
      }

   }

   public void widgetSelected(SelectionEvent var1) {
      TableColumn var2 = (TableColumn)var1.widget;
      TableColumn var3 = this.dN.getSortColumn();
      final int var4 = var2 == var3 && this.dN.getSortDirection() == 1024?128:1024;
      this.dN.setSortColumn(var2);
      this.dN.setSortDirection(var4);
      final int var5 = 0;
      TableColumn[] var6 = this.dN.getColumns();
      int var7 = var6.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         TableColumn var9 = var6[var8];
         if(var9 == var2) {
            break;
         }

         ++var5;
      }

      Collections.sort(this.QE, new Comparator() {
         // $FF: synthetic field
         private int dN = var5;
         // $FF: synthetic field
         private int ld = var4;

         public int dN(Comparable[] var1, Comparable[] var2) {
            int var3 = var1[this.dN].compareTo(var2[this.dN]);
            return this.ld == 1024?var3:-var3;
         }

         // $FF: synthetic method
         public int compare(Object var1, Object var2) {
            return this.dN((Comparable[])var1, (Comparable[])var2);
         }
      });
      this.dN.removeAll();
      this.dN(this.QE);
   }

   public void widgetDefaultSelected(SelectionEvent var1) {
   }

   public oa dN() {
      return this.fa;
   }

   public void dN(oa var1) {
      if(var1 == null) {
         var1 = this.fa;
         if(var1 == null) {
            return;
         }
      }

      int var2 = -1;
      int var3 = this.dN.getSelectionIndex();
      boolean var4 = false;

      while(true) {
         while(true) {
            var3 += var1.QE?-1:1;
            if(var3 < 0 || var3 >= this.dN.getItemCount()) {
               break;
            }

            StringBuilder var5 = new StringBuilder();
            Comparable[] var6 = (Comparable[])this.QE.get(var3);
            int var7 = var6.length;

            for(int var8 = 0; var8 < var7; ++var8) {
               Comparable var9 = var6[var8];
               var5.append(" " + var9);
            }

            String var10 = var5.toString();
            var2 = TM.dN(var10, 0, var1.dN, var1.ld, false);
            if(var2 >= 0) {
               this.dN.setSelection(var3);
               break;
            }
         }

         if(var2 >= 0 || !var1.wU || var4) {
            if(var2 < 0) {
               Display.getCurrent().beep();
            }

            this.fa = var1;
            return;
         }

         Display.getCurrent().beep();
         var4 = true;
         var3 = var1.QE?this.dN.getItemCount():-1;
      }
   }
}
