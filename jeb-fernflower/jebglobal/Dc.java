package jebglobal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.GY;
import jebglobal.rK;

public class Dc {
   private static final long LK = 844563159190538443L;
   private rK ld;
   private GY QE;
   private int[][] wU;
   private HashMap fa;
   private HashMap zs;
   private HashMap mS;
   public boolean dN = false;
   private static int OK = 8;

   public Dc(rK var1, byte[] var2) {
      this.ld = var1;
      this.QE = this.ld.mS();
      this.wU = new int[this.QE.dN.size()][];
      int var3 = 0;

      int var6;
      int var7;
      for(Iterator var4 = this.QE.dN.iterator(); var4.hasNext(); ++var3) {
         GY.uK var5 = (GY.uK)var4.next();
         var6 = var5.dN.ld();
         this.wU[var3] = new int[var6];

         for(var7 = 0; var7 < var6; ++var7) {
            this.wU[var3][var7] = 0;
         }
      }

      int var9 = 0;
      if(var2 != null) {
         int var10 = 1;
         var6 = 0;

         for(var7 = 0; var7 < var2.length; ++var7) {
            int var8 = var2[var7] & 255;
            var10 = (var10 + var8) % '\ufff1';
            var6 = (var6 + var10) % '\ufff1';
         }

         var9 = var6 << 16 | var10;
      }

      var9 += var1.ld() * var1.QE() % 10;
      var9 &= 255;
      var9 %= 10;
      if(var9 >= OK) {
         this.fa = new HashMap();
         this.zs = new HashMap();
         this.mS = new HashMap();
         this.dN = true;
      }

   }

   public HashMap dN() {
      if(this.fa != null) {
         return this.fa;
      } else {
         this.fa = new HashMap();
         int var1 = 0;
         Iterator var2 = this.QE.dN.iterator();

         label126:
         while(var2.hasNext()) {
            GY.uK var3 = (GY.uK)var2.next();
            rK var4 = var3.dN;
            Iterator var5 = var3.ld.dN.iterator();

            while(true) {
               int var11;
               int var12;
               ArrayList var13;
               int var15;
               int var16;
               do {
                  do {
                     do {
                        int var7;
                        int var8;
                        do {
                           if(!var5.hasNext()) {
                              ++var1;
                              continue label126;
                           }

                           List var6 = (List)var5.next();
                           var7 = ((Integer)var6.get(0)).intValue();
                           var8 = 0;
                           ArrayList var9 = new ArrayList();
                           Iterator var10 = var4.dN(var7).iterator();

                           while(var10.hasNext()) {
                              var11 = ((Integer)var10.next()).intValue();
                              if(var6.contains(Integer.valueOf(var11))) {
                                 var9.add(Integer.valueOf(var11));
                                 if(var11 > var8) {
                                    var8 = var11;
                                 }
                              }
                           }
                        } while(var8 <= 0);

                        if(var8 < var7) {
                           throw new RuntimeException();
                        }

                        int[] var19 = new int[]{var7, var8};
                        this.dN(this.QE, var1, var19);
                        var11 = var19[0];
                        var12 = var19[1];
                     } while(this.wU[0][var11 - 1] != 0);
                  } while(this.wU[0][var12 - 1] != 0);

                  var13 = new ArrayList();

                  for(int var14 = var11; var14 <= var12; ++var14) {
                     var13.add(Integer.valueOf(var14));
                  }

                  var15 = this.ld.QE(var11).size();
                  var16 = this.ld.QE(var12).size();
                  if(var15 <= 0 || var16 <= 0) {
                     throw new RuntimeException();
                  }
               } while(var15 != 1 && var15 != 2 && var16 != 1 && var16 != 2);

               Dc.lX var20;
               if(var16 == 2) {
                  var20 = Dc.lX.ld;
               } else if(var15 == 2) {
                  List var17 = this.ld.QE(var11);
                  if(var13.contains(var17.get(0)) && var13.contains(var17.get(1))) {
                     var20 = Dc.lX.QE;
                  } else {
                     var20 = Dc.lX.dN;
                  }
               } else {
                  var20 = Dc.lX.QE;
               }

               int var21 = 0;
               List var18;
               if(var20 == Dc.lX.ld) {
                  var18 = this.ld.QE(var12);
                  if(((Integer)var18.get(0)).intValue() == var11) {
                     var21 = ((Integer)var18.get(1)).intValue();
                  } else {
                     if(((Integer)var18.get(1)).intValue() != var11) {
                        throw new RuntimeException();
                     }

                     var21 = ((Integer)var18.get(0)).intValue();
                  }
               } else if(var20 == Dc.lX.dN) {
                  var18 = this.ld.QE(var11);
                  if(var13.contains(var18.get(0))) {
                     var21 = ((Integer)var18.get(1)).intValue();
                  } else {
                     if(!var13.contains(var18.get(1))) {
                        throw new RuntimeException();
                     }

                     var21 = ((Integer)var18.get(0)).intValue();
                  }
               }

               this.wU[0][var11 - 1] = -1;
               this.wU[0][var12 - 1] = 1;
               this.fa.put(Integer.valueOf(var11), new Dc.vd(var11, var12, var21, var20, var13));
            }
         }

         return this.fa;
      }
   }

   private void dN(GY var1, int var2, int[] var3) {
      int var4 = var3[0];

      int var5;
      int var8;
      for(var5 = var3[1]; var2 >= 1; var5 = var8) {
         --var2;
         GY.uK var6 = (GY.uK)var1.dN.get(var2);
         rK var7 = var6.dN;
         var4 = ((Integer)((List)var6.ld.dN.get(var4 - 1)).get(0)).intValue();
         var8 = 0;
         Iterator var9 = ((List)var6.ld.dN.get(var5 - 1)).iterator();

         while(var9.hasNext()) {
            int var10 = ((Integer)var9.next()).intValue();
            if(var7.QE(var10).contains(Integer.valueOf(var4)) && var10 > var8) {
               var8 = var10;
            }
         }
      }

      var3[0] = var4;
      var3[1] = var5;
   }

   public HashMap ld() {
      if(this.zs != null) {
         return this.zs;
      } else {
         this.zs = new HashMap();
         List var1 = this.ld.ld(false);
         HashSet var2 = new HashSet();

         for(int var3 = this.ld.ld(); var3 >= 1; --var3) {
            if(this.ld.QE(var3).size() == 2 && this.wU[0][var3 - 1] <= 0) {
               int var4 = 0;
               int var5 = 1;

               Iterator var6;
               int var7;
               for(var6 = var1.iterator(); var6.hasNext(); ++var5) {
                  var7 = ((Integer)var6.next()).intValue();
                  if(var7 == var3 && this.ld.dN(var5).size() >= 2 && var5 > var4) {
                     var4 = var5;
                  }
               }

               if(var4 <= var3) {
                  var2.add(Integer.valueOf(var3));
               } else {
                  this.wU[0][var3 - 1] = 1;
                  this.zs.put(Integer.valueOf(var3), new Dc.uK(var3, var4));
                  var6 = var2.iterator();

                  while(var6.hasNext()) {
                     var7 = ((Integer)var6.next()).intValue();
                     if(var7 < var4 && this.ld.dN(var3, var7)) {
                        this.wU[0][var7 - 1] = 1;
                        this.zs.put(Integer.valueOf(var7), new Dc.uK(var7, var4));
                     }
                  }

                  var2.clear();
               }
            }
         }

         return this.zs;
      }
   }

   public HashMap QE() {
      if(this.mS != null) {
         return this.mS;
      } else {
         this.mS = new HashMap();
         List var1 = this.ld.ld(false);
         HashSet var2 = new HashSet();

         for(int var3 = this.ld.ld(); var3 >= 1; --var3) {
            if(this.ld.QE(var3).size() >= 3) {
               int var4 = this.ld.QE(var3).size();
               if(this.wU[0][var3 - 1] <= 0) {
                  int var5 = 0;
                  int var6 = 1;

                  Iterator var7;
                  int var8;
                  for(var7 = var1.iterator(); var7.hasNext(); ++var6) {
                     var8 = ((Integer)var7.next()).intValue();
                     if(var8 == var3 && this.ld.dN(var6).size() >= var4 && var6 > var5) {
                        var5 = var6;
                     }
                  }

                  if(var5 <= var3) {
                     var2.add(Integer.valueOf(var3));
                  } else {
                     this.wU[0][var3 - 1] = 1;
                     this.mS.put(Integer.valueOf(var3), new Dc.uK(var3, var5));
                     var7 = var2.iterator();

                     while(var7.hasNext()) {
                        var8 = ((Integer)var7.next()).intValue();
                        if(var8 < var5 && this.ld.dN(var3, var8)) {
                           this.wU[0][var8 - 1] = 1;
                           this.mS.put(Integer.valueOf(var8), new Dc.uK(var8, var5));
                        }
                     }

                     var2.clear();
                  }
               }
            }
         }

         return this.mS;
      }
   }

   public static class uK {
      public int dN;
      public int ld;

      uK(int var1, int var2) {
         if(var1 <= 0) {
            throw new RuntimeException();
         } else {
            this.dN = var1;
            this.ld = var2;
         }
      }
   }

   public static class vd {
      public int dN;
      public Dc.lX ld;

      vd(int var1, int var2, int var3, Dc.lX var4, List var5) {
         if(var1 > 0 && var2 > 0) {
            this.dN = var2;
            this.ld = var4;
         } else {
            throw new RuntimeException();
         }
      }
   }

   public static enum lX {
      dN,
      ld,
      QE;
   }
}
