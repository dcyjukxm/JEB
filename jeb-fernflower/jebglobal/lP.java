package jebglobal;

import java.util.HashMap;
import java.util.HashSet;

public final class lP {
   private static final HashSet dN = new HashSet();
   private static HashMap ld;
   private static HashMap QE;
   private static HashMap wU;
   private static HashMap fa;

   public static boolean dN(String var0) {
      return dN.contains(var0);
   }

   public static boolean ld(String var0) {
      return dN(var0) || var0.equals("null") || var0.equals("true") || var0.equals("false");
   }

   public static boolean QE(String var0) {
      if(var0.length() != 0 && !ld(var0)) {
         if(!Character.isJavaIdentifierStart(var0.charAt(0))) {
            return false;
         } else {
            for(int var1 = 1; var1 < var0.length(); ++var1) {
               if(!Character.isJavaIdentifierPart(var0.charAt(var1))) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static String wU(String var0) {
      return (String)QE.get(var0);
   }

   public static String fa(String var0) {
      return (String)wU.get(var0);
   }

   static {
      lP.uK[] var0 = lP.uK.values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         lP.uK var3 = var0[var2];
         dN.add(var3.toString().toLowerCase());
      }

      ld = new HashMap();
      ld.put("boolean", "Ljava/lang/Boolean;");
      ld.put("byte", "Ljava/lang/Byte;");
      ld.put("char", "Ljava/lang/Character;");
      ld.put("short", "Ljava/lang/Short;");
      ld.put("int", "Ljava/lang/Integer;");
      ld.put("long", "Ljava/lang/Long;");
      ld.put("float", "Ljava/lang/Float;");
      ld.put("double", "Ljava/lang/Double;");
      QE = new HashMap();
      QE.put("Ljava/lang/Boolean;", "boolean");
      QE.put("Ljava/lang/Byte;", "byte");
      QE.put("Ljava/lang/Character;", "char");
      QE.put("Ljava/lang/Short;", "short");
      QE.put("Ljava/lang/Integer;", "int");
      QE.put("Ljava/lang/Long;", "long");
      QE.put("Ljava/lang/Float;", "float");
      QE.put("Ljava/lang/Double;", "double");
      wU = new HashMap();
      wU.put("boolean", "Z");
      wU.put("byte", "B");
      wU.put("char", "C");
      wU.put("short", "S");
      wU.put("int", "I");
      wU.put("long", "J");
      wU.put("float", "F");
      wU.put("double", "D");
      fa = new HashMap();
      fa.put("Z", "boolean");
      fa.put("B", "byte");
      fa.put("C", "char");
      fa.put("S", "short");
      fa.put("I", "int");
      fa.put("J", "long");
      fa.put("F", "float");
      fa.put("D", "double");
   }

   static enum uK {
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
      PF,
      Hw,
      rK,
      Ux,
      ZY,
      s,
      Hv,
      VX,
      ci,
      bG,
      BQ,
      Ee,
      De,
      rn,
      LR,
      Nh,
      XZ,
      nA,
      Ai,
      uM,
      kq,
      ir,
      rF,
      IL,
      Db,
      sC,
      jp,
      bU,
      Qg,
      uB,
      dY,
      Rm,
      nb,
      nI,
      My,
      kU,
      mD,
      LV;
   }
}
