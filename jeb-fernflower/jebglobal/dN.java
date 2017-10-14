package jebglobal;

import jebglobal.D;
import jebglobal.ED;
import jebglobal.IU;
import jebglobal.MA;
import jebglobal.MS;
import jebglobal.PS;
import jebglobal.UD;
import jebglobal.Vi;
import jebglobal.Vp;
import jebglobal.ZT;
import jebglobal.aj;
import jebglobal.cN;
import jebglobal.eA;
import jebglobal.fa;
import jebglobal.fv;
import jebglobal.kB;
import jebglobal.mS;
import jebglobal.sm;
import jebglobal.zX;

public final class dN {
   private final cN dN;

   public dN(cN var1) {
      this.dN = var1;
   }

   public fv dN(int var1, int var2, String var3) {
      switch(var1) {
      case 1:
         return this.dN(var2, var3);
      case 2:
         return this.dN(var2, var3, true);
      case 3:
         return new kB(var3);
      case 4:
         return new IU(Float.intBitsToFloat(var2), var3);
      case 5:
         return new mS(var2, var3);
      case 6:
         return new ZT(var2, var3);
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      default:
         if(var1 >= 28 && var1 <= 31) {
            return new D(var2, var3);
         } else {
            if(var1 >= 16 && var1 <= 31) {
               return new Vp(var2, var3);
            }

            throw new zX();
         }
      case 18:
         return new MS(var2 != 0, var3);
      }
   }

   public ED dN(String var1) {
      return (ED)(var1.startsWith("res/")?new fa(var1):new kB(var1));
   }

   public Vi dN(int var1, PS[] var2) {
      UD var3 = this.dN(var1, (String)null);
      if(var2.length == 0) {
         return new Vi(var3);
      } else {
         int var4 = ((Integer)var2[0].dN).intValue();
         return (Vi)(var4 == 16777216?sm.dN(var3, var2, this, this.dN):(var4 == 33554432?new eA(var3, var2):(var4 >= 16777220 && var4 <= 16777225?new MA(var3, var2):new aj(var3, var2, this))));
      }
   }

   public UD dN(int var1, String var2) {
      return this.dN(var1, var2, false);
   }

   public UD dN(int var1, String var2, boolean var3) {
      return new UD(this.dN, var1, var2, var3);
   }
}
