package jebglobal;

import java.util.List;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.cI;
import jebglobal.kn;
import jebglobal.oc;

public class Gy extends cI implements Xf {
   protected Xf dN;
   protected kn ld;
   protected Xf QE;

   public Gy(Xf var1, kn var2, Xf var3) {
      if(var2 != null && var3 != null) {
         if(var2.ld()) {
            if(var1 != null) {
               throw new IllegalArgumentException();
            }
         } else if(var2.QE() && var1 == null) {
            throw new IllegalArgumentException();
         }

         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public Xf ld() {
      return this.dN;
   }

   public Xf QE() {
      return this.QE;
   }

   public kn fa() {
      return this.ld;
   }

   public void dN(kn var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.ld = var1;
      }
   }

   public int hashCode() {
      int var1 = 31 + (this.dN == null?0:this.dN.hashCode());
      var1 = 31 * var1 + this.QE.hashCode();
      var1 = 31 * var1 + this.ld.hashCode();
      return var1;
   }

   public boolean equals(Object var1) {
      if(this == var1) {
         return true;
      } else if(var1 != null && this.getClass() == var1.getClass()) {
         Gy var2 = (Gy)var1;
         if(this.dN == null) {
            if(var2.dN != null) {
               return false;
            }
         } else if(!this.dN.equals(var2.dN)) {
            return false;
         }

         return this.ld.equals(var2.ld) && this.QE.equals(var2.QE);
      } else {
         return false;
      }
   }

   public List wU() {
      return TM.dN(new IK[]{this.dN, this.QE});
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (Xf)var2;
         return true;
      } else if(this.QE == var1) {
         this.QE = (Xf)var2;
         return true;
      } else {
         return false;
      }
   }

   public void dN(ZL var1) {
      this.a_(var1);
      if(this.ld.zs()) {
         var1.wU("(");
         var1.wU("(");
         oc.dN(var1, this.ld.dN());
         var1.wU(")");
         if(this.QE instanceof Gy) {
            var1.wU("(");
         }

         this.QE.dN(var1);
         if(this.QE instanceof Gy) {
            var1.wU(")");
         }

         var1.wU(")");
      } else {
         kn var2 = this.dN != null && this.dN instanceof Gy?((Gy)this.dN).fa():null;
         kn var3 = this.QE instanceof Gy?((Gy)this.QE).fa():null;
         if(this.dN != null) {
            boolean var4;
            if(var2 == null) {
               var4 = false;
            } else {
               try {
                  int var5 = this.ld.dN(var2);
                  var4 = var5 < 0 || var5 == 0 && this.ld.LH() != kn.uK.dN;
               } catch (Exception var8) {
                  var4 = true;
               }
            }

            if(var4) {
               var1.wU("(");
            }

            this.dN.dN(var1);
            if(var4) {
               var1.wU(")");
            }
         }

         String var9 = this.ld.toString();
         if(var9.length() > 0) {
            if(this.ld != kn.s && !this.ld.ld()) {
               var1.wU(" " + var9 + " ");
            } else {
               var1.wU(var9);
            }
         }

         boolean var10;
         if(var3 == null) {
            var10 = false;
         } else {
            try {
               int var6 = this.ld.dN(var3);
               var10 = var6 < 0 || var6 == 0 && this.ld.LH() != kn.uK.ld;
            } catch (Exception var7) {
               var10 = true;
            }
         }

         if(var10) {
            var1.wU("(");
         }

         this.QE.dN(var1);
         if(var10) {
            var1.wU(")");
         }

      }
   }
}
