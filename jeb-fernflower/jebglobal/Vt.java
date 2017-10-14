package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import jebglobal.as;
import jebglobal.xh;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.Widget;

public final class Vt {
   private MenuItem dN;
   private ToolItem ld;
   private ArrayList QE = new ArrayList();
   private ArrayList wU = new ArrayList();

   public Vt(MenuItem var1, ToolItem var2) {
      this.dN = var1;
      this.ld = var2;
   }

   public ArrayList dN() {
      return this.wU;
   }

   public void dN(as var1) {
      if(var1 == null) {
         throw new RuntimeException();
      } else {
         this.wU.add(var1);
      }
   }

   public MenuItem ld() {
      return this.dN;
   }

   public ToolItem QE() {
      return this.ld;
   }

   public ArrayList wU() {
      return this.QE;
   }

   public void dN(xh var1) {
      if(var1 == null) {
         throw new RuntimeException();
      } else {
         this.QE.add(var1);
      }
   }

   public boolean dN(Widget var1) {
      if(var1 != this.dN && var1 != this.ld) {
         Iterator var2 = this.QE.iterator();

         xh var3;
         do {
            if(!var2.hasNext()) {
               return false;
            }

            var3 = (xh)var2.next();
         } while(var1 != var3.dN());

         return true;
      } else {
         return true;
      }
   }

   public void dN(boolean var1) {
      if(this.dN != null) {
         this.dN.setEnabled(var1);
      }

      if(this.ld != null) {
         this.ld.setEnabled(var1);
      }

      Iterator var2 = this.QE.iterator();

      while(var2.hasNext()) {
         xh var3 = (xh)var2.next();
         var3.dN(var1);
      }

   }
}
