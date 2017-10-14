package jebglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Character.UnicodeBlock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import jebglobal.tu;

public class ZF {
   private Properties dN;
   private File ld;
   private boolean QE;

   public ZF(String var1) {
      this(var1, false);
   }

   private ZF(String var1, boolean var2) {
      this.dN = new Properties();
      this.ld = new File(var1);
      this.QE = var2;

      try {
         this.ld.createNewFile();
         FileInputStream var3 = new FileInputStream(this.ld);
         this.dN.load(var3);
         var3.close();
      } catch (IOException var4) {
         throw new RuntimeException(var4);
      }
   }

   private void ld() {
      if(this.QE) {
         this.dN();
      }

   }

   public void dN() {
      try {
         FileOutputStream var1 = new FileOutputStream(this.ld);
         this.dN.store(var1, "JEB properties");
         var1.close();
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   public void dN(String var1, String var2) {
      this.dN.setProperty(var1, var2);
      this.ld();
   }

   public String dN(String var1) {
      return this.ld(var1, (String)null);
   }

   public String ld(String var1, String var2) {
      String var3 = this.dN.getProperty(var1, var2);
      return var3;
   }

   public void dN(String var1, boolean var2) {
      this.dN.setProperty(var1, Boolean.toString(var2));
      this.ld();
   }

   public boolean ld(String var1, boolean var2) {
      try {
         String var3 = this.dN.getProperty(var1, Boolean.toString(var2));
         return Boolean.parseBoolean(var3);
      } catch (Exception var4) {
         return var2;
      }
   }

   public void dN(String var1, int var2) {
      this.dN.setProperty(var1, Integer.toString(var2));
      this.ld();
   }

   public int ld(String var1, int var2) {
      try {
         String var3 = this.dN.getProperty(var1, Integer.toString(var2));
         return Integer.parseInt(var3);
      } catch (Exception var4) {
         return var2;
      }
   }

   public static List dN(tu... var0) {
      ArrayList var1 = new ArrayList(var0.length);
      tu[] var2 = var0;
      int var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         tu var5 = var2[var4];
         if(var5 != null) {
            var1.add(var5);
         }
      }

      return var1;
   }

   public static List dN(List var0, Collection var1) {
      if(var1 != null) {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            tu var3 = (tu)var2.next();
            if(var3 != null) {
               var0.add(var3);
            }
         }
      }

      return var0;
   }

   public static String dN(byte[] var0, int var1, int var2, int var3) {
      StringBuilder var4 = new StringBuilder();
      int var5 = var1;

      int var8;
      for(int var6 = var2; var6 > 0; var6 -= var8) {
         var4.append(String.format("%08X  ", new Object[]{Integer.valueOf(var5 - var3)}));

         int var7;
         for(var7 = 0; var7 < 16 && var7 < var6; ++var7) {
            var4.append(String.format("%02X ", new Object[]{Byte.valueOf(var0[var5 + var7])}));
         }

         for(var8 = var7; var7 < 16; ++var7) {
            var4.append("   ");
         }

         var4.append(" ");

         for(var7 = 0; var7 < var8; ++var7) {
            byte var9 = var0[var5 + var7];
            if(var9 >= 32 && var9 < 127) {
               var4.append((char)var9);
            } else {
               var4.append(".");
            }
         }

         var4.append("\n");
         var5 += var8;
      }

      return var4.toString();
   }

   public static String ld(byte[] var0, int var1, int var2, int var3) {
      StringBuilder var4 = new StringBuilder();

      int var5;
      for(var5 = 0; var5 < var2; ++var5) {
         var4.append(String.format("%02X ", new Object[]{Byte.valueOf(var0[var1 + var5])}));
      }

      while(var5 < var3) {
         var4.append("   ");
         ++var5;
      }

      return var4.toString();
   }

   public static String dN(byte[] var0) {
      return ld(var0, 0, var0.length, 0);
   }

   public static String ld(byte[] var0) {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1.append(String.format("%02X", new Object[]{Byte.valueOf(var0[var2])}));
      }

      return var1.toString();
   }

   public static byte[] ld(String var0) {
      if(var0.length() % 2 != 0) {
         return null;
      } else {
         int var1 = var0.length() / 2;
         byte[] var2 = new byte[var1];

         for(int var3 = 0; var3 < var1; ++var3) {
            try {
               int var4 = Integer.parseInt(var0.substring(var3 * 2, var3 * 2 + 2), 16);
               var2[var3] = (byte)var4;
            } catch (NumberFormatException var5) {
               return null;
            }
         }

         return var2;
      }
   }

   public static boolean dN(char var0) {
      if(Character.isISOControl(var0)) {
         return false;
      } else {
         UnicodeBlock var1 = UnicodeBlock.of(var0);
         return var1 != null && var1 != UnicodeBlock.SPECIALS;
      }
   }

   public static String dN(char var0, boolean var1) {
      return var0 == 39?"\\\'":(var0 == 34?"\\\"":(var0 == 92?"\\\\":(var1 && dN(var0)?Character.toString(var0):(var0 >= 127?String.format("\\u%04X", new Object[]{Short.valueOf((short)var0)}):(var0 >= 32?Character.toString(var0):(var0 == 10?"\\n":(var0 == 13?"\\r":(var0 == 9?"\\t":(var0 == 8?"\\b":(var0 == 12?"\\f":String.format("\\u%04X", new Object[]{Short.valueOf((short)var0)})))))))))));
   }

   public static String QE(String var0, boolean var1) {
      StringBuilder var2 = new StringBuilder();

      for(int var3 = 0; var3 < var0.length(); ++var3) {
         char var4 = var0.charAt(var3);
         var2.append(dN(var4, var1));
      }

      return var2.toString();
   }
}
