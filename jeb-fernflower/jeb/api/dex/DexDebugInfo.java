package jeb.api.dex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jebglobal.vD;

public class DexDebugInfo {
   vD di;

   DexDebugInfo(vD var1) {
      this.di = var1;
   }

   public int[] getParameterNameIndexes() {
      int[] var1 = this.di.dN();
      return var1 == null?null:Arrays.copyOf(var1, var1.length);
   }

   public DexDebugInfo.LineInfo getLineInfo(int var1) {
      vD.uK var2 = this.di.dN(var1 / 2);
      return var2 == null?null:new DexDebugInfo.LineInfo(var2);
   }

   public static class LocalVar {
      vD.vd var;

      LocalVar(vD.vd var1) {
         this.var = var1;
      }

      public int getAddress() {
         return this.var.dN() * 2;
      }

      public int getRegister() {
         return this.var.ld();
      }

      public int getNameIndex() {
         return this.var.QE();
      }

      public int getTypeIndex() {
         return this.var.wU();
      }

      public int getSignatureIndex() {
         return this.var.fa();
      }
   }

   public static class LineInfo {
      vD.uK li;

      LineInfo(vD.uK var1) {
         this.li = var1;
      }

      public int getLine() {
         return this.li.dN;
      }

      public List getVariables() {
         ArrayList var1 = new ArrayList();
         if(this.li.ld != null) {
            Iterator var2 = this.li.ld.iterator();

            while(var2.hasNext()) {
               vD.vd var3 = (vD.vd)var2.next();
               var1.add(new DexDebugInfo.LocalVar(var3));
            }
         }

         return var1;
      }

      public boolean isPrologueEnd() {
         return this.li.QE;
      }

      public boolean isEpilogueBegin() {
         return this.li.wU;
      }

      public int getSourceIndex() {
         return this.li.fa;
      }
   }
}
