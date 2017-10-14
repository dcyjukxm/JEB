package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.hV;
import jebglobal.oc;

public final class jK extends II implements Xf {
   private hV dN;
   private List ld;
   private List QE;

   public jK(hV var1, Xf var2) {
      if(var1 != null && var2 != null) {
         this.dN = var1;
         this.ld = new ArrayList();
         this.ld.add(var2);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public jK(hV var1, boolean var2, List var3) {
      if(var3 == null) {
         throw new IllegalArgumentException();
      } else if(var1 == null && var2) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
         if(var2) {
            if(var3.isEmpty()) {
               throw new IllegalArgumentException();
            }

            this.ld = var3;
         } else {
            this.QE = var3;
         }

      }
   }

   public hV dN() {
      return this.dN;
   }

   public List ld() {
      return this.ld;
   }

   public List zs() {
      return this.QE;
   }

   public List wU() {
      List var1 = TM.dN((Collection)this.ld);
      return TM.dN((List)var1, (Collection)this.QE);
   }

   public boolean dN(IK var1, IK var2) {
      int var3;
      if(this.ld != null) {
         for(var3 = 0; var3 < this.ld.size(); ++var3) {
            if(this.ld.get(var3) == var1) {
               this.ld.set(var3, (Xf)var2);
               return true;
            }
         }
      }

      if(this.QE != null) {
         for(var3 = 0; var3 < this.QE.size(); ++var3) {
            if(this.QE.get(var3) == var1) {
               this.QE.set(var3, (Xf)var2);
               return true;
            }
         }
      }

      return false;
   }

   public void dN(ZL var1) {
      this.ld(var1);
      if(this.dN != null) {
         var1.dN(oc.Ux);
         var1.wU(" ");
      }

      int var5;
      if(this.QE == null) {
         oc.dN(var1, this.dN.QE());
         Iterator var2 = this.ld.iterator();

         while(var2.hasNext()) {
            Xf var3 = (Xf)var2.next();
            var1.wU("[");
            var3.dN(var1);
            var1.wU("]");
         }

         for(var5 = this.ld.size(); var5 < this.dN.ld(); ++var5) {
            var1.wU("[]");
         }
      } else {
         if(this.dN != null) {
            oc.dN(var1, this.dN);
         }

         var1.wU("{");
         var5 = 0;

         for(Iterator var6 = this.QE.iterator(); var6.hasNext(); ++var5) {
            Xf var4 = (Xf)var6.next();
            if(var5 > 0) {
               var1.wU(", ");
            }

            var4.dN(var1);
         }

         var1.wU("}");
      }

   }
}
