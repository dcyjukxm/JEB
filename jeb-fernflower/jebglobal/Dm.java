package jebglobal;

import java.util.HashSet;
import java.util.List;
import jebglobal.TB;
import jebglobal.Vf;
import jebglobal.Xf;
import jebglobal.YK;
import jebglobal.ZF;
import jebglobal.hV;
import jebglobal.tu;
import jebglobal.xy;

public final class Dm extends tu {
   private YK ld;
   private hV QE;

   public Dm(YK var1, hV var2) {
      this.ld = var1;
      this.QE = var2;
      this.dN = hV.dN;
   }

   public HashSet fa() {
      return new HashSet();
   }

   hV dN(int var1) {
      return hV.dN;
   }

   boolean dN(int var1, hV var2) {
      return false;
   }

   public boolean ld() {
      return false;
   }

   public boolean QE() {
      return false;
   }

   int dN(xy var1) {
      return 0;
   }

   int dN(xy var1, tu var2) {
      return 0;
   }

   int dN(xy var1, long var2) {
      return 0;
   }

   void dN(hV var1, hV var2) {
      super.dN(var1, var2);
   }

   public List wU() {
      return ZF.dN(new tu[0]);
   }

   public boolean dN(tu var1, tu var2) {
      return false;
   }

   public String toString() {
      return this.QE == null?String.format("<%s>", new Object[]{this.ld}):String.format("<%s>", new Object[]{this.QE});
   }

   public Xf dN(TB var1) {
      return new Vf(this.QE);
   }
}
