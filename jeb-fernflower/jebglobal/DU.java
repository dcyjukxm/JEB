package jebglobal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import jebglobal.Hk;
import jebglobal.Hl;
import jebglobal.OZ;
import jebglobal.PX;
import jebglobal.TM;
import jebglobal.Vm;
import jebglobal.ZF;
import jebglobal.eI;
import jebglobal.rP;
import jebglobal.wk;

public class DU {
   private static final long LK = 844563159190538443L;
   private static String dN = rP.dN(new byte[]{114, 94, 69, 73, 69, 80, 80, 88, 67, 25, 25, 90, 24, 21, 6, 15, 12, 6, 27, 25, 6, 0, 1, 7, 30, 23, 126, 65, 82, 84, 91, 93, 21, 81, 95, 80, 31, 87, 71, 20, 88, 66, 70, 18, 85, 94, 95, 90, 89, 88, 81, 65, 86, 69, 22, 25, 119, 93, 85, 24, 74, 81, 87, 95, 64, 74, 17, 66, 81, 69, 82, 68, 71, 82, 84, 26, 115, 94, 65, 76, 67, 92, 81, 81, 70, 24, 28, 82, 24, 25, 3, 14, 11, 5, 20, 16, 7, 5, 4, 0, 30, 24, 123, 70, 83, 83, 91, 82, 21, 84, 92, 82, 24, 89, 68, 17, 94, 77, 70, 25, 83, 94, 86, 90, 85, 89, 83, 67, 93, 65, 23, 20, 118, 94, 93, 23, 69, 80, 85, 95, 65, 64, 17, 70, 87, 70, 92, 64, 78, 80, 80, 24, 115, 87, 71, 73, 69, 92, 94, 88, 77, 18, 30, 87, 25, 17, 9, 8, 13, 10, 20, 23, 5, 6, 7, 4, 29, 17, 124, 67, 85, 82, 92, 92, 17, 84, 93, 93, 28, 92, 75, 18, 88, 71, 75, 21, 84, 82, 81, 95, 88, 81, 82, 68, 86, 66, 22, 21, 115, 94, 91, 18, 74, 93, 87, 93, 76, 71, 18, 74, 81, 69, 92, 70, 70, 86, 87, 24, 122, 94, 72, 64, 64, 80, 82, 89, 68, 16, 31, 90, 24, 21, 4, 12, 10, 2, 20, 23, 5, 0, 7, 3, 25, 19, 126, 70, 87, 90, 90, 92, 25, 84, 87, 85, 24, 95, 66, 20, 92, 67, 75, 18, 81, 84, 95, 94, 90, 93, 84, 71, 80, 70, 28, 20, 112, 95, 91, 18, 75, 92, 83, 91, 64, 71, 22, 75, 81, 75, 93, 75, 67, 84, 87, 22, 117, 91, 71, 65, 65}, 2, 32);
   private static String ld = rP.dN(new byte[]{117, 90, 69, 74, 69}, 2, 158);
   private Vm QE;
   private String wU;

   public DU(Vm var1) {
      if(var1 == null) {
         throw new RuntimeException();
      } else {
         this.QE = var1;
      }
   }

   public Hl dN() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         Hk var2 = new Hk(var1);
         this.dN(var2, eI.KK);
         this.dN(var2, eI.fa);
         this.dN(var2, eI.zs);
         this.dN(var2, eI.mS);
         this.dN(var2, eI.OK);
         this.dN(var2, eI.LH);
         var2.dN();
         int[] var3 = new int[1];
         byte[] var4 = PX.dN(var1.toByteArray(), var3);
         this.wU = PX.dN(var4);
         String var5 = this.QE.dN("http://www.android-decompiler.com/jps/checkupdate.php", this.wU);
         if(var5 != null && var5.length() != 0) {
            int var6 = var5.indexOf(88);
            if(var6 < 0) {
               return null;
            } else {
               BigInteger var7 = new BigInteger(dN);
               BigInteger var8 = new BigInteger(ld);
               BigInteger var9 = new BigInteger(var5.substring(0, var6));
               var9 = var9.modPow(var8, var7);
               var4 = var9.toByteArray();
               if(var4.length > 128) {
                  return null;
               } else {
                  byte[] var10;
                  if(var4.length < 128) {
                     var10 = new byte[128];
                     int var11 = 128 - var4.length;

                     for(int var12 = 0; var11 < 128; ++var12) {
                        var10[var11] = var4[var12];
                        ++var11;
                     }

                     var4 = var10;
                  }

                  var10 = TM.wU(Arrays.copyOf(var4, var4.length - 32));
                  byte[] var27 = Arrays.copyOfRange(var4, var4.length - 32, var4.length);
                  if(!Arrays.equals(var10, var27)) {
                     return null;
                  } else {
                     ByteBuffer var28 = ByteBuffer.wrap(var4);
                     var28.order(ByteOrder.LITTLE_ENDIAN);
                     if(var28.getInt(4) != var3[0]) {
                        return null;
                     } else {
                        int var13 = var28.getInt(8);
                        int var14 = var28.getInt(12);
                        int var15 = var28.getInt(16);
                        if(20 + var15 > var4.length) {
                           return null;
                        } else {
                           byte[] var16 = Arrays.copyOfRange(var4, 20, 20 + var15);
                           byte[] var17 = PX.dN(var5.substring(var6 + 1).trim());
                           if(var17.length != var14) {
                              return null;
                           } else {
                              TM.dN(var16, var17, 0, var17.length);
                              OZ var18 = new OZ(new ByteArrayInputStream(var17));
                              int var19 = var18.readInt();
                              if(var19 != 0) {
                                 return null;
                              } else {
                                 String var20 = this.dN(var18);
                                 String var21 = this.dN(var18);
                                 String var22 = this.dN(var18);
                                 String var23 = this.dN(var18);
                                 if(var20.isEmpty()) {
                                    return null;
                                 } else {
                                    Hl.uK var24 = new Hl.uK(wk.dN(var20), var21, ZF.ld(var22), var23);
                                    Hl var25 = new Hl(var13, var24);
                                    return var25;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            return null;
         }
      } catch (Exception var26) {
         return null;
      }
   }

   private void dN(Hk var1, String var2) {
      byte[] var3 = TM.EO(var2);
      var1.writeInt(var3.length);
      var1.write(var3);
   }

   private String dN(OZ var1) {
      int var2 = var1.readInt();
      if(var2 < 0) {
         throw new IOException();
      } else {
         byte[] var3 = new byte[var2];
         if(var2 > 0) {
            int var4 = var1.dN(var3, 0, var2);
            if(var4 != var2) {
               throw new IOException();
            }
         }

         return TM.fa(var3);
      }
   }
}
