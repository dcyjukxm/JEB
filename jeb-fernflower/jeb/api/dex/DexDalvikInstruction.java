package jeb.api.dex;

public class DexDalvikInstruction {
   public static final int TYPE_REG = 0;
   public static final int TYPE_IMM = 1;
   public static final int TYPE_IDX = 2;
   public static final int TYPE_BRA = 3;
   public static final int TYPE_RGR = 4;
   private int address;
   private byte[] code;
   private String mnemonic;
   private DexDalvikInstruction.Parameter[] params;
   private DexDalvikInstruction.SwitchData switchdata;
   private DexDalvikInstruction.ArrayData arraydata;

   DexDalvikInstruction(int var1, byte[] var2, String var3, DexDalvikInstruction.Parameter[] var4, DexDalvikInstruction.SwitchData var5, DexDalvikInstruction.ArrayData var6) {
      this.address = var1;
      this.code = var2;
      this.mnemonic = var3;
      this.params = var4;
      this.switchdata = var5;
      this.arraydata = var6;
   }

   public int getOffset() {
      return this.address;
   }

   public int getSize() {
      return this.code.length;
   }

   public String getMnemonic() {
      return this.mnemonic;
   }

   public byte[] getCode() {
      return this.code;
   }

   public DexDalvikInstruction.Parameter[] getParameters() {
      return this.params;
   }

   public DexDalvikInstruction.SwitchData getSwitchData() {
      return this.switchdata;
   }

   public DexDalvikInstruction.ArrayData getArrayData() {
      return this.arraydata;
   }

   public static class ArrayData {
      private int address;
      private byte[][] elements;

      ArrayData(int var1, byte[][] var2) {
         this.address = var1;
         this.elements = var2;
      }

      public int getOffset() {
         return this.address;
      }

      public byte[][] getElements() {
         return this.elements;
      }
   }

   public static class SwitchData {
      private int address;
      private DexDalvikInstruction.SwitchData.KeyTarget[] elements;

      SwitchData(int var1, DexDalvikInstruction.SwitchData.KeyTarget[] var2) {
         this.address = var1;
         this.elements = var2;
      }

      public int getOffset() {
         return this.address;
      }

      public DexDalvikInstruction.SwitchData.KeyTarget[] getElements() {
         return this.elements;
      }

      public static class KeyTarget {
         private int key;
         private int target;

         KeyTarget(int var1, int var2) {
            this.key = var1;
            this.target = var2;
         }

         public int getKey() {
            return this.key;
         }

         public int getTarget() {
            return this.target;
         }
      }
   }

   public static class Parameter {
      private int type;
      private long value;

      Parameter(int var1, long var2) {
         this.type = var1;
         this.value = var2;
      }

      public int getType() {
         return this.type;
      }

      public long getValue() {
         return this.value;
      }
   }
}
