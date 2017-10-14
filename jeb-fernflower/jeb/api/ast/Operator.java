package jeb.api.ast;

import jebglobal.kn;

public class Operator {
   public static final Operator ADD;
   public static final Operator SUB;
   public static final Operator MUL;
   public static final Operator DIV;
   public static final Operator REM;
   public static final Operator AND;
   public static final Operator OR;
   public static final Operator XOR;
   public static final Operator SHL;
   public static final Operator SHR;
   public static final Operator USHR;
   public static final Operator NEG;
   public static final Operator NOT;
   public static final Operator LOG_IDENT;
   public static final Operator LOG_NOT;
   public static final Operator LOG_OR;
   public static final Operator LOG_AND;
   public static final Operator INSTANCEOF;
   public static final Operator EQ;
   public static final Operator NE;
   public static final Operator LT;
   public static final Operator GE;
   public static final Operator GT;
   public static final Operator LE;
   public static final Operator CAST_TO_BYTE;
   public static final Operator CAST_TO_CHAR;
   public static final Operator CAST_TO_SHORT;
   public static final Operator CAST_TO_INT;
   public static final Operator CAST_TO_LONG;
   public static final Operator CAST_TO_FLOAT;
   public static final Operator CAST_TO_DOUBLE;
   public static final Operator CAST_TO_BOOLEAN;
   kn object;

   private Operator(kn var1) {
      this.object = var1;
   }

   static Operator build(kn var0) {
      if(var0 == kn.dN) {
         return ADD;
      } else if(var0 == kn.ld) {
         return SUB;
      } else if(var0 == kn.QE) {
         return MUL;
      } else if(var0 == kn.wU) {
         return DIV;
      } else if(var0 == kn.fa) {
         return REM;
      } else if(var0 == kn.zs) {
         return AND;
      } else if(var0 == kn.mS) {
         return OR;
      } else if(var0 == kn.OK) {
         return XOR;
      } else if(var0 == kn.LH) {
         return SHL;
      } else if(var0 == kn.KK) {
         return SHR;
      } else if(var0 == kn.EO) {
         return USHR;
      } else if(var0 == kn.cb) {
         return NEG;
      } else if(var0 == kn.PF) {
         return NOT;
      } else if(var0 == kn.Hw) {
         return LOG_IDENT;
      } else if(var0 == kn.rK) {
         return LOG_NOT;
      } else if(var0 == kn.Ux) {
         return LOG_OR;
      } else if(var0 == kn.ZY) {
         return LOG_AND;
      } else if(var0 == kn.s) {
         return INSTANCEOF;
      } else if(var0 == kn.Hv) {
         return EQ;
      } else if(var0 == kn.VX) {
         return NE;
      } else if(var0 == kn.ci) {
         return LT;
      } else if(var0 == kn.bG) {
         return GE;
      } else if(var0 == kn.BQ) {
         return GT;
      } else if(var0 == kn.Ee) {
         return LE;
      } else if(var0 == kn.De) {
         return CAST_TO_BYTE;
      } else if(var0 == kn.rn) {
         return CAST_TO_CHAR;
      } else if(var0 == kn.LR) {
         return CAST_TO_SHORT;
      } else if(var0 == kn.Nh) {
         return CAST_TO_INT;
      } else if(var0 == kn.XZ) {
         return CAST_TO_LONG;
      } else if(var0 == kn.nA) {
         return CAST_TO_FLOAT;
      } else if(var0 == kn.Ai) {
         return CAST_TO_DOUBLE;
      } else if(var0 == kn.uM) {
         return CAST_TO_BOOLEAN;
      } else if(var0.zs()) {
         return new Operator(var0);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public String toString() {
      return this.object.toString();
   }

   static {
      ADD = new Operator(kn.dN);
      SUB = new Operator(kn.ld);
      MUL = new Operator(kn.QE);
      DIV = new Operator(kn.wU);
      REM = new Operator(kn.fa);
      AND = new Operator(kn.zs);
      OR = new Operator(kn.mS);
      XOR = new Operator(kn.OK);
      SHL = new Operator(kn.LH);
      SHR = new Operator(kn.KK);
      USHR = new Operator(kn.EO);
      NEG = new Operator(kn.cb);
      NOT = new Operator(kn.PF);
      LOG_IDENT = new Operator(kn.Hw);
      LOG_NOT = new Operator(kn.rK);
      LOG_OR = new Operator(kn.Ux);
      LOG_AND = new Operator(kn.ZY);
      INSTANCEOF = new Operator(kn.s);
      EQ = new Operator(kn.Hv);
      NE = new Operator(kn.VX);
      LT = new Operator(kn.ci);
      GE = new Operator(kn.bG);
      GT = new Operator(kn.BQ);
      LE = new Operator(kn.Ee);
      CAST_TO_BYTE = new Operator(kn.De);
      CAST_TO_CHAR = new Operator(kn.rn);
      CAST_TO_SHORT = new Operator(kn.LR);
      CAST_TO_INT = new Operator(kn.Nh);
      CAST_TO_LONG = new Operator(kn.XZ);
      CAST_TO_FLOAT = new Operator(kn.nA);
      CAST_TO_DOUBLE = new Operator(kn.Ai);
      CAST_TO_BOOLEAN = new Operator(kn.uM);
   }
}
