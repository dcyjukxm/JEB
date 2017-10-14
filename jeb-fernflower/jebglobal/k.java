package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jebglobal.Hk;
import jebglobal.OZ;
import jebglobal.TM;
import jebglobal.UB;

public final class k extends UB {
   private int dN;
   private String ld;
   private byte[] QE;
   private byte[] wU;
   private byte[] fa;
   private byte[] zs;

   public k(String var1, byte[] var2, boolean var3) {
      super(4606278);
      if(var1 != null && var2 != null) {
         this.dN = 0;
         if(var3) {
            this.dN |= 1;
         }

         this.ld = var1;
         this.QE = TM.ld(var2);
         this.wU = TM.QE(var2);
         this.fa = TM.wU(var2);
         this.zs = var3?(byte[])var2.clone():null;
      } else {
         throw new IllegalArgumentException();
      }
   }

   private k() {
      super(4606278);
   }

   public String LH() {
      return this.ld;
   }

   public byte[] KK() {
      return this.QE;
   }

   public byte[] EO() {
      return this.wU;
   }

   public byte[] cb() {
      return this.fa;
   }

   static k dN(byte[] var0) {
      k var1 = new k();
      OZ var2 = new OZ(new ByteArrayInputStream(var0));
      var1.dN = var2.readInt();
      var1.ld = UB.wU(var2);
      var1.QE = new byte[16];
      var2.readFully(var1.QE);
      var1.wU = new byte[20];
      var2.readFully(var1.wU);
      var1.fa = new byte[32];
      var2.readFully(var1.fa);
      var1.zs = null;
      if((var1.dN & 1) != 0) {
         var1.zs = UB.QE(var2);
      }

      return var1;
   }

   byte[] mS() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         Hk var2 = new Hk(var1);
         var2.writeInt(this.dN);
         UB.dN(var2, this.ld);
         var2.write(this.QE);
         var2.write(this.wU);
         var2.write(this.fa);
         if((this.dN & 1) != 0) {
            UB.ld(var2, this.zs);
         }

         var2.dN();
         return var1.toByteArray();
      } catch (IOException var3) {
         return null;
      }
   }
}
