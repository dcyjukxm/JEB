package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.UB;

public final class OD extends UB {
   private int dN;
   private int ld;
   private int QE;
   private int wU;
   private int fa;
   private String zs;
   private byte[] mS;

   public OD(OD.vd var1, int var2, int var3, String var4, byte[] var5, int var6) {
      super(5524803);
      this.dN = var1.ordinal() & 255;
      this.ld = UB.OK();
      this.QE = var6;
      this.wU = var2;
      this.fa = var3;
      if(var4 != null && var4.length() > 0) {
         this.dN |= 256;
         this.zs = var4;
      }

      if(var5 != null && var5.length > 0) {
         this.dN |= 512;
         this.mS = var5;
      }

   }

   private OD() {
      super(5524803);
   }

   public OD.vd LH() {
      return OD.vd.values()[this.dN & 255];
   }

   public int KK() {
      return this.wU;
   }

   public int EO() {
      return this.fa;
   }

   public OD.uK cb() {
      return new OD.uK(this.zs, this.mS);
   }

   public String PF() {
      return this.zs;
   }

   public byte[] Hw() {
      return this.mS;
   }

   void dN(String var1, int var2) {
      if(var1 != null && var1.length() > 0) {
         this.dN |= 256;
         this.zs = var1;
      } else {
         this.dN &= -257;
         this.zs = null;
      }

      this.ld = UB.OK();
      this.QE = var2;
   }

   void dN(byte[] var1, int var2) {
      if(var1 != null && var1.length > 0) {
         this.dN |= 512;
         this.mS = var1;
      } else {
         this.dN &= -513;
         this.mS = null;
      }

      this.ld = UB.OK();
      this.QE = var2;
   }

   static OD dN(byte[] var0) {
      OD var1 = new OD();
      OZ var2 = new OZ(new ByteArrayInputStream(var0));
      var1.dN = var2.readInt();
      var1.ld = var2.readInt();
      var1.QE = var2.readInt();
      var1.wU = var2.readInt();
      var1.fa = var2.readInt();
      var1.zs = (var1.dN & 256) != 0?UB.wU(var2):null;
      var1.mS = (var1.dN & 512) != 0?UB.ld(var2):null;
      return var1;
   }

   byte[] mS() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         Hk var2 = new Hk(var1);
         var2.writeInt(this.dN);
         var2.writeInt(this.ld);
         var2.writeInt(this.QE);
         var2.writeInt(this.wU);
         var2.writeInt(this.fa);
         if((this.dN & 256) != 0) {
            UB.dN(var2, this.zs);
         }

         if((this.dN & 512) != 0) {
            UB.dN(var2, this.mS);
         }

         var2.dN();
         return var1.toByteArray();
      } catch (IOException var3) {
         return null;
      }
   }

   public static class uK {
      public String dN;
      public byte[] ld;

      public uK(String var1, byte[] var2) {
         this.dN = var1;
         this.ld = var2;
      }

      public String dN() {
         return this.dN;
      }

      public byte[] ld() {
         return this.ld;
      }
   }

   public static enum vd {
      dN,
      ld,
      QE,
      wU,
      fa;
   }
}
