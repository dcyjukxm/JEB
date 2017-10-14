package org.xmlpull.v1.parser_pool;

import java.util.ArrayList;
import java.util.List;
import jebglobal.IL;
import jebglobal.iR;

public class XmlPullParserPool {
   private List dN;
   private IL ld;

   public XmlPullParserPool() {
      this(IL.ld());
   }

   public XmlPullParserPool(IL var1) {
      this.dN = new ArrayList();
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.ld = var1;
      }
   }

   protected iR dN() {
      return this.ld.dN();
   }

   public iR ld() {
      iR var1 = null;
      if(this.dN.size() > 0) {
         List var2 = this.dN;
         synchronized(this.dN) {
            if(this.dN.size() > 0) {
               var1 = (iR)this.dN.remove(this.dN.size() - 1);
            }
         }
      }

      if(var1 == null) {
         var1 = this.dN();
      }

      return var1;
   }

   public void dN(iR var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         List var2 = this.dN;
         synchronized(this.dN) {
            this.dN.add(var1);
         }
      }
   }

   public static void main(String[] var0) {
      XmlPullParserPool var1 = new XmlPullParserPool();
      iR var2 = var1.ld();
      var1.dN(var2);
      iR var3 = var1.ld();
      if(var2 != var3) {
         throw new RuntimeException();
      } else {
         var1.dN(var3);
         System.out.println(var1.getClass() + " OK");
      }
   }
}
