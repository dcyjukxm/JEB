package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.UB;

public final class Bb extends UB {
   private int QE;
   int dN;
   byte[] ld;

   public Bb(int var1, byte[] var2) {
      super(4932181);
      if(var2 == null) {
         throw new IllegalArgumentException();
      } else {
         this.QE = 0;
         this.dN = var1;
         this.ld = var2;
      }
   }

   private Bb() {
      super(4932181);
   }

   static Bb dN(byte[] var0) {
      Bb var1 = new Bb();
      OZ var2 = new OZ(new ByteArrayInputStream(var0));
      var1.QE = var2.readInt();
      var1.dN = var2.readInt();
      var1.ld = UB.QE(var2);
      return var1;
   }

   byte[] mS() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         Hk var2 = new Hk(var1);
         var2.writeInt(this.QE);
         var2.writeInt(this.dN);
         UB.ld(var2, this.ld);
         var2.dN();
         return var1.toByteArray();
      } catch (IOException var3) {
         return null;
      }
   }
}
