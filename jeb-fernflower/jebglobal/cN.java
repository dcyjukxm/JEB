package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jebglobal.Gd;
import jebglobal.Ja;
import jebglobal.LP;
import jebglobal.Me;
import jebglobal.Mt;
import jebglobal.NM;
import jebglobal.PS;
import jebglobal.UW;
import jebglobal.Ug;
import jebglobal.dN;
import jebglobal.dx;
import jebglobal.fa;
import jebglobal.tz;
import jebglobal.zX;

public final class cN {
   private final LP dN;
   private final int ld;
   private final String QE;
   private final Map wU = new LinkedHashMap();
   private final Map fa = new LinkedHashMap();
   private final Map zs = new LinkedHashMap();
   private final Set mS = new HashSet();
   private dN OK;

   public cN(LP var1, int var2, String var3) {
      this.dN = var1;
      this.ld = var2;
      this.QE = var3;
   }

   public List dN() {
      return new ArrayList(this.wU.values());
   }

   public boolean dN(tz var1) {
      return this.wU.containsKey(var1);
   }

   public UW ld(tz var1) {
      UW var2 = (UW)this.wU.get(var1);
      if(var2 == null) {
         throw new Gd();
      } else {
         return var2;
      }
   }

   public NM dN(Ja var1) {
      NM var2 = (NM)this.fa.get(var1);
      if(var2 == null) {
         var2 = new NM(var1);
         this.fa.put(var1, var2);
      }

      return var2;
   }

   public Set ld() {
      HashSet var1 = new HashSet();
      Iterator var2 = this.wU.values().iterator();

      while(var2.hasNext()) {
         UW var3 = (UW)var2.next();
         Iterator var4 = var3.dN().iterator();

         while(var4.hasNext()) {
            dx var5 = (dx)var4.next();
            if(var5.wU() instanceof fa) {
               var1.add(var5);
            }
         }
      }

      return var1;
   }

   public Collection QE() {
      HashMap var1 = new HashMap();
      Iterator var2 = this.wU.values().iterator();

      while(var2.hasNext()) {
         UW var3 = (UW)var2.next();
         Iterator var4 = var3.dN().iterator();

         while(var4.hasNext()) {
            dx var5 = (dx)var4.next();
            if(var5.wU() instanceof Mt) {
               Me var6 = var5.QE().mS();
               NM var7 = var5.ld();
               PS var8 = new PS(var6, var7);
               Ug var9 = (Ug)var1.get(var8);
               if(var9 == null) {
                  var9 = new Ug(this, var6, var7);
                  var1.put(var8, var9);
               }

               var9.ld(var5);
            }
         }
      }

      return var1.values();
   }

   public LP wU() {
      return this.dN;
   }

   public int fa() {
      return this.ld;
   }

   public String zs() {
      return this.QE;
   }

   boolean QE(tz var1) {
      return this.mS.contains(var1);
   }

   public void dN(UW var1) {
      if(this.wU.put(var1.wU(), var1) != null) {
         throw new zX();
      }
   }

   public void dN(Me var1) {
      if(this.zs.put(var1.dN(), var1) != null) {
         throw new zX();
      }
   }

   public void dN(int var1) {
      this.mS.add(new tz(var1));
   }

   public String toString() {
      return this.QE;
   }

   public boolean equals(Object var1) {
      if(var1 == null) {
         return false;
      } else if(this.getClass() != var1.getClass()) {
         return false;
      } else {
         cN var2 = (cN)var1;
         return this.dN != var2.dN && (this.dN == null || !this.dN.equals(var2.dN))?false:this.ld == var2.ld;
      }
   }

   public int hashCode() {
      int var1 = 259 + (this.dN != null?this.dN.hashCode():0);
      var1 = 37 * var1 + this.ld;
      return var1;
   }

   public dN mS() {
      if(this.OK == null) {
         this.OK = new dN(this);
      }

      return this.OK;
   }
}
