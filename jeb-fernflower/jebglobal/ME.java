package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.BQ;
import jebglobal.Bw;
import jebglobal.CQ;
import jebglobal.DL;
import jebglobal.Nz;
import jebglobal.ZF;
import jebglobal.Zh;
import jebglobal.ew;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.hv;
import jebglobal.jt;
import jebglobal.nh;
import jebglobal.rT;
import jebglobal.xc;
import jebglobal.yK;

public final class ME extends xc {
   boolean dN;
   int ld;
   int QE;
   String wU;
   String fa;
   boolean zs;
   boolean mS;
   boolean OK;
   boolean LH;
   boolean KK;
   boolean EO;
   Nz cb;
   HashMap PF;
   List Hw;
   List rK;
   List Ux;
   ew ZY;

   public ME(jt var1) {
      super(var1);
      this.dN = true;
      this.ld = 0;
      this.QE = 0;
      this.wU = null;
      this.fa = null;
      this.zs = true;
      this.mS = false;
      this.OK = false;
      this.LH = false;
      this.KK = false;
      this.EO = false;
      this.cb = null;
      this.PF = new HashMap();
      this.Hw = new ArrayList();
      this.rK = new ArrayList();
      this.Ux = new ArrayList();
      this.ld("    ");
   }

   public ME() {
      this(new BQ());
   }

   public void dN(ew var1) {
      this.ZY = var1;
   }

   public void dN(boolean var1) {
      this.dN = var1;
   }

   public void dN(int var1) {
      this.ld = var1;
   }

   public void ld(int var1) {
      this.QE = var1;
   }

   public void dN(char var1, int var2) {
      this.wU = this.ld(var1, var2);
   }

   private String ld(char var1, int var2) {
      if(Character.isDefined(var1) && var2 > 0) {
         StringBuffer var3 = new StringBuffer("#");

         for(int var4 = 0; var4 < var2; ++var4) {
            var3.append(var1);
         }

         return var3.toString();
      } else {
         return null;
      }
   }

   public void ld(boolean var1) {
      this.zs = var1;
   }

   public void QE(boolean var1) {
      this.mS = var1;
   }

   public void wU(boolean var1) {
      if(var1) {
         this.mS = true;
      }

      this.OK = var1;
   }

   public void fa(boolean var1) {
      this.LH = var1;
   }

   public void zs(boolean var1) {
      this.KK = var1;
   }

   public void mS(boolean var1) {
      this.EO = var1;
   }

   public void dN(Nz var1) {
      this.cb = var1;
   }

   public int dN(String var1) {
      Integer var2 = (Integer)this.PF.get(var1);
      return var2 == null?-1:var2.intValue();
   }

   private String dN(List var1, int var2) {
      Iterator var3 = var1.iterator();

      ME.uK var4;
      do {
         if(!var3.hasNext()) {
            return null;
         }

         var4 = (ME.uK)var3.next();
      } while(var2 < var4.dN || var2 >= var4.ld);

      return var4.QE;
   }

   public String QE(int var1) {
      return this.dN(this.Hw, var1);
   }

   public String KK(int var1) {
      return this.dN(this.rK, var1);
   }

   public String EO(int var1) {
      return this.dN(this.Ux, var1);
   }

   void dN(CQ var1) {
      String var2 = var1.toString().replace('_', '-').toLowerCase();
      this.dN(var2, Zh.zs, var1);
   }

   void dN(rT var1) {
      String var2 = "." + var1.toString().replace("__", "-").replace('_', ' ').toLowerCase();
      this.dN(var2, Zh.fa, var1);
   }

   void dN(DL var1) {
      String var2 = "." + var1.toString().replace("__", "-").replace('_', ' ').toLowerCase();
      this.dN(var2, Zh.fa, var1);
   }

   void dN(AR var1, int var2) {
      String var3 = var1.ld(var2);
      String var4 = String.format("\"%s\"", new Object[]{ZF.QE(var3, !this.EO)});
      this.dN(var4, Zh.Hw, var3);
   }

   void ld(AR var1, int var2) {
      hO var3 = var1.mS(var2);
      this.dN(var1, var3.zs());
      this.wU("->");
      this.dN(var3.ld(true), Zh.ZY, var3);
      this.dN(var1, var3.OK());
   }

   void QE(AR var1, int var2) {
      gE var3 = var1.fa(var2);
      this.dN(var1, var3.zs());
      this.wU("->");
      this.dN(var3.QE(true), Zh.Ux, var3);
      this.wU(":");
      this.dN(var1, var3.mS());
   }

   void dN(AR var1, Bw var2) {
      this.wU("(");
      int var5;
      if(!this.EO) {
         int var3 = 0;
         nh.vd[] var4 = var2.mS();
         var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            nh.vd var7 = var4[var6];
            if(var3 >= 1) {
               this.wU(", ");
            }

            this.dN(var1, var7);
            ++var3;
         }
      } else {
         nh.vd[] var8 = var2.mS();
         int var9 = var8.length;

         for(var5 = 0; var5 < var9; ++var5) {
            nh.vd var10 = var8[var5];
            this.dN(var1, var10);
         }
      }

      this.wU(")");
      this.dN(var1, var2.fa());
   }

   void dN(AR var1, nh.vd var2, boolean var3) {
      String var4 = var2.zs();
      if(var4 != null) {
         Object var5 = var1.KK(var4);

         for(int var6 = 0; var6 < var2.wU(); ++var6) {
            this.wU("[");
         }

         Zh var7;
         String var8;
         if(var5 instanceof yK) {
            var8 = ((yK)var5).ld(true);
            var7 = Zh.rK;
         } else {
            var8 = var4;
            var7 = Zh.s;
         }

         if(!this.EO) {
            var8 = var8.substring(1, var8.length() - 1);
            var8 = var8.substring(var8.lastIndexOf(47) + 1);
         }

         this.dN(var8, var7, var3?1:0, var5, (Object)null);
      } else {
         this.wU(var2.dN(true));
      }

   }

   void dN(AR var1, nh.vd var2) {
      this.dN(var1, var2, false);
   }

   void dN(AR var1, int var2, boolean var3) {
      this.dN(var1, var1.QE(var2), var3);
   }

   void wU(AR var1, int var2) {
      this.dN(var1, var1.QE(var2), false);
   }

   public String dN(int var1, String var2, byte[] var3) {
      if(var2 != null && var2.indexOf(10) >= 0) {
         var2 = ZF.QE(var2, true);
      }

      String var4;
      if(var2 == null && var3 == null) {
         var4 = "";
      } else if(var2 != null && var3 == null) {
         var4 = "  # " + var2;
      } else if(var2 == null && var3 != null) {
         var4 = "  #(!)";
      } else {
         var4 = "  #(!) " + var2;
      }

      List var5 = this.fa(var1);
      if(var5 != null && !var5.isEmpty() && ((hv)var5.get(var5.size() - 1)).dN() == Zh.ld) {
         this.dN(var1, var5.size() - 1, var4);
      } else {
         this.dN(var1, var4, Zh.ld, 0, (Object)null, (Object)null);
      }

      return var4;
   }

   public static class uK {
      int dN;
      int ld;
      String QE;

      public uK(String var1, int var2, int var3) {
         this.QE = var1;
         this.dN = var2;
         this.ld = var3;
      }
   }
}
