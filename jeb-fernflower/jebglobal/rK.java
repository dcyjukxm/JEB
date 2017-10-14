package jebglobal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.Ec;
import jebglobal.GY;
import jebglobal.JP;
import jebglobal.TM;
import jebglobal.eY;

public class rK {
   private static final long LK = 844563159190538443L;
   public static int dN = 0;
   private List ld;

   public rK(List var1) {
      this(var1, (List)null);
   }

   public rK(List var1, List var2) {
      this.ld = new ArrayList();
      int[][] var3 = new int[var1.size()][];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4] = (int[])var1.get(var4);
      }

      int[][] var6 = null;
      if(var2 != null) {
         var6 = new int[var2.size()][];

         for(int var5 = 0; var5 < var6.length; ++var5) {
            var6[var5] = (int[])var2.get(var5);
         }
      }

      this.dN(var3, var6);
   }

   private rK() {
      this.ld = new ArrayList();
   }

   private void dN(int[][] var1, int[][] var2) {
      if(var1 == null) {
         throw new IllegalArgumentException();
      } else if(var1.length == 0 && (var2 == null || var2.length == 0)) {
         this.ld.add(new eY(1));
      } else {
         int[][][] var3 = var2 != null?new int[][][]{var1, var2}:new int[][][]{var1};
         HashSet var4 = new HashSet();
         int var5 = 0;
         int[][][] var6 = var3;
         int var7 = var3.length;

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            int[][] var9 = var6[var8];
            int[][] var10 = var9;
            int var11 = var9.length;

            for(int var12 = 0; var12 < var11; ++var12) {
               int[] var13 = var10[var12];
               if(var13.length != 2) {
                  throw new RuntimeException();
               }

               var4.add(Integer.valueOf(var13[0]));
               var4.add(Integer.valueOf(var13[1]));
               if(var13[0] > var5) {
                  var5 = var13[0];
               }

               if(var13[1] > var5) {
                  var5 = var13[1];
               }
            }
         }

         for(int var14 = 1; var14 <= var5; ++var14) {
            if(!var4.contains(Integer.valueOf(var14))) {
               throw new RuntimeException();
            }

            this.ld.add(new eY(var14));
         }

         int[][] var15 = var1;
         var7 = var1.length;

         int[] var18;
         eY var19;
         eY var20;
         for(var8 = 0; var8 < var7; ++var8) {
            var18 = var15[var8];
            var19 = this.zs(var18[0]);
            var20 = this.zs(var18[1]);
            if(var19.QE.contains(var20)) {
               var20.ld.contains(var19);
            }

            var19.QE.add(var20);
            var20.ld.add(var19);
         }

         if(var2 != null) {
            var15 = var2;
            var7 = var2.length;

            for(var8 = 0; var8 < var7; ++var8) {
               var18 = var15[var8];
               var19 = this.zs(var18[0]);
               var20 = this.zs(var18[1]);
               if(var19.fa.contains(var20)) {
                  var20.wU.contains(var19);
               }

               var19.fa.add(var20);
               var20.wU.add(var19);
            }
         }

         Iterator var16 = this.ld.iterator();

         eY var17;
         do {
            if(!var16.hasNext()) {
               if(!this.fa(var5)) {
                  throw new RuntimeException();
               }

               return;
            }

            var17 = (eY)var16.next();
         } while(var17.dN == 1 || !var17.ld().isEmpty());

         throw new RuntimeException();
      }
   }

   private boolean fa(int var1) {
      HashSet var2 = new HashSet();
      this.dN((eY)this.ld.get(0), var2);
      return var2.size() == var1;
   }

   private void dN(eY var1, HashSet var2) {
      if(!var2.contains(var1)) {
         var2.add(var1);
         Iterator var3 = var1.dN().iterator();

         while(var3.hasNext()) {
            eY var4 = (eY)var3.next();
            this.dN(var4, var2);
         }

      }
   }

   public HashMap dN() {
      return this.dN(this.LH());
   }

   public HashMap dN(List var1) {
      HashMap var2 = new HashMap();
      ArrayList var3 = new ArrayList();
      int var4 = 1;
      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         int var6 = ((Integer)var5.next()).intValue();
         eY var7 = (eY)this.ld.get(var6 - 1);
         var3.add(var7);
         var7.dN = var4++;
         var2.put(Integer.valueOf(var7.dN), Integer.valueOf(var6));
      }

      this.ld = var3;
      return var2;
   }

   private eY zs(int var1) {
      if(var1 > 0 && var1 <= this.ld.size()) {
         return (eY)this.ld.get(var1 - 1);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int ld() {
      return this.ld.size();
   }

   public int QE() {
      int var1 = 0;

      eY var3;
      for(Iterator var2 = this.ld.iterator(); var2.hasNext(); var1 += var3.QE()) {
         var3 = (eY)var2.next();
      }

      return var1;
   }

   public List dN(int var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.zs(var1).ld.iterator();

      while(var3.hasNext()) {
         eY var4 = (eY)var3.next();
         var2.add(Integer.valueOf(var4.dN));
      }

      return var2;
   }

   public List ld(int var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.zs(var1).ld.iterator();

      eY var4;
      while(var3.hasNext()) {
         var4 = (eY)var3.next();
         var2.add(Integer.valueOf(var4.dN));
      }

      var3 = this.zs(var1).wU.iterator();

      while(var3.hasNext()) {
         var4 = (eY)var3.next();
         var2.add(Integer.valueOf(var4.dN));
      }

      return var2;
   }

   public List QE(int var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.zs(var1).QE.iterator();

      while(var3.hasNext()) {
         eY var4 = (eY)var3.next();
         var2.add(Integer.valueOf(var4.dN));
      }

      return var2;
   }

   public List wU(int var1) {
      ArrayList var2 = new ArrayList();
      Iterator var3 = this.zs(var1).QE.iterator();

      eY var4;
      while(var3.hasNext()) {
         var4 = (eY)var3.next();
         var2.add(Integer.valueOf(var4.dN));
      }

      var3 = this.zs(var1).fa.iterator();

      while(var3.hasNext()) {
         var4 = (eY)var3.next();
         var2.add(Integer.valueOf(var4.dN));
      }

      return var2;
   }

   public boolean wU() {
      return this.ld.size() == 1 && ((eY)this.ld.get(0)).ld.size() == 0 && ((eY)this.ld.get(0)).QE.size() == 0;
   }

   public boolean fa() {
      eY var1 = (eY)this.ld.get(0);
      if(this.ld.size() == 3 && var1.ld.size() == 0 && var1.QE.size() == 2) {
         eY var2 = (eY)var1.QE.get(0);
         eY var3 = (eY)var1.QE.get(1);
         if(var2.ld.size() == 2 && var2.ld.contains(var3) && var2.ld.contains(var1) && var2.QE.size() == 1 && var2.QE.contains(var3) && var3.ld.size() == 2 && var3.ld.contains(var2) && var3.ld.contains(var1) && var3.QE.size() == 1 && var3.QE.contains(var2)) {
            return true;
         }
      }

      return false;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(String.format("(%d, [", new Object[]{Integer.valueOf(this.ld.size())}));
      int var2 = 0;
      Iterator var3 = this.ld.iterator();

      while(var3.hasNext()) {
         eY var4 = (eY)var3.next();

         Iterator var5;
         eY var6;
         for(var5 = var4.QE.iterator(); var5.hasNext(); var1.append(String.format("%d>%d", new Object[]{Integer.valueOf(var4.dN), Integer.valueOf(var6.dN)}))) {
            var6 = (eY)var5.next();
            if(var2++ > 0) {
               var1.append(", ");
            }
         }

         for(var5 = var4.fa.iterator(); var5.hasNext(); var1.append(String.format("%d\\%d", new Object[]{Integer.valueOf(var4.dN), Integer.valueOf(var6.dN)}))) {
            var6 = (eY)var5.next();
            if(var2++ > 0) {
               var1.append(", ");
            }
         }
      }

      var1.append("])");
      return var1.toString();
   }

   public JP zs() {
      JP var1 = new JP();
      Iterator var2 = this.KK().iterator();

      while(var2.hasNext()) {
         List var3 = (List)var2.next();
         ArrayList var4 = new ArrayList();
         Iterator var5 = var3.iterator();

         while(var5.hasNext()) {
            eY var6 = (eY)var5.next();
            var4.add(Integer.valueOf(var6.dN));
         }

         var1.dN.add(var4);
      }

      return var1;
   }

   private List KK() {
      eY var1 = (eY)this.ld.get(0);
      ArrayDeque var2 = new ArrayDeque();
      var2.push(var1);
      ArrayList var3 = new ArrayList(this.ld);
      var3.remove(var1);
      ArrayList var4 = new ArrayList();

      label83:
      while(!var2.isEmpty()) {
         ArrayList var5 = new ArrayList();
         var5.add(var2.pop());

         while(true) {
            ArrayList var6 = new ArrayList();
            Iterator var7 = var3.iterator();

            eY var8;
            while(var7.hasNext()) {
               var8 = (eY)var7.next();
               boolean var9 = true;
               Iterator var10 = var8.ld().iterator();

               while(var10.hasNext()) {
                  eY var11 = (eY)var10.next();
                  if(!var5.contains(var11)) {
                     var9 = false;
                     break;
                  }
               }

               if(var9) {
                  var5.add(var8);
                  var6.add(var8);
               }
            }

            if(var6.size() == 0) {
               var6 = new ArrayList();
               var7 = var3.iterator();

               while(true) {
                  while(var7.hasNext()) {
                     var8 = (eY)var7.next();
                     Iterator var12 = var8.ld().iterator();

                     while(var12.hasNext()) {
                        eY var13 = (eY)var12.next();
                        if(var5.contains(var13)) {
                           var6.add(var8);
                           break;
                        }
                     }
                  }

                  var7 = var6.iterator();

                  while(var7.hasNext()) {
                     var8 = (eY)var7.next();
                     var2.push(var8);
                     var3.remove(var8);
                  }

                  var4.add(var5);
                  continue label83;
               }
            }

            var7 = var6.iterator();

            while(var7.hasNext()) {
               var8 = (eY)var7.next();
               var3.remove(var8);
            }
         }
      }

      return var4;
   }

   private int dN(List var1, eY var2) {
      int var3 = 0;

      for(Iterator var4 = var1.iterator(); var4.hasNext(); ++var3) {
         List var5 = (List)var4.next();
         Iterator var6 = var5.iterator();

         while(var6.hasNext()) {
            eY var7 = (eY)var6.next();
            if(var7 == var2) {
               return var3;
            }
         }
      }

      return -1;
   }

   public GY mS() {
      GY var1 = new GY();
      rK var2 = this;

      while(true) {
         JP var3 = var2.zs();
         var1.dN.add(new GY.uK(var2, var3));
         if(var3.dN() == var2.ld()) {
            return var1;
         }

         List var4 = var2.KK();
         rK var5 = new rK();
         int var6 = 1;

         Iterator var7;
         Iterator var11;
         eY var12;
         eY var14;
         for(var7 = var4.iterator(); var7.hasNext(); ++var6) {
            List var8 = (List)var7.next();
            eY var9 = new eY(var6);
            var9.zs = new ArrayList();
            eY var10 = (eY)var8.get(0);
            var11 = var10.ld().iterator();

            while(var11.hasNext()) {
               var12 = (eY)var11.next();
               if(!var8.contains(var12)) {
                  var9.ld.add(var12);
               }
            }

            var11 = var8.iterator();

            while(var11.hasNext()) {
               var12 = (eY)var11.next();
               Iterator var13 = var12.dN().iterator();

               while(var13.hasNext()) {
                  var14 = (eY)var13.next();
                  if(!var8.contains(var14) && !var9.dN().contains(var14)) {
                     var9.QE.add(var14);
                  }
               }
            }

            var5.ld.add(var9);
         }

         eY var15;
         ArrayList var18;
         for(var7 = var5.ld.iterator(); var7.hasNext(); var15.QE = var18) {
            var15 = (eY)var7.next();
            ArrayList var16 = new ArrayList();
            Iterator var17 = var15.ld.iterator();

            while(var17.hasNext()) {
               eY var19 = (eY)var17.next();
               int var20 = this.dN(var4, var19);
               eY var21 = (eY)var5.ld.get(var20);
               if(!var16.contains(var21)) {
                  var16.add(var21);
               }
            }

            var15.ld = var16;
            var18 = new ArrayList();
            var11 = var15.QE.iterator();

            while(var11.hasNext()) {
               var12 = (eY)var11.next();
               int var22 = this.dN(var4, var12);
               var14 = (eY)var5.ld.get(var22);
               if(!var18.contains(var14)) {
                  var18.add(var14);
               }
            }
         }

         var2 = var5;
      }
   }

   public List OK() {
      Iterator var1 = this.ld.iterator();

      while(var1.hasNext()) {
         eY var2 = (eY)var1.next();
         var2.mS.clear();
      }

      ArrayList var5 = new ArrayList();
      this.dN((eY)((eY)this.ld.get(0)), (List)var5);
      ArrayList var6 = new ArrayList();

      for(int var3 = var5.size() - 1; var3 >= 0; --var3) {
         int var4 = ((eY)var5.get(var3)).dN;
         if(!var6.contains(Integer.valueOf(var4))) {
            var6.add(Integer.valueOf(var4));
         }
      }

      return var6;
   }

   private void dN(eY var1, List var2) {
      if(!var2.contains(var1) || var1.mS.size() != var1.QE.size() + var1.fa.size()) {
         var2.add(var1);
         Iterator var3 = var1.dN().iterator();

         while(var3.hasNext()) {
            eY var4 = (eY)var3.next();
            if(!var1.mS.contains(var4)) {
               var1.mS.add(var4);
               this.dN(var4, var2);
               var2.add(var1);
            }
         }

      }
   }

   public List dN(boolean var1) {
      eY var2 = (eY)this.ld.get(0);
      HashMap var3 = new HashMap();
      Iterator var4 = this.ld.iterator();

      while(var4.hasNext()) {
         eY var5 = (eY)var4.next();
         if(var5 == var2) {
            HashSet var6 = new HashSet();
            var6.add(var2);
            var3.put(var2, var6);
         } else {
            var3.put(var5, new HashSet(this.ld));
         }
      }

      boolean var12;
      label67:
      do {
         var12 = false;
         Iterator var13 = this.ld.iterator();

         while(true) {
            eY var15;
            do {
               if(!var13.hasNext()) {
                  continue label67;
               }

               var15 = (eY)var13.next();
            } while(var15 == var2);

            HashSet var7 = new HashSet();
            int var8 = 0;
            List var9 = var1?var15.ld():var15.ld;

            for(Iterator var10 = var9.iterator(); var10.hasNext(); ++var8) {
               eY var11 = (eY)var10.next();
               if(var8 == 0) {
                  var7.addAll((Collection)var3.get(var11));
               } else {
                  var7.retainAll((Collection)var3.get(var11));
               }
            }

            var7.add(var15);
            if(!var7.equals(var3.get(var15))) {
               var3.put(var15, var7);
               var12 = true;
            }
         }
      } while(var12);

      ArrayList var14 = new ArrayList();
      Iterator var16 = this.ld.iterator();

      while(var16.hasNext()) {
         eY var17 = (eY)var16.next();
         HashSet var18 = new HashSet();
         Iterator var19 = ((HashSet)var3.get(var17)).iterator();

         while(var19.hasNext()) {
            eY var20 = (eY)var19.next();
            var18.add(Integer.valueOf(var20.dN));
         }

         var14.add(var18);
      }

      return var14;
   }

   public List ld(boolean var1) {
      List var2 = this.dN(var1);
      ArrayList var3 = new ArrayList();
      int var4 = 1;

      for(Iterator var5 = var2.iterator(); var5.hasNext(); ++var4) {
         HashSet var6 = (HashSet)var5.next();
         int var7 = -1;
         Iterator var8 = var6.iterator();

         while(var8.hasNext()) {
            int var9 = ((Integer)var8.next()).intValue();
            if(var9 != var4) {
               if(var7 < 0) {
                  var7 = var9;
               } else if(((HashSet)var2.get(var9 - 1)).contains(Integer.valueOf(var7))) {
                  var7 = var9;
               }
            }
         }

         var3.add(Integer.valueOf(var7));
      }

      return var3;
   }

   public List LH() {
      rK var1 = this;
      ArrayList var2 = new ArrayList();
      int var3 = -1;

      while(true) {
         Ec var4 = new Ec(var1, var1.zs());
         var2.add(var4);
         int var7;
         if(var3 == 0 || var1.wU() || var1.fa()) {
            ArrayList var29 = new ArrayList();
            int var30;
            if(var1.wU()) {
               var29.add(Integer.valueOf(1));
            } else if(var1.fa()) {
               var29.add(Integer.valueOf(1));
               var29.add(Integer.valueOf(2));
               var29.add(Integer.valueOf(3));
            } else {
               if(var3 != 0) {
                  throw new RuntimeException();
               }

               for(var30 = 0; var30 < var1.ld(); ++var30) {
                  var29.add(Integer.valueOf(var30 + 1));
               }
            }

            for(var30 = var2.size() - 1; var30 >= 1; --var30) {
               Ec var31 = (Ec)var2.get(var30);

               List var37;
               for(var7 = 0; var7 < var29.size(); var7 += var37.size()) {
                  int var33 = ((Integer)var29.get(var7)).intValue();
                  eY var35 = (eY)var31.dN.ld.get(var33 - 1);
                  var37 = (List)var35.zs;
                  this.dN(var29, var7, var37);
               }
            }

            return var29;
         }

         JP var5 = var4.ld;
         rK var6 = new rK();
         var7 = 1;
         var3 = 0;
         Iterator var8 = var5.dN.iterator();

         while(true) {
            int var13;
            eY var42;
            while(var8.hasNext()) {
               List var9 = (List)var8.next();
               int var10 = ((Integer)var9.get(0)).intValue();
               boolean var11 = false;
               Iterator var12 = var1.ld(var10).iterator();

               while(var12.hasNext()) {
                  var13 = ((Integer)var12.next()).intValue();
                  if(var9.contains(Integer.valueOf(var13))) {
                     var11 = true;
                     break;
                  }
               }

               if(!var11 && var5.dN() > 1) {
                  for(var12 = var9.iterator(); var12.hasNext(); var42.zs = new ArrayList((Collection)var4.QE.get(Integer.valueOf(var42.dN)))) {
                     var13 = ((Integer)var12.next()).intValue();
                     var42 = new eY(var7++);
                     var42.OK.addAll(var1.ld(var13));
                     var42.LH.addAll(var1.wU(var13));
                     var6.ld.add(var42);
                     var4.wU.put(Integer.valueOf(var13), Integer.valueOf(var42.dN));
                     var4.QE.put(Integer.valueOf(var42.dN), TM.dN(new int[]{var13}));
                  }
               } else {
                  ++var3;
                  HashMap var39 = new HashMap();
                  HashMap var41 = new HashMap();
                  int var14 = 1;

                  for(Iterator var15 = var9.iterator(); var15.hasNext(); ++var14) {
                     int var16 = ((Integer)var15.next()).intValue();
                     var39.put(Integer.valueOf(var16), Integer.valueOf(var14));
                     var41.put(Integer.valueOf(var14), Integer.valueOf(var16));
                  }

                  ArrayList var43 = new ArrayList();
                  ArrayList var44 = new ArrayList();
                  Iterator var17 = var9.iterator();

                  int var18;
                  List var19;
                  Iterator var20;
                  int var21;
                  label245:
                  while(var17.hasNext()) {
                     var18 = ((Integer)var17.next()).intValue();
                     var19 = var1.wU(var18);
                     var20 = var19.iterator();

                     while(true) {
                        while(true) {
                           if(!var20.hasNext()) {
                              continue label245;
                           }

                           var21 = ((Integer)var20.next()).intValue();
                           if(var21 != var10 && var9.contains(Integer.valueOf(var21))) {
                              var43.add(new int[]{((Integer)var39.get(Integer.valueOf(var18))).intValue(), ((Integer)var39.get(Integer.valueOf(var21))).intValue()});
                           } else if(var21 == var10) {
                              var44.add(var39.get(Integer.valueOf(var18)));
                           }
                        }
                     }
                  }

                  rK var45 = new rK(var43);
                  Iterator var22;
                  int var23;
                  if(!var44.isEmpty()) {
                     var18 = ((Integer)var39.get(Integer.valueOf(var10))).intValue();
                     var19 = var45.wU(var18);
                     if(var19.size() == 2) {
                        int[] var48 = new int[2];
                        var21 = 0;

                        for(var22 = var19.iterator(); var22.hasNext(); ++var21) {
                           var23 = ((Integer)var22.next()).intValue();
                           Iterator var24 = var44.iterator();

                           while(var24.hasNext()) {
                              int var25 = ((Integer)var24.next()).intValue();
                              if(var45.dN(var23, var25)) {
                                 ++var48[var21];
                              }
                           }
                        }

                        if(var48[0] != var48[1]) {
                           int var50 = (var48[0] > var48[1]?(Integer)var19.get(1):(Integer)var19.get(0)).intValue();
                           int[] var51 = new int[]{var18, var50};
                           int var52 = (var48[0] > var48[1]?(Integer)var19.get(0):(Integer)var19.get(1)).intValue();
                           int[] var53 = new int[]{var18, var52};
                           boolean var26 = false;
                           var21 = 0;

                           for(Iterator var27 = var43.iterator(); var27.hasNext(); ++var21) {
                              int[] var28 = (int[])var27.next();
                              if(Arrays.equals(var28, var51)) {
                                 break;
                              }

                              if(Arrays.equals(var28, var53)) {
                                 var26 = true;
                              }
                           }

                           if(var26) {
                              var43.remove(var21);
                              var43.add(0, var51);
                              var45 = new rK(var43);
                           }
                        }
                     }
                  }

                  List var46 = var45.OK();

                  for(int var47 = 0; var47 < var46.size(); ++var47) {
                     var46.set(var47, var41.get(var46.get(var47)));
                  }

                  eY var49 = new eY(var7++);
                  var20 = var9.iterator();

                  while(var20.hasNext()) {
                     var21 = ((Integer)var20.next()).intValue();
                     var22 = var1.wU(var21).iterator();

                     while(var22.hasNext()) {
                        var23 = ((Integer)var22.next()).intValue();
                        if(!var9.contains(Integer.valueOf(var23))) {
                           var49.LH.add(Integer.valueOf(var23));
                        }
                     }
                  }

                  var20 = var1.ld(var10).iterator();

                  while(var20.hasNext()) {
                     var21 = ((Integer)var20.next()).intValue();
                     if(!var9.contains(Integer.valueOf(var21))) {
                        var49.OK.add(Integer.valueOf(var21));
                     }
                  }

                  var6.ld.add(var49);
                  var20 = var9.iterator();

                  while(var20.hasNext()) {
                     var21 = ((Integer)var20.next()).intValue();
                     var4.wU.put(Integer.valueOf(var21), Integer.valueOf(var49.dN));
                  }

                  var4.QE.put(Integer.valueOf(var49.dN), new ArrayList(var9));
                  var49.zs = var46;
               }
            }

            rK[] var32 = new rK[]{var6, var1, var1, var6, var6, var6, var6, var1, var1, var1};
            Iterator var34 = var6.ld.iterator();

            while(var34.hasNext()) {
               eY var36 = (eY)var34.next();
               Iterator var38 = var36.LH.iterator();

               int var40;
               while(var38.hasNext()) {
                  var40 = ((Integer)var38.next()).intValue();
                  var13 = ((Integer)var4.wU.get(Integer.valueOf(var40))).intValue();
                  var42 = (eY)var6.ld.get(var13 - 1);
                  if(!var36.QE.contains(var42)) {
                     var36.QE.add(var42);
                  }
               }

               var38 = var36.OK.iterator();

               while(var38.hasNext()) {
                  var40 = ((Integer)var38.next()).intValue();
                  var13 = ((Integer)var4.wU.get(Integer.valueOf(var40))).intValue();
                  var42 = (eY)var6.ld.get(var13 - 1);
                  if(!var36.ld.contains(var42)) {
                     var36.ld.add(var42);
                  }
               }
            }

            var1 = var32[0];
            break;
         }
      }
   }

   private void dN(List var1, int var2, List var3) {
      var1.remove(var2);

      for(int var4 = 0; var4 < var3.size(); ++var4) {
         var1.add(var2 + var4, var3.get(var4));
      }

   }

   public boolean dN(int var1, int var2) {
      Iterator var3 = this.ld.iterator();

      while(var3.hasNext()) {
         eY var4 = (eY)var3.next();
         var4.mS.clear();
      }

      ArrayList var5 = new ArrayList();
      return this.dN(this.zs(var1), this.zs(var2), var5);
   }

   private boolean dN(eY var1, eY var2, List var3) {
      if(var3.contains(var1) && var1.mS.size() == var1.QE()) {
         return false;
      } else if(var1 == var2) {
         return true;
      } else {
         var3.add(var1);
         Iterator var4 = var1.dN().iterator();

         while(var4.hasNext()) {
            eY var5 = (eY)var4.next();
            if(!var1.mS.contains(var5)) {
               var1.mS.add(var5);
               if(this.dN(var5, var2, var3)) {
                  return true;
               }

               var3.add(var1);
            }
         }

         return false;
      }
   }
}
