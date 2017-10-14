package jebglobal;

import java.util.HashSet;
import java.util.List;
import jebglobal.OX;
import jebglobal.TB;
import jebglobal.Xf;
import jebglobal.YK;
import jebglobal.ZF;
import jebglobal.hV;
import jebglobal.tu;
import jebglobal.xy;

public final class ie extends tu {
   private long ld;
   private YK QE;

   public ie(long var1, hV var3) {
      this.dN = var3;
      this.ld = var1;
      this.QE = null;
      if(!var3.EO()) {
         throw new RuntimeException();
      } else if(var3.zs() && var1 != 0L) {
         throw new RuntimeException();
      }
   }

   public ie(YK var1, hV var2) {
      this.dN = var2;
      this.ld = 0L;
      this.QE = var1;
      if(!this.dN.mS() || !this.dN.dN().equals("Ljava/lang/String;")) {
         throw new RuntimeException();
      }
   }

   public static boolean ld(hV var0) {
      return var0.EO() && !var0.zs();
   }

   public long zs() {
      return this.ld;
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
      return this.QE != null?String.format("#%X", new Object[]{Integer.valueOf(this.QE.dN())}):String.format("%X<%s>", new Object[]{Long.valueOf(this.ld), this.dN});
   }

   public Xf dN(TB var1) {
      OX var2;
      if(this.QE != null) {
         String var3 = var1.dN.dN(this.QE.dN());
         var2 = var1.zs.dN(var3);
      } else if(this.dN == hV.ld) {
         boolean var5 = (this.ld & 1L) != 0L;
         var2 = var1.zs.dN(var5);
      } else if(this.dN == hV.QE) {
         byte var6 = (byte)((int)this.ld);
         var2 = var1.zs.dN(var6);
      } else if(this.dN == hV.wU) {
         char var7 = (char)((int)this.ld);
         var2 = var1.zs.dN(var7);
      } else if(this.dN == hV.fa) {
         short var8 = (short)((int)this.ld);
         var2 = var1.zs.dN(var8);
      } else if(this.dN != hV.zs && (this.dN != hV.cb || !var1.QE)) {
         if(this.dN == hV.mS) {
            long var10 = this.ld;
            var2 = var1.zs.dN(var10);
         } else if(this.dN == hV.OK) {
            float var11 = Float.intBitsToFloat((int)this.ld);
            var2 = var1.zs.dN(var11);
         } else if(this.dN == hV.LH) {
            double var12 = Double.longBitsToDouble(this.ld);
            var2 = var1.zs.dN(var12);
         } else {
            var2 = var1.zs.dN();
         }
      } else {
         int var9 = (int)this.ld;
         var2 = var1.zs.dN(var9);
      }

      return var2;
   }
}
