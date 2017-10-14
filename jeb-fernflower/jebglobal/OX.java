package jebglobal;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import jebglobal.IK;
import jebglobal.TM;
import jebglobal.Xf;
import jebglobal.ZF;
import jebglobal.ZL;
import jebglobal.Zh;
import jebglobal.cI;
import jebglobal.hV;
import jebglobal.oc;

public final class OX extends cI implements Xf {
   private hV dN;
   private boolean ld;
   private byte QE;
   private char wU;
   private short fa;
   private int zs;
   private long mS;
   private float OK;
   private double LH;
   private String KK;
   private OX.uK EO;

   private OX() {
      this.dN = null;
   }

   private OX(boolean var1) {
      this.dN = hV.ld;
      this.ld = var1;
   }

   private OX(byte var1) {
      this.dN = hV.QE;
      this.QE = var1;
   }

   private OX(char var1) {
      this.dN = hV.wU;
      this.wU = var1;
   }

   private OX(short var1) {
      this.dN = hV.fa;
      this.fa = var1;
   }

   private OX(int var1) {
      this.dN = hV.zs;
      this.zs = var1;
   }

   private OX(long var1) {
      this.dN = hV.mS;
      this.mS = var1;
   }

   private OX(float var1) {
      this.dN = hV.OK;
      this.OK = var1;
   }

   private OX(double var1) {
      this.dN = hV.LH;
      this.LH = var1;
   }

   private OX(String var1, hV var2) {
      this.dN = var2;
      this.KK = var1;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public hV ld() {
      return this.dN;
   }

   public boolean QE() {
      return this.ld;
   }

   public byte fa() {
      return this.QE;
   }

   public char zs() {
      return this.wU;
   }

   public short mS() {
      return this.fa;
   }

   public int OK() {
      return this.zs;
   }

   public long LH() {
      return this.mS;
   }

   public float KK() {
      return this.OK;
   }

   public double EO() {
      return this.LH;
   }

   public String cb() {
      return this.KK;
   }

   public boolean PF() {
      return this.dN == null;
   }

   public boolean Hw() {
      return this.dN == hV.ld && this.ld;
   }

   public boolean rK() {
      return this.dN == hV.ld && !this.ld;
   }

   public boolean Ux() {
      return this.dN == hV.QE && this.QE == 0 || this.dN == hV.wU && this.wU == 0 || this.dN == hV.fa && this.fa == 0 || this.dN == hV.zs && this.zs == 0 || this.dN == hV.mS && this.mS == 0L || this.dN == hV.OK && this.OK == 0.0F || this.dN == hV.LH && this.LH == 0.0D;
   }

   public boolean ZY() {
      return this.dN == hV.QE && this.QE == 1 || this.dN == hV.wU && this.wU == 1 || this.dN == hV.fa && this.fa == 1 || this.dN == hV.zs && this.zs == 1 || this.dN == hV.mS && this.mS == 1L || this.dN == hV.OK && this.OK == 1.0F || this.dN == hV.LH && this.LH == 1.0D;
   }

   public boolean s() {
      return this.dN == hV.QE && this.QE == -1 || this.dN == hV.wU && this.wU == -1 || this.dN == hV.fa && this.fa == -1 || this.dN == hV.zs && this.zs == -1 || this.dN == hV.mS && this.mS == -1L || this.dN == hV.OK && this.OK == -1.0F || this.dN == hV.LH && this.LH == -1.0D;
   }

   public boolean Hv() {
      return this.dN == hV.QE && this.QE > 0 || this.dN == hV.wU && this.wU > 0 || this.dN == hV.fa && this.fa > 0 || this.dN == hV.zs && this.zs > 0 || this.dN == hV.mS && this.mS > 0L || this.dN == hV.OK && this.OK > 0.0F || this.dN == hV.LH && this.LH > 0.0D;
   }

   public boolean VX() {
      return this.dN == hV.QE && this.QE < 0 || this.dN == hV.wU && this.wU < 0 || this.dN == hV.fa && this.fa < 0 || this.dN == hV.zs && this.zs < 0 || this.dN == hV.mS && this.mS < 0L || this.dN == hV.OK && this.OK < 0.0F || this.dN == hV.LH && this.LH < 0.0D;
   }

   public OX dN(OX.vd var1) {
      return this.dN == hV.ld?var1.dN(!this.ld):(this.dN == hV.QE?var1.dN((byte)(-this.QE)):(this.dN == hV.wU?var1.dN((char)(-this.wU)):(this.dN == hV.fa?var1.dN((short)(-this.fa)):(this.dN == hV.zs?var1.dN(-this.zs):(this.dN == hV.mS?var1.dN(-this.mS):(this.dN == hV.OK?var1.dN(-this.OK):(this.dN == hV.LH?var1.dN(-this.LH):null)))))));
   }

   public void dN(OX.uK var1) {
      this.EO = var1;
   }

   public OX.uK ci() {
      return this.EO;
   }

   private String dN(boolean var1) {
      if(this.EO != null && !var1) {
         if(this.EO == OX.uK.ld) {
            return "%d";
         } else if(this.EO == OX.uK.QE) {
            return "0x%X";
         } else if(this.EO == OX.uK.dN) {
            return "0%o";
         } else {
            throw new RuntimeException();
         }
      } else {
         return "%d";
      }
   }

   public List wU() {
      return TM.dN(new IK[0]);
   }

   public boolean dN(IK var1, IK var2) {
      return false;
   }

   public void dN(ZL var1) {
      this.a_(var1);
      if(var1.ld && this.EO == null) {
         this.EO = OX.uK.QE;
      }

      if(this.dN == null) {
         var1.dN(oc.Nh);
      } else {
         String var2;
         if(this.dN.LH()) {
            var2 = String.format("\"%s\"", new Object[]{ZF.QE(this.KK, true)});
            var1.dN(var2, Zh.Hw, this);
         } else if(this.dN == hV.ld) {
            var1.dN(this.ld?oc.rn:oc.LR);
         } else {
            String var3;
            if(this.dN == hV.QE) {
               var3 = this.dN(this.QE <= 9);
               var2 = String.format(var3, new Object[]{Byte.valueOf(this.QE)});
            } else if(this.dN == hV.wU) {
               var2 = String.format("\'%s\'", new Object[]{ZF.dN(this.wU, true)});
            } else if(this.dN == hV.fa) {
               var3 = this.dN(this.fa <= 9);
               var2 = String.format(var3, new Object[]{Short.valueOf(this.fa)});
            } else if(this.dN == hV.zs) {
               var3 = this.dN(this.zs >= 0 && this.zs <= 9);
               var2 = String.format(var3, new Object[]{Integer.valueOf(this.zs)});
            } else if(this.dN == hV.mS) {
               var3 = this.dN(this.mS <= 9L);
               var2 = String.format(var3, new Object[]{Long.valueOf(this.mS)});
               if(this.mS < -2147483648L || this.mS > 2147483647L) {
                  var2 = var2 + "L";
               }
            } else {
               if(this.dN != hV.OK && this.dN != hV.LH) {
                  throw new RuntimeException();
               }

               var2 = String.format(Locale.US, "%.6f", new Object[]{Double.valueOf(this.dN == hV.OK?(double)this.OK:this.LH)});

               int var4;
               for(var4 = var2.length() - 1; var4 >= 0; --var4) {
                  char var5 = var2.charAt(var4);
                  if(var5 != 48) {
                     if(var5 != 46) {
                        ++var4;
                     }
                     break;
                  }
               }

               var2 = var2.substring(0, var4);
               if(this.dN == hV.OK) {
                  var2 = var2 + 'f';
               }
            }

            var1.dN(var2, Zh.cb, this);
         }
      }

   }

   public String toString() {
      if(this.dN == null) {
         return "null";
      } else if(this.dN.LH()) {
         return String.format("\"%s\"", new Object[]{ZF.QE(this.KK, true)});
      } else if(this.dN == hV.ld) {
         return this.ld?"true":"false";
      } else {
         String var1;
         String var2;
         if(this.dN == hV.QE) {
            var2 = this.dN(this.QE <= 9);
            var1 = String.format(var2, new Object[]{Byte.valueOf(this.QE)});
         } else if(this.dN == hV.wU) {
            var1 = String.format("\'%s\'", new Object[]{ZF.dN(this.wU, true)});
         } else if(this.dN == hV.fa) {
            var2 = this.dN(this.fa <= 9);
            var1 = String.format(var2, new Object[]{Short.valueOf(this.fa)});
         } else if(this.dN == hV.zs) {
            var2 = this.dN(this.zs >= 0 && this.zs <= 9);
            var1 = String.format(var2, new Object[]{Integer.valueOf(this.zs)});
         } else if(this.dN == hV.mS) {
            var2 = this.dN(this.mS <= 9L);
            var1 = String.format(var2, new Object[]{Long.valueOf(this.mS)});
            if(this.mS < -2147483648L || this.mS > 2147483647L) {
               var1 = var1 + "L";
            }
         } else {
            if(this.dN != hV.OK && this.dN != hV.LH) {
               throw new RuntimeException();
            }

            var1 = String.format("%.6f", new Object[]{Double.valueOf(this.dN == hV.OK?(double)this.OK:this.LH)});

            int var3;
            for(var3 = var1.length() - 1; var3 >= 0; --var3) {
               char var4 = var1.charAt(var3);
               if(var4 != 48) {
                  if(var4 != 46) {
                     ++var3;
                  }
                  break;
               }
            }

            var1 = var1.substring(0, var3);
            if(this.dN == hV.OK) {
               var1 = var1 + 'f';
            }
         }

         return var1;
      }
   }

   // $FF: synthetic method
   OX(TM var1) {
      this();
   }

   // $FF: synthetic method
   OX(boolean var1, TM var2) {
      this(var1);
   }

   // $FF: synthetic method
   OX(byte var1, TM var2) {
      this(var1);
   }

   // $FF: synthetic method
   OX(char var1, TM var2) {
      this(var1);
   }

   // $FF: synthetic method
   OX(short var1, TM var2) {
      this(var1);
   }

   // $FF: synthetic method
   OX(int var1, TM var2) {
      this(var1);
   }

   // $FF: synthetic method
   OX(long var1, TM var3) {
      this(var1);
   }

   // $FF: synthetic method
   OX(float var1, TM var2) {
      this(var1);
   }

   // $FF: synthetic method
   OX(double var1, TM var3) {
      this(var1);
   }

   // $FF: synthetic method
   OX(String var1, hV var2, TM var3) {
      this(var1, var2);
   }

   public static enum uK {
      dN,
      ld,
      QE;
   }

   public static class vd {
      private hV dN;
      private OX ld;
      private HashMap QE;
      private HashMap wU;
      private HashMap fa;
      private HashMap zs;
      private HashMap mS;
      private HashMap OK;
      private HashMap LH;
      private HashMap KK;
      private HashMap EO;

      public vd(hV.uK var1) {
         this.dN = var1.dN("Ljava/lang/String;");
         this.ld = new OX((TM)null);
         this.QE = new HashMap();
         this.wU = new HashMap();
         this.fa = new HashMap();
         this.zs = new HashMap();
         this.mS = new HashMap();
         this.OK = new HashMap();
         this.LH = new HashMap();
         this.KK = new HashMap();
         this.EO = new HashMap();
      }

      public OX dN() {
         return this.ld;
      }

      public OX dN(boolean var1) {
         OX var2 = (OX)this.QE.get(Boolean.valueOf(var1));
         if(var2 == null) {
            var2 = new OX(var1, (TM)null);
            this.QE.put(Boolean.valueOf(var1), var2);
         }

         return var2;
      }

      public OX dN(byte var1) {
         OX var2 = (OX)this.wU.get(Byte.valueOf(var1));
         if(var2 == null) {
            var2 = new OX(var1, (TM)null);
            this.wU.put(Byte.valueOf(var1), var2);
         }

         return var2;
      }

      public OX dN(char var1) {
         OX var2 = (OX)this.fa.get(Character.valueOf(var1));
         if(var2 == null) {
            var2 = new OX(var1, (TM)null);
            this.fa.put(Character.valueOf(var1), var2);
         }

         return var2;
      }

      public OX dN(short var1) {
         OX var2 = (OX)this.zs.get(Short.valueOf(var1));
         if(var2 == null) {
            var2 = new OX(var1, (TM)null);
            this.zs.put(Short.valueOf(var1), var2);
         }

         return var2;
      }

      public OX dN(int var1) {
         OX var2 = (OX)this.mS.get(Integer.valueOf(var1));
         if(var2 == null) {
            var2 = new OX(var1, (TM)null);
            this.mS.put(Integer.valueOf(var1), var2);
         }

         return var2;
      }

      public OX dN(long var1) {
         OX var3 = (OX)this.OK.get(Long.valueOf(var1));
         if(var3 == null) {
            var3 = new OX(var1, (TM)null);
            this.OK.put(Long.valueOf(var1), var3);
         }

         return var3;
      }

      public OX dN(float var1) {
         OX var2 = (OX)this.LH.get(Float.valueOf(var1));
         if(var2 == null) {
            var2 = new OX(var1, (TM)null);
            this.LH.put(Float.valueOf(var1), var2);
         }

         return var2;
      }

      public OX dN(double var1) {
         OX var3 = (OX)this.KK.get(Double.valueOf(var1));
         if(var3 == null) {
            var3 = new OX(var1, (TM)null);
            this.KK.put(Double.valueOf(var1), var3);
         }

         return var3;
      }

      public OX dN(String var1) {
         OX var2 = (OX)this.EO.get(var1);
         if(var2 == null) {
            var2 = new OX(var1, this.dN, (TM)null);
            this.EO.put(var1, var2);
         }

         return var2;
      }
   }
}
