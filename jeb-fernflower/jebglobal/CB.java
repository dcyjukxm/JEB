package jebglobal;

import java.lang.reflect.Method;
import jeb.Launcher;
import jebglobal.Am;
import jebglobal.DU;
import jebglobal.Dc;
import jebglobal.De;
import jebglobal.PX;
import jebglobal.Rg;
import jebglobal.UY;
import jebglobal.Vr;
import jebglobal.Xk;
import jebglobal.ai;
import jebglobal.cd;
import jebglobal.eI;
import jebglobal.fO;
import jebglobal.jN;
import jebglobal.lS;
import jebglobal.oQ;
import jebglobal.qm;
import jebglobal.rK;
import jebglobal.rP;
import jebglobal.sS;
import jebglobal.uK;

public final class CB {
   private static Method dN = null;
   private static long ld = ld();
   private static long QE = 0L;
   private static long wU = 0L;

   private static long ld() {
      try {
         if(dN == null) {
            dN = Class.forName(rP.dN(new byte[]{125, 11, 23, 23, 79, 66, 13, 15, 9, 73, 125, 42, 10, 7, 17, 8}, 1, 23)).getMethod(rP.dN(new byte[]{32, 26, 2, 11, 23, 7, 19, 60, 29, 77, 77, 46, 64, 76, 93, 80, 74}, 2, 9), new Class[0]);
         }

         return ((Long)dN.invoke((Object)null, new Object[0])).longValue();
      } catch (Exception var0) {
         return 0L;
      }
   }

   public static void dN() {
      QE = ld();
      if(QE - wU >= 60000L) {
         if(!wU()) {
            QE();
         }

         if(!fa()) {
            QE();
         }

         wU = QE;
      }
   }

   private static void QE() {
      try {
         Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 123, 26, 90, 84, 84, 84}, 2, 133)).getMethod(rP.dN(new byte[]{-29, 29, 17, 29}, 1, 134), new Class[]{Integer.TYPE}).invoke((Object)null, new Object[]{Integer.valueOf(0)});
      } catch (Exception var0) {
         ;
      }

   }

   private static boolean wU() {
      boolean var0 = false;

      try {
         int var1 = 93 * (ld % 10L == 0L?42:43);
         var1 *= 1000;
         boolean var10000 = QE - ld < (long)var1;
      } catch (Exception var2) {
         ;
      }

      return true;
   }

   private static boolean fa() {
      Class[] var0 = new Class[]{Launcher.class, uK.class, eI.class, cd.class, jN.class, oQ.class, PX.class, fO.class, DU.class, Vr.class, De.class, Rg.class, ai.class, lS.class, rK.class, Dc.class, sS.class, Am.class, UY.class, qm.class, Xk.class};
      return dN(var0);
   }

   private static boolean dN(Class[] var0) {
      if(var0.length == 0) {
         return true;
      } else {
         boolean var1 = false;

         try {
            Object var2 = Class.forName(rP.dN(new byte[]{-111, 11, 23, 23, 79, 66, 13, 15, 9, 73, 109, 47, 13, 18, 0}, 1, 251)).getMethod(rP.dN(new byte[]{74, 2, 17, 36, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7}, 1, 45), new Class[0]).invoke(var0[0], new Object[0]);
            Object var3 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13}, 2, 133)).getMethod(rP.dN(new byte[]{36, 10, 4, 58, 29, 13, 2, 59, 27, 85, 90, 0, 76}, 2, 224), new Class[0]).invoke(var2, new Object[0]);
            Object var4 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86}, 2, 74)).getMethod(rP.dN(new byte[]{-42, 2, 17, 56, 35, 12, 2, 21, 29, 6, 1}, 1, 177), new Class[0]).invoke(var3, new Object[0]);
            Object var5 = Class.forName(rP.dN(new byte[]{-14, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 30}, 1, 152)).getMethod(rP.dN(new byte[]{55, 0, 37, 43, 59}, 2, 28), new Class[0]).invoke(var4, new Object[0]);
            Object var6 = Class.forName(rP.dN(new byte[]{-11, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9}, 1, 159)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{-49, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 27}, 1, 165))}).newInstance(new Object[]{var5});
            var1 = dN(var6, var0);
         } catch (Exception var7) {
            ;
         }

         return var1;
      }
   }

   private static boolean dN(Object var0, Class[] var1) {
      boolean var2 = true;

      try {
         Object var3 = Class.forName(rP.dN(new byte[]{-58, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 172)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6}, 2, 212)), Boolean.TYPE}).newInstance(new Object[]{var0, Boolean.valueOf(true)});
         byte[] var4 = new byte[4096];
         Class[] var5 = var1;
         int var6 = var1.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            Class var8 = var5[var7];
            String var9 = var8.getName().replace('.', '/') + ".class";
            Object var10 = Class.forName(rP.dN(new byte[]{-123, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 239)).getMethod(rP.dN(new byte[]{36, 10, 4, 60, 28, 29, 21, 17}, 2, 118), new Class[]{String.class}).invoke(var3, new Object[]{var9});
            Object var11 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 233)).getMethod(rP.dN(new byte[]{36, 10, 4, 48, 28, 25, 18, 28, 39, 84, 90, 6, 72, 77}, 2, 189), new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 82, 10, 89, 14, 107, 80, 73, 118, 66, 84, 64, 73}, 2, 31))}).invoke(var3, new Object[]{var10});
            Method var12 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 61, 78, 88, 22, 93, 115, 69, 75, 92, 82, 65}, 2, 224)).getMethod(rP.dN(new byte[]{49, 10, 17, 29}, 2, 130), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});

            while(((Integer)var12.invoke(var11, new Object[]{var4, Integer.valueOf(0), Integer.valueOf(var4.length)})).intValue() != -1) {
               ;
            }

            Object[] var13 = (Object[])((Object[])Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73}, 2, 100)).getMethod(rP.dN(new byte[]{93, 2, 17, 55, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17, 22}, 1, 58), new Class[0]).invoke(var10, new Object[0]));
            Object var14 = Class.forName(rP.dN(new byte[]{105, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 77, 6, 23, 6, 90, 109, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17}, 1, 3)).getMethod(rP.dN(new byte[]{6, 2, 17, 36, 37, 23, 14, 5, 10, 40, 46, 28}, 1, 97), new Class[0]).invoke(var13[0], new Object[0]);
            Object var15 = Class.forName(rP.dN(new byte[]{-38, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28}, 1, 176)).getMethod(rP.dN(new byte[]{36, 10, 4, 52, 29, 13, 18, 4, 1, 83}, 2, 132), new Class[0]).invoke(var14, new Object[0]);
            var2 = var15.toString().substring(10).substring(15, 30).equals(rP.dN(new byte[]{122, 94, 66, 76, 69, 91, 87, 91, 67, 23, 31, 81, 30, 22, 9}, 2, 60));
            if(!var2) {
               break;
            }
         }

         Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 183)).getMethod(rP.dN(new byte[]{-16, 15, 3, 28, 22}, 1, 147), new Class[0]).invoke(var3, new Object[0]);
      } catch (Exception var16) {
         ;
      }

      return var2;
   }
}
