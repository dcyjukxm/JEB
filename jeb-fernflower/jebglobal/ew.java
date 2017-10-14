package jebglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jebglobal.Bb;
import jebglobal.CH;
import jebglobal.Ji;
import jebglobal.OD;
import jebglobal.OZ;
import jebglobal.TM;
import jebglobal.UB;
import jebglobal.eI;
import jebglobal.k;
import jebglobal.kM;
import jebglobal.u;
import jebglobal.wk;

public final class ew {
   private static final long LK = 844563159190538443L;
   private File dN;
   private UB ld;
   private boolean QE = false;
   private int wU = -1;
   private boolean fa = true;
   private boolean zs = true;
   private HashMap mS = new HashMap();
   private HashMap OK = new HashMap();
   private OD LH;
   private HashMap KK = new HashMap();
   private HashMap EO = new HashMap();
   private HashMap cb = new HashMap();
   private HashMap PF = new HashMap();

   public ew(String var1) {
      this.dN = new File(var1);
      this.ld = this.cb();
      Ji var2 = this.wU();
      if(var2 == null) {
         throw new IOException();
      } else {
         wk var3 = new wk(var2.dN, var2.ld, var2.QE);
         if(eI.dN.dN(var3) < 0) {
            throw new IOException();
         }
      }
   }

   public ew() {
      this.dN = null;
      this.ld = new UB(-2143140790);
   }

   public void dN(File var1) {
      this.dN = var1;
      this.QE = true;
   }

   public String dN() {
      return this.dN == null?null:this.dN.getAbsolutePath();
   }

   public void dN(boolean var1) {
      this.zs = var1;
   }

   private UB cb() {
      OZ var1 = new OZ(new FileInputStream(this.dN));
      UB var2 = UB.dN(var1);
      var1.dN();
      if(var2.dN() != -2143140790) {
         throw new IOException();
      } else {
         return var2;
      }
   }

   public boolean ld() {
      try {
         if(this.QE) {
            FileOutputStream var1 = new FileOutputStream(this.dN, false);
            byte[] var2 = this.ld.zs();
            var1.write(var2);
            var1.close();
            this.QE = false;
         }

         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   UB dN(UB var1, UB var2) {
      var1.dN(var2);
      this.QE = true;
      return var2;
   }

   boolean ld(UB var1, UB var2) {
      boolean var3 = var1.ld(var2);
      this.QE = var3;
      return var3;
   }

   public boolean dN(String var1) {
      UB var2 = this.ld.dN(4606278, false);
      if(var2 != null) {
         return false;
      } else {
         try {
            byte[] var3 = TM.LH(var1);
            k var5 = new k(var1, var3, false);
            this.dN((UB)this.ld, (UB)var5);
            return true;
         } catch (IOException var4) {
            return false;
         }
      }
   }

   public k QE() {
      UB var1 = this.ld.dN(4606278, false);
      return var1 == null?null:(k)var1;
   }

   public boolean dN(int var1, int var2, int var3) {
      UB var4 = this.ld.dN(5391702, false);
      if(var4 == null) {
         Ji var6 = new Ji(var1, var2, var3);
         this.dN((UB)this.ld, (UB)var6);
         return true;
      } else {
         Ji var5 = (Ji)var4;
         if((var1 > var5.dN || var1 == var5.dN && var2 > var5.ld) && var3 > var5.QE) {
            var5.dN = var1;
            var5.ld = var2;
            var5.QE = var3;
            this.QE = true;
            return true;
         } else {
            return false;
         }
      }
   }

   public Ji wU() {
      UB var1 = this.ld.dN(5391702, false);
      return var1 == null?null:(Ji)var1;
   }

   public void dN(long var1, String var3, String var4) {
      UB var5 = this.ld.dN(-2142481087, false);
      if(var5 == null) {
         var5 = this.dN(this.ld, new UB(-2142481087));
      }

      int var6 = 0;

      for(Iterator var7 = var5.fa().iterator(); var7.hasNext(); ++var6) {
         UB var8 = (UB)var7.next();
         if(var8.dN() != 5526849) {
            throw new RuntimeException();
         }

         if(((kM)var8).dN == var1) {
            this.wU = var6;
            return;
         }
      }

      kM var9 = new kM(var1, var3, var4);
      var9.dN(this.fa);
      this.dN((UB)var5, (UB)var9);
      this.wU = var6;
   }

   public int fa() {
      UB var1 = this.ld.dN(-2142481087, false);
      return var1 == null?0:var1.fa().size();
   }

   public kM dN(int var1) {
      UB var2 = this.ld.dN(-2142481087, false);
      return var2 != null && var1 >= 0 && var1 < var2.fa().size()?(kM)((kM)var2.fa().get(var1)):null;
   }

   public boolean dN(String var1, byte[] var2) {
      UB var3 = this.ld.dN(-2142484154, false);
      if(var3 == null) {
         var3 = this.dN(this.ld, new UB(-2142484154));
      }

      Iterator var4 = var3.fa().iterator();

      UB var5;
      do {
         if(!var4.hasNext()) {
            CH var6 = new CH(var1, var2);
            var6.dN(this.fa);
            var6.ld(this.zs);
            this.dN((UB)var3, (UB)var6);
            return true;
         }

         var5 = (UB)var4.next();
         if(var5.dN() != 4541510) {
            throw new RuntimeException();
         }
      } while(!((CH)var5).dN.equals(var1));

      return false;
   }

   public byte[] ld(String var1) {
      UB var2 = this.ld.dN(-2142484154, false);
      if(var2 == null) {
         return null;
      } else {
         Iterator var3 = var2.fa().iterator();

         UB var4;
         do {
            if(!var3.hasNext()) {
               return null;
            }

            var4 = (UB)var3.next();
            if(var4.dN() != 4541510) {
               throw new RuntimeException();
            }
         } while(!((CH)var4).dN.equals(var1));

         return ((CH)var4).ld;
      }
   }

   public List zs() {
      UB var1 = this.ld.dN(-2142485931, false);
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         Iterator var3 = var1.fa().iterator();

         while(var3.hasNext()) {
            UB var4 = (UB)var3.next();
            if(var4.dN() != 4932181) {
               throw new RuntimeException();
            }

            var2.add(Integer.valueOf(((Bb)var4).dN));
         }

         return var2;
      }
   }

   public byte[] ld(int var1) {
      UB var2 = this.ld.dN(-2142485931, false);
      if(var2 == null) {
         return null;
      } else {
         Iterator var3 = var2.fa().iterator();

         UB var4;
         do {
            if(!var3.hasNext()) {
               return null;
            }

            var4 = (UB)var3.next();
            if(var4.dN() != 4932181) {
               throw new RuntimeException();
            }
         } while(((Bb)var4).dN != var1);

         return ((Bb)var4).ld;
      }
   }

   public boolean dN(int var1, byte[] var2, boolean var3) {
      UB var4 = this.ld.dN(-2142485931, false);
      if(var4 == null) {
         var4 = this.dN(this.ld, new UB(-2142485931));
      }

      Iterator var5 = var4.fa().iterator();

      UB var6;
      do {
         if(!var5.hasNext()) {
            Bb var7 = new Bb(var1, var2);
            var7.dN(this.fa);
            var7.ld(this.zs);
            this.dN((UB)var4, (UB)var7);
            return true;
         }

         var6 = (UB)var5.next();
         if(var6.dN() != 4932181) {
            throw new RuntimeException();
         }
      } while(((Bb)var6).dN != var1);

      if(!var3) {
         return false;
      } else {
         ((Bb)var6).ld = var2;
         this.QE = true;
         return true;
      }
   }

   public boolean QE(int var1) {
      UB var2 = this.ld.dN(-2142485931, false);
      if(var2 == null) {
         return false;
      } else {
         UB var3 = null;
         Iterator var4 = var2.fa().iterator();

         while(var4.hasNext()) {
            UB var5 = (UB)var4.next();
            if(var5.dN() != 4932181) {
               throw new RuntimeException();
            }

            if(((Bb)var5).dN == var1) {
               var3 = var5;
               break;
            }
         }

         return var3 == null?false:this.ld(var2, var3);
      }
   }

   public List mS() {
      UB var1 = this.ld.dN(-2142482871, false);
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         Iterator var3 = var1.fa().iterator();

         while(var3.hasNext()) {
            UB var4 = (UB)var3.next();
            if(var4 instanceof u) {
               var2.add((u)var4);
            }
         }

         return var2;
      }
   }

   public boolean dN(u.uK var1, int var2, int var3, int var4, String var5) {
      UB var6 = this.ld.dN(-2142482871, false);
      if(var6 == null) {
         var6 = this.dN(this.ld, new UB(-2142482871));
      }

      u var7 = null;
      Iterator var8 = var6.fa().iterator();

      while(var8.hasNext()) {
         UB var9 = (UB)var8.next();
         if(var9 instanceof u) {
            u var10 = (u)var9;
            if(var10.KK() == var1 && var10.EO() == var2 && var10.cb() == var3 && var10.PF() == var4) {
               var7 = var10;
            }
         }
      }

      if(var7 != null) {
         if(var5 == null) {
            var7.QE(false);
         } else {
            var7.dN(var5, this.wU);
            var7.QE(true);
         }

         this.QE = true;
      } else {
         if(var5 == null) {
            return false;
         }

         var7 = new u(var1, var2, var5, var3, var4, this.wU);
         this.dN((UB)var6, (UB)var7);
         switch(ew.SyntheticClass_1.dN[var7.KK().ordinal()]) {
         case 1:
            this.mS.put(Long.valueOf(this.wU(var7.EO(), var7.cb())), var7);
            break;
         case 2:
            long var13 = this.wU(var7.EO(), var7.cb());
            Object var14 = (List)this.OK.get(Long.valueOf(var13));
            if(var14 == null) {
               var14 = new ArrayList();
               this.OK.put(Long.valueOf(var13), var14);
            }

            boolean var11 = false;

            for(int var12 = 0; var12 < ((List)var14).size(); ++var12) {
               if(((u)((List)var14).get(var12)).PF() == var4) {
                  ((List)var14).set(var12, var7);
                  var11 = true;
                  break;
               }
            }

            if(!var11) {
               ((List)var14).add(var7);
            }
         }
      }

      return true;
   }

   public void OK() {
      this.mS.clear();
      this.OK.clear();
      List var1 = this.mS();
      if(var1 != null) {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            u var3 = (u)var2.next();
            switch(ew.SyntheticClass_1.dN[var3.KK().ordinal()]) {
            case 1:
               this.mS.put(Long.valueOf(this.wU(var3.EO(), var3.cb())), var3);
               break;
            case 2:
               long var4 = this.wU(var3.EO(), var3.cb());
               Object var6 = (List)this.OK.get(Long.valueOf(var4));
               if(var6 == null) {
                  var6 = new ArrayList();
                  this.OK.put(Long.valueOf(var4), var6);
               }

               ((List)var6).add(var3);
            }
         }

      }
   }

   public u dN(int var1, int var2) {
      return (u)this.mS.get(Long.valueOf(this.wU(var1, var2)));
   }

   public List ld(int var1, int var2) {
      return (List)this.OK.get(Long.valueOf(this.wU(var1, var2)));
   }

   public ArrayList LH() {
      UB var1 = this.ld.dN(-2142483133, false);
      if(var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         Iterator var3 = var1.fa().iterator();

         while(var3.hasNext()) {
            UB var4 = (UB)var3.next();
            if(var4 instanceof OD) {
               var2.add((OD)var4);
            }
         }

         return var2;
      }
   }

   public boolean dN(OD.vd var1, int var2, int var3, String var4, byte[] var5) {
      UB var6 = this.ld.dN(-2142483133, false);
      if(var6 == null) {
         var6 = this.dN(this.ld, new UB(-2142483133));
      }

      OD var7 = null;
      Iterator var8 = var6.fa().iterator();

      while(var8.hasNext()) {
         UB var9 = (UB)var8.next();
         if(var9 instanceof OD) {
            OD var10 = (OD)var9;
            if(var10.LH() == var1 && var10.KK() == var2 && var10.EO() == var3) {
               var7 = var10;
            }
         }
      }

      if(var7 != null) {
         var7.dN(var4, this.wU);
         var7.dN(var5, this.wU);
         this.QE = true;
      } else {
         var7 = new OD(var1, var2, var3, var4, var5, this.wU);
         var7.dN(this.fa);
         var7.ld(this.zs);
         this.dN((UB)var6, (UB)var7);
         switch(ew.SyntheticClass_1.ld[var7.LH().ordinal()]) {
         case 1:
            this.LH = var7;
            break;
         case 2:
            this.KK.put(Integer.valueOf(var2), var7);
            break;
         case 3:
            this.EO.put(Integer.valueOf(var2), var7);
            break;
         case 4:
            this.cb.put(Integer.valueOf(var2), var7);
            break;
         case 5:
            this.PF.put(Long.valueOf(this.wU(var2, var3)), var7);
         }
      }

      return true;
   }

   public void KK() {
      this.LH = null;
      this.KK.clear();
      this.EO.clear();
      this.cb.clear();
      this.PF.clear();
      ArrayList var1 = this.LH();
      if(var1 != null) {
         Iterator var2 = var1.iterator();

         while(var2.hasNext()) {
            OD var3 = (OD)var2.next();
            switch(ew.SyntheticClass_1.ld[var3.LH().ordinal()]) {
            case 1:
               this.LH = var3;
               break;
            case 2:
               this.KK.put(Integer.valueOf(var3.KK()), var3);
               break;
            case 3:
               this.EO.put(Integer.valueOf(var3.KK()), var3);
               break;
            case 4:
               this.cb.put(Integer.valueOf(var3.KK()), var3);
               break;
            case 5:
               this.PF.put(Long.valueOf(this.wU(var3.KK(), var3.EO())), var3);
            }
         }

      }
   }

   public OD EO() {
      return this.LH;
   }

   public OD wU(int var1) {
      return (OD)this.KK.get(Integer.valueOf(var1));
   }

   public OD fa(int var1) {
      return (OD)this.EO.get(Integer.valueOf(var1));
   }

   public OD zs(int var1) {
      return (OD)this.cb.get(Integer.valueOf(var1));
   }

   public OD QE(int var1, int var2) {
      return (OD)this.PF.get(Long.valueOf(this.wU(var1, var2)));
   }

   private long wU(int var1, int var2) {
      long var3 = (long)var1 << 32 | (long)var2 & 4294967295L;
      return var3;
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN;
      // $FF: synthetic field
      static final int[] ld = new int[OD.vd.values().length];

      static {
         try {
            ld[OD.vd.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            ld[OD.vd.ld.ordinal()] = 2;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            ld[OD.vd.QE.ordinal()] = 3;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            ld[OD.vd.wU.ordinal()] = 4;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            ld[OD.vd.fa.ordinal()] = 5;
         } catch (NoSuchFieldError var2) {
            ;
         }

         dN = new int[u.uK.values().length];

         try {
            dN[u.uK.wU.ordinal()] = 1;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[u.uK.fa.ordinal()] = 2;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }
}
