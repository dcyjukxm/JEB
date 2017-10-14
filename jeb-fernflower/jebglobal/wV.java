package jebglobal;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import jebglobal.TM;
import jebglobal.hq;

public final class wV {
   private int[] dN;
   private byte[] ld;
   private int[] QE;
   private int[] wU;
   private boolean fa;
   private static final CharsetDecoder zs = Charset.forName("UTF-16LE").newDecoder();
   private static final CharsetDecoder mS = Charset.forName("UTF-8").newDecoder();

   public static wV dN(hq var0) {
      var0.ld(1835009);
      int var1 = var0.readInt();
      int var2 = var0.readInt();
      int var3 = var0.readInt();
      int var4 = var0.readInt();
      int var5 = var0.readInt();
      int var6 = var0.readInt();
      wV var7 = new wV();
      var7.fa = (var4 & 256) != 0;
      var7.dN = var0.dN(var2);
      if(var3 != 0) {
         var7.QE = var0.dN(var3);
      }

      int var8 = (var6 == 0?var1:var6) - var5;
      var7.ld = new byte[var8];
      var0.readFully(var7.ld);
      if(var6 != 0) {
         var8 = var1 - var6;
         var7.wU = var0.dN(var8 / 4);
         int var9 = var8 % 4;
         if(var9 >= 1) {
            while(var9-- > 0) {
               var0.readByte();
            }
         }
      }

      return var7;
   }

   public String dN(int var1) {
      if(var1 >= 0 && this.dN != null && var1 < this.dN.length) {
         int var2 = this.dN[var1];
         int var3;
         if(!this.fa) {
            var3 = dN(this.ld, var2) * 2;
            var2 += 2;
         } else {
            var2 += ld(this.ld, var2)[1];
            int[] var4 = ld(this.ld, var2);
            var2 += var4[1];
            var3 = var4[0];
         }

         return this.dN(var2, var3);
      } else {
         return null;
      }
   }

   public String ld(int var1) {
      String var2 = this.dN(var1);
      if(var2 == null) {
         return var2;
      } else {
         int[] var3 = this.QE(var1);
         if(var3 == null) {
            return TM.dN(var2);
         } else {
            StringBuilder var4 = new StringBuilder(var2.length() + 32);
            int[] var5 = new int[var3.length / 3];
            int var6 = 0;
            int var7 = 0;

            while(true) {
               int var8 = -1;

               int var9;
               for(var9 = 0; var9 != var3.length; var9 += 3) {
                  if(var3[var9 + 1] != -1 && (var8 == -1 || var3[var8 + 1] > var3[var9 + 1])) {
                     var8 = var9;
                  }
               }

               int var10 = var8 != -1?var3[var8 + 1]:var2.length();

               for(var9 = var7 - 1; var9 >= 0; --var9) {
                  int var11 = var5[var9];
                  int var12 = var3[var11 + 2];
                  if(var12 >= var10) {
                     break;
                  }

                  if(var6 <= var12) {
                     var4.append(TM.dN(var2.substring(var6, var12 + 1)));
                     var6 = var12 + 1;
                  }

                  this.dN(this.dN(var3[var11]), var4, true);
               }

               var7 = var9 + 1;
               if(var6 < var10) {
                  var4.append(TM.dN(var2.substring(var6, var10)));
                  var6 = var10;
               }

               if(var8 == -1) {
                  return var4.toString();
               }

               this.dN(this.dN(var3[var8]), var4, false);
               var3[var8 + 1] = -1;
               var5[var7++] = var8;
            }
         }
      }
   }

   private void dN(String var1, StringBuilder var2, boolean var3) {
      var2.append('<');
      if(var3) {
         var2.append('/');
      }

      int var4 = var1.indexOf(59);
      if(var4 == -1) {
         var2.append(var1);
      } else {
         var2.append(var1.substring(0, var4));
         String var7;
         if(!var3) {
            for(boolean var5 = true; var5; var2.append(TM.dN(var7)).append('\"')) {
               int var6 = var1.indexOf(61, var4 + 1);
               var2.append(' ').append(var1.substring(var4 + 1, var6)).append("=\"");
               var4 = var1.indexOf(59, var6 + 1);
               if(var4 != -1) {
                  var7 = var1.substring(var6 + 1, var4);
               } else {
                  var5 = false;
                  var7 = var1.substring(var6 + 1);
               }
            }
         }
      }

      var2.append('>');
   }

   private int[] QE(int var1) {
      if(this.QE != null && this.wU != null && var1 < this.QE.length) {
         int var2 = this.QE[var1] / 4;
         int var4 = 0;

         int var5;
         for(var5 = var2; var5 < this.wU.length && this.wU[var5] != -1; ++var5) {
            ++var4;
         }

         if(var4 != 0 && var4 % 3 == 0) {
            int[] var3 = new int[var4];
            var4 = var2;

            for(var5 = 0; var4 < this.wU.length && this.wU[var4] != -1; var3[var5++] = this.wU[var4++]) {
               ;
            }

            return var3;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private String dN(int var1, int var2) {
      try {
         return (this.fa?mS:zs).decode(ByteBuffer.wrap(this.ld, var1, var2)).toString();
      } catch (CharacterCodingException var4) {
         Object[] var10000 = new Object[]{var4.toString()};
         return null;
      }
   }

   private static final int dN(byte[] var0, int var1) {
      return (var0[var1 + 1] & 255) << 8 | var0[var1] & 255;
   }

   private static final int[] ld(byte[] var0, int var1) {
      byte var2 = var0[var1];
      boolean var3 = (var2 & 128) != 0;
      int var4 = var2 & 127;
      return !var3?new int[]{var4, 1}:new int[]{var4 << 8 | var0[var1 + 1] & 255, 2};
   }
}
