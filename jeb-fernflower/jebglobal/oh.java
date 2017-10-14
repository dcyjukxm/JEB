package jebglobal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.Js;
import jebglobal.QE;
import jebglobal.bm;
import jebglobal.ft;
import jebglobal.ll;

public final class oh {
   private static final long LK = 844563159190538443L;
   private List QE = null;
   private boolean wU = false;
   HashMap dN = null;
   HashMap ld = null;
   private HashMap fa = null;
   private HashMap zs = null;
   private HashMap mS = null;
   private HashMap OK = null;
   private HashMap LH = null;
   private HashMap KK = null;

   public oh(List var1) {
      this.QE = new ArrayList(var1.size());
      HashMap var2 = new HashMap();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Js var4 = (Js)var3.next();
         ft var5 = new ft();
         var5.dN = var4.dN;
         var5.ld = var4.ld;
         var5.QE = var4.QE;
         this.QE.add(var5);
         Iterator var6 = var5.dN.iterator();

         while(var6.hasNext()) {
            bm var7 = (bm)var6.next();
            var2.put(Integer.valueOf(var7.dN()), var5);
         }
      }

      this.dN(var2);
   }

   public oh(List var1, List var2) {
      this.ld(var1, var2);
   }

   public ft dN(int var1) {
      return (ft)this.QE.get(var1);
   }

   public int dN() {
      return this.QE.size();
   }

   public List ld() {
      return new ArrayList(this.QE);
   }

   public ft ld(int var1) {
      Iterator var2 = this.QE.iterator();

      ft var3;
      do {
         if(!var2.hasNext()) {
            return null;
         }

         var3 = (ft)var2.next();
      } while(var3.dN(0).dN() != var1);

      return var3;
   }

   public List QE() {
      ArrayList var1 = new ArrayList();
      Iterator var2 = this.QE.iterator();

      while(var2.hasNext()) {
         ft var3 = (ft)var2.next();
         var1.addAll(var3.dN);
      }

      var1.trimToSize();
      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(String.format("CFG(%d): ", new Object[]{Integer.valueOf(this.QE.size())}));
      int var2 = 0;

      for(Iterator var3 = this.QE.iterator(); var3.hasNext(); ++var2) {
         ft var4 = (ft)var3.next();
         if(var2 > 0) {
            var1.append(", ");
         }

         var1.append(var4);
      }

      return var1.toString();
   }

   public void dN(List var1, List var2) {
      HashMap var3 = new HashMap();
      int var4 = 1;

      Iterator var5;
      ft var6;
      for(var5 = this.QE.iterator(); var5.hasNext(); ++var4) {
         var6 = (ft)var5.next();
         var3.put(var6, Integer.valueOf(var4));
      }

      var5 = this.QE.iterator();

      while(var5.hasNext()) {
         var6 = (ft)var5.next();

         int var7;
         ft var8;
         for(var7 = var6.fa.size() - 1; var7 >= 0; --var7) {
            var8 = (ft)var6.fa.get(var7);
            var1.add(new int[]{((Integer)var3.get(var6)).intValue(), ((Integer)var3.get(var8)).intValue()});
         }

         for(var7 = var6.mS.size() - 1; var7 >= 0; --var7) {
            var8 = (ft)var6.mS.get(var7);
            var2.add(new int[]{((Integer)var3.get(var6)).intValue(), ((Integer)var3.get(var8)).intValue()});
         }
      }

   }

   private void ld(List var1, List var2) {
      if(var1.size() != 0 && ((bm)var1.get(0)).dN() == 0) {
         Collections.sort(var1, new Comparator() {
            public int dN(bm var1, bm var2) {
               return var1.dN() - var2.dN();
            }

            // $FF: synthetic method
            public int compare(Object var1, Object var2) {
               return this.dN((bm)var1, (bm)var2);
            }
         });
         bm var3 = (bm)var1.get(var1.size() - 1);
         int var4 = var3.dN() + var3.ld();
         HashMap var5 = new HashMap();

         for(int var6 = 0; var6 < var1.size(); ++var6) {
            var5.put(Integer.valueOf(((bm)var1.get(var6)).dN()), Integer.valueOf(var6));
         }

         this.QE = new ArrayList();
         HashMap var16 = new HashMap();
         ArrayDeque var7 = new ArrayDeque();
         var7.push(Integer.valueOf(0));
         int var8 = 0;

         while(true) {
            int var20;
            label120:
            while(!var7.isEmpty()) {
               int var9 = ((Integer)var7.pop()).intValue();
               ft var10 = (ft)var16.get(Integer.valueOf(var9));
               if(var10 != null) {
                  if(((bm)var10.dN.get(0)).dN() != var9) {
                     int var19 = -1;
                     var20 = 0;

                     bm var26;
                     for(Iterator var23 = var10.dN.iterator(); var23.hasNext(); ++var20) {
                        var26 = (bm)var23.next();
                        if(var26.dN() == var9) {
                           var19 = var20;
                           break;
                        }
                     }

                     if(var19 < 0) {
                        throw new RuntimeException();
                     }

                     ft var24 = new ft();
                     this.QE.add(var24);

                     for(var20 = var19; var20 < var10.dN.size(); ++var20) {
                        var26 = (bm)var10.dN.get(var20);
                        var24.dN.add(var26);
                        var16.put(Integer.valueOf(var26.dN()), var24);
                     }

                     var24.ld = new ArrayList(var10.ld);
                     int var28 = var10.dN.size() - var19;

                     for(var20 = 0; var20 < var28; ++var20) {
                        var10.dN.remove(var19);
                     }

                     var10.ld.clear();
                     var10.ld.add(Integer.valueOf(var9));
                  }
               } else {
                  var10 = new ft();
                  this.QE.add(var10);

                  while(true) {
                     ft var11 = (ft)var16.get(Integer.valueOf(var9));
                     if(var11 != null) {
                        if(var10.dN.isEmpty()) {
                           throw new RuntimeException();
                        }

                        var10.ld.add(Integer.valueOf(((bm)var11.dN.get(0)).dN()));
                        break;
                     }

                     bm var12 = (bm)var1.get(((Integer)var5.get(Integer.valueOf(var9))).intValue());
                     var10.dN.add(var12);
                     var16.put(Integer.valueOf(var9), var10);
                     ArrayList var13 = new ArrayList();
                     if(var12.dN(var13)) {
                        Iterator var14 = var13.iterator();

                        while(true) {
                           if(!var14.hasNext()) {
                              continue label120;
                           }

                           int var15 = ((Integer)var14.next()).intValue();
                           var10.ld.add(Integer.valueOf(var15));
                           var7.push(Integer.valueOf(var15));
                        }
                     }

                     var9 += var12.ld();
                  }
               }
            }

            Iterator var17;
            QE var18;
            if(var2 == null || var8 > 0) {
               if(var2 != null) {
                  var17 = var2.iterator();

                  while(var17.hasNext()) {
                     var18 = (QE)var17.next();
                     Iterator var22 = this.QE.iterator();

                     while(var22.hasNext()) {
                        ft var27 = (ft)var22.next();
                        int var25 = ((bm)var27.dN.get(0)).dN();
                        if(var25 >= var18.dN && var25 <= var18.ld && !var27.QE.contains(Integer.valueOf(var18.QE))) {
                           var27.QE.add(Integer.valueOf(var18.QE));
                        }
                     }
                  }
               }

               this.dN(var16);
               return;
            }

            var17 = var2.iterator();

            while(var17.hasNext()) {
               var18 = (QE)var17.next();
               var7.push(Integer.valueOf(var18.QE));
               var7.push(Integer.valueOf(var18.dN));
               bm var21 = (bm)var1.get(((Integer)var5.get(Integer.valueOf(var18.ld))).intValue());
               var20 = var21.dN() + var21.ld();
               if(var20 < var4) {
                  var7.push(Integer.valueOf(var20));
               }
            }

            ++var8;
         }
      } else {
         throw new RuntimeException();
      }
   }

   private void dN(HashMap var1) {
      ft var3;
      for(Iterator var2 = this.QE.iterator(); var2.hasNext(); var3.QE = null) {
         var3 = (ft)var2.next();
         Iterator var4 = var3.ld.iterator();

         int var5;
         ft var6;
         while(var4.hasNext()) {
            var5 = ((Integer)var4.next()).intValue();
            var6 = (ft)var1.get(Integer.valueOf(var5));
            var3.fa.add(var6);
            var6.wU.add(var3);
         }

         var4 = var3.QE.iterator();

         while(var4.hasNext()) {
            var5 = ((Integer)var4.next()).intValue();
            var6 = (ft)var1.get(Integer.valueOf(var5));
            var3.mS.add(var6);
            var6.zs.add(var3);
         }

         var3.ld = null;
      }

      Collections.sort(this.QE, new Comparator() {
         public int dN(ft var1, ft var2) {
            return ((bm)var1.dN.get(0)).dN() - ((bm)var2.dN.get(0)).dN();
         }

         // $FF: synthetic method
         public int compare(Object var1, Object var2) {
            return this.dN((ft)var1, (ft)var2);
         }
      });
   }

   public int wU() {
      int var1 = 0;
      int var2 = 0;

      while(true) {
         while(var2 < this.QE.size()) {
            ft var3 = (ft)this.QE.get(var2);
            if(var3.KK() == 1 && var3.EO() == 0 && var3.dN() >= 1 && !var3.QE().dN((List)null)) {
               ft var4 = null;
               bm var5 = var3.QE();
               int var6 = var5.dN() + var5.ld();
               Iterator var7 = this.QE.iterator();

               while(var7.hasNext()) {
                  ft var8 = (ft)var7.next();
                  if(var8.fa() == 1 && var8.zs() == 0 && var8.EO() == 0 && var8.dN(0).dN() == var6) {
                     var4 = var8;
                     break;
                  }
               }

               if(var4 != null) {
                  var7 = var4.dN.iterator();

                  while(var7.hasNext()) {
                     bm var9 = (bm)var7.next();
                     var3.dN.add(var9);
                  }

                  this.dN(var4);
                  ++var1;
                  continue;
               }
            }

            ++var2;
         }

         return var1;
      }
   }

   public int fa() {
      int var1 = 0;
      int var2 = 0;

      while(true) {
         while(var2 < this.QE.size()) {
            ft var3 = (ft)this.QE.get(var2);
            if(var3.KK() == 1 && var3.dN() >= 1 && !var3.QE().dN((List)null)) {
               bm var4 = var3.QE();
               int var5 = var4.dN() + var4.ld();
               ft var6 = var3.QE(0);
               if(var6.dN(0).dN() == var5 && var6.fa() == 1 && var6.zs() == 0 && var6.EO() == 0) {
                  boolean var7 = true;
                  Iterator var8 = var6.dN.iterator();

                  bm var9;
                  while(var8.hasNext()) {
                     var9 = (bm)var8.next();
                     if(var9.QE()) {
                        var7 = false;
                        break;
                     }
                  }

                  if(var7) {
                     var8 = var6.dN.iterator();

                     while(var8.hasNext()) {
                        var9 = (bm)var8.next();
                        var3.dN.add(var9);
                     }

                     this.dN(var6);
                     ++var1;
                     continue;
                  }
               }
            }

            ++var2;
         }

         return var1;
      }
   }

   public void dN(ft var1) {
      if(var1.zs() != 0) {
         throw new RuntimeException();
      } else {
         ft var2;
         int var3;
         Iterator var4;
         ft var5;
         if(var1.KK() == 1) {
            var2 = (ft)var1.fa.get(0);
            if(var2 == var1) {
               throw new RuntimeException();
            }

            var3 = 0;

            while(var3 < var2.wU.size()) {
               if(var2.wU.get(var3) == var1) {
                  var2.wU.remove(var3);
               } else {
                  ++var3;
               }
            }

            var4 = var1.wU.iterator();

            while(var4.hasNext()) {
               var5 = (ft)var4.next();

               for(var3 = 0; var3 < var5.fa.size(); ++var3) {
                  if(var5.fa.get(var3) == var1) {
                     var5.fa.set(var3, var2);
                     var2.wU.add(var5);
                  }
               }
            }
         } else if(var1.fa() == 1) {
            var2 = (ft)var1.wU.get(0);
            if(var2 == var1) {
               throw new RuntimeException();
            }

            var3 = 0;

            while(var3 < var2.fa.size()) {
               if(var2.fa.get(var3) == var1) {
                  var2.fa.remove(var3);
               } else {
                  ++var3;
               }
            }

            var4 = var1.fa.iterator();

            while(var4.hasNext()) {
               var5 = (ft)var4.next();

               for(var3 = 0; var3 < var5.wU.size(); ++var3) {
                  if(var5.wU.get(var3) == var1) {
                     var5.wU.set(var3, var2);
                     var2.fa.add(var5);
                  }
               }
            }
         }

         Iterator var6 = var1.mS.iterator();

         while(var6.hasNext()) {
            ft var8 = (ft)var6.next();
            int var7 = 0;

            while(var7 < var8.zs.size()) {
               if(var8.zs.get(var7) == var1) {
                  var8.wU.remove(var7);
               } else {
                  ++var7;
               }
            }
         }

         this.QE.remove(var1);
      }
   }

   public int dN(ft var1, ft var2, ft var3) {
      int var4 = -1;

      for(int var5 = 0; var5 < var1.fa.size(); ++var5) {
         ft var6 = (ft)var1.fa.get(var5);
         if(var6 == var2) {
            if(var4 != -1) {
               throw new RuntimeException();
            }

            var4 = var5;
         } else if(var6 == var3) {
            return -1;
         }
      }

      if(var4 < 0) {
         return 0;
      } else {
         var1.fa.set(var4, var3);
         var2.wU.remove(var1);
         var3.wU.add(var1);
         return 1;
      }
   }

   public boolean dN(ft var1, ft var2) {
      int var3 = -1;

      for(int var4 = 0; var4 < var1.fa.size(); ++var4) {
         ft var5 = (ft)var1.fa.get(var4);
         if(var5 == var2) {
            if(var3 != -1) {
               throw new RuntimeException();
            }

            var3 = var4;
         }
      }

      if(var3 < 0) {
         return false;
      } else {
         var1.fa.remove(var3);
         var2.wU.remove(var1);
         return true;
      }
   }

   public void zs() {
      this.dN(false, (List)null);
   }

   public void dN(boolean var1) {
      this.dN(var1, (List)null);
   }

   private void dN(boolean var1, List var2) {
      if(!this.wU || var1) {
         this.EO();
         this.cb();
         this.PF();
         this.Hw();
         this.dN(var2);
         this.rK();
         this.wU = true;
      }
   }

   private void EO() {
      this.wU = false;
      this.dN = null;
      this.ld = null;
      this.fa = null;
      this.zs = null;
      this.mS = null;
      this.OK = null;
      this.LH = null;
      this.KK = null;
   }

   public HashMap mS() {
      return this.mS;
   }

   public HashMap OK() {
      return this.LH;
   }

   public HashMap LH() {
      return this.OK;
   }

   public HashMap KK() {
      return this.KK;
   }

   private void cb() {
      this.dN = new HashMap();
      this.ld = new HashMap();
      Iterator var1 = this.QE.iterator();

      while(var1.hasNext()) {
         ft var2 = (ft)var1.next();
         Iterator var3 = var2.dN.iterator();

         while(var3.hasNext()) {
            bm var4 = (bm)var3.next();
            ArrayList var5 = new ArrayList();
            ArrayList var6 = new ArrayList();
            var4.dN(var5, var6, (Object)null);
            this.dN.put(var4, var5);
            this.ld.put(var4, var6);
         }
      }

   }

   private void PF() {
      this.fa = new HashMap();
      ArrayDeque var1 = new ArrayDeque();

      Iterator var2;
      ft var3;
      ll var4;
      for(var2 = this.QE.iterator(); var2.hasNext(); this.fa.put(var3, var4)) {
         var3 = (ft)var2.next();
         var4 = new ll(this, var3, true, false);
         if(var3.cb() == 0) {
            var4.ld();
            var1.push(var4);
         }
      }

      ll var7;
      if(var1.isEmpty()) {
         var7 = (ll)this.fa.get(this.QE.get(0));
         var7.ld();
         var1.push(var7);
      }

      label62:
      while(!var1.isEmpty()) {
         while(!var1.isEmpty()) {
            var7 = (ll)var1.pop();
            var7.QE();
         }

         var2 = this.fa.values().iterator();

         while(true) {
            ll var8;
            HashMap var9;
            do {
               if(!var2.hasNext()) {
                  continue label62;
               }

               var8 = (ll)var2.next();
               var9 = new HashMap();
               Iterator var5 = var8.dN.rK().iterator();

               while(var5.hasNext()) {
                  ft var6 = (ft)var5.next();
                  var8.dN(var9, ((ll)this.fa.get(var6)).ld);
               }
            } while(var8.QE != null && var8.ld(var9, var8.QE));

            var8.QE = var9;
            var1.push(var8);
         }
      }

      var2 = this.QE.iterator();

      while(var2.hasNext()) {
         var3 = (ft)var2.next();
         var4 = (ll)this.fa.get(var3);
         if(var4.QE == null) {
            var4.ld();
         }
      }

   }

   private void Hw() {
      this.mS = new HashMap();
      this.LH = new HashMap();
      Iterator var1 = this.QE.iterator();

      while(var1.hasNext()) {
         ft var2 = (ft)var1.next();

         for(int var3 = 0; var3 < var2.dN(); ++var3) {
            bm var4 = var2.dN(var3);
            ArrayList var5 = new ArrayList((Collection)this.dN.get(var4));
            HashMap var6 = new HashMap();
            HashMap var7 = new HashMap();
            Iterator var8 = var5.iterator();

            while(var8.hasNext()) {
               int var9 = ((Integer)var8.next()).intValue();
               var6.put(Integer.valueOf(var9), new ArrayList());
               var7.put(Integer.valueOf(var9), new ArrayList());
            }

            for(int var16 = var3 + 1; var16 < var2.dN(); ++var16) {
               bm var18 = var2.dN(var16);
               Iterator var10 = ((List)this.ld.get(var18)).iterator();

               int var11;
               while(var10.hasNext()) {
                  var11 = ((Integer)var10.next()).intValue();
                  if(var5.contains(Integer.valueOf(var11))) {
                     ((List)var6.get(Integer.valueOf(var11))).add(Integer.valueOf(var16));
                     ((List)var7.get(Integer.valueOf(var11))).add(var18);
                  }
               }

               var10 = ((List)this.dN.get(var18)).iterator();

               while(var10.hasNext()) {
                  var11 = ((Integer)var10.next()).intValue();
                  if(var5.contains(Integer.valueOf(var11))) {
                     var5.remove(new Integer(var11));
                  }
               }
            }

            ll var17 = (ll)this.fa.get(var2);
            Iterator var19 = var17.QE.keySet().iterator();

            while(var19.hasNext()) {
               int var20 = ((Integer)var19.next()).intValue();
               if(var5.contains(Integer.valueOf(var20))) {
                  ((List)var6.get(Integer.valueOf(var20))).add(Integer.valueOf(-1));
                  ((List)var7.get(Integer.valueOf(var20))).addAll((Collection)var17.QE.get(Integer.valueOf(var20)));
               }
            }

            this.mS.put(var4, var6);
            this.LH.put(var4, var7);
         }
      }

      HashMap var12 = new HashMap();
      ll var13 = (ll)this.fa.get(this.QE.get(0));
      Iterator var14 = var13.ld.keySet().iterator();

      while(var14.hasNext()) {
         Integer var15 = (Integer)var14.next();
         var12.put(var15, new ArrayList());
         ((List)var12.get(var15)).addAll((Collection)var13.ld.get(var15));
      }

      this.LH.put((Object)null, var12);
   }

   private void dN(List var1) {
      this.zs = new HashMap();
      ArrayDeque var2 = new ArrayDeque();
      int var3 = 0;

      Iterator var4;
      ft var5;
      ll var6;
      Iterator var7;
      for(var4 = this.QE.iterator(); var4.hasNext(); this.zs.put(var5, var6)) {
         var5 = (ft)var4.next();
         var6 = new ll(this, var5, false, true);
         if(var3++ == 0) {
            var6.dN();
            var2.push(var6);
            if(var1 != null) {
               var7 = var1.iterator();

               while(var7.hasNext()) {
                  int var8 = ((Integer)var7.next()).intValue();
                  HashSet var9 = new HashSet();
                  var9.add((Object)null);
                  var6.ld.put(Integer.valueOf(var8), var9);
               }
            }
         }
      }

      label60:
      while(!var2.isEmpty()) {
         while(!var2.isEmpty()) {
            ll var10 = (ll)var2.pop();
            var10.wU();
         }

         var4 = this.zs.values().iterator();

         while(true) {
            ll var11;
            HashMap var12;
            do {
               if(!var4.hasNext()) {
                  continue label60;
               }

               var11 = (ll)var4.next();
               var12 = new HashMap();
               var7 = var11.dN.LH().iterator();

               while(var7.hasNext()) {
                  ft var13 = (ft)var7.next();
                  var11.dN(var12, ((ll)this.zs.get(var13)).QE);
               }
            } while(var11.ld != null && var11.ld(var12, var11.ld));

            var11.ld = var12;
            var2.push(var11);
         }
      }

      var4 = this.QE.iterator();

      while(var4.hasNext()) {
         var5 = (ft)var4.next();
         var6 = (ll)this.zs.get(var5);
         if(var6.ld == null) {
            var6.dN();
         }
      }

   }

   private void rK() {
      this.OK = new HashMap();
      this.KK = new HashMap();
      Iterator var1 = this.QE.iterator();

      while(var1.hasNext()) {
         ft var2 = (ft)var1.next();

         for(int var3 = 0; var3 < var2.dN.size(); ++var3) {
            bm var4 = (bm)var2.dN.get(var3);
            ArrayList var5 = new ArrayList((Collection)this.ld.get(var4));
            HashMap var6 = new HashMap();
            HashMap var7 = new HashMap();
            Iterator var8 = var5.iterator();

            while(var8.hasNext()) {
               int var9 = ((Integer)var8.next()).intValue();
               var6.put(Integer.valueOf(var9), new ArrayList());
               var7.put(Integer.valueOf(var9), new ArrayList());
            }

            label51:
            for(int var12 = var3 - 1; var12 >= 0; --var12) {
               bm var14 = (bm)var2.dN.get(var12);
               Iterator var10 = ((List)this.dN.get(var14)).iterator();

               while(var10.hasNext()) {
                  int var11 = ((Integer)var10.next()).intValue();
                  if(var5.contains(Integer.valueOf(var11))) {
                     ((List)var6.get(Integer.valueOf(var11))).add(Integer.valueOf(var12));
                     ((List)var7.get(Integer.valueOf(var11))).add(var14);
                     var5.remove(new Integer(var11));
                     if(var5.isEmpty()) {
                        break label51;
                     }
                  }
               }
            }

            ll var13 = (ll)this.zs.get(var2);
            Iterator var15 = var13.ld.keySet().iterator();

            while(var15.hasNext()) {
               int var16 = ((Integer)var15.next()).intValue();
               if(var5.contains(Integer.valueOf(var16))) {
                  ((List)var6.get(Integer.valueOf(var16))).add(Integer.valueOf(-1));
                  ((List)var7.get(Integer.valueOf(var16))).addAll((Collection)var13.ld.get(Integer.valueOf(var16)));
               }
            }

            this.OK.put(var4, var6);
            this.KK.put(var4, var7);
         }
      }

   }
}
