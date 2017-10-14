package jebglobal;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.BQ;
import jebglobal.OD;
import jebglobal.Oa;
import jebglobal.PL;
import jebglobal.ZF;
import jebglobal.Zh;
import jebglobal.ew;
import jebglobal.hV;
import jebglobal.hv;
import jebglobal.js;
import jebglobal.jt;
import jebglobal.lM;
import jebglobal.oc;
import jebglobal.xc;
import jebglobal.zd;

public final class ZL extends xc {
   private zd.uK EO;
   private zd cb;
   boolean dN;
   boolean ld;
   boolean QE;
   boolean wU;
   boolean fa;
   boolean zs;
   boolean mS;
   AR OK;
   ew LH;
   private int PF;
   Deque KK;
   private int Hw;
   private OD rK;

   public ZL(jt var1) {
      super(var1);
      this.EO = null;
      this.cb = null;
      this.dN = false;
      this.ld = false;
      this.QE = false;
      this.wU = false;
      this.fa = false;
      this.zs = true;
      this.mS = true;
      this.KK = new ArrayDeque();
      this.Hw = -1;
      this.rK = null;
      this.ld("    ");
   }

   public ZL() {
      this(new BQ());
   }

   public void dN(boolean var1) {
      this.ld = var1;
   }

   public void ld(boolean var1) {
      this.QE = var1;
   }

   public void QE(boolean var1) {
      this.wU = var1;
   }

   public void wU(boolean var1) {
      this.dN = var1;
   }

   public void fa(boolean var1) {
      this.fa = var1;
   }

   public void zs(boolean var1) {
      this.zs = var1;
   }

   public void mS(boolean var1) {
      this.mS = var1;
   }

   public void dN(zd var1) {
      this.cb = var1;
   }

   public zd dN() {
      return this.cb;
   }

   public void dN(AR var1) {
      this.OK = var1;
   }

   public void dN(ew var1) {
      this.LH = var1;
   }

   public void dN(zd.uK var1) {
      this.EO = var1;
   }

   public zd dN(hV var1) {
      return this.EO == null?null:(!var1.mS()?null:this.EO.dN(var1.dN()));
   }

   void dN(int var1) {
      this.PF = var1;
   }

   int ld() {
      return this.PF;
   }

   private PL KK(int var1) {
      PL var2 = null;
      if(!this.KK.isEmpty()) {
         js var3 = (js)this.KK.peek();
         var2 = new PL(var3.dN(), var3.ld(), var1);
      }

      return var2;
   }

   public void QE() {
      this.ld(this.Hw);
   }

   public void ld(int var1) {
      this.Hw = -1;
      if(this.rK != null) {
         this.dN(this.rK);
         this.rK = null;
      }

      super.dN((Oa)this.KK(var1));
   }

   void dN(oc var1) {
      this.dN(var1.toString().toLowerCase(), Zh.zs, var1);
   }

   void dN(OD var1) {
      if(var1 != null) {
         String var2 = var1.PF();
         byte[] var3 = var1.Hw();
         if(var2 != null || var3 != null) {
            String var4 = "  //";
            var4 = var4 + (var3 != null?"(!) ":" ");
            var4 = var4 + (var2 != null?var2:"");
            this.dN(var4, Zh.ld);
         }
      }

   }

   void QE(int var1) {
      this.Hw = var1;
   }

   void ld(OD var1) {
      this.rK = var1;
   }

   public String dN(int var1, String var2, byte[] var3) {
      if(var2 != null && var2.indexOf(10) >= 0) {
         var2 = ZF.QE(var2, true);
      }

      String var4;
      if(var2 == null && var3 == null) {
         var4 = "";
      } else if(var2 != null && var3 == null) {
         var4 = "  // " + var2;
      } else if(var2 == null && var3 != null) {
         var4 = "  //(!)";
      } else {
         var4 = "  //(!) " + var2;
      }

      List var5 = this.fa(var1);
      if(var5 != null && !var5.isEmpty() && ((hv)var5.get(var5.size() - 1)).dN() == Zh.ld) {
         this.dN(var1, var5.size() - 1, var4);
      } else {
         this.dN(var1, var4, Zh.ld, 0, (Object)null, (Object)null);
      }

      return var4;
   }

   void dN(List var1) {
      for(Iterator var2 = var1.iterator(); var2.hasNext(); this.s()) {
         lM var3 = (lM)var2.next();
         this.wU("@");
         oc.dN(this, var3.dN());
         List var4 = var3.ld();
         if(!var4.isEmpty()) {
            this.wU("(");
            int var5 = 0;
            Iterator var6 = var4.iterator();

            while(var6.hasNext()) {
               lM.uK var7 = (lM.uK)var6.next();
               if(var5++ > 0) {
                  this.wU(", ");
               }

               this.wU(var7.dN().cb());
               this.wU("=");
               var7.ld().dN(this);
            }

            this.wU(")");
         }
      }

   }
}
