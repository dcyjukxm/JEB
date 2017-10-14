package jebglobal;

import jeb.Launcher;
import jebglobal.rP;

public final class uK {
   private static int ld = 1397199600;
   public static int dN = 0;
   private static int QE;

   public static void dN(int var0) {
      if(var0 > 0 && ld == 0) {
         ld = var0;
      }

   }

   public static int dN() {
      return ld > 0?ld + 750284047:0;
   }

   public static boolean ld() {
      return dN == 2 || dN == 3;
   }

   public static String QE() {
      switch(dN) {
      case 0:
         return rP.dN(new byte[]{-76, 19, 25, 0, 76, 68, 1, 7, 23, 18}, 1, 210);
      case 1:
         return rP.dN(new byte[]{37, 26, 28, 21}, 2, 147);
      case 2:
         return rP.dN(new byte[]{14, 1, 8, 2, 79, 68, 1, 7, 23, 18}, 1, 106);
      case 3:
         return rP.dN(new byte[]{74, 1, 8, 2}, 1, 46);
      case 4:
         return rP.dN(new byte[]{-53, 20, 1, 27, 2, 12, 21, 29, 6, 1, 78, 68, 1, 7, 23, 18}, 1, 170);
      case 5:
         return rP.dN(new byte[]{34, 26, 4, 22, 31, 8, 19, 1, 27, 78}, 2, 180);
      default:
         return null;
      }
   }

   public static boolean wU() {
      return false;
   }

   public static String fa() {
      byte[] var0 = Launcher.QE("LICENSE.TXT");
      return var0 == null?null:new String(var0);
   }

   static {
      dN += 0;
      QE = 0;
   }
}
