package jebglobal;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import jebglobal.By;
import jebglobal.Sj;
import jebglobal.TM;
import jebglobal.vi;

public abstract class IW implements Sj {
   protected Set dN;
   protected Map ld;

   public Set dN() {
      return this.dN(false);
   }

   public Set dN(boolean var1) {
      if(this.dN == null) {
         this.QE();
      }

      if(!var1) {
         return this.dN;
      } else {
         LinkedHashSet var2 = new LinkedHashSet(this.dN);
         Iterator var3 = this.ld().entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            Iterator var5 = ((Sj)var4.getValue()).dN(true).iterator();

            while(var5.hasNext()) {
               String var6 = (String)var5.next();
               var2.add((String)var4.getKey() + '/' + var6);
            }
         }

         return var2;
      }
   }

   public boolean dN(String var1) {
      IW.vd var2;
      try {
         var2 = this.cb(var1);
      } catch (By var3) {
         return false;
      }

      return var2.dN != null?var2.dN.dN(var2.ld):this.dN().contains(var2.ld);
   }

   public boolean ld(String var1) {
      IW.vd var2;
      try {
         var2 = this.cb(var1);
      } catch (By var3) {
         return false;
      }

      return var2.dN != null?var2.dN.ld(var2.ld):this.ld().containsKey(var2.ld);
   }

   public InputStream QE(String var1) {
      IW.vd var2 = this.cb(var1);
      if(var2.dN != null) {
         return var2.dN.QE(var2.ld);
      } else if(!this.dN().contains(var2.ld)) {
         throw new By(var1);
      } else {
         return this.OK(var2.ld);
      }
   }

   public OutputStream wU(String var1) {
      IW.uK var2 = this.PF(var1);
      if(var2.dN == null) {
         this.dN().add(var2.ld);
         return this.LH(var2.ld);
      } else {
         Sj var3;
         try {
            var3 = this.zs(var2.dN);
         } catch (vi var4) {
            var3 = (Sj)this.ld().get(var2.dN);
         }

         return var3.wU(var2.ld);
      }
   }

   public Sj fa(String var1) {
      IW.vd var2 = this.cb(var1);
      if(var2.dN != null) {
         return var2.dN.fa(var2.ld);
      } else if(!this.ld().containsKey(var2.ld)) {
         throw new By(var1);
      } else {
         return (Sj)this.ld().get(var2.ld);
      }
   }

   public Sj zs(String var1) {
      IW.uK var2 = this.PF(var1);
      IW var3;
      if(var2.dN == null) {
         if(this.ld().containsKey(var2.ld)) {
            throw new vi(var1);
         } else {
            var3 = this.KK(var2.ld);
            this.ld().put(var2.ld, var3);
            return var3;
         }
      } else {
         if(this.ld().containsKey(var2.dN)) {
            var3 = (IW)this.ld().get(var2.dN);
         } else {
            var3 = this.KK(var2.dN);
            this.ld().put(var2.dN, var3);
         }

         return var3.zs(var2.ld);
      }
   }

   public boolean mS(String var1) {
      IW.vd var2;
      try {
         var2 = this.cb(var1);
      } catch (By var3) {
         return false;
      }

      if(var2.dN != null) {
         return var2.dN.mS(var2.ld);
      } else if(!this.dN().contains(var2.ld)) {
         return false;
      } else {
         this.EO(var2.ld);
         this.dN().remove(var2.ld);
         return true;
      }
   }

   public void dN(File var1) {
      TM.dN((Sj)this, (File)var1);
   }

   public void dN(File var1, String[] var2) {
      TM.dN((Sj)this, (File)var1, (String[])var2);
   }

   public void dN(File var1, String var2) {
      TM.dN((Sj)this, (File)var1, (String)var2);
   }

   protected Map ld() {
      return this.ld(false);
   }

   protected Map ld(boolean var1) {
      if(this.ld == null) {
         this.wU();
      }

      if(!var1) {
         return this.ld;
      } else {
         LinkedHashMap var2 = new LinkedHashMap(this.ld);
         Iterator var3 = this.ld().entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            Iterator var5 = ((IW)var4.getValue()).ld(true).entrySet().iterator();

            while(var5.hasNext()) {
               Entry var6 = (Entry)var5.next();
               var2.put((String)var4.getKey() + '/' + (String)var6.getKey(), var6.getValue());
            }
         }

         return var2;
      }
   }

   private IW.vd cb(String var1) {
      IW.uK var2 = this.PF(var1);
      if(var2.dN == null) {
         return new IW.vd((IW)null, var2.ld);
      } else if(!this.ld().containsKey(var2.dN)) {
         throw new By(var1);
      } else {
         return new IW.vd((IW)this.ld().get(var2.dN), var2.ld);
      }
   }

   private IW.uK PF(String var1) {
      int var2 = var1.indexOf(47);
      return var2 == -1?new IW.uK((String)null, var1):new IW.uK(var1.substring(0, var2), var1.substring(var2 + 1));
   }

   protected abstract void QE();

   protected abstract void wU();

   protected abstract InputStream OK(String var1);

   protected abstract OutputStream LH(String var1);

   protected abstract IW KK(String var1);

   protected abstract void EO(String var1);

   class vd {
      public IW dN;
      public String ld;

      public vd(IW var2, String var3) {
         this.dN = var2;
         this.ld = var3;
      }
   }

   class uK {
      public String dN;
      public String ld;

      public uK(String var2, String var3) {
         this.dN = var2;
         this.ld = var3;
      }
   }
}
