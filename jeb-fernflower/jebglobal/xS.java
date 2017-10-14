package jebglobal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.Cs;
import jebglobal.Dq;
import jebglobal.EG;
import jebglobal.GS;
import jebglobal.II;
import jebglobal.KO;
import jebglobal.Qz;
import jebglobal.Rx;
import jebglobal.TB;
import jebglobal.Ts;
import jebglobal.XM;
import jebglobal.Xf;
import jebglobal.ZF;
import jebglobal.bm;
import jebglobal.cq;
import jebglobal.hV;
import jebglobal.ie;
import jebglobal.iz;
import jebglobal.kn;
import jebglobal.lk;
import jebglobal.mA;
import jebglobal.sX;
import jebglobal.tE;
import jebglobal.tu;
import jebglobal.vC;
import jebglobal.vE;
import jebglobal.xy;
import jebglobal.yX;

public final class xS implements bm {
   private static final long LK = 844563159190538443L;
   private Qz dN;
   private GS ld;
   private GS QE;
   private int wU = -1;
   private int fa = 1;
   private int zs = -1;
   private boolean mS = false;

   public xS(Qz var1, GS var2, GS var3) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
      switch(xS.SyntheticClass_1.dN[var1.ordinal()]) {
      case 1:
         if(!(var2 instanceof Ts) || !(var3 instanceof tu)) {
            throw new RuntimeException();
         }
         break;
      case 2:
         if(!(var2 instanceof Cs) || var3 != null) {
            throw new RuntimeException();
         }
         break;
      case 3:
         if(!(var2 instanceof Cs) || !(var3 instanceof vC)) {
            throw new RuntimeException();
         }
         break;
      case 4:
         if(!(var2 instanceof iz) || !(var3 instanceof tu)) {
            throw new RuntimeException();
         }
         break;
      case 5:
         if(var2 != null || var3 != null && !(var3 instanceof tu)) {
            throw new RuntimeException();
         }
         break;
      case 6:
         if(var2 != null || !(var3 instanceof yX)) {
            throw new RuntimeException();
         }
         break;
      case 7:
         if(var2 != null || !(var3 instanceof tu)) {
            throw new RuntimeException();
         }
         break;
      case 8:
         if(!(var2 instanceof xy) || var3 != null) {
            throw new RuntimeException();
         }
         break;
      case 9:
      case 10:
         if(var2 != null || !(var3 instanceof tu)) {
            throw new RuntimeException();
         }
         break;
      default:
         throw new RuntimeException();
      }

   }

   public Qz wU() {
      return this.dN;
   }

   public GS fa() {
      return this.ld;
   }

   public GS zs() {
      return this.QE;
   }

   public int dN() {
      return this.wU;
   }

   public void dN(int var1) {
      this.wU = var1;
   }

   public int mS() {
      return this.zs;
   }

   public void ld(int var1) {
      this.zs = var1;
   }

   public int ld() {
      return this.fa;
   }

   public void QE(int var1) {
      if(var1 <= 0) {
         throw new RuntimeException();
      } else {
         this.fa = var1;
      }
   }

   public void wU(int var1) {
      if(this.fa + var1 <= 0) {
         throw new RuntimeException();
      } else {
         this.fa += var1;
      }
   }

   public void dN(boolean var1) {
      this.mS = var1;
   }

   public boolean QE() {
      return this.mS;
   }

   public boolean dN(tu var1) {
      if(this.dN != Qz.dN) {
         return false;
      } else {
         this.QE = var1;
         return true;
      }
   }

   public boolean OK() {
      if(this.dN == Qz.dN && this.ld instanceof xy && this.QE instanceof yX) {
         this.dN = Qz.ld;
         this.ld = null;
         return true;
      } else {
         return false;
      }
   }

   public boolean LH() {
      if(this.dN != Qz.wU) {
         return false;
      } else {
         this.dN = Qz.QE;
         this.QE = null;
         return true;
      }
   }

   public boolean KK() {
      if(this.dN != Qz.fa) {
         return false;
      } else {
         iz var1 = (iz)this.ld;
         if(var1.dN() != 1) {
            return false;
         } else {
            int var2 = ((Integer)var1.ld().iterator().next()).intValue();
            Cs var3 = (Cs)var1.QE().iterator().next();
            tu var4 = (tu)this.QE;
            this.dN = Qz.wU;
            this.ld = var3;
            this.QE = new vC(var4, kn.Hv, new ie((long)var2, var4.dN()));
            return true;
         }
      }
   }

   public iz EO() {
      return this.dN != Qz.fa?null:(iz)this.ld;
   }

   public boolean fa(int var1) {
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 2:
      case 3:
         ((Cs)this.ld).dN(var1);
         return true;
      case 4:
      case 5:
      case 7:
         return false;
      case 6:
      default:
         return false;
      }
   }

   public int cb() {
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 2:
      case 3:
         return ((Cs)this.ld).dN();
      case 4:
      case 5:
      case 7:
         return -1;
      case 6:
      default:
         return -1;
      }
   }

   public boolean dN(List var1) {
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 2:
         if(var1 != null) {
            var1.add(Integer.valueOf(((Cs)this.ld).dN()));
         }

         return true;
      case 3:
         if(var1 != null) {
            var1.add(Integer.valueOf(this.wU + this.fa));
            var1.add(Integer.valueOf(((Cs)this.ld).dN()));
         }

         return true;
      case 4:
         if(var1 != null) {
            var1.add(Integer.valueOf(this.wU + this.fa));
            Iterator var2 = ((iz)this.ld).QE().iterator();

            while(var2.hasNext()) {
               Cs var3 = (Cs)var2.next();
               var1.add(Integer.valueOf(var3.dN()));
            }
         }

         return true;
      case 5:
      case 7:
         return true;
      case 6:
      default:
         return false;
      }
   }

   public void dN(List var1, List var2, Object var3) {
      var1.clear();
      var2.clear();
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         HashSet var4 = this.ld.fa();
         if(this.ld instanceof xy) {
            var1.addAll(var4);
         } else {
            var2.addAll(var4);
         }

         var2.addAll(this.QE.fa());
      case 2:
         break;
      case 3:
      case 4:
         var2.addAll(this.QE.fa());
         break;
      case 5:
         if(this.QE != null) {
            var2.addAll(this.QE.fa());
         }
         break;
      case 6:
         var2.addAll(this.QE.fa());
         break;
      case 7:
         var2.addAll(this.QE.fa());
         break;
      case 8:
         var1.addAll(this.ld.fa());
         break;
      case 9:
      case 10:
         var2.addAll(this.QE.fa());
         break;
      default:
         throw new RuntimeException();
      }

   }

   public hV zs(int var1) {
      hV var2 = hV.dN;
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         if(this.ld instanceof xy) {
            var2 = ((xy)this.ld).dN(var1);
         }
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 9:
      case 10:
         break;
      case 8:
         var2 = ((xy)this.ld).dN(var1);
         break;
      default:
         throw new RuntimeException();
      }

      if(var2 == hV.dN) {
         throw new RuntimeException();
      } else {
         return var2;
      }
   }

   public boolean dN(int var1, hV var2) {
      boolean var3 = false;
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         if(this.ld instanceof xy) {
            var3 = ((xy)this.ld).dN(var1, var2);
            if(var3) {
               hV var4 = ((xy)this.ld).dN();
               if(var4.cb()) {
                  ((tu)this.QE).dN(hV.dN(var4, false));
               }
            }
         }
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 9:
      case 10:
         break;
      case 8:
         var3 = ((xy)this.ld).dN(var1, var2);
         break;
      default:
         throw new RuntimeException();
      }

      return var3;
   }

   public hV mS(int var1) {
      hV var2 = hV.dN;
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         var2 = ((tu)this.QE).dN(var1);
         if(!(this.ld instanceof xy)) {
            hV var3 = ((Ts)this.ld).dN(var1);
            var2 = hV.dN(var2, var3);
         }
      case 2:
      case 8:
         break;
      case 3:
         var2 = ((vC)this.QE).dN(var1);
         break;
      case 4:
         var2 = ((tu)this.QE).dN(var1);
         break;
      case 5:
         if(this.QE != null) {
            var2 = ((tu)this.QE).dN(var1);
         }
         break;
      case 6:
         var2 = ((tu)this.QE).dN(var1);
         break;
      case 7:
         var2 = ((tu)this.QE).dN(var1);
         break;
      case 9:
      case 10:
         var2 = ((tu)this.QE).dN(var1);
         break;
      default:
         throw new RuntimeException();
      }

      if(var2 == hV.dN) {
         throw new RuntimeException();
      } else {
         return var2;
      }
   }

   public boolean ld(int var1, hV var2) {
      boolean var3 = false;
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         var3 = ((tu)this.QE).dN(var1, var2);
         if(var3) {
            hV var4 = ((tu)this.QE).dN();
            if(var4.cb()) {
               ((Ts)this.ld).dN(hV.dN(var4, true));
            }
         }

         if(!(this.ld instanceof xy)) {
            boolean var6 = ((Ts)this.ld).dN(var1, var2);
            if(var6) {
               hV var5 = ((tu)this.ld).dN();
               if(var5.cb()) {
                  ((tu)this.QE).dN(hV.dN(var5, false));
               }

               var3 = true;
            }
         }
      case 2:
      case 8:
         break;
      case 3:
         var3 = ((vC)this.QE).dN(var1, var2);
         break;
      case 4:
         var3 = ((tu)this.QE).dN(var1, var2);
         break;
      case 5:
         if(this.QE != null) {
            var3 = ((tu)this.QE).dN(var1, var2);
         }
         break;
      case 6:
         var3 = ((tu)this.QE).dN(var1, var2);
         break;
      case 7:
         var3 = ((tu)this.QE).dN(var1, var2);
         break;
      case 9:
      case 10:
         var3 = ((tu)this.QE).dN(var1, var2);
         break;
      default:
         throw new RuntimeException();
      }

      return var3;
   }

   public boolean PF() {
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         return ((tu)this.QE).ld() || ((Ts)this.ld).ld();
      case 2:
         return false;
      case 3:
         return ((vC)this.QE).ld();
      case 4:
         return ((tu)this.QE).ld();
      case 5:
         return this.QE == null?false:((tu)this.QE).ld();
      case 6:
         return ((tu)this.QE).ld();
      case 7:
         return ((tu)this.QE).ld();
      case 8:
         return ((xy)this.ld).ld();
      case 9:
      case 10:
         return ((tu)this.QE).ld();
      default:
         throw new RuntimeException();
      }
   }

   public boolean Hw() {
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         return ((tu)this.QE).QE() || ((Ts)this.ld).QE();
      case 2:
         return false;
      case 3:
         return ((vC)this.QE).QE();
      case 4:
         return ((tu)this.QE).QE();
      case 5:
         return this.QE == null?false:((tu)this.QE).QE();
      case 6:
         return ((tu)this.QE).QE();
      case 7:
         return ((tu)this.QE).QE();
      case 8:
         return ((xy)this.ld).QE();
      case 9:
      case 10:
         return ((tu)this.QE).QE();
      default:
         throw new RuntimeException();
      }
   }

   public int dN(xy var1) {
      int var2 = 0;
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         if(!(this.ld instanceof xy)) {
            var2 = ((Ts)this.ld).dN(var1);
         }

         var2 += ((tu)this.QE).dN(var1);
      case 2:
      case 8:
         break;
      case 3:
         var2 = ((vC)this.QE).dN(var1);
         break;
      case 4:
         var2 = ((tu)this.QE).dN(var1);
         break;
      case 5:
         if(this.QE != null) {
            var2 = ((tu)this.QE).dN(var1);
         }
         break;
      case 6:
         var2 = ((tu)this.QE).dN(var1);
         break;
      case 7:
         var2 = ((tu)this.QE).dN(var1);
         break;
      case 9:
      case 10:
         var2 = ((tu)this.QE).dN(var1);
         break;
      default:
         throw new RuntimeException();
      }

      return var2;
   }

   public int dN(xy var1, long var2) {
      int var4 = 0;
      hV var5;
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         if(!(this.ld instanceof xy)) {
            var4 = 0 + ((tu)this.ld).dN(var1, var2);
         }

         if(this.QE instanceof xy) {
            if(var1.QE((xy)this.QE)) {
               var5 = ((xy)this.QE).dN();
               if(ie.ld(var5)) {
                  this.QE = new ie(var2, var5);
                  ++var4;
               }
            }
         } else {
            var4 += ((tu)this.QE).dN(var1, var2);
         }
      case 2:
      case 8:
         break;
      case 3:
         var4 = 0 + ((vC)this.QE).dN(var1, var2);
         break;
      case 4:
         if(this.QE instanceof xy) {
            if(var1.QE((xy)this.QE)) {
               var5 = ((xy)this.QE).dN();
               if(ie.ld(var5)) {
                  this.QE = new ie(var2, var5);
                  ++var4;
               }
            }
         } else {
            var4 = 0 + ((tu)this.QE).dN(var1, var2);
         }
         break;
      case 5:
         if(this.QE instanceof xy) {
            if(var1.QE((xy)this.QE)) {
               var5 = ((xy)this.QE).dN();
               if(ie.ld(var5)) {
                  this.QE = new ie(var2, var5);
                  ++var4;
               }
            }
         } else if(this.QE != null) {
            var4 = 0 + ((tu)this.QE).dN(var1, var2);
         }
         break;
      case 6:
         var4 = 0 + ((tu)this.QE).dN(var1, var2);
         break;
      case 7:
         if(this.QE instanceof xy) {
            if(var1.QE((xy)this.QE)) {
               var5 = ((xy)this.QE).dN();
               if(ie.ld(var5)) {
                  this.QE = new ie(var2, var5);
                  ++var4;
               }
            }
         } else {
            var4 = 0 + ((tu)this.QE).dN(var1, var2);
         }
         break;
      case 9:
      case 10:
         if(this.QE instanceof xy) {
            if(var1.QE((xy)this.QE)) {
               var5 = ((xy)this.QE).dN();
               if(ie.ld(var5)) {
                  this.QE = new ie(var2, var5);
                  ++var4;
               }
            }
         } else {
            var4 = 0 + ((tu)this.QE).dN(var1, var2);
         }
         break;
      default:
         throw new RuntimeException();
      }

      return var4;
   }

   public int dN(xy var1, tu var2) {
      int var3 = 0;
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         if(!(this.ld instanceof xy)) {
            var3 = 0 + ((tu)this.ld).dN(var1, var2);
         }

         if(this.QE instanceof xy) {
            if(var1.ld((xy)this.QE)) {
               this.QE = var2;
               ++var3;
            }
         } else {
            var3 += ((tu)this.QE).dN(var1, var2);
         }
      case 2:
      case 8:
         break;
      case 3:
         var3 = 0 + ((vC)this.QE).dN(var1, var2);
         break;
      case 4:
         if(this.QE instanceof xy) {
            if(var1.ld((xy)this.QE)) {
               this.QE = var2;
               ++var3;
            }
         } else {
            var3 = 0 + ((tu)this.QE).dN(var1, var2);
         }
         break;
      case 5:
         if(this.QE instanceof xy) {
            if(var1.ld((xy)this.QE)) {
               this.QE = var2;
               ++var3;
            }
         } else if(this.QE != null) {
            var3 = 0 + ((tu)this.QE).dN(var1, var2);
         }
         break;
      case 6:
         var3 = 0 + ((tu)this.QE).dN(var1, var2);
         break;
      case 7:
         if(this.QE instanceof xy) {
            if(var1.ld((xy)this.QE)) {
               this.QE = var2;
               ++var3;
            }
         } else {
            var3 = 0 + ((tu)this.QE).dN(var1, var2);
         }
         break;
      case 9:
      case 10:
         if(this.QE instanceof xy) {
            if(var1.ld((xy)this.QE)) {
               this.QE = var2;
               ++var3;
            }
         } else {
            var3 = 0 + ((tu)this.QE).dN(var1, var2);
         }
         break;
      default:
         throw new RuntimeException();
      }

      return var3;
   }

   public void dN(hV var1, hV var2) {
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         ((Ts)this.ld).dN(var1, var2);
         ((tu)this.QE).dN(var1, var2);
      case 2:
         break;
      case 3:
         ((vC)this.QE).dN(var1, var2);
         break;
      case 4:
         ((tu)this.QE).dN(var1, var2);
         break;
      case 5:
         if(this.QE != null) {
            ((tu)this.QE).dN(var1, var2);
         }
         break;
      case 6:
         ((tu)this.QE).dN(var1, var2);
         break;
      case 7:
         ((tu)this.QE).dN(var1, var2);
         break;
      case 8:
         ((xy)this.ld).dN(var1, var2);
         break;
      case 9:
      case 10:
         ((tu)this.QE).dN(var1, var2);
         break;
      default:
         throw new RuntimeException();
      }

   }

   public List rK() {
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         return ZF.dN(new tu[]{(Ts)this.ld, (tu)this.QE});
      case 2:
         return ZF.dN(new tu[0]);
      case 3:
         return ZF.dN(new tu[]{(vC)this.QE});
      case 4:
         return ZF.dN(new tu[]{(tu)this.QE});
      case 5:
         return ZF.dN(new tu[]{(tu)this.QE});
      case 6:
         return ZF.dN(new tu[]{(tu)this.QE});
      case 7:
         return ZF.dN(new tu[]{(tu)this.QE});
      case 8:
         return ZF.dN(new tu[]{(xy)this.ld});
      case 9:
      case 10:
         return ZF.dN(new tu[]{(tu)this.QE});
      default:
         throw new RuntimeException();
      }
   }

   public boolean dN(tu var1, tu var2) {
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         if(this.ld == var1) {
            this.ld = var2;
            return true;
         }

         if(this.QE == var1) {
            this.QE = var2;
            return true;
         }
      case 2:
         break;
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 9:
      case 10:
         if(this.QE == var1) {
            this.QE = var2;
            return true;
         }
         break;
      case 8:
         if(this.ld == var1) {
            this.ld = var2;
            return true;
         }
         break;
      default:
         throw new RuntimeException();
      }

      return false;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         var1.append(String.format("%s = %s", new Object[]{this.ld, this.QE}));
         break;
      case 2:
         var1.append(String.format("jump %s", new Object[]{this.ld}));
         break;
      case 3:
         var1.append(String.format("jcond %s, %s", new Object[]{this.ld, this.QE}));
         break;
      case 4:
         var1.append(String.format("switch %s, %s", new Object[]{this.ld, this.QE}));
         break;
      case 5:
         var1.append("return");
         if(this.QE != null) {
            var1.append(" " + this.QE);
         }
         break;
      case 6:
         var1.append(this.QE);
         break;
      case 7:
         var1.append(String.format("throw %s", new Object[]{this.QE}));
         break;
      case 8:
         var1.append(String.format("catch %s", new Object[]{this.ld}));
         break;
      case 9:
         var1.append(String.format("monitor-enter %s", new Object[]{this.QE}));
         break;
      case 10:
         var1.append(String.format("monitor-exit %s", new Object[]{this.QE}));
         break;
      default:
         throw new RuntimeException();
      }

      return var1.toString();
   }

   public II dN(TB var1) {
      ArrayList var3 = new ArrayList(2);
      var1.EO = this;
      Object var2;
      Xf var4;
      int var15;
      switch(xS.SyntheticClass_1.dN[this.dN.ordinal()]) {
      case 1:
         if(this.ld instanceof xy) {
            var1.cb = true;
            var4 = ((xy)this.ld).dN(var1);
            var1.cb = false;
         } else {
            var4 = ((Ts)this.ld).dN(var1);
         }

         Xf var13 = ((tu)this.QE).dN(var1);
         var2 = new XM((Rx)var4, var13);
         break;
      case 2:
         var15 = ((Cs)this.ld).dN();
         var2 = new KO(var1.KK.dN(var15, "label_" + var15));
         break;
      case 3:
         var15 = ((Cs)this.ld).dN();
         KO var12 = new KO(var1.KK.dN(var15, "label_" + var15));
         var3.add(var12);
         lk var16 = (lk)((vC)this.QE).dN(var1);
         var2 = new tE(var16, var12);
         break;
      case 4:
         var4 = ((tu)this.QE).dN(var1);
         Dq var5 = new Dq(var4);
         List var6 = ((iz)this.ld).QE();
         Iterator var7 = var6.iterator();

         while(var7.hasNext()) {
            Cs var8 = (Cs)var7.next();
            List var9 = ((iz)this.ld).dN(var8);
            int var10 = var8.dN();
            KO var11 = new KO(var1.KK.dN(var10, "label_" + var10));
            var3.add(var11);
            var5.dN(var9, new EG(var11));
         }

         var2 = var5;
         break;
      case 5:
         var4 = null;
         if(this.QE != null) {
            var4 = ((tu)this.QE).dN(var1);
         }

         var2 = new cq(var4);
         break;
      case 6:
         var2 = (II)((tu)this.QE).dN(var1);
         break;
      case 7:
         var4 = ((tu)this.QE).dN(var1);
         var2 = new vE(var4);
         break;
      case 8:
         var1.cb = true;
         var4 = ((xy)this.ld).dN(var1);
         var1.cb = false;
         var2 = new sX(var4);
         break;
      case 9:
      case 10:
         var4 = ((tu)this.QE).dN(var1);
         var2 = new mA(this.dN == Qz.LH, var4);
         break;
      default:
         throw new RuntimeException();
      }

      if(var2 != null) {
         var3.add(var2);
      }

      Iterator var17 = var3.iterator();

      while(var17.hasNext()) {
         II var14 = (II)var17.next();
         var14.dN(this.wU, this.fa);
         var14.dN(this.zs);
      }

      var1.EO = null;
      return (II)var2;
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[Qz.values().length];

      static {
         try {
            dN[Qz.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            dN[Qz.QE.ordinal()] = 2;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            dN[Qz.wU.ordinal()] = 3;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            dN[Qz.fa.ordinal()] = 4;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            dN[Qz.zs.ordinal()] = 5;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            dN[Qz.ld.ordinal()] = 6;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            dN[Qz.mS.ordinal()] = 7;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            dN[Qz.OK.ordinal()] = 8;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            dN[Qz.LH.ordinal()] = 9;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[Qz.KK.ordinal()] = 10;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }
}
