package jebglobal;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jebglobal.ED;
import jebglobal.Ja;
import jebglobal.LP;
import jebglobal.MR;
import jebglobal.MS;
import jebglobal.Me;
import jebglobal.NM;
import jebglobal.OZ;
import jebglobal.PS;
import jebglobal.UW;
import jebglobal.Vi;
import jebglobal.cN;
import jebglobal.dN;
import jebglobal.dx;
import jebglobal.fv;
import jebglobal.hq;
import jebglobal.tz;
import jebglobal.wV;
import jebglobal.zX;

public final class aa {
   private final hq dN;
   private final LP ld;
   private final MR QE;
   private final List wU;
   private final boolean fa;
   private aa.lX zs;
   private wV mS;
   private wV OK;
   private wV LH;
   private cN KK;
   private Me EO;
   private NM cb;
   private int PF;
   private boolean[] Hw;

   public static aa.uK dN(InputStream var0, boolean var1, boolean var2, LP var3) {
      try {
         aa var4 = new aa(var0, var3, var1, var2);
         cN[] var5 = var4.dN();
         return new aa.uK(var5, var4.wU == null?null:(aa.vd[])var4.wU.toArray(new aa.vd[0]), var3);
      } catch (IOException var6) {
         throw new zX();
      }
   }

   private aa(InputStream var1, LP var2, boolean var3, boolean var4) {
      if(var3) {
         var1 = this.QE = new MR((InputStream)var1);
         this.wU = new ArrayList();
      } else {
         this.QE = null;
         this.wU = null;
      }

      this.dN = new hq(new OZ((InputStream)var1));
      this.ld = var2;
      this.fa = var4;
   }

   private cN[] dN() {
      this.ld(2);
      int var1 = this.dN.readInt();
      this.mS = wV.dN(this.dN);
      cN[] var2 = new cN[var1];
      this.KK();

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = this.ld();
      }

      return var2;
   }

   private cN ld() {
      this.dN(512);
      byte var1 = (byte)this.dN.readInt();
      String var2 = this.dN.dN(128, true);
      this.dN.dN();
      this.dN.dN();
      this.dN.dN();
      this.dN.dN();
      this.OK = wV.dN(this.dN);
      this.LH = wV.dN(this.dN);
      this.PF = var1 << 24;
      this.KK = new cN(this.ld, var1, var2);
      this.KK();

      while(this.zs.dN == 514) {
         this.QE();
      }

      return this.KK;
   }

   private Me QE() {
      this.dN(514);
      byte var1 = this.dN.readByte();
      this.dN.skipBytes(3);
      int var2 = this.dN.readInt();
      this.Hw = new boolean[var2];
      Arrays.fill(this.Hw, true);
      if(this.wU != null) {
         this.wU.add(new aa.vd(this.QE.dN(), var2));
      }

      this.dN.skipBytes(var2 * 4);
      this.PF = -16777216 & this.PF | var1 << 16;
      this.EO = new Me(this.OK.dN(var1 - 1), this.ld, this.KK);
      this.KK.dN(this.EO);

      while(this.KK().dN == 513) {
         this.wU();
      }

      this.LH();
      return this.EO;
   }

   private NM wU() {
      this.dN(513);
      this.dN.dN();
      int var1 = this.dN.readInt();
      this.dN.dN();
      Ja var2 = this.OK();
      int[] var3 = this.dN.dN(var1);
      if(var2.dN) {
         String var4 = this.EO.dN() + var2.dN();
         Object[] var10000;
         if(this.fa) {
            var10000 = new Object[]{var4};
         } else {
            var10000 = new Object[]{var4};
         }
      }

      this.cb = var2.dN && !this.fa?null:this.KK.dN(var2);

      for(int var5 = 0; var5 < var3.length; ++var5) {
         if(var3[var5] != -1) {
            this.Hw[var5] = false;
            this.PF = this.PF & -65536 | var5;
            this.fa();
         }
      }

      return this.cb;
   }

   private void fa() {
      this.dN.skipBytes(2);
      short var1 = this.dN.readShort();
      int var2 = this.dN.readInt();
      Object var3 = (var1 & 1) == 0?this.mS():this.zs();
      if(this.cb != null) {
         tz var4 = new tz(this.PF);
         UW var5;
         if(this.KK.dN(var4)) {
            var5 = this.KK.ld(var4);
         } else {
            var5 = new UW(var4, this.LH.dN(var2), this.KK, this.EO);
            this.KK.dN(var5);
            this.EO.dN(var5);
         }

         dx var6 = new dx(this.cb, var5, (ED)var3);
         this.cb.dN(var6);
         var5.dN(var6);
         cN var10000 = this.KK;
      }
   }

   private Vi zs() {
      int var1 = this.dN.readInt();
      int var2 = this.dN.readInt();
      dN var3 = this.KK.mS();
      PS[] var4 = new PS[var2];

      for(int var5 = 0; var5 < var2; ++var5) {
         var4[var5] = new PS(Integer.valueOf(this.dN.readInt()), (fv)this.mS());
      }

      return var3.dN(var1, var4);
   }

   private ED mS() {
      this.dN.dN((short)8);
      this.dN.dN((byte)0);
      byte var1 = this.dN.readByte();
      int var2 = this.dN.readInt();
      return (ED)(var1 == 3?this.KK.mS().dN(this.mS.ld(var2)):this.KK.mS().dN(var1, var2, (String)null));
   }

   private Ja OK() {
      int var1 = this.dN.readInt();
      if(var1 < 28) {
         throw new zX("Config size < 28");
      } else {
         boolean var2 = false;
         short var3 = this.dN.readShort();
         short var4 = this.dN.readShort();
         char[] var5 = new char[]{(char)this.dN.readByte(), (char)this.dN.readByte()};
         char[] var6 = new char[]{(char)this.dN.readByte(), (char)this.dN.readByte()};
         byte var7 = this.dN.readByte();
         byte var8 = this.dN.readByte();
         short var9 = this.dN.readShort();
         byte var10 = this.dN.readByte();
         byte var11 = this.dN.readByte();
         byte var12 = this.dN.readByte();
         this.dN.skipBytes(1);
         short var13 = this.dN.readShort();
         short var14 = this.dN.readShort();
         short var15 = this.dN.readShort();
         this.dN.skipBytes(2);
         byte var16 = 0;
         byte var17 = 0;
         short var18 = 0;
         if(var1 >= 32) {
            var16 = this.dN.readByte();
            var17 = this.dN.readByte();
            var18 = this.dN.readShort();
         }

         short var19 = 0;
         short var20 = 0;
         if(var1 >= 36) {
            var19 = this.dN.readShort();
            var20 = this.dN.readShort();
         }

         int var21 = var1 - 36;
         if(var21 > 0) {
            byte[] var22 = new byte[var21];
            this.dN.readFully(var22);
            BigInteger var23 = new BigInteger(1, var22);
            Object[] var10000;
            if(var23.equals(BigInteger.ZERO)) {
               var10000 = new Object[]{Integer.valueOf(36)};
            } else {
               var10000 = new Object[]{Integer.valueOf(36), var23};
               var2 = true;
            }
         }

         return new Ja(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var2);
      }
   }

   private void LH() {
      int var1 = this.PF & -65536;

      for(int var2 = 0; var2 < this.Hw.length; ++var2) {
         if(this.Hw[var2]) {
            if(this.cb == null) {
               break;
            }

            UW var3 = new UW(new tz(var1 | var2), String.format("ARSC_DUMMY_%04x", new Object[]{Integer.valueOf(var2)}), this.KK, this.EO);
            this.KK.dN(var3);
            this.EO.dN(var3);
            MS var4 = new MS(false, (String)null);
            dx var5 = new dx(this.KK.dN(new Ja()), var3, var4);
            cN var10000 = this.KK;
            this.cb.dN(var5);
            var3.dN(var5);
         }
      }

   }

   private aa.lX KK() {
      return this.zs = aa.lX.dN(this.dN);
   }

   private void dN(int var1) {
      if(this.zs.dN != var1) {
         throw new zX(String.format("Invalid chunk type: expected=0x%08x, got=0x%08x", new Object[]{Integer.valueOf(var1), Short.valueOf(this.zs.dN)}));
      }
   }

   private void ld(int var1) {
      this.KK();
      this.dN(var1);
   }

   public static class uK {
      private final cN[] dN;

      public uK(cN[] var1, aa.vd[] var2, LP var3) {
         this.dN = var1;
      }

      public cN[] dN() {
         return this.dN;
      }
   }

   public static class vd {
      public vd(int var1, int var2) {
      }
   }

   public static class lX {
      public final short dN;

      public lX(short var1, int var2) {
         this.dN = var1;
      }

      public static aa.lX dN(hq var0) {
         short var1;
         try {
            var1 = var0.readShort();
         } catch (EOFException var2) {
            return new aa.lX(-1, 0);
         }

         var0.skipBytes(2);
         return new aa.lX(var1, var0.readInt());
      }
   }
}
