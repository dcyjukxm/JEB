package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Random;
import jeb.Launcher;
import jebglobal.Am;
import jebglobal.DU;
import jebglobal.Dc;
import jebglobal.De;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.Rg;
import jebglobal.TM;
import jebglobal.UY;
import jebglobal.Vr;
import jebglobal.Xk;
import jebglobal.ZF;
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
import jebglobal.wk;

public class PX {
   private static final long LK = 844563159190538443L;
   private static Random ld = new Random(System.currentTimeMillis());
   public static byte[] dN = new byte[]{69, 103, -94, -103, 33, -125, -15, 16};
   private int QE;
   private int wU;
   private long fa;
   private wk zs;
   private byte[] mS;

   public static byte[] dN(byte[] var0, int[] var1) {
      if(var0 == null) {
         return null;
      } else {
         try {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            Hk var3 = new Hk(var2);
            var3.writeInt(48 + var0.length);
            var3.writeInt(ld.nextInt());
            var3.writeInt(4);
            var3.writeInt(0);
            var3.writeInt(0);
            var3.writeLong(844563159190538443L);
            var3.writeInt(uK.dN);
            var3.writeInt(eI.dN.dN());
            var3.writeInt(eI.dN.ld());
            var3.writeInt(eI.dN.QE());
            int var4 = (int)(System.currentTimeMillis() / 1000L);
            var3.writeInt(var4 - eI.zs());
            int var5 = fa();
            var3.writeInt(var5);
            int var6 = ld.nextInt();
            var3.writeInt(var6);
            var3.write(var0);
            var3.dN();
            byte[] var7 = var2.toByteArray();
            ByteBuffer var8 = ByteBuffer.wrap(var7);
            var8.order(ByteOrder.LITTLE_ENDIAN);
            var8.putInt(0, var7.length - 8);
            var8.putInt(12, TM.dN(Arrays.copyOfRange(var7, 16, var7.length)));
            byte[] var9 = new byte[16];

            int var10;
            for(var10 = 0; var10 < 8; ++var10) {
               var9[var10] = var7[var10];
            }

            for(var10 = 8; var10 < 16; ++var10) {
               var9[var10] = dN[var10 - 8];
            }

            TM.dN(var9, var7, 8, var7.length);
            if(var1 != null && var1.length >= 1) {
               var1[0] = var6;
            }

            return var7;
         } catch (Exception var11) {
            return null;
         }
      }
   }

   public static String dN(byte[] var0) {
      try {
         return ZF.ld(var0);
      } catch (Exception var1) {
         return null;
      }
   }

   public static byte[] dN(String var0) {
      try {
         return ZF.ld(var0);
      } catch (Exception var1) {
         return null;
      }
   }

   private static int fa() {
      Class[] var0 = new Class[]{Launcher.class, uK.class, eI.class, cd.class, jN.class, oQ.class, PX.class, fO.class, DU.class, Vr.class, De.class, Rg.class, ai.class, lS.class, rK.class, Dc.class, sS.class, Am.class, UY.class, qm.class, Xk.class};
      int var1 = (int)dN(var0);
      return var1 | 2145386496;
   }

   private static long dN(Class[] var0) {
      if(var0.length == 0) {
         return 0L;
      } else {
         long var1 = 0L;

         try {
            Object var3 = Class.forName(rP.dN(new byte[]{-69, 11, 23, 23, 79, 66, 13, 15, 9, 73, 109, 47, 13, 18, 0}, 1, 209)).getMethod(rP.dN(new byte[]{32, 2, 17, 36, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7}, 1, 71), new Class[0]).invoke(var0[0], new Object[0]);
            Object var4 = Class.forName(rP.dN(new byte[]{120, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 126, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7}, 1, 18)).getMethod(rP.dN(new byte[]{-116, 2, 17, 55, 44, 11, 1, 54, 60, 26, 7, 17, 6}, 1, 235), new Class[0]).invoke(var3, new Object[0]);
            Object var5 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 26, 2, 11, 1, 82, 65, 23, 80, 14, 114, 86, 93, 86, 127, 79, 71, 66, 82, 86}, 2, 189)).getMethod(rP.dN(new byte[]{36, 10, 4, 53, 29, 10, 6, 28, 29, 79, 70}, 2, 22), new Class[0]).invoke(var4, new Object[0]);
            Object var6 = Class.forName(rP.dN(new byte[]{-19, 11, 23, 23, 79, 64, 11, 17, 90, 123, 7, 30}, 1, 135)).getMethod(rP.dN(new byte[]{55, 0, 37, 43, 59}, 2, 188), new Class[0]).invoke(var5, new Object[0]);
            Object var7 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6}, 2, 101)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 42}, 2, 100))}).newInstance(new Object[]{var6});
            var1 = dN(var7, var0);
         } catch (Exception var8) {
            ;
         }

         return var1;
      }
   }

   private static long dN(Object var0, Class[] var1) {
      long var2 = 0L;

      try {
         Object var4 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 223)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{-87, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9}, 1, 195)), Boolean.TYPE}).newInstance(new Object[]{var0, Boolean.valueOf(true)});
         byte[] var5 = new byte[4096];
         int var6 = 0;
         Class[] var7 = var1;
         int var8 = var1.length;

         for(int var9 = 0; var9 < var8; ++var9) {
            Class var10 = var7[var9];
            String var11 = var10.getName().replace('.', '/') + ".class";
            Object var12 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 81)).getMethod(rP.dN(new byte[]{36, 10, 4, 60, 28, 29, 21, 17}, 2, 18), new Class[]{String.class}).invoke(var4, new Object[]{var11});
            Object var13 = Class.forName(rP.dN(new byte[]{58, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 80)).getMethod(rP.dN(new byte[]{93, 2, 17, 61, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12}, 1, 58), new Class[]{Class.forName(rP.dN(new byte[]{11, 11, 23, 23, 79, 91, 1, 29, 5, 66, 84, 19, 25, 94, 116, 51, 25, 53, 43, 26, 6, 11}, 1, 97))}).invoke(var4, new Object[]{var12});
            Method var14 = Class.forName(rP.dN(new byte[]{-16, 11, 23, 23, 79, 71, 6, 65, 103, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12}, 1, 154)).getMethod(rP.dN(new byte[]{-26, 23, 4, 5}, 1, 148), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});

            while(((Integer)var14.invoke(var13, new Object[]{var5, Integer.valueOf(0), Integer.valueOf(var5.length)})).intValue() != -1) {
               ;
            }

            Object[] var15 = (Object[])((Object[])Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73}, 2, 21)).getMethod(rP.dN(new byte[]{36, 10, 4, 58, 23, 27, 19, 1, 18, 73, 75, 2, 93, 69, 66}, 2, 251), new Class[0]).invoke(var12, new Object[0]));
            Object var16 = Class.forName(rP.dN(new byte[]{-100, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 77, 6, 23, 6, 90, 109, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17}, 1, 246)).getMethod(rP.dN(new byte[]{36, 10, 4, 41, 7, 11, 11, 1, 23, 107, 77, 26}, 2, 131), new Class[0]).invoke(var15[0], new Object[0]);
            Object var17 = Class.forName(rP.dN(new byte[]{49, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28}, 1, 91)).getMethod(rP.dN(new byte[]{36, 10, 4, 52, 29, 13, 18, 4, 1, 83}, 2, 207), new Class[0]).invoke(var16, new Object[0]);
            boolean var18 = var17.toString().substring(10).substring(15, 30).equals(rP.dN(new byte[]{-107, 8, 3, 7, 2, 5, 2, 3, 4, 0, 0, 5, 5, 1, 14}, 1, 172));
            if(var18) {
               var2 |= 1L << var6;
            }

            ++var6;
            if(var6 >= 64) {
               break;
            }
         }

         Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 127)).getMethod(rP.dN(new byte[]{-107, 15, 3, 28, 22}, 1, 246), new Class[0]).invoke(var4, new Object[0]);
      } catch (Exception var19) {
         ;
      }

      return var2;
   }

   public static PX ld(byte[] var0) {
      try {
         if(var0.length < 56) {
            return null;
         } else {
            byte[] var1 = new byte[16];

            int var2;
            for(var2 = 0; var2 < 8; ++var2) {
               var1[var2] = var0[var2];
            }

            for(var2 = 8; var2 < 16; ++var2) {
               var1[var2] = dN[var2 - 8];
            }

            TM.dN(var1, var0, 8, var0.length);
            ByteArrayInputStream var9 = new ByteArrayInputStream(var0);
            OZ var3 = new OZ(var9);
            int var4 = var3.readInt();
            int var5 = 8 + var4;
            if(var4 >= 48 && var5 <= var0.length) {
               var3.readInt();
               PX var6 = new PX();
               var6.QE = var3.readInt();
               if(var6.QE != 4) {
                  return null;
               } else {
                  int var7 = var3.readInt();
                  if(var7 != TM.dN(Arrays.copyOfRange(var0, 16, var5))) {
                     return null;
                  } else {
                     var6.wU = var3.readInt();
                     var6.fa = var3.readLong();
                     var3.readInt();
                     var6.zs = new wk(var3.readInt(), var3.readInt(), var3.readInt());
                     var3.readInt();
                     var3.readInt();
                     var3.readInt();
                     var6.mS = Arrays.copyOfRange(var0, 56, var5);
                     return var6;
                  }
               }
            } else {
               return null;
            }
         }
      } catch (Exception var8) {
         return null;
      }
   }

   public int dN() {
      return this.wU;
   }

   public long ld() {
      return this.fa;
   }

   public wk QE() {
      return this.zs;
   }

   public byte[] wU() {
      return this.mS;
   }

   public String toString() {
      return super.toString();
   }
}
