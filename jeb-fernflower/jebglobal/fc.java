package jebglobal;

import java.util.HashMap;
import jebglobal.HC;
import jebglobal.ZF;
import jebglobal.cn;
import jebglobal.wy;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public final class fc {
   private HC dN = HC.dN();
   private wy ld;
   private wy QE;
   private HashMap wU = new HashMap();
   private HashMap fa = new HashMap();
   private Color zs = null;
   private Color mS = null;
   private Color OK = null;

   public fc(Display var1, String var2) {
      this.zs = var1.getSystemColor(2);
      this.mS = var1.getSystemColor(1);
      this.OK = this.dN.dN(230, 230, 250);
      if(var2.equals("<default>")) {
         this.dN(var1);
      } else {
         this.dN(var1, var2);
      }

   }

   private void dN(Display var1) {
      Color var2 = var1.getSystemColor(2);
      Color var3 = var1.getSystemColor(9);
      var1.getSystemColor(1);
      Color var4 = var1.getSystemColor(16);
      var1.getSystemColor(12);
      this.dN.dN(230, 230, 250);
      Color var5 = this.dN.dN(255, 255, 128);
      Color var6 = this.dN.dN(63, 127, 95);
      this.dN.dN(255, 153, 0);
      Color var7 = this.dN.dN(209, 71, 25);
      Color var8 = this.dN.dN(0, 138, 0);
      Color var9 = this.dN.dN(127, 0, 85);
      Color var10 = this.dN.dN(0, 0, 85);
      Color var11 = this.dN.dN(192, 192, 192);
      Color var12 = this.dN.dN(140, 100, 255);
      this.ld = new wy(var2);
      this.QE = new wy(var2);
      this.wU.put(fc.uK.dN, this.ld);
      this.fa.put(fc.uK.dN, this.QE);
      this.wU.put(fc.uK.ld, new wy(var6));
      this.fa.put(fc.uK.ld, new wy(var6));
      this.wU.put(fc.uK.QE, new wy(var11));
      this.fa.put(fc.uK.QE, new wy(var11));
      this.wU.put(fc.uK.wU, new wy(var4));
      this.fa.put(fc.uK.wU, new wy(var4));
      this.wU.put(fc.uK.fa, new wy(var9, (Color)null, true, false));
      this.fa.put(fc.uK.fa, new wy(var9, (Color)null, true, false));
      this.wU.put(fc.uK.zs, new wy(var9, (Color)null, true, false));
      this.fa.put(fc.uK.zs, new wy(var9, (Color)null, true, false));
      this.wU.put(fc.uK.mS, new wy(var2));
      this.fa.put(fc.uK.mS, new wy(var2, var5));
      this.wU.put(fc.uK.OK, new wy(var2));
      this.fa.put(fc.uK.OK, new wy(var2, var5));
      this.wU.put(fc.uK.LH, new wy(var4));
      this.fa.put(fc.uK.LH, new wy(var4, var5));
      this.wU.put(fc.uK.KK, new wy(var2));
      this.fa.put(fc.uK.KK, new wy(var2));
      this.wU.put(fc.uK.EO, new wy(var2));
      this.fa.put(fc.uK.EO, new wy(var2, var5));
      this.wU.put(fc.uK.cb, new wy(var8, (Color)null, true, false));
      this.fa.put(fc.uK.cb, new wy(var8, var5, true, false));
      this.wU.put(fc.uK.PF, new wy(var7, (Color)null, true, false));
      this.fa.put(fc.uK.PF, new wy(var7, var5, true, false));
      this.wU.put(fc.uK.Hw, new wy(var7, (Color)null, true, false));
      this.fa.put(fc.uK.Hw, new wy(var7, var5, true, false));
      this.wU.put(fc.uK.rK, new wy(var3));
      this.fa.put(fc.uK.rK, new wy(var3, var5));
      this.wU.put(fc.uK.Ux, new wy(var10, (Color)null, false, true));
      this.fa.put(fc.uK.Ux, new wy(var10, var5, false, true));
      this.wU.put(fc.uK.ZY, new wy(var2));
      this.fa.put(fc.uK.ZY, new wy(var2, var5));
      this.wU.put(fc.uK.s, new wy(var12));
      this.fa.put(fc.uK.s, new wy(var12, var5));
      this.wU.put(fc.uK.Hv, new wy(var3));
      this.fa.put(fc.uK.Hv, new wy(var3, var5));
      this.wU.put(fc.uK.VX, new wy(var2));
      this.fa.put(fc.uK.VX, new wy(var2, var5));
      this.wU.put(fc.uK.ci, new wy(var7));
      this.fa.put(fc.uK.ci, new wy(var7, var5));
      this.wU.put(fc.uK.bG, new wy(var6));
      this.fa.put(fc.uK.bG, new wy(var6, var5));
   }

   private void dN(Display var1, String var2) {
      String[] var3 = var2.split("\\|");
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         String[] var7 = var6.split("=");
         if(var7.length != 2) {
            cn.dN(String.format("Invalid style data: %s", new Object[]{ZF.QE(var6, true)}));
         } else if(var7[0].equals("FGCOLOR")) {
            this.zs = wy.dN(var1, var7[1]);
         } else if(var7[0].equals("BGCOLOR")) {
            this.mS = wy.dN(var1, var7[1]);
         } else if(var7[0].equals("CURRENT_LINE_BGCOLOR")) {
            this.OK = wy.dN(var1, var7[1]);
         } else {
            fc.uK var8;
            try {
               var8 = fc.uK.valueOf(var7[0]);
            } catch (Exception var10) {
               cn.dN(String.format("Invalid style type: %s", new Object[]{ZF.QE(var7[0], true)}));
               continue;
            }

            String[] var9 = var7[1].split(";");
            if(var9.length != 2) {
               cn.dN(String.format("Invalid style data: %s", new Object[]{ZF.QE(var7[1], true)}));
            } else {
               this.wU.put(var8, new wy(var1, var9[0]));
               this.fa.put(var8, new wy(var1, var9[1]));
            }
         }
      }

      this.ld = (wy)this.wU.get(fc.uK.dN);
      if(this.ld == null) {
         this.ld = new wy(var1.getSystemColor(2));
         this.wU.put(fc.uK.dN, this.ld);
      }

      this.QE = (wy)this.fa.get(fc.uK.dN);
      if(this.QE == null) {
         this.QE = new wy(var1.getSystemColor(2));
         this.fa.put(fc.uK.dN, this.QE);
      }

   }

   public wy dN(fc.uK var1) {
      wy var2 = (wy)this.wU.get(var1);
      return var2 != null?var2:this.ld;
   }

   public wy ld(fc.uK var1) {
      wy var2 = (wy)this.fa.get(var1);
      return var2 != null?var2:this.QE;
   }

   public Color dN() {
      return this.zs;
   }

   public void dN(Color var1) {
      this.mS = var1;
   }

   public Color ld() {
      return this.mS;
   }

   public void ld(Color var1) {
      this.OK = var1;
   }

   public Color QE() {
      return this.OK;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(String.format("FGCOLOR=%s|BGCOLOR=%s|CURRENT_LINE_BGCOLOR=%s|", new Object[]{wy.dN(this.zs), wy.dN(this.mS), wy.dN(this.OK)}));
      fc.uK[] var2 = fc.uK.values();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         fc.uK var5 = var2[var4];
         var1.append(String.format("%s=%s;%s|", new Object[]{var5, this.dN(var5), this.ld(var5)}));
      }

      return var1.toString();
   }

   public static enum uK {
      dN,
      ld,
      QE,
      wU,
      fa,
      zs,
      mS,
      OK,
      LH,
      KK,
      EO,
      cb,
      PF,
      Hw,
      rK,
      Ux,
      ZY,
      s,
      Hv,
      VX,
      ci,
      bG;
   }
}
