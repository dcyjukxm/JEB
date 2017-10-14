package jebglobal;

import java.lang.reflect.Method;
import jebglobal.rP;

public class lS {
   public static boolean dN(Class[] var0) {
      if(var0.length == 0) {
         return true;
      } else {
         boolean var1 = false;

         try {
            Object var2 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 107, 15, 72, 83, 66}, 2, 11)).getMethod(rP.dN(new byte[]{89, 2, 17, 36, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7}, 1, 62), new Class[0]).invoke(var0[0], new Object[0]);
            Object var3 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 97, 75, 86, 71, 73, 67, 70, 89, 94, 93, 104, 79, 34, 19, 8, 13}, 2, 103)).getMethod(rP.dN(new byte[]{36, 10, 4, 58, 29, 13, 2, 59, 27, 85, 90, 0, 76}, 2, 227), new Class[0]).invoke(var2, new Object[0]);
            Object var4 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86}, 2, 116)).getMethod(rP.dN(new byte[]{36, 10, 4, 53, 29, 10, 6, 28, 29, 79, 70}, 2, 5), new Class[0]).invoke(var3, new Object[0]);
            Object var5 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 47}, 2, 79)).getMethod(rP.dN(new byte[]{55, 0, 37, 43, 59}, 2, 106), new Class[0]).invoke(var4, new Object[0]);
            Object var6 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6}, 2, 176)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{67, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 27}, 1, 41))}).newInstance(new Object[]{var5});
            var1 = dN(var6, var0);
         } catch (Exception var7) {
            ;
         }

         return var1;
      }
   }

   private static boolean dN(Object var0, Class[] var1) {
      boolean var2 = false;

      try {
         Object var3 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 155)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{2, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9}, 1, 104)), Boolean.TYPE}).newInstance(new Object[]{var0, Boolean.valueOf(true)});
         byte[] var4 = new byte[4096];
         Class[] var5 = var1;
         int var6 = var1.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            Class var8 = var5[var7];
            String var9 = var8.getName().replace('.', '/') + ".class";
            Object var10 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 207)).getMethod(rP.dN(new byte[]{36, 10, 4, 60, 28, 29, 21, 17}, 2, 196), new Class[]{String.class}).invoke(var3, new Object[]{var9});
            Object var11 = Class.forName(rP.dN(new byte[]{-118, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 224)).getMethod(rP.dN(new byte[]{36, 10, 4, 48, 28, 25, 18, 28, 39, 84, 90, 6, 72, 77}, 2, 236), new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 82, 10, 89, 14, 107, 80, 73, 118, 66, 84, 64, 73}, 2, 92))}).invoke(var3, new Object[]{var10});
            Method var12 = Class.forName(rP.dN(new byte[]{-76, 11, 23, 23, 79, 71, 6, 65, 103, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12}, 1, 222)).getMethod(rP.dN(new byte[]{-15, 23, 4, 5}, 1, 131), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});

            while(((Integer)var12.invoke(var11, new Object[]{var4, Integer.valueOf(0), Integer.valueOf(var4.length)})).intValue() != -1) {
               ;
            }

            Object[] var13 = (Object[])((Object[])Class.forName(rP.dN(new byte[]{26, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 55, 43, 26, 6, 11}, 1, 112)).getMethod(rP.dN(new byte[]{-54, 2, 17, 55, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17, 22}, 1, 173), new Class[0]).invoke(var10, new Object[0]));
            Object var14 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 82, 92, 75, 71, 2, 99, 87, 66, 69, 90, 74, 73, 44, 19, 21, 6}, 2, 65)).getMethod(rP.dN(new byte[]{36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26}, 2, 192), new Class[0]).invoke(var13[0], new Object[0]);
            Object var15 = Class.forName(rP.dN(new byte[]{91, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28}, 1, 49)).getMethod(rP.dN(new byte[]{10, 2, 17, 57, 34, 11, 17, 25, 25, 6}, 1, 109), new Class[0]).invoke(var14, new Object[0]);
            var2 = var15.toString().substring(10).substring(15, 30).equals(rP.dN(new byte[]{4, 8, 3, 7, 2, 5, 2, 3, 4, 0, 0, 5, 5, 1, 14}, 1, 61));
            if(!var2) {
               break;
            }
         }

         Class.forName(rP.dN(new byte[]{23, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 125)).getMethod(rP.dN(new byte[]{32, 3, 31, 10, 23}, 2, 112), new Class[0]).invoke(var3, new Object[0]);
      } catch (Exception var16) {
         ;
      }

      return var2;
   }
}
