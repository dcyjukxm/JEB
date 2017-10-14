package jebglobal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import jebglobal.Bb;
import jebglobal.CH;
import jebglobal.Hk;
import jebglobal.Ji;
import jebglobal.OD;
import jebglobal.OZ;
import jebglobal.TM;
import jebglobal.k;
import jebglobal.kM;
import jebglobal.u;

public class UB {
   private int dN = 0;
   private List ld = null;

   UB(int var1) {
      this.dN = var1;
      if(this.ld()) {
         this.ld = new ArrayList();
      }

   }

   int dN() {
      return this.dN & -251658241;
   }

   boolean ld() {
      return (this.dN & Integer.MIN_VALUE) != 0;
   }

   boolean QE() {
      return (this.dN & 134217728) != 0;
   }

   void dN(boolean var1) {
      this.dN = var1?this.dN | 134217728:this.dN & -134217729;
   }

   boolean wU() {
      return (this.dN & 67108864) != 0;
   }

   void ld(boolean var1) {
      this.dN = var1?this.dN | 67108864:this.dN & -67108865;
   }

   boolean dN(UB var1) {
      if(!this.ld()) {
         throw new RuntimeException();
      } else {
         return this.ld.add(var1);
      }
   }

   boolean ld(UB var1) {
      if(!this.ld()) {
         throw new RuntimeException();
      } else {
         return this.ld.remove(var1);
      }
   }

   List fa() {
      if(!this.ld()) {
         throw new RuntimeException();
      } else {
         return this.ld;
      }
   }

   public UB dN(int var1, boolean var2) {
      if(!this.ld()) {
         throw new RuntimeException();
      } else if(!var2) {
         Iterator var3 = this.ld.iterator();

         UB var4;
         do {
            if(!var3.hasNext()) {
               return null;
            }

            var4 = (UB)var3.next();
         } while(var4.dN() != var1);

         return var4;
      } else {
         return this.dN(this, var1);
      }
   }

   private UB dN(UB var1, int var2) {
      Iterator var3 = var1.fa().iterator();

      while(var3.hasNext()) {
         UB var4 = (UB)var3.next();
         if(var4.dN() == var2) {
            return var4;
         }

         if(var4.ld()) {
            UB var5 = this.dN(var4, var2);
            if(var5 != null) {
               return var5;
            }
         }
      }

      return null;
   }

   byte[] zs() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         if(this.ld()) {
            Iterator var2 = this.ld.iterator();

            while(var2.hasNext()) {
               UB var3 = (UB)var2.next();
               var1.write(var3.zs());
            }
         } else {
            var1.write(this.mS());
         }

         if(var1.size() % 4 != 0) {
            throw new RuntimeException();
         } else {
            byte[] var8 = var1.toByteArray();
            ByteBuffer var9 = null;
            if(this.wU()) {
               Deflater var4 = new Deflater();
               var4.setInput(var8);
               var4.finish();
               byte[] var5 = new byte[var8.length];
               int var6 = var4.deflate(var5);
               if(var6 != 0 && var4.finished()) {
                  if(var6 % 4 != 0) {
                     var6 += 4 - var6 % 4;
                  }

                  var9 = ByteBuffer.wrap(new byte[12 + var6]);
                  var9.order(ByteOrder.LITTLE_ENDIAN);
                  var9.putInt(this.dN);
                  var9.putInt(4 + var6);
                  var9.putInt(var8.length);
                  var9.put(var5, 0, var6);
               } else {
                  this.ld(false);
               }
            }

            if(!this.wU()) {
               var9 = ByteBuffer.wrap(new byte[8 + var8.length]);
               var9.order(ByteOrder.LITTLE_ENDIAN);
               var9.putInt(this.dN);
               var9.putInt(var8.length);
               var9.put(var8);
            }

            if(this.QE()) {
               byte[] var10 = new byte[8];
               var9.rewind();
               var9.get(var10);
               dN(var10, var9.array(), 8, var9.array().length);
            }

            return var9.array();
         }
      } catch (IOException var7) {
         return null;
      }
   }

   byte[] mS() {
      throw new RuntimeException();
   }

   static UB dN(OZ var0) {
      int var1 = var0.readInt();
      int var2 = var0.readInt();
      byte[] var3 = new byte[var2];
      var0.readFully(var3);
      return dN(var1, var3);
   }

   static UB dN(int var0, byte[] var1) {
      ByteBuffer var2;
      if((var0 & 134217728) != 0) {
         var2 = ByteBuffer.allocate(8);
         var2.order(ByteOrder.LITTLE_ENDIAN);
         var2.putInt(var0);
         var2.putInt(var1.length);
         dN(var2.array(), var1, 0, var1.length);
      }

      if((var0 & 67108864) != 0) {
         var2 = ByteBuffer.wrap(var1);
         var2.order(ByteOrder.LITTLE_ENDIAN);
         int var3 = var2.getInt();
         Inflater var4 = new Inflater();
         var4.setInput(var1, 4, var1.length - 4);
         byte[] var5 = new byte[var3];

         try {
            if(var4.inflate(var5) != var3) {
               throw new DataFormatException();
            }
         } catch (DataFormatException var8) {
            return null;
         }

         var4.end();
         var1 = var5;
      }

      var2 = ByteBuffer.wrap(var1);
      var2.order(ByteOrder.LITTLE_ENDIAN);
      Object var9;
      if((var0 & Integer.MIN_VALUE) != 0) {
         var9 = new UB(var0);

         while(var2.remaining() > 0) {
            int var10 = var2.getInt();
            int var11 = var2.getInt();
            byte[] var6 = new byte[var11];
            var2.get(var6);
            UB var7 = dN(var10, var6);
            ((UB)var9).dN(var7);
         }
      } else {
         switch(var0 & -251658241) {
         case 4541510:
            var9 = CH.dN(var1);
            break;
         case 4606278:
            var9 = k.dN(var1);
            break;
         case 4932181:
            var9 = Bb.dN(var1);
            break;
         case 5066313:
            var9 = u.dN(var1);
            break;
         case 5391702:
            var9 = Ji.dN(var1);
            break;
         case 5524803:
            var9 = OD.dN(var1);
            break;
         case 5526849:
            var9 = kM.dN(var1);
            break;
         default:
            throw new IOException();
         }
      }

      ((UB)var9).dN((var0 & 134217728) != 0);
      ((UB)var9).ld((var0 & 67108864) != 0);
      return (UB)var9;
   }

   static byte[] ld(OZ var0) {
      int var1 = var0.readInt();
      byte[] var2 = new byte[var1];
      var0.readFully(var2);
      if(var1 % 4 != 0) {
         int var3 = 4 - var1 % 4;
         var0.skipBytes(var3);
      }

      return var2;
   }

   static void dN(Hk var0, byte[] var1) {
      int var2 = var1.length;
      var0.writeInt(var2);
      var0.write(var1);
      if(var2 % 4 != 0) {
         int var3 = 4 - var2 % 4;

         for(int var4 = 0; var4 < var3; ++var4) {
            var0.write(0);
         }
      }

   }

   static byte[] QE(OZ var0) {
      int var1 = var0.readInt();
      byte[] var2 = ld(var0);
      CRC32 var3 = new CRC32();
      var3.update(var2);
      int var4 = (int)var3.getValue();
      if(var4 != var1) {
         throw new IOException();
      } else {
         return var2;
      }
   }

   static void ld(Hk var0, byte[] var1) {
      CRC32 var2 = new CRC32();
      var2.update(var1);
      int var3 = (int)var2.getValue();
      var0.writeInt(var3);
      dN(var0, var1);
   }

   static String wU(OZ var0) {
      boolean var1 = false;
      int var2 = var0.readInt();
      if((var2 & Integer.MIN_VALUE) != 0) {
         var2 &= Integer.MAX_VALUE;
         int var3 = var0.readInt();
         var1 = (var3 & 1) != 0;
      }

      byte[] var5 = new byte[var2];
      var0.readFully(var5);
      if(var2 % 4 != 0) {
         int var4 = 4 - var2 % 4;
         var0.skipBytes(var4);
      }

      return var1?TM.fa(var5):new String(var5);
   }

   static void dN(Hk var0, String var1) {
      byte[] var2 = TM.EO(var1);
      int var3 = var2.length;
      var0.writeInt(var3 | Integer.MIN_VALUE);
      var0.writeInt(1);
      var0.write(var2);
      if(var3 % 4 != 0) {
         int var4 = 4 - var3 % 4;

         for(int var5 = 0; var5 < var4; ++var5) {
            var0.write(0);
         }
      }

   }

   static void dN(byte[] var0, byte[] var1, int var2, int var3) {
      int var4 = var0.length;
      byte[] var7 = new byte[256];

      int var5;
      for(var5 = 0; var5 < 256; ++var5) {
         var7[var5] = (byte)var5;
      }

      int var6 = 0;

      for(var5 = 0; var5 < 256; ++var5) {
         var6 = (var6 + var7[var5] + var0[var5 % var4]) % 256 & 255;
         byte var8 = var7[var5];
         var7[var5] = var7[var6];
         var7[var6] = var8;
      }

      var5 = 0;
      var6 = 0;

      for(int var11 = var2; var11 < var3; ++var11) {
         var5 = (var5 + 1) % 256 & 255;
         var6 = (var6 + var7[var5]) % 256 & 255;
         byte var9 = var7[var5];
         var7[var5] = var7[var6];
         var7[var6] = var9;
         byte var10 = var7[(var7[var5] + var7[var6]) % 256 & 255];
         var1[var11] ^= var10;
      }

   }

   static int OK() {
      return (int)(System.currentTimeMillis() / 1000L);
   }
}
