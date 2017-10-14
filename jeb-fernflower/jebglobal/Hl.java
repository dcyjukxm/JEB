package jebglobal;

import jebglobal.wk;

public final class Hl {
   private int dN;
   private Hl.uK ld;

   public Hl(int var1, Hl.uK var2) {
      this.dN = var1;
      this.ld = var2;
   }

   public int dN() {
      return this.dN;
   }

   public Hl.uK ld() {
      return this.ld;
   }

   public static class uK {
      private wk dN;
      private String ld;
      private byte[] QE;
      private String wU;

      public uK(wk var1, String var2, byte[] var3, String var4) {
         if(var1 != null && var2 != null && var2.length() != 0 && var3 != null && var3.length == 32) {
            this.dN = var1;
            this.ld = var2;
            this.QE = var3;
            this.wU = var4;
         } else {
            throw new IllegalArgumentException();
         }
      }

      public wk dN() {
         return this.dN;
      }

      public String ld() {
         return this.ld;
      }

      public byte[] QE() {
         return this.QE;
      }

      public String wU() {
         return this.wU;
      }
   }
}
