package jebglobal;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import jebglobal.Kf;
import jebglobal.iR;
import jebglobal.lb;

public final class IL {
   private static Class dN;
   private Vector ld;
   private String QE;
   private Hashtable wU = new Hashtable();

   public iR dN() {
      if(this.ld == null) {
         throw new lb("Factory initialization was incomplete - has not tried " + this.QE);
      } else if(this.ld.size() == 0) {
         throw new lb("No valid parser classes found in " + this.QE);
      } else {
         StringBuffer var1 = new StringBuffer();
         int var2 = 0;

         while(var2 < this.ld.size()) {
            Class var3 = (Class)this.ld.elementAt(var2);

            try {
               iR var4 = (iR)var3.newInstance();
               Enumeration var5 = this.wU.keys();

               while(var5.hasMoreElements()) {
                  String var6 = (String)var5.nextElement();
                  Boolean var7 = (Boolean)this.wU.get(var6);
                  if(var7 != null && var7.booleanValue()) {
                     var4.dN(var6, true);
                  }
               }

               return var4;
            } catch (Exception var8) {
               var1.append(var3.getName() + ": " + var8.toString() + "; ");
               ++var2;
            }
         }

         throw new lb("could not create parser: " + var1);
      }
   }

   public static IL ld() {
      return dN((String)null, (Class)null);
   }

   public static IL dN(String var0, Class var1) {
      if(var1 == null) {
         var1 = dN;
      }

      String var2;
      if(var0 != null && var0.length() != 0 && !"DEFAULT".equals(var0)) {
         var2 = "parameter classNames to newInstance() that contained \'" + var0 + "\'";
      } else {
         try {
            InputStream var3 = var1.getResourceAsStream("/META-INF/services/org.xmlpull.v1.XmlPullParserFactory");
            if(var3 == null) {
               throw new lb("resource not found: /META-INF/services/org.xmlpull.v1.XmlPullParserFactory make sure that parser implementing XmlPull API is available");
            }

            StringBuffer var4 = new StringBuffer();

            while(true) {
               int var5 = var3.read();
               if(var5 < 0) {
                  var3.close();
                  var0 = var4.toString();
                  break;
               }

               if(var5 > 32) {
                  var4.append((char)var5);
               }
            }
         } catch (Exception var13) {
            throw new lb((String)null, (iR)null, var13);
         }

         var2 = "resource /META-INF/services/org.xmlpull.v1.XmlPullParserFactory that contained \'" + var0 + "\'";
      }

      IL var14 = null;
      Vector var15 = new Vector();
      Vector var16 = new Vector();

      int var7;
      for(int var6 = 0; var6 < var0.length(); var6 = var7 + 1) {
         var7 = var0.indexOf(44, var6);
         if(var7 == -1) {
            var7 = var0.length();
         }

         String var8 = var0.substring(var6, var7);
         Class var9 = null;
         Object var10 = null;

         try {
            var9 = Class.forName(var8);
            var10 = var9.newInstance();
         } catch (Exception var12) {
            ;
         }

         if(var9 != null) {
            boolean var11 = false;
            if(var10 instanceof iR) {
               var15.addElement(var9);
               var11 = true;
            }

            if(var10 instanceof Kf) {
               var16.addElement(var9);
               var11 = true;
            }

            if(var10 instanceof IL) {
               if(var14 == null) {
                  var14 = (IL)var10;
               }

               var11 = true;
            }

            if(!var11) {
               throw new lb("incompatible class: " + var8);
            }
         }
      }

      if(var14 == null) {
         var14 = new IL();
      }

      var14.ld = var15;
      var14.QE = var2;
      return var14;
   }

   static {
      IL var0 = new IL();
      dN = var0.getClass();
   }
}
