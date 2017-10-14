package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.UB;

public final class Ji extends UB {
   private int wU;
   int dN;
   int ld;
   int QE;

   public Ji(int var1, int var2, int var3) {
      super(5391702);
      this.wU = 0;
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
   }

   private Ji() {
      super(5391702);
   }

   public int LH() {
      return this.dN;
   }

   public int KK() {
      return this.ld;
   }

   public int EO() {
      return this.QE;
   }

   static Ji dN(byte[] var0) {
      Ji var1 = new Ji();
      OZ var2 = new OZ(new ByteArrayInputStream(var0));
      var1.wU = var2.readInt();
      var1.dN = var2.readInt();
      var1.ld = var2.readInt();
      var1.QE = var2.readInt();
      return var1;
   }

   byte[] mS() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         Hk var2 = new Hk(var1);
         var2.writeInt(this.wU);
         var2.writeInt(this.dN);
         var2.writeInt(this.ld);
         var2.writeInt(this.QE);
         var2.dN();
         return var1.toByteArray();
      } catch (IOException var3) {
         return null;
      }
   }
}
