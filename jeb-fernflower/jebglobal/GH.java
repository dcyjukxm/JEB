package jebglobal;

import java.util.ArrayList;
import jebglobal.AR;
import jebglobal.Dw;
import jebglobal.Fu;
import jebglobal.Np;
import jebglobal.OX;
import jebglobal.Xf;
import jebglobal.hV;
import jebglobal.jK;
import jebglobal.ub;

public final class GH {
   private AR dN;
   private hV.uK ld;
   private OX.vd QE;
   private Dw.uK wU;

   public GH(AR var1, hV.uK var2, OX.vd var3, Fu.uK var4, Dw.uK var5) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
      this.wU = var5;
   }

   public Xf dN(ub var1) {
      String var8;
      Dw var9;
      switch(var1.dN()) {
      case 0:
         return this.QE.dN(var1.QE());
      case 1:
      case 5:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      default:
         return this.QE.dN(String.format("<_unknown_vt=%d>", new Object[]{Integer.valueOf(var1.dN())}));
      case 2:
         return this.QE.dN(var1.wU());
      case 3:
         return this.QE.dN(var1.fa());
      case 4:
         return this.QE.dN(var1.zs());
      case 6:
         return this.QE.dN(var1.mS());
      case 16:
         return this.QE.dN(var1.OK());
      case 17:
         return this.QE.dN(var1.LH());
      case 23:
         return this.QE.dN(this.dN.ld(var1.KK()));
      case 24:
         var8 = this.dN.dN(var1.EO(), false);
         var9 = this.wU.dN(-1);
         return new Np(this.ld.dN(var8), var9);
      case 25:
         return this.QE.dN("<_field>");
      case 26:
         return this.QE.dN("<_method>");
      case 27:
         var8 = this.dN.fa(var1.Hw()).dN(false);
         var9 = this.wU.dN(var1.Hw());
         return new Np(this.ld.dN(var8), var9);
      case 28:
         ArrayList var2 = new ArrayList();
         ub[] var3 = var1.rK();
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            ub var6 = var3[var5];
            Xf var7 = this.dN(var6);
            var2.add(var7);
         }

         return new jK((hV)null, false, var2);
      case 29:
         return this.QE.dN("<_subannotation>");
      case 30:
         return this.QE.dN();
      case 31:
         return this.QE.dN(var1.ZY());
      }
   }
}
