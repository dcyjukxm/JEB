package jebglobal;

import java.util.HashMap;
import java.util.Map;
import jebglobal.Kf;
import jebglobal.PS;
import jebglobal.UD;
import jebglobal.Vp;
import jebglobal.dx;
import jebglobal.fv;
import jebglobal.sm;

public final class jl extends sm {
   private final PS[] ld;
   private final Map QE = new HashMap();

   jl(UD var1, int var2, Integer var3, Integer var4, Boolean var5, PS[] var6) {
      super(var1, var2, var3, var4, var5);
      this.ld = var6;
   }

   public String dN(fv var1) {
      if(var1 instanceof Vp) {
         String var2 = this.dN(((Vp)var1).ld());
         if(var2 != null) {
            return var2;
         }
      }

      return super.dN(var1);
   }

   protected void ld(Kf var1, dx var2) {
      PS[] var3 = this.ld;
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         PS var6 = var3[var5];
         int var7 = ((Vp)var6.ld).ld();
         var1.ld((String)null, "enum");
         var1.dN((String)null, "name", ((UD)var6.dN).QE().fa());
         var1.dN((String)null, "value", String.valueOf(var7));
         var1.QE((String)null, "enum");
      }

   }

   private String dN(int var1) {
      String var2 = (String)this.QE.get(Integer.valueOf(var1));
      if(var2 == null) {
         UD var3 = null;
         PS[] var4 = this.ld;
         int var5 = var4.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            PS var7 = var4[var6];
            if(((Vp)var7.ld).ld() == var1) {
               var3 = (UD)var7.dN;
               break;
            }
         }

         if(var3 != null) {
            var2 = var3.QE().fa();
            this.QE.put(Integer.valueOf(var1), var2);
         }
      }

      return var2;
   }
}
