package jebglobal;

import jebglobal.AR;
import jebglobal.Dw;
import jebglobal.Fu;
import jebglobal.GH;
import jebglobal.OX;
import jebglobal.hV;
import jebglobal.kn;
import jebglobal.zd;

public final class Yx {
   AR dN;
   hV.uK ld;
   kn.vd QE;
   OX.vd wU;
   zd.uK fa;
   Fu.uK zs;
   Dw.uK mS;
   private GH OK;

   public Yx(AR var1) {
      this.dN = var1;
      this.ld = new hV.uK();
      this.QE = new kn.vd();
      this.wU = new OX.vd(this.ld);
      this.fa = new zd.uK(var1, this.ld, this.wU);
      this.zs = new Fu.uK(var1, this.ld, this.fa, this.wU);
      this.mS = new Dw.uK(var1, this.ld, this.fa, this.wU);
      this.OK = new GH(var1, this.ld, this.wU, this.zs, this.mS);
      this.fa.dN(this.OK);
      this.zs.dN(this.OK);
      this.mS.dN(this.OK);
   }

   public AR dN() {
      return this.dN;
   }

   public hV.uK ld() {
      return this.ld;
   }

   public kn.vd QE() {
      return this.QE;
   }

   public OX.vd wU() {
      return this.wU;
   }

   public Fu.uK fa() {
      return this.zs;
   }

   public Dw.uK zs() {
      return this.mS;
   }
}
