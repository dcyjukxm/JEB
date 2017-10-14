package jebglobal;

import java.util.Iterator;
import java.util.List;
import jebglobal.IK;
import jebglobal.Tp;
import jebglobal.ZL;
import jebglobal.bJ;
import jebglobal.wz;

public abstract class II implements IK {
   private int dN = -1;
   private int ld = -1;
   private Tp QE = null;

   public abstract void dN(ZL var1);

   public void dN(int var1, int var2) {
      this.dN = var1;
   }

   public void dN(int var1) {
      this.ld = var1;
   }

   public int QE() {
      return this.ld;
   }

   static boolean dN(List var0, int var1, II var2) {
      for(int var3 = 0; var3 < var0.size(); ++var3) {
         II var4 = (II)var0.get(var3);
         if(var4.dN == var1) {
            var0.add(var3, var2);
            return true;
         }

         if(var4 instanceof wz && ((wz)var4).dN(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public List wU() {
      throw new RuntimeException();
   }

   public boolean dN(IK var1, IK var2) {
      throw new RuntimeException();
   }

   public Tp fa() {
      if(this.QE == null) {
         this.QE = new Tp();
      }

      return this.QE;
   }

   public void ld(ZL var1) {
      if(this.QE != null) {
         Iterator var2 = this.QE.dN().iterator();

         while(var2.hasNext()) {
            bJ var3 = (bJ)var2.next();
            var1.dN((bJ)var3);
         }
      }

   }
}
