package jebglobal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import jebglobal.AR;
import jebglobal.kg;
import jebglobal.yL;

public final class ub {
   private int dN = -1;
   private byte ld;
   private short QE;
   private char wU;
   private int fa;
   private long zs;
   private float mS;
   private double OK;
   private int LH;
   private int KK;
   private int EO;
   private int cb;
   private int PF;
   private ub[] Hw;
   private kg rK;
   private boolean Ux;

   public int dN() {
      return this.dN;
   }

   public boolean ld() {
      return this.dN == 30;
   }

   public byte QE() {
      if(this.dN != 0) {
         throw new RuntimeException();
      } else {
         return this.ld;
      }
   }

   public short wU() {
      if(this.dN != 2) {
         throw new RuntimeException();
      } else {
         return this.QE;
      }
   }

   public char fa() {
      if(this.dN != 3) {
         throw new RuntimeException();
      } else {
         return this.wU;
      }
   }

   public int zs() {
      if(this.dN != 4) {
         throw new RuntimeException();
      } else {
         return this.fa;
      }
   }

   public long mS() {
      if(this.dN != 6) {
         throw new RuntimeException();
      } else {
         return this.zs;
      }
   }

   public float OK() {
      if(this.dN != 16) {
         throw new RuntimeException();
      } else {
         return this.mS;
      }
   }

   public double LH() {
      if(this.dN != 17) {
         throw new RuntimeException();
      } else {
         return this.OK;
      }
   }

   public int KK() {
      if(this.dN != 23) {
         throw new RuntimeException();
      } else {
         return this.LH;
      }
   }

   public int EO() {
      if(this.dN != 24) {
         throw new RuntimeException();
      } else {
         return this.KK;
      }
   }

   public int cb() {
      if(this.dN != 25) {
         throw new RuntimeException();
      } else {
         return this.EO;
      }
   }

   public int PF() {
      if(this.dN != 26) {
         throw new RuntimeException();
      } else {
         return this.cb;
      }
   }

   public int Hw() {
      if(this.dN != 27) {
         throw new RuntimeException();
      } else {
         return this.PF;
      }
   }

   public ub[] rK() {
      if(this.dN != 28) {
         throw new RuntimeException();
      } else {
         return this.Hw;
      }
   }

   public kg Ux() {
      if(this.dN != 29) {
         throw new RuntimeException();
      } else {
         return this.rK;
      }
   }

   public boolean ZY() {
      if(this.dN != 31) {
         throw new RuntimeException();
      } else {
         return this.Ux;
      }
   }

   public String toString() {
      return super.toString();
   }

   public static ub dN(byte[] var0, int var1, int[] var2) {
      int var3 = var0[var1] & 255;
      int var4 = var3 & 31;
      int var5 = var3 >> 5;
      int[] var6 = new int[1];
      ub var7 = new ub();
      var7.dN = var4;
      ByteBuffer var8;
      switch(var4) {
      case 0:
         dN(var5, 0, 0);
         var7.ld = var0[var1 + 1];
         ++var5;
         break;
      case 1:
      case 5:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      default:
         throw new yL();
      case 2:
         dN(var5, 0, 1);
         var8 = dN(var0, var1 + 1, var5 + 1, 2, true);
         var7.QE = var8.getShort(0);
         ++var5;
         break;
      case 3:
         dN(var5, 0, 1);
         var8 = dN(var0, var1 + 1, var5 + 1, 2, false);
         var7.wU = var8.getChar(0);
         ++var5;
         break;
      case 4:
         dN(var5, 0, 3);
         var8 = dN(var0, var1 + 1, var5 + 1, 4, true);
         var7.fa = var8.getInt(0);
         ++var5;
         break;
      case 6:
         dN(var5, 0, 7);
         var8 = dN(var0, var1 + 1, var5 + 1, 8, true);
         var7.zs = var8.getLong(0);
         ++var5;
         break;
      case 16:
         dN(var5, 0, 3);
         var8 = dN(var0, var1 + 1, var5 + 1, 4, false);
         var7.mS = var8.getFloat(0);
         ++var5;
         break;
      case 17:
         dN(var5, 0, 7);
         var8 = dN(var0, var1 + 1, var5 + 1, 8, false);
         var7.OK = var8.getDouble(0);
         ++var5;
         break;
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
         dN(var5, 0, 3);
         var8 = dN(var0, var1 + 1, var5 + 1, 4, false);
         int var9 = var8.getInt(0);
         if(var9 < 0) {
            throw new yL();
         }

         if(var4 == 23) {
            var7.LH = var9;
         } else if(var4 == 24) {
            var7.KK = var9;
         } else if(var4 == 25) {
            var7.EO = var9;
         } else if(var4 == 26) {
            var7.cb = var9;
         } else {
            var7.PF = var9;
         }

         ++var5;
         break;
      case 28:
         dN(var5, 0, 0);
         var7.Hw = ld(var0, var1 + 1, var6);
         var5 = var6[0];
         break;
      case 29:
         dN(var5, 0, 0);
         var7.rK = kg.dN(var0, var1 + 1, var6);
         var5 = var6[0];
         break;
      case 30:
         dN(var5, 0, 0);
         var5 = 0;
         break;
      case 31:
         dN(var5, 0, 1);
         var7.Ux = var5 == 1;
         var5 = 0;
      }

      var2[0] = 1 + var5;
      return var7;
   }

   public static ub[] ld(byte[] var0, int var1, int[] var2) {
      int[] var3 = new int[1];
      int var4 = AR.ld(var0, var1, var3);
      int var5 = var1 + var3[0];
      ub[] var6 = new ub[var4];

      for(int var7 = 0; var7 < var4; ++var7) {
         var6[var7] = dN(var0, var5, var3);
         var5 += var3[0];
      }

      var2[0] = var5 - var1;
      return var6;
   }

   private static void dN(int var0, int var1, int var2) {
      if(var0 < var1 || var0 > var2) {
         throw new yL();
      }
   }

   private static ByteBuffer dN(byte[] var0, int var1, int var2, int var3, boolean var4) {
      ByteBuffer var5 = ByteBuffer.allocate(var3);
      var5.order(ByteOrder.LITTLE_ENDIAN);
      byte[] var6 = var5.array();

      int var7;
      for(var7 = 0; var7 < var2; ++var7) {
         var6[var7] = var0[var1 + var7];
      }

      if(var4 && (var6[var2 - 1] & 128) != 0) {
         for(var7 = var2; var7 < var3; ++var7) {
            var6[var7] = -1;
         }
      }

      return var5;
   }
}
