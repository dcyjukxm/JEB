package jebglobal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jebglobal.Dn;
import jebglobal.He;
import jebglobal.Js;
import jebglobal.Wu;
import jebglobal.cn;
import jebglobal.nm;
import jebglobal.oh;
import jebglobal.yL;

public final class RI {
   private static final long LK = 844563159190538443L;
   private final byte[] dN;
   private ByteBuffer ld;
   private HashMap QE;
   private Dn wU;
   private RI.vd fa;
   private boolean zs;
   private int mS;
   private int OK;
   private int LH;
   private int KK;
   private RI.uK EO;

   public RI(byte[] var1, HashMap var2, Dn var3, RI.vd var4, boolean var5) {
      this.dN = var1;
      this.QE = var2;
      this.wU = var3;
      this.fa = var4;
      this.zs = var5;
      this.ld = ByteBuffer.wrap(var1);
      this.ld.order(ByteOrder.LITTLE_ENDIAN);
   }

   public oh dN(int var1, int var2, nm[] var3) {
      this.mS = var1;
      this.OK = var1 + var2;
      if(var1 >= 0 && var1 < this.dN.length && this.OK <= this.dN.length && this.OK >= var1 && var2 % 2 == 0) {
         this.KK = 0;
         this.LH = var1;
         Js var4 = null;
         ArrayList var5 = new ArrayList();
         HashMap var6 = new HashMap();
         HashMap var7 = new HashMap();
         ArrayDeque var8 = new ArrayDeque();
         var8.push(Integer.valueOf(this.KK));
         boolean var9 = true;
         HashSet var10 = new HashSet();
         int var11 = 0;

         int var16;
         int var17;
         nm[] var25;
         int var26;
         int var31;
         nm var34;
         label213:
         while(true) {
            while(true) {
               if(var9) {
                  Wu var32;
                  if(var8.isEmpty()) {
                     if(var3 == null) {
                        break label213;
                     }

                     if(var11 == 0) {
                        var25 = var3;
                        var26 = var3.length;

                        for(var31 = 0; var31 < var26; ++var31) {
                           var34 = var25[var31];
                           var16 = var34.dN();
                           if(var16 < var2) {
                              var8.add(Integer.valueOf(var16));
                           }

                           var17 = var34.QE();
                           if(var17 < var2) {
                              var10.add(Integer.valueOf(var17));

                              for(int var18 = var17 - 2; var18 > var16; var18 -= 2) {
                                 Wu var19 = (Wu)var7.get(Integer.valueOf(var18));
                                 if(var19 != null) {
                                    if(var18 + var19.ld() == var17) {
                                       var10.remove(Integer.valueOf(var17));
                                       if(!var19.dN((List)null)) {
                                          var8.add(Integer.valueOf(var17));
                                       }
                                    }
                                    break;
                                 }
                              }
                           }
                        }

                        List var27 = this.dN(var3);
                        var8.addAll(var27);
                     } else {
                        if(var11 != 1) {
                           break label213;
                        }

                        Iterator var28 = var10.iterator();

                        while(true) {
                           while(var28.hasNext()) {
                              var26 = ((Integer)var28.next()).intValue();

                              for(var31 = var26 - 2; var31 > 0; var31 -= 2) {
                                 var32 = (Wu)var7.get(Integer.valueOf(var31));
                                 if(var32 != null) {
                                    if(var31 + var32.ld() == var26 && !var32.dN((List)null)) {
                                       var8.add(Integer.valueOf(var26));
                                    }
                                    break;
                                 }
                              }
                           }

                           var10.clear();
                           break;
                        }
                     }

                     var9 = true;
                     ++var11;
                     continue;
                  }

                  this.KK = ((Integer)var8.pop()).intValue();
                  this.LH = var1 + this.KK;
                  var4 = (Js)var6.get(Integer.valueOf(this.KK));
                  if(var4 != null) {
                     if(((Wu)var4.dN.get(0)).dN() == this.KK) {
                        continue;
                     }

                     int var24 = -1;
                     var26 = 0;

                     for(Iterator var29 = var4.dN.iterator(); var29.hasNext(); ++var26) {
                        var32 = (Wu)var29.next();
                        if(var32.dN() == this.KK) {
                           var24 = var26;
                           break;
                        }
                     }

                     if(var24 < 0) {
                        throw new RuntimeException();
                     }

                     Js var30 = new Js();
                     var5.add(var30);

                     for(var26 = var24; var26 < var4.dN.size(); ++var26) {
                        var32 = (Wu)var4.dN.get(var26);
                        var30.dN.add(var32);
                        var6.put(Integer.valueOf(var32.dN()), var30);
                     }

                     var30.ld = new ArrayList(var4.ld);
                     int var33 = var4.dN.size() - var24;

                     for(var26 = 0; var26 < var33; ++var26) {
                        var4.dN.remove(var24);
                     }

                     var4.ld.clear();
                     var4.ld.add(Integer.valueOf(this.KK));
                     continue;
                  }

                  var4 = new Js();
                  var5.add(var4);
                  var9 = false;
               }

               Js var12 = (Js)var6.get(Integer.valueOf(this.KK));
               if(var12 != null) {
                  if(var4.dN.isEmpty()) {
                     throw new RuntimeException();
                  }

                  var4.ld.add(Integer.valueOf(((Wu)var12.dN.get(0)).dN()));
                  var9 = true;
               } else {
                  Wu var13 = this.dN();
                  if(var13 == null) {
                     cn.dN(String.format("Offset %Xh (method=%Xh/%Xh): Parsing error (%s)", new Object[]{Integer.valueOf(this.LH), Integer.valueOf(var1), Integer.valueOf(var2), this.EO}));
                     var9 = true;
                  } else {
                     var4.dN.add(var13);
                     var6.put(Integer.valueOf(this.KK), var4);
                     var7.put(Integer.valueOf(this.KK), var13);
                     ArrayList var14 = new ArrayList();
                     if(!var13.dN(var14)) {
                        this.LH += var13.ld();
                        this.KK += var13.ld();
                     } else {
                        Iterator var15 = var14.iterator();

                        while(var15.hasNext()) {
                           var16 = ((Integer)var15.next()).intValue();
                           if(var16 >= 0 && var16 < var2) {
                              var4.ld.add(Integer.valueOf(var16));
                              var8.push(Integer.valueOf(var16));
                           }
                        }

                        var9 = true;
                     }
                  }
               }
            }
         }

         if(var3 != null) {
            var25 = var3;
            var26 = var3.length;

            label127:
            for(var31 = 0; var31 < var26; ++var31) {
               var34 = var25[var31];
               var16 = var34.dN();
               var17 = var34.QE();
               List var35 = var34.fa();
               Iterator var36 = var5.iterator();

               while(true) {
                  while(true) {
                     if(!var36.hasNext()) {
                        continue label127;
                     }

                     Js var20 = (Js)var36.next();
                     if(var20.dN.isEmpty()) {
                        cn.dN("Empty basic block");
                     } else {
                        int var21 = ((Wu)var20.dN.get(0)).dN();
                        if(var21 >= var16 && var21 < var17) {
                           Iterator var22 = var35.iterator();

                           while(var22.hasNext()) {
                              int var23 = ((Integer)var22.next()).intValue();
                              if(!var20.QE.contains(Integer.valueOf(var23))) {
                                 var20.QE.add(Integer.valueOf(var23));
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return new oh(var5);
      } else {
         throw new yL();
      }
   }

   private Wu dN() {
      if(this.LH >= this.mS && this.LH < this.OK) {
         int var1 = this.ld.get(this.LH) & 255;
         He.uK var2 = He.dN[var1];
         int var3;
         if(var1 == 255 && this.zs) {
            if(this.LH + 1 >= this.OK) {
               this.EO = RI.uK.ld;
               return null;
            }

            var3 = this.ld.get(this.LH + 1) & 255;
            if(var3 >= He.ld.length) {
               this.EO = RI.uK.LH;
               return null;
            }

            var1 = this.ld.getShort(this.LH) & '\uffff';
            var2 = He.ld[var3];
         }

         var3 = 2 * dN(var2);
         if(this.LH + var3 > this.LH && this.LH + var3 <= this.OK) {
            Wu var4 = new Wu();
            var4.dN = this.LH - this.mS;
            var4.ld = new byte[var3];

            int var5;
            for(var5 = 0; var5 < var3; ++var5) {
               var4.ld[var5] = this.ld.get(this.LH + var5);
            }

            var4.QE = var2;
            var5 = this.ld.get(this.LH + 1) & 255;
            ArrayList var6 = new ArrayList(3);
            int var18;
            if(dN(var2, "10x")) {
               if(var1 != 0 && var1 != 14) {
                  if(var1 >= 227 && var1 <= 254) {
                     this.EO = RI.uK.wU;
                  } else {
                     this.EO = RI.uK.QE;
                  }

                  return null;
               }
            } else {
               int var7;
               int var8;
               if(dN(var2, "12x", "11n")) {
                  var7 = var5 & 15;
                  var8 = var5 >> 4 & 15;
                  var6.add(new Wu.vd(0, (long)var7));
                  if(dN(var2, "12x")) {
                     var6.add(new Wu.vd(0, (long)var8));
                  } else if(dN(var2, "11n")) {
                     var18 = (var8 & 8) == 0?var8:var8 | -16;
                     var6.add(new Wu.vd(1, (long)var18));
                  }
               } else if(dN(var2, "11x", "10t")) {
                  if(dN(var2, "11x")) {
                     var6.add(new Wu.vd(0, (long)var5));
                  } else if(dN(var2, "10t")) {
                     byte var23 = this.ld.get(this.LH + 1);
                     var6.add(new Wu.vd(3, (long)var23));
                  }
               } else if(dN(var2, "20t")) {
                  if(var5 != 0) {
                     this.EO = RI.uK.fa;
                     return null;
                  }

                  short var21 = this.ld.getShort(this.LH + 2);
                  var6.add(new Wu.vd(3, (long)var21));
               } else {
                  if(dN(var2, "20bc")) {
                     this.EO = RI.uK.KK;
                     return null;
                  }

                  long var17;
                  if(dN(var2, "22x", "21t", "21s", "21h", "21c")) {
                     var7 = this.ld.get(this.LH + 1) & 255;
                     var17 = (long)this.ld.getShort(this.LH + 2);
                     var6.add(new Wu.vd(0, (long)var7));
                     if(dN(var2, "22x")) {
                        var6.add(new Wu.vd(0, var17 & 65535L));
                     } else if(dN(var2, "21t")) {
                        var6.add(new Wu.vd(3, var17));
                     } else if(dN(var2, "21s")) {
                        var6.add(new Wu.vd(1, var17));
                     } else if(dN(var2, "21h")) {
                        if(var1 == 21) {
                           var6.add(new Wu.vd(1, var17 << 16));
                        } else {
                           var6.add(new Wu.vd(1, var17 << 48));
                        }
                     } else {
                        var6.add(new Wu.vd(2, var17 & 65535L));
                     }
                  } else if(dN(var2, "23x", "22b")) {
                     var7 = this.ld.get(this.LH + 1) & 255;
                     var8 = this.ld.get(this.LH + 2) & 255;
                     var6.add(new Wu.vd(0, (long)var7));
                     var6.add(new Wu.vd(0, (long)var8));
                     if(dN(var2, "23x")) {
                        var18 = this.ld.get(this.LH + 3) & 255;
                        var6.add(new Wu.vd(0, (long)var18));
                     } else {
                        byte var24 = this.ld.get(this.LH + 3);
                        var6.add(new Wu.vd(1, (long)var24));
                     }
                  } else if(dN(var2, "22t", "22s", "22c", "22cs")) {
                     var7 = this.ld.get(this.LH + 1) & 15;
                     var8 = this.ld.get(this.LH + 1) >> 4 & 15;
                     var6.add(new Wu.vd(0, (long)var7));
                     var6.add(new Wu.vd(0, (long)var8));
                     short var20 = this.ld.getShort(this.LH + 2);
                     if(dN(var2, "22t")) {
                        var6.add(new Wu.vd(3, (long)var20));
                     } else if(dN(var2, "22s")) {
                        var6.add(new Wu.vd(1, (long)var20));
                     } else {
                        if(!dN(var2, "22c")) {
                           this.EO = RI.uK.KK;
                           return null;
                        }

                        var6.add(new Wu.vd(2, (long)(var20 & '\uffff')));
                     }
                  } else if(dN(var2, "30t")) {
                     if(this.ld.get(this.LH + 1) != 0) {
                        this.EO = RI.uK.fa;
                        return null;
                     }

                     var7 = this.ld.getInt(this.LH + 2);
                     var6.add(new Wu.vd(3, (long)var7));
                  } else if(dN(var2, "32x")) {
                     if(this.ld.get(this.LH + 1) != 0) {
                        this.EO = RI.uK.fa;
                        return null;
                     }

                     var7 = this.ld.getShort(this.LH + 2) & '\uffff';
                     var8 = this.ld.getShort(this.LH + 4) & '\uffff';
                     var6.add(new Wu.vd(0, (long)var7));
                     var6.add(new Wu.vd(0, (long)var8));
                  } else {
                     int var11;
                     if(dN(var2, "31i", "31t", "31c")) {
                        var7 = this.ld.get(this.LH + 1) & 255;
                        var8 = this.ld.getInt(this.LH + 2);
                        var6.add(new Wu.vd(0, (long)var7));
                        if(dN(var2, "31i")) {
                           var6.add(new Wu.vd(1, (long)var8));
                        } else if(dN(var2, "31t")) {
                           label361: {
                              var6.add(new Wu.vd(3, (long)var8));
                              var18 = this.LH + 2 * var8;
                              if(var18 >= this.LH && var18 <= this.OK) {
                                 int var12;
                                 int var13;
                                 int var15;
                                 int var16;
                                 int var22;
                                 if(var2.QE.equals("packed-switch")) {
                                    var22 = var18 + 8;
                                    if(var22 >= var18 && var22 <= this.OK) {
                                       if(this.ld.getShort(var18) != 256) {
                                          this.EO = RI.uK.zs;
                                          return null;
                                       }

                                       var11 = this.ld.getShort(var18 + 2) & '\uffff';
                                       var12 = this.ld.getInt(var18 + 4);
                                       var13 = 2 * (var11 * 2 + 4);
                                       var22 = var18 + var13;
                                       if(var22 >= var18 && var22 <= this.OK) {
                                          Wu.lX var29 = new Wu.lX(var18 - this.mS, var11);

                                          for(var15 = 0; var15 < var11; ++var15) {
                                             var16 = this.ld.getInt(var18 + 8 + 4 * var15);
                                             var29.dN[var15] = new Wu.lX.uK(var12 + var15, var16);
                                          }

                                          var4.fa = var29;
                                          break label361;
                                       }

                                       this.EO = RI.uK.ld;
                                       return null;
                                    }

                                    this.EO = RI.uK.ld;
                                    return null;
                                 }

                                 if(var2.QE.equals("sparse-switch")) {
                                    var22 = var18 + 4;
                                    if(var22 >= var18 && var22 <= this.OK) {
                                       if(this.ld.getShort(var18) != 512) {
                                          this.EO = RI.uK.zs;
                                          return null;
                                       }

                                       var11 = this.ld.getShort(var18 + 2) & '\uffff';
                                       var12 = 2 * (var11 * 4 + 2);
                                       var22 = var18 + var12;
                                       if(var22 >= var18 && var22 <= this.OK) {
                                          Wu.lX var27 = new Wu.lX(var18 - this.mS, var11);
                                          int[] var28 = new int[var11];

                                          for(var15 = 0; var15 < var11; ++var15) {
                                             var28[var15] = this.ld.getInt(var18 + 4 + 4 * var15);
                                          }

                                          for(var15 = 0; var15 < var11; ++var15) {
                                             var16 = this.ld.getInt(var18 + 4 + 4 * var11 + 4 * var15);
                                             var27.dN[var15] = new Wu.lX.uK(var28[var15], var16);
                                          }

                                          var4.fa = var27;
                                          break label361;
                                       }

                                       this.EO = RI.uK.ld;
                                       return null;
                                    }

                                    this.EO = RI.uK.ld;
                                    return null;
                                 }

                                 if(!var2.QE.equals("fill-array-data")) {
                                    break label361;
                                 }

                                 var22 = var18 + 8;
                                 if(var22 >= var18 && var22 <= this.OK) {
                                    if(this.ld.getShort(var18) != 768) {
                                       this.EO = RI.uK.zs;
                                       return null;
                                    }

                                    var11 = this.ld.getShort(var18 + 2) & '\uffff';
                                    var12 = this.ld.getInt(var18 + 4);
                                    var13 = 2 * ((var12 * var11 + 1) / 2 + 4);
                                    var22 = var18 + var13;
                                    if(var22 >= var18 && var22 <= this.OK) {
                                       Wu.uK var14 = new Wu.uK(var18 - this.mS, var12, var11);

                                       for(var15 = 0; var15 < var12; ++var15) {
                                          for(var16 = 0; var16 < var11; ++var16) {
                                             var14.dN[var15][var16] = this.ld.get(var18 + 8 + var15 * var11 + var16);
                                          }
                                       }

                                       var4.zs = var14;
                                       break label361;
                                    }

                                    this.EO = RI.uK.ld;
                                    return null;
                                 }

                                 this.EO = RI.uK.ld;
                                 return null;
                              }

                              this.EO = RI.uK.ld;
                              return null;
                           }
                        } else {
                           var6.add(new Wu.vd(2, (long)var8));
                        }
                     } else if(dN(var2, "35c", "35ms", "35mi")) {
                        var7 = var5 >> 4;
                        if(var7 > 5) {
                           this.EO = RI.uK.mS;
                           return null;
                        }

                        var8 = this.ld.getShort(this.LH + 2) & '\uffff';
                        int[] var9 = new int[]{0, 0, 0, 0, 0};
                        short var10 = this.ld.getShort(this.LH + 4);
                        var9[0] = var10 & 15;
                        var9[1] = var10 >> 4 & 15;
                        var9[2] = var10 >> 8 & 15;
                        var9[3] = var10 >> 12 & 15;
                        var9[4] = var5 & 15;
                        if(!dN(var2, "35c")) {
                           this.EO = RI.uK.KK;
                           return null;
                        }

                        var6.add(new Wu.vd(2, (long)var8));

                        for(var11 = 0; var11 < var7; ++var11) {
                           var6.add(new Wu.vd(0, (long)var9[var11]));
                        }
                     } else {
                        long var19;
                        if(dN(var2, "3rc", "3rms", "3rmi")) {
                           var7 = this.ld.get(this.LH + 1) & 255;
                           var8 = this.ld.getShort(this.LH + 2) & '\uffff';
                           var18 = this.ld.getShort(this.LH + 4) & '\uffff';
                           if(!dN(var2, "3rc")) {
                              this.EO = RI.uK.KK;
                              return null;
                           }

                           var6.add(new Wu.vd(2, (long)var8));
                           var19 = (long)var18 | (long)(var18 + var7 - 1) << 32;
                           var6.add(new Wu.vd(4, var19));
                        } else if(dN(var2, "51l")) {
                           var7 = this.ld.get(this.LH + 1) & 255;
                           var17 = this.ld.getLong(this.LH + 2);
                           var6.add(new Wu.vd(0, (long)var7));
                           var6.add(new Wu.vd(1, var17));
                        } else if(dN(var2, "41c")) {
                           var7 = this.ld.getInt(this.LH + 2);
                           var8 = this.ld.getShort(this.LH + 6) & '\uffff';
                           var6.add(new Wu.vd(0, (long)var8));
                           var6.add(new Wu.vd(2, (long)var7));
                        } else if(dN(var2, "52c")) {
                           var7 = this.ld.getInt(this.LH + 2);
                           var8 = this.ld.getShort(this.LH + 6) & '\uffff';
                           var18 = this.ld.getShort(this.LH + 8) & '\uffff';
                           var6.add(new Wu.vd(0, (long)var8));
                           var6.add(new Wu.vd(0, (long)var18));
                           var6.add(new Wu.vd(2, (long)var7));
                        } else {
                           if(!dN(var2, "5rc")) {
                              this.EO = RI.uK.KK;
                              return null;
                           }

                           var7 = this.ld.getInt(this.LH + 2);
                           var8 = this.ld.getShort(this.LH + 6) & '\uffff';
                           var18 = this.ld.getShort(this.LH + 8) & '\uffff';
                           var6.add(new Wu.vd(2, (long)var7));
                           var19 = (long)var18 | (long)(var18 + var8 - 1) << 32;
                           var6.add(new Wu.vd(4, var19));
                        }
                     }
                  }
               }
            }

            Iterator var25;
            Wu.vd var26;
            if(this.fa != null) {
               var25 = var6.iterator();

               while(var25.hasNext()) {
                  var26 = (Wu.vd)var25.next();
                  if(var26.dN == 2) {
                     var18 = (int)var26.ld;
                     if(var18 < 0) {
                        this.EO = RI.uK.OK;
                        return null;
                     }

                     if(Wu.QE(var1)) {
                        if(var18 >= this.fa.dN) {
                           this.EO = RI.uK.OK;
                           return null;
                        }
                     } else if(Wu.wU(var1)) {
                        if(var18 >= this.fa.ld) {
                           this.EO = RI.uK.OK;
                           return null;
                        }
                     } else if(Wu.fa(var1)) {
                        if(var18 >= this.fa.QE) {
                           this.EO = RI.uK.OK;
                           return null;
                        }
                     } else {
                        if(!Wu.zs(var1)) {
                           throw new RuntimeException();
                        }

                        if(var18 >= this.fa.wU) {
                           this.EO = RI.uK.OK;
                           return null;
                        }
                     }
                  }
               }
            }

            var4.wU = new Wu.vd[var6.size()];
            var6.toArray(var4.wU);
            if(this.QE != null) {
               var25 = var6.iterator();

               while(var25.hasNext()) {
                  var26 = (Wu.vd)var25.next();
                  if(var26.dN == 1 && !this.QE.containsKey(Long.valueOf(var26.ld))) {
                     this.QE.put(Long.valueOf(var26.ld), Long.valueOf(var26.ld));
                  }
               }
            }

            if(this.wU != null) {
               var25 = var6.iterator();

               while(var25.hasNext()) {
                  var26 = (Wu.vd)var25.next();
                  if(var26.dN == 2) {
                     var18 = (int)var26.ld;
                     if(Wu.QE(var1)) {
                        this.wU.dN(var18, this.LH);
                     } else if(Wu.wU(var1)) {
                        this.wU.ld(var18, this.LH);
                     } else if(Wu.fa(var1)) {
                        this.wU.QE(var18, this.LH);
                     } else if(Wu.zs(var1)) {
                        this.wU.wU(var18, this.LH);
                     }
                  }
               }
            }

            this.EO = RI.uK.dN;
            return var4;
         } else {
            this.EO = RI.uK.ld;
            return null;
         }
      } else {
         this.EO = RI.uK.ld;
         return null;
      }
   }

   private static boolean dN(He.uK var0, String var1) {
      return var0.ld.equals(var1);
   }

   private static boolean dN(He.uK var0, String var1, String var2) {
      return var0.ld.equals(var1) || var0.ld.equals(var2);
   }

   private static boolean dN(He.uK var0, String var1, String var2, String var3) {
      return var0.ld.equals(var1) || var0.ld.equals(var2) || var0.ld.equals(var3);
   }

   private static boolean dN(He.uK var0, String var1, String var2, String var3, String var4) {
      return var0.ld.equals(var1) || var0.ld.equals(var2) || var0.ld.equals(var3) || var0.ld.equals(var4);
   }

   private static boolean dN(He.uK var0, String var1, String var2, String var3, String var4, String var5) {
      return var0.ld.equals(var1) || var0.ld.equals(var2) || var0.ld.equals(var3) || var0.ld.equals(var4) || var0.ld.equals(var5);
   }

   private static int dN(He.uK var0) {
      if(var0.ld.length() != 3 && var0.ld.length() != 4) {
         throw new RuntimeException();
      } else {
         return var0.ld.codePointAt(0) - 48;
      }
   }

   public List dN(nm[] var1) {
      HashSet var2 = new HashSet();
      nm[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         nm var6 = var3[var5];
         var2.addAll(var6.fa());
      }

      return new ArrayList(var2);
   }

   // $FF: synthetic class
   static class SyntheticClass_1 {
      // $FF: synthetic field
      static final int[] dN = new int[RI.uK.values().length];

      static {
         try {
            dN[RI.uK.dN.ordinal()] = 1;
         } catch (NoSuchFieldError var9) {
            ;
         }

         try {
            dN[RI.uK.ld.ordinal()] = 2;
         } catch (NoSuchFieldError var8) {
            ;
         }

         try {
            dN[RI.uK.QE.ordinal()] = 3;
         } catch (NoSuchFieldError var7) {
            ;
         }

         try {
            dN[RI.uK.wU.ordinal()] = 4;
         } catch (NoSuchFieldError var6) {
            ;
         }

         try {
            dN[RI.uK.fa.ordinal()] = 5;
         } catch (NoSuchFieldError var5) {
            ;
         }

         try {
            dN[RI.uK.zs.ordinal()] = 6;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            dN[RI.uK.mS.ordinal()] = 7;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            dN[RI.uK.OK.ordinal()] = 8;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            dN[RI.uK.LH.ordinal()] = 9;
         } catch (NoSuchFieldError var1) {
            ;
         }

         try {
            dN[RI.uK.KK.ordinal()] = 10;
         } catch (NoSuchFieldError var0) {
            ;
         }

      }
   }

   static enum uK {
      dN,
      ld,
      QE,
      wU,
      fa,
      zs,
      mS,
      OK,
      LH,
      KK;

      public String toString() {
         switch(RI.SyntheticClass_1.dN[this.ordinal()]) {
         case 1:
            return "No error";
         case 2:
            return "Out of bytecode boundaries";
         case 3:
            return "Reserved opcode";
         case 4:
            return "Optimized opcode";
         case 5:
            return "Invalid opcode format";
         case 6:
            return "Invalid pseudo instruction ID";
         case 7:
            return "Invalid argument count";
         case 8:
            return "Invalid pool index";
         case 9:
            return "Invalid extended opcode";
         case 10:
            return "Unimplemented encoding format";
         default:
            return "Unknown error";
         }
      }
   }

   public static class vd {
      int dN;
      int ld;
      int QE;
      int wU;

      public vd(int var1, int var2, int var3, int var4) {
         this.dN = var1;
         this.ld = var2;
         this.QE = var3;
         this.wU = var4;
      }
   }
}
