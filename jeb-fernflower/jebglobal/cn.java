package jebglobal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import jebglobal.rB;

public class cn {
   private static Logger dN = null;
   private static List ld = new ArrayList();
   private static boolean QE = true;

   public static void dN(boolean var0, String var1, boolean var2) {
      if(dN != null) {
         throw new RuntimeException();
      } else {
         dN = Logger.getLogger(cn.class.getName());
         dN.setLevel(Level.FINEST);
         dN.setUseParentHandlers(false);
         cn.uK var3 = new cn.uK();
         if(var0) {
            ConsoleHandler var4 = new ConsoleHandler();
            var4.setFormatter(var3);
            var4.setLevel(Level.FINEST);
            dN.addHandler(var4);
         }

         if(var1 != null) {
            FileHandler var5 = new FileHandler(var1, 20971520, 1, var2);
            var5.setFormatter(var3);
            var5.setLevel(Level.FINEST);
            dN.addHandler(var5);
         }

      }
   }

   public static void dN() {
      if(dN == null) {
         throw new RuntimeException();
      } else {
         Handler[] var0 = dN.getHandlers();
         int var1 = var0.length;

         for(int var2 = 0; var2 < var1; ++var2) {
            Handler var3 = var0[var2];
            var3.close();
         }

         dN = null;
      }
   }

   public static void dN(rB var0) {
      ld.add(var0);
   }

   public static void ld(rB var0) {
      ld.remove(var0);
   }

   public static void dN(boolean var0) {
      if(dN == null) {
         throw new RuntimeException();
      } else {
         if(var0 != QE) {
            QE = var0;
            Iterator var1 = ld.iterator();

            while(var1.hasNext()) {
               var1.next();
            }
         }

      }
   }

   private static void dN(Level var0, String var1, boolean var2) {
      if(dN == null) {
         throw new RuntimeException();
      } else {
         if(var2) {
            var1 = var1 + "\n";
         }

         if(QE) {
            dN.log(var0, var1, new Boolean(false));
         }

         Iterator var3 = ld.iterator();

         while(var3.hasNext()) {
            rB var4 = (rB)var3.next();
            var4.dN(var0, var1);
         }

      }
   }

   public static void dN(String var0) {
      dN(Level.INFO, var0, true);
   }

   public static void ld(String var0) {
      dN(Level.INFO, var0, false);
   }

   static class uK extends Formatter {
      private String dN(long var1) {
         SimpleDateFormat var3 = new SimpleDateFormat("yy/MM/dd-HH:mm:ss");
         Date var4 = new Date(var1);
         return var3.format(var4);
      }

      public String format(LogRecord var1) {
         StringBuilder var2 = new StringBuilder();
         boolean var3 = true;
         Object[] var4 = var1.getParameters();
         if(var4 != null && var4.length >= 1 && var4[0] instanceof Boolean) {
            var3 = ((Boolean)var4[0]).booleanValue();
         }

         if(var3) {
            var2.append(String.format("%s %s ", new Object[]{this.dN(var1.getMillis()), var1.getLevel()}));
         }

         var2.append(var1.getMessage());
         return var2.toString();
      }
   }
}
