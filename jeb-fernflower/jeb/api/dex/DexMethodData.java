package jeb.api.dex;

import jeb.api.dex.DexCodeItem;
import jebglobal.AV;
import jebglobal.OM;

public class DexMethodData {
   private AV md;

   DexMethodData(AV var1) {
      this.md = var1;
   }

   public int getMethodIndex() {
      return this.md.ld();
   }

   public int getAccessFlags() {
      return this.md.QE();
   }

   public DexCodeItem getCodeItem() {
      OM var1 = this.md.wU();
      return var1 == null?null:new DexCodeItem(var1);
   }

   public int getUserFlags() {
      return this.md.KK();
   }

   public void setUserFlags(int var1) {
      this.md.dN(var1);
   }
}
