package jebglobal;

public final class Ja {
   private short ld;
   private short QE;
   private char[] wU;
   private char[] fa;
   private byte zs;
   private byte mS;
   private short OK;
   private byte LH;
   private byte KK;
   private byte EO;
   private short cb;
   private short PF;
   private short Hw;
   private byte rK;
   private byte Ux;
   private short ZY;
   private short s;
   private short Hv;
   public final boolean dN;
   private final String VX;
   private static int ci = 0;

   public Ja() {
      this.ld = 0;
      this.QE = 0;
      this.wU = new char[]{'\u0000', '\u0000'};
      this.fa = new char[]{'\u0000', '\u0000'};
      this.zs = 0;
      this.mS = 0;
      this.OK = 0;
      this.LH = 0;
      this.KK = 0;
      this.EO = 0;
      this.cb = 0;
      this.PF = 0;
      this.Hw = 0;
      this.rK = 0;
      this.Ux = 0;
      this.ZY = 0;
      this.s = 0;
      this.Hv = 0;
      this.dN = false;
      this.VX = "";
   }

   public Ja(short var1, short var2, char[] var3, char[] var4, byte var5, byte var6, short var7, byte var8, byte var9, byte var10, short var11, short var12, short var13, byte var14, byte var15, short var16, short var17, short var18, boolean var19) {
      Object[] var10000;
      if(var5 < 0 || var5 > 3) {
         var10000 = new Object[]{Byte.valueOf(var5)};
         var5 = 0;
         var19 = true;
      }

      if(var6 < 0 || var6 > 3) {
         var10000 = new Object[]{Byte.valueOf(var6)};
         var6 = 0;
         var19 = true;
      }

      if(var7 < -1) {
         var10000 = new Object[]{Short.valueOf(var7)};
         var7 = 0;
         var19 = true;
      }

      if(var8 < 0 || var8 > 3) {
         var10000 = new Object[]{Byte.valueOf(var8)};
         var8 = 0;
         var19 = true;
      }

      if(var9 < 0 || var9 > 4) {
         var10000 = new Object[]{Byte.valueOf(var9)};
         var9 = 0;
         var19 = true;
      }

      this.ld = var1;
      this.QE = var2;
      this.wU = var3;
      this.fa = var4;
      this.zs = var5;
      this.mS = var6;
      this.OK = var7;
      this.LH = var8;
      this.KK = var9;
      this.EO = var10;
      this.cb = var11;
      this.PF = var12;
      this.Hw = var13;
      this.rK = var14;
      this.Ux = var15;
      this.ZY = var16;
      this.s = var17;
      this.Hv = var18;
      this.dN = var19;
      this.VX = this.ld();
   }

   public String dN() {
      return this.VX;
   }

   private String ld() {
      StringBuilder var1 = new StringBuilder();
      if(this.ld != 0) {
         var1.append("-mcc").append(String.format("%03d", new Object[]{Short.valueOf(this.ld)}));
         if(this.QE != 0) {
            var1.append("-mnc").append(this.QE);
         }
      }

      if(this.wU[0] != 0) {
         var1.append('-').append(this.wU);
         if(this.fa[0] != 0) {
            var1.append("-r").append(this.fa);
         }
      }

      if(this.ZY != 0) {
         var1.append("-sw").append(this.ZY).append("dp");
      }

      if(this.s != 0) {
         var1.append("-w").append(this.s).append("dp");
      }

      if(this.Hv != 0) {
         var1.append("-h").append(this.Hv).append("dp");
      }

      switch(this.rK & 15) {
      case 1:
         var1.append("-small");
         break;
      case 2:
         var1.append("-normal");
         break;
      case 3:
         var1.append("-large");
         break;
      case 4:
         var1.append("-xlarge");
      }

      switch(this.rK & 48) {
      case 16:
         var1.append("-notlong");
         break;
      case 32:
         var1.append("-long");
      }

      switch(this.zs) {
      case 1:
         var1.append("-port");
         break;
      case 2:
         var1.append("-land");
         break;
      case 3:
         var1.append("-square");
      }

      switch(this.Ux & 15) {
      case 2:
         var1.append("-desk");
         break;
      case 3:
         var1.append("-car");
         break;
      case 4:
         var1.append("-television");
      }

      switch(this.Ux & 48) {
      case 16:
         var1.append("-notnight");
         break;
      case 32:
         var1.append("-night");
      }

      switch(this.OK) {
      case -1:
         var1.append("-nodpi");
      case 0:
         break;
      case 120:
         var1.append("-ldpi");
         break;
      case 160:
         var1.append("-mdpi");
         break;
      case 240:
         var1.append("-hdpi");
         break;
      case 320:
         var1.append("-xhdpi");
         break;
      default:
         var1.append('-').append(this.OK).append("dpi");
      }

      switch(this.mS) {
      case 1:
         var1.append("-notouch");
         break;
      case 2:
         var1.append("-stylus");
         break;
      case 3:
         var1.append("-finger");
      }

      switch(this.EO & 3) {
      case 1:
         var1.append("-keysexposed");
         break;
      case 2:
         var1.append("-keyshidden");
         break;
      case 3:
         var1.append("-keyssoft");
      }

      switch(this.LH) {
      case 1:
         var1.append("-nokeys");
         break;
      case 2:
         var1.append("-qwerty");
         break;
      case 3:
         var1.append("-12key");
      }

      switch(this.EO & 12) {
      case 4:
         var1.append("-navexposed");
         break;
      case 8:
         var1.append("-navhidden");
      }

      switch(this.KK) {
      case 1:
         var1.append("-nonav");
         break;
      case 2:
         var1.append("-dpad");
         break;
      case 3:
         var1.append("-trackball");
         break;
      case 4:
         var1.append("-wheel");
      }

      if(this.cb != 0 && this.PF != 0) {
         if(this.cb > this.PF) {
            var1.append(String.format("-%dx%d", new Object[]{Short.valueOf(this.cb), Short.valueOf(this.PF)}));
         } else {
            var1.append(String.format("-%dx%d", new Object[]{Short.valueOf(this.PF), Short.valueOf(this.cb)}));
         }
      }

      if(this.Hw > this.QE()) {
         var1.append("-v").append(this.Hw);
      }

      if(this.dN) {
         var1.append("-ERR" + ci++);
      }

      return var1.toString();
   }

   private short QE() {
      return (short)(this.ZY == 0 && this.s == 0 && this.Hv == 0?((this.Ux & 63) != 0?8:((this.rK & 63) == 0 && this.OK == 0?0:4)):13);
   }

   public String toString() {
      return !this.dN().equals("")?this.dN():"[DEFAULT]";
   }

   public boolean equals(Object var1) {
      if(var1 == null) {
         return false;
      } else if(this.getClass() != var1.getClass()) {
         return false;
      } else {
         Ja var2 = (Ja)var1;
         return this.VX.equals(var2.VX);
      }
   }

   public int hashCode() {
      int var1 = 291 + this.VX.hashCode();
      return var1;
   }
}
