package jeb.api.ast;

import jeb.api.JebInstance;
import jeb.api.ast.IExpression;
import jeb.api.ast.NonStatement;
import jebglobal.OX;
import jebglobal.Yx;
import jebglobal.hV;

public class Constant extends NonStatement implements IExpression {
   OX object;

   Constant(OX var1) {
      super(var1);
      this.object = var1;
   }

   public String getType() {
      hV var1 = this.object.ld();
      return var1 == null?null:var1.KK();
   }

   public boolean isNull() {
      return this.object.ld() == null;
   }

   public boolean isString() {
      hV var1 = this.object.ld();
      return var1 != null && var1.KK().equals("Ljava/lang/String;");
   }

   public boolean getBoolean() {
      if(this.object.ld() != hV.ld) {
         throw new IllegalStateException();
      } else {
         return this.object.QE();
      }
   }

   public byte getByte() {
      if(this.object.ld() != hV.QE) {
         throw new IllegalStateException();
      } else {
         return this.object.fa();
      }
   }

   public char getChar() {
      if(this.object.ld() != hV.wU) {
         throw new IllegalStateException();
      } else {
         return this.object.zs();
      }
   }

   public short getShort() {
      if(this.object.ld() != hV.fa) {
         throw new IllegalStateException();
      } else {
         return this.object.mS();
      }
   }

   public int getInt() {
      if(this.object.ld() != hV.zs) {
         throw new IllegalStateException();
      } else {
         return this.object.OK();
      }
   }

   public long getLong() {
      if(this.object.ld() != hV.mS) {
         throw new IllegalStateException();
      } else {
         return this.object.LH();
      }
   }

   public float getFloat() {
      if(this.object.ld() != hV.OK) {
         throw new IllegalStateException();
      } else {
         return this.object.KK();
      }
   }

   public double getDouble() {
      if(this.object.ld() != hV.LH) {
         throw new IllegalStateException();
      } else {
         return this.object.EO();
      }
   }

   public String getString() {
      if(!this.object.ld().KK().equals("Ljava/lang/String;")) {
         throw new IllegalStateException();
      } else {
         return this.object.cb();
      }
   }

   public boolean isTrue() {
      return this.object.Hw();
   }

   public boolean isFalse() {
      return this.object.rK();
   }

   public boolean isZero() {
      return this.object.Ux();
   }

   public boolean isOne() {
      return this.object.ZY();
   }

   public boolean isMinusOne() {
      return this.object.s();
   }

   public boolean isPositive() {
      return this.object.Hv();
   }

   public boolean isNegative() {
      return this.object.VX();
   }

   public static class Builder {
      OX.vd cf;

      public Builder(JebInstance var1) {
         this.cf = ((Yx)var1.getGO()).wU();
      }

      public Constant buildNull() {
         return new Constant(this.cf.dN());
      }

      public Constant buildBoolean(boolean var1) {
         return new Constant(this.cf.dN(var1));
      }

      public Constant buildByte(byte var1) {
         return new Constant(this.cf.dN(var1));
      }

      public Constant buildChar(char var1) {
         return new Constant(this.cf.dN(var1));
      }

      public Constant buildShort(short var1) {
         return new Constant(this.cf.dN(var1));
      }

      public Constant buildInt(int var1) {
         return new Constant(this.cf.dN(var1));
      }

      public Constant buildLong(long var1) {
         return new Constant(this.cf.dN(var1));
      }

      public Constant buildFloat(float var1) {
         return new Constant(this.cf.dN(var1));
      }

      public Constant buildDouble(double var1) {
         return new Constant(this.cf.dN(var1));
      }

      public Constant buildString(String var1) {
         return new Constant(this.cf.dN(var1));
      }

      public Constant buildNegativeValue(Constant var1) {
         return new Constant(var1.object.dN(this.cf));
      }
   }
}
