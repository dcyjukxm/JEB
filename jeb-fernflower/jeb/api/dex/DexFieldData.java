package jeb.api.dex;

import jebglobal.XV;

public class DexFieldData {
   private XV fd;

   DexFieldData(XV var1) {
      this.fd = var1;
   }

   public int getFieldIndex() {
      return this.fd.dN();
   }

   public int getAccessFlags() {
      return this.fd.ld();
   }

   public int getUserFlags() {
      return this.fd.wU();
   }

   public void setUserFlags(int var1) {
      this.fd.dN(var1);
   }
}
