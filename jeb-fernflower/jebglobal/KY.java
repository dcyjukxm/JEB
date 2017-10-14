package jebglobal;

import jebglobal.CL;
import jebglobal.GM;
import jebglobal.Kf;
import jebglobal.YO;
import jebglobal.iR;

public final class KY extends YO implements CL {
   private int ld = 0;
   private String[] QE = new String[8];
   private String[] wU;
   private int[] fa;

   public KY(Kf var1, GM var2) {
      super(var1);
      this.wU = new String[this.QE.length];
      this.fa = new int[this.QE.length];
   }

   private void dN() {
      int var1 = this.ld > 7?2 * this.ld:8;
      String[] var2 = new String[var1];
      String[] var3 = new String[var1];
      int[] var4 = new int[var1];
      if(this.QE != null) {
         System.arraycopy(this.QE, 0, var2, 0, this.ld);
         System.arraycopy(this.wU, 0, var3, 0, this.ld);
         System.arraycopy(this.fa, 0, var4, 0, this.ld);
      }

      this.QE = var2;
      this.wU = var3;
      this.fa = var4;
   }

   public void dN(String var1, String var2) {
      super.dN.dN(var1, var2);
      int var3 = this.OK();

      for(int var4 = this.ld - 1; var4 >= 0 && this.fa[var4] > var3; --var4) {
         --this.ld;
      }

      if(this.ld >= this.QE.length) {
         this.dN();
      }

      this.QE[this.ld] = var1;
      this.wU[this.ld] = var2;
      ++this.ld;
   }

   public void dN(iR var1) {
      int var2 = var1.mS();
      switch(var2) {
      case 0:
         Boolean var3 = (Boolean)var1.dN("http://xmlpull.org/v1/doc/features.html#xmldecl-standalone");
         this.dN(var1.Hw(), var3);
         break;
      case 1:
         this.mS();
         break;
      case 2:
         this.ld(var1);
         break;
      case 3:
         this.QE(var1.EO(), var1.LH());
         break;
      case 4:
         if(var1.zs() > 0) {
            this.ld(var1.KK());
         } else {
            this.OK(var1.KK());
         }
         break;
      case 5:
         this.QE(var1.KK());
         break;
      case 6:
         this.wU(var1.LH());
         break;
      case 7:
         String var4 = var1.KK();
         this.OK(var4);
         break;
      case 8:
         this.fa(var1.KK());
         break;
      case 9:
         this.zs(var1.KK());
         break;
      case 10:
         this.mS(var1.KK());
      }

   }

   private void ld(iR var1) {
      int var2;
      if(!var1.ld("http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes")) {
         var2 = var1.dN(var1.zs() - 1);
         int var3 = var1.dN(var1.zs());

         for(int var4 = var2; var4 < var3; ++var4) {
            String var5 = var1.ld(var4);
            String var6 = var1.QE(var4);
            this.dN(var5, var6);
         }
      }

      this.ld(var1.EO(), var1.LH());

      for(var2 = 0; var2 < var1.PF(); ++var2) {
         this.dN(var1.wU(var2), var1.zs(var2), var1.OK(var2));
      }

   }
}
