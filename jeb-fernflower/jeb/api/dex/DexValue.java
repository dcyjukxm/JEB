package jeb.api.dex;

import java.util.ArrayList;
import java.util.List;
import jeb.api.dex.DexAnnotation;
import jebglobal.ub;

public class DexValue {
   public static final int VALUE_BYTE = 0;
   public static final int VALUE_SHORT = 2;
   public static final int VALUE_CHAR = 3;
   public static final int VALUE_INT = 4;
   public static final int VALUE_LONG = 6;
   public static final int VALUE_FLOAT = 16;
   public static final int VALUE_DOUBLE = 17;
   public static final int VALUE_STRING = 23;
   public static final int VALUE_TYPE = 24;
   public static final int VALUE_FIELD = 25;
   public static final int VALUE_METHOD = 26;
   public static final int VALUE_ENUM = 27;
   public static final int VALUE_ARRAY = 28;
   public static final int VALUE_ANNOTATION = 29;
   public static final int VALUE_NULL = 30;
   public static final int VALUE_BOOLEAN = 31;
   ub v;

   DexValue(ub var1) {
      this.v = var1;
   }

   public int getType() {
      return this.v.dN();
   }

   public boolean isNull() {
      return this.v.ld();
   }

   public byte getByte() {
      return this.v.QE();
   }

   public short getShort() {
      return this.v.wU();
   }

   public char getChar() {
      return this.v.fa();
   }

   public int getInt() {
      return this.v.zs();
   }

   public long getLong() {
      return this.v.mS();
   }

   public float getFloat() {
      return this.v.OK();
   }

   public double getDouble() {
      return this.v.LH();
   }

   public int getStringIndex() {
      return this.v.KK();
   }

   public int getTypeIndex() {
      return this.v.EO();
   }

   public int getFieldIndex() {
      return this.v.cb();
   }

   public int getMethodIndex() {
      return this.v.PF();
   }

   public int getEnumIndex() {
      return this.v.Hw();
   }

   public List getArray() {
      ArrayList var1 = new ArrayList();
      ub[] var2 = this.v.rK();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         ub var5 = var2[var4];
         var1.add(new DexValue(var5));
      }

      return var1;
   }

   public DexAnnotation getAnnotation() {
      return new DexAnnotation(this.v.Ux());
   }

   public boolean getBoolean() {
      return this.v.ZY();
   }
}
