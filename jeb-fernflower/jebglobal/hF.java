package jebglobal;

import jebglobal.cr;
import jebglobal.rn;
import jebglobal.vh;
import jebglobal.yW;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;

public final class hF extends Composite {
   private vh dN;
   private rn ld;
   private cr QE;

   public hF(Composite var1, yW var2) {
      super(var1, 0);
      this.setLayout(new FormLayout());
      this.dN = new vh(this);
      FormData var3 = new FormData();
      var3.left = new FormAttachment(0);
      var3.right = new FormAttachment(100);
      var3.top = new FormAttachment(0);
      var3.height = 18;
      this.dN.setLayoutData(var3);
      this.ld = new rn(this);
      var3 = new FormData();
      var3.left = new FormAttachment(0);
      var3.width = 8;
      var3.top = new FormAttachment(this.dN);
      var3.bottom = new FormAttachment(100);
      this.ld.setLayoutData(var3);
   }

   public void dN(cr var1) {
      if(this.QE == null && var1 != null && var1.getParent() == this) {
         this.QE = var1;
         FormData var2 = new FormData();
         var2.left = new FormAttachment(this.ld);
         var2.right = new FormAttachment(100);
         var2.top = new FormAttachment(this.dN);
         var2.bottom = new FormAttachment(100, 0);
         var1.setLayoutData(var2);
         this.dN.dN(var1);
         this.ld.dN(var1);
         this.layout();
      } else {
         throw new RuntimeException();
      }
   }

   public vh dN() {
      return this.dN;
   }

   public rn ld() {
      return this.ld;
   }

   public boolean setFocus() {
      return this.QE == null?false:this.QE.setFocus();
   }
}
