package jebglobal;

import java.util.List;
import jebglobal.He;
import jebglobal.bm;

public final class Wu implements bm {
   int dN = 0;
   byte[] ld = null;
   He.uK QE = null;
   Wu.vd[] wU = null;
   Wu.lX fa = null;
   Wu.uK zs = null;

   public String wU() {
      return this.QE.QE;
   }

   public int fa() {
      return this.QE.dN;
   }

   public int dN() {
      return this.dN;
   }

   public int ld() {
      return this.ld.length;
   }

   public byte[] zs() {
      return this.ld;
   }

   public Wu.vd[] mS() {
      return this.wU;
   }

   public int OK() {
      return this.wU.length;
   }

   public int dN(int var1) {
      return this.wU[var1].dN;
   }

   public long ld(int var1) {
      return this.wU[var1].ld;
   }

   public Wu.lX LH() {
      if(this.fa == null) {
         throw new RuntimeException();
      } else {
         return this.fa;
      }
   }

   public boolean KK() {
      return this.fa != null;
   }

   public boolean EO() {
      return this.zs != null;
   }

   public Wu.lX.uK[] cb() {
      if(this.fa == null) {
         throw new RuntimeException();
      } else {
         return this.fa.dN;
      }
   }

   public Wu.uK PF() {
      if(this.zs == null) {
         throw new RuntimeException();
      } else {
         return this.zs;
      }
   }

   public byte[][] Hw() {
      if(this.zs == null) {
         throw new RuntimeException();
      } else {
         return this.zs.dN;
      }
   }

   public boolean dN(List var1) {
      if(var1 != null) {
         var1.clear();
      }

      switch(this.QE.dN) {
      case 14:
      case 15:
      case 16:
      case 17:
      case 39:
         return true;
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      default:
         return false;
      case 40:
      case 41:
      case 42:
         if(var1 != null) {
            var1.add(Integer.valueOf(this.dN + 2 * (int)this.wU[0].ld));
         }

         return true;
      case 43:
      case 44:
         if(var1 != null) {
            var1.add(Integer.valueOf(this.dN + this.ld.length));
            Wu.lX.uK[] var2 = this.fa.dN;
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
               Wu.lX.uK var5 = var2[var4];
               var1.add(Integer.valueOf(this.dN + 2 * var5.dN));
            }
         }

         return true;
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 60:
      case 61:
         if(var1 != null) {
            var1.add(Integer.valueOf(this.dN + this.ld.length));
            var1.add(Integer.valueOf(this.dN + 2 * (int)this.wU[this.wU.length - 1].ld));
         }

         return true;
      }
   }

   public boolean QE() {
      switch(this.QE.dN) {
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 39:
      case 68:
      case 69:
      case 70:
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 82:
      case 83:
      case 84:
      case 85:
      case 86:
      case 87:
      case 88:
      case 89:
      case 90:
      case 91:
      case 92:
      case 93:
      case 94:
      case 95:
      case 96:
      case 97:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 104:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 147:
      case 148:
      case 158:
      case 159:
      case 179:
      case 180:
      case 190:
      case 191:
      case 211:
      case 212:
      case 219:
      case 220:
      case 255:
      case 511:
      case 767:
      case 1023:
      case 1279:
      case 1535:
      case 1791:
      case 2047:
      case 2303:
      case 2559:
      case 2815:
      case 3071:
      case 3327:
      case 3583:
      case 3839:
      case 4095:
      case 4351:
      case 4607:
      case 4863:
      case 5119:
      case 5375:
      case 5631:
      case 5887:
      case 6143:
      case 6399:
      case 6655:
      case 6911:
      case 7167:
      case 7423:
      case 7679:
      case 7935:
      case 8191:
      case 8447:
      case 8703:
      case 8959:
      case 9215:
      case 9471:
      case 9727:
      case 9983:
         return true;
      default:
         return false;
      }
   }

   public void dN(List var1, List var2, Object var3) {
      int var4 = this.QE.wU;
      if(var4 < 0) {
         throw new RuntimeException();
      } else {
         var1.clear();
         var2.clear();
         int var5;
         int var6;
         int var7;
         if((var4 & 65536) == 0) {
            var5 = var4 >> 4 & 15;

            for(var6 = 0; var5 != 0; ++var6) {
               if((var5 & 1) != 0) {
                  var7 = (int)this.wU[var6].ld;
                  if(!var1.contains(Integer.valueOf(var7))) {
                     var1.add(Integer.valueOf(var7));
                  }
               }

               var5 >>= 1;
            }

            var5 = var4 & 15;

            for(var6 = 0; var5 != 0; ++var6) {
               if((var5 & 1) != 0) {
                  var7 = (int)this.wU[var6].ld;
                  if(!var2.contains(Integer.valueOf(var7))) {
                     var2.add(Integer.valueOf(var7));
                  }
               }

               var5 >>= 1;
            }

            var5 = var4 >> 12 & 15;

            for(var6 = 0; var5 != 0; ++var6) {
               if((var5 & 1) != 0) {
                  var7 = (int)this.wU[var6].ld;
                  if(!var1.contains(Integer.valueOf(var7))) {
                     var1.add(Integer.valueOf(var7));
                  }

                  if(!var1.contains(Integer.valueOf(var7 + 1))) {
                     var1.add(Integer.valueOf(var7 + 1));
                  }
               }

               var5 >>= 1;
            }

            var5 = var4 >> 8 & 15;

            for(var6 = 0; var5 != 0; ++var6) {
               if((var5 & 1) != 0) {
                  var7 = (int)this.wU[var6].ld;
                  if(!var2.contains(Integer.valueOf(var7))) {
                     var2.add(Integer.valueOf(var7));
                  }

                  if(!var2.contains(Integer.valueOf(var7 + 1))) {
                     var2.add(Integer.valueOf(var7 + 1));
                  }
               }

               var5 >>= 1;
            }
         } else if(this.QE.dN == 36 || this.QE.dN >= 110 && this.QE.dN <= 114) {
            for(var5 = 1; var5 < this.wU.length; ++var5) {
               var6 = (int)this.wU[var5].ld;
               if(!var2.contains(Integer.valueOf(var6))) {
                  var2.add(Integer.valueOf(var6));
               }
            }
         } else {
            if(this.QE.dN == 37 || this.QE.dN >= 116 && this.QE.dN <= 120 || this.QE.dN == 1535 || this.QE.dN >= 8959 && this.QE.dN <= 9983) {
               var5 = (int)(this.wU[1].ld & -1L);
               var6 = (int)(this.wU[1].ld >> 32 & -1L);

               for(var7 = var5; var7 <= var6; ++var7) {
                  if(!var2.contains(Integer.valueOf(var7))) {
                     var2.add(Integer.valueOf(var7));
                  }
               }

               return;
            }

            throw new RuntimeException();
         }

      }
   }

   public static boolean QE(int var0) {
      return var0 == 26 || var0 == 27;
   }

   public static boolean wU(int var0) {
      return var0 == 28 || var0 == 31 || var0 == 32 || var0 == 34 || var0 == 35 || var0 == 36 || var0 == 37 || var0 == 255 || var0 == 511 || var0 == 767 || var0 == 1023 || var0 == 1279 || var0 == 1535;
   }

   public static boolean fa(int var0) {
      return var0 >= 82 && var0 <= 95 || var0 >= 96 && var0 <= 109 || var0 >= 1791 && var0 <= 5119 || var0 >= 5375 && var0 <= 8703;
   }

   public static boolean zs(int var0) {
      return var0 >= 110 && var0 <= 114 || var0 >= 116 && var0 <= 120 || var0 >= 8959 && var0 <= 9983;
   }

   public static class uK {
      private int ld;
      byte[][] dN;

      public uK(int var1, int var2, int var3) {
         this.ld = var1;
         this.dN = new byte[var2][var3];
      }

      public int dN() {
         return this.ld;
      }

      public byte[][] ld() {
         return this.dN;
      }
   }

   public static class lX {
      private int ld;
      Wu.lX.uK[] dN;

      public lX(int var1, int var2) {
         this.ld = var1;
         this.dN = new Wu.lX.uK[var2];
      }

      public int dN() {
         return this.ld;
      }

      public Wu.lX.uK[] ld() {
         return this.dN;
      }

      public static class uK {
         private int ld;
         int dN;

         public uK(int var1, int var2) {
            this.ld = var1;
            this.dN = var2;
         }

         public int dN() {
            return this.ld;
         }

         public int ld() {
            return this.dN;
         }
      }
   }

   public static class vd {
      int dN;
      long ld;

      public vd(int var1, long var2) {
         this.dN = var1;
         this.ld = var2;
      }

      public int dN() {
         return this.dN;
      }

      public long ld() {
         return this.ld;
      }
   }
}
