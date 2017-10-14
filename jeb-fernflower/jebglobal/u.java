package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.UB;

public final class u extends UB {
   private int dN;
   private int ld;
   private int QE;
   private int wU;
   private int fa;
   private int zs;
   private String mS;

   public u(u.uK var1, int var2, String var3, int var4, int var5, int var6) {
      super(5066313);
      this.dN = 256 | var1.ordinal() & 255;
      this.ld = UB.OK();
      this.QE = var6;
      this.wU = var2;
      this.fa = var4;
      this.zs = var5;
      this.mS = var3;
   }

   private u() {
      super(5066313);
   }

   public boolean LH() {
      return (this.dN & 256) != 0;
   }

   public u.uK KK() {
      return u.uK.values()[this.dN & 255];
   }

   public int EO() {
      return this.wU;
   }

   public int cb() {
      return this.fa;
   }

   public int PF() {
      return this.zs;
   }

   public String Hw() {
      return this.mS;
   }

   void dN(String var1, int var2) {
      this.ld = UB.OK();
      this.mS = var1;
      this.QE = var2;
   }

   void QE(boolean var1) {
      if(var1) {
         this.dN |= 256;
      } else {
         this.dN &= -257;
      }

   }

   static u dN(byte[] var0) {
      u var1 = new u();
      OZ var2 = new OZ(new ByteArrayInputStream(var0));
      var1.dN = var2.readInt();
      var1.ld = var2.readInt();
      var1.QE = var2.readInt();
      var1.wU = var2.readInt();
      var1.fa = var2.readInt();
      var1.zs = var2.readInt();
      var1.mS = UB.wU(var2);
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
         var2.writeInt(this.zs);
         UB.dN(var2, this.mS);
         var2.dN();
         return var1.toByteArray();
      } catch (IOException var3) {
         return null;
      }
   }

   public static enum uK {
      dN,
      ld,
      QE,
      wU,
      fa;
   }
}
