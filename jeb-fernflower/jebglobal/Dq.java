package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jebglobal.At;
import jebglobal.EG;
import jebglobal.FX;
import jebglobal.II;
import jebglobal.IK;
import jebglobal.Ps;
import jebglobal.Ro;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.oc;
import jebglobal.wz;

public final class Dq extends wz {
   private Xf dN;
   private LinkedHashMap ld;
   private EG QE;

   public Dq(Xf var1) {
      if(var1 == null) {
         throw new RuntimeException();
      } else {
         this.dN = var1;
         this.ld = new LinkedHashMap();
         this.QE = null;
      }
   }

   public Xf zs() {
      return this.dN;
   }

   public void dN(Xf var1) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else {
         this.dN = var1;
      }
   }

   public HashSet mS() {
      HashSet var1 = new HashSet();
      Iterator var2 = this.ld.values().iterator();

      while(var2.hasNext()) {
         List var3 = (List)var2.next();
         var1.addAll(var3);
      }

      return var1;
   }

   public List OK() {
      return new ArrayList(this.ld.keySet());
   }

   public EG ld(int var1) {
      Iterator var2 = this.ld.keySet().iterator();

      EG var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (EG)var2.next();
      } while(!((List)this.ld.get(var3)).contains(Integer.valueOf(var1)));

      return var3;
   }

   public boolean LH() {
      return this.QE != null;
   }

   public EG KK() {
      return this.QE;
   }

   public void dN(List var1, EG var2) {
      if(var2 != null && var1 != null && !var1.isEmpty()) {
         this.ld.put(var2, var1);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void dN(EG var1) {
      this.QE = var1;
   }

   public boolean dN(int var1, II var2) {
      Iterator var3 = this.ld.keySet().iterator();

      EG var4;
      do {
         if(!var3.hasNext()) {
            if(this.QE != null) {
               return this.QE.dN(var1, var2);
            }

            return false;
         }

         var4 = (EG)var3.next();
      } while(!var4.dN(var1, var2));

      return true;
   }

   public List dN() {
      ArrayList var1 = new ArrayList(this.ld.keySet());
      if(this.QE != null) {
         var1.add(this.QE);
      }

      return var1;
   }

   public List ld() {
      ArrayList var1 = new ArrayList();
      var1.add(new Ps(this.dN));
      Iterator var2 = this.ld.keySet().iterator();

      while(var2.hasNext()) {
         EG var3 = (EG)var2.next();
         var1.add(new At((List)this.ld.get(var3)));
         var1.addAll(var3.ld());
      }

      if(this.QE != null) {
         var1.add(new Ro());
         var1.addAll(this.QE.ld());
      }

      var1.add(new FX());
      return var1;
   }

   public List wU() {
      List var1 = TM.dN(new IK[]{this.dN});
      TM.dN((List)var1, (Collection)this.ld.keySet());
      return TM.dN((List)var1, (IK)this.QE);
   }

   public boolean dN(IK var1, IK var2) {
      if(this.dN == var1) {
         this.dN = (Xf)var2;
         return true;
      } else {
         Iterator var3 = this.ld.keySet().iterator();

         EG var4;
         do {
            if(!var3.hasNext()) {
               if(this.QE == var1) {
                  this.QE = (EG)var2;
               }

               return false;
            }

            var4 = (EG)var3.next();
         } while(var4 != var1);

         throw new RuntimeException();
      }
   }

   public void dN(ZL var1) {
      var1.dN(oc.VX);
      var1.wU("(");
      this.dN.dN(var1);
      var1.wU(") {");
      var1.QE();
      var1.rK();
      ArrayList var2 = new ArrayList(this.ld.keySet());
      Collections.sort(var2, new Comparator() {
         // $FF: synthetic field
         private Dq dN = Dq.this;

         public int dN(EG var1, EG var2) {
            return ((Integer)Collections.max((Collection)this.dN.ld.get(var1))).intValue() - ((Integer)Collections.max((Collection)this.dN.ld.get(var2))).intValue();
         }

         // $FF: synthetic method
         public int compare(Object var1, Object var2) {
            return this.dN((EG)var1, (EG)var2);
         }
      });
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         EG var4 = (EG)var3.next();
         List var5 = (List)this.ld.get(var4);
         Collections.sort(var5);
         int var6 = 0;

         for(Iterator var7 = var5.iterator(); var7.hasNext(); ++var6) {
            int var8 = ((Integer)var7.next()).intValue();
            if(var6 >= 1) {
               var1.QE();
            }

            var1.dN(oc.ld);
            var1.s();
            var1.dN(String.format("%d", new Object[]{Integer.valueOf(var8)}), Zh.cb);
            var1.wU(": ");
         }

         var4.dN(var1);
         var1.QE();
      }

      if(this.QE != null) {
         var1.dN(oc.zs);
         var1.wU(": ");
         this.QE.dN(var1);
         var1.QE();
      }

      var1.Ux();
      var1.wU("}");
   }
}
