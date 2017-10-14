package jebglobal;

import jebglobal.ED;
import jebglobal.Kf;
import jebglobal.Mt;
import jebglobal.dx;

public abstract class fv extends ED implements Mt {
   private String dN;
   protected final String ld;

   protected fv(String var1, String var2) {
      this.dN = var1;
      this.ld = var2;
   }

   public String fa() {
      return this.ld != null?this.ld:this.dN();
   }

   public String zs() {
      return this.mS();
   }

   public String mS() {
      return this.ld != null?this.ld:this.dN();
   }

   public void dN(Kf var1, dx var2) {
      String var3 = var2.QE().mS().dN();
      boolean var4 = !"reference".equals(this.dN) && !var3.equals(this.dN);
      String var5 = var4?"item":var3;
      var1.ld((String)null, var5);
      if(var4) {
         var1.dN((String)null, "type", var3);
      }

      var1.dN((String)null, "name", var2.QE().fa());
      this.ld(var1, var2);
      String var6 = this.mS();
      if(!var6.isEmpty()) {
         var1.OK(var6);
      }

      var1.QE((String)null, var5);
   }

   public String OK() {
      return this.dN;
   }

   protected void ld(Kf var1, dx var2) {
   }

   protected abstract String dN();
}
