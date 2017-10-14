package jebglobal;

import jebglobal.Kf;
import jebglobal.Mt;
import jebglobal.PS;
import jebglobal.UD;
import jebglobal.UW;
import jebglobal.Vi;
import jebglobal.dN;
import jebglobal.dx;
import jebglobal.fv;
import jebglobal.sm;

public final class aj extends Vi implements Mt {
   private final PS[] ld;

   aj(UD var1, PS[] var2, dN var3) {
      super(var1);
      this.ld = new PS[var2.length];

      for(int var4 = 0; var4 < var2.length; ++var4) {
         this.ld[var4] = new PS(var3.dN(((Integer)var2[var4].dN).intValue(), (String)null), var2[var4].ld);
      }

   }

   public void dN(Kf var1, dx var2) {
      var1.ld((String)null, "style");
      var1.dN((String)null, "name", var2.QE().fa());
      if(!this.dN.wU()) {
         var1.dN((String)null, "parent", this.dN.fa());
      }

      for(int var3 = 0; var3 < this.ld.length; ++var3) {
         UW var4 = ((UD)this.ld[var3].dN).QE();
         sm var5 = (sm)var4.ld().wU();
         String var6 = var5.dN((fv)this.ld[var3].ld);
         if(var6 == null) {
            var6 = ((fv)this.ld[var3].ld).mS();
         }

         if(var6 != null) {
            var1.ld((String)null, "item");
            var1.dN((String)null, "name", var4.dN(var2.QE().zs(), true));
            var1.ld(var6);
            var1.QE((String)null, "item");
         }
      }

      var1.QE((String)null, "style");
   }
}
