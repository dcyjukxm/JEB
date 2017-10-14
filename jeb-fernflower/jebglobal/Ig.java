package jebglobal;

public final class Ig {
   private static final float[] dN = new float[]{0.00390625F, 3.0517578E-5F, 1.1920929E-7F, 4.656613E-10F};
   private static final String[] ld = new String[]{"px", "dip", "sp", "pt", "in", "mm"};
   private static final String[] QE = new String[]{"%", "%p"};

   public static float dN(int var0) {
      return (float)(var0 & -256) * dN[var0 >> 4 & 3];
   }

   public static final String dN(int var0, int var1) {
      switch(var0) {
      case 0:
         return null;
      case 1:
         return "@" + var1;
      case 2:
         return "?" + var1;
      case 3:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      default:
         if(var0 >= 28 && var0 <= 31) {
            return "#" + Integer.toHexString(var1);
         } else {
            if(var0 >= 16 && var0 <= 31) {
               return Integer.toString(var1);
            }

            return null;
         }
      case 4:
         return Float.toString(Float.intBitsToFloat(var1));
      case 5:
         return Float.toString(dN(var1)) + ld[var1 >> 0 & 15];
      case 6:
         return Float.toString(dN(var1) * 100.0F) + QE[var1 >> 0 & 15];
      case 17:
         return "0x" + Integer.toHexString(var1);
      case 18:
         return var1 != 0?"true":"false";
      }
   }
}
