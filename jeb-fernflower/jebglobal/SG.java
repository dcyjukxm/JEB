package jebglobal;

import java.io.OutputStream;
import java.io.Writer;
import jebglobal.WC;
import jebglobal.ZJ;

public final class SG extends WC implements ZJ {
   private String QE;
   private boolean wU = false;

   public void dN(String var1, Boolean var2) {
      super.dN(var1 != null?var1:this.QE, var2);
      this.dN();
   }

   protected void dN(String var1, Writer var2) {
      if(var1 != null) {
         if(this.wU) {
            var2.write(var1);
         } else {
            super.dN(var1, var2);
         }
      }
   }

   public void dN(OutputStream var1, String var2) {
      super.dN(var1, var2 != null?var2:this.QE);
   }

   public void dN(String var1, Object var2) {
      if("DEFAULT_ENCODING".equals(var1)) {
         this.QE = (String)var2;
      } else {
         super.dN(var1, var2);
      }

   }

   public ZJ dN() {
      super.ld.write(this.dN);
      return this;
   }

   public void dN(boolean var1) {
      this.wU = var1;
   }
}
