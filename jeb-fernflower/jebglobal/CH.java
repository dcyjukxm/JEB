package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.UB;

public final class CH extends UB {
   private int QE;
   String dN;
   byte[] ld;

   public CH(String var1, byte[] var2) {
      super(4541510);
      if(var1 != null && var2 != null) {
         this.QE = 0;
         this.dN = var1;
         this.ld = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   private CH() {
      super(4541510);
   }

   static CH dN(byte[] var0) {
      CH var1 = new CH();
      OZ var2 = new OZ(new ByteArrayInputStream(var0));
      var1.QE = var2.readInt();
      var1.dN = UB.wU(var2);
      var1.ld = UB.QE(var2);
      return var1;
   }

   byte[] mS() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         Hk var2 = new Hk(var1);
         var2.writeInt(this.QE);
         UB.dN(var2, this.dN);
         UB.ld(var2, this.ld);
         var2.dN();
         return var1.toByteArray();
      } catch (IOException var3) {
         return null;
      }
   }
}
