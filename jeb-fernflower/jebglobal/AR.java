package jebglobal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.Adler32;
import jebglobal.AV;
import jebglobal.Bw;
import jebglobal.Dn;
import jebglobal.Fx;
import jebglobal.Mx;
import jebglobal.OM;
import jebglobal.RI;
import jebglobal.UZ;
import jebglobal.Uk;
import jebglobal.XV;
import jebglobal.ZF;
import jebglobal.bG;
import jebglobal.bt;
import jebglobal.cn;
import jebglobal.gE;
import jebglobal.hO;
import jebglobal.nh;
import jebglobal.nm;
import jebglobal.oh;
import jebglobal.rP;
import jebglobal.tJ;
import jebglobal.ub;
import jebglobal.vD;
import jebglobal.xd;
import jebglobal.yK;
import jebglobal.yL;

public final class AR {
   private static final long LK = 844563159190538443L;
   private boolean zs = false;
   private boolean mS = true;
   private boolean OK = true;
   private boolean LH = true;
   private boolean KK = true;
   private byte[] EO;
   private List cb;
   private int PF;
   private nh Hw;
   private bG rK;
   private tJ Ux;
   private Fx ZY;
   private Mx s;
   private HashSet Hv = new HashSet();
   private ArrayList VX = new ArrayList();
   private RI ci;
   private HashMap bG;
   private Dn BQ;
   private List Ee;
   private OM[] De;
   HashMap dN;
   HashMap ld;
   private HashMap rn;
   HashMap QE = null;
   HashMap wU = null;
   HashMap fa = null;
   private UZ LR;

   public AR(byte[] var1) {
      this.EO = var1;
   }

   public void dN(boolean var1) {
      this.mS = var1;
   }

   public void ld(boolean var1) {
      this.OK = var1;
   }

   public void QE(boolean var1) {
      this.LH = var1;
   }

   public void wU(boolean var1) {
      this.KK = var1;
   }

   public byte[] dN() {
      return this.EO;
   }

   public String dN(int var1) {
      return var1 >= 0 && var1 < this.cb.size()?(String)this.cb.get(var1):null;
   }

   public int ld() {
      return this.cb.size();
   }

   public int QE() {
      return this.PF;
   }

   public String ld(int var1) {
      return var1 >= 0 && var1 < this.cb.size()?(String)this.cb.get(var1):"";
   }

   public String dN(int var1, String var2, boolean var3) {
      if(var2 == null) {
         var2 = "";
      }

      String var4 = var1 >= 0 && var1 < this.cb.size()?(String)this.cb.get(var1):var2;
      return var3?ZF.QE(var4, false):var4;
   }

   public ArrayList wU() {
      return new ArrayList(this.cb);
   }

   public boolean dN(int var1, String var2) {
      if(var1 >= 0 && var1 < this.cb.size()) {
         this.cb.set(var1, var2);
         return true;
      } else {
         return false;
      }
   }

   public Set fa() {
      return this.bG.keySet();
   }

   public Long dN(long var1) {
      return (Long)this.bG.get(Long.valueOf(var1));
   }

   public Dn zs() {
      return this.BQ;
   }

   public nh mS() {
      return this.Hw;
   }

   public nh.vd QE(int var1) {
      return (nh.vd)this.Hw.dN(var1);
   }

   public String dN(int var1, boolean var2) {
      return this.Hw.dN(var1, var2);
   }

   public Bw wU(int var1) {
      return (Bw)this.rK.dN(var1);
   }

   public int OK() {
      return this.rK.dN();
   }

   public gE fa(int var1) {
      return (gE)this.Ux.dN(var1);
   }

   public int LH() {
      return this.Ux.dN();
   }

   public List KK() {
      return this.Ux.QE();
   }

   public XV dN(String var1) {
      XV var2 = (XV)this.ld.get(var1);
      if(var2 != null) {
         return var2;
      } else {
         this.mS(false);
         var2 = (XV)this.wU.get(var1);
         return var2 != null?var2:var2;
      }
   }

   public XV ld(String var1) {
      XV var2 = this.dN(var1);
      if(var2 != null) {
         return var2;
      } else {
         Iterator var3 = this.ld.keySet().iterator();

         String var4;
         while(var3.hasNext()) {
            var4 = (String)var3.next();
            if(var4.contains(var1)) {
               if(var2 != null) {
                  return null;
               }

               var2 = (XV)this.ld.get(var4);
            }
         }

         var3 = this.wU.keySet().iterator();

         while(var3.hasNext()) {
            var4 = (String)var3.next();
            if(var4.contains(var1)) {
               if(var2 != null) {
                  return null;
               }

               var2 = (XV)this.wU.get(var4);
            }
         }

         return var2;
      }
   }

   private void mS(boolean var1) {
      if(var1 || this.wU == null) {
         this.wU = new HashMap();
         Iterator var2 = this.ld.values().iterator();

         while(var2.hasNext()) {
            XV var3 = (XV)var2.next();
            gE var4 = (gE)this.Ux.dN(var3.dN());
            if(var4.wU()) {
               this.wU.put(var4.fa(true), var3);
            }
         }
      }

   }

   public ub zs(int var1) {
      gE var2 = this.fa(var1);
      if(var2 == null) {
         return null;
      } else if(!var2.QE()) {
         return null;
      } else {
         XV var3 = this.dN(var2.fa(false));
         if(var3 != null && var3.QE()) {
            yK var4 = this.EO(var2.dN(false));
            if(var4 != null && var4.s() != null) {
               ub[] var5 = var4.ZY();
               int var6 = 0;

               for(Iterator var7 = var4.s().dN().iterator(); var7.hasNext(); ++var6) {
                  XV var8 = (XV)var7.next();
                  if(var6 >= var5.length) {
                     return null;
                  }

                  if(var8 == var3) {
                     return var5[var6];
                  }
               }

               throw new RuntimeException();
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   public hO mS(int var1) {
      return (hO)this.ZY.dN(var1);
   }

   public int EO() {
      return this.ZY.dN();
   }

   public List cb() {
      return this.ZY.QE();
   }

   public Set fa(boolean var1) {
      if(!var1) {
         return this.dN.keySet();
      } else {
         HashSet var2 = new HashSet();
         Iterator var3 = this.dN.values().iterator();

         while(var3.hasNext()) {
            AV var4 = (AV)var3.next();
            hO var5 = (hO)this.ZY.dN(var4.ld());
            var2.add(var5.wU(true));
         }

         return var2;
      }
   }

   public AV QE(String var1) {
      AV var2 = (AV)this.dN.get(var1);
      if(var2 != null) {
         return var2;
      } else {
         this.OK(false);
         var2 = (AV)this.QE.get(var1);
         return var2 != null?var2:null;
      }
   }

   public AV wU(String var1) {
      AV var2 = this.QE(var1);
      if(var2 != null) {
         return var2;
      } else {
         Iterator var3 = this.dN.keySet().iterator();

         String var4;
         while(var3.hasNext()) {
            var4 = (String)var3.next();
            if(var4.contains(var1)) {
               if(var2 != null) {
                  return null;
               }

               var2 = (AV)this.dN.get(var4);
            }
         }

         var3 = this.QE.keySet().iterator();

         while(var3.hasNext()) {
            var4 = (String)var3.next();
            if(var4.contains(var1)) {
               if(var2 != null) {
                  return null;
               }

               var2 = (AV)this.QE.get(var4);
            }
         }

         return var2;
      }
   }

   private void OK(boolean var1) {
      if(var1 || this.QE == null) {
         this.QE = new HashMap();
         Iterator var2 = this.dN.values().iterator();

         while(var2.hasNext()) {
            AV var3 = (AV)var2.next();
            hO var4 = (hO)this.ZY.dN(var3.ld());
            if(var4.wU()) {
               this.QE.put(var4.wU(true), var3);
            }
         }
      }

   }

   public int fa(String var1) {
      int var2 = this.cb.indexOf(var1);
      if(var2 < 0) {
         var2 = this.cb.size();
         this.cb.add(var1);
      }

      return var2;
   }

   public nh.vd zs(String var1) {
      nh.vd var2 = (nh.vd)this.Hw.dN(var1);
      if(var2 != null) {
         return var2;
      } else {
         int var3 = this.fa(var1);
         var2 = this.Hw.ld(var3);
         return var2;
      }
   }

   public Bw mS(String var1) {
      Bw var2 = (Bw)this.rK.dN(var1);
      if(var2 != null) {
         return var2;
      } else {
         String[] var3 = new String[1];
         List var4 = Bw.dN(var1, var3);
         if(var4 == null) {
            return null;
         } else {
            int var5 = this.fa(var3[0]);
            int var6 = -1;
            int[] var7 = new int[var4.size() - 1];
            int var8 = 0;

            for(Iterator var9 = var4.iterator(); var9.hasNext(); ++var8) {
               String var10 = (String)var9.next();
               nh.vd var11 = this.zs(var10);
               if(var11 == null) {
                  return null;
               }

               int var12 = var11.dN();
               if(var8 == 0) {
                  var6 = var12;
               } else {
                  var7[var8 - 1] = var12;
               }
            }

            int var13 = this.rK.dN(var5, var6, var7);
            return (Bw)this.rK.dN(var13);
         }
      }
   }

   public hO OK(String var1) {
      hO var2 = (hO)this.ZY.dN(var1);
      if(var2 != null) {
         return var2;
      } else {
         String[] var3 = var1.split("->");
         if(var3.length != 2) {
            return null;
         } else {
            int var4 = var3[1].indexOf(40);
            if(var4 < 0) {
               return null;
            } else {
               String var5 = var3[0];
               String var6 = var3[1].substring(0, var4);
               String var7 = var3[1].substring(var4);
               nh.vd var8 = this.zs(var5);
               if(var8 == null) {
                  return null;
               } else {
                  int var9 = this.fa(var6);
                  Bw var10 = this.mS(var7);
                  if(var10 == null) {
                     return null;
                  } else {
                     int var11 = this.ZY.dN(var8.dN(), var10.dN(), var9);
                     return (hO)this.ZY.dN(var11);
                  }
               }
            }
         }
      }
   }

   public gE LH(String var1) {
      gE var2 = (gE)this.Ux.dN(var1);
      if(var2 != null) {
         return var2;
      } else {
         String[] var3 = var1.split("->");
         if(var3.length != 2) {
            return null;
         } else {
            int var4 = var3[1].indexOf(58);
            if(var4 < 0) {
               return null;
            } else {
               String var5 = var3[0];
               String var6 = var3[1].substring(0, var4);
               String var7 = var3[1].substring(var4 + 1);
               nh.vd var8 = this.zs(var5);
               if(var8 == null) {
                  return null;
               } else {
                  int var9 = this.fa(var6);
                  nh.vd var10 = this.zs(var7);
                  if(var10 == null) {
                     return null;
                  } else {
                     int var11 = this.Ux.dN(var8.dN(), var10.dN(), var9);
                     return (gE)this.Ux.dN(var11);
                  }
               }
            }
         }
      }
   }

   public yK OK(int var1) {
      return (yK)this.s.dN(var1);
   }

   public int PF() {
      return this.s.dN();
   }

   public List Hw() {
      return this.s.QE();
   }

   public Set rK() {
      return this.Hw.fa();
   }

   public Object KK(String var1) {
      Object var2 = this.EO(var1);
      if(var2 == null) {
         var2 = this.Hw.QE(var1);
      }

      return var2;
   }

   public yK EO(String var1) {
      yK var2 = (yK)this.rn.get(var1);
      if(var2 != null) {
         return var2;
      } else {
         this.LH(false);
         var2 = (yK)this.fa.get(var1);
         return var2 != null?var2:null;
      }
   }

   public yK cb(String var1) {
      yK var2 = this.EO(var1);
      if(var2 != null) {
         return var2;
      } else {
         Iterator var3 = this.rn.keySet().iterator();

         String var4;
         while(var3.hasNext()) {
            var4 = (String)var3.next();
            if(var4.contains(var1)) {
               if(var2 != null) {
                  return null;
               }

               var2 = (yK)this.rn.get(var4);
            }
         }

         var3 = this.fa.keySet().iterator();

         while(var3.hasNext()) {
            var4 = (String)var3.next();
            if(var4.contains(var1)) {
               if(var2 != null) {
                  return null;
               }

               var2 = (yK)this.fa.get(var4);
            }
         }

         return var2;
      }
   }

   private void LH(boolean var1) {
      if(var1 || this.fa == null) {
         this.fa = new HashMap();
         Iterator var2 = this.rn.values().iterator();

         while(var2.hasNext()) {
            yK var3 = (yK)var2.next();
            if(var3.OK()) {
               this.fa.put(var3.dN(true), var3);
            }
         }
      }

   }

   public yK dN(yK var1) {
      if(!var1.dN()) {
         throw new RuntimeException();
      } else {
         int var2 = var1.QE();
         if(var2 >= 0) {
            yK var5 = this.EO(this.dN(var2, false));
            return var5;
         } else {
            var2 = var1.wU();
            if(var2 < 0) {
               return null;
            } else {
               hO var3 = (hO)this.ZY.dN(var2);
               yK var4 = this.EO(var3.dN(false));
               return var4;
            }
         }
      }
   }

   public hO LH(int var1) {
      int var2 = 0;
      int var3 = this.De.length;
      int var4 = 0;

      while(var3 > var2) {
         int var5 = var2 + (var3 - var2) / 2;
         OM var6 = this.De[var5];
         int var7 = var6.ld();
         if(var1 < var7) {
            var3 = var5;
         } else {
            if(var1 <= var7) {
               return (hO)this.ZY.dN(var6.dN());
            }

            var2 = var5 + 1;
            var4 = var5;
         }
      }

      if(var4 < this.De.length) {
         OM var8 = this.De[var4];
         if(var1 < var8.ld() + var8.QE()) {
            return (hO)this.ZY.dN(var8.dN());
         }
      }

      return null;
   }

   static int dN(byte[] var0, int var1) {
      int var2 = var0[var1] & 255;
      var2 |= (var0[var1 + 1] & 255) << 8;
      return var2;
   }

   static int ld(byte[] var0, int var1) {
      int var2 = var0[var1] & 255;
      var2 |= (var0[var1 + 1] & 255) << 8;
      var2 |= (var0[var1 + 2] & 255) << 16;
      var2 |= (var0[var1 + 3] & 255) << 24;
      if(var2 < -1) {
         throw new yL();
      } else {
         return var2;
      }
   }

   static int dN(byte[] var0, int var1, int[] var2) {
      int var3 = 0;
      byte var4 = -1;

      int var5;
      for(var5 = 0; var4 < 0; ++var5) {
         var4 = var0[var1 + var5];
         var3 |= (var4 & 127) << var5 * 7;
      }

      if(var5 > 5) {
         throw new yL();
      } else {
         if((var4 & 64) != 0) {
            if(var5 == 1) {
               var3 |= -128;
            }

            if(var5 == 2) {
               var3 |= -16384;
            }

            if(var5 == 3) {
               var3 |= -2097152;
            }

            if(var5 == 4) {
               var3 |= -268435456;
            }
         }

         var2[0] = var5;
         return var3;
      }
   }

   static int ld(byte[] var0, int var1, int[] var2) {
      int var3 = 0;
      byte var4 = -1;

      int var5;
      for(var5 = 0; var4 < 0; ++var5) {
         var4 = var0[var1 + var5];
         var3 |= (var4 & 127) << var5 * 7;
      }

      if(var5 > 5) {
         throw new yL();
      } else {
         var2[0] = var5;
         return var3;
      }
   }

   static int QE(byte[] var0, int var1, int[] var2) {
      int var3 = ld(var0, var1, var2);
      return var3 - 1;
   }

   static String wU(byte[] var0, int var1, int[] var2) {
      StringBuffer var3 = new StringBuffer();
      int var4 = var1;
      int var5 = 0;

      while(true) {
         int var6 = var0[var1] & 255;
         ++var1;
         if(var6 == 0) {
            var2[0] = var1 - var4;
            return var3.toString();
         }

         if((var6 & 128) != 0) {
            int var7;
            if((var6 & 224) == 192) {
               var7 = var0[var1] & 255;
               ++var1;
               if((var7 & 192) != 128) {
                  throw new yL();
               }

               var6 = (var6 & 31) << 6 | var7 & 63;
            } else {
               if((var6 & 240) != 224) {
                  throw new yL();
               }

               var7 = var0[var1] & 255;
               ++var1;
               int var8 = var0[var1] & 255;
               ++var1;
               if((var7 & 192) != 128 || (var8 & 192) != 128) {
                  throw new yL();
               }

               var6 = (var6 & 15) << 12 | (var7 & 63) << 6 | var8 & 63;
               if(var6 >= '\ud800' && var6 <= '\udbff') {
                  if(var5 != 0) {
                     throw new yL();
                  }

                  var5 = 65536 + (var6 - '\ud800' << 10);
                  continue;
               }

               if(var6 >= '\udc00' && var6 <= '\udfff') {
                  if(var5 == 0) {
                     throw new yL();
                  }

                  var6 = var5 + (var6 - '\udc00');
                  var5 = 0;
               }
            }
         }

         if(var5 != 0) {
            throw new yL();
         }

         var3.appendCodePoint(var6);
      }
   }

   public static void KK(int var0) {
      if((var0 & -30240) != 0) {
         throw new RuntimeException();
      }
   }

   public static void EO(int var0) {
      if((var0 & -20704) != 0) {
         throw new RuntimeException();
      }
   }

   public static void cb(int var0) {
      if((var0 & -204288) != 0) {
         throw new RuntimeException();
      }
   }

   public void Ux() {
      if(!this.zs) {
         this.dN = new HashMap();
         this.ld = new HashMap();
         this.rn = new HashMap();
         this.Ee = new ArrayList();
         if(this.EO.length < 112) {
            throw new yL();
         } else if(this.EO[0] == 100 && this.EO[1] == 101 && this.EO[2] == 120 && this.EO[3] == 10) {
            if(this.EO[4] != 48 || this.EO[5] != 51 || this.EO[6] != 53 && this.EO[6] != 54 || this.EO[7] != 0) {
               cn.dN("Unknown DEX version");
               if(this.mS) {
                  throw new yL();
               }
            }

            int var1 = this.EO[8] & 255 | (this.EO[9] & 255) << 8 | (this.EO[10] & 255) << 16 | (this.EO[11] & 255) << 24;
            Adler32 var2 = new Adler32();
            var2.update(this.EO, 12, this.EO.length - 12);
            int var3 = (int)var2.getValue();
            if(var3 != var1) {
               cn.dN(String.format("Invalid DEX checksum (expected=%08X, actual=%08X)", new Object[]{Integer.valueOf(var3), Integer.valueOf(var1)}));
               if(this.OK) {
                  throw new yL();
               }
            }

            byte[] var4 = new byte[20];

            for(int var5 = 0; var5 < 20; ++var5) {
               var4[var5] = this.EO[12 + var5];
            }

            MessageDigest var28;
            try {
               var28 = MessageDigest.getInstance("SHA-1");
            } catch (NoSuchAlgorithmException var27) {
               throw new yL();
            }

            var28.update(this.EO, 32, this.EO.length - 32);
            if(!Arrays.equals(var28.digest(), var4)) {
               cn.dN(String.format("Invalid DEX signature (expected=%s, actual=%s)", new Object[]{ZF.dN(var4), ZF.dN(var28.digest())}));
               if(this.OK) {
                  throw new yL();
               }
            }

            int var6 = ld(this.EO, 32);
            if(var6 < 0) {
               throw new yL();
            } else {
               int var7 = ld(this.EO, 36);
               if(var7 != 112) {
                  cn.dN(String.format("Invalid DEX header size (%Xh)", new Object[]{Integer.valueOf(var7)}));
               }

               int var8 = ld(this.EO, 40);
               if(var8 != 305419896) {
                  if(var8 != 2018915346) {
                     throw new yL();
                  } else {
                     throw new yL();
                  }
               } else {
                  ld(this.EO, 44);
                  ld(this.EO, 48);
                  ld(this.EO, 52);
                  int var9 = ld(this.EO, 56);
                  int var10 = ld(this.EO, 60);
                  int var11 = ld(this.EO, 64);
                  int var12 = ld(this.EO, 68);
                  int var13 = ld(this.EO, 72);
                  int var14 = ld(this.EO, 76);
                  int var15 = ld(this.EO, 80);
                  int var16 = ld(this.EO, 84);
                  int var17 = ld(this.EO, 88);
                  int var18 = ld(this.EO, 92);
                  int var19 = ld(this.EO, 96);
                  int var20 = ld(this.EO, 100);
                  ld(this.EO, 104);
                  ld(this.EO, 108);
                  this.cb = this.dN(var9, var10);
                  this.PF = this.cb.size();
                  this.Hw = this.ld(var11, var12);
                  this.rK = this.QE(var13, var14);
                  this.Ux = this.wU(var15, var16);
                  this.ZY = this.fa(var17, var18);
                  this.bG = new HashMap();
                  this.BQ = new Dn();
                  RI.vd var21 = new RI.vd(this.cb.size(), this.Hw.dN(), this.Ux.dN(), this.ZY.dN());
                  this.ci = new RI(this.EO, this.bG, this.BQ, var21, this.KK);
                  this.s = this.zs(var19, var20);
                  this.Hw.wU();
                  this.BQ.dN(this);
                  Collections.sort(this.Ee, new Comparator() {
                     public int dN(OM var1, OM var2) {
                        return var1.ld() - var2.ld();
                     }

                     // $FF: synthetic method
                     public int compare(Object var1, Object var2) {
                        return this.dN((OM)var1, (OM)var2);
                     }
                  });
                  this.De = new OM[this.Ee.size()];
                  this.Ee.toArray(this.De);
                  if(!this.VX.isEmpty()) {
                     StringBuilder var22 = new StringBuilder(rP.dN(new byte[]{-25, 54, 19, 28, 7, 7, 9, 93, 26, 100, 1, 29, 120, 77, 8, 17, 28, 7, 11, 68, 68, 1, 22, 16, 17, 27, 25, 4, 27, 29, 1, 83, 65, 19, 23, 69, 66, 7, 12, 7, 9, 71, 82, 23, 16, 6, 22, 1, 94, 26}, 1, 176));
                     HashSet var23 = new HashSet();
                     int var24 = 0;
                     Iterator var25 = this.VX.iterator();

                     while(var25.hasNext()) {
                        int var26 = ((Integer)var25.next()).intValue();
                        if(var24++ >= 1) {
                           var22.append(", ");
                        }

                        var22.append(((hO)this.ZY.dN(var26)).QE(false));
                        var23.add(Integer.valueOf(((hO)this.ZY.dN(var26)).fa()));
                     }

                     var22.append(rP.dN(new byte[]{73, 34, 21, 13, 26, 6, 3, 27, 84, 77, 73, 26, 9, 66, 84, 25, 81, 90, 72, 68, 87, 94, 29, 19, 90, 69, 61, 27, 7, 26, 76, 17, 72, 4, 78, 5, 73, 0, 0, 69, 4, 17, 29, 84, 8, 9, 8, 12, 8, 73, 2, 24, 4, 0, 93, 69, 50, 76, 1, 65, 28, 28, 6, 4, 24, 10}, 2, 117));
                     cn.dN(var22.toString());
                  }

                  this.zs = true;
               }
            }
         } else {
            if(this.EO[0] == 80 && this.EO[1] == 75 && this.EO[2] == 3 && this.EO[3] == 4) {
               cn.dN("This DEX file appears to be a ZIP/JAR archive.");
            }

            throw new yL();
         }
      }
   }

   private ArrayList dN(int var1, int var2) {
      HashSet var3 = new HashSet();
      ArrayList var4 = new ArrayList(var1);
      int[] var5 = new int[1];

      for(int var6 = 0; var6 < var1; ++var6) {
         int var7 = ld(this.EO, var2);
         int var8 = ld(this.EO, var7, var5);

         String var9;
         try {
            var9 = wU(this.EO, var7 + var5[0], var5);
            if(var8 != var9.length()) {
               throw new yL();
            }
         } catch (yL var10) {
            var9 = String.format("__invalid_string_%X", new Object[]{Integer.valueOf(var7)});
         }

         var4.add(var9);
         if(!var3.add(var9)) {
            cn.dN(String.format("Duplicate string found: \"%s\"", new Object[]{ZF.QE(var9, true)}));
         }

         var2 += 4;
      }

      return var4;
   }

   private nh ld(int var1, int var2) {
      nh var3 = new nh(this, var1);

      for(int var4 = 0; var4 < var1; ++var4) {
         int var5 = ld(this.EO, var2 + 4 * var4);
         var3.ld(var5);
      }

      return var3;
   }

   private bG QE(int var1, int var2) {
      bG var3 = new bG(this, var1);

      for(int var4 = 0; var4 < var1; ++var4) {
         int var5 = ld(this.EO, var2 + 12 * var4);
         int var6 = ld(this.EO, var2 + 12 * var4 + 4);
         int[] var7 = null;
         int var8 = ld(this.EO, var2 + 12 * var4 + 8);
         if(var8 > 0) {
            int var9 = ld(this.EO, var8);
            var7 = new int[var9];

            for(int var10 = 0; var10 < var9; ++var10) {
               int var11 = dN(this.EO, var8 + 4 + 2 * var10);
               var7[var10] = var11;
            }
         }

         var3.dN(var5, var6, var7);
      }

      return var3;
   }

   private tJ wU(int var1, int var2) {
      tJ var3 = new tJ(this, var1);

      for(int var4 = 0; var4 < var1; ++var4) {
         int var5 = dN(this.EO, var2 + 8 * var4);
         int var6 = dN(this.EO, var2 + 8 * var4 + 2);
         int var7 = ld(this.EO, var2 + 8 * var4 + 4);
         var3.dN(var5, var6, var7);
      }

      return var3;
   }

   private Fx fa(int var1, int var2) {
      Fx var3 = new Fx(this, var1);

      for(int var4 = 0; var4 < var1; ++var4) {
         int var5 = dN(this.EO, var2 + 8 * var4);
         int var6 = dN(this.EO, var2 + 8 * var4 + 2);
         int var7 = ld(this.EO, var2 + 8 * var4 + 4);
         var3.dN(var5, var6, var7);
      }

      return var3;
   }

   private Mx zs(int var1, int var2) {
      Mx var3 = new Mx(this, var1);

      for(int var4 = 0; var4 < var1; var2 += 32) {
         int var5 = ld(this.EO, var2);
         int var6 = ld(this.EO, var2 + 4);
         int var7 = ld(this.EO, var2 + 8);
         int[] var8 = null;
         int var9 = ld(this.EO, var2 + 12);
         int var10;
         int var12;
         if(var9 > 0) {
            var10 = ld(this.EO, var9);
            var8 = new int[var10];

            for(int var11 = 0; var11 < var10; ++var11) {
               var12 = dN(this.EO, var9 + 4 + 2 * var11);
               var8[var11] = var12;
            }
         }

         var10 = ld(this.EO, var2 + 16);
         xd var18 = null;
         var12 = ld(this.EO, var2 + 20);
         if(var12 > 0) {
            var18 = xd.dN(this.EO, var12);
         }

         Uk var13 = null;
         int var14 = ld(this.EO, var2 + 24);
         if(var14 > 0) {
            var13 = this.PF(var14);
         }

         ub[] var15 = null;
         int var16 = ld(this.EO, var2 + 28);
         if(var16 > 0) {
            int[] var17 = new int[1];
            var15 = ub.ld(this.EO, var16, var17);
         }

         if(this.LH) {
            KK(var6);
         }

         int var19 = var3.dN(var5, var6, var7, var8, var10, var18, var13, var15);
         this.rn.put(this.dN(var5, false), var3.dN(var19));
         ++var4;
      }

      return var3;
   }

   private Uk PF(int var1) {
      int[] var2 = new int[1];
      int var3 = ld(this.EO, var1, var2);
      var1 += var2[0];
      int var4 = ld(this.EO, var1, var2);
      var1 += var2[0];
      int var5 = ld(this.EO, var1, var2);
      var1 += var2[0];
      int var6 = ld(this.EO, var1, var2);
      var1 += var2[0];
      XV[] var7 = this.dN(var3, var1, var2);
      var1 += var2[0];
      XV[] var8 = this.dN(var4, var1, var2);
      var1 += var2[0];
      AV[] var9 = this.ld(var5, var1, var2);
      var1 += var2[0];
      AV[] var10 = this.ld(var6, var1, var2);
      Uk var11 = new Uk(var7, var8, var9, var10);
      return var11;
   }

   private XV[] dN(int var1, int var2, int[] var3) {
      XV[] var4 = new XV[var1];
      int[] var5 = new int[1];
      int var6 = 0;
      int var7 = var2;

      for(int var8 = 0; var8 < var1; ++var8) {
         int var9 = ld(this.EO, var7, var5);
         var7 += var5[0];
         var6 += var9;
         int var10 = ld(this.EO, var7, var5);
         var7 += var5[0];
         if(this.LH) {
            EO(var10);
         }

         XV var11 = new XV(var6, var10);
         var4[var8] = var11;
         this.ld.put(((gE)this.Ux.dN(var6)).fa(false), var11);
      }

      var3[0] = var7 - var2;
      return var4;
   }

   private AV[] ld(int var1, int var2, int[] var3) {
      AV[] var4 = new AV[var1];
      int[] var5 = new int[1];
      int var6 = 0;
      int var7 = var2;

      for(int var8 = 0; var8 < var1; ++var8) {
         int var9 = ld(this.EO, var7, var5);
         var7 += var5[0];
         var6 += var9;
         if(this.Hv.contains(Integer.valueOf(var6))) {
            this.VX.add(Integer.valueOf(var6));
         } else {
            this.Hv.add(Integer.valueOf(var6));
         }

         int var10 = ld(this.EO, var7, var5);
         var7 += var5[0];
         int var11 = ld(this.EO, var7, var5);
         var7 += var5[0];
         OM var12 = null;
         if(var11 > 0) {
            var12 = this.Hw(var11);
            var12.dN(var6);
         }

         if(this.LH) {
            cb(var10);
         }

         AV var13 = new AV(var6, var10, var12);
         var4[var8] = var13;
         this.dN.put(((hO)this.ZY.dN(var6)).wU(false), var13);
      }

      var3[0] = var7 - var2;
      return var4;
   }

   private OM Hw(int var1) {
      int var2 = dN(this.EO, var1);
      int var3 = dN(this.EO, var1 + 2);
      int var4 = dN(this.EO, var1 + 4);
      int var5 = dN(this.EO, var1 + 6);
      int var6 = ld(this.EO, var1 + 8);
      int var7 = ld(this.EO, var1 + 12);
      int var8 = var1 + 16;
      int var9 = var8 + 2 * var7;
      nm[] var10 = null;
      if(var5 > 0) {
         int var11 = var9 + (var5 > 0 && var7 % 2 == 1?2:0);
         var10 = this.mS(var5, var11);
      }

      oh var16 = null;
      vD var13 = null;

      Object var12;
      try {
         var16 = this.ci.dN(var8, 2 * var7, var10);
         var12 = var16.QE();
         if(var6 > 0) {
            var13 = vD.dN(this.EO, var6, 0);
         }
      } catch (Exception var15) {
         var12 = new ArrayList();
      }

      OM var14 = new OM(var2, var3, var4, var13, var8, 2 * var7, (List)var12, var16, var10);
      this.Ee.add(var14);
      return var14;
   }

   private nm[] mS(int var1, int var2) {
      nm[] var3 = new nm[var1];
      int var4 = var2 + 8 * var1;

      for(int var5 = 0; var5 < var1; ++var5) {
         int var6 = ld(this.EO, var2 + 8 * var5);
         int var7 = dN(this.EO, var2 + 8 * var5 + 4);
         int var8 = dN(this.EO, var2 + 8 * var5 + 6);
         int var9 = var4 + var8;
         int[] var10 = new int[1];
         int var11 = dN(this.EO, var9, var10);
         var9 += var10[0];
         int var12 = var11 >= 0?var11:-var11;
         ArrayList var13 = new ArrayList(var12 + 1);

         int var14;
         for(var14 = 0; var14 < var12; ++var14) {
            int var15 = ld(this.EO, var9, var10);
            var9 += var10[0];
            int var16 = ld(this.EO, var9, var10);
            var9 += var10[0];
            var13.add(new bt(var15, 2 * var16));
         }

         if(var11 <= 0) {
            var14 = ld(this.EO, var9, var10);
            var13.add(new bt(-1, 2 * var14));
         }

         nm var17 = new nm(2 * var6, 2 * var7, var13);
         var3[var5] = var17;
      }

      return var3;
   }

   public UZ zs(boolean var1) {
      if(this.LR == null || var1) {
         this.LR = new UZ(this);
      }

      return this.LR;
   }

   public UZ ZY() {
      return this.zs(false);
   }
}
