package jebglobal;

import java.util.HashSet;
import java.util.List;
import jebglobal.Gy;
import jebglobal.TB;
import jebglobal.Xf;
import jebglobal.ZF;
import jebglobal.hV;
import jebglobal.ie;
import jebglobal.kn;
import jebglobal.tu;
import jebglobal.xy;

public class lB extends tu {
   private tu ld;
   private kn QE;
   private tu wU;
   private boolean fa;

   public lB(tu var1, kn var2, tu var3) {
      if(var3 != null && var2 != null) {
         if(var1 == null && var2.QE()) {
            throw new RuntimeException();
         } else if(var1 != null && var2.ld()) {
            throw new RuntimeException();
         } else {
            this.ld = var1;
            this.QE = var2;
            this.wU = var3;
            this.fa = this.KK();
            if(var2.fa()) {
               this.dN = hV.ld;
            } else {
               this.LH();
               if(this.dN == null || this.dN == hV.dN) {
                  throw new RuntimeException();
               }
            }

         }
      } else {
         throw new RuntimeException();
      }
   }

   public tu zs() {
      return this.ld;
   }

   public kn mS() {
      return this.QE;
   }

   public tu OK() {
      return this.wU;
   }

   public HashSet fa() {
      HashSet var1 = new HashSet();
      var1.addAll(this.wU.fa());
      if(this.ld != null) {
         var1.addAll(this.ld.fa());
      }

      return var1;
   }

   hV dN(int var1) {
      hV var2 = this.wU.dN(var1);
      if(this.ld == null) {
         return var2;
      } else {
         hV var3 = this.ld.dN(var1);
         if(!var3.EO()) {
            return var2;
         } else if(!var2.EO()) {
            return var3;
         } else if(!var2.dN(var3)) {
            throw new RuntimeException();
         } else {
            return var2;
         }
      }
   }

   boolean dN(int var1, hV var2) {
      boolean var3 = this.wU.dN(var1, var2);
      boolean var4 = false;
      if(this.ld != null) {
         var4 = this.ld.dN(var1, var2);
      }

      if(var3 || var4) {
         this.LH();
      }

      return var3;
   }

   private void LH() {
      if(this.QE != kn.s) {
         hV var1 = this.wU.dN();
         hV var2 = this.ld == null?hV.dN:this.ld.dN();
         hV var3;
         if(var2 != hV.dN) {
            var3 = var1;
            if(var1.PF()) {
               var3 = hV.cb;
            }

            hV var4 = var2;
            if(var2.PF()) {
               var4 = hV.cb;
            }

            if(var4.ld(var3)) {
               this.ld.dN(var3);
               var2 = this.ld.dN();
            } else if(var3.ld(var4)) {
               this.wU.dN(var4);
               var1 = this.wU.dN();
            }
         }

         if(var1.PF()) {
            var1 = hV.zs;
         }

         if(var2.PF()) {
            var2 = hV.zs;
         }

         if(this.QE.wU()) {
            if(var2 == hV.dN) {
               this.dN((hV)var1);
            } else if(this.fa) {
               this.dN((hV)hV.mS);
            } else {
               if(var2 != var1) {
                  throw new RuntimeException();
               }

               this.dN((hV)var1);
            }
         } else if(!this.QE.fa()) {
            if(!this.QE.zs()) {
               throw new RuntimeException();
            }

            if(this.QE == kn.De) {
               var3 = hV.QE;
            } else if(this.QE == kn.rn) {
               var3 = hV.wU;
            } else if(this.QE == kn.LR) {
               var3 = hV.fa;
            } else if(this.QE == kn.Nh) {
               var3 = hV.zs;
            } else if(this.QE == kn.XZ) {
               var3 = hV.mS;
            } else if(this.QE == kn.nA) {
               var3 = hV.OK;
            } else if(this.QE == kn.Ai) {
               var3 = hV.LH;
            } else {
               if(this.QE != kn.uM) {
                  throw new RuntimeException();
               }

               var3 = hV.ld;
            }

            this.dN((hV)var3);
         }

      }
   }

   private boolean KK() {
      return this.ld != null && this.ld.dN == hV.mS && (this.QE == kn.LH || this.QE == kn.KK || this.QE == kn.EO);
   }

   public boolean ld() {
      return this.ld != null && this.ld.ld()?true:this.wU.ld();
   }

   public boolean QE() {
      return this.ld != null && this.ld.QE()?true:this.wU.QE();
   }

   int dN(xy var1) {
      int var2 = 0;
      if(this.ld != null) {
         var2 = 0 + this.ld.dN(var1);
      }

      var2 += this.wU.dN(var1);
      return var2;
   }

   int dN(xy var1, tu var2) {
      int var3 = 0;
      if(this.ld instanceof xy) {
         if(((xy)this.ld).ld(var1)) {
            this.ld = var2;
            ++var3;
         }
      } else if(this.ld != null) {
         var3 = 0 + this.ld.dN(var1, var2);
      }

      if(this.wU instanceof xy) {
         if(var1.ld((xy)this.wU)) {
            this.wU = var2;
            ++var3;
         }
      } else {
         var3 += this.wU.dN(var1, var2);
      }

      return var3;
   }

   int dN(xy var1, long var2) {
      int var4 = 0;
      hV var5;
      if(this.ld instanceof xy) {
         if(((xy)this.ld).QE(var1)) {
            var5 = this.ld.dN();
            if(ie.ld(var5)) {
               this.ld = new ie(var2, var5);
               ++var4;
            }
         }
      } else if(this.ld != null) {
         var4 = 0 + this.ld.dN(var1, var2);
      }

      if(this.wU instanceof xy) {
         if(var1.QE((xy)this.wU)) {
            var5 = this.wU.dN();
            if(ie.ld(var5)) {
               this.wU = new ie(var2, var5);
               ++var4;
            }
         }
      } else {
         var4 += this.wU.dN(var1, var2);
      }

      return var4;
   }

   void dN(hV var1, hV var2) {
      super.dN(var1, var2);
      if(this.ld != null) {
         this.ld.dN(var1, var2);
      }

      this.wU.dN(var1, var2);
   }

   public List wU() {
      return ZF.dN(new tu[]{this.ld, this.wU});
   }

   public boolean dN(tu var1, tu var2) {
      if(this.ld == var1) {
         this.ld = var2;
         return true;
      } else if(this.wU == var1) {
         this.wU = var2;
         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return this.ld == null?String.format("(%s%s)<%s>", new Object[]{this.QE, this.wU, this.dN}):String.format("(%s %s %s)<%s>", new Object[]{this.ld, this.QE, this.wU, this.dN});
   }

   public Xf dN(TB var1) {
      Xf var2 = null;
      if(this.ld != null) {
         var2 = this.ld.dN(var1);
      }

      Xf var3 = this.wU.dN(var1);
      return new Gy(var2, this.QE, var3);
   }
}
