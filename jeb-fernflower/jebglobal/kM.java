package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.UB;

public final class kM extends UB {
   private int ld;
   long dN;
   private String QE;
   private String wU;

   public kM(long var1, String var3, String var4) {
      super(5526849);
      if(var3 != null && var4 != null) {
         this.ld = 0;
         this.dN = var1;
         this.QE = var3;
         this.wU = var4;
      } else {
         throw new IllegalArgumentException();
      }
   }

   private kM() {
      super(5526849);
   }

   public String LH() {
      return this.QE;
   }

   public String KK() {
      return this.wU;
   }

   static kM dN(byte[] var0) {
      kM var1 = new kM();
      OZ var2 = new OZ(new ByteArrayInputStream(var0));
      var1.ld = var2.readInt();
      var1.dN = var2.readLong();
      var1.QE = UB.wU(var2);
      var1.wU = UB.wU(var2);
      return var1;
   }

   byte[] mS() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         Hk var2 = new Hk(var1);
         var2.writeInt(this.ld);
         var2.writeLong(this.dN);
         UB.dN(var2, this.QE);
         UB.dN(var2, this.wU);
         var2.dN();
         return var1.toByteArray();
      } catch (IOException var3) {
         return null;
      }
   }
}
