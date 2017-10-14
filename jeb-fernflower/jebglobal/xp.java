package jebglobal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import jebglobal.Bl;
import jebglobal.MS;
import jebglobal.Sj;
import jebglobal.Tn;
import jebglobal.dx;
import jebglobal.fa;
import jebglobal.oM;
import jebglobal.zX;

public final class xp {
   private final Bl dN;

   public xp(Bl var1) {
      this.dN = var1;
   }

   public void dN(dx var1, Sj var2, Sj var3) {
      fa var4 = (fa)var1.wU();
      String var5 = var4.dN();
      String var6 = var1.dN();
      String var7 = var1.QE().mS().dN();
      String var8 = null;
      int var10 = var5.lastIndexOf(".");
      String var9;
      if(var10 == -1) {
         var9 = var6;
      } else {
         var8 = var5.substring(var10);
         var9 = var6 + var8;
      }

      Object[] var10000;
      try {
         if(var7.equals("raw")) {
            this.dN(var2, var5, var3, var9, "raw");
            return;
         }

         if(var7.equals("drawable") || var7.equals("mipmap")) {
            if(var5.toLowerCase().endsWith(".9.png")) {
               var9 = var6 + ".9" + var8;

               try {
                  this.dN(var2, var5, var3, var9, "9patch");
                  return;
               } catch (Tn var12) {
                  var10000 = new Object[]{var5, var12.toString()};
                  var3.mS(var9);
                  var9 = var6 + var8;
               }
            }

            if(!".xml".equals(var8)) {
               this.dN(var2, var5, var3, var9, "raw");
               return;
            }
         }

         this.dN(var2, var5, var3, var9, "xml");
      } catch (zX var13) {
         var10000 = new Object[]{var5, var9, var13.toString()};
         var1.dN(new MS(false, (String)null));
      }

   }

   public void dN(Sj var1, String var2, Sj var3, String var4, String var5) {
      try {
         InputStream var6 = var1.QE(var2);
         OutputStream var7 = var3.wU(var4);
         this.dN.dN(var6, var7, var5);
         var6.close();
         var7.close();
      } catch (IOException var8) {
         throw new zX(var8);
      } catch (oM var9) {
         throw new zX(var9);
      }
   }
}
