package jeb.api.dex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jeb.api.dex.DexDalvikInstruction;
import jeb.api.dex.DexDebugInfo;
import jeb.api.dex.DexExceptionItem;
import jebglobal.OM;
import jebglobal.TM;
import jebglobal.Wu;
import jebglobal.nm;
import jebglobal.vD;

public class DexCodeItem {
   private OM code;

   DexCodeItem(OM var1) {
      this.code = var1;
   }

   public int getRegisterCount() {
      return this.code.zs();
   }

   public int getInputArgumentCount() {
      return this.code.mS();
   }

   public int getOutputArgumentCount() {
      return this.code.OK();
   }

   public List getExceptionItems() {
      ArrayList var1 = new ArrayList();
      nm[] var2 = this.code.LH();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         nm var5 = var2[var4];
         var1.add(new DexExceptionItem(var5));
      }

      return var1;
   }

   public DexDebugInfo getDebugInfo() {
      vD var1 = this.code.KK();
      return var1 == null?null:new DexDebugInfo(var1);
   }

   public int getInstructionsOffset() {
      return this.code.ld();
   }

   public int getInstructionsSize() {
      return this.code.QE();
   }

   public int getInstructionsCount() {
      return this.code.wU().size();
   }

   public List getInstructions() {
      List var1 = this.code.wU();
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList(var1.size());

         Wu var4;
         DexDalvikInstruction.Parameter[] var6;
         DexDalvikInstruction.SwitchData var15;
         DexDalvikInstruction.ArrayData var16;
         for(Iterator var3 = var1.iterator(); var3.hasNext(); var2.add(new DexDalvikInstruction(var4.dN(), Arrays.copyOf(var4.zs(), var4.zs().length), var4.wU(), var6, var15, var16))) {
            var4 = (Wu)var3.next();
            Wu.vd[] var5 = var4.mS();
            var6 = new DexDalvikInstruction.Parameter[var5.length];

            for(int var7 = 0; var7 < var6.length; ++var7) {
               var6[var7] = new DexDalvikInstruction.Parameter(var5[var7].dN(), var5[var7].ld());
            }

            var15 = null;
            if(var4.KK()) {
               Wu.lX.uK[] var8 = var4.LH().ld();
               DexDalvikInstruction.SwitchData.KeyTarget[] var9 = new DexDalvikInstruction.SwitchData.KeyTarget[var8.length];
               int var10 = 0;
               Wu.lX.uK[] var11 = var8;
               int var12 = var8.length;

               for(int var13 = 0; var13 < var12; ++var13) {
                  Wu.lX.uK var14 = var11[var13];
                  var9[var10++] = new DexDalvikInstruction.SwitchData.KeyTarget(var14.dN(), var14.ld());
               }

               var15 = new DexDalvikInstruction.SwitchData(var4.LH().dN(), var9);
            }

            var16 = null;
            if(var4.EO()) {
               var16 = new DexDalvikInstruction.ArrayData(var4.PF().dN(), TM.dN(var4.PF().ld()));
            }
         }

         return var2;
      }
   }
}
