package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.QV;
import jebglobal.XQ;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Listener;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public final class Co implements CTabFolder2Listener {
   CTabFolder dN;
   private List QE;
   List ld;

   public Co(Composite var1) {
      this(var1, true);
   }

   public Co(Composite var1, boolean var2) {
      this.QE = new ArrayList();
      this.ld = new ArrayList();
      short var3 = 2048;
      if(var2) {
         var3 = 2112;
      }

      this.dN = new CTabFolder(var1, var3);
      this.dN.setSimple(false);
      this.dN.addCTabFolder2Listener(this);
      this.dN.addSelectionListener(new SelectionAdapter() {
         // $FF: synthetic field
         private Co dN = Co.this;

         public void widgetSelected(SelectionEvent var1) {
            CTabItem var2 = this.dN.dN.getSelection();
            Iterator var3 = this.dN.ld.iterator();

            Co.uK var4;
            do {
               if(!var3.hasNext()) {
                  return;
               }

               var4 = (Co.uK)var3.next();
            } while(var4.QE != var2);

            boolean var5 = var4.ld.setFocus();
            if(!var5) {
               Object[] var10000 = new Object[]{var4.ld};
            }

         }
      });
   }

   public void dN(XQ var1) {
      this.QE.add(var1);
   }

   public CTabFolder dN() {
      return this.dN;
   }

   public List ld() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.ld.iterator();

      while(var2.hasNext()) {
         Co.uK var3 = (Co.uK)var2.next();
         var1.add(var3.ld);
      }

      return var1;
   }

   public boolean dN(String var1, Control var2) {
      return this.dN(var1, var2, true);
   }

   public boolean dN(String var1, Control var2, boolean var3) {
      if(var2 == null) {
         return false;
      } else {
         CTabItem var4 = null;
         if(var3) {
            var4 = new CTabItem(this.dN, 0);
            var4.setText(var1);
            var4.setControl(var2);
         }

         Co.uK var5 = new Co.uK(var1, var2, var4);
         this.ld.add(var5);
         Iterator var6 = this.QE.iterator();

         while(var6.hasNext()) {
            XQ var7 = (XQ)var6.next();
            var7.dN(new QV(this, var1));
         }

         return true;
      }
   }

   public boolean dN(String var1) {
      Co.uK var2 = this.ld(var1);
      if(var2 == null) {
         return false;
      } else {
         if(var2.QE != null) {
            var2.QE.dispose();
         }

         this.ld.remove(var2);
         Iterator var3 = this.QE.iterator();

         while(var3.hasNext()) {
            XQ var4 = (XQ)var3.next();
            var4.ld(new QV(this, var1));
         }

         return true;
      }
   }

   public void QE() {
      while(!this.ld.isEmpty()) {
         this.dN(((Co.uK)this.ld.get(0)).dN);
      }

   }

   public boolean dN(int var1, boolean var2) {
      if(var1 >= 0 && var1 < this.ld.size()) {
         Co.uK var3 = (Co.uK)this.ld.get(var1);
         this.dN(var3, var2);
         return true;
      } else {
         return false;
      }
   }

   public boolean dN(Control var1, boolean var2) {
      Co.uK var3 = this.dN(var1);
      if(var3 == null) {
         return false;
      } else {
         this.dN(var3, var2);
         return true;
      }
   }

   public boolean dN(String var1, boolean var2) {
      Co.uK var3 = this.ld(var1);
      if(var3 == null) {
         return false;
      } else {
         this.dN(var3, var2);
         return true;
      }
   }

   private void dN(Co.uK var1, boolean var2) {
      if(var1.QE == null) {
         CTabItem var3 = new CTabItem(this.dN, 0);
         var3.setText(var1.dN);
         var3.setControl(var1.ld);
         var1.QE = var3;
      }

      this.dN.setSelection(var1.QE);
      if(var2) {
         var1.QE.getControl().setFocus();
      }

   }

   public Control wU() {
      Iterator var1 = this.ld.iterator();

      Co.uK var2;
      do {
         if(!var1.hasNext()) {
            return null;
         }

         var2 = (Co.uK)var1.next();
      } while(this.dN.getSelection() != var2.QE);

      return var2.ld;
   }

   private Co.uK ld(String var1) {
      Iterator var2 = this.ld.iterator();

      Co.uK var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (Co.uK)var2.next();
      } while(!var3.dN.equals(var1));

      return var3;
   }

   private Co.uK dN(Control var1) {
      Iterator var2 = this.ld.iterator();

      Co.uK var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (Co.uK)var2.next();
      } while(var3.ld != var1);

      return var3;
   }

   public void close(CTabFolderEvent var1) {
      CTabItem var2 = (CTabItem)var1.item;
      Iterator var3 = this.ld.iterator();

      while(var3.hasNext()) {
         Co.uK var4 = (Co.uK)var3.next();
         if(var4.QE == var2) {
            var4.QE = null;
         }
      }

   }

   public void maximize(CTabFolderEvent var1) {
   }

   public void minimize(CTabFolderEvent var1) {
   }

   public void restore(CTabFolderEvent var1) {
   }

   public void showList(CTabFolderEvent var1) {
   }

   class uK {
      String dN;
      Control ld;
      CTabItem QE;

      uK(String var2, Control var3, CTabItem var4) {
         this.dN = var2;
         this.ld = var3;
         this.QE = var4;
      }
   }
}
