package jebglobal;

public interface KT {
   void dN(KT.uK var1);

   public static class uK {
      public KT.vd dN;
      public String ld;

      uK(KT.vd var1, String var2) {
         if(var1 == null) {
            throw new RuntimeException();
         } else {
            this.dN = var1;
            this.ld = var2;
         }
      }

      uK(KT.vd var1) {
         this(var1, (String)null);
      }
   }

   public static enum vd {
      dN,
      ld,
      QE,
      wU,
      fa,
      zs,
      mS,
      OK;
   }
}
