package jebglobal;

import java.io.IOException;
import jebglobal.TM;

public enum HJ {
   fa,
   dN,
   ld,
   QE,
   wU,
   zs,
   mS;

   public static HJ dN(String var0) {
      String var1 = null;
      String var2 = var0.toLowerCase();
      int var3 = var2.lastIndexOf(46);
      if(var3 >= 0) {
         var1 = var2.substring(var3 + 1);
      }

      HJ var4 = fa;
      if(var1 != null) {
         if(var1.equals("xml")) {
            var4 = QE;
         } else if(!var1.equals("txt") && !var1.equals("csv")) {
            if(!var1.equals("html") && !var1.equals("htm")) {
               if(!var1.equals("png") && !var1.equals("gif") && !var1.equals("jpg") && !var1.equals("jpeg") && !var1.equals("bmp") && !var1.equals("tif") && !var1.equals("tiff") && !var1.equals("ico")) {
                  if(var1.equals("wav") || var1.equals("mp3")) {
                     var4 = zs;
                  }
               } else {
                  var4 = wU;
               }
            } else {
               var4 = ld;
            }
         } else {
            var4 = dN;
         }
      }

      if(var4 == fa) {
         int var5 = TM.KK(var0);
         if(var5 != 0 && (var5 & -2139062144) == 0) {
            try {
               byte[] var6 = TM.LH(var0);
               if(dN(var6)) {
                  var4 = dN;
               }
            } catch (IOException var7) {
               ;
            }
         }
      }

      return var4;
   }

   private static boolean dN(byte[] var0) {
      byte[] var1 = var0;
      int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         byte var4 = var1[var3];
         if(var4 <= 0) {
            return false;
         }
      }

      return true;
   }
}
