package jebglobal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jebglobal.CL;
import jebglobal.GM;
import jebglobal.Kf;
import jebglobal.XN;
import jebglobal.ZJ;
import jebglobal.Zq;
import jebglobal.iR;
import jebglobal.lb;
import jebglobal.zX;

public final class jq implements Zq {
   private final iR dN;
   private final ZJ ld;

   public jq(iR var1, ZJ var2) {
      this.dN = var1;
      this.ld = var2;
   }

   public void dN(InputStream var1, OutputStream var2) {
      try {
         GM var3 = GM.dN();
         XN var4 = var3.dN(this.dN);
         CL var5 = var3.dN((Kf)this.ld);
         var4.dN(var1, (String)null);
         var5.dN(var2, (String)null);

         while(var4.fa() != 1) {
            var5.dN(var4);
         }

         this.ld.dN();
         var5.KK();
      } catch (lb var6) {
         throw new zX();
      } catch (IOException var7) {
         throw new zX();
      }
   }
}
