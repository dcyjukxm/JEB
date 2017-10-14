package jebglobal;

import java.io.IOException;
import java.io.InputStream;
import jebglobal.Ig;
import jebglobal.OZ;
import jebglobal.TM;
import jebglobal.UW;
import jebglobal.fh;
import jebglobal.hq;
import jebglobal.iR;
import jebglobal.lb;
import jebglobal.wV;
import jebglobal.wb;
import jebglobal.zX;

public class zB implements iR {
   public hq dN;
   public wb ld;
   public zX QE;
   public boolean wU = false;
   public wV fa;
   public int[] zs;
   public fh mS = new fh();
   public boolean OK;
   public int LH;
   public int KK;
   public int EO;
   public int cb;
   public int[] PF;
   public int Hw;

   public zB() {
      this.Ux();
   }

   public zX dN() {
      return this.QE;
   }

   public wb ld() {
      return this.ld;
   }

   public void dN(wb var1) {
      this.ld = var1;
   }

   public void dN(InputStream var1) {
      this.QE();
      if(var1 != null) {
         this.dN = new hq(new OZ(var1));
      }

   }

   public void QE() {
      if(this.wU) {
         this.wU = false;
         this.dN = null;
         this.fa = null;
         this.zs = null;
         this.mS.dN();
         this.Ux();
      }
   }

   public int wU() {
      if(this.dN == null) {
         throw new lb("", this, (Throwable)null);
      } else {
         try {
            this.ZY();
            return this.LH;
         } catch (IOException var2) {
            this.QE();
            throw var2;
         }
      }
   }

   public int fa() {
      return this.wU();
   }

   public int zs() {
      return this.mS.wU() - 1;
   }

   public int mS() {
      return this.LH;
   }

   public int OK() {
      return this.KK;
   }

   public String LH() {
      return this.EO != -1 && (this.LH == 2 || this.LH == 3)?this.fa.dN(this.EO):null;
   }

   public String KK() {
      return this.EO != -1 && this.LH == 4?this.fa.dN(this.EO):null;
   }

   public String EO() {
      return this.fa.dN(this.cb);
   }

   public String cb() {
      return "XML line #" + this.OK();
   }

   public int dN(int var1) {
      return this.mS.dN(var1);
   }

   public String ld(int var1) {
      int var2 = this.mS.ld(var1);
      return this.fa.dN(var2);
   }

   public String QE(int var1) {
      int var2 = this.mS.QE(var1);
      return this.fa.dN(var2);
   }

   public int PF() {
      return this.LH != 2?-1:this.PF.length / 5;
   }

   public String wU(int var1) {
      int var2 = this.LH(var1);
      int var3 = this.PF[var2 + 0];
      return var3 == -1?"":this.fa.dN(var3);
   }

   public String fa(int var1) {
      int var2 = this.LH(var1);
      int var3 = this.PF[var2 + 0];
      int var4 = this.mS.wU(var3);
      return var4 == -1?"":this.fa.dN(var4);
   }

   public String zs(int var1) {
      String var2 = null;
      int var3 = this.LH(var1);
      int var4 = this.PF[var3 + 1];
      if(var4 != -1) {
         var2 = this.fa.dN(var4);
      }

      if(var2 == null || var2.length() == 0) {
         try {
            int var5 = this.mS(var1);
            if(this.ld != null) {
               UW var6 = this.ld.dN().wU().dN(var5);
               if(var6 != null) {
                  var2 = var6.fa();
               }
            }

            if(var2 == null || var2.length() == 0) {
               var2 = String.format("__rid_%08x", new Object[]{Integer.valueOf(var5)});
            }
         } catch (zX var7) {
            ;
         }
      }

      return var2;
   }

   public int mS(int var1) {
      int var2 = this.LH(var1);
      int var3 = this.PF[var2 + 1];
      return this.zs != null && var3 >= 0 && var3 < this.zs.length?this.zs[var3]:0;
   }

   public String OK(int var1) {
      int var2 = this.LH(var1);
      int var3 = this.PF[var2 + 3];
      int var4 = this.PF[var2 + 4];
      int var5 = this.PF[var2 + 2];
      if(this.ld != null) {
         try {
            return this.ld.dN(var3, var4, var5 == -1?null:TM.dN(this.fa.dN(var5)), this.mS(var1));
         } catch (zX var7) {
            this.dN(var7);
            Object[] var10000 = new Object[]{this.fa(var1), this.zs(var1), Integer.valueOf(var4), var7.toString()};
         }
      }

      return Ig.dN(var3, var4);
   }

   public void dN(InputStream var1, String var2) {
      this.dN(var1);
   }

   public String Hw() {
      return null;
   }

   public int rK() {
      return -1;
   }

   public Object dN(String var1) {
      return null;
   }

   public boolean ld(String var1) {
      return false;
   }

   public void dN(String var1, boolean var2) {
      throw new lb("");
   }

   public int LH(int var1) {
      if(this.LH != 2) {
         throw new IndexOutOfBoundsException();
      } else {
         int var2 = var1 * 5;
         if(var2 >= this.PF.length) {
            throw new IndexOutOfBoundsException();
         } else {
            return var2;
         }
      }
   }

   public void Ux() {
      this.LH = -1;
      this.KK = -1;
      this.EO = -1;
      this.cb = -1;
      this.PF = null;
      this.Hw = -1;
   }

   public void ZY() {
      if(this.fa == null) {
         this.dN.ld(524291);
         this.dN.dN();
         this.fa = wV.dN(this.dN);
         this.mS.fa();
         this.wU = true;
      }

      if(this.LH != 1) {
         int var1 = this.LH;
         this.Ux();

         while(true) {
            if(this.OK) {
               this.OK = false;
               this.mS.zs();
            }

            if(var1 == 3 && this.mS.wU() == 1 && this.mS.ld() == 0) {
               this.LH = 1;
            } else {
               int var2;
               if(var1 == 0) {
                  var2 = 1048834;
               } else {
                  var2 = this.dN.readInt();
               }

               int var3;
               if(var2 == 524672) {
                  var3 = this.dN.readInt();
                  if(var3 >= 8 && var3 % 4 == 0) {
                     this.zs = this.dN.dN(var3 / 4 - 2);
                     continue;
                  }

                  throw new IOException();
               }

               if(var2 < 1048832 || var2 > 1048836) {
                  throw new IOException();
               }

               if(var2 == 1048834 && var1 == -1) {
                  this.LH = 0;
               } else {
                  this.dN.dN();
                  var3 = this.dN.readInt();
                  this.dN.dN();
                  int var4;
                  int var5;
                  if(var2 == 1048832 || var2 == 1048833) {
                     if(var2 == 1048832) {
                        var4 = this.dN.readInt();
                        var5 = this.dN.readInt();
                        this.mS.dN(var4, var5);
                     } else {
                        this.dN.dN();
                        this.dN.dN();
                        this.mS.QE();
                     }
                     continue;
                  }

                  this.KK = var3;
                  if(var2 == 1048834) {
                     this.cb = this.dN.readInt();
                     this.EO = this.dN.readInt();
                     this.dN.dN();
                     var4 = this.dN.readInt();
                     var4 &= '\uffff';
                     this.Hw = this.dN.readInt();
                     int var10000 = this.Hw;
                     this.Hw = (this.Hw & '\uffff') - 1;
                     this.PF = this.dN.dN(var4 * 5);

                     for(var5 = 3; var5 < this.PF.length; var5 += 5) {
                        this.PF[var5] >>>= 24;
                     }

                     this.mS.fa();
                     this.LH = 2;
                  } else if(var2 == 1048835) {
                     this.cb = this.dN.readInt();
                     this.EO = this.dN.readInt();
                     this.LH = 3;
                     this.OK = true;
                  } else {
                     if(var2 != 1048836) {
                        continue;
                     }

                     this.EO = this.dN.readInt();
                     this.dN.dN();
                     this.dN.dN();
                     this.LH = 4;
                  }
               }
            }

            return;
         }
      }
   }

   public void dN(zX var1) {
      if(this.QE == null) {
         this.QE = var1;
      }

   }
}
