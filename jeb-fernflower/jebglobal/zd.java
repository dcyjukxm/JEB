package jebglobal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jebglobal.AR;
import jebglobal.Dw;
import jebglobal.Fu;
import jebglobal.GH;
import jebglobal.IK;
import jebglobal.OX;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZL;
import jebglobal.cI;
import jebglobal.hV;
import jebglobal.hY;
import jebglobal.js;
import jebglobal.kg;
import jebglobal.lM;
import jebglobal.nh;
import jebglobal.oc;
import jebglobal.xd;
import jebglobal.yK;

public final class zd extends cI {
   private int dN;
   private boolean ld;
   private boolean QE;
   private String wU;
   private yK fa;
   private hV zs;
   private hV mS;
   private List OK;
   private List LH;
   private String KK;
   private HashMap EO;
   private List cb;
   private List PF;
   private List Hw;

   private zd(int var1, AR var2, hV.uK var3, OX.vd var4, GH var5, String var6, yK var7, hV var8, hV var9, List var10) {
      this.dN = var1;
      this.ld = var7 == null;
      this.QE = var7 != null && var7.dN();
      this.wU = var6;
      this.fa = var7;
      if(var7 != null) {
         var7.LH();
      }

      this.zs = var8;
      this.mS = var9;
      this.OK = var10;
      this.KK = hV.wU(var6);
      this.EO = new HashMap();
      this.cb = new ArrayList();
      this.PF = new ArrayList();
      this.Hw = new ArrayList();
      if(!this.ld) {
         if(var5 != null) {
            this.LH = new ArrayList();
            xd var11 = var7.Hv();
            if(var11 != null) {
               xd.vd var12 = var11.dN();
               if(var12 != null) {
                  xd.uK[] var13 = var12.ld();
                  int var14 = var13.length;

                  for(int var15 = 0; var15 < var14; ++var15) {
                     xd.uK var16 = var13[var15];
                     if(var16.dN() != 2) {
                        int var17 = var16.ld().dN();
                        hV var18 = var3.dN(var2.dN(var17, false));
                        lM var19 = new lM(var18);
                        kg.uK[] var20 = var16.ld().ld();
                        int var21 = var20.length;

                        for(int var22 = 0; var22 < var21; ++var22) {
                           kg.uK var23 = var20[var22];
                           OX var24 = var4.dN(var2.dN(var23.dN()));
                           Xf var25 = var5.dN(var23.ld());
                           var19.dN(var24, var25);
                        }

                        this.LH.add(var19);
                     }
                  }
               }
            }
         }

      }
   }

   public String ld() {
      return this.wU;
   }

   public boolean QE() {
      return this.fa != null && (this.fa.LH() & 512) != 0;
   }

   public hV fa() {
      return this.zs;
   }

   public boolean dN(String var1, String var2) {
      if(!hV.dN(var2)) {
         throw new RuntimeException();
      } else {
         String var3 = (String)this.EO.get(var1);
         if(var3 != null && !var3.equals(var2)) {
            return false;
         } else {
            if(var3 == null) {
               this.EO.put(var1, var2);
            }

            return true;
         }
      }
   }

   public String dN(String var1) {
      return (String)this.EO.get(var1);
   }

   public List zs() {
      return this.Hw;
   }

   public List mS() {
      return this.PF;
   }

   public List OK() {
      return this.cb;
   }

   public void dN(zd var1) {
      if(this.Hw.contains(var1)) {
         throw new RuntimeException();
      } else {
         this.Hw.add(var1);
      }
   }

   public void dN(Dw var1) {
      if(this.cb.contains(var1)) {
         throw new RuntimeException();
      } else {
         this.cb.add(var1);
      }
   }

   public void dN(Fu var1) {
      if(this.PF.contains(var1)) {
         throw new RuntimeException();
      } else {
         this.PF.add(var1);
      }
   }

   public void ld(final ZL var1) {
      if(this.ld) {
         throw new RuntimeException();
      } else {
         var1.KK.push(new js(hY.dN, this.dN));
         if(!this.QE && this.KK.length() > 0) {
            var1.dN(oc.ZY);
            var1.wU(" " + this.KK + ";");
            var1.QE();
            var1.QE();
         }

         this.EO.clear();
         int var2 = var1.LH();
         this.a_(var1);
         boolean var3 = this.fa.ld();
         int var4;
         int var5;
         Iterator var6;
         if(!var3) {
            if(this.LH != null && var1.mS) {
               var1.dN(this.LH);
            }

            var4 = this.fa.LH();
            if(this.fa.EO()) {
               var4 &= -17;
            }

            if(this.fa.cb()) {
               var4 &= -1025;
            }

            if(this.fa.PF()) {
               var1.wU("@");
            }

            oc.dN(var1, var4, -1);
            if(this.fa.KK()) {
               var1.dN(oc.wU);
               var1.wU(" ");
            }

            oc.dN(var1, this.zs, true);
            if(!this.mS.dN().equals("Ljava/lang/Object;") && (!this.fa.EO() || !this.mS.dN().equals("Ljava/lang/Enum;"))) {
               var1.wU(" ");
               var1.dN(oc.LH);
               var1.wU(" ");
               oc.dN(var1, this.mS);
            }

            if(!this.OK.isEmpty() && !this.fa.PF()) {
               Collections.sort(this.OK, new Comparator() {
                  public int dN(hV var1, hV var2) {
                     return var1.dN().compareTo(var2.dN());
                  }

                  // $FF: synthetic method
                  public int compare(Object var1, Object var2) {
                     return this.dN((hV)var1, (hV)var2);
                  }
               });
               var1.wU(" ");
               if(this.fa.cb()) {
                  var1.dN(oc.LH);
               } else {
                  var1.dN(oc.Hw);
               }

               var5 = 0;

               for(var6 = this.OK.iterator(); var6.hasNext(); ++var5) {
                  hV var7 = (hV)var6.next();
                  if(var5 == 0) {
                     var1.wU(" ");
                  } else {
                     var1.wU(", ");
                  }

                  oc.dN(var1, var7);
               }
            }

            if(var1.LH != null) {
               var1.ld(var1.LH.wU(this.dN));
            }

            var1.QE(-2);
         } else {
            if(this.OK.size() == 1) {
               oc.dN(var1, (hV)this.OK.get(0));
            } else {
               oc.dN(var1, this.mS);
            }

            var1.wU("()");
         }

         var1.wU(" {");
         var1.QE();
         var1.rK();
         Collections.sort(this.Hw, new Comparator() {
            public int dN(zd var1, zd var2) {
               return var1.ld().compareTo(var2.ld());
            }

            // $FF: synthetic method
            public int compare(Object var1, Object var2) {
               return this.dN((zd)var1, (zd)var2);
            }
         });
         Iterator var10 = this.Hw.iterator();

         while(var10.hasNext()) {
            zd var11 = (zd)var10.next();
            var11.ld(var1);
         }

         Collections.sort(this.cb, new Comparator() {
            public int dN(Dw var1, Dw var2) {
               return var1.zs().compareTo(var2.zs());
            }

            // $FF: synthetic method
            public int compare(Object var1, Object var2) {
               return this.dN((Dw)var1, (Dw)var2);
            }
         });
         var4 = 0;
         Iterator var12 = this.cb.iterator();

         while(true) {
            Dw var13;
            do {
               if(!var12.hasNext()) {
                  if(var4 >= 1) {
                     var1.QE();
                  }

                  Collections.sort(this.PF, new Comparator() {
                     // $FF: synthetic field
                     private ZL dN = var1;

                     public int dN(Fu var1, Fu var2) {
                        String var3 = var1.mS();
                        String var4 = var2.mS();
                        if(!this.dN.wU) {
                           return var3.compareTo(var4);
                        } else {
                           byte var5 = 1;
                           if(var1.rK()) {
                              var5 = 0;
                           } else if(var1.Ux()) {
                              var5 = 2;
                           } else if(var1.ZY()) {
                              var5 = 3;
                           }

                           byte var6 = 1;
                           if(var2.rK()) {
                              var6 = 0;
                           } else if(var2.Ux()) {
                              var6 = 2;
                           } else if(var2.ZY()) {
                              var6 = 3;
                           }

                           return var5 != var6 && !var3.startsWith("<") && !var4.startsWith("<")?var5 - var6:var3.compareTo(var4);
                        }
                     }

                     // $FF: synthetic method
                     public int compare(Object var1, Object var2) {
                        return this.dN((Fu)var1, (Fu)var2);
                     }
                  });
                  var5 = 0;
                  var6 = this.PF.iterator();

                  while(true) {
                     Fu var15;
                     do {
                        do {
                           if(!var6.hasNext()) {
                              var1.Ux();
                              var1.wU("}");
                              if(!var3) {
                                 var1.QE();
                                 var1.QE();
                              }

                              boolean var14 = var1.OK(false);
                              if(!this.QE && this.EO.size() > 0) {
                                 ArrayList var16 = new ArrayList();
                                 Iterator var8 = this.EO.values().iterator();

                                 String var9;
                                 while(var8.hasNext()) {
                                    var9 = (String)var8.next();
                                    if(!hV.wU(var9).equals("java.lang") && !hV.wU(var9).equals(this.KK)) {
                                       var16.add(hV.ld(var9));
                                    }
                                 }

                                 Collections.sort(var16);
                                 if(var16.size() > 0) {
                                    for(var8 = var16.iterator(); var8.hasNext(); ++var2) {
                                       var9 = (String)var8.next();
                                       var1.dN(oc.rK);
                                       var1.s();
                                       var1.wU(var9);
                                       var1.wU(";");
                                       var1.QE();
                                       var1.LH(var2);
                                    }

                                    var1.QE();
                                    var1.LH(var2);
                                 }
                              }

                              var1.OK(var14);
                              var1.KK.pop();
                              return;
                           }

                           var15 = (Fu)var6.next();
                        } while(var15.EO() && var3);
                     } while(!var1.zs && var15.PF());

                     if(var5 >= 1) {
                        var1.QE();
                     }

                     var15.ld(var1);
                     ++var5;
                  }
               }

               var13 = (Dw)var12.next();
            } while(!var1.fa && var13.QE());

            var13.ld(var1);
            ++var4;
         }
      }
   }

   public List wU() {
      List var1 = TM.dN((Collection)this.cb);
      TM.dN((List)var1, (Collection)this.PF);
      return TM.dN((List)var1, (Collection)this.Hw);
   }

   public boolean dN(IK var1, IK var2) {
      int var3;
      for(var3 = 0; var3 < this.cb.size(); ++var3) {
         if(this.cb.get(var3) == var1) {
            this.cb.set(var3, (Dw)var2);
            return true;
         }
      }

      for(var3 = 0; var3 < this.PF.size(); ++var3) {
         if(this.PF.get(var3) == var1) {
            this.PF.set(var3, (Fu)var2);
            return true;
         }
      }

      for(var3 = 0; var3 < this.Hw.size(); ++var3) {
         if(this.Hw.get(var3) == var1) {
            this.Hw.set(var3, (zd)var2);
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   zd(int var1, AR var2, hV.uK var3, OX.vd var4, GH var5, String var6, yK var7, hV var8, hV var9, List var10, Object var11) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static class uK {
      private AR dN;
      private hV.uK ld;
      private OX.vd QE;
      private GH wU;
      private HashMap fa;

      public uK(AR var1, hV.uK var2, OX.vd var3) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
         this.fa = new HashMap();
      }

      public void dN(GH var1) {
         this.wU = var1;
      }

      public zd dN(String var1) {
         return (zd)this.fa.get(var1);
      }

      public zd ld(String var1) {
         int var2 = ((nh.vd)this.dN.mS().dN(var1)).dN();
         zd var3 = (zd)this.fa.get(var1);
         if(var3 == null) {
            yK var4 = this.dN.EO(var1);
            hV var5 = this.ld.dN(var1);
            if(var4 == null) {
               var3 = new zd(var2, this.dN, this.ld, this.QE, this.wU, var1, (yK)null, var5, (hV)null, (List)null, null);
            } else {
               hV var6 = this.ld.dN(var4.wU(false));
               ArrayList var7 = new ArrayList();
               String[] var8 = var4.fa(false);
               int var9 = var8.length;

               for(int var10 = 0; var10 < var9; ++var10) {
                  String var11 = var8[var10];
                  var7.add(this.ld.dN(var11));
               }

               var3 = new zd(var2, this.dN, this.ld, this.QE, this.wU, var1, var4, var5, var6, var7, null);
               if(var4.dN() && !var4.ld()) {
                  yK var12 = this.dN.dN(var4);
                  if(var12 != null) {
                     zd var13 = (zd)this.fa.get(var12.dN(false));
                     if(var13 != null) {
                        var13.dN(var3);
                     }
                  }
               }
            }

            this.fa.put(var1, var3);
         }

         return var3;
      }
   }
}
