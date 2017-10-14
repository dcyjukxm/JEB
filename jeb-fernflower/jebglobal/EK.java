package jebglobal;

public enum EK {
   ld,
   QE,
   wU,
   fa,
   dN,
   zs,
   mS;

   public static EK dN() {
      String var0 = System.getProperty("os.arch", "");
      String var1 = System.getProperty("os.name", "");
      boolean var2 = var0.contains("64");
      return var1.startsWith("Windows")?(var2?mS:zs):(var1.startsWith("Mac")?(var2?dN:fa):(var1.startsWith("Linux")?(var2?wU:QE):ld));
   }

   public boolean ld() {
      return this == fa || this == dN;
   }
}
