package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jebglobal.Oa;
import jebglobal.Zh;
import jebglobal.bJ;
import jebglobal.gn;
import jebglobal.hv;
import jebglobal.jt;

public class xc {
   private jt dN;
   private boolean ld;
   private String QE;
   private int wU;
   private String fa;
   private List zs;
   private boolean mS;
   private boolean OK;
   private int LH;
   private List KK = new ArrayList();

   public xc(jt var1) {
      this.dN = var1;
      this.ld = false;
      this.QE = "";
      this.wU = 0;
      this.fa = "";
      this.zs = new ArrayList();
      this.zs.add(new xc.uK());
      this.mS = false;
      this.OK = true;
   }

   public void dN(jt var1) {
      this.dN = var1;
   }

   public boolean OK(boolean var1) {
      boolean var2 = !this.OK;
      this.OK = !var1;
      return var2;
   }

   public void wU(int var1) {
      if(var1 <= 0) {
         this.OK = true;
      } else {
         this.OK = false;
         this.LH = var1;
      }

   }

   public void wU() {
      if(!this.mS) {
         Iterator var1 = this.zs.iterator();

         while(var1.hasNext()) {
            xc.uK var2 = (xc.uK)var1.next();
            var2.dN = var2.dN.toString();
            if(var2.ld != null) {
               var2.ld.trimToSize();
            }
         }
      }

      this.mS = true;
   }

   public void fa() {
      if(this.mS) {
         throw new RuntimeException();
      }
   }

   public boolean dN(int var1, int var2, String var3) {
      if(var1 >= 0 && var1 < this.OK()) {
         xc.uK var4 = (xc.uK)this.zs.get(var1);
         if(var2 >= 0 && var2 < var4.ld.size()) {
            hv var5 = (hv)var4.ld.get(var2);
            int var6 = var5.QE();
            int var7 = var5.ld();
            int var8 = var3.length();
            var5.dN(var8);
            int var9 = var8 - var7;

            for(int var10 = var2 + 1; var10 < var4.ld.size(); ++var10) {
               ((hv)var4.ld.get(var10)).ld(var9);
            }

            if(this.mS) {
               String var11 = (String)var4.dN;
               var4.dN = var11.substring(0, var6) + var3 + var11.substring(var6 + var7);
            } else {
               StringBuilder var12 = (StringBuilder)var4.dN;
               var12.replace(var6, var6 + var7, var3);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public String zs() {
      StringBuilder var1 = new StringBuilder();

      for(int var2 = 0; var2 < this.OK(); ++var2) {
         var1.append(((xc.uK)this.zs.get(var2)).dN);
         var1.append('\n');
      }

      var1.trimToSize();
      return var1.toString();
   }

   public int[] mS() {
      int var1 = this.OK();
      int[] var2 = new int[var1];
      int var3 = 0;

      for(int var4 = 0; var4 < var1; ++var4) {
         var2[var4] = var3;
         var3 += ((xc.uK)this.zs.get(var4)).dN.length() + 1;
      }

      return var2;
   }

   public List fa(int var1) {
      if(var1 >= 0 && var1 < this.OK()) {
         xc.uK var2 = (xc.uK)this.zs.get(var1);
         return var2 != null?var2.ld:null;
      } else {
         return null;
      }
   }

   public Oa zs(int var1) {
      if(var1 >= 0 && var1 < this.OK()) {
         xc.uK var2 = (xc.uK)this.zs.get(var1);
         return var2 != null?var2.QE:null;
      } else {
         return null;
      }
   }

   public int OK() {
      return this.zs.size() - 1;
   }

   public int LH() {
      return this.zs.size() - 1;
   }

   public int KK() {
      return this.zs.size() - 2;
   }

   private xc.uK dN() {
      return (xc.uK)this.zs.get(this.zs.size() - 1);
   }

   public void ld(String var1) {
      this.fa = var1;
   }

   public void QE(String var1) {
      this.QE = var1;
   }

   public void EO() {
      this.ld = true;
   }

   public void cb() {
      this.ld = false;
   }

   public void PF() {
      this.wU = 0;
   }

   public int Hw() {
      return this.wU;
   }

   public void mS(int var1) {
      this.wU = var1;
   }

   public void rK() {
      ++this.wU;
   }

   public void Ux() {
      --this.wU;
   }

   public int ZY() {
      return this.dN().dN.length();
   }

   private boolean dN(String var1) {
      return var1.equals("(") || var1.equals(")") || var1.equals("[") || var1.equals("]") || var1.equals("{") || var1.equals("}") || var1.equals(";") || var1.equals(" ") || var1.startsWith(",");
   }

   public void wU(String var1) {
      this.fa();
      if(var1.indexOf(10) >= 0) {
         var1 = var1.replace('\n', '/');
      }

      StringBuilder var2 = (StringBuilder)this.dN().dN;
      boolean var3 = false;
      if(!this.OK && var2.length() >= this.LH && !this.dN(var1)) {
         this.OK = true;
         this.QE();
         this.OK = false;
         var2 = (StringBuilder)this.dN().dN;
         var3 = true;
      }

      if(var2.length() == 0) {
         if(this.ld) {
            var2.append(this.QE);
         }

         for(int var4 = 0; var4 < this.wU; ++var4) {
            var2.append(this.fa);
         }

         if(var3) {
            var2.append(this.fa);
            var2.append(this.fa);
         }
      }

      var2.append(var1);
   }

   public void s() {
      this.fa();
      this.wU(" ");
   }

   public void OK(int var1) {
      this.fa();
      StringBuilder var2 = new StringBuilder();

      for(int var3 = 0; var3 < var1; ++var3) {
         var2.append(' ');
      }

      this.wU(var2.toString());
   }

   public void dN(Oa var1) {
      this.fa();
      this.dN().QE = var1;
      this.zs.add(new xc.uK());
   }

   public void QE() {
      this.dN((Oa)null);
   }

   public void dN(String var1, Zh var2, int var3, Object var4, Object var5) {
      this.wU(var1);
      if(this.dN != null) {
         xc.uK var6 = this.dN();
         if(var6.ld == null) {
            var6.ld = new ArrayList();
         }

         int var7 = var1.length();
         int var8 = var6.dN.length() - var7;
         hv var9 = this.dN.dN(var8, var7, var2, var3, var4, var5);
         var6.ld.add(var9);
      }
   }

   public void dN(String var1, Zh var2, Object var3) {
      this.dN(var1, var2, 0, var3, (Object)null);
   }

   public void dN(String var1, Zh var2) {
      this.dN(var1, var2, 0, (Object)null, (Object)null);
   }

   public void dN(int var1, String var2) {
      if(var1 == this.LH()) {
         this.wU(var2);
      } else {
         if(var2.indexOf(10) >= 0) {
            var2 = var2.replace('\n', '/');
         }

         if(var1 >= 0 && var1 <= this.KK()) {
            CharSequence var3 = ((xc.uK)this.zs.get(var1)).dN;
            if(var3 instanceof StringBuilder) {
               ((StringBuilder)var3).append(var2);
            } else {
               ((xc.uK)this.zs.get(var1)).dN = var3 + var2;
            }

         } else {
            throw new RuntimeException();
         }
      }
   }

   public void dN(int var1, String var2, Zh var3, int var4, Object var5, Object var6) {
      if(var1 == this.LH()) {
         this.dN(var2, var3, var4, var5, var6);
      }

      this.dN(var1, var2);
      if(this.dN != null) {
         xc.uK var7 = (xc.uK)this.zs.get(var1);
         if(var7.ld == null) {
            var7.ld = new ArrayList();
         }

         int var8 = var2.length();
         int var9 = var7.dN.length() - var8;
         hv var10 = this.dN.dN(var9, var8, var3, var4, var5, var6);
         var7.ld.add(var10);
      }
   }

   public boolean dN(int var1, int var2) {
      if(this.OK() <= 1) {
         return false;
      } else {
         int var3 = this.LH();
         if(var1 != var2 && var1 >= 0 && var1 < var3 && var2 >= 0 && var2 < var3) {
            xc.uK var4 = (xc.uK)this.zs.remove(var1);
            Iterator var5;
            gn var6;
            if(var2 < var1) {
               this.zs.add(var2, var4);
               var5 = this.KK.iterator();

               while(var5.hasNext()) {
                  var6 = (gn)var5.next();
                  if(var6.dN == var1) {
                     var6.dN = var2;
                  } else if(var6.dN >= var2 && var6.dN < var1) {
                     ++var6.dN;
                  }
               }
            } else {
               this.zs.add(var2 - 1, var4);
               var5 = this.KK.iterator();

               while(var5.hasNext()) {
                  var6 = (gn)var5.next();
                  if(var6.dN == var1) {
                     var6.dN = var2;
                  } else if(var6.dN > var1 && var6.dN < var2) {
                     --var6.dN;
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public boolean LH(int var1) {
      return this.dN(this.KK(), var1);
   }

   public void dN(bJ var1) {
      this.KK.add(new gn(this.LH(), this.ZY(), var1));
   }

   public List Hv() {
      return this.KK;
   }

   public static class uK {
      private CharSequence dN = new StringBuilder();
      private ArrayList ld = null;
      private Oa QE = null;
   }
}
