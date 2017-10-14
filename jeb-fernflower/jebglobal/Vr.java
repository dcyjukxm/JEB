package jebglobal;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import jebglobal.rP;

public class Vr {
   private static final long LK = 844563159190538443L;
   private static long dN;

   public static long dN() {
      return dN;
   }

   private static long ld() {
      String var1 = System.getProperty(rP.dN(new byte[]{-109, 28, 93, 64, 15, 12, 8}, 1, 252), "");
      String var0;
      if(var1.startsWith(rP.dN(new byte[]{-86, 62, 7, 10, 11, 24, 4}, 1, 253))) {
         var0 = QE();
      } else if(var1.startsWith(rP.dN(new byte[]{14, 14, 19}, 2, 32))) {
         var0 = wU();
      } else if(var1.startsWith(rP.dN(new byte[]{15, 6, 30, 12, 10}, 2, 203))) {
         var0 = fa();
         if(var0 == null) {
            var0 = zs();
         }
      } else {
         var0 = rP.dN(new byte[]{15, 14, 29, 27, 22, 8, 43, 9, 25, 66, 76, 2}, 2, 56);
      }

      try {
         MessageDigest var2 = MessageDigest.getInstance(rP.dN(new byte[]{14, 43, 69}, 2, 193));
         var2.update(var0.getBytes());
         byte[] var3 = var2.digest();
         ByteBuffer var4 = ByteBuffer.wrap(var3);
         var4.order(ByteOrder.LITTLE_ENDIAN);
         long var5 = var4.getLong() & Long.MAX_VALUE;
         return var5;
      } catch (NoSuchAlgorithmException var7) {
         throw new RuntimeException(var7);
      }
   }

   private static String QE() {
      String var0 = null;
      Runtime var3 = Runtime.getRuntime();

      Process var4;
      try {
         String[] var5 = rP.dN(new byte[]{52, 2, 25, 26, 82, 11, 14, 7, 7, 0, 79, 6, 93, 0, 66, 92, 75, 90, 77, 76, 92, 69, 92, 81, 73, 82}, 2, 15).split(" ");
         var4 = var3.exec(var5);
      } catch (IOException var13) {
         return null;
      }

      OutputStream var1 = var4.getOutputStream();
      InputStream var2 = var4.getInputStream();

      try {
         var1.close();
      } catch (IOException var12) {
         return null;
      }

      Scanner var15 = new Scanner(var2);

      try {
         String var6 = rP.dN(new byte[]{-94, 54, 23, 27, 8, 13, 34, 59, 24, 15, 7, 23}, 1, 241);

         while(var15.hasNext()) {
            String var7 = var15.next();
            if(var6.equals(var7)) {
               var0 = var15.next().trim();
               break;
            }
         }
      } finally {
         var15.close();
      }

      return var0;
   }

   private static String wU() {
      String var0 = null;
      Runtime var3 = Runtime.getRuntime();

      Process var4;
      try {
         String[] var5 = rP.dN(new byte[]{-48, 90, 6, 1, 93, 92, 17, 11, 7, 65, 92, 10, 10, 7, 17, 8, 50, 47, 2, 29, 9, 15, 5, 9, 23, 82, 115, 3, 24, 41, 19, 22, 19, 22, 19, 23, 33, 37, 21, 21, 53, 45, 9, 21}, 1, 255).split(" ");
         var4 = var3.exec(var5);
      } catch (IOException var19) {
         return null;
      }

      OutputStream var1 = var4.getOutputStream();
      InputStream var2 = var4.getInputStream();

      try {
         var1.close();
      } catch (IOException var18) {
         return null;
      }

      BufferedReader var22 = new BufferedReader(new InputStreamReader(var2));
      String var7 = rP.dN(new byte[]{22, 54, 23, 27, 8, 13, 76, 110, 59, 24, 15, 7, 23}, 1, 69);

      try {
         String var6;
         do {
            if((var6 = var22.readLine()) == null) {
               return var0;
            }
         } while(var6.indexOf(var7) < 0);

         var6 = var6.split(var7)[1];
         int var8 = var6.indexOf(58);
         if(var8 >= 0) {
            var0 = var6.substring(var8 + 1).trim();
         }

         return var0;
      } catch (IOException var20) {
         ;
      } finally {
         try {
            var2.close();
         } catch (IOException var17) {
            return null;
         }
      }

      return null;
   }

   private static String fa() {
      String var0 = null;

      BufferedReader var1;
      String var2;
      try {
         var2 = rP.dN(new byte[]{108, 25, 17, 11, 93, 5, 14, 10, 91, 68, 74, 22, 90, 15, 92, 88, 90, 91, 69, 78, 87, 29, 88, 87}, 2, 195);
         var1 = new BufferedReader(new InputStreamReader(new FileInputStream(var2)));
      } catch (FileNotFoundException var11) {
         return null;
      }

      try {
         var2 = var1.readLine();
         if(var2 != null) {
            var0 = var2.trim();
         }

         return var0;
      } catch (IOException var12) {
         ;
      } finally {
         try {
            var1.close();
         } catch (IOException var10) {
            return null;
         }
      }

      return null;
   }

   private static String zs() {
      String var0 = null;

      BufferedReader var1;
      String var2;
      try {
         var2 = rP.dN(new byte[]{108, 10, 4, 26, 93, 15, 20, 28, 21, 66}, 2, 224);
         var1 = new BufferedReader(new InputStreamReader(new FileInputStream(var2)));
      } catch (FileNotFoundException var15) {
         return null;
      }

      try {
         var2 = rP.dN(new byte[]{22, 58, 57, 61, 79}, 2, 54);
         String var3 = rP.dN(new byte[]{15, 46, 50, 60, 62, 84}, 2, 220);

         String var4;
         while((var4 = var1.readLine()) != null) {
            var4 = var4.trim();
            if(var4.length() != 0 && !var4.startsWith("#")) {
               String[] var5 = var4.split("[ \\t]+");
               if(var5.length >= 2 && var5[1].equals("/")) {
                  String var6 = var5[0];
                  if(var6.startsWith(var2)) {
                     var0 = var6.substring(5);
                  } else if(var6.startsWith(var3)) {
                     var0 = var6.substring(6);
                  } else {
                     var0 = var6;
                  }

                  if(var0 != null) {
                     var0 = var0.toLowerCase();
                  }

                  return var0;
               }
            }
         }

         return var0;
      } catch (IOException var16) {
         ;
      } finally {
         try {
            var1.close();
         } catch (IOException var14) {
            return null;
         }
      }

      return null;
   }

   static {
      try {
         dN = ld();
      } catch (Exception var0) {
         dN = 0L;
      }

   }
}
