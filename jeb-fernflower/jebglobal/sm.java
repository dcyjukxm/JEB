package jebglobal;

import jebglobal.Kf;
import jebglobal.LI;
import jebglobal.Mt;
import jebglobal.PS;
import jebglobal.UD;
import jebglobal.Vi;
import jebglobal.Vp;
import jebglobal.cN;
import jebglobal.dN;
import jebglobal.dx;
import jebglobal.fv;
import jebglobal.jl;
import jebglobal.zX;

public class sm extends Vi implements Mt {
   private final int ld;
   private final Integer QE;
   private final Integer wU;
   private final Boolean fa;

   sm(UD var1, int var2, Integer var3, Integer var4, Boolean var5) {
      super(var1);
      this.ld = var2;
      this.QE = var3;
      this.wU = var4;
      this.fa = var5;
   }

   public String dN(fv var1) {
      return null;
   }

   public void dN(Kf var1, dx var2) {
      String var3 = this.dN();
      var1.ld((String)null, "attr");
      var1.dN((String)null, "name", var2.QE().fa());
      if(var3 != null) {
         var1.dN((String)null, "format", var3);
      }

      if(this.QE != null) {
         var1.dN((String)null, "min", this.QE.toString());
      }

      if(this.wU != null) {
         var1.dN((String)null, "max", this.wU.toString());
      }

      if(this.fa != null && this.fa.booleanValue()) {
         var1.dN((String)null, "localization", "suggested");
      }

      this.ld(var1, var2);
      var1.QE((String)null, "attr");
   }

   public static sm dN(UD var0, PS[] var1, dN var2, cN var3) {
      int var4 = ((Vp)var1[0].ld).ld();
      int var5 = var4 & '\uffff';
      Integer var6 = null;
      Integer var7 = null;
      Boolean var8 = null;

      int var9;
      label42:
      for(var9 = 1; var9 < var1.length; ++var9) {
         switch(((Integer)var1[var9].dN).intValue()) {
         case 16777217:
            var6 = Integer.valueOf(((Vp)var1[var9].ld).ld());
            break;
         case 16777218:
            var7 = Integer.valueOf(((Vp)var1[var9].ld).ld());
            break;
         case 16777219:
            var8 = Boolean.valueOf(((Vp)var1[var9].ld).ld() != 0);
            break;
         default:
            break label42;
         }
      }

      if(var9 == var1.length) {
         return new sm(var0, var5, var6, var7, var8);
      } else {
         PS[] var10 = new PS[var1.length - var9];

         for(int var11 = 0; var9 < var1.length; ++var9) {
            int var12 = ((Integer)var1[var9].dN).intValue();
            var3.dN(var12);
            var10[var11++] = new PS(var2.dN(var12, (String)null), (Vp)var1[var9].ld);
         }

         switch(var4 & 16711680) {
         case 65536:
            return new jl(var0, var5, var6, var7, var8, var10);
         case 131072:
            return new LI(var0, var5, var6, var7, var8, var10);
         default:
            throw new zX();
         }
      }
   }

   protected void ld(Kf var1, dx var2) {
   }

   protected String dN() {
      String var1 = "";
      if((this.ld & 1) != 0) {
         var1 = var1 + "|reference";
      }

      if((this.ld & 2) != 0) {
         var1 = var1 + "|string";
      }

      if((this.ld & 4) != 0) {
         var1 = var1 + "|integer";
      }

      if((this.ld & 8) != 0) {
         var1 = var1 + "|boolean";
      }

      if((this.ld & 16) != 0) {
         var1 = var1 + "|color";
      }

      if((this.ld & 32) != 0) {
         var1 = var1 + "|float";
      }

      if((this.ld & 64) != 0) {
         var1 = var1 + "|dimension";
      }

      if((this.ld & 128) != 0) {
         var1 = var1 + "|fraction";
      }

      return var1.isEmpty()?null:var1.substring(1);
   }
}
