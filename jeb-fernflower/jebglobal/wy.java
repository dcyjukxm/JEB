package jebglobal;

import jebglobal.HC;
import jebglobal.ZF;
import jebglobal.cn;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public final class wy {
   public Color dN = null;
   public Color ld = null;
   public boolean QE = false;
   public boolean wU = false;

   public wy(Display var1, String var2) {
      String[] var3 = var2.split(",");
      if(var3.length != 4) {
         cn.dN(String.format("Invalid style data: %s", new Object[]{ZF.QE(var2, true)}));
      } else {
         this.dN = dN(var1, var3[0]);
         this.ld = dN(var1, var3[1]);
         this.QE = Boolean.parseBoolean(var3[2]);
         this.wU = Boolean.parseBoolean(var3[3]);
      }
   }

   public wy(Color var1, Color var2, boolean var3, boolean var4) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
      this.wU = var4;
   }

   public wy(Color var1, Color var2) {
      this.dN = var1;
      this.ld = var2;
      this.QE = false;
      this.wU = false;
   }

   public wy(Color var1) {
      this.dN = var1;
      this.ld = null;
      this.QE = false;
      this.wU = false;
   }

   public String toString() {
      return String.format("%s,%s,%s,%s", new Object[]{dN(this.dN), dN(this.ld), Boolean.valueOf(this.QE), Boolean.valueOf(this.wU)});
   }

   public static String dN(Color var0) {
      return var0 == null?"-1":String.format("%02X%02X%02X", new Object[]{Integer.valueOf(var0.getRed()), Integer.valueOf(var0.getGreen()), Integer.valueOf(var0.getBlue())});
   }

   public static Color dN(Display var0, String var1) {
      int var2;
      try {
         var2 = Integer.parseInt(var1, 16);
      } catch (NumberFormatException var3) {
         cn.dN(String.format("Invalid color data: %s", new Object[]{ZF.QE(var1, true)}));
         return null;
      }

      return var2 < 0?null:HC.dN().dN(var2);
   }
}
