package jebglobal;

import java.util.HashMap;
import jebglobal.Bw;

public final class hV {
   private hV.vd Hw;
   private String rK;
   private int Ux;
   private hV ZY;
   private hV s;
   public static final hV dN;
   public static final hV ld;
   public static final hV QE;
   public static final hV wU;
   public static final hV fa;
   public static final hV zs;
   public static final hV mS;
   public static final hV OK;
   public static final hV LH;
   public static final hV KK;
   public static final hV EO;
   public static final hV cb;
   public static final hV PF;

   private hV(hV var1, int var2, hV var3) {
      this.Hw = hV.vd.PF;
      this.rK = null;
      this.Ux = var2;
      this.ZY = var1;
      this.s = var3;
   }

   private hV(String var1) {
      this.Hw = hV.vd.PF;
      this.rK = var1;
      this.Ux = 0;
      this.ZY = null;
      this.s = null;
   }

   private hV(hV.vd var1) {
      if(var1 == hV.vd.PF) {
         throw new RuntimeException();
      } else {
         this.Hw = var1;
         this.rK = null;
         this.Ux = 0;
         this.ZY = null;
         this.s = null;
      }
   }

   public static boolean dN(String var0) {
      return var0.length() < 3?false:var0.charAt(0) == 76 && var0.charAt(var0.length() - 1) == 59;
   }

   public static String ld(String var0) {
      if(!dN(var0)) {
         throw new RuntimeException();
      } else {
         return var0.substring(1, var0.length() - 1).replace('/', '.');
      }
   }

   public static String QE(String var0) {
      if(!dN(var0)) {
         throw new RuntimeException();
      } else {
         String var1 = var0.substring(1, var0.length() - 1);
         int var2 = var1.lastIndexOf(47);
         return var2 < 0?var0:"L" + var1.substring(var2 + 1) + ";";
      }
   }

   public static String wU(String var0) {
      if(!dN(var0)) {
         throw new RuntimeException();
      } else {
         String var1 = var0.substring(1, var0.length() - 1);
         int var2 = var1.lastIndexOf(47);
         return var2 < 0?"":var1.substring(0, var2).replace('/', '.');
      }
   }

   public String dN() {
      if(!this.mS()) {
         throw new RuntimeException();
      } else {
         return this.rK;
      }
   }

   public int ld() {
      if(!this.OK()) {
         throw new RuntimeException();
      } else {
         return this.Ux;
      }
   }

   public hV QE() {
      if(!this.OK()) {
         throw new RuntimeException();
      } else {
         return this.ZY;
      }
   }

   public hV wU() {
      if(!this.OK()) {
         throw new RuntimeException();
      } else {
         return this.s;
      }
   }

   public boolean fa() {
      return this.Hw != hV.vd.dN && this.Hw != hV.vd.PF && this.Hw != hV.vd.KK && this.Hw != hV.vd.EO;
   }

   public boolean zs() {
      return this.Hw == hV.vd.PF;
   }

   public boolean mS() {
      return this.Hw == hV.vd.PF && !this.OK();
   }

   public boolean OK() {
      return this.Ux >= 1;
   }

   public boolean LH() {
      return this.mS() && this.rK.equals("Ljava/lang/String;");
   }

   public boolean dN(boolean var1) {
      hV.vd var2 = this.Hw;
      if(this.OK()) {
         var2 = this.ZY.Hw;
      }

      switch(hV.SyntheticClass_1.dN[var2.ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
         return true;
      default:
         return false;
      }
   }

   public void ld(boolean var1) {
      if(!this.dN(var1)) {
         throw new RuntimeException();
      }
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public boolean dN(hV var1) {
      return this.Hw == var1.Hw;
   }

   public String KK() {
      StringBuilder var1 = new StringBuilder();
      if(!this.OK()) {
         if(this.rK != null) {
            var1.append(this.rK);
         } else {
            var1.append(ld(this.Hw));
         }
      } else {
         for(int var2 = 0; var2 < this.Ux; ++var2) {
            var1.append("[");
         }

         if(this.ZY.rK != null) {
            var1.append(this.ZY.rK);
         } else {
            var1.append(ld(this.ZY.Hw));
         }
      }

      return var1.toString();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      if(!this.OK()) {
         if(this.rK != null) {
            var1.append(ld(this.rK));
         } else {
            var1.append(this.dN(this.Hw));
         }
      } else {
         if(this.ZY.rK != null) {
            var1.append(ld(this.ZY.rK));
         } else {
            var1.append(this.dN(this.ZY.Hw));
         }

         for(int var2 = 0; var2 < this.Ux; ++var2) {
            var1.append("[]");
         }
      }

      return var1.toString();
   }

   private String dN(hV.vd var1) {
      switch(hV.SyntheticClass_1.dN[var1.ordinal()]) {
      case 1:
         return "void";
      case 2:
         return "boolean";
      case 3:
         return "byte";
      case 4:
         return "char";
      case 5:
         return "short";
      case 6:
         return "int";
      case 7:
         return "long";
      case 8:
         return "float";
      case 9:
         return "double";
      case 10:
      default:
         throw new RuntimeException();
      case 11:
         return "SREG";
      case 12:
         return "DREG";
      case 13:
         return "_int";
      }
   }

   public String dN(String[] var1) {
      if(this.OK() && var1.length <= this.Ux) {
         StringBuilder var2 = new StringBuilder();
         if(this.ZY.rK != null) {
            var2.append(ld(this.ZY.rK));
         } else {
            var2.append(this.dN(this.ZY.Hw));
         }

         String[] var3 = var1;
         int var4 = var1.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            String var6 = var3[var5];
            var2.append(String.format("[%s]", new Object[]{var6}));
         }

         for(int var7 = var1.length; var7 < this.Ux; ++var7) {
            var2.append("[]");
         }

         return var2.toString();
      } else {
         if(this.Ux == -3) {
            System.out.println(Long.toString(790735650846998384L));
         }

         throw new RuntimeException();
      }
   }

   public boolean EO() {
      return this != dN;
   }

   public boolean cb() {
      return this != dN && this != KK && this != EO;
   }

   public boolean PF() {
      return this == QE || this == wU || this == fa || this == zs || this == cb;
   }

   public boolean Hw() {
      return this == QE || this == wU || this == fa || this == zs || this == mS;
   }

   public boolean rK() {
      switch(hV.SyntheticClass_1.dN[this.Hw.ordinal()]) {
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 8:
      case 10:
      case 11:
      case 13:
         return true;
      case 7:
      case 9:
      case 12:
      default:
         return false;
      }
   }

   public boolean Ux() {
      switch(hV.SyntheticClass_1.dN[this.Hw.ordinal()]) {
      case 7:
      case 9:
      case 12:
         return true;
      default:
         return false;
      }
   }

   public boolean ld(hV var1) {
      if(this != dN && var1 != null && var1 != dN) {
         if(this == cb) {
            switch(hV.SyntheticClass_1.dN[var1.Hw.ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 13:
               return true;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
               return false;
            }
         } else if(this == KK) {
            switch(hV.SyntheticClass_1.dN[var1.Hw.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 13:
               return true;
            case 7:
            case 9:
            case 12:
            default:
               return false;
            }
         } else if(this == EO) {
            switch(hV.SyntheticClass_1.dN[var1.Hw.ordinal()]) {
            case 7:
            case 9:
            case 12:
               return true;
            default:
               return false;
            }
         } else {
            return this == PF?var1.zs():this.equals(var1);
         }
      } else {
         throw new RuntimeException();
      }
   }

   public static hV dN(hV var0, hV var1) {
      if(var0.dN(var1)) {
         return var0 == PF?var1:(var1 == PF?var0:var0);
      } else if(var0 == dN) {
         return var1;
      } else if(var1 == dN) {
         return var0;
      } else {
         if(var0 == cb) {
            switch(hV.SyntheticClass_1.dN[var1.Hw.ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
               return var1;
            }
         }

         if(var1 == cb) {
            switch(hV.SyntheticClass_1.dN[var0.Hw.ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
               return var0;
            }
         }

         if(var0 == KK) {
            switch(hV.SyntheticClass_1.dN[var1.Hw.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
               return var1;
            case 7:
            case 9:
            case 11:
            case 12:
            }
         }

         if(var1 == KK) {
            switch(hV.SyntheticClass_1.dN[var0.Hw.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
               return var0;
            case 7:
            case 9:
            case 11:
            case 12:
            }
         }

         if(var0 == EO) {
            switch(hV.SyntheticClass_1.dN[var1.Hw.ordinal()]) {
            case 7:
            case 9:
               return var1;
            }
         }

         if(var1 == EO) {
            switch(hV.SyntheticClass_1.dN[var0.Hw.ordinal()]) {
            case 7:
            case 9:
               return var1;
            }
         }

         throw new RuntimeException();
      }
   }

   public static hV[] dN(Bw var0, hV.uK var1) {
      String[] var2 = var0.ld(false);
      int var3 = 1 + var2.length;
      String[] var4 = new String[var3];
      var4[0] = var0.dN(false);

      for(int var5 = 1; var5 <= var2.length; ++var5) {
         var4[var5] = var2[var5 - 1];
      }

      hV[] var13 = new hV[var3];

      for(int var6 = 0; var6 < var3; ++var6) {
         String var7 = var4[var6];
         byte var8 = 0;
         int var14 = var8 + 1;
         char var9 = var7.charAt(0);

         int var10;
         for(var10 = 0; var9 == 91; var9 = var7.charAt(var14++)) {
            ++var10;
         }

         hV var11 = dN(var9);
         if(var11 == PF) {
            String var12 = var7.substring(var14 - 1);
            var11 = var1.dN(var12);
         }

         if(var10 >= 1) {
            var11 = var1.dN(var11, var10);
         }

         if(var6 >= 1 && var11 == dN) {
            throw new RuntimeException();
         }

         var13[var6] = var11;
      }

      return var13;
   }

   public static hV dN(char var0) {
      switch(var0) {
      case 'B':
         return QE;
      case 'C':
         return wU;
      case 'D':
         return LH;
      case 'E':
      case 'G':
      case 'H':
      case 'K':
      case 'M':
      case 'N':
      case 'O':
      case 'P':
      case 'Q':
      case 'R':
      case 'T':
      case 'U':
      case 'W':
      case 'X':
      case 'Y':
      default:
         throw new RuntimeException();
      case 'F':
         return OK;
      case 'I':
         return zs;
      case 'J':
         return mS;
      case 'L':
         return PF;
      case 'S':
         return fa;
      case 'V':
         return dN;
      case 'Z':
         return ld;
      }
   }

   private static char ld(hV.vd var0) {
      switch(hV.SyntheticClass_1.dN[var0.ordinal()]) {
      case 2:
         return 'Z';
      case 3:
         return 'B';
      case 4:
         return 'C';
      case 5:
         return 'S';
      case 6:
         return 'I';
      case 7:
         return 'J';
      case 8:
         return 'F';
      case 9:
         return 'D';
      default:
         throw new RuntimeException();
      }
   }

   public static hV dN(String var0, hV.uK var1) {
      byte var2 = 0;
      int var7 = var2 + 1;
      char var3 = var0.charAt(0);

      int var4;
      for(var4 = 0; var3 == 91; var3 = var0.charAt(var7++)) {
         ++var4;
      }

      hV var5 = dN(var3);
      if(var5 == dN) {
         throw new RuntimeException();
      } else {
         if(var5 == PF) {
            String var6 = var0.substring(var7 - 1);
            var5 = var1.dN(var6);
         }

         if(var4 >= 1) {
            var5 = var1.dN(var5, var4);
         }

         return var5;
      }
   }

   public static hV dN(hV var0, boolean var1) {
      return !var1 || var0 != QE && var0 != wU && var0 != fa?(!var1 && var0 == zs?cb:var0):cb;
   }

   // $FF: synthetic method
   hV(hV var1, int var2, hV var3, hV.SyntheticClass_1 var4) {
      this(var1, var2, var3);
   }

   // $FF: synthetic method
   hV(String var1, hV.SyntheticClass_1 var2) {
      this(var1);
   }

   static {
      dN = new hV(hV.vd.dN);
      ld = new hV(hV.vd.ld);
      QE = new hV(hV.vd.QE);
      wU = new hV(hV.vd.wU);
      fa = new hV(hV.vd.fa);
      zs = new hV(hV.vd.zs);
      mS = new hV(hV.vd.mS);
      OK = new hV(hV.vd.OK);
      LH = new hV(hV.vd.LH);
      KK = new hV(hV.vd.KK);
      EO = new hV(hV.vd.EO);
      cb = new hV(hV.vd.cb);
      PF = new hV("Lpnf/this/object/does/not/Exist;");
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[hV.vd.values().length];

      static {
         try {
            dN[hV.vd.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var12) {
            ;
         }

         try {
            dN[hV.vd.ld.ordinal()] = 2;
         } catch (NoSuchFieldError var11) {
            ;
         }

         try {
            dN[hV.vd.QE.ordinal()] = 3;
         } catch (NoSuchFieldError var10) {
            ;
         }

         try {
            dN[hV.vd.wU.ordinal()] = 4;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            dN[hV.vd.fa.ordinal()] = 5;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            dN[hV.vd.zs.ordinal()] = 6;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            dN[hV.vd.mS.ordinal()] = 7;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            dN[hV.vd.OK.ordinal()] = 8;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            dN[hV.vd.LH.ordinal()] = 9;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            dN[hV.vd.PF.ordinal()] = 10;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            dN[hV.vd.KK.ordinal()] = 11;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            dN[hV.vd.EO.ordinal()] = 12;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[hV.vd.cb.ordinal()] = 13;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }

   static enum vd {
      dN,
      ld,
      QE,
      wU,
      fa,
      zs,
      mS,
      OK,
      LH,
      KK,
      EO,
      cb,
      PF;
   }

   public static class uK {
      private HashMap dN = new HashMap();
      private HashMap ld = new HashMap();

      public hV dN(hV var1, int var2) {
         if(var1 == hV.PF) {
            throw new RuntimeException();
         } else if(var1.OK()) {
            throw new RuntimeException();
         } else if(var2 <= 0) {
            throw new RuntimeException();
         } else {
            hV var3;
            if(var2 == 1) {
               var3 = var1;
            } else {
               var3 = this.dN(var1, var2 - 1);
            }

            HashMap var4 = (HashMap)this.ld.get(var1);
            if(var4 == null) {
               var4 = new HashMap();
               this.ld.put(var1, var4);
            }

            hV var5 = (hV)var4.get(Integer.valueOf(var2));
            if(var5 == null) {
               var5 = new hV(var1, var2, var3, (hV.SyntheticClass_1)null);
               var4.put(Integer.valueOf(var2), var5);
            }

            return var5;
         }
      }

      public hV dN(String var1) {
         if(!hV.dN(var1)) {
            throw new RuntimeException();
         } else if(var1.equals("Lpnf/this/object/does/not/Exist;")) {
            throw new RuntimeException();
         } else {
            hV var2 = (hV)this.dN.get(var1);
            if(var2 == null) {
               var2 = new hV(var1, (hV.SyntheticClass_1)null);
               this.dN.put(var1, var2);
            }

            return var2;
         }
      }
   }
}
