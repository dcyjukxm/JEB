package jebglobal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.Cs;
import jebglobal.GS;
import jebglobal.Qz;
import jebglobal.ai;
import jebglobal.fG;
import jebglobal.ft;
import jebglobal.hV;
import jebglobal.ie;
import jebglobal.iz;
import jebglobal.kn;
import jebglobal.lB;
import jebglobal.oh;
import jebglobal.os;
import jebglobal.rK;
import jebglobal.rP;
import jebglobal.tu;
import jebglobal.xS;
import jebglobal.xy;
import jebglobal.yX;

public class kW {
   private static final long LK = 844563159190538443L;
   private oh dN;
   private boolean ld;
   private HashMap QE;
   private HashMap wU;
   private HashMap fa;
   private HashMap zs;
   private static boolean mS = dN(ai.class);

   private static void QE() {
      if(Thread.interrupted()) {
         throw new RuntimeException("Optimizer interrupted");
      }
   }

   public kW(oh var1) {
      this.dN = var1;
      this.ld = true;
      this.ld(false);
      if(!mS) {
         rK.dN = 0;
      }

   }

   private void ld(boolean var1) {
      this.dN.dN(var1);
      this.QE = this.dN.mS();
      this.wU = this.dN.LH();
      this.fa = this.dN.OK();
      this.zs = this.dN.KK();
   }

   public void dN() {
      int var1;
      do {
         QE();
         this.wU();
         QE();

         do {
            this.zs();
            QE();
            var1 = this.fa();
            this.ld(true);
            QE();
         } while(var1 > 0);

         this.mS();
         QE();
         var1 = this.OK();
         this.ld(true);
         QE();
      } while(var1 > 0);

   }

   public void dN(boolean var1) {
      this.ld = var1;
   }

   private void wU() {
      Iterator var1 = this.dN.ld().iterator();

      label56:
      while(var1.hasNext()) {
         ft var2 = (ft)var1.next();

         while(true) {
            QE();
            int var3 = 0;
            int var4 = 0;

            while(true) {
               while(var4 < var2.dN()) {
                  xS var5 = (xS)var2.dN(var4);
                  if(var5.wU() == Qz.dN && var5.fa() instanceof xy) {
                     boolean var6 = var5.zs() instanceof yX;
                     boolean var7 = true;
                     HashMap var8 = (HashMap)this.QE.get(var5);
                     Iterator var9 = var8.keySet().iterator();

                     while(var9.hasNext()) {
                        int var10 = ((Integer)var9.next()).intValue();
                        List var11 = (List)var8.get(Integer.valueOf(var10));
                        if(!var11.isEmpty()) {
                           var7 = false;
                           break;
                        }
                     }

                     if(!var7) {
                        ++var4;
                     } else {
                        if(!var6) {
                           if(!this.dN(var2, var4)) {
                              ++var4;
                           }
                        } else {
                           var5.OK();
                           var8.clear();
                           ++var4;
                        }

                        ++var3;
                     }
                  } else {
                     ++var4;
                  }
               }

               if(var3 <= 0) {
                  continue label56;
               }
               break;
            }
         }
      }

   }

   private int fa() {
      int var1 = 0;
      Iterator var2 = this.dN.ld().iterator();

      label98:
      while(var2.hasNext()) {
         ft var3 = (ft)var2.next();

         label96:
         while(true) {
            QE();
            int var4 = 0;
            int var5 = 0;

            while(true) {
               while(true) {
                  while(true) {
                     while(var5 < var3.dN()) {
                        xS var6 = (xS)var3.dN(var5);
                        GS var7 = var6.fa();
                        GS var8 = var6.zs();
                        if(var6.wU() == Qz.dN && var7 instanceof xy && var8 instanceof os) {
                           os var9 = (os)var8;
                           tu var10 = var9.zs();
                           if(var10 instanceof ie && var9.mS().isEmpty()) {
                              xy var11 = (xy)var7;
                              int var12 = (int)((ie)var10).zs();
                              if(var12 == 0) {
                                 ++var5;
                              } else {
                                 ArrayList var13 = new ArrayList();
                                 int var14 = 0;
                                 boolean var15 = true;
                                 int var16 = var5 + 1;

                                 while(var16 < var5 + 1 + var12) {
                                    if(var16 >= var3.dN()) {
                                       var15 = false;
                                       break;
                                    }

                                    xS var17 = (xS)var3.dN(var16);
                                    if(var17.wU() == Qz.dN && var17.fa() instanceof fG) {
                                       fG var18 = (fG)var17.fa();
                                       tu var19 = var18.zs();
                                       if(var19 instanceof xy && ((xy)var19).QE(var11)) {
                                          tu var20 = var18.mS();
                                          if(!(var20 instanceof ie)) {
                                             var15 = false;
                                             break;
                                          }

                                          int var21 = (int)((ie)var20).zs();
                                          if(var21 != var14) {
                                             var15 = false;
                                             break;
                                          }

                                          var13.add((tu)var17.zs());
                                          ++var14;
                                          ++var16;
                                          continue;
                                       }

                                       var15 = false;
                                       break;
                                    }

                                    var15 = false;
                                    break;
                                 }

                                 if(!var15) {
                                    ++var5;
                                 } else {
                                    var9.dN((List)var13);

                                    while(var12-- > 0) {
                                       this.dN(var3, var5 + 1);
                                    }

                                    ++var5;
                                    ++var4;
                                 }
                              }
                           } else {
                              ++var5;
                           }
                        } else {
                           ++var5;
                        }
                     }

                     var1 += var4;
                     if(var4 <= 0) {
                        continue label98;
                     }
                     continue label96;
                  }
               }
            }
         }
      }

      return var1;
   }

   private void zs() {
      Iterator var1 = this.dN.ld().iterator();

      while(var1.hasNext()) {
         ft var2 = (ft)var1.next();

         while(true) {
            QE();
            int var3 = 0;
            int var4 = 0;

            label214:
            while(true) {
               while(true) {
                  while(true) {
                     if(var4 >= var2.dN()) {
                        break label214;
                     }

                     xS var5 = (xS)var2.dN(var4);
                     GS var6 = var5.fa();
                     GS var7 = var5.zs();
                     if(var5.wU() == Qz.dN && var6 instanceof xy && var7 instanceof tu) {
                        xy var8 = (xy)var6;
                        tu var9 = (tu)var7;
                        boolean var10 = var5.Hw();
                        boolean var11 = var5.PF();
                        HashMap var12 = (HashMap)this.QE.get(var5);
                        boolean var13 = true;
                        HashSet var14 = new HashSet();
                        Iterator var15 = var12.keySet().iterator();

                        while(var15.hasNext()) {
                           int var16 = ((Integer)var15.next()).intValue();
                           var14.addAll((Collection)var12.get(Integer.valueOf(var16)));
                           if(var14.contains(Integer.valueOf(-1))) {
                              var13 = false;
                              break;
                           }
                        }

                        if(!var13) {
                           ++var4;
                        } else {
                           if(var14.isEmpty()) {
                              break label214;
                           }

                           int var28 = ((Integer)Collections.max(var14)).intValue();
                           HashSet var29 = var9.fa();
                           int var17;
                           int var20;
                           if(!var29.isEmpty()) {
                              label206:
                              for(var17 = var4 + 1; var17 < var28; ++var17) {
                                 xS var18 = (xS)var2.dN(var17);
                                 Iterator var19 = var29.iterator();

                                 while(var19.hasNext()) {
                                    var20 = ((Integer)var19.next()).intValue();
                                    if(((HashMap)this.QE.get(var18)).containsKey(Integer.valueOf(var20))) {
                                       var13 = false;
                                       break label206;
                                    }
                                 }
                              }

                              if(!var13) {
                                 ++var4;
                                 continue;
                              }
                           }

                           var17 = 0;

                           int var32;
                           xS var34;
                           for(Iterator var30 = var14.iterator(); var30.hasNext(); var17 += var34.dN(var8)) {
                              var32 = ((Integer)var30.next()).intValue();
                              var34 = (xS)var2.dN(var32);
                           }

                           if(var17 == 0) {
                              var13 = false;
                           }

                           if((var11 || var9 instanceof lB) && var17 >= 2) {
                              var13 = false;
                           }

                           int var31;
                           if(var11 && var13) {
                              var31 = this.ld?var28 - 1:var28;

                              for(var32 = var4 + 1; var32 <= var31; ++var32) {
                                 var34 = (xS)var2.dN(var32);
                                 if(var34.PF()) {
                                    var13 = false;
                                    break;
                                 }
                              }
                           }

                           if(var10 && var13) {
                              for(var31 = var4 + 1; var31 < var28; ++var31) {
                                 xS var35 = (xS)var2.dN(var31);
                                 if(var35.Hw()) {
                                    var13 = false;
                                    break;
                                 }
                              }
                           }

                           if(!var13) {
                              ++var4;
                           } else {
                              boolean var33 = var5.QE();
                              HashSet var36 = var8.fa();
                              var20 = 0;
                              Iterator var21 = var14.iterator();

                              while(true) {
                                 int var22;
                                 while(var21.hasNext()) {
                                    var22 = ((Integer)var21.next()).intValue();
                                    xS var23 = (xS)var2.dN(var22);
                                    if(var23.dN(var8, var9) <= 0) {
                                       ++var20;
                                    } else {
                                       if(var33 && !var23.QE()) {
                                          var23.dN(true);
                                       }

                                       HashMap var24 = (HashMap)this.wU.get(var23);
                                       Iterator var25 = var36.iterator();

                                       int var26;
                                       while(var25.hasNext()) {
                                          var26 = ((Integer)var25.next()).intValue();
                                          var24.remove(new Integer(var26));
                                       }

                                       var25 = var29.iterator();

                                       while(var25.hasNext()) {
                                          var26 = ((Integer)var25.next()).intValue();
                                          if(!var24.containsKey(Integer.valueOf(var26))) {
                                             var24.put(Integer.valueOf(var26), new ArrayList());
                                          }

                                          this.dN((List)var24.get(Integer.valueOf(var26)), (List)((HashMap)this.wU.get(var5)).get(Integer.valueOf(var26)));
                                          if(((List)var24.get(Integer.valueOf(var26))).size() == 1) {
                                             int var27 = ((Integer)((List)var24.get(Integer.valueOf(var26))).get(0)).intValue();
                                             if(var27 != -1) {
                                                this.dN((List)((HashMap)this.QE.get(var2.dN(var27))).get(Integer.valueOf(var26)), var22);
                                             }
                                          }
                                       }
                                    }
                                 }

                                 if(var20 >= 1 && var20 == var14.size()) {
                                    ++var4;
                                    break;
                                 }

                                 var21 = var36.iterator();

                                 while(var21.hasNext()) {
                                    var22 = ((Integer)var21.next()).intValue();
                                    ((List)var12.get(new Integer(var22))).clear();
                                 }

                                 if(!this.dN(var2, var4)) {
                                    ++var4;
                                 }

                                 ++var3;
                                 if(var3 % 50 == 0) {
                                    QE();
                                 }
                                 break;
                              }
                           }
                        }
                     } else {
                        ++var4;
                     }
                  }
               }
            }

            if(var3 <= 0) {
               break;
            }
         }
      }

   }

   private void mS() {
      Iterator var1 = this.dN.ld().iterator();

      while(var1.hasNext()) {
         ft var2 = (ft)var1.next();

         for(int var3 = 0; var3 < var2.dN(); ++var3) {
            xS var4 = (xS)var2.dN(var3);

            int var5;
            do {
               var5 = 0;

               tu var7;
               for(Iterator var6 = var4.rK().iterator(); var6.hasNext(); var5 += this.dN((Object)var4, (tu)var7)) {
                  var7 = (tu)var6.next();
               }
            } while(var5 > 0);
         }
      }

   }

   private long dN(long var1, hV var3) {
      if(var3 == hV.ld) {
         var1 &= 1L;
      } else if(var3 == hV.QE) {
         var1 &= 255L;
      } else if(var3 != hV.wU && var3 != hV.fa) {
         if(var3 != hV.zs && var3 != hV.OK) {
            if(var3 != hV.mS && var3 != hV.LH) {
               throw new IllegalArgumentException();
            }
         } else {
            var1 &= -1L;
         }
      } else {
         var1 &= 65535L;
      }

      return var1;
   }

   private int dN(Object var1, tu var2) {
      Object var3 = null;

      try {
         if(var2 instanceof lB && ((lB)var2).dN().Hw()) {
            lB var4 = (lB)var2;
            ie var5;
            ie var6;
            long var7;
            long var9;
            if(var4.zs() instanceof ie && var4.OK() instanceof ie && var4.mS().wU()) {
               var5 = (ie)((ie)var4.zs());
               var6 = (ie)((ie)var4.OK());
               var7 = this.dN(var5.zs(), var5.dN());
               var9 = this.dN(var6.zs(), var6.dN());
               long var11 = 0L;
               boolean var13 = true;
               if(var4.mS() == kn.dN) {
                  var11 = var7 + var9;
               } else if(var4.mS() == kn.ld) {
                  var11 = var7 - var9;
               } else if(var4.mS() == kn.QE) {
                  var11 = var7 * var9;
               } else if(var4.mS() == kn.wU && var9 != 0L) {
                  var11 = var7 / var9;
               } else if(var4.mS() == kn.fa) {
                  var11 = var7 % var9;
               } else if(var4.mS() == kn.zs) {
                  var11 = var7 & var9;
               } else if(var4.mS() == kn.mS) {
                  var11 = var7 | var9;
               } else if(var4.mS() == kn.OK) {
                  var11 = var7 ^ var9;
               } else {
                  var13 = false;
               }

               if(var13) {
                  var3 = new ie(this.dN(var11, var4.dN()), var4.dN());
               }
            }

            if(var3 == null) {
               var5 = null;
               if(var4.zs() instanceof ie) {
                  var5 = (ie)var4.zs();
               }

               var6 = null;
               if(var4.OK() instanceof ie) {
                  var6 = (ie)var4.OK();
               }

               if(var5 != null || var6 != null) {
                  var7 = -1L;
                  if(var5 != null) {
                     var7 = this.dN(var5.zs(), var5.dN());
                  }

                  var9 = -1L;
                  if(var6 != null) {
                     var9 = this.dN(var6.zs(), var6.dN());
                  }

                  kn var21 = var4.mS();
                  if(var21 == kn.dN) {
                     if(var7 == 0L) {
                        var3 = var4.OK();
                     } else if(var9 == 0L) {
                        var3 = var4.zs();
                     }
                  } else if(var21 == kn.ld) {
                     if(var7 == 0L) {
                        var3 = new lB((tu)null, kn.cb, var4.OK());
                     } else if(var9 == 0L) {
                        var3 = var4.zs();
                     }
                  } else if(var21 == kn.QE) {
                     if(var7 == 1L) {
                        var3 = var4.OK();
                     } else if(var9 == 1L) {
                        var3 = var4.zs();
                     } else if(var7 == 0L) {
                        var3 = var4.zs();
                     } else if(var9 == 0L) {
                        var3 = var4.OK();
                     }
                  } else if(var21 == kn.wU) {
                     if(var9 == 1L) {
                        var3 = var4.zs();
                     }
                  } else if(var21 == kn.fa && var9 == 1L) {
                     var3 = new ie(0L, var4.dN());
                  }
               }
            }

            if(var3 == null && var4.mS() == kn.dN) {
               var5 = null;
               lB var17 = null;
               if(var4.zs() instanceof ie && var4.OK() instanceof lB) {
                  var5 = (ie)var4.zs();
                  var17 = (lB)var4.OK();
               } else if(var4.zs() instanceof lB && var4.OK() instanceof ie) {
                  var17 = (lB)var4.zs();
                  var5 = (ie)var4.OK();
               }

               if(var5 != null && var17 != null && var17.mS() == kn.dN) {
                  ie var20 = null;
                  if(var17.OK() instanceof ie) {
                     var20 = (ie)var17.OK();
                  } else if(var17.zs() instanceof ie) {
                     var20 = (ie)var17.zs();
                  }

                  if(var20 != null) {
                     long var8 = this.dN(var5.zs() + var20.zs(), var4.dN());
                     var17.dN((tu)var20, (tu)(new ie(var8, var4.dN())));
                     var3 = var17;
                  }
               }
            }
         }
      } catch (Exception var14) {
         var3 = null;
      }

      if(var3 != null) {
         boolean var15;
         if(var1 instanceof tu) {
            var15 = ((tu)var1).dN((tu)var2, (tu)var3);
         } else {
            var15 = ((xS)var1).dN((tu)var2, (tu)var3);
         }

         if(var15) {
            return 1;
         }
      }

      int var16 = 0;

      tu var19;
      for(Iterator var18 = var2.wU().iterator(); var18.hasNext(); var16 += this.dN((Object)var2, (tu)var19)) {
         var19 = (tu)var18.next();
      }

      return var16;
   }

   private void dN(List var1, List var2) {
      HashSet var3 = new HashSet(var1);
      var3.addAll(var2);
      boolean var4 = var3.contains(Integer.valueOf(-1));
      var3.remove(Integer.valueOf(-1));
      var1.clear();
      var1.addAll(var3);
      Collections.sort(var1);
      if(var4) {
         var1.add(Integer.valueOf(-1));
      }

   }

   private void dN(List var1, int var2) {
      ArrayList var3 = new ArrayList();
      var3.add(Integer.valueOf(var2));
      this.dN((List)var1, (List)var3);
   }

   private boolean dN(ft var1, int var2) {
      xS var3 = (xS)var1.dN(var2);
      if(var3 == null) {
         throw new RuntimeException();
      } else {
         HashMap var4 = (HashMap)this.wU.get(var3);
         Iterator var5 = var4.keySet().iterator();

         int var9;
         while(var5.hasNext()) {
            int var6 = ((Integer)var5.next()).intValue();
            List var7 = (List)var4.get(Integer.valueOf(var6));
            Iterator var8 = var7.iterator();

            while(var8.hasNext()) {
               var9 = ((Integer)var8.next()).intValue();
               if(var9 >= 0) {
                  xS var10 = (xS)var1.dN(var9);
                  ((List)((HashMap)this.QE.get(var10)).get(Integer.valueOf(var6))).remove(new Integer(var2));
               }
            }
         }

         int var11;
         xS var12;
         if(var1.dN() >= 2) {
            var11 = var3.ld();
            if(var2 == 0) {
               var12 = (xS)var1.dN(1);
               var12.dN(var3.dN());
            } else {
               var12 = (xS)var1.dN(var2 - 1);
            }

            var12.wU(var11);
         }

         var1.ld(var2);
         var5 = var1.wU().iterator();

         while(var5.hasNext()) {
            var12 = (xS)var5.next();
            Iterator var13 = ((HashMap)this.wU.get(var12)).values().iterator();

            List var14;
            int var15;
            while(var13.hasNext()) {
               var14 = (List)var13.next();

               for(var9 = 0; var9 < var14.size(); ++var9) {
                  var15 = ((Integer)var14.get(var9)).intValue();
                  if(var15 >= var2) {
                     if(var15 == var2) {
                        throw new RuntimeException();
                     }

                     var14.set(var9, Integer.valueOf(var15 - 1));
                  }
               }
            }

            var13 = ((HashMap)this.QE.get(var12)).values().iterator();

            while(var13.hasNext()) {
               var14 = (List)var13.next();

               for(var9 = 0; var9 < var14.size(); ++var9) {
                  var15 = ((Integer)var14.get(var9)).intValue();
                  if(var15 >= var2) {
                     if(var15 == var2) {
                        throw new RuntimeException();
                     }

                     var14.set(var9, Integer.valueOf(var15 - 1));
                  }
               }
            }
         }

         if(!var1.ld()) {
            return true;
         } else if(var1.KK() != 1) {
            throw new RuntimeException();
         } else {
            var11 = ((xS)var1.QE(0).dN(0)).dN();
            var12 = new xS(Qz.QE, new Cs(var11), (GS)null);
            var12.dN(var3.dN());
            var12.QE(var3.ld());
            var1.dN(var12);
            this.QE.put(var12, new HashMap());
            this.wU.put(var12, new HashMap());
            this.fa.put(var12, new HashMap());
            this.zs.put(var12, new HashMap());
            return false;
         }
      }
   }

   private int OK() {
      int var1 = 0;

      int var2;
      label151:
      do {
         QE();
         var2 = 0;
         Iterator var3 = this.dN.ld().iterator();

         while(true) {
            ft var4;
            xS var5;
            do {
               do {
                  do {
                     do {
                        do {
                           do {
                              if(!var3.hasNext()) {
                                 var3 = this.dN.ld().iterator();

                                 while(var3.hasNext()) {
                                    var4 = (ft)var3.next();
                                    if(var4.dN() >= 2 && ((xS)var4.QE()).wU() == Qz.QE) {
                                       var5 = (xS)var4.QE();
                                       if(var5.cb() == var5.dN() + var5.ld()) {
                                          this.dN(var4, var4.dN() - 1);
                                          ++var2;
                                       }
                                    }
                                 }

                                 int var14 = this.dN.wU();
                                 var2 += var14;
                                 var1 += var2;
                                 continue label151;
                              }

                              var4 = (ft)var3.next();
                           } while(var4.dN() != 1);
                        } while(var4.KK() != 1);
                     } while(var4.EO() != 0);
                  } while(var4.zs() != 0);
               } while(((xS)var4.dN(0)).wU() != Qz.QE);
            } while(var4.Ux());

            var5 = (xS)var4.dN(0);
            int var6 = var5.cb();
            if(var6 < 0) {
               throw new RuntimeException();
            }

            boolean var7 = false;
            Iterator var8 = var4.OK().iterator();

            while(var8.hasNext()) {
               ft var9 = (ft)var8.next();
               xS var10 = (xS)var9.QE();
               int var15;
               if(var10.wU() == Qz.QE) {
                  var10.fa(var5.cb());
                  var15 = this.dN.dN(var9, var4, var4.QE(0));
                  if(var15 != 1) {
                     throw new RuntimeException();
                  }

                  var7 = this.dN(var4);
                  ++var2;
               } else if(var10.wU() == Qz.wU) {
                  if(var9.QE(0) == var4 && var4.QE(0) == var9.QE(1)) {
                     var10.LH();
                     this.dN.dN(var9, var4);
                     var7 = this.dN(var4);
                     ++var2;
                  } else if(var9.QE(1) == var4) {
                     var15 = this.dN.dN(var9, var4, var4.QE(0));
                     if(var15 == 1) {
                        var10.fa(var5.cb());
                        var7 = this.dN(var4);
                     } else {
                        if(var15 != -1) {
                           throw new RuntimeException();
                        }

                        var10.LH();
                        var10.fa(var5.cb());
                        this.dN.dN(var9, var4);
                        var7 = this.dN(var4);
                     }

                     ++var2;
                  }
               } else if(var10.wU() == Qz.fa) {
                  iz var11 = var10.EO();
                  if(var9.QE(0) == var4) {
                     if(var11.dN(var5.cb()) >= 1) {
                        this.dN.dN(var9, var4.QE(0));
                        ++var2;
                     }
                  } else {
                     for(int var12 = 1; var12 < var9.KK(); ++var12) {
                        if(var9.QE(var12) == var4) {
                           int var13 = this.dN.dN(var9, var4, var4.QE(0));
                           if(var13 == 1) {
                              var11.dN(var5.dN(), var5.cb());
                              var7 = this.dN(var4);
                           } else {
                              if(var13 != -1) {
                                 throw new RuntimeException();
                              }

                              if(var9.QE(0) == var4.QE(0)) {
                                 var11.dN(var5.cb());
                              } else {
                                 var11.dN(var5.dN(), var5.cb());
                              }

                              this.dN.dN(var9, var4);
                              var7 = this.dN(var4);
                           }

                           ++var2;
                           break;
                        }
                     }
                  }

                  if(var11.dN() == 1) {
                     if(var9.KK() != 2) {
                        throw new RuntimeException();
                     }

                     var10.KK();
                  }
               }

               if(var7) {
                  break;
               }
            }
         }
      } while(var2 > 0);

      return var1;
   }

   private boolean dN(ft var1) {
      if(var1.dN() == 1 && ((xS)var1.dN(0)).wU() == Qz.QE) {
         if(var1.mS() != 0) {
            return false;
         } else {
            ft var2 = null;
            int var3 = ((xS)var1.dN(0)).dN();
            Iterator var4 = this.dN.ld().iterator();

            while(var4.hasNext()) {
               ft var5 = (ft)var4.next();
               if(var5 != var1 && var5.dN() >= 1 && ((xS)var5.QE()).dN() + ((xS)var5.QE()).ld() == var3) {
                  var2 = var5;
                  break;
               }
            }

            if(var2 == null) {
               return false;
            } else {
               this.dN.dN(var1);
               ((xS)var2.QE()).wU(((xS)var1.dN(0)).ld());
               return true;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   public boolean ld() {
      int var1 = 0;
      Iterator var2 = this.dN.ld().iterator();

      label72:
      while(var2.hasNext()) {
         ft var3 = (ft)var2.next();
         int var4 = 0;

         while(true) {
            while(true) {
               while(true) {
                  while(true) {
                     if(var4 >= var3.dN()) {
                        continue label72;
                     }

                     xS var5 = (xS)var3.dN(var4);
                     GS var6 = var5.fa();
                     GS var7 = var5.zs();
                     if(var5.wU() == Qz.dN && var6 instanceof xy && var7 instanceof ie) {
                        xy var8 = (xy)var6;
                        ie var9 = (ie)var7;
                        if(var8.dN() == hV.KK && var9.dN() == hV.KK) {
                           long var10 = var9.zs();
                           if(var10 != 0L && var10 != 1L) {
                              ++var4;
                           } else {
                              HashMap var12 = (HashMap)this.fa.get(var5);
                              if(var12.size() != 1) {
                                 ++var4;
                              } else {
                                 int var13 = ((Integer)var12.keySet().iterator().next()).intValue();
                                 List var14 = (List)var12.get(Integer.valueOf(var13));
                                 Iterator var15 = var14.iterator();

                                 while(var15.hasNext()) {
                                    xS var16 = (xS)var15.next();
                                    HashMap var17 = (HashMap)this.zs.get(var16);
                                    List var18 = (List)var17.get(Integer.valueOf(var13));
                                    if(var18 != null && var18.size() == 1 && var18.get(0) == var5) {
                                       var16.dN(var8, var10);
                                       ((HashMap)this.zs.get(var16)).remove(Integer.valueOf(var13));
                                    }
                                 }

                                 ((List)var12.get(new Integer(var13))).clear();
                                 ++var1;
                                 ++var4;
                              }
                           }
                        } else {
                           ++var4;
                        }
                     } else {
                        ++var4;
                     }
                  }
               }
            }
         }
      }

      return var1 != 0;
   }

   public static boolean dN(Class var0) {
      boolean var1 = false;

      try {
         Object var2 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 107, 15, 72, 83, 66}, 2, 89)).getMethod(rP.dN(new byte[]{36, 10, 4, 41, 0, 6, 19, 13, 23, 84, 65, 12, 71, 100, 94, 84, 88, 90, 66}, 2, 248), new Class[0]).invoke(var0, new Object[0]);
         Object var3 = Class.forName(rP.dN(new byte[]{86, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 126, 34, 29, 27, 17, 6, 23, 29, 6, 1, 42, 43, 2, 12, 8, 7}, 1, 60)).getMethod(rP.dN(new byte[]{36, 10, 4, 58, 29, 13, 2, 59, 27, 85, 90, 0, 76}, 2, 184), new Class[0]).invoke(var2, new Object[0]);
         Object var4 = Class.forName(rP.dN(new byte[]{117, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 109, 44, 11, 1, 54, 60, 26, 7, 17, 6}, 1, 31)).getMethod(rP.dN(new byte[]{36, 10, 4, 53, 29, 10, 6, 28, 29, 79, 70}, 2, 155), new Class[0]).invoke(var3, new Object[0]);
         Object var5 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 47}, 2, 164)).getMethod(rP.dN(new byte[]{92, 27, 58, 7, 27}, 1, 40), new Class[0]).invoke(var4, new Object[0]);
         Object var6 = Class.forName(rP.dN(new byte[]{-38, 11, 23, 23, 79, 71, 6, 65, 104, 47, 5, 9}, 1, 176)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 7, 2, 28, 90, 117, 122, 42}, 2, 68))}).newInstance(new Object[]{var5});
         var1 = dN(var6, var0);
      } catch (Exception var7) {
         ;
      }

      return var1;
   }

   private static boolean dN(Object var0, Class var1) {
      boolean var2 = false;

      try {
         Object var3 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 165)).getConstructor(new Class[]{Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 0, 8, 70, 50, 73, 68, 6}, 2, 198)), Boolean.TYPE}).newInstance(new Object[]{var0, Boolean.valueOf(true)});
         byte[] var4 = new byte[4096];
         String var5 = var1.getName().replace('.', '/') + ".class";
         Object var6 = Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 117, 69, 76, 87}, 2, 140)).getMethod(rP.dN(new byte[]{36, 10, 4, 60, 28, 29, 21, 17}, 2, 84), new Class[]{String.class}).invoke(var3, new Object[]{var5});
         Object var7 = Class.forName(rP.dN(new byte[]{52, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 94)).getMethod(rP.dN(new byte[]{36, 10, 4, 48, 28, 25, 18, 28, 39, 84, 90, 6, 72, 77}, 2, 75), new Class[]{Class.forName(rP.dN(new byte[]{53, 11, 23, 23, 79, 91, 1, 29, 5, 66, 84, 19, 25, 94, 116, 51, 25, 53, 43, 26, 6, 11}, 1, 95))}).invoke(var3, new Object[]{var6});
         Method var8 = Class.forName(rP.dN(new byte[]{-76, 11, 23, 23, 79, 71, 6, 65, 103, 39, 30, 5, 1, 39, 39, 6, 23, 4, 12}, 1, 222)).getMethod(rP.dN(new byte[]{49, 10, 17, 29}, 2, 107), new Class[]{byte[].class, Integer.TYPE, Integer.TYPE});

         while(true) {
            if(((Integer)var8.invoke(var7, new Object[]{var4, Integer.valueOf(0), Integer.valueOf(var4.length)})).intValue() == -1) {
               Object[] var9 = (Object[])((Object[])Class.forName(rP.dN(new byte[]{41, 14, 6, 24, 92, 28, 19, 1, 24, 14, 66, 2, 91, 14, 123, 88, 75, 118, 66, 84, 64, 73}, 2, 184)).getMethod(rP.dN(new byte[]{36, 10, 4, 58, 23, 27, 19, 1, 18, 73, 75, 2, 93, 69, 66}, 2, 127), new Class[0]).invoke(var6, new Object[0]));
               Object var10 = Class.forName(rP.dN(new byte[]{115, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 77, 6, 23, 6, 90, 109, 38, 23, 6, 29, 15, 15, 10, 2, 21, 17}, 1, 25)).getMethod(rP.dN(new byte[]{-57, 2, 17, 36, 37, 23, 14, 5, 10, 40, 46, 28}, 1, 160), new Class[0]).invoke(var9[0], new Object[0]);
               Object var11 = Class.forName(rP.dN(new byte[]{6, 11, 23, 23, 79, 93, 22, 6, 22, 7, 27, 29, 13, 87, 71, 7, 26, 17, 23, 20, 7, 2, 6, 22, 93, 124, 1, 18, 17, 37, 23, 14, 5, 10, 40, 46, 28}, 1, 108)).getMethod(rP.dN(new byte[]{36, 10, 4, 52, 29, 13, 18, 4, 1, 83}, 2, 3), new Class[0]).invoke(var10, new Object[0]);
               var2 = var11.toString().substring(10).substring(15, 30).equals(rP.dN(new byte[]{122, 94, 66, 76, 69, 91, 87, 91, 67, 23, 31, 81, 30, 22, 9}, 2, 252));
               Class.forName(rP.dN(new byte[]{56, 11, 23, 23, 79, 91, 1, 29, 5, 66, 68, 11, 19, 92, 100, 43, 19, 52, 47, 5, 9}, 1, 82)).getMethod(rP.dN(new byte[]{18, 15, 3, 28, 22}, 1, 113), new Class[0]).invoke(var3, new Object[0]);
               break;
            }
         }
      } catch (Exception var12) {
         ;
      }

      return var2;
   }
}
