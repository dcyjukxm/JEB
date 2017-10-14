package jebglobal;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jebglobal.Gd;
import jebglobal.Qj;
import jebglobal.UW;
import jebglobal.cN;
import jebglobal.tz;
import jebglobal.zX;

public final class LP {
   private final Qj dN;
   private final Map ld = new HashMap();
   private final Map QE = new HashMap();
   private final Set wU = new LinkedHashSet();
   private final Set fa = new LinkedHashSet();
   private String zs;

   public LP() {
      this.dN = null;
   }

   public LP(Qj var1) {
      this.dN = var1;
   }

   public UW dN(int var1) {
      return this.dN(new tz(var1));
   }

   public UW dN(tz var1) {
      return this.ld(var1.dN).ld(var1);
   }

   public Set dN() {
      return this.wU;
   }

   public cN ld(int var1) {
      cN var2 = (cN)this.ld.get(Integer.valueOf(var1));
      if(var2 != null) {
         return var2;
      } else if(this.dN != null) {
         return this.dN.dN(this, var1, this.zs);
      } else {
         throw new Gd();
      }
   }

   public void dN(cN var1, boolean var2) {
      Integer var3 = Integer.valueOf(var1.fa());
      if(this.ld.containsKey(var3)) {
         throw new zX();
      } else {
         String var4 = var1.zs();
         if(this.QE.containsKey(var4)) {
            throw new zX();
         } else {
            this.ld.put(var3, var1);
            this.QE.put(var4, var1);
            if(var2) {
               this.wU.add(var1);
            } else {
               this.fa.add(var1);
            }

         }
      }
   }

   public void dN(String var1) {
      this.zs = var1;
   }
}
