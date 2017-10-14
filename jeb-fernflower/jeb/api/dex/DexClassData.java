package jeb.api.dex;

import java.util.Iterator;
import java.util.List;
import jeb.api.dex.DexFieldData;
import jeb.api.dex.DexMethodData;
import jebglobal.AV;
import jebglobal.Uk;
import jebglobal.XV;

public class DexClassData {
   private Uk cd;

   DexClassData(Uk var1) {
      this.cd = var1;
   }

   public DexFieldData[] getStaticFields() {
      List var1 = this.cd.dN();
      DexFieldData[] var2 = new DexFieldData[var1.size()];
      int var3 = 0;

      XV var5;
      for(Iterator var4 = var1.iterator(); var4.hasNext(); var2[var3++] = new DexFieldData(var5)) {
         var5 = (XV)var4.next();
      }

      return var2;
   }

   public DexFieldData[] getInstanceFields() {
      List var1 = this.cd.ld();
      DexFieldData[] var2 = new DexFieldData[var1.size()];
      int var3 = 0;

      XV var5;
      for(Iterator var4 = var1.iterator(); var4.hasNext(); var2[var3++] = new DexFieldData(var5)) {
         var5 = (XV)var4.next();
      }

      return var2;
   }

   public DexMethodData[] getDirectMethods() {
      List var1 = this.cd.wU();
      DexMethodData[] var2 = new DexMethodData[var1.size()];
      int var3 = 0;

      AV var5;
      for(Iterator var4 = var1.iterator(); var4.hasNext(); var2[var3++] = new DexMethodData(var5)) {
         var5 = (AV)var4.next();
      }

      return var2;
   }

   public DexMethodData[] getVirtualMethods() {
      List var1 = this.cd.fa();
      DexMethodData[] var2 = new DexMethodData[var1.size()];
      int var3 = 0;

      AV var5;
      for(Iterator var4 = var1.iterator(); var4.hasNext(); var2[var3++] = new DexMethodData(var5)) {
         var5 = (AV)var4.next();
      }

      return var2;
   }
}
