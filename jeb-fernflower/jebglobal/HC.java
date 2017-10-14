package jebglobal;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import jeb.Launcher;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public final class HC {
   private static HC dN = null;
   private Display ld = Display.getDefault();
   private HashMap QE = new HashMap();
   private HashMap wU = new HashMap();
   private HashMap fa = new HashMap();

   public static HC dN() {
      if(dN == null) {
         dN = new HC();
      }

      return dN;
   }

   public Image dN(String var1) {
      if(var1 == null) {
         return null;
      } else {
         Image var2 = (Image)this.QE.get(var1);
         if(var2 == null) {
            InputStream var3 = Launcher.ld(var1);
            if(var3 != null) {
               try {
                  var2 = new Image(this.ld, var3);
               } catch (SWTException var11) {
                  ;
               } finally {
                  try {
                     var3.close();
                  } catch (IOException var10) {
                     ;
                  }

               }
            }

            this.QE.put(var1, var2);
         }

         return var2;
      }
   }

   public Image[] dN(String... var1) {
      Image[] var2 = new Image[var1.length];
      int var3 = 0;
      String[] var4 = var1;
      int var5 = var1.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         String var7 = var4[var6];
         var2[var3] = this.dN(var7);
         ++var3;
      }

      return var2;
   }

   public Color dN(RGB var1) {
      if(var1 == null) {
         return null;
      } else {
         Color var2 = (Color)this.wU.get(var1);
         if(var2 == null) {
            var2 = new Color(this.ld, var1);
            this.wU.put(var1, var2);
         }

         return var2;
      }
   }

   public Color dN(int var1) {
      return this.dN(new RGB(var1 >> 16 & 255, var1 >> 8 & 255, var1 & 255));
   }

   public Color dN(int var1, int var2, int var3) {
      return this.dN(new RGB(var1, var2, var3));
   }

   public Font dN(FontData var1) {
      if(var1 == null) {
         return null;
      } else {
         Font var2 = (Font)this.fa.get(var1);
         if(var2 == null) {
            var2 = new Font(this.ld, var1);
            this.fa.put(var1, var2);
         }

         return var2;
      }
   }

   public Font dN(String var1, int var2, int var3) {
      return this.dN(new FontData(var1, var2, var3));
   }
}
