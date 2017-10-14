package jeb.api.dex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.bt;
import jebglobal.nm;

public class DexExceptionItem {
   nm ei;

   DexExceptionItem(nm var1) {
      this.ei = var1;
   }

   public int getTryAddress() {
      return this.ei.dN();
   }

   public int getTrySize() {
      return this.ei.ld();
   }

   public List getHandlers() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.ei.wU().iterator();

      while(var2.hasNext()) {
         bt var3 = (bt)var2.next();
         var1.add(new DexExceptionItem.Handler(var3));
      }

      return var1;
   }

   public static class Handler {
      bt eh;

      Handler(bt var1) {
         this.eh = var1;
      }

      public int getTypeIndex() {
         return this.eh.ld();
      }

      public int getAddress() {
         return this.eh.QE();
      }
   }
}
